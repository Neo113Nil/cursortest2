package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.AuthorDelegateKt$onNewChannelCreated$2", f = "AuthorDelegate.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class y75 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ UserId $channelId;
    final /* synthetic */ gce0 $this_onNewChannelCreated;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y75(gce0 gce0Var, UserId userId, spj<? super y75> spjVar) {
        super(2, spjVar);
        this.$this_onNewChannelCreated = gce0Var;
        this.$channelId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new y75(this.$this_onNewChannelCreated, this.$channelId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((y75) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            gce0 gce0Var = this.$this_onNewChannelCreated;
            this.label = 1;
            if (a85.a(gce0Var, ((PublishState) gce0Var.b.getCurrentState()).j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ((Result) obj).getClass();
        }
        gce0 gce0Var2 = this.$this_onNewChannelCreated;
        rdi.y(gce0Var2, new oh3(1, this.$channelId, gce0Var2));
        this.$this_onNewChannelCreated.k.getClass();
        return s3q0.a;
    }
}
