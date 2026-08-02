package com.apollographql.apollo3.internal;

import defpackage.cx40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lqq6;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
@mvg(c = "com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class MultipartKt$multipartBodyFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ Ref$ObjectRef<cx40> $multipartReader;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$multipartBodyFlow$2(Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(3, continuation);
        this.$multipartReader = ref$ObjectRef;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MultipartKt$multipartBodyFlow$2 multipartKt$multipartBodyFlow$2 = new MultipartKt$multipartBodyFlow$2((Continuation) obj3, this.$multipartReader);
        multipartKt$multipartBodyFlow$2.L$0 = (vpr) obj;
        zy11 zy11Var = zy11.a;
        multipartKt$multipartBodyFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            cx40 cx40Var = this.$multipartReader.element;
            if (cx40Var != null) {
                cx40Var.close();
            }
        } catch (Throwable unused) {
        }
        return zy11.a;
    }
}
