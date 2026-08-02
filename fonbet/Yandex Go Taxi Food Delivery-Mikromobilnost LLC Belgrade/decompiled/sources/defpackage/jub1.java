package defpackage;

import com.yandex.go.design.compose.button.ButtonStyle;

/* loaded from: classes11.dex */
public abstract class jub1 {
    public static final jdf a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new jdf(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-592371307);
        if (btsVar.V(i & 1, i != 0)) {
            f530 m = an91.m(ljs0.c(c530.a, 1.0f), 16.0f, 0.0f, 2);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new zp01(27);
                btsVar.o0(Q);
            }
            adb1.a(m, null, null, null, null, null, false, null, (tls) Q, btsVar, 805306374, 510);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jiz0(i, 19);
        }
    }

    public static final void c(uo9 uo9Var, f530 f530Var, boolean z, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-611967634);
        int i2 = i | (btsVar.e(uo9Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ButtonStyle buttonStyle = ButtonStyle.Main;
            boolean e = btsVar.e(uo9Var) | ((i2 & 7168) == 2048);
            Object Q = btsVar.Q();
            int i3 = 3;
            if (e || Q == did.a) {
                Q = new bm50(i3, tlsVar, uo9Var);
                btsVar.o0(Q);
            }
            int i4 = i2 >> 3;
            d17.c(f530Var, z, null, buttonStyle, null, (sls) Q, wwg.S(-202548142, true, new wg30(22, uo9Var), btsVar), btsVar, (i4 & 14) | 1575936 | (i4 & 112), 20);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(uo9Var, f530Var, z, tlsVar, i, 11);
        }
    }
}
