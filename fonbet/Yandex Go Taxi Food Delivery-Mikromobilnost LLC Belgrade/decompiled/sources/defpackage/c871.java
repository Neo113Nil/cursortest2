package defpackage;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class c871 implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean w;
    public final File x;
    public final long y;
    public static final Pattern z = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern A = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern B = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public c871(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.w = file != null;
        this.x = file;
        this.y = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        if (r17.renameTo(r3) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c871 a(File file, long j, long j2, vmn0 vmn0Var) {
        File file2;
        long j3;
        String group;
        File file3;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = A.matcher(name2);
            if (matcher.matches()) {
                group = matcher.group(1);
                group.getClass();
                int i = rf71.a;
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
                    Matcher matcher2 = rf71.i.matcher(group);
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
                    if (parentFile == null) {
                        ny61.k();
                        return null;
                    }
                    int i6 = vmn0Var.e(group).a;
                    String group3 = matcher.group(2);
                    group3.getClass();
                    long parseLong = Long.parseLong(group3);
                    String group4 = matcher.group(3);
                    group4.getClass();
                    long parseLong2 = Long.parseLong(group4);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i6);
                    sb2.append(Extension.DOT_CHAR);
                    sb2.append(parseLong);
                    sb2.append(Extension.DOT_CHAR);
                    file3 = new File(parentFile, oyr.n(parseLong2, ".v3.exo", sb2));
                }
                file3 = null;
                if (file3 == null) {
                    return null;
                }
                name = file3.getName();
                file2 = file3;
            } else {
                matcher = z.matcher(name2);
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
        Matcher matcher3 = B.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String group5 = matcher3.group(1);
        group5.getClass();
        String str = (String) ((SparseArray) vmn0Var.b).get(Integer.parseInt(group5));
        if (str == null) {
            return null;
        }
        long length2 = j == -1 ? file2.length() : j;
        if (length2 == 0) {
            return null;
        }
        String group6 = matcher3.group(2);
        group6.getClass();
        long parseLong3 = Long.parseLong(group6);
        if (j2 == -9223372036854775807L) {
            String group7 = matcher3.group(3);
            group7.getClass();
            j3 = Long.parseLong(group7);
        } else {
            j3 = j2;
        }
        return new c871(str, parseLong3, length2, j3, file2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c871 c871Var = (c871) obj;
        String str = c871Var.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(c871Var.a);
        }
        long j = this.b - c871Var.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        return oyr.n(this.c, "]", sb);
    }
}
