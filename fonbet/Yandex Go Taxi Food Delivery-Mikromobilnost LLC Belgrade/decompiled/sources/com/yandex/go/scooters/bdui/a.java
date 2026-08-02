package com.yandex.go.scooters.bdui;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import com.yandex.go.scooters.bdui.view.ScootersComposeToDivkitCompatFrameLayout;
import defpackage.bts;
import defpackage.c3z;
import defpackage.did;
import defpackage.fid;
import defpackage.gp5;
import defpackage.id00;
import defpackage.j1;
import defpackage.j6m0;
import defpackage.jeb1;
import defpackage.lg6;
import defpackage.m3u0;
import defpackage.oz40;
import defpackage.pjr;
import defpackage.q0n0;
import defpackage.qor;
import defpackage.qy20;
import defpackage.rfb1;
import defpackage.s0n0;
import defpackage.sc0;
import defpackage.sls;
import defpackage.t0n0;
import defpackage.tls;
import defpackage.unr0;
import defpackage.vz20;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wz20;
import defpackage.xhr;
import defpackage.yx40;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class a implements wls {
    public final /* synthetic */ ScootersBduiScreenType a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xhr c;
    public final /* synthetic */ pjr w;

    public a(ScootersBduiScreenType scootersBduiScreenType, boolean z, xhr xhrVar, pjr pjrVar) {
        this.a = scootersBduiScreenType;
        this.b = z;
        this.c = xhrVar;
        this.w = pjrVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        bts btsVar;
        fid fidVar = (fid) obj;
        int intValue = ((Number) obj2).intValue();
        bts btsVar2 = (bts) fidVar;
        boolean V = btsVar2.V(intValue & 1, (intValue & 3) != 2);
        zy11 zy11Var = zy11.a;
        if (!V) {
            btsVar2.Y();
            return zy11Var;
        }
        btsVar2.e0(391004706);
        Object Q = btsVar2.Q();
        Object obj3 = did.a;
        if (Q == obj3) {
            Q = f.g(0);
            btsVar2.o0(Q);
        }
        yx40 yx40Var = (yx40) Q;
        Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
        Object Q2 = btsVar2.Q();
        if (Q2 == obj3) {
            Q2 = new j1(23, yx40Var);
            btsVar2.o0(Q2);
        }
        tls tlsVar = (tls) Q2;
        Object Q3 = btsVar2.Q();
        Object obj4 = Q3;
        if (Q3 == obj3) {
            ScootersComposeToDivkitCompatFrameLayout scootersComposeToDivkitCompatFrameLayout = new ScootersComposeToDivkitCompatFrameLayout(context);
            scootersComposeToDivkitCompatFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            scootersComposeToDivkitCompatFrameLayout.setOnHierarchyChangeListener(new DivKitHeightMeasureListener(tlsVar));
            btsVar2.o0(scootersComposeToDivkitCompatFrameLayout);
            obj4 = scootersComposeToDivkitCompatFrameLayout;
        }
        ScootersComposeToDivkitCompatFrameLayout scootersComposeToDivkitCompatFrameLayout2 = (ScootersComposeToDivkitCompatFrameLayout) obj4;
        boolean e = btsVar2.e(scootersComposeToDivkitCompatFrameLayout2);
        Object Q4 = btsVar2.Q();
        if (e || Q4 == obj3) {
            Q4 = new q0n0(scootersComposeToDivkitCompatFrameLayout2, 0);
            btsVar2.o0(Q4);
        }
        zpn.a(zy11Var, (tls) Q4, btsVar2);
        int i = t0n0.a[this.a.ordinal()];
        pjr pjrVar = this.w;
        xhr xhrVar = this.c;
        if (i == 1) {
            btsVar2.e0(391266562);
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar2, 0, 0, 8191);
            AppColor$Palette appColor$Palette = AppColor$Palette.Fog;
            sls slsVar = (sls) btsVar2.m(c3z.a);
            boolean k = btsVar2.k(a);
            Object Q5 = btsVar2.Q();
            if (k || Q5 == obj3) {
                Q5 = f.d(new gp5(a, 17));
                btsVar2.o0(Q5);
            }
            m3u0 m3u0Var = (m3u0) Q5;
            Object Q6 = btsVar2.Q();
            if (Q6 == obj3) {
                Q6 = id00.a(1.0f - rfb1.d(a));
                btsVar2.o0(Q6);
            }
            androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q6;
            Object Q7 = btsVar2.Q();
            if (Q7 == obj3) {
                Q7 = f.j(Boolean.FALSE);
                btsVar2.o0(Q7);
            }
            oz40 oz40Var = (oz40) Q7;
            boolean k2 = btsVar2.k(m3u0Var) | btsVar2.e(aVar);
            Object Q8 = btsVar2.Q();
            if (k2 || Q8 == obj3) {
                Q8 = new ScootersBduiScreenKt$rememberDecoupledScrim$1$1(m3u0Var, aVar, oz40Var, null);
                btsVar2.o0(Q8);
            }
            zpn.e(btsVar2, (wls) Q8, a);
            wz20 wz20Var = (wz20) btsVar2.m(vz20.a);
            boolean k3 = btsVar2.k(wz20Var) | btsVar2.e(aVar);
            Object Q9 = btsVar2.Q();
            if (k3 || Q9 == obj3) {
                Q9 = new ScootersBduiScreenKt$rememberDecoupledScrim$2$1(wz20Var, aVar, oz40Var, null);
                btsVar2.o0(Q9);
            }
            zpn.e(btsVar2, (wls) Q9, wz20Var);
            Object Q10 = btsVar2.Q();
            if (Q10 == obj3) {
                Q10 = jeb1.g(f.d(new j6m0(17, aVar)));
                btsVar2.o0(Q10);
            }
            qor qorVar = (qor) Q10;
            boolean k4 = btsVar2.k(appColor$Palette) | btsVar2.k(slsVar);
            Object Q11 = btsVar2.Q();
            if (k4 || Q11 == obj3) {
                Q11 = new lg6(appColor$Palette, qorVar, slsVar);
                btsVar2.o0(Q11);
            }
            com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a, (lg6) Q11, false, false, null, null, null, null, null, null, wwg.S(301561588, true, new sc0(scootersComposeToDivkitCompatFrameLayout2, xhrVar, pjrVar, yx40Var, 3), btsVar2), btsVar2, 0, 48, 2041);
            bts btsVar3 = btsVar2;
            z = false;
            btsVar3.t(false);
            btsVar = btsVar3;
        } else {
            if (i != 2) {
                throw unr0.y(-2065590448, btsVar2, false);
            }
            btsVar2.e0(391972246);
            qy20.a(null, null, null, this.b, wwg.S(-59164833, true, new s0n0(0, scootersComposeToDivkitCompatFrameLayout2, xhrVar, pjrVar), btsVar2), btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
            btsVar2.t(false);
            z = false;
            btsVar = btsVar2;
        }
        btsVar.t(z);
        return zy11Var;
    }
}
