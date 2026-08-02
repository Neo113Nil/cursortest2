package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerArguments;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;

/* compiled from: VideoViewerInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.videoviewer.presentation.feature.store.VideoViewerInlineActor$initPlayer$1", f = "VideoViewerInlineActor.kt", l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class srt0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ urt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srt0(urt0 urt0Var, spj<? super srt0> spjVar) {
        super(1, spjVar);
        this.this$0 = urt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new srt0(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((srt0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        if (r4 != null) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final xk80 xk80Var;
        OneVideoPlayer.d dVar;
        Object obj2;
        xk80 xk80Var2;
        OneVideoPlayer.d dVar2;
        sht0 hwzVar;
        Uri uri;
        List list;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 7;
        if (i == 0) {
            kotlin.a.a(obj);
            Context context = this.this$0.d;
            int i3 = wn80.a;
            xk80Var = new xk80(context.getApplicationContext(), null, null, null, null, false, new rhh0(8), xgp0.j, wn80.e, new r8l(false, false, 7), 2000L, null, null, false, new o3i0(0L, 0L), new psm0(0));
            final urt0 urt0Var = this.this$0;
            dVar = new OneVideoPlayer.d() { // from class: xsna.rrt0
                @Override // one.video.player.OneVideoPlayer.d
                public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
                    rdi.y(urt0.this, new tf5(xk80Var, j));
                }
            };
            xk80Var.s(dVar);
            urt0 urt0Var2 = this.this$0;
            VideoViewerArguments videoViewerArguments = urt0Var2.c;
            if (videoViewerArguments instanceof VideoViewerArguments.Local) {
                hwzVar = new hwz(((VideoViewerArguments.Local) videoViewerArguments).b);
                xk80Var.n0(hwzVar, ((VideoViewerState) this.this$0.b.getCurrentState()).f);
                rdi.y(this.this$0, new zsl0(i2, xk80Var, dVar));
                return s3q0.a;
            }
            if (!(videoViewerArguments instanceof VideoViewerArguments.RemoteAttachedClip)) {
                throw new NoWhenBranchMatchedException();
            }
            vrt0 vrt0Var = urt0Var2.e;
            String str = ((VideoViewerArguments.RemoteAttachedClip) videoViewerArguments).b;
            this.L$0 = xk80Var;
            this.L$1 = dVar;
            this.L$2 = null;
            this.label = 1;
            Object a = vrt0Var.a(str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
            xk80Var2 = xk80Var;
            dVar2 = dVar;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar2 = (OneVideoPlayer.d) this.L$1;
            xk80Var2 = (xk80) this.L$0;
            kotlin.a.a(obj);
            obj2 = ((Result) obj).d();
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Throwable a2 = Result.a(obj2);
        if (a2 != null) {
            bVar.a(a2);
        }
        if (obj2 instanceof Result.Failure) {
            obj2 = null;
        }
        ClipVideoFile clipVideoFile = (ClipVideoFile) obj2;
        if (clipVideoFile != null) {
            this.this$0.getClass();
            VideoUrl.Companion.getClass();
            list = VideoUrl.MP4_URLS;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (clipVideoFile.f.Ab((VideoUrl) obj3) != null && (!drm0.N(r9))) {
                    break;
                }
            }
            VideoUrl videoUrl = (VideoUrl) obj3;
            String Ab = videoUrl != null ? clipVideoFile.f.Ab(videoUrl) : null;
            if (Ab != null) {
                uri = Uri.parse(Ab);
            }
        }
        uri = Uri.EMPTY;
        dVar = dVar2;
        xk80Var = xk80Var2;
        hwzVar = new ag30(uri);
        xk80Var.n0(hwzVar, ((VideoViewerState) this.this$0.b.getCurrentState()).f);
        rdi.y(this.this$0, new zsl0(i2, xk80Var, dVar));
        return s3q0.a;
    }
}
