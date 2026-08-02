package com.yandex.go.payments.paymentlist.di;

import com.yandex.go.payments.yb.domain.YbBrandingPromoAnalytics$OpenReason;
import com.yandex.go.payments.yb.experiments.YbInPaymentsPromotionExperiment;
import defpackage.bgc;
import defpackage.d6z;
import defpackage.jb7;
import defpackage.jt51;
import defpackage.kjz;
import defpackage.kt51;
import defpackage.lba0;
import defpackage.m9a0;
import defpackage.mba0;
import defpackage.n3w;
import defpackage.s9a0;
import defpackage.saa0;
import defpackage.taa0;
import defpackage.tba0;
import defpackage.uaa0;
import defpackage.v7p;
import defpackage.v9a0;
import defpackage.vba0;
import defpackage.w511;
import defpackage.xvf0;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes8.dex */
public final class a implements v7p {
    public final xvf0 a;
    public final xvf0 b;
    public final n3w c;

    public a(m9a0 m9a0Var, n3w n3wVar, n3w n3wVar2) {
        this.a = m9a0Var;
        this.b = n3wVar;
        this.c = n3wVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    @Override // defpackage.yvf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        kjz kjzVar;
        saa0 saa0Var;
        YbInPaymentsPromotionExperiment.GroupItemTrailing groupItemTrailing;
        YbInPaymentsPromotionExperiment.YbHeaderDto ybHeaderDto;
        Runnable runnable;
        Object uaa0Var;
        mba0 mba0Var = (mba0) this.a.get();
        vba0 vba0Var = (vba0) this.b.get();
        PaymentMethodsListUiModule$Companion$providePaymentMethodsListConverterStateController$1 paymentMethodsListUiModule$Companion$providePaymentMethodsListConverterStateController$1 = new PaymentMethodsListUiModule$Companion$providePaymentMethodsListConverterStateController$1(0, (tba0) this.c.a, tba0.class, "onAddCardClicked", "onAddCardClicked()V", 0);
        jb7 jb7Var = mba0Var.a;
        final int i = 1;
        if (vba0Var.b.b) {
            final kt51 kt51Var = mba0Var.b;
            YbInPaymentsPromotionExperiment ybInPaymentsPromotionExperiment = (YbInPaymentsPromotionExperiment) kt51Var.d.c();
            YbInPaymentsPromotionExperiment.YbHeaderDto ybHeaderDto2 = ybInPaymentsPromotionExperiment.e.a;
            if (!ybInPaymentsPromotionExperiment.b || ybHeaderDto2 == null) {
                kjzVar = new kjz(18, (Object) null, (Object) null);
            } else {
                YbInPaymentsPromotionExperiment.GroupItemLeading groupItemLeading = ybHeaderDto2.a;
                if (groupItemLeading != null) {
                    YbInPaymentsPromotionExperiment.ImageDto imageDto = groupItemLeading.a;
                    if (imageDto.a == YbInPaymentsPromotionExperiment.ImageType.YB) {
                        saa0Var = new saa0(d6z.Y(ybInPaymentsPromotionExperiment, imageDto.b));
                        groupItemTrailing = ybHeaderDto2.b;
                        if (groupItemTrailing != null) {
                            String Y = d6z.Y(ybInPaymentsPromotionExperiment, groupItemTrailing.a);
                            if (Y.length() != 0 && (ybHeaderDto = ybInPaymentsPromotionExperiment.e.a) != null) {
                                YbInPaymentsPromotionExperiment.GroupItemTrailing groupItemTrailing2 = ybHeaderDto.b;
                                final String str = groupItemTrailing2.c;
                                String Y2 = d6z.Y(ybInPaymentsPromotionExperiment, groupItemTrailing.d);
                                final String str2 = groupItemTrailing.b;
                                if (str == null || str.length() == 0) {
                                    runnable = new Runnable() { // from class: it51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2 = i;
                                            String str3 = str2;
                                            kt51 kt51Var2 = kt51Var;
                                            switch (i2) {
                                                case 0:
                                                    wrz wrzVar = kt51Var2.c;
                                                    YbBrandingPromoAnalytics$OpenReason ybBrandingPromoAnalytics$OpenReason = YbBrandingPromoAnalytics$OpenReason.PAYMENT_LIST;
                                                    i d = ((j) wrzVar.a).d("YandexPayBrandingExperiment.DidTapOnDeeplink");
                                                    d.d("source", ybBrandingPromoAnalytics$OpenReason.getSource());
                                                    d.m();
                                                    ((a60) kt51Var2.a).c(str3, v770.c);
                                                    break;
                                                default:
                                                    wrz wrzVar2 = kt51Var2.c;
                                                    YbBrandingPromoAnalytics$OpenReason ybBrandingPromoAnalytics$OpenReason2 = YbBrandingPromoAnalytics$OpenReason.PAYMENT_LIST;
                                                    i d2 = ((j) wrzVar2.a).d("YandexPayBrandingExperiment.DidTapOnWhatIsYandexPayLink");
                                                    d2.d("source", ybBrandingPromoAnalytics$OpenReason2.getSource());
                                                    d2.m();
                                                    kt51Var2.b.b(str3);
                                                    break;
                                            }
                                        }
                                    };
                                } else {
                                    final int i2 = 0;
                                    runnable = new Runnable() { // from class: it51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i22 = i2;
                                            String str3 = str;
                                            kt51 kt51Var2 = kt51Var;
                                            switch (i22) {
                                                case 0:
                                                    wrz wrzVar = kt51Var2.c;
                                                    YbBrandingPromoAnalytics$OpenReason ybBrandingPromoAnalytics$OpenReason = YbBrandingPromoAnalytics$OpenReason.PAYMENT_LIST;
                                                    i d = ((j) wrzVar.a).d("YandexPayBrandingExperiment.DidTapOnDeeplink");
                                                    d.d("source", ybBrandingPromoAnalytics$OpenReason.getSource());
                                                    d.m();
                                                    ((a60) kt51Var2.a).c(str3, v770.c);
                                                    break;
                                                default:
                                                    wrz wrzVar2 = kt51Var2.c;
                                                    YbBrandingPromoAnalytics$OpenReason ybBrandingPromoAnalytics$OpenReason2 = YbBrandingPromoAnalytics$OpenReason.PAYMENT_LIST;
                                                    i d2 = ((j) wrzVar2.a).d("YandexPayBrandingExperiment.DidTapOnWhatIsYandexPayLink");
                                                    d2.d("source", ybBrandingPromoAnalytics$OpenReason2.getSource());
                                                    d2.m();
                                                    kt51Var2.b.b(str3);
                                                    break;
                                            }
                                        }
                                    };
                                }
                                int i3 = jt51.a[groupItemTrailing2.e.ordinal()];
                                if (i3 == 1) {
                                    uaa0Var = new uaa0(Y, Y2, runnable);
                                } else {
                                    if (i3 != 2) {
                                        w511.b();
                                        return null;
                                    }
                                    uaa0Var = new taa0(Y, Y2, runnable);
                                }
                                kjzVar = new kjz(18, saa0Var, uaa0Var);
                            }
                        }
                        uaa0Var = null;
                        kjzVar = new kjz(18, saa0Var, uaa0Var);
                    }
                }
                saa0Var = null;
                groupItemTrailing = ybHeaderDto2.b;
                if (groupItemTrailing != null) {
                }
                uaa0Var = null;
                kjzVar = new kjz(18, saa0Var, uaa0Var);
            }
        } else {
            kjzVar = null;
        }
        s9a0 d = jb7Var.d(vba0Var, paymentMethodsListUiModule$Companion$providePaymentMethodsListConverterStateController$1, kjzVar);
        return new lba0(((v9a0) mba0Var.c.b).a(d, true, mba0Var.d, mba0Var.e), d, jb7Var.d(vba0Var, new bgc(12), null));
    }
}
