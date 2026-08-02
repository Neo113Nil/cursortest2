package xsna;

/* compiled from: ImmutableSpanContext.java */
/* loaded from: classes11.dex */
public abstract class kpw implements qhk0 {
    public static final sm5 a = new sm5("00000000000000000000000000000000", "0000000000000000", qpw.d, pk3.a, false);

    public static sm5 a(String str, String str2, qpw qpwVar, ok3 ok3Var, boolean z) {
        if (!z) {
            if (str2.length() == 16 && !"0000000000000000".contentEquals(str2)) {
                char[] cArr = oz80.a;
                int length = str2.length();
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (!oz80.c[str2.charAt(i)]) {
                            break;
                        }
                        i++;
                    } else if (str != null && str.length() == 32 && !"00000000000000000000000000000000".contentEquals(str)) {
                        char[] cArr2 = oz80.a;
                        int length2 = str.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            if (oz80.c[str.charAt(i2)]) {
                            }
                        }
                    }
                }
            }
            return new sm5("00000000000000000000000000000000", "0000000000000000", qpwVar, ok3Var, false);
        }
        return new sm5(str, str2, qpwVar, ok3Var, true);
    }
}
