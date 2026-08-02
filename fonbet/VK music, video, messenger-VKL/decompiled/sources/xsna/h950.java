package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: MusicSubscriptionProviderImpl.kt */
@b6l(c = "com.vk.music.subscription.impl.MusicSubscriptionProviderImpl$1", f = "MusicSubscriptionProviderImpl.kt", l = {172}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h950 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ i950 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h950(i950 i950Var, spj<? super h950> spjVar) {
        super(2, spjVar);
        this.this$0 = i950Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new h950(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h950) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        ui50 ui50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            ref$ObjectRef = new Ref$ObjectRef();
            wi50 wi50Var = this.this$0.d;
            this.L$0 = ref$ObjectRef3;
            this.L$1 = ref$ObjectRef;
            this.L$2 = wi50Var;
            this.I$0 = 0;
            this.label = 1;
            if (wi50Var.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef2 = ref$ObjectRef3;
            ui50Var = wi50Var;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ui50Var = (ui50) this.L$2;
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
            kotlin.a.a(obj);
        }
        try {
            hzg0 hzg0Var = pjp.a;
            ref$ObjectRef2.element = pjp.a(i950.l);
            ref$ObjectRef.element = pjp.a(i950.m);
            s3q0 s3q0Var = s3q0.a;
            ui50Var.c(null);
            T t = ref$ObjectRef2.element;
            if (t == 0 || ref$ObjectRef.element == 0) {
                i950 i950Var = this.this$0;
                ms msVar = (ms) i950Var.b.invoke();
                i950Var.k(msVar.G, msVar.D);
            } else {
                this.this$0.e = Boolean.parseBoolean((String) t);
                i950 i950Var2 = this.this$0;
                Long n = arm0.n((String) ref$ObjectRef.element);
                i950Var2.f = n != null ? n.longValue() : 0L;
            }
            return s3q0.a;
        } catch (Throwable th) {
            ui50Var.c(null);
            throw th;
        }
    }
}
