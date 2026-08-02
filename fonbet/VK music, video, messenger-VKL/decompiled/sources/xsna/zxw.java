package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt$initAdvancedOnboarding$1", f = "InitDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class zxw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $campaignName;
    final /* synthetic */ gce0 $this_initAdvancedOnboarding;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxw(gce0 gce0Var, String str, spj<? super zxw> spjVar) {
        super(2, spjVar);
        this.$this_initAdvancedOnboarding = gce0Var;
        this.$campaignName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zxw(this.$this_initAdvancedOnboarding, this.$campaignName, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zxw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        q7v0 p3 = this.$this_initAdvancedOnboarding.m.p3();
        p3.init();
        p3.c(new defpackage.c0(p3, this.$campaignName, this.$this_initAdvancedOnboarding, 5));
        return s3q0.a;
    }
}
