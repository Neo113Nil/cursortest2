package org.chromium.base;

import android.content.Context;
import android.provider.Settings;
import java.io.File;
import org.chromium.base.supplier.Supplier;

/* loaded from: classes8.dex */
public final class CommandLineInitUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String COMMAND_LINE_FILE_PATH = "/data/local";
    private static final String COMMAND_LINE_FILE_PATH_DEBUG_APP = "/data/local/tmp";
    private static String sFilenameOverrideForTesting;

    private CommandLineInitUtil() {
    }

    private static String getDebugApp(Context context) {
        if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
            return Settings.Global.getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }

    public static void initCommandLine(String str, Supplier<Boolean> supplier) {
        String str2 = sFilenameOverrideForTesting;
        if (str2 != null) {
            str = str2;
        }
        File file = new File(COMMAND_LINE_FILE_PATH_DEBUG_APP, str);
        if (!file.exists() || !shouldUseDebugCommandLine(supplier)) {
            file = new File(COMMAND_LINE_FILE_PATH, str);
        }
        CommandLine.initFromFile(file.getPath());
    }

    public static void setFilenameOverrideForTesting(String str) {
        sFilenameOverrideForTesting = str;
    }

    private static boolean shouldUseDebugCommandLine(Supplier<Boolean> supplier) {
        if (supplier != null && supplier.get().booleanValue()) {
            return true;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        return applicationContext.getPackageName().equals(getDebugApp(applicationContext)) || BuildInfo.isDebugAndroid();
    }
}
