package com.yandex.plus.home.plaque.plugin.internal.di;

import com.yandex.plus.home.c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p4d0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.home.plaque.plugin.internal.di.DataModule$plaqueRepository$2$1$2", f = "DataModule.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DataModule$plaqueRepository$2$1$2 extends SuspendLambda implements tls {
    final /* synthetic */ p4d0 $sdkInternal;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataModule$plaqueRepository$2$1$2(p4d0 p4d0Var, Continuation continuation) {
        super(1, continuation);
        this.$sdkInternal = p4d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataModule$plaqueRepository$2$1$2(this.$sdkInternal, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DataModule$plaqueRepository$2$1$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        p4d0 p4d0Var = this.$sdkInternal;
        this.label = 1;
        Object c = ((c) p4d0Var).c(this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
