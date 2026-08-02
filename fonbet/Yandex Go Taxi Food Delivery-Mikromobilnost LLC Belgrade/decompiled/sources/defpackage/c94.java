package defpackage;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class c94 implements Comparable {
    public final int a;
    public final int b;
    public final int c;
    public final String w;
    public static final c94 x = new c94(1, 0, 0, "");
    public static final c94 y = new c94(1, 1, 0, "");
    public static final c94 z = new c94(1, 2, 0, "");
    public static final c94 A = new c94(1, 3, 0, "");
    public static final c94 B = new c94(1, 4, 0, "");
    public static final c94 C = new c94(1, 5, 0, "");
    public static final Pattern D = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    public c94(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (str != null) {
            this.w = str;
        } else {
            ny61.t("Null description");
            throw null;
        }
    }

    public static BigInteger b(c94 c94Var) {
        return BigInteger.valueOf(c94Var.a).shiftLeft(32).or(BigInteger.valueOf(c94Var.b)).shiftLeft(32).or(BigInteger.valueOf(c94Var.c));
    }

    public static c94 c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = D.matcher(str);
        if (matcher.matches()) {
            return new c94(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public final int a(int i, int i2) {
        int i3 = this.a;
        return i3 == i ? Integer.compare(this.b, i2) : Integer.compare(i3, i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this).compareTo(b((c94) obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c94)) {
            return false;
        }
        c94 c94Var = (c94) obj;
        return Integer.valueOf(this.a).equals(Integer.valueOf(c94Var.a)) && Integer.valueOf(this.b).equals(Integer.valueOf(c94Var.b)) && Integer.valueOf(this.c).equals(Integer.valueOf(c94Var.c));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a + Extension.DOT_CHAR + this.b + Extension.DOT_CHAR + this.c);
        String str = this.w;
        if (!TextUtils.isEmpty(str)) {
            sb.append("-" + str);
        }
        return sb.toString();
    }
}
