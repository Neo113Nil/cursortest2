package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q0j0;

/* compiled from: SettingsInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.settings.presentation.feature.store.SettingsInlineActor$handleCompressChanged$3", f = "SettingsInlineActor.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class k2j0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ q0j0.e $action;
    int label;
    final /* synthetic */ m2j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2j0(m2j0 m2j0Var, q0j0.e eVar, spj<? super k2j0> spjVar) {
        super(2, spjVar);
        this.this$0 = m2j0Var;
        this.$action = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k2j0(this.this$0, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((k2j0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            n2j0 n2j0Var = this.this$0.d;
            boolean z = this.$action.b;
            this.label = 1;
            if (n2j0Var.a(z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
