package defpackage;

/* loaded from: classes11.dex */
public abstract class klb1 {
    public static mgv a;

    public static final Object a(x920 x920Var, String str) {
        if (x920Var.c(str)) {
            return x920Var.a(str);
        }
        return null;
    }

    public static final Boolean b(x920 x920Var, String str) {
        if (x920Var.c(str)) {
            return (Boolean) x920Var.a(str);
        }
        return null;
    }

    public static uly0 c(String str, String str2) {
        if (str.length() > str2.length()) {
            uly0 c = c(str2, str);
            return new uly0(c.a, c.c, c.b);
        }
        int length = str2.length() - 1;
        int length2 = str2.length() - str.length();
        int i = 0;
        while (i < length && i < str.length() && str.charAt(i) == str2.charAt(i)) {
            i++;
        }
        while (true) {
            int i2 = length - length2;
            if (i2 < i || str.charAt(i2) != str2.charAt(length)) {
                break;
            }
            length--;
        }
        int i3 = (length + 1) - i;
        return new uly0(i, i3, i3 - length2);
    }

    public static final Integer d(x920 x920Var, String str) {
        Number number;
        if (x920Var.c(str) && (number = (Number) x920Var.a(str)) != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }
}
