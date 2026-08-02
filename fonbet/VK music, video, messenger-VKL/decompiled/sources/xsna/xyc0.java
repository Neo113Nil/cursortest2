package xsna;

import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Preferences.kt */
@b6l(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class xyc0 extends SuspendLambda implements wzs<uyc0, spj<? super uyc0>, Object> {
    final /* synthetic */ wzs<nh50, spj<? super s3q0>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xyc0(wzs<? super nh50, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super xyc0> spjVar) {
        super(2, spjVar);
        this.$transform = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xyc0 xyc0Var = new xyc0(this.$transform, spjVar);
        xyc0Var.L$0 = obj;
        return xyc0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(uyc0 uyc0Var, spj<? super uyc0> spjVar) {
        return ((xyc0) create(uyc0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nh50 nh50Var = (nh50) this.L$0;
            kotlin.a.a(obj);
            return nh50Var;
        }
        kotlin.a.a(obj);
        nh50 nh50Var2 = new nh50(new LinkedHashMap(((uyc0) this.L$0).a()), false);
        wzs<nh50, spj<? super s3q0>, Object> wzsVar = this.$transform;
        this.L$0 = nh50Var2;
        this.label = 1;
        return wzsVar.invoke(nh50Var2, this) == coroutineSingletons ? coroutineSingletons : nh50Var2;
    }
}
