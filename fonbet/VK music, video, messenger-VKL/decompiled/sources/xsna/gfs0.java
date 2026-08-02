package xsna;

import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vk.feed.design.view.newsfeed.discover.video.FeedVideoDiscoverItemView;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.pip.VideoPipStateHolder;

/* compiled from: VideoDiscoverPreviewContent.kt */
/* loaded from: classes4.dex */
public final class gfs0 {
    public i6n a;
    public boolean b;
    public final b c = new b();

    /* compiled from: VideoDiscoverPreviewContent.kt */
    public static final class a {
        public final FeedVideoDiscoverItemView a;

        public a(FeedVideoDiscoverItemView feedVideoDiscoverItemView) {
            this.a = feedVideoDiscoverItemView;
        }

        public final void a(int i, int i2) {
            VideoTextureView videoTextureView = this.a.h;
            videoTextureView.getTransformController().f(videoTextureView.getTransformController().e, false);
            videoTextureView.getMatrixProvider().l(i, i2);
        }

        public final void b(boolean z) {
            this.a.setErrorState(z);
        }

        public final void c(boolean z) {
            this.a.setLoadingState(z);
        }

        public final void d(boolean z) {
            this.a.setPreviewImageVisible(z);
        }
    }

    /* compiled from: VideoDiscoverPreviewContent.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        
            if (com.vk.libvideo.autoplay.e.g() != false) goto L21;
         */
        @Override // android.view.View.OnAttachStateChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewAttachedToWindow(View view) {
            i6n i6nVar;
            gfs0 gfs0Var = gfs0.this;
            if (gfs0Var.b) {
                return;
            }
            FeedVideoDiscoverItemView feedVideoDiscoverItemView = view instanceof FeedVideoDiscoverItemView ? (FeedVideoDiscoverItemView) view : null;
            if (feedVideoDiscoverItemView == null) {
                return;
            }
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.d() || (i6nVar = gfs0Var.a) == null) {
                return;
            }
            gfs0Var.b = true;
            VideoTextureView videoTextureView = feedVideoDiscoverItemView.getVideoTextureView();
            i6nVar.h = videoTextureView;
            i6nVar.i = false;
            a aVar = i6nVar.e;
            aVar.c(true);
            aVar.b(false);
            aVar.d(true);
            VideoFile videoFile = i6nVar.a;
            aVar.a(videoFile.getWidth(), videoFile.getHeight());
            com.vk.libvideo.autoplay.a aVar2 = new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, false, false, false, null, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, null, null, null, false, null, 519165);
            if (!aVar2.i) {
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            }
            VideoMinifiedPlayerStateHolder.a.getClass();
            if (!VideoMinifiedPlayerStateHolder.a() && videoFile.T3() && aVar2.g) {
                b0g b0gVar = b0g.a;
                if (b0g.b()) {
                    yg5 yg5Var = i6nVar.g;
                    if (yg5Var == null) {
                        com.vk.libvideo.autoplay.b bVar = i6nVar.f;
                        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                        yg5Var = bVar.e(videoFile, null);
                        i6nVar.g = yg5Var;
                    }
                    yg5 yg5Var2 = yg5Var;
                    yg5Var2.a0(aVar2);
                    yg5Var2.f0(i6nVar.j);
                    yg5.o0(yg5Var2, i6nVar.b, i6nVar.c, i6nVar.d, false, 8);
                    yg5Var2.Q(false);
                    yg5Var2.z0(videoTextureView, aVar2, null);
                    yg5Var2.O();
                    yg5Var2.play();
                    return;
                }
            }
            aVar.c(false);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            gfs0 gfs0Var = gfs0.this;
            i6n i6nVar = gfs0Var.a;
            if (i6nVar != null) {
                com.vk.libvideo.autoplay.b bVar = i6nVar.f;
                yg5 yg5Var = i6nVar.g;
                if (yg5Var != null) {
                    VideoTextureView videoTextureView = i6nVar.h;
                    xh5 xh5Var = bVar.c;
                    boolean z = xh5Var != null && xh5Var.a == yg5Var && xh5Var.c() == videoTextureView;
                    boolean z2 = videoTextureView != null && yg5Var.j0(videoTextureView);
                    yg5Var.T(i6nVar.j);
                    if (videoTextureView != null) {
                        yg5Var.b0(videoTextureView);
                    }
                    if (z || z2) {
                        yg5Var.C(true);
                        xh5 xh5Var2 = bVar.c;
                        if (xh5Var2 != null && xh5Var2.a == yg5Var && xh5Var2.c() == videoTextureView) {
                            bVar.l(null);
                        }
                    }
                    i6nVar.h = null;
                    i6nVar.g = null;
                }
            }
            gfs0Var.b = false;
        }
    }

    public gfs0(r4n r4nVar, o4n o4nVar) {
    }
}
