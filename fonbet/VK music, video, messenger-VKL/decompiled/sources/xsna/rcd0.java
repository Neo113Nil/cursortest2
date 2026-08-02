package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.dto.common.data.PrivacySetting;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PrivacyDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.PrivacyDelegateKt$handleWatchEdit$1", f = "PrivacyDelegate.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class rcd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mbe0 $action;
    final /* synthetic */ gce0 $this_handleWatchEdit;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcd0(gce0 gce0Var, mbe0 mbe0Var, spj<? super rcd0> spjVar) {
        super(2, spjVar);
        this.$this_handleWatchEdit = gce0Var;
        this.$action = mbe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rcd0(this.$this_handleWatchEdit, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rcd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            ice0 ice0Var = this.$this_handleWatchEdit.e;
            List<PrivacySetting.PrivacyRule> list = this.$action.b.e;
            this.label = 1;
            i = ice0Var.i(list, this);
            if (i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            i = ((Result) obj).d();
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Throwable a = Result.a(i);
        if (a != null) {
            bVar.a(a);
        }
        if (i instanceof Result.Failure) {
            i = "";
        }
        int i3 = 27;
        rdi.y(this.$this_handleWatchEdit, new v74(i3, this.$action, ucd0.b((String) i, this.$this_handleWatchEdit.c, this.$action.c)));
        return s3q0.a;
    }
}
