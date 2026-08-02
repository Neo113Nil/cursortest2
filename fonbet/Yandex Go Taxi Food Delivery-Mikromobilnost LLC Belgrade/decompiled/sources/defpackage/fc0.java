package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.compose.material3.internal.h;
import androidx.compose.material3.l;
import androidx.compose.material3.w;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.graphics.d;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.messaging.ui.settings.folder.addChat.g;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;

/* loaded from: classes11.dex */
public final /* synthetic */ class fc0 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int a = 5;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fc0(yb0 yb0Var, tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, tls tlsVar5, boolean z, f530 f530Var, int i) {
        this.w = yb0Var;
        this.x = tlsVar;
        this.y = tlsVar2;
        this.z = tlsVar3;
        this.A = tlsVar4;
        this.B = tlsVar5;
        this.c = z;
        this.b = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        Object obj3 = this.b;
        Object obj4 = this.B;
        Object obj5 = this.A;
        Object obj6 = this.z;
        Object obj7 = this.y;
        Object obj8 = this.x;
        Object obj9 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                g.a((yb0) obj9, (tls) obj8, (tls) obj7, (tls) obj6, (tls) obj5, (tls) obj4, this.c, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                d17.a((f530) obj3, (jj2) obj9, this.c, (ButtonSize) obj8, (gz6) obj7, (ButtonForm) obj6, (sls) obj5, (a) obj4, (fid) obj, vng.O(12782593));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                adb1.c((f530) obj3, (b) obj9, (l690) obj7, (h43) obj6, (to5) obj5, (snr) obj4, this.c, (tls) obj8, (fid) obj, vng.O(196609));
                return zy11Var;
            case 3:
                wls wlsVar = (wls) obj9;
                androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) obj8;
                w wVar = (w) obj7;
                wls wlsVar2 = (wls) obj6;
                sls slsVar = (sls) obj5;
                tse tseVar = (tse) obj4;
                a aVar2 = (a) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    c530 c530Var = c530.a;
                    f530 e = b9a1.e(ljs0.c(c530Var, 1.0f), (p651) wlsVar.invoke(btsVar, 0));
                    boolean e2 = btsVar.e(aVar);
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (e2 || Q == o430Var) {
                        Q = new x1c(aVar, i2);
                        btsVar.o0(Q);
                    }
                    f530 a = d.a(d.a(e, (tls) Q), new kg6(wVar, i2));
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    f530 d = androidx.compose.ui.b.d(btsVar, a);
                    ohd.G1.getClass();
                    sls slsVar2 = androidx.compose.ui.node.d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar2);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
                    qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                    wls wlsVar3 = androidx.compose.ui.node.d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar, S, wlsVar3);
                    }
                    qje.W(btsVar, androidx.compose.ui.node.d.d, d);
                    if (wlsVar2 != null) {
                        btsVar.e0(553338288);
                        String b = vhb1.b(btsVar, wyh0.m3c_bottom_sheet_collapse_description);
                        String b2 = vhb1.b(btsVar, wyh0.m3c_bottom_sheet_dismiss_description);
                        String b3 = vhb1.b(btsVar, wyh0.m3c_bottom_sheet_expand_description);
                        boolean k = btsVar.k(wVar) | btsVar.k(slsVar) | btsVar.e(tseVar);
                        Object Q2 = btsVar.Q();
                        if (k || Q2 == o430Var) {
                            Q2 = new l(wVar, slsVar, tseVar);
                            btsVar.o0(Q2);
                        }
                        f530 c = q791.c(c530Var, (sls) Q2);
                        boolean z2 = this.c;
                        boolean a3 = btsVar.a(z2) | btsVar.k(wVar) | btsVar.k(b2) | btsVar.k(slsVar) | btsVar.k(b3) | btsVar.e(tseVar) | btsVar.k(b);
                        Object Q3 = btsVar.Q();
                        if (a3 || Q3 == o430Var) {
                            ax5 ax5Var = new ax5(z2, wVar, b2, b3, b, slsVar, tseVar);
                            btsVar.o0(ax5Var);
                            Q3 = ax5Var;
                        }
                        z = false;
                        ctr0.a(fnq0.b(c, true, (tls) Q3), wlsVar2, btsVar, 0);
                    } else {
                        z = false;
                        btsVar.e0(535873260);
                    }
                    btsVar.t(z);
                    aVar2.invoke(uic.a, btsVar, 6);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.photocomments.a.j((mkb0) obj9, (String) obj6, this.c, (PhotocommentsMode) obj5, (tkb0) obj4, (tls) obj8, (tls) obj7, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                ety0 ety0Var = (ety0) obj9;
                ety0 ety0Var2 = (ety0) obj8;
                m3u0 m3u0Var = (m3u0) obj7;
                m3u0 m3u0Var2 = (m3u0) obj6;
                m3u0 m3u0Var3 = (m3u0) obj5;
                zls zlsVar = (zls) obj4;
                zmy0 zmy0Var = (zmy0) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ety0 z3 = bb1.z(ety0Var, ety0Var2, ((Number) m3u0Var.getValue()).floatValue());
                    if (this.c) {
                        z3 = ety0.a(z3, ((ldc) m3u0Var3.getValue()).a, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                    }
                    h.b(((ldc) m3u0Var2.getValue()).a, z3, wwg.S(1157484991, true, new hex0(7, zlsVar, zmy0Var), btsVar2), btsVar2, 384);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ fc0(wls wlsVar, androidx.compose.animation.core.a aVar, w wVar, wls wlsVar2, sls slsVar, tse tseVar, boolean z, a aVar2) {
        this.w = wlsVar;
        this.x = aVar;
        this.y = wVar;
        this.z = wlsVar2;
        this.A = slsVar;
        this.B = tseVar;
        this.c = z;
        this.b = aVar2;
    }

    public /* synthetic */ fc0(f530 f530Var, jj2 jj2Var, boolean z, ButtonSize buttonSize, gz6 gz6Var, ButtonForm buttonForm, sls slsVar, a aVar, int i) {
        this.b = f530Var;
        this.w = jj2Var;
        this.c = z;
        this.x = buttonSize;
        this.y = gz6Var;
        this.z = buttonForm;
        this.A = slsVar;
        this.B = aVar;
    }

    public /* synthetic */ fc0(f530 f530Var, b bVar, l690 l690Var, h43 h43Var, to5 to5Var, snr snrVar, boolean z, tls tlsVar, int i) {
        this.b = f530Var;
        this.w = bVar;
        this.y = l690Var;
        this.z = h43Var;
        this.A = to5Var;
        this.B = snrVar;
        this.c = z;
        this.x = tlsVar;
    }

    public /* synthetic */ fc0(mkb0 mkb0Var, String str, boolean z, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, tls tlsVar, tls tlsVar2, sls slsVar, int i) {
        this.w = mkb0Var;
        this.z = str;
        this.c = z;
        this.A = photocommentsMode;
        this.B = tkb0Var;
        this.x = tlsVar;
        this.y = tlsVar2;
        this.b = slsVar;
    }

    public /* synthetic */ fc0(ety0 ety0Var, ety0 ety0Var2, tx01 tx01Var, tx01 tx01Var2, boolean z, tx01 tx01Var3, zls zlsVar, zmy0 zmy0Var) {
        this.w = ety0Var;
        this.x = ety0Var2;
        this.y = tx01Var;
        this.z = tx01Var2;
        this.c = z;
        this.A = tx01Var3;
        this.B = zlsVar;
        this.b = zmy0Var;
    }
}
