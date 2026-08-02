package com.yandex.go.places.impl.ui.bookings.adapter;

import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import defpackage.l5c0;
import defpackage.mvg;
import defpackage.n5c0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tt2;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.bookings.adapter.PlacesBookingViewHolder$bind$1$1", f = "PlacesBookingViewHolder.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesBookingViewHolder$bind$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ l5c0 $data;
    final /* synthetic */ n5c0 $this_with;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesBookingViewHolder$bind$1$1(n5c0 n5c0Var, l5c0 l5c0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$this_with = n5c0Var;
        this.$data = l5c0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesBookingViewHolder$bind$1$1(this.$this_with, this.$data, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesBookingViewHolder$bind$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            CompressionResistantListComponent compressionResistantListComponent = this.$this_with.c;
            ArrayList arrayList = this.$data.c;
            tt2 tt2Var = this.this$0.T;
            this.label = 1;
            if (compressionResistantListComponent.setTexts$impl(arrayList, tt2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
