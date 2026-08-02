package com.yandex.go.lootbox.impl.presentation.modal;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxAnimationInfo;
import defpackage.eqz;
import defpackage.lqz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalViewPresenter$setAnimationGifts$1", f = "LootBoxModalViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LootBoxModalViewPresenter$setAnimationGifts$1 extends SuspendLambda implements wls {
    final /* synthetic */ LootBoxAnimationInfo $animationInfo;
    final /* synthetic */ InputStream $completionStream;
    final /* synthetic */ List<eqz> $gift;
    final /* synthetic */ InputStream $openingStream;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LootBoxModalViewPresenter$setAnimationGifts$1(c cVar, List list, InputStream inputStream, InputStream inputStream2, LootBoxAnimationInfo lootBoxAnimationInfo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$gift = list;
        this.$openingStream = inputStream;
        this.$completionStream = inputStream2;
        this.$animationInfo = lootBoxAnimationInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LootBoxModalViewPresenter$setAnimationGifts$1(this.this$0, this.$gift, this.$openingStream, this.$completionStream, this.$animationInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LootBoxModalViewPresenter$setAnimationGifts$1 lootBoxModalViewPresenter$setAnimationGifts$1 = (LootBoxModalViewPresenter$setAnimationGifts$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        lootBoxModalViewPresenter$setAnimationGifts$1.invokeSuspend(zy11Var);
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
        ((lqz) this.this$0.Dg()).startAnimateGifts(this.$gift, this.$openingStream, this.$completionStream, this.$animationInfo);
        return zy11.a;
    }
}
