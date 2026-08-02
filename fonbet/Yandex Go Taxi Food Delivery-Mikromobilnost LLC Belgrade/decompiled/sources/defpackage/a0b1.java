package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class a0b1 {
    public static au2 a;

    public static final void a(f530 f530Var, wsy0 wsy0Var, wsy0 wsy0Var2, v4v v4vVar, ome omeVar, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        a aVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1578360442);
        int i2 = i | 6 | (btsVar2.k(wsy0Var) ? 32 : 16) | (btsVar2.k(wsy0Var2) ? 256 : 128) | (btsVar2.k(v4vVar) ? 2048 : 1024) | (btsVar2.k(omeVar) ? 16384 : 8192);
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new iws(14);
                btsVar2.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 b = fnq0.b(c530Var, false, (tls) Q);
            a aVar2 = null;
            if (v4vVar == null) {
                btsVar2.e0(366330617);
                btsVar2.t(false);
                aVar = null;
            } else {
                btsVar2.e0(366330618);
                a S = wwg.S(612861455, true, new mb(v4vVar, 13), btsVar2);
                btsVar2.t(false);
                aVar = S;
            }
            a S2 = wwg.S(42620778, true, new a6n(27, wsy0Var, wsy0Var2), btsVar2);
            if (omeVar == null) {
                btsVar2.e0(367046066);
            } else {
                btsVar2.e0(367046067);
                aVar2 = wwg.S(-1517715873, true, new nau(omeVar), btsVar2);
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            web1.c(b, 56.0f, false, 0.0f, null, aVar, S2, null, null, aVar2, null, null, false, btsVar, 1572864, 0, 7580);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) f530Var2, (Object) wsy0Var, (Object) wsy0Var2, (Object) v4vVar, (Object) omeVar, i, 19);
        }
    }

    public static final String b(Context context, String str) {
        List W;
        int i = kyh0.scooters_a11y_scooter_number;
        W = evu0.W(str, new String[]{""}, (r2 & 4) != 0 ? 0 : 2);
        return context.getString(i, Arrays.copyOf(new Object[]{kotlin.collections.a.X(W, " ", null, null, null, 62)}, 1));
    }
}
