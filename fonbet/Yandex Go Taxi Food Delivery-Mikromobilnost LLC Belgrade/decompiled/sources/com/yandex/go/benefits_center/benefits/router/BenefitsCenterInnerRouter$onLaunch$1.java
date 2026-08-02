package com.yandex.go.benefits_center.benefits.router;

import com.yandex.go.benefits_center.benefits.sdk.actions.ActivateTaxiPromoCodeAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ClaimBenefitAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.DeactivateTaxiPromoCodeAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.OpenActivatingScreenAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ScootersUseAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ShowNotificationAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ShowTicketBannerAction;
import com.yandex.go.flex.common.api.actions.CloseAction;
import com.yandex.go.superapp.order.multi.old.provider.g;
import defpackage.bb0;
import defpackage.bo5;
import defpackage.gn5;
import defpackage.h0w;
import defpackage.hn5;
import defpackage.in5;
import defpackage.jn5;
import defpackage.kr;
import defpackage.m1j0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.qu;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wl5;
import defpackage.wls;
import defpackage.z131;
import defpackage.zn5;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.benefits_center.benefits.router.BenefitsCenterInnerRouter$onLaunch$1", f = "BenefitsCenterInnerRouter.kt", l = {120}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BenefitsCenterInnerRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ zn5 $payload;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsCenterInnerRouter$onLaunch$1(d dVar, zn5 zn5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = zn5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BenefitsCenterInnerRouter$onLaunch$1 benefitsCenterInnerRouter$onLaunch$1 = new BenefitsCenterInnerRouter$onLaunch$1(this.this$0, this.$payload, continuation);
        benefitsCenterInnerRouter$onLaunch$1.L$0 = obj;
        return benefitsCenterInnerRouter$onLaunch$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BenefitsCenterInnerRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.yandex.go.benefits_center.benefits.router.b] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        BenefitsCenterInnerRouter$onLaunch$1 benefitsCenterInnerRouter$onLaunch$1;
        m950 m950Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dVar = this.this$0;
            m950 m950Var2 = (m950) dVar.E.get();
            d dVar2 = this.this$0;
            a aVar = dVar2.I;
            zn5 zn5Var = this.$payload;
            jn5 jn5Var = new jn5(0, dVar2, zn5Var);
            hn5 hn5Var = new hn5(dVar2, zn5Var);
            List singletonList = Collections.singletonList(dVar2.c0);
            final d dVar3 = this.this$0;
            final zn5 zn5Var2 = this.$payload;
            ?? r6 = new tls() { // from class: com.yandex.go.benefits_center.benefits.router.b
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    kr krVar = (kr) obj2;
                    d dVar4 = d.this;
                    h0w h0wVar = dVar4.U;
                    boolean z = true;
                    if (krVar instanceof CloseAction) {
                        dVar4.r(new qu(9));
                    } else {
                        boolean z2 = krVar instanceof ShowTicketBannerAction;
                        zn5 zn5Var3 = zn5Var2;
                        if (z2) {
                            ShowTicketBannerAction showTicketBannerAction = (ShowTicketBannerAction) krVar;
                            dVar4.T.J(showTicketBannerAction.b, showTicketBannerAction.c, new gn5(dVar4, zn5Var3, 0));
                        } else if (krVar instanceof ScootersUseAction) {
                            tje.N(dVar4.o(), null, null, new BenefitsCenterInnerRouter$handleScootersUseAction$1(dVar4, (ScootersUseAction) krVar, zn5Var3, null), 3);
                        } else if (krVar instanceof ShowNotificationAction) {
                            ShowNotificationAction showNotificationAction = (ShowNotificationAction) krVar;
                            dVar4.L.c(showNotificationAction.c, showNotificationAction.d, showNotificationAction.b);
                        } else if (krVar instanceof OpenActivatingScreenAction) {
                            dVar4.B((m950) dVar4.O.get(), new wl5(((OpenActivatingScreenAction) krVar).b, zn5Var3.a), new in5(dVar4, zn5Var3), m1j0.a);
                        } else if (krVar instanceof ActivateTaxiPromoCodeAction) {
                            ActivateTaxiPromoCodeAction activateTaxiPromoCodeAction = (ActivateTaxiPromoCodeAction) krVar;
                            g gVar = dVar4.F;
                            boolean isEmpty = gVar.a().a.isEmpty();
                            boolean isEmpty2 = gVar.a().e.isEmpty();
                            if (isEmpty && isEmpty2) {
                                String str = activateTaxiPromoCodeAction.b;
                                bo5 bo5Var = (bo5) h0wVar.c;
                                bo5Var.getClass();
                                ((com.yandex.div.core.expression.variables.a) bo5Var.a.get()).i(new z131("benefits_center.active_taxi_promocode", str));
                                ((com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) h0wVar.b).m(str);
                                d.Q(dVar4, zn5Var3, true);
                            } else {
                                oep0.b(dVar4.G, (m950) dVar4.W.get());
                            }
                        } else if (krVar instanceof ClaimBenefitAction) {
                            tje.N(dVar4.o(), null, null, new BenefitsCenterInnerRouter$handleClaimBenefitAction$1(dVar4, (ClaimBenefitAction) krVar, zn5Var3, null), 3);
                        } else if (krVar instanceof DeactivateTaxiPromoCodeAction) {
                            ((com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) h0wVar.b).f();
                            d.Q(dVar4, zn5Var3, true);
                        } else {
                            z = false;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            };
            this.L$0 = tseVar;
            this.L$1 = dVar;
            this.L$2 = m950Var2;
            this.label = 1;
            benefitsCenterInnerRouter$onLaunch$1 = this;
            Object a = aVar.a(r6, zn5Var2, hn5Var, jn5Var, singletonList, benefitsCenterInnerRouter$onLaunch$1);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            m950Var = m950Var2;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m950Var = (m950) this.L$2;
            dVar = (d) this.L$1;
            kotlin.b.b(obj);
            benefitsCenterInnerRouter$onLaunch$1 = this;
        }
        dVar.A(m950Var, obj, new bb0(benefitsCenterInnerRouter$onLaunch$1.this$0, 10));
        d dVar4 = benefitsCenterInnerRouter$onLaunch$1.this$0;
        ru.yandex.taxi.deeplinks.a.c(tseVar, dVar4.S, new c(dVar4, benefitsCenterInnerRouter$onLaunch$1.$payload));
        return zy11.a;
    }
}
