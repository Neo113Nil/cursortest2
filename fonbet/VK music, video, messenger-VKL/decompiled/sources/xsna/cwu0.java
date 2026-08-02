package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o360;

/* compiled from: VkFrescoImage.kt */
@b6l(c = "com.vk.core.compose.image.fresco.VkFrescoImageKt$rememberBestPainterInternal$4$1", f = "VkFrescoImage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class cwu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ fxj0 $localImage;
    final /* synthetic */ fxj0 $lowQualityImage;
    final /* synthetic */ fxj0 $remoteImage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwu0(fxj0 fxj0Var, fxj0 fxj0Var2, fxj0 fxj0Var3, spj<? super cwu0> spjVar) {
        super(2, spjVar);
        this.$localImage = fxj0Var;
        this.$remoteImage = fxj0Var2;
        this.$lowQualityImage = fxj0Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cwu0(this.$localImage, this.$remoteImage, this.$lowQualityImage, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cwu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        bpn0 bpn0Var = o360.e;
        o360 a = o360.a.a();
        fxj0 fxj0Var = this.$localImage;
        a.h(fxj0Var != null ? fxj0Var.getUrl() : null);
        fxj0 fxj0Var2 = this.$remoteImage;
        a.h(fxj0Var2 != null ? fxj0Var2.getUrl() : null);
        fxj0 fxj0Var3 = this.$lowQualityImage;
        if (fxj0Var3 != null) {
            fxj0 fxj0Var4 = brm0.B(fxj0Var3.getUrl(), "http", false) ? fxj0Var3 : null;
            if (fxj0Var4 != null) {
                a.h(fxj0Var4.getUrl());
            }
        }
        return s3q0.a;
    }
}
