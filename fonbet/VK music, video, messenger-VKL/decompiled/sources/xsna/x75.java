package xsna;

import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sbe0;

/* compiled from: AuthorDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.AuthorDelegateKt$handleClick$2", f = "AuthorDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class x75 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gce0 $this_handleClick;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x75(gce0 gce0Var, spj<? super x75> spjVar) {
        super(2, spjVar);
        this.$this_handleClick = gce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new x75(this.$this_handleClick, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((x75) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        List<VideoAuthorDo> list = ((PublishState) this.$this_handleClick.b.getCurrentState()).i;
        VideoAuthorDo videoAuthorDo = ((PublishState) this.$this_handleClick.b.getCurrentState()).k;
        if (videoAuthorDo == null) {
            videoAuthorDo = list != null ? (VideoAuthorDo) j5g.a0(list) : null;
        }
        if (list == null || videoAuthorDo == null) {
            return s3q0.a;
        }
        gce0 gce0Var = this.$this_handleClick;
        int indexOf = list.indexOf(videoAuthorDo);
        PublishState publishState = (PublishState) this.$this_handleClick.b.getCurrentState();
        gce0Var.c(new sbe0.c(list, indexOf, (epx.f(publishState.p.b, publishState.q.b) && epx.f(publishState.r.b, publishState.s.b) && epx.f(publishState.t, publishState.u) && epx.f((List) publishState.Y.getValue(), (List) publishState.Z.getValue()) && epx.f((List) publishState.a0.getValue(), (List) publishState.b0.getValue()) && epx.f(publishState.C, publishState.D)) ? false : true));
        return s3q0.a;
    }
}
