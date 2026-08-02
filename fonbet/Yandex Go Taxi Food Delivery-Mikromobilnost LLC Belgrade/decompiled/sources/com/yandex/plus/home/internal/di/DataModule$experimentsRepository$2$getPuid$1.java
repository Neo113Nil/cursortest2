package com.yandex.plus.home.internal.di;

import defpackage.lj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wog;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.home.internal.di.DataModule$experimentsRepository$2$getPuid$1", f = "DataModule.kt", l = {199}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DataModule$experimentsRepository$2$getPuid$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ wog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataModule$experimentsRepository$2$getPuid$1(wog wogVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = wogVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataModule$experimentsRepository$2$getPuid$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DataModule$experimentsRepository$2$getPuid$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.plus.domain.auth.impl.a aVar = this.this$0.g;
            this.label = 1;
            obj = aVar.e(this);
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
        return ((lj) obj).getId();
    }
}
