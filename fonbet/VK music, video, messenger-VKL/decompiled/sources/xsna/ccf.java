package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.qef;
import xsna.ugf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadNextGroupsBatch$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {584}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ccf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccf(wcf wcfVar, spj<? super ccf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ccf(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ccf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) this.this$0.b.getCurrentState();
                agf agfVar = this.this$0.i;
                int i2 = loaded.j;
                Group group = loaded.e;
                UserId userId = group != null ? group.c : null;
                this.L$0 = null;
                this.label = 1;
                obj = agfVar.a(i2, userId, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            mbq0 mbq0Var = (mbq0) obj;
            this.this$0.e(new ugf.a.c(mbq0Var.a, mbq0Var.c, mbq0Var.d));
        } catch (Exception unused) {
            this.this$0.c(qef.c0.a);
        }
        return s3q0.a;
    }
}
