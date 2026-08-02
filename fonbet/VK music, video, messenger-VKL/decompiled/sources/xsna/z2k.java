package xsna;

import android.graphics.Matrix;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.f0k;

/* compiled from: Cover.kt */
@b6l(c = "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.cover.CoverKt$Cover$3$1", f = "Cover.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class z2k extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<en10> $matrix$delegate;
    final /* synthetic */ izs<f0k.b, s3q0> $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z2k(izs<? super f0k.b, s3q0> izsVar, wh50<en10> wh50Var, spj<? super z2k> spjVar) {
        super(2, spjVar);
        this.$onAction = izsVar;
        this.$matrix$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new z2k(this.$onAction, this.$matrix$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((z2k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!fco0.e(d3k.b(this.$matrix$delegate))) {
            izs<f0k.b, s3q0> izsVar = this.$onAction;
            float[] b = d3k.b(this.$matrix$delegate);
            Matrix matrix = new Matrix();
            alk.w(matrix, b);
            izsVar.invoke(new f0k.b.c(matrix));
        }
        return s3q0.a;
    }
}
