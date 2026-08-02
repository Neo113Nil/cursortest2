package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.compose.foundation.text.g;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.summary.ui.compose.common.bottomsheet.i;
import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.c;
import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.scrollbutton.a;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final /* synthetic */ class ogo0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ogo0(int i, rbn rbnVar, f530 f530Var, wls wlsVar) {
        this.a = 13;
        this.b = i;
        this.c = rbnVar;
        this.x = f530Var;
        this.w = wlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o3b1.b((Bitmap) obj4, (f530) obj5, (Bitmap) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                k4b1.g((s1p0) obj4, (m1p0) obj3, (tls) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                a.a((hhp0) obj4, (f530) obj5, (tls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 3:
                ((Integer) obj2).intValue();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items.a.f((ckp0) obj4, (tls) obj3, (tls) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items.a.b((f530) obj5, (lvi0) obj4, (yjp0) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                b1q0.a((c1q0) obj4, (androidx.compose.runtime.internal.a) obj3, (f530) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 6:
                ((Integer) obj2).intValue();
                c7b1.a((n8q0) obj4, (tls) obj3, (tls) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.common.selector.a.g((nmq0) obj4, c530.a, (tls) obj3, (tls) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 8:
                ((Integer) obj2).intValue();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.selector.a.c((rlq0) obj4, (tls) obj3, (tls) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                oab1.g((v8r0) obj4, (tls) obj3, (f530) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 10:
                ((Integer) obj2).intValue();
                oab1.b((s8r0) obj4, (f530) obj5, (sls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 11:
                ((Integer) obj2).intValue();
                oab1.e((t8r0) obj4, (f530) obj5, (sls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                ccb1.a((psr0) obj4, (tls) obj3, (f530) obj5, (fid) obj, vng.O(1), this.b);
                return zy11Var;
            case 13:
                rbn rbnVar = (rbn) obj4;
                f530 f530Var = (f530) obj5;
                wls wlsVar = (wls) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    osv d = z5b1.d(z5b1.g(null, btsVar, 1), 0.0f, 1.0f, sb2.w(sb2.K(i2, 0, rbnVar, 2), null, 0L, 6), null, btsVar, 4536, 8);
                    Float valueOf = Float.valueOf(0.0f);
                    long j = ldc.l;
                    qiy E = zoy0.E(new Pair[]{new Pair(valueOf, new ldc(j)), new Pair(Float.valueOf(0.25f), new ldc(j)), new Pair(Float.valueOf(0.5f), new ldc(ldc.b(ldc.b, 0.8f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.75f), new ldc(j)), new Pair(Float.valueOf(1.0f), new ldc(j))}, 0L, 0L, 14);
                    eb2 eb2Var = new eb2();
                    eb2Var.e(8);
                    Matrix matrix = new Matrix();
                    boolean e = btsVar.e(eb2Var) | btsVar.k(E);
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (e || Q == o430Var) {
                        Q = new a5p0(27, eb2Var, E);
                        btsVar.o0(Q);
                    }
                    f530 b = xm91.b(f530Var, (tls) Q);
                    boolean k = btsVar.k(d) | btsVar.e(matrix) | btsVar.e(eb2Var);
                    Object Q2 = btsVar.Q();
                    if (k || Q2 == o430Var) {
                        Q2 = new lxo0(14, matrix, eb2Var, d);
                        btsVar.o0(Q2);
                    }
                    f530 i3 = bb1.i(b, (tls) Q2);
                    z910 d2 = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d3 = b.d(btsVar, i3);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d2);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar2 = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar2);
                    }
                    qje.W(btsVar, d.d, d3);
                    xvz.u(0, wlsVar, btsVar, true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                ey91.c((bj6) obj4, (g0s0) obj3, (androidx.compose.runtime.internal.a) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                wdb1.a((u92) obj4, (f530) obj5, (IconSpotSize) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 16:
                ((Integer) obj2).getClass();
                androidx.compose.material3.a.b((o0t0) obj4, (f530) obj5, (zls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                tfb1.d((r7u0) obj4, (sls) obj3, (f530) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                tfb1.a((p7u0) obj4, (sls) obj3, (f530) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                tfb1.c((q7u0) obj4, (sls) obj3, (f530) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 20:
                ((Integer) obj2).intValue();
                rgb1.b((s611) obj4, (f530) obj5, (sls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                i.d((tpr) obj4, (wg6) obj3, (lx40) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.mapcontent.surge.a.c((nww0) obj4, (f530) obj5, (tls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                c.f((androidx.compose.foundation.lazy.b) obj4, (ob5) obj3, (tls) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                ucx0.b((ebp0) obj4, (wbx0) obj3, (m3u0) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 25:
                ((Integer) obj2).intValue();
                wkb1.g((v611) obj4, (f530) obj5, (tls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                ((g) obj4).b((Object[]) obj3, (tls) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 27:
                ((Integer) obj2).intValue();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.a.a((muy0) obj4, (tls) obj3, (tls) obj5, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            case 28:
                ((Integer) obj2).getClass();
                sob1.b((w611) obj4, (f530) obj5, (tls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                g2z0.a((f530) obj5, (wp2) obj4, (iqx) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
        }
    }

    public /* synthetic */ ogo0(f530 f530Var, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.x = f530Var;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }

    public /* synthetic */ ogo0(nmq0 nmq0Var, tls tlsVar, tls tlsVar2, int i) {
        this.a = 7;
        this.c = nmq0Var;
        this.w = tlsVar;
        this.x = tlsVar2;
        this.b = i;
    }

    public /* synthetic */ ogo0(psr0 psr0Var, tls tlsVar, f530 f530Var, int i, int i2) {
        this.a = 12;
        this.c = psr0Var;
        this.w = tlsVar;
        this.x = f530Var;
        this.b = i2;
    }

    public /* synthetic */ ogo0(Object obj, f530 f530Var, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.x = f530Var;
        this.w = obj2;
        this.b = i;
    }

    public /* synthetic */ ogo0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = i;
    }
}
