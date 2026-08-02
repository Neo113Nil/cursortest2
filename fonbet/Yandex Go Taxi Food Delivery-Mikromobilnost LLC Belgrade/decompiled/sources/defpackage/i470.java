package defpackage;

/* loaded from: classes6.dex */
public abstract class i470 {
    public static final byte[] a = new byte[0];

    public static final lum a(dmg dmgVar) {
        return new lum(new gse(10), tkg.a, new dye(24, dmgVar), ukg.a);
    }

    public static final lum b(tls tlsVar) {
        return new lum(new jiz0(26), mb21.a, new ec01(13, tlsVar), nb21.a);
    }

    public static final f530 c(f530 f530Var, sls slsVar, String str) {
        f530 b;
        if (slsVar == null) {
            return f530Var;
        }
        f530 a2 = exw0.a(f530Var, slsVar, new kx20(2, slsVar));
        f530 f530Var2 = c530.a;
        if (str != null && (b = fnq0.b(f530Var2, false, new kp1(str, slsVar, 2))) != null) {
            f530Var2 = b;
        }
        return a2.k(f530Var2);
    }
}
