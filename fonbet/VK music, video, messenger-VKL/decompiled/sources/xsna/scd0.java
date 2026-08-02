package xsna;

import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sbe0;

/* compiled from: PrivacyDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.PrivacyDelegateKt$openWatchPrivacy$2", f = "PrivacyDelegate.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class scd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gce0 $this_openWatchPrivacy;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scd0(gce0 gce0Var, spj<? super scd0> spjVar) {
        super(2, spjVar);
        this.$this_openWatchPrivacy = gce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new scd0(this.$this_openWatchPrivacy, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((scd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (((PublishState) this.$this_openWatchPrivacy.b.getCurrentState()).p.c.isEmpty()) {
                gce0 gce0Var = this.$this_openWatchPrivacy;
                this.label = 1;
                if (ucd0.a(gce0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        gce0 gce0Var2 = this.$this_openWatchPrivacy;
        UserId userId = ((PublishState) gce0Var2.b.getCurrentState()).h;
        PrivacyDo privacyDo = ((PublishState) this.$this_openWatchPrivacy.b.getCurrentState()).p;
        PrivacySetting privacySetting = new PrivacySetting();
        privacySetting.e = privacyDo.b;
        privacySetting.f = privacyDo.c;
        gce0Var2.c(new sbe0.i(userId, privacySetting, ((PublishState) this.$this_openWatchPrivacy.b.getCurrentState()).t));
        return s3q0.a;
    }
}
