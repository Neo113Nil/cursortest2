package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.uyc0;

/* compiled from: SettingsCache.kt */
@b6l(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class z0j0 extends SuspendLambda implements wzs<nh50, spj<? super s3q0>, Object> {
    final /* synthetic */ uyc0.a<Object> $key;
    final /* synthetic */ Object $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ x0j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0j0(Object obj, uyc0.a<Object> aVar, x0j0 x0j0Var, spj<? super z0j0> spjVar) {
        super(2, spjVar);
        this.$value = obj;
        this.$key = aVar;
        this.this$0 = x0j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        z0j0 z0j0Var = new z0j0(this.$value, this.$key, this.this$0, spjVar);
        z0j0Var.L$0 = obj;
        return z0j0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(nh50 nh50Var, spj<? super s3q0> spjVar) {
        return ((z0j0) create(nh50Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        nh50 nh50Var = (nh50) this.L$0;
        Object obj2 = this.$value;
        if (obj2 != null) {
            nh50Var.d(this.$key, obj2);
        } else {
            uyc0.a<Object> aVar = this.$key;
            nh50Var.c();
            nh50Var.a.remove(aVar);
        }
        x0j0.a(this.this$0, nh50Var);
        return s3q0.a;
    }
}
