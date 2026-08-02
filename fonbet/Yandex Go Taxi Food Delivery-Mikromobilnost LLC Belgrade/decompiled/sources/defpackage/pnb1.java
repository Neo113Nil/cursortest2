package defpackage;

import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PaymentProviderDto;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class pnb1 {
    public static mgv a;

    public static final mgv a() {
        mgv mgvVar = a;
        if (mgvVar != null) {
            return mgvVar;
        }
        lgv lgvVar = new lgv("CloseCircleSolidSm", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
        uq90 e = nnm.e(8.0f, 0.5f);
        e.d(12.142f, 0.5f, 15.5f, 3.858f, 15.5f, 8.0f);
        e.d(15.5f, 12.142f, 12.142f, 15.5f, 8.0f, 15.5f);
        e.d(3.858f, 15.5f, 0.5f, 12.142f, 0.5f, 8.0f);
        e.d(0.5f, 3.858f, 3.858f, 0.5f, 8.0f, 0.5f);
        e.c();
        e.j(8.0f, 6.939f);
        e.h(5.249f, 4.188f);
        e.h(4.188f, 5.249f);
        e.h(6.939f, 8.0f);
        e.h(4.188f, 10.751f);
        e.h(5.249f, 11.811f);
        e.h(8.0f, 9.061f);
        e.h(10.751f, 11.811f);
        e.h(11.811f, 10.751f);
        e.h(9.061f, 8.0f);
        e.h(11.811f, 5.249f);
        tse0.u(e, 10.751f, 4.188f, 8.0f, 6.939f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
        mgv d = lgvVar.d();
        a = d;
        return d;
    }

    public static final lry0 b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        dyr dyrVar = (dyr) btsVar.m(j.k);
        fwi fwiVar = (fwi) btsVar.m(j.h);
        LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(j.n);
        boolean k = btsVar.k(dyrVar) | btsVar.k(fwiVar) | btsVar.c(layoutDirection.ordinal()) | btsVar.c(8);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new lry0(dyrVar, fwiVar, layoutDirection);
            btsVar.o0(Q);
        }
        return (lry0) Q;
    }

    public static final PaymentProviderEntity c(PaymentProviderDto paymentProviderDto) {
        return new PaymentProviderEntity(qxy0.c(paymentProviderDto.getLogo(), null), paymentProviderDto.getId(), paymentProviderDto.getName(), paymentProviderDto.getSubtitle(), paymentProviderDto.getAction());
    }
}
