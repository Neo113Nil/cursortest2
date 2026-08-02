package com.yandex.go.taxi.order.details.v1.elements.driver;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a6j;
import defpackage.b6j;
import defpackage.d6j;
import defpackage.e6j;
import defpackage.f6j;
import defpackage.mb4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u5j;
import defpackage.x5j;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx5j;", "carIconState", "Lmb4;", "avatarState", "Lb6j;", "<anonymous>", "(Lx5j;Lmb4;)Lb6j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.driver.DetailsCardDriverStateMapper$map$1", f = "DetailsCardDriverStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardDriverStateMapper$map$1 extends SuspendLambda implements zls {
    final /* synthetic */ a6j $carPlateState;
    final /* synthetic */ f6j $currentUiState;
    final /* synthetic */ boolean $isSearchAnimationEnabled;
    final /* synthetic */ TaxiOrder $order;
    final /* synthetic */ CharSequence $subtitle;
    final /* synthetic */ CharSequence $title;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardDriverStateMapper$map$1(CharSequence charSequence, CharSequence charSequence2, a6j a6jVar, d dVar, f6j f6jVar, TaxiOrder taxiOrder, boolean z, Continuation continuation) {
        super(3, continuation);
        this.$title = charSequence;
        this.$subtitle = charSequence2;
        this.$carPlateState = a6jVar;
        this.this$0 = dVar;
        this.$currentUiState = f6jVar;
        this.$order = taxiOrder;
        this.$isSearchAnimationEnabled = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DetailsCardDriverStateMapper$map$1 detailsCardDriverStateMapper$map$1 = new DetailsCardDriverStateMapper$map$1(this.$title, this.$subtitle, this.$carPlateState, this.this$0, this.$currentUiState, this.$order, this.$isSearchAnimationEnabled, (Continuation) obj3);
        detailsCardDriverStateMapper$map$1.L$0 = (x5j) obj;
        detailsCardDriverStateMapper$map$1.L$1 = (mb4) obj2;
        return detailsCardDriverStateMapper$map$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x5j x5jVar = (x5j) this.L$0;
        mb4 mb4Var = (mb4) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CharSequence charSequence = this.$title;
        CharSequence charSequence2 = this.$subtitle;
        String str = ((Object) charSequence) + " " + ((Object) charSequence2);
        a6j a6jVar = this.$carPlateState;
        d dVar = this.this$0;
        f6j f6jVar = this.$currentUiState;
        TaxiOrder taxiOrder = this.$order;
        boolean z = this.$isSearchAnimationEnabled;
        dVar.getClass();
        return new b6j(charSequence, charSequence2, str, x5jVar, mb4Var, a6jVar, z && taxiOrder.h.b == DriveState.DRIVING && ((f6jVar instanceof d6j) || (f6jVar instanceof e6j) || (f6jVar instanceof u5j)));
    }
}
