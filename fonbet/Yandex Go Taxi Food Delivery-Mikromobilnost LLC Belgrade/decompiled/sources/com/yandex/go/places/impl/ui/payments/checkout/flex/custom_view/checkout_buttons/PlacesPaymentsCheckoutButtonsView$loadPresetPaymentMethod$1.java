package com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons;

import com.yandex.go.places.impl.domain.entities.payments.PlacesPaymentsCheckoutButtonsViewUiState;
import defpackage.lcc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsView$loadPresetPaymentMethod$1", f = "PlacesPaymentsCheckoutButtonsView.kt", l = {HProv.PP_INFO, Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PlacesPaymentsCheckoutButtonsView$loadPresetPaymentMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    Object L$0;
    int label;
    final /* synthetic */ PlacesPaymentsCheckoutButtonsView this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsView$loadPresetPaymentMethod$1$1", f = "PlacesPaymentsCheckoutButtonsView.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsView$loadPresetPaymentMethod$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ oea0 $paymentModels;
        int label;
        final /* synthetic */ PlacesPaymentsCheckoutButtonsView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(oea0 oea0Var, PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView, Continuation continuation) {
            super(2, continuation);
            this.$paymentModels = oea0Var;
            this.this$0 = placesPaymentsCheckoutButtonsView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$paymentModels, this.this$0, continuation);
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
            oea0 oea0Var = this.$paymentModels;
            PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView = this.this$0;
            if (oea0Var == null) {
                placesPaymentsCheckoutButtonsView.updateUiState(PlacesPaymentsCheckoutButtonsViewUiState.ERROR);
            } else {
                placesPaymentsCheckoutButtonsView.setPaymentMethod(oea0Var.c);
                this.this$0.updateUiState(PlacesPaymentsCheckoutButtonsViewUiState.SUCCESS);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesPaymentsCheckoutButtonsView$loadPresetPaymentMethod$1(PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = placesPaymentsCheckoutButtonsView;
        this.$geoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesPaymentsCheckoutButtonsView$loadPresetPaymentMethod$1(this.this$0, this.$geoPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesPaymentsCheckoutButtonsView$loadPresetPaymentMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r5 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oea0 oea0Var;
        Object runOnMainThreadIfActive;
        lcc0 lcc0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            oea0Var = null;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView = this.this$0;
            zzs zzsVar = this.$geoPoint;
            lcc0Var = placesPaymentsCheckoutButtonsView.paymentsCheckoutInteractor;
            this.label = 1;
            obj = lcc0Var.d(zzsVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        oea0Var = (oea0) obj;
        PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView2 = this.this$0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(oea0Var, placesPaymentsCheckoutButtonsView2, null);
        this.L$0 = null;
        this.label = 2;
        runOnMainThreadIfActive = placesPaymentsCheckoutButtonsView2.runOnMainThreadIfActive(anonymousClass1, this);
    }
}
