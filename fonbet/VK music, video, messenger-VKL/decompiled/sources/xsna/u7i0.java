package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.dto.common.id.UserId;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.c8i0;

/* compiled from: SelectGroupVerificationFeature.kt */
@b6l(c = "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.presentation.SelectGroupVerificationFeature$loadData$1", f = "SelectGroupVerificationFeature.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class u7i0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ v7i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7i0(v7i0 v7i0Var, spj<? super u7i0> spjVar) {
        super(2, spjVar);
        this.this$0 = v7i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new u7i0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((u7i0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            v7i0 v7i0Var = this.this$0;
            g8i0 g8i0Var = v7i0Var.f;
            UserId userId = v7i0Var.g;
            this.label = 1;
            a = g8i0Var.a(userId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        v7i0 v7i0Var2 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            v7i0Var2.T(new c8i0.b((rmu) a));
        }
        v7i0 v7i0Var3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            v7i0Var3.T(new c8i0.a(a2));
        }
        return s3q0.a;
    }
}
