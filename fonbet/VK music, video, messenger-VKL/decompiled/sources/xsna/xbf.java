package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.chromium.net.telemetry.CronetStatsLog;
import xsna.qef;
import xsna.ugf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadGroupsAndSelectNewChannel$2", f = "ClipsUploadAsyncLoadExecutor.kt", l = {CronetStatsLog.CRONET_ENGINE_BUILDER_INITIALIZED}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class xbf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ UserId $newChannelId;
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbf(wcf wcfVar, UserId userId, spj<? super xbf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
        this.$newChannelId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xbf(this.this$0, this.$newChannelId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xbf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            agf agfVar = this.this$0.i;
            UserId userId = this.$newChannelId;
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
        this.this$0.e(new ugf.a.C3801a(group));
        this.this$0.c(new qef.s(this.$newChannelId));
        return s3q0.a;
    }
}
