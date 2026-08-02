package com.yandex.go.chargers.passes.offer_screen;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.aha;
import defpackage.bha;
import defpackage.cha;
import defpackage.dka;
import defpackage.eha;
import defpackage.ems;
import defpackage.fl3;
import defpackage.hfa0;
import defpackage.hl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ola;
import defpackage.tga;
import defpackage.uga;
import defpackage.vga;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lvga;", TarifficatorScenarioActivity.RESULT_KEY, "Lhfa0;", "paymentOptions", "", "selectedPackageOfferId", "Lhl3;", "authStatus", "Ldha;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lvga;Lhfa0;Ljava/lang/String;Lhl3;)Ldha;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.offer_screen.ChargersPassesOfferUiStateInteractor$getUiStateFlow$1", f = "ChargersPassesOfferUiStateInteractor.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesOfferUiStateInteractor$getUiStateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ eha this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesOfferUiStateInteractor$getUiStateFlow$1(eha ehaVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = ehaVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ChargersPassesOfferUiStateInteractor$getUiStateFlow$1 chargersPassesOfferUiStateInteractor$getUiStateFlow$1 = new ChargersPassesOfferUiStateInteractor$getUiStateFlow$1(this.this$0, (Continuation) obj6);
        chargersPassesOfferUiStateInteractor$getUiStateFlow$1.L$0 = (vga) obj2;
        chargersPassesOfferUiStateInteractor$getUiStateFlow$1.L$1 = (hfa0) obj3;
        chargersPassesOfferUiStateInteractor$getUiStateFlow$1.L$2 = (String) obj4;
        chargersPassesOfferUiStateInteractor$getUiStateFlow$1.L$3 = (hl3) obj5;
        return chargersPassesOfferUiStateInteractor$getUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vga vgaVar = (vga) this.L$0;
        hfa0 hfa0Var = (hfa0) this.L$1;
        String str = (String) this.L$2;
        hl3 hl3Var = (hl3) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!(vgaVar instanceof uga)) {
                if (vgaVar == null) {
                    return cha.a;
                }
                if (vgaVar instanceof tga) {
                    return new bha(((tga) vgaVar).a);
                }
                w511.b();
                return null;
            }
            uga ugaVar = (uga) vgaVar;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            obj = this.this$0.d.d(new dka(ugaVar.a, ugaVar.b), hfa0Var, str, hl3Var instanceof fl3, this);
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
        return new aha((ola) obj);
    }
}
