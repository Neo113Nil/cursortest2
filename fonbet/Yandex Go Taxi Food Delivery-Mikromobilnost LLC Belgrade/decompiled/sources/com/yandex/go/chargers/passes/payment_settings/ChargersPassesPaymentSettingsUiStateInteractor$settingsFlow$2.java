package com.yandex.go.chargers.passes.payment_settings;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.cy9;
import defpackage.g6u;
import defpackage.iha;
import defpackage.ly9;
import defpackage.m950;
import defpackage.mvg;
import defpackage.nha;
import defpackage.nka;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oha;
import defpackage.pka;
import defpackage.qs9;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zha;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpka;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lpka;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.payment_settings.ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2", f = "ChargersPassesPaymentSettingsUiStateInteractor.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ iha $navigator;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zha this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.passes.payment_settings.ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2$1", f = "ChargersPassesPaymentSettingsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.passes.payment_settings.ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ iha $navigator;
        final /* synthetic */ pka $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(iha ihaVar, pka pkaVar, Continuation continuation) {
            super(2, continuation);
            this.$navigator = ihaVar;
            this.$result = pkaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$navigator, this.$result, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            iha ihaVar = this.$navigator;
            cy9 cy9Var = ((nka) this.$result).a;
            oha ohaVar = ((nha) ihaVar).a;
            ohaVar.A((m950) ohaVar.H.get(), new ly9(cy9Var), new qs9(ohaVar, 3));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2(zha zhaVar, iha ihaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zhaVar;
        this.$navigator = ihaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2 chargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2 = new ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2(this.this$0, this.$navigator, continuation);
        chargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2.L$0 = obj;
        return chargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2) create((pka) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pka pkaVar = (pka) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (pkaVar instanceof nka) {
                this.this$0.a.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navigator, pkaVar, null);
                this.L$0 = null;
                this.label = 1;
                if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.e.a(false);
        return zy11.a;
    }
}
