package org.chromium.base;

import android.text.TextUtils;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.base.CommandLine;
import xsna.lhg;

/* loaded from: classes11.dex */
public class CommandLine {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String SWITCH_PREFIX = "--";
    private static final String SWITCH_TERMINATOR = "--";
    private static final String SWITCH_VALUE_SEPARATOR = "=";
    private static final String TAG = "CommandLine";
    private static final CommandLine sInstance = new CommandLine();
    private ArrayList<String> mArgs;
    private volatile int mArgsBegin;
    private Map<String, String> mSwitches;

    public interface Natives {
        void appendSwitchWithValue(String str, String str2);

        void appendSwitchesAndArguments(String[] strArr);

        String getSwitchValue(String str);

        Map<String, String> getSwitches();

        boolean hasSwitch(String str);

        void init(List<String> list);

        void removeSwitch(String str);
    }

    private void appendSwitchesInternalLocked(String[] strArr, int i) {
        boolean z = true;
        for (String str : strArr) {
            if (i > 0) {
                i--;
            } else {
                if (str.equals("--")) {
                    z = false;
                }
                if (z && str.startsWith("--")) {
                    String[] split = str.split("=", 2);
                    appendSwitchWithValue(split[0].substring(2), split.length > 1 ? split[1] : null);
                } else {
                    this.mArgs.add(str);
                }
            }
        }
    }

    public static CommandLine getInstance() {
        return sInstance;
    }

    public static String[] getJavaSwitchesForTesting() {
        CommandLine commandLine = sInstance;
        return commandLine == null ? new String[0] : (String[]) commandLine.mArgs.toArray(new String[0]);
    }

    public static boolean hasSwitchedToNative() {
        return sInstance.mArgs == null;
    }

    public static void init(String[] strArr) {
        sInstance.initInternal(strArr);
    }

    public static void initFromFile(String str) {
        char[] readFileAsUtf8 = readFileAsUtf8(str);
        String[] strArr = readFileAsUtf8 == null ? null : tokenizeQuotedArguments(readFileAsUtf8);
        init(strArr);
        if (strArr != null) {
            Log.i(TAG, "COMMAND-LINE FLAGS: %s (from %s)", Arrays.toString(strArr), str);
        }
    }

    private synchronized void initInternal(String[] strArr) {
        String str;
        try {
            this.mArgs = new ArrayList<>();
            this.mSwitches = new HashMap();
            this.mArgsBegin = 1;
            if (strArr != null && strArr.length != 0 && (str = strArr[0]) != null) {
                this.mArgs.add(str);
                appendSwitchesInternalLocked(strArr, 1);
            }
            this.mArgs.add("");
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean isInitialized() {
        return sInstance.mArgsBegin != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$resetForTesting$0(CommandLine commandLine, Map map, ArrayList arrayList, int i) {
        commandLine.mSwitches = map;
        commandLine.mArgs = arrayList;
        commandLine.mArgsBegin = i;
    }

    private static char[] readFileAsUtf8(String str) {
        File file = new File(str);
        try {
            FileReader fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                char[] copyOfRange = Arrays.copyOfRange(cArr, 0, fileReader.read(cArr));
                fileReader.close();
                return copyOfRange;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void resetForTesting(boolean z) {
        final CommandLine commandLine = sInstance;
        final Map<String, String> map = commandLine.mSwitches;
        final ArrayList<String> arrayList = commandLine.mArgs;
        final int i = commandLine.mArgsBegin;
        commandLine.mSwitches = null;
        commandLine.mArgs = null;
        commandLine.mArgsBegin = 0;
        if (z) {
            commandLine.initInternal(null);
        }
        ResettersForTesting.register(new Runnable() { // from class: xsna.eag
            @Override // java.lang.Runnable
            public final void run() {
                CommandLine.lambda$resetForTesting$0(CommandLine.this, map, arrayList, i);
            }
        });
    }

    public static String[] tokenizeQuotedArguments(char[] cArr) {
        if (cArr.length > 98304) {
            throw new RuntimeException(lhg.a(cArr.length, "Flags file too big: "));
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = null;
        char c = 0;
        for (char c2 : cArr) {
            if ((c == 0 && (c2 == '\'' || c2 == '\"')) || c2 == c) {
                if (sb == null || sb.length() <= 0 || sb.charAt(sb.length() - 1) != '\\') {
                    c = c == 0 ? c2 : (char) 0;
                } else {
                    sb.setCharAt(sb.length() - 1, c2);
                }
            } else if (c != 0 || !Character.isWhitespace(c2)) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(c2);
            } else if (sb != null) {
                arrayList.add(sb.toString());
                sb = null;
            }
        }
        if (sb != null) {
            if (c != 0) {
                Log.w(TAG, "Unterminated quoted string: %s", sb);
            }
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void appendSwitch(String str) {
        appendSwitchWithValue(str, null);
    }

    public synchronized void appendSwitchWithValue(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        try {
            Map<String, String> map = this.mSwitches;
            if (map == null) {
                CommandLineJni.get().appendSwitchWithValue(str, str2);
                return;
            }
            map.put(str, str2);
            String str3 = "--" + str;
            if (!str2.isEmpty()) {
                str3 = str3 + "=" + str2;
            }
            ArrayList<String> arrayList = this.mArgs;
            int i = this.mArgsBegin;
            this.mArgsBegin = i + 1;
            arrayList.add(i, str3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void appendSwitchesAndArguments(String[] strArr) {
        try {
            if (this.mArgs == null) {
                CommandLineJni.get().appendSwitchesAndArguments(strArr);
            } else {
                appendSwitchesInternalLocked(strArr, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String getSwitchValue(String str, String str2) {
        String switchValue = getSwitchValue(str);
        return TextUtils.isEmpty(switchValue) ? str2 : switchValue;
    }

    public Map<String, String> getSwitches() {
        HashMap hashMap;
        Map<String, String> map = this.mSwitches;
        if (map == null) {
            return CommandLineJni.get().getSwitches();
        }
        synchronized (this) {
            hashMap = new HashMap(map);
        }
        return hashMap;
    }

    public boolean hasSwitch(String str) {
        boolean containsKey;
        Map<String, String> map = this.mSwitches;
        if (map == null) {
            return CommandLineJni.get().hasSwitch(str);
        }
        synchronized (this) {
            containsKey = map.containsKey(str);
        }
        return containsKey;
    }

    public synchronized void removeSwitch(String str) {
        ArrayList<String> arrayList = this.mArgs;
        if (arrayList == null) {
            CommandLineJni.get().removeSwitch(str);
            return;
        }
        this.mSwitches.remove(str);
        String str2 = "--" + str;
        for (int i = this.mArgsBegin - 1; i > 0; i--) {
            if (!arrayList.get(i).equals(str2)) {
                if (!arrayList.get(i).startsWith(str2 + "=")) {
                }
            }
            this.mArgsBegin--;
            arrayList.remove(i);
        }
    }

    public synchronized void switchToNativeImpl() {
        if (hasSwitchedToNative()) {
            return;
        }
        CommandLineJni.get().init(this.mArgs);
        this.mArgs = null;
        this.mSwitches = null;
        Log.v(TAG, "Switched to native command-line", new Object[0]);
    }

    public String getSwitchValue(String str) {
        String str2;
        Map<String, String> map = this.mSwitches;
        if (map == null) {
            str2 = CommandLineJni.get().getSwitchValue(str);
        } else {
            synchronized (this) {
                str2 = map.get(str);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }
}
