package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.settings.presentation.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class kfr0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ cms y;

    public /* synthetic */ kfr0(float f, float f2, jvs0 jvs0Var, tls tlsVar, tls tlsVar2) {
        this.b = f;
        this.c = f2;
        this.x = jvs0Var;
        this.w = tlsVar;
        this.y = tlsVar2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cms cmsVar = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c.a((oip0) obj3, this.b, this.c, this.w, (a) cmsVar, (fid) obj, vng.O(24577));
                return zy11Var;
            default:
                jvs0 jvs0Var = (jvs0) obj3;
                tls tlsVar = (tls) cmsVar;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 o = an91.o(c530.a, this.b, 0.0f, this.c, 0.0f, 10);
                    Object Q = btsVar.Q();
                    if (Q == did.a) {
                        Q = new teb(20);
                        btsVar.o0(Q);
                    }
                    f530 b = fnq0.b(o, false, (tls) Q);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d2 = b.d(btsVar, b);
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
                    qje.W(btsVar, d.e, o2);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d2);
                    if (jvs0Var instanceof bvs0) {
                        btsVar.e0(1212862735);
                        ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.h((bvs0) jvs0Var, btsVar, 0);
                        btsVar.t(false);
                    } else if (jvs0Var instanceof yus0) {
                        btsVar.e0(1212864848);
                        ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.e((yus0) jvs0Var, btsVar, 0);
                        btsVar.t(false);
                    } else if (jvs0Var instanceof avs0) {
                        btsVar.e0(1212867124);
                        ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.g((avs0) jvs0Var, btsVar, 0);
                        btsVar.t(false);
                    } else {
                        boolean z = jvs0Var instanceof evs0;
                        tls tlsVar2 = this.w;
                        if (z) {
                            btsVar.e0(1212869760);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.k((evs0) jvs0Var, tlsVar2, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        } else if (jvs0Var instanceof zus0) {
                            btsVar.e0(1212873609);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.f((zus0) jvs0Var, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        } else if (jvs0Var instanceof vus0) {
                            btsVar.e0(1212876613);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.b((vus0) jvs0Var, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        } else if (jvs0Var instanceof hvs0) {
                            btsVar.e0(1212879625);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.n((hvs0) jvs0Var, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        } else if (jvs0Var instanceof xus0) {
                            btsVar.e0(1212882662);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.d((xus0) jvs0Var, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        } else if (jvs0Var instanceof cvs0) {
                            btsVar.e0(1212885559);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.i((cvs0) jvs0Var, tlsVar2, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        } else if (jvs0Var instanceof fvs0) {
                            btsVar.e0(1212889016);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.l((fvs0) jvs0Var, tlsVar2, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        } else if (jvs0Var instanceof dvs0) {
                            btsVar.e0(1212892913);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.j((dvs0) jvs0Var, tlsVar2, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        } else if (jvs0Var instanceof wus0) {
                            btsVar.e0(1212899258);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.c((wus0) jvs0Var, tlsVar2, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        } else {
                            if (!(jvs0Var instanceof ivs0)) {
                                throw unr0.y(1212862310, btsVar, false);
                            }
                            btsVar.e0(1212903185);
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.o((ivs0) jvs0Var, tlsVar, btsVar, 0);
                            btsVar.t(false);
                        }
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ kfr0(oip0 oip0Var, float f, float f2, tls tlsVar, a aVar, int i) {
        this.x = oip0Var;
        this.b = f;
        this.c = f2;
        this.w = tlsVar;
        this.y = aVar;
    }
}
