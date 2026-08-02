package xsna;

import com.vk.dto.common.data.PrivacySetting;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sbe0;

/* compiled from: PrivacyDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.PrivacyDelegateKt$handleCommentsVideoClick$2", f = "PrivacyDelegate.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class pcd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gce0 $this_handleCommentsVideoClick;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcd0(gce0 gce0Var, spj<? super pcd0> spjVar) {
        super(2, spjVar);
        this.$this_handleCommentsVideoClick = gce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pcd0(this.$this_handleCommentsVideoClick, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pcd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (((PublishState) this.$this_handleCommentsVideoClick.b.getCurrentState()).r.c.isEmpty()) {
                gce0 gce0Var = this.$this_handleCommentsVideoClick;
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
        gce0 gce0Var2 = this.$this_handleCommentsVideoClick;
        PrivacyDo privacyDo = ((PublishState) gce0Var2.b.getCurrentState()).r;
        PrivacySetting privacySetting = new PrivacySetting();
        privacySetting.e = privacyDo.b;
        privacySetting.f = privacyDo.c;
        gce0Var2.c(new sbe0.h(privacySetting));
        return s3q0.a;
    }
}
