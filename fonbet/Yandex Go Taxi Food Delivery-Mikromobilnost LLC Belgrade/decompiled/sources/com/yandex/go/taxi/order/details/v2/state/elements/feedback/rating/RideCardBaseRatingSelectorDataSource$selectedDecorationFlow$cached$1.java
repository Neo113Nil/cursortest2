package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/utils/UiStateDrawableWrapper;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$cached$1", f = "RideCardBaseRatingSelectorDataSource.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$cached$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$cached$1(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$cached$1(this.this$0, this.$imageUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$cached$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.d;
            String str = this.$imageUrl;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.o(eVar, str, null, this, 14);
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
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable != null) {
            return pkf.g(bitmapDrawable, this.$imageUrl, null);
        }
        return null;
    }
}
