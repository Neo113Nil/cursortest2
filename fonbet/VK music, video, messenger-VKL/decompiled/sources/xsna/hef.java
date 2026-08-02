package xsna;

import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.clips.uploader.impl.model.ClipUploadJobInternal;
import com.vk.clips.uploader.impl.model.DraftRef;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.led;

/* compiled from: ClipsUploadControllerImpl.kt */
@b6l(c = "com.vk.clips.uploader.impl.ClipsUploadControllerImpl$updateDraft$1", f = "ClipsUploadControllerImpl.kt", l = {444}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class hef extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ClipUploadJob $upload;
    final /* synthetic */ ClipUploaderData $uploaderData;
    int label;
    final /* synthetic */ fef this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hef(ClipUploaderData clipUploaderData, fef fefVar, ClipUploadJob clipUploadJob, spj<? super hef> spjVar) {
        super(2, spjVar);
        this.$uploaderData = clipUploaderData;
        this.this$0 = fefVar;
        this.$upload = clipUploadJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hef(this.$uploaderData, this.this$0, this.$upload, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hef) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ClipsDraft clipsDraft;
        u2f u2fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            String str = this.$uploaderData.e;
            clipsDraft = null;
            if (str != null && (u2fVar = this.this$0.b) != null) {
                this.label = 1;
                obj = u2fVar.c(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (clipsDraft != null) {
                fef fefVar = this.this$0;
                ClipUploaderData clipUploaderData = this.$uploaderData;
                ClipUploadJob clipUploadJob = this.$upload;
                synchronized (fefVar.c) {
                    try {
                        String str2 = clipUploaderData.e;
                        if (str2 != null) {
                            u2f u2fVar2 = fefVar.b;
                            if (u2fVar2 != null) {
                                u2fVar2.a(str2);
                            }
                            rlf d = fefVar.a.d();
                            if (d != null) {
                                d.b(new led.b(str2));
                            }
                        }
                        ClipUploadJobInternal clipUploadJobInternal = fefVar.g.c.get(Integer.valueOf(clipUploadJob.b));
                        if (clipUploadJobInternal != null) {
                            fefVar.g.b(ClipUploadJobInternal.zb(clipUploadJobInternal, null, null, null, null, null, new DraftRef.Full(clipsDraft), null, 479));
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        clipsDraft = (ClipsDraft) obj;
        if (clipsDraft != null) {
        }
        return s3q0.a;
    }
}
