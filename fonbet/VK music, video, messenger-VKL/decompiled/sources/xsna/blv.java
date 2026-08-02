package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: HttpUtil.java */
/* loaded from: classes12.dex */
public final class blv {
    public static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @Nullable
    public static String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder b2 = fp.b(j, "bytes=", "-");
        if (j2 != -1) {
            b2.append((j + j2) - 1);
        }
        return b2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(@Nullable String str, @Nullable String str2) {
        long parseLong;
        if (!TextUtils.isEmpty(str)) {
            try {
                parseLong = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                ahn.n("HttpUtil", "Unexpected Content-Length [" + str + X3.j.e);
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
                ahn.F("Inconsistent headers [" + str + "] [" + str2 + X3.j.e);
                return Math.max(parseLong, parseLong3);
            } catch (NumberFormatException unused2) {
                ahn.n("HttpUtil", "Unexpected Content-Range [" + str2 + X3.j.e);
                return parseLong;
            }
        }
        parseLong = -1;
        if (!TextUtils.isEmpty(str2)) {
        }
    }

    public static long c(@Nullable String str) {
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
