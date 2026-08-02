package com.yandex.go.payments.shared.business.onboarding;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.avj0;
import defpackage.cey;
import defpackage.d6z;
import defpackage.ex6;
import defpackage.fw6;
import defpackage.fx6;
import defpackage.hx6;
import defpackage.ix6;
import defpackage.js4;
import defpackage.k20;
import defpackage.mqg0;
import defpackage.mx6;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.rw6;
import defpackage.shs;
import defpackage.tje;
import defpackage.tse;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes13.dex */
public final class b {
    public final Lifecycle a;
    public final ex6 b;
    public final c c;
    public final tse d;
    public final rw6 e;
    public final com.yandex.go.payments.shared.business.c f;
    public final fw6 g;
    public final mx6 h;
    public kotlinx.coroutines.c i = kotlinx.coroutines.a.a();
    public k20 j;

    public b(Lifecycle lifecycle, ex6 ex6Var, c cVar, tse tseVar, rw6 rw6Var, com.yandex.go.payments.shared.business.c cVar2, fw6 fw6Var, mx6 mx6Var) {
        this.a = lifecycle;
        this.b = ex6Var;
        this.c = cVar;
        this.d = tseVar;
        this.e = rw6Var;
        this.f = cVar2;
        this.g = fw6Var;
        this.h = mx6Var;
    }

    public static final void a(b bVar, BusinessAccountFlowExperiment businessAccountFlowExperiment, SharedPaymentsOpenReason sharedPaymentsOpenReason, Runnable runnable) {
        ex6 ex6Var = bVar.b;
        ex6Var.getClass();
        PromotionBackground promotionBackground = new PromotionBackground(PromotionBackground.Type.IMAGE, "", "", false, "");
        String Y = d6z.Y(businessAccountFlowExperiment, businessAccountFlowExperiment.c.c.a);
        avj0 avj0Var = (avj0) ex6Var.a;
        TypedContentWidget typedContentWidget = new TypedContentWidget(Y, q5z.s(avj0Var.a(mqg0.component_gray_600_cold)), 12);
        BusinessAccountFlowExperiment.CreateBusinessAccountFullscreen createBusinessAccountFullscreen = businessAccountFlowExperiment.c;
        TypedContentWidget typedContentWidget2 = new TypedContentWidget(d6z.Y(businessAccountFlowExperiment, createBusinessAccountFullscreen.c.b), q5z.s(avj0Var.a(mqg0.component_gray_600_cold)), 12);
        BannerWidgets.e eVar = new BannerWidgets.e(q5z.s(avj0Var.a(mqg0.component_car_gray)));
        BusinessAccountFlowExperiment.FallbackFullscreen fallbackFullscreen = createBusinessAccountFullscreen.c;
        BannerWidgets.b bVar2 = new BannerWidgets.b(null, d6z.Y(businessAccountFlowExperiment, fallbackFullscreen.c), null, q5z.s(avj0Var.a(mqg0.component_yellow_normal)), null, new BannerWidgets.a(BannerWidgets.ActionType.DEEPLINK, new BannerWidgets.c(fallbackFullscreen.d, false, 1020)), 4011);
        ex6Var.b.getClass();
        shs.a aVar = new shs.a(typedContentWidget, typedContentWidget2, new BannerWidgets(eVar, null, Collections.singletonList(mx6.b(bVar2, sharedPaymentsOpenReason)), 250), Collections.singletonList(promotionBackground), 204);
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, 1);
        c.m(bVar.c, new shs(calendar, calendar2, Collections.singletonList(aVar), 3014), "business_onboarding_fallback", new ix6(0, runnable), null, 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, BusinessAccountFlowExperiment businessAccountFlowExperiment, ContinuationImpl continuationImpl) {
        BusinessOnboardingInteractor$loadBanner$1 businessOnboardingInteractor$loadBanner$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof BusinessOnboardingInteractor$loadBanner$1) {
            businessOnboardingInteractor$loadBanner$1 = (BusinessOnboardingInteractor$loadBanner$1) continuationImpl;
            int i2 = businessOnboardingInteractor$loadBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                businessOnboardingInteractor$loadBanner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = businessOnboardingInteractor$loadBanner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = businessOnboardingInteractor$loadBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long millis = TimeUnit.SECONDS.toMillis(businessAccountFlowExperiment.c.b);
                    BusinessOnboardingInteractor$loadBanner$2 businessOnboardingInteractor$loadBanner$2 = new BusinessOnboardingInteractor$loadBanner$2(bVar, businessAccountFlowExperiment, millis, null);
                    businessOnboardingInteractor$loadBanner$1.L$0 = null;
                    businessOnboardingInteractor$loadBanner$1.J$0 = millis;
                    businessOnboardingInteractor$loadBanner$1.label = 1;
                    obj = kotlinx.coroutines.a.w(millis, businessOnboardingInteractor$loadBanner$2, businessOnboardingInteractor$loadBanner$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                hx6 hx6Var = (hx6) obj;
                return hx6Var != null ? fx6.c : hx6Var;
            }
        }
        businessOnboardingInteractor$loadBanner$1 = new BusinessOnboardingInteractor$loadBanner$1(bVar, continuationImpl);
        Object obj2 = businessOnboardingInteractor$loadBanner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = businessOnboardingInteractor$loadBanner$1.label;
        if (i != 0) {
        }
        hx6 hx6Var2 = (hx6) obj2;
        if (hx6Var2 != null) {
        }
    }

    public final void c(SharedPaymentsOpenReason sharedPaymentsOpenReason, Runnable runnable) {
        this.i.a(null);
        this.i = tje.N(this.d, null, null, new BusinessOnboardingInteractor$showCreateBusinessAccountOnboarding$2(this, sharedPaymentsOpenReason, runnable, null), 3);
        k20 k20Var = this.j;
        if (k20Var != null) {
            k20Var.cancel();
        }
        this.j = cey.b(this.a, Lifecycle.Event.ON_STOP, new js4(22, this));
    }
}
