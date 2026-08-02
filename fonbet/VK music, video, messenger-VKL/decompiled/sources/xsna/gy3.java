package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@b6l(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class gy3 extends SuspendLambda implements wzs<yvj, spj<? super Object>, Object> {
    final /* synthetic */ n4s $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ hy3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy3(hy3 hy3Var, n4s n4sVar, spj<? super gy3> spjVar) {
        super(2, spjVar);
        this.this$0 = hy3Var;
        this.$this_loadWithTimeoutOrNull = n4sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gy3(this.this$0, this.$this_loadWithTimeoutOrNull, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Object> spjVar) {
        return ((gy3) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        v82 v82Var = this.this$0.f;
        n4s n4sVar = this.$this_loadWithTimeoutOrNull;
        this.label = 1;
        Object a = v82Var.a(n4sVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
