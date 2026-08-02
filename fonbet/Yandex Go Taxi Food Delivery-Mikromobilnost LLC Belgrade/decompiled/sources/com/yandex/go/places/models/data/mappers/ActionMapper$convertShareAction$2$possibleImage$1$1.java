package com.yandex.go.places.models.data.mappers;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lk7v;", "<anonymous>", "(Ltse;)Lk7v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.models.data.mappers.ActionMapper$convertShareAction$2$possibleImage$1$1", f = "ActionMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ActionMapper$convertShareAction$2$possibleImage$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ImageDto $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMapper$convertShareAction$2$possibleImage$1$1(a aVar, ImageDto imageDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = imageDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActionMapper$convertShareAction$2$possibleImage$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActionMapper$convertShareAction$2$possibleImage$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.a.a(this.$it);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
