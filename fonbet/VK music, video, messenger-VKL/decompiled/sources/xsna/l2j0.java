package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SettingsInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.settings.presentation.feature.store.SettingsInlineActor$initAttachedClipsOnboarding$1", f = "SettingsInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class l2j0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ m2j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2j0(m2j0 m2j0Var, spj<? super l2j0> spjVar) {
        super(2, spjVar);
        this.this$0 = m2j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new l2j0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((l2j0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        q7v0 p3 = this.this$0.f.p3();
        p3.init();
        p3.c(new com.vk.movika.tools.controls.seekbar.f(21, p3, this.this$0));
        return s3q0.a;
    }
}
