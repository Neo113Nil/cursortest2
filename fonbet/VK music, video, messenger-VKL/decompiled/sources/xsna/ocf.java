package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.profile.Donut;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.mjf;
import xsna.ugf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$preselectCta$2", f = "ClipsUploadAsyncLoadExecutor.kt", l = {664}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ocf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mjf.a.m $task;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocf(wcf wcfVar, mjf.a.m mVar, spj<? super ocf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
        this.$task = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ocf(this.this$0, this.$task, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ocf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Donut donut;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lm50 currentState = this.this$0.b.getCurrentState();
            ClipsUploadState.Loaded loaded = currentState instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState : null;
            if (loaded == null) {
                return s3q0.a;
            }
            Group b = hif.b(loaded, this.$task.b);
            if (b == null) {
                return s3q0.a;
            }
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = loaded.b.e;
            ClipInvolvementActionButton<?> clipInvolvementActionButton = clipsUploadAuthorRelatedData.g;
            if (b.Y || clipsUploadAuthorRelatedData.f.b != null || (donut = b.Q) == null || !donut.d() || clipInvolvementActionButton != null) {
                return s3q0.a;
            }
            lod lodVar = this.this$0.j;
            UserId userId = b.c;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = lodVar.b(userId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        ClipInvolvementActionButton clipInvolvementActionButton2 = (ClipInvolvementActionButton) obj;
        if (clipInvolvementActionButton2 != null) {
            this.this$0.e(new ugf.h.a(clipInvolvementActionButton2));
        }
        return s3q0.a;
    }
}
