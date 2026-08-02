package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetStaticPreviewBitmapUseCase.kt */
@b6l(c = "com.vk.geo.impl.presentation.staticpreview.GetStaticPreviewBitmapUseCase$call$2", f = "GetStaticPreviewBitmapUseCase.kt", l = {Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class eut extends SuspendLambda implements wzs<yvj, spj<? super okhttp3.u>, Object> {
    final /* synthetic */ okhttp3.p $request;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ gut this$0;

    /* compiled from: GetStaticPreviewBitmapUseCase.kt */
    public static final class a implements lb9 {
        public final /* synthetic */ lq9 b;

        public a(lq9 lq9Var) {
            this.b = lq9Var;
        }

        @Override // xsna.lb9
        public final void onFailure(okhttp3.d dVar, IOException iOException) {
            this.b.resumeWith(new Result.Failure(iOException));
        }

        @Override // xsna.lb9
        public final void onResponse(okhttp3.d dVar, okhttp3.u uVar) {
            this.b.resumeWith(uVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eut(gut gutVar, okhttp3.p pVar, spj<? super eut> spjVar) {
        super(2, spjVar);
        this.this$0 = gutVar;
        this.$request = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new eut(this.this$0, this.$request, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super okhttp3.u> spjVar) {
        return ((eut) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        gut gutVar = this.this$0;
        okhttp3.p pVar = this.$request;
        this.L$0 = gutVar;
        this.L$1 = pVar;
        this.I$0 = 0;
        this.label = 1;
        lq9 lq9Var = new lq9(1, s7s0.c(this));
        lq9Var.o();
        ((f8f0) ((okhttp3.o) gutVar.c.getValue()).a(pVar)).f9(new a(lq9Var));
        Object n = lq9Var.n();
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
