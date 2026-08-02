package defpackage;

import java.security.CryptoPrimitive;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class or61 implements Comparable {
    public static final or61 A;
    public static final or61 B;
    public static final or61 C;
    public static final or61 D;
    public static final or61 E;
    public static final or61 F;
    public static final Set G;
    public static final or61 w = new or61(-1, JCP.RAW_PREFIX);
    public static final or61 x = new or61(2, "SSLv2Hello");
    public static final or61 y = new or61(768, "SSLv3");
    public static final or61 z;
    public final int a;
    public final byte b;
    public final String c;

    static {
        or61 or61Var = new or61(769, "TLSv1");
        z = or61Var;
        or61 or61Var2 = new or61(770, "TLSv1.1");
        A = or61Var2;
        or61 or61Var3 = new or61(771, "TLSv1.2");
        B = or61Var3;
        or61 or61Var4 = new or61(772, "TLSv1.3");
        C = or61Var4;
        D = or61Var3;
        E = or61Var;
        F = or61Var4;
        HashSet hashSet = new HashSet(5);
        or61[] or61VarArr = {or61Var, or61Var2, or61Var3, or61Var4};
        for (int i = 0; i < 4; i++) {
            or61 or61Var5 = or61VarArr[i];
            if (es61.g.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), or61Var5.c, null)) {
                hashSet.add(or61Var5);
            }
        }
        G = Collections.unmodifiableSet(hashSet);
    }

    public or61(int i, String str) {
        this.a = i;
        this.c = str;
        this.b = (byte) (i >>> 8);
    }

    public static or61 a(int i) {
        or61 or61Var = y;
        if (i == or61Var.a) {
            return or61Var;
        }
        or61 or61Var2 = z;
        if (i == or61Var2.a) {
            return or61Var2;
        }
        or61 or61Var3 = A;
        if (i == or61Var3.a) {
            return or61Var3;
        }
        or61 or61Var4 = B;
        if (i == or61Var4.a) {
            return or61Var4;
        }
        or61 or61Var5 = C;
        if (i == or61Var5.a) {
            return or61Var5;
        }
        or61 or61Var6 = x;
        return i == or61Var6.a ? or61Var6 : new or61(i, oyr.h((i >>> 8) & 255, i & 255, "Unknown-", Extension.DOT_CHAR));
    }

    public static or61 b(String str) {
        if (str == null) {
            ny61.g("Protocol cannot be null");
            return null;
        }
        or61 or61Var = y;
        if (str.equals(or61Var.c)) {
            return or61Var;
        }
        or61 or61Var2 = z;
        if (!str.equals(or61Var2.c) && !str.equals("GostTLS")) {
            or61Var2 = A;
            if (!str.equals(or61Var2.c) && !str.equals("GostTLSv1.1")) {
                or61Var2 = B;
                if (!str.equals(or61Var2.c) && !str.equals("GostTLSv1.2")) {
                    or61Var2 = C;
                    if (!str.equals(or61Var2.c) && !str.equals("GostTLSv1.3")) {
                        or61 or61Var3 = x;
                        if (str.equals(or61Var3.c)) {
                            return or61Var3;
                        }
                        ny61.g(str);
                        return null;
                    }
                }
            }
        }
        return or61Var2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((or61) obj).a;
    }

    public final String toString() {
        return this.c;
    }
}
