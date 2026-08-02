package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Date;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sbe0;

/* compiled from: UploadingDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.UploadingDelegateKt$uploadDraft$2", f = "UploadingDelegate.kt", l = {201, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class beq0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ PublishState.Edit $editBlock;
    final /* synthetic */ PublishState $state;
    final /* synthetic */ gce0 $this_uploadDraft;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beq0(gce0 gce0Var, PublishState.Edit edit, PublishState publishState, spj<? super beq0> spjVar) {
        super(2, spjVar);
        this.$this_uploadDraft = gce0Var;
        this.$editBlock = edit;
        this.$state = publishState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new beq0(this.$this_uploadDraft, this.$editBlock, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((beq0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r0 == r6) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object obj2;
        VideoFile videoFile;
        Object obj3;
        gce0 gce0Var;
        PublishState publishState;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ice0 ice0Var = this.$this_uploadDraft.e;
            VideoFile videoFile2 = this.$editBlock.b;
            String obj4 = drm0.p0(this.$state.e).toString();
            PublishState publishState2 = this.$state;
            String str = publishState2.g;
            PrivacyDo privacyDo = publishState2.p;
            PrivacyDo privacyDo2 = publishState2.r;
            boolean d = aeq0.d(this.$this_uploadDraft, publishState2);
            PublishState publishState3 = this.$state;
            ois0 ois0Var = new ois0(videoFile2, obj4, str, privacyDo, privacyDo2, d, publishState3.C, publishState3.v, publishState3.t, publishState3.n);
            this.label = 1;
            e = ice0Var.e(ois0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                videoFile = (VideoFile) this.L$3;
                publishState = (PublishState) this.L$2;
                gce0Var = (gce0) this.L$1;
                obj3 = this.L$0;
                kotlin.a.a(obj);
                if (publishState.n == null) {
                    o3r0.d(gce0Var, videoFile.I0());
                } else {
                    UserId I0 = videoFile.I0();
                    String P = videoFile.P();
                    if (P == null) {
                        P = "";
                    }
                    o3r0.e(gce0Var, I0, P);
                }
                gce0Var.c(sbe0.a.a);
                obj2 = obj3;
                gce0 gce0Var2 = this.$this_uploadDraft;
                a = Result.a(obj2);
                if (a != null) {
                    rdi.y(gce0Var2, new nc90(23));
                    com.vk.metrics.eventtracking.b.a.a(a);
                }
                return s3q0.a;
            }
            kotlin.a.a(obj);
            e = ((Result) obj).d();
        }
        obj2 = e;
        gce0 gce0Var3 = this.$this_uploadDraft;
        PublishState publishState4 = this.$state;
        PublishState.Edit edit = this.$editBlock;
        if (!(obj2 instanceof Result.Failure)) {
            VideoFile videoFile3 = (VideoFile) obj2;
            aeq0.a(publishState4, edit);
            cn1 cn1Var = gce0Var3.f;
            List<VideoAlbumResultData> list = publishState4.A;
            List<VideoAlbumResultData> list2 = publishState4.B;
            Date date = publishState4.n;
            this.L$0 = obj2;
            this.L$1 = gce0Var3;
            this.L$2 = publishState4;
            this.L$3 = videoFile3;
            this.I$0 = 0;
            this.label = 2;
            if (cn1Var.g(list, list2, videoFile3, date, this) != coroutineSingletons) {
                videoFile = videoFile3;
                obj3 = obj2;
                gce0Var = gce0Var3;
                publishState = publishState4;
                if (publishState.n == null) {
                }
                gce0Var.c(sbe0.a.a);
                obj2 = obj3;
            }
            return coroutineSingletons;
        }
        gce0 gce0Var22 = this.$this_uploadDraft;
        a = Result.a(obj2);
        if (a != null) {
        }
        return s3q0.a;
    }
}
