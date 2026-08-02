package defpackage;

import androidx.compose.material3.t;
import androidx.compose.runtime.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.masstransit.sdk.camera.ml.b;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import com.yandex.go.masstransit.sdk.order.impl.activation.c;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes12.dex */
public final /* synthetic */ class e1z0 implements zls {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e1z0(v1z0 v1z0Var, MtQRCameraPreview mtQRCameraPreview, tls tlsVar, boolean z, b bVar, oz40 oz40Var) {
        this.c = v1z0Var;
        this.w = mtQRCameraPreview;
        this.x = tlsVar;
        this.b = z;
        this.y = bVar;
        this.z = oz40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = did.a;
        Object obj5 = this.z;
        Object obj6 = this.x;
        Object obj7 = this.y;
        Object obj8 = this.w;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                v1z0 v1z0Var = (v1z0) obj9;
                MtQRCameraPreview mtQRCameraPreview = (MtQRCameraPreview) obj8;
                tls tlsVar = (tls) obj6;
                b bVar = (b) obj7;
                oz40 oz40Var = (oz40) obj5;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    k3r k3rVar = ljs0.c;
                    f530 b = m4m0.b(k3rVar, ldc.b, qke.q);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar, b);
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
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    boolean z = v1z0Var instanceof t1z0;
                    if (z) {
                        btsVar.e0(-1278327986);
                        boolean e = btsVar.e(mtQRCameraPreview);
                        Object Q = btsVar.Q();
                        if (e || Q == obj4) {
                            Q = new pxy0(2, mtQRCameraPreview);
                            btsVar.o0(Q);
                        }
                        androidx.compose.ui.viewinterop.b.a((tls) Q, k3rVar, null, btsVar, 48, 4);
                        r3 = 0;
                        btsVar.t(false);
                    } else {
                        r3 = 0;
                        btsVar.e0(-1278204978);
                        btsVar.t(false);
                    }
                    if (jl40.l(v1z0Var, s1z0.a)) {
                        btsVar.e0(-1426703155);
                        c.h(tlsVar, btsVar, r3);
                        btsVar.t(r3);
                    } else if (z) {
                        btsVar.e0(-1426700705);
                        c.j(btsVar, r3);
                        btsVar.t(r3);
                    } else if (jl40.l(v1z0Var, u1z0.a)) {
                        btsVar.e0(-1426698617);
                        c.g(btsVar, r3);
                        btsVar.t(r3);
                    } else if (jl40.l(v1z0Var, q1z0.a)) {
                        btsVar.e0(-1426696278);
                        c.e(btsVar, r3);
                        btsVar.t(r3);
                    } else if (jl40.l(v1z0Var, r1z0.a)) {
                        btsVar.e0(-1426693945);
                        c.f(btsVar, r3);
                        btsVar.t(r3);
                    } else {
                        if (!jl40.l(v1z0Var, p1z0.a)) {
                            throw unr0.y(-1426705031, btsVar, false);
                        }
                        btsVar.e0(-1426691771);
                        c.d(btsVar, r3);
                        btsVar.t(r3);
                    }
                    boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                    boolean e2 = btsVar.e(bVar);
                    Object Q2 = btsVar.Q();
                    if (e2 || Q2 == obj4) {
                        Q2 = new i5y0(14, bVar, oz40Var);
                        btsVar.o0(Q2);
                    }
                    c.b(v1z0Var, this.b, booleanValue, (sls) Q2, tlsVar, i9a1.d(cj6.a.a(c530.a, x4c.B)), btsVar, 0);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                String str = (String) obj9;
                gy31 gy31Var = (gy31) obj8;
                zx40 zx40Var = (zx40) obj6;
                ehr0 ehr0Var = (ehr0) obj7;
                imy0 imy0Var = (imy0) obj5;
                wls wlsVar = (wls) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= fidVar2.e(wlsVar) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    t.b.d(str, wlsVar, this.b, false, gy31Var, zx40Var, false, null, null, null, null, null, ehr0Var, imy0Var, null, null, btsVar2, (intValue2 << 3) & 112, ImageMetadata.EDGE_MODE);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                zx40 zx40Var2 = (zx40) obj8;
                sls slsVar2 = (sls) obj7;
                tls tlsVar2 = (tls) obj6;
                wls wlsVar2 = (wls) obj5;
                f530 f530Var = (f530) obj;
                ((Integer) obj3).getClass();
                bts btsVar3 = (bts) ((fid) obj2);
                btsVar3.e0(678681465);
                Object Q3 = btsVar3.Q();
                if (Q3 == obj4) {
                    Q3 = zpn.j(EmptyCoroutineContext.a, btsVar3);
                    btsVar3.o0(Q3);
                }
                tse tseVar = (tse) Q3;
                Object Q4 = btsVar3.Q();
                if (Q4 == obj4) {
                    Q4 = f.j(null);
                    btsVar3.o0(Q4);
                }
                oz40 oz40Var2 = (oz40) Q4;
                Object Q5 = btsVar3.Q();
                if (Q5 == obj4) {
                    Q5 = f.j(Boolean.FALSE);
                    btsVar3.o0(Q5);
                }
                oz40 oz40Var3 = (oz40) Q5;
                boolean e3 = btsVar3.e(tseVar) | btsVar3.k(zx40Var2) | btsVar3.k(slsVar2);
                Object Q6 = btsVar3.Q();
                if (e3 || Q6 == obj4) {
                    u50 u50Var = new u50(slsVar2, oz40Var3, oz40Var2, tseVar, zx40Var2);
                    btsVar3.o0(u50Var);
                    Q6 = u50Var;
                }
                zpn.a(obj9, (tls) Q6, btsVar3);
                boolean z2 = this.b;
                Boolean valueOf = Boolean.valueOf(z2);
                boolean a = btsVar3.a(z2) | btsVar3.e(tseVar) | btsVar3.k(zx40Var2) | btsVar3.k(tlsVar2) | btsVar3.k(slsVar2) | btsVar3.k(wlsVar2);
                Object Q7 = btsVar3.Q();
                if (a || Q7 == obj4) {
                    ww21 ww21Var = new ww21(z2, wlsVar2, tlsVar2, oz40Var3, tseVar, zx40Var2, oz40Var2, slsVar2);
                    btsVar3.o0(ww21Var);
                    Q7 = ww21Var;
                }
                tvd0 tvd0Var = exw0.a;
                f530 k = f530Var.k(new www0(obj9, valueOf, (PointerInputEventHandler) Q7, 4));
                btsVar3.t(false);
                return k;
        }
    }

    public /* synthetic */ e1z0(Object obj, zx40 zx40Var, sls slsVar, boolean z, tls tlsVar, wls wlsVar) {
        this.c = obj;
        this.w = zx40Var;
        this.y = slsVar;
        this.b = z;
        this.x = tlsVar;
        this.z = wlsVar;
    }

    public /* synthetic */ e1z0(String str, boolean z, gy31 gy31Var, zx40 zx40Var, ehr0 ehr0Var, imy0 imy0Var) {
        this.c = str;
        this.b = z;
        this.w = gy31Var;
        this.x = zx40Var;
        this.y = ehr0Var;
        this.z = imy0Var;
    }
}
