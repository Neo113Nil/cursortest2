package ru.rustore.sdk.pushclient.w;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.s9y0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl$savePushToken$2", f = "PushTokenRepositoryImpl.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class d extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, spj<? super d> spjVar) {
        super(2, spjVar);
        this.b = cVar;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new d(this.b, this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return new d(this.b, this.c, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        s9y0 s9y0Var = this.b.b;
        String str = this.c;
        this.a = 1;
        Object b = s9y0Var.b(str, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
