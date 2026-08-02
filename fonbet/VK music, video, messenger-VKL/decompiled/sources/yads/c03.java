package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.efz;

/* loaded from: classes10.dex */
public final class c03 extends zr {
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public c03(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        if (r16.renameTo(r3) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c03 a(File file, long j2, long j3, ls lsVar) {
        File file2;
        long j4;
        String group;
        File file3;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = i.matcher(name2);
            if (matcher.matches()) {
                group = matcher.group(1);
                group.getClass();
                int i2 = mc3.a;
                int length = group.length();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (group.charAt(i5) == '%') {
                        i4++;
                    }
                }
                if (i4 != 0) {
                    int i6 = length - (i4 * 2);
                    StringBuilder sb = new StringBuilder(i6);
                    Matcher matcher2 = mc3.i.matcher(group);
                    while (i4 > 0 && matcher2.find()) {
                        String group2 = matcher2.group(1);
                        group2.getClass();
                        char parseInt = (char) Integer.parseInt(group2, 16);
                        sb.append((CharSequence) group, i3, matcher2.start());
                        sb.append(parseInt);
                        i3 = matcher2.end();
                        i4--;
                    }
                    if (i3 < length) {
                        sb.append((CharSequence) group, i3, length);
                    }
                    if (sb.length() == i6) {
                        group = sb.toString();
                    }
                    group = null;
                }
                if (group != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile == null) {
                        throw new IllegalStateException();
                    }
                    int i7 = lsVar.a(group).a;
                    String group3 = matcher.group(2);
                    group3.getClass();
                    long parseLong = Long.parseLong(group3);
                    String group4 = matcher.group(3);
                    group4.getClass();
                    long parseLong2 = Long.parseLong(group4);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append(".");
                    sb2.append(parseLong);
                    sb2.append(".");
                    file3 = new File(parentFile, efz.b(parseLong2, ".v3.exo", sb2));
                }
                file3 = null;
                if (file3 == null) {
                    return null;
                }
                name = file3.getName();
                file2 = file3;
            } else {
                matcher = h.matcher(name2);
                if (matcher.matches()) {
                    group = matcher.group(1);
                    group.getClass();
                    if (group != null) {
                    }
                    file3 = null;
                    if (file3 == null) {
                    }
                }
                group = null;
                if (group != null) {
                }
                file3 = null;
                if (file3 == null) {
                }
            }
        }
        Matcher matcher3 = j.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String group5 = matcher3.group(1);
        group5.getClass();
        String str = (String) lsVar.b.get(Integer.parseInt(group5));
        if (str == null) {
            return null;
        }
        long length2 = j2 == -1 ? file2.length() : j2;
        if (length2 == 0) {
            return null;
        }
        String group6 = matcher3.group(2);
        group6.getClass();
        long parseLong3 = Long.parseLong(group6);
        if (j3 == C.TIME_UNSET) {
            String group7 = matcher3.group(3);
            group7.getClass();
            j4 = Long.parseLong(group7);
        } else {
            j4 = j3;
        }
        return new c03(str, parseLong3, length2, j4, file2);
    }
}
