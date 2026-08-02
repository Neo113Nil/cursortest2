package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.qef;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$updateVideoAttachmentInfo$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {568}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class tcf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcf(wcf wcfVar, spj<? super tcf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new tcf(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tcf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                ClipAttachedVideoInfo clipAttachedVideoInfo = ((ClipsUploadState.Loaded) this.this$0.b.getCurrentState()).b.e.h.b;
                if (clipAttachedVideoInfo == null) {
                    return s3q0.a;
                }
                ClipAttachedVideoInfo clipAttachedVideoInfo2 = clipAttachedVideoInfo;
                zkf zkfVar = this.this$0.n;
                String str = clipAttachedVideoInfo2.d;
                Integer num = clipAttachedVideoInfo2.e;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = zkfVar.a(str, num, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            wcf wcfVar = this.this$0;
        } catch (Exception unused) {
            this.this$0.c(qef.c0.a);
            wcf wcfVar2 = this.this$0;
        }
        return s3q0.a;
    }
}
