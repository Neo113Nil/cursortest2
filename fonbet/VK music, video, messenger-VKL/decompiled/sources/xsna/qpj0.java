package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SimpleCacheSpan.java */
/* loaded from: classes.dex */
public final class qpj0 extends qx8 {
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
    
        if (r16.renameTo(r1) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qpj0 b(File file, long j2, long j3, gy8 gy8Var) {
        File file2;
        long j4;
        String group;
        File c;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = i.matcher(name2);
            if (matcher.matches()) {
                group = matcher.group(1);
                group.getClass();
                String str = y2r0.a;
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
                    Matcher matcher2 = y2r0.f.matcher(group);
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
                    parentFile.getClass();
                    int i6 = gy8Var.d(group).a;
                    String group3 = matcher.group(2);
                    group3.getClass();
                    long parseLong = Long.parseLong(group3);
                    String group4 = matcher.group(3);
                    group4.getClass();
                    c = c(parentFile, i6, parseLong, Long.parseLong(group4));
                }
                c = null;
                if (c == null) {
                    return null;
                }
                file2 = c;
                name = c.getName();
            } else {
                matcher = h.matcher(name2);
                if (matcher.matches()) {
                    group = matcher.group(1);
                    group.getClass();
                    if (group != null) {
                    }
                    c = null;
                    if (c == null) {
                    }
                }
                group = null;
                if (group != null) {
                }
                c = null;
                if (c == null) {
                }
            }
        }
        Matcher matcher3 = j.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String group5 = matcher3.group(1);
        group5.getClass();
        String str2 = gy8Var.b.get(Integer.parseInt(group5));
        if (str2 == null) {
            return null;
        }
        long length2 = j2 == -1 ? file2.length() : j2;
        if (length2 == 0) {
            return null;
        }
        String group6 = matcher3.group(2);
        group6.getClass();
        long parseLong2 = Long.parseLong(group6);
        if (j3 == C.TIME_UNSET) {
            String group7 = matcher3.group(3);
            group7.getClass();
            j4 = Long.parseLong(group7);
        } else {
            j4 = j3;
        }
        return new qpj0(str2, parseLong2, length2, j4, file2);
    }

    public static File c(File file, int i2, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(".");
        sb.append(j2);
        sb.append(".");
        return new File(file, efz.b(j3, ".v3.exo", sb));
    }
}
