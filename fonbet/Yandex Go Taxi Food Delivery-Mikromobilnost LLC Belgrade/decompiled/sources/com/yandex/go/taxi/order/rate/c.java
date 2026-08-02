package com.yandex.go.taxi.order.rate;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.state.OrderStateView;
import defpackage.a3y0;
import defpackage.ad5;
import defpackage.apf;
import defpackage.avu0;
import defpackage.bu0;
import defpackage.bvf0;
import defpackage.ci70;
import defpackage.d49;
import defpackage.d980;
import defpackage.dm21;
import defpackage.g7i0;
import defpackage.g9k0;
import defpackage.gpf0;
import defpackage.h9k0;
import defpackage.hze0;
import defpackage.ibk0;
import defpackage.iqz;
import defpackage.jl40;
import defpackage.jqz;
import defpackage.k48;
import defpackage.kdd0;
import defpackage.kgx;
import defpackage.ksq;
import defpackage.kyc;
import defpackage.lg21;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p370;
import defpackage.p4j;
import defpackage.pwf0;
import defpackage.qdx;
import defpackage.t48;
import defpackage.tt2;
import defpackage.ufz0;
import defpackage.v7s;
import defpackage.vfz0;
import defpackage.vtq;
import defpackage.wze0;
import defpackage.xhm;
import defpackage.y180;
import defpackage.ysg;
import defpackage.zuj0;
import defpackage.zxf0;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.order.OrderAnalyticsReporter$CompleteButtonActionName;

/* loaded from: classes14.dex */
public final class c extends ad5 {
    public final dm21 A;
    public final vtq B;
    public final y180 C;
    public final tt2 D;
    public final ysg E;
    public final xhm F;
    public final ru.yandex.taxi.apprate.common.domain.a G;
    public final d980 H;
    public final t48 I;
    public final zuj0 J;
    public final ru.yandex.taxi.widget.c K;
    public final d49 L;
    public final lg21 M;
    public final ru.yandex.taxi.costcenters.ride.c N;
    public final kdd0 O;
    public final iqz P;
    public final com.yandex.go.taxi.order.details.v1.domain.a Q;
    public final k48 R;
    public final p370 S;
    public final p4j T;
    public final bu0 U;
    public final gpf0 V;
    public final apf W;
    public final ufz0 Z;
    public final ysg a0;
    public final a3y0 b0;
    public final OrderStateView.Mode c0;
    public g7i0.a d0;
    public final o2y0 x;
    public final wze0 y;
    public final ci70 z;

    public c(o2y0 o2y0Var, wze0 wze0Var, ci70 ci70Var, dm21 dm21Var, vtq vtqVar, y180 y180Var, tt2 tt2Var, ysg ysgVar, xhm xhmVar, ru.yandex.taxi.apprate.common.domain.a aVar, d980 d980Var, t48 t48Var, zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar, d49 d49Var, lg21 lg21Var, ru.yandex.taxi.costcenters.ride.c cVar2, kdd0 kdd0Var, iqz iqzVar, com.yandex.go.taxi.order.details.v1.domain.a aVar2, k48 k48Var, p370 p370Var, p4j p4jVar, bu0 bu0Var, gpf0 gpf0Var, apf apfVar, ufz0 ufz0Var, ysg ysgVar2) {
        super(g7i0.class);
        this.x = o2y0Var;
        this.y = wze0Var;
        this.z = ci70Var;
        this.A = dm21Var;
        this.B = vtqVar;
        this.C = y180Var;
        this.D = tt2Var;
        this.E = ysgVar;
        this.F = xhmVar;
        this.G = aVar;
        this.H = d980Var;
        this.I = t48Var;
        this.J = zuj0Var;
        this.K = cVar;
        this.L = d49Var;
        this.M = lg21Var;
        this.N = cVar2;
        this.O = kdd0Var;
        this.P = iqzVar;
        this.Q = aVar2;
        this.R = k48Var;
        this.S = p370Var;
        this.T = p4jVar;
        this.U = bu0Var;
        this.V = gpf0Var;
        this.W = apfVar;
        this.Z = ufz0Var;
        this.a0 = ysgVar2;
        this.b0 = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "RatePresenter");
        this.c0 = OrderStateView.Mode.SINGLE;
        this.d0 = (g7i0.a) ((zxf0) pwf0.c(g7i0.a.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0068, code lost:
    
        if (r15 == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(c cVar, hze0 hze0Var, ContinuationImpl continuationImpl) {
        RatePresenter$formatPriceDetails$1 ratePresenter$formatPriceDetails$1;
        int i;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        CharSequence charSequence3;
        cVar.getClass();
        if (continuationImpl instanceof RatePresenter$formatPriceDetails$1) {
            ratePresenter$formatPriceDetails$1 = (RatePresenter$formatPriceDetails$1) continuationImpl;
            int i2 = ratePresenter$formatPriceDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ratePresenter$formatPriceDetails$1.label = i2 - Integer.MIN_VALUE;
                RatePresenter$formatPriceDetails$1 ratePresenter$formatPriceDetails$12 = ratePresenter$formatPriceDetails$1;
                Object obj = ratePresenter$formatPriceDetails$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ratePresenter$formatPriceDetails$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = hze0Var.a;
                    if (formattedText2 == null || !formattedText2.d()) {
                        charSequence = "";
                        formattedText = hze0Var.b;
                        if (formattedText != null || !formattedText.d()) {
                            charSequence2 = charSequence;
                            charSequence3 = "";
                            if (charSequence2.length() == 0) {
                            }
                            return new v7s(charSequence2, charSequence3, hze0Var.c);
                        }
                        ru.yandex.taxi.widget.c cVar2 = cVar.K;
                        FormattedText formattedText3 = hze0Var.b;
                        if (formattedText3 == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        ratePresenter$formatPriceDetails$12.L$0 = hze0Var;
                        ratePresenter$formatPriceDetails$12.L$1 = charSequence;
                        ratePresenter$formatPriceDetails$12.label = 2;
                        Object e = ru.yandex.taxi.widget.c.e(cVar2, formattedText3, null, false, ratePresenter$formatPriceDetails$12, 2);
                        if (e != coroutineSingletons) {
                            CharSequence charSequence4 = charSequence;
                            obj = e;
                            charSequence2 = charSequence4;
                            charSequence3 = (CharSequence) obj;
                            if (charSequence2.length() == 0) {
                            }
                            return new v7s(charSequence2, charSequence3, hze0Var.c);
                        }
                        return coroutineSingletons;
                    }
                    ru.yandex.taxi.widget.c cVar3 = cVar.K;
                    FormattedText formattedText4 = hze0Var.a;
                    if (formattedText4 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    ratePresenter$formatPriceDetails$12.L$0 = hze0Var;
                    ratePresenter$formatPriceDetails$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar3, formattedText4, null, false, ratePresenter$formatPriceDetails$12, 2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) ratePresenter$formatPriceDetails$12.L$1;
                        hze0Var = (hze0) ratePresenter$formatPriceDetails$12.L$0;
                        kotlin.b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        if (charSequence2.length() == 0) {
                            String str = hze0Var.d;
                            charSequence2 = str != null ? str : "";
                        }
                        return new v7s(charSequence2, charSequence3, hze0Var.c);
                    }
                    hze0Var = (hze0) ratePresenter$formatPriceDetails$12.L$0;
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                formattedText = hze0Var.b;
                if (formattedText != null) {
                }
                charSequence2 = charSequence;
                charSequence3 = "";
                if (charSequence2.length() == 0) {
                }
                return new v7s(charSequence2, charSequence3, hze0Var.c);
            }
        }
        ratePresenter$formatPriceDetails$1 = new RatePresenter$formatPriceDetails$1(cVar, continuationImpl);
        RatePresenter$formatPriceDetails$1 ratePresenter$formatPriceDetails$122 = ratePresenter$formatPriceDetails$1;
        Object obj2 = ratePresenter$formatPriceDetails$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ratePresenter$formatPriceDetails$122.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = hze0Var.b;
        if (formattedText != null) {
        }
        charSequence2 = charSequence;
        charSequence3 = "";
        if (charSequence2.length() == 0) {
        }
        return new v7s(charSequence2, charSequence3, hze0Var.c);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((jqz) this.P).a();
        this.H.e();
        bvf0.j(this.Q.j, null);
    }

    @Override // defpackage.zc5
    public final void Gg() {
        this.C.b(this.x.b().a);
    }

    public final void Lg() {
        o2y0 o2y0Var = this.x;
        String str = o2y0Var.b().a;
        ksq b = ((com.yandex.go.taxi.order.feedback.domain.b) this.A).b(str);
        this.E.h(o2y0Var.b());
        this.C.b(str);
        int i = b.i;
        if (i > 3 || i <= 0) {
            this.d0.Ic();
            return;
        }
        g7i0.a aVar = this.d0;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        aVar.openAfterFeedbackInfo(z);
    }

    public final void Mg(ibk0 ibk0Var) {
        this.U.f(ibk0Var);
        if (ibk0Var instanceof h9k0) {
            Ng(OrderAnalyticsReporter$CompleteButtonActionName.CLOSE_AND_DEEPLINK);
        } else if (ibk0Var instanceof g9k0) {
            Ng(OrderAnalyticsReporter$CompleteButtonActionName.CLOSE);
        }
    }

    public final void Ng(OrderAnalyticsReporter$CompleteButtonActionName orderAnalyticsReporter$CompleteButtonActionName) {
        dm21 dm21Var = this.A;
        o2y0 o2y0Var = this.x;
        ksq b = ((com.yandex.go.taxi.order.feedback.domain.b) dm21Var).b(o2y0Var.b().a);
        String str = b.f;
        if (str == null) {
            str = "";
        }
        Float j = avu0.j(str);
        if (j != null && !jl40.j(j, 0.0f)) {
            vfz0 vfz0Var = this.Z.a;
            qdx qdxVar = vfz0Var.a;
            kgx[] kgxVarArr = vfz0.b;
            int intValue = ((Number) qdxVar.getValue(vfz0Var, kgxVarArr[0])).intValue();
            qdx qdxVar2 = vfz0Var.a;
            if (intValue == -1) {
                qdxVar2.setValue(vfz0Var, kgxVarArr[0], 1);
            } else {
                qdxVar2.setValue(vfz0Var, kgxVarArr[0], Integer.valueOf(intValue + 1));
            }
        }
        ci70 ci70Var = this.z;
        String str2 = o2y0Var.b().a;
        int i = b.i;
        String str3 = b.f;
        String str4 = str3 == null ? "" : str3;
        TipsType tipsType = b.g;
        List b2 = o2y0Var.b().l.getW().getG().getB();
        kyc kycVar = ci70Var.n;
        String name = orderAnalyticsReporter$CompleteButtonActionName.name();
        Locale locale = Locale.US;
        kycVar.a(name.toLowerCase(locale), Integer.valueOf(i), b2.toString(), tipsType.name().toLowerCase(locale), str4);
        vtq vtqVar = this.B;
        String str5 = o2y0Var.b().a;
        com.yandex.go.taxi.order.feedback.domain.b bVar = (com.yandex.go.taxi.order.feedback.domain.b) vtqVar.a;
        bVar.c(bVar.b(str5), false);
        Lg();
    }
}
