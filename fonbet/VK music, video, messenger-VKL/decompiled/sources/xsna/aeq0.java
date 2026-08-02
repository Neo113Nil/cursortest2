package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.stories.entities.OrdData;
import com.vk.libvideo.upload.api.VideoPublicationContext;
import com.vk.video.ui.upload.api.router.PublishArguments;
import com.vk.video.ui.upload.impl.publish.domain.model.CoverDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dot0;
import xsna.ln50;
import xsna.sbe0;

/* compiled from: UploadingDelegate.kt */
/* loaded from: classes7.dex */
public final class aeq0 {

    /* compiled from: UploadingDelegate.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.UploadingDelegateKt$edit$2", f = "UploadingDelegate.kt", l = {267, 286}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ PublishState.Edit $editBlock;
        final /* synthetic */ PublishState $state;
        final /* synthetic */ gce0 $this_edit;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gce0 gce0Var, PublishState.Edit edit, PublishState publishState, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_edit = gce0Var;
            this.$editBlock = edit;
            this.$state = publishState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$this_edit, this.$editBlock, this.$state, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x007e, code lost:
        
            if (r0 == r6) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00d0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object h;
            Object obj2;
            gce0 gce0Var;
            PublishState publishState;
            PublishState.Edit edit;
            VideoFile videoFile;
            VideoFile videoFile2;
            Object obj3;
            gce0 gce0Var2;
            PublishState publishState2;
            PublishState.Edit edit2;
            Throwable a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ice0 ice0Var = this.$this_edit.e;
                VideoFile videoFile3 = this.$editBlock.b;
                String obj4 = drm0.p0(this.$state.e).toString();
                PublishState publishState3 = this.$state;
                ois0 ois0Var = new ois0(videoFile3, obj4, publishState3.g, publishState3.p, publishState3.r, false, publishState3.C, publishState3.v, publishState3.t, !this.$editBlock.Z1() ? this.$state.n : null);
                this.label = 1;
                h = ice0Var.h(ois0Var, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    videoFile2 = (VideoFile) this.L$4;
                    edit2 = (PublishState.Edit) this.L$3;
                    publishState2 = (PublishState) this.L$2;
                    gce0Var2 = (gce0) this.L$1;
                    obj3 = this.L$0;
                    kotlin.a.a(obj);
                    edit = edit2;
                    publishState = publishState2;
                    gce0Var = gce0Var2;
                    obj2 = obj3;
                    videoFile = videoFile2;
                    if (!edit.Z1()) {
                        o3r0.b(gce0Var);
                    } else if (publishState.n != null) {
                        o3r0.d(gce0Var, videoFile.I0());
                    } else if (videoFile.k1() > 0) {
                        UserId I0 = videoFile.I0();
                        String P = videoFile.P();
                        if (P == null) {
                            P = "";
                        }
                        o3r0.e(gce0Var, I0, P);
                    } else {
                        o3r0.b(gce0Var);
                    }
                    gce0Var.c(sbe0.a.a);
                    gce0 gce0Var3 = this.$this_edit;
                    a = Result.a(obj2);
                    if (a != null) {
                        rdi.y(gce0Var3, new p6e0(13));
                        com.vk.metrics.eventtracking.b.a.a(a);
                    }
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                h = ((Result) obj).d();
            }
            obj2 = h;
            gce0Var = this.$this_edit;
            publishState = this.$state;
            edit = this.$editBlock;
            if (!(obj2 instanceof Result.Failure)) {
                videoFile = (VideoFile) obj2;
                aeq0.a(publishState, edit);
                if (edit.Z1() || gce0Var.h.i1()) {
                    cn1 cn1Var = gce0Var.f;
                    List<VideoAlbumResultData> list = publishState.A;
                    List<VideoAlbumResultData> list2 = publishState.B;
                    Date date = publishState.n;
                    this.L$0 = obj2;
                    this.L$1 = gce0Var;
                    this.L$2 = publishState;
                    this.L$3 = edit;
                    this.L$4 = videoFile;
                    this.I$0 = 0;
                    this.label = 2;
                    if (cn1Var.g(list, list2, videoFile, date, this) != coroutineSingletons) {
                        videoFile2 = videoFile;
                        obj3 = obj2;
                        gce0Var2 = gce0Var;
                        publishState2 = publishState;
                        edit2 = edit;
                        edit = edit2;
                        publishState = publishState2;
                        gce0Var = gce0Var2;
                        obj2 = obj3;
                        videoFile = videoFile2;
                    }
                    return coroutineSingletons;
                }
                if (!edit.Z1()) {
                }
                gce0Var.c(sbe0.a.a);
            }
            gce0 gce0Var32 = this.$this_edit;
            a = Result.a(obj2);
            if (a != null) {
            }
            return s3q0.a;
        }
    }

    public static final void a(PublishState publishState, PublishState.Edit edit) {
        VideoFile videoFile = edit.b;
        if (videoFile == null || !(publishState.d instanceof CoverDo.Local)) {
            return;
        }
        com.vk.upload.impl.a.i(new com.vk.upload.impl.tasks.w(publishState.h, videoFile.o0(), ((CoverDo.Local) publishState.d).b));
    }

    public static final String b(List<? extends PrivacySetting.PrivacyRule> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((PrivacySetting.PrivacyRule) it.next()).zb(), arrayList);
        }
        return j5g.g0(arrayList, null, null, null, 0, null, 63);
    }

    public static final void c(gce0 gce0Var, PublishState publishState, PublishState.Edit edit) {
        if (edit.b == null) {
            return;
        }
        if (publishState.u(edit)) {
            d3q.a(gce0Var, tee0.a, ln50.a.b, new rtg0(gce0Var, 8), new a(gce0Var, edit, publishState, null));
        } else {
            gce0Var.c(sbe0.a.a);
        }
    }

    public static final boolean d(gce0 gce0Var, PublishState publishState) {
        if (((Boolean) publishState.c0.getValue()).booleanValue() && publishState.y) {
            return true;
        }
        return gce0Var.h.y1() && ((Boolean) publishState.d0.getValue()).booleanValue() && publishState.z;
    }

    public static final void e(gce0 gce0Var, PublishState publishState, PublishState.Upload upload, String str) {
        VideoPublicationContext videoPublicationContext;
        PublishArguments publishArguments = gce0Var.d;
        Context context = gce0Var.c;
        PublishArguments.Upload upload2 = publishArguments instanceof PublishArguments.Upload ? (PublishArguments.Upload) publishArguments : null;
        String str2 = (upload2 == null || (videoPublicationContext = upload2.c) == null) ? null : videoPublicationContext.b;
        PendingIntent a2 = t2i0.a(context, 0, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(fds0.a + publishState.h)), 33554432);
        dot0 dot0Var = gce0Var.g;
        String uri = upload.b.toString();
        String obj = drm0.p0(publishState.e).toString();
        String str3 = publishState.g;
        UserId userId = publishState.h;
        List list = (List) publishState.a0.getValue();
        String b = b(publishState.p.b);
        String b2 = b(publishState.r.b);
        String string = context.getString(R.string.publish_video_upload_ok);
        String string2 = context.getString(R.string.publish_video_upload_ok_long);
        OrdData ordData = publishState.C;
        List<VideoFile> list2 = publishState.v;
        DonutLevel donutLevel = publishState.t;
        Integer valueOf = donutLevel != null ? Integer.valueOf(donutLevel.b) : null;
        Date date = publishState.n;
        CoverDo coverDo = publishState.d;
        CoverDo.Local local = coverDo instanceof CoverDo.Local ? (CoverDo.Local) coverDo : null;
        String str4 = local != null ? local.b : null;
        VideoInfoDo videoInfoDo = publishState.c;
        Long valueOf2 = videoInfoDo != null ? Long.valueOf(videoInfoDo.b) : null;
        VideoAuthorDo videoAuthorDo = publishState.k;
        dot0Var.j(new dot0.a(uri, obj, str3, userId, videoAuthorDo != null ? videoAuthorDo.e : null, str, str2, list, b, b2, string, string2, a2, ordData, list2, valueOf, date, str4, d(gce0Var, publishState), valueOf2));
        gce0Var.c(sbe0.a.a);
    }
}
