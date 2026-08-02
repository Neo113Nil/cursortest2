package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavalabilityReason;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.mjf;
import xsna.oap;
import xsna.ugf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$refreshGroupClosedStatus$2", f = "ClipsUploadAsyncLoadExecutor.kt", l = {IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class qcf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mjf.a.n $task;
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcf(wcf wcfVar, mjf.a.n nVar, spj<? super qcf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
        this.$task = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qcf(this.this$0, this.$task, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qcf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            agf agfVar = this.this$0.i;
            UserId userId = this.$task.b;
            this.label = 1;
            obj = agfVar.b(userId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        Group group = (Group) obj;
        if (group == null) {
            return s3q0.a;
        }
        oap.a aVar = new oap.a(group);
        ClipsUploadDataInternal clipsUploadDataInternal = ((ClipsUploadState.Loaded) this.this$0.b.getCurrentState()).b;
        Pair c = kff.c(clipsUploadDataInternal.e.c.b.b, group, aVar, clipsUploadDataInternal.e.j.d() != null, clipsUploadDataInternal.f);
        ConditionalFeature.State state = (ConditionalFeature.State) c.i();
        wcf wcfVar = this.this$0;
        wcfVar.e(new ugf.a.i(aVar, kff.b(aVar, ((ClipsUploadState.Loaded) wcfVar.b.getCurrentState()).b.e.c.b), state, (EasyPromoteUnavalabilityReason) c.j()));
        return s3q0.a;
    }
}
