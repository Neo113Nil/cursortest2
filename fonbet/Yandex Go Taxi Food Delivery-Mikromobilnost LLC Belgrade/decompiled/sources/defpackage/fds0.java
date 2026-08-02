package defpackage;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class fds0 extends lc7 {
    public static final Pattern z = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern A = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern B = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        if (r16.renameTo(r1) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fds0 b(File file, long j, long j2, yuf0 yuf0Var) {
        File file2;
        long j3;
        String group;
        File e;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = A.matcher(name2);
            if (!matcher.matches()) {
                matcher = z.matcher(name2);
                if (matcher.matches()) {
                    group = matcher.group(1);
                    group.getClass();
                    if (group != null) {
                    }
                    e = null;
                    if (e != null) {
                    }
                    return null;
                }
                group = null;
                if (group != null) {
                }
                e = null;
                if (e != null) {
                }
                return null;
            }
            group = matcher.group(1);
            group.getClass();
            int i = tw21.a;
            int length = group.length();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (group.charAt(i4) == '%') {
                    i3++;
                }
            }
            if (i3 != 0) {
                int i5 = length - (i3 * 2);
                StringBuilder sb = new StringBuilder(i5);
                Matcher matcher2 = tw21.g.matcher(group);
                while (i3 > 0 && matcher2.find()) {
                    String group2 = matcher2.group(1);
                    group2.getClass();
                    char parseInt = (char) Integer.parseInt(group2, 16);
                    sb.append((CharSequence) group, i2, matcher2.start());
                    sb.append(parseInt);
                    i2 = matcher2.end();
                    i3--;
                }
                if (i2 < length) {
                    sb.append((CharSequence) group, i2, length);
                }
                if (sb.length() == i5) {
                    group = sb.toString();
                }
                group = null;
            }
            if (group != null) {
                File parentFile = file.getParentFile();
                d6z.z(parentFile);
                int i6 = yuf0Var.y(group).a;
                String group3 = matcher.group(2);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String group4 = matcher.group(3);
                group4.getClass();
                e = e(parentFile, i6, parseLong, Long.parseLong(group4));
            }
            e = null;
            if (e != null) {
                file2 = e;
                name = e.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher3 = B.matcher(name);
        if (matcher3.matches()) {
            String group5 = matcher3.group(1);
            group5.getClass();
            String str = (String) ((SparseArray) yuf0Var.b).get(Integer.parseInt(group5));
            if (str != null) {
                long length2 = j == -1 ? file2.length() : j;
                if (length2 != 0) {
                    String group6 = matcher3.group(2);
                    group6.getClass();
                    long parseLong2 = Long.parseLong(group6);
                    if (j2 == -9223372036854775807L) {
                        String group7 = matcher3.group(3);
                        group7.getClass();
                        j3 = Long.parseLong(group7);
                    } else {
                        j3 = j2;
                    }
                    return new fds0(str, parseLong2, length2, j3, file2);
                }
            }
        }
        return null;
    }

    public static fds0 c(File file, long j, yuf0 yuf0Var) {
        return b(file, j, -9223372036854775807L, yuf0Var);
    }

    public static fds0 d(long j, long j2, String str) {
        return new fds0(str, j, j2, -9223372036854775807L, null);
    }

    public static File e(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(Extension.DOT_CHAR);
        sb.append(j);
        sb.append(Extension.DOT_CHAR);
        return new File(file, oyr.n(j2, ".v3.exo", sb));
    }
}
