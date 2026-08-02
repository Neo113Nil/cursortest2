package defpackage;

import android.view.InputDevice;

/* loaded from: classes14.dex */
public abstract class okb1 {
    public static final void a(mdx0 mdx0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1590752239);
        int i2 = 2;
        int i3 = (btsVar.k(mdx0Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new oxv0(27);
                btsVar.o0(Q);
            }
            jrb1.d(f530Var, wwg.S(90247307, true, new asr0(i2, yn91.g(tlsVar, (tls) Q, btsVar, ((i3 >> 6) & 14) | 48)), btsVar), wwg.S(-1439928252, true, new ays0(8, mdx0Var, tlsVar), btsVar), btsVar, ((i3 >> 3) & 14) | 432);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0((Object) mdx0Var, (Object) f530Var, tlsVar, i, 7);
        }
    }

    public static final s8b b(j3b j3bVar) {
        wbz0 wbz0Var = s8b.c;
        int i = j3bVar.i;
        wbz0Var.getClass();
        return new s8b(i);
    }

    public static boolean c(InputDevice inputDevice, int i) {
        return (inputDevice.getSources() & i) == i && inputDevice.getMotionRange(0, i) != null;
    }
}
