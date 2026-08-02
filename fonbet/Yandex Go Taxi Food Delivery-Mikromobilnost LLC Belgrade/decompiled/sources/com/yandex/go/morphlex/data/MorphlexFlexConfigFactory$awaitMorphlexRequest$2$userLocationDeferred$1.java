package com.yandex.go.morphlex.data;

import defpackage.h830;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto$Location;", "<anonymous>", "(Ltse;)Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto$Location;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.morphlex.data.MorphlexFlexConfigFactory$awaitMorphlexRequest$2$userLocationDeferred$1", f = "MorphlexFlexConfigFactory.kt", l = {HProv.PP_AUTH_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MorphlexFlexConfigFactory$awaitMorphlexRequest$2$userLocationDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ h830 $screen;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorphlexFlexConfigFactory$awaitMorphlexRequest$2$userLocationDeferred$1(h830 h830Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$screen = h830Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MorphlexFlexConfigFactory$awaitMorphlexRequest$2$userLocationDeferred$1(this.$screen, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MorphlexFlexConfigFactory$awaitMorphlexRequest$2$userLocationDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        h830 h830Var = this.$screen;
        this.label = 1;
        Object b = e.b(eVar, h830Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
