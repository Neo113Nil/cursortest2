package defpackage;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class pwu {
    public static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder w = unr0.w(j, "bytes=", "-");
        if (j2 != -1) {
            w.append((j + j2) - 1);
        }
        return w.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(String str, String str2) {
        long parseLong;
        if (!TextUtils.isEmpty(str)) {
            try {
                parseLong = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                lk91.e("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
            if (!TextUtils.isEmpty(str2)) {
                return parseLong;
            }
            Matcher matcher = a.matcher(str2);
            if (!matcher.matches()) {
                return parseLong;
            }
            try {
                String group = matcher.group(2);
                group.getClass();
                long parseLong2 = Long.parseLong(group);
                String group2 = matcher.group(1);
                group2.getClass();
                long parseLong3 = (parseLong2 - Long.parseLong(group2)) + 1;
                if (parseLong < 0) {
                    return parseLong3;
                }
                if (parseLong == parseLong3) {
                    return parseLong;
                }
                lk91.j("Inconsistent headers [" + str + "] [" + str2 + "]");
                return Math.max(parseLong, parseLong3);
            } catch (NumberFormatException unused2) {
                lk91.e("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
                return parseLong;
            }
        }
        parseLong = -1;
        if (!TextUtils.isEmpty(str2)) {
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }
}
