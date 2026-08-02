package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StorageConnection.kt */
@b6l(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class pgl0 extends SuspendLambda implements yzs<l7f0<Object>, Boolean, spj<Object>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    @Override // xsna.yzs
    public final Object invoke(l7f0<Object> l7f0Var, Boolean bool, spj<Object> spjVar) {
        bool.booleanValue();
        pgl0 pgl0Var = new pgl0(3, spjVar);
        pgl0Var.L$0 = l7f0Var;
        return pgl0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        l7f0 l7f0Var = (l7f0) this.L$0;
        this.label = 1;
        Object e = l7f0Var.e(this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
