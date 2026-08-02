package com.yandex.go.places.address.loader.impl.modal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.address.loader.impl.modal.PlacesAddressLoaderModalView$startCancelButtonAppearanceTimer$1", f = "PlacesAddressLoaderModalView.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PlacesAddressLoaderModalView$startCancelButtonAppearanceTimer$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ PlacesAddressLoaderModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesAddressLoaderModalView$startCancelButtonAppearanceTimer$1(PlacesAddressLoaderModalView placesAddressLoaderModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = placesAddressLoaderModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesAddressLoaderModalView$startCancelButtonAppearanceTimer$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesAddressLoaderModalView$startCancelButtonAppearanceTimer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.label = 1;
            if (a.i(2000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        if (this.this$0.isAttachedToWindow()) {
            z = this.this$0.isCancelled;
            if (!z) {
                this.this$0.animateCancelButtonAppearance();
                this.this$0.hasShownCancelButtonBefore = true;
            }
        }
        this.this$0.cancelButtonAppearanceJob = null;
        return zy11.a;
    }
}
