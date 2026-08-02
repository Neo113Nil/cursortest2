package xsna;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.vk.catalog2.feature.music.ui.holder.AudioBookGenreCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.feed.design.view.newsfeed.ads_carousel.VkFeedOverlayProductCarousel;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedReactionsStack;
import com.vk.im.design.view.pagination.pin.ImMultiPinView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.VideoFileRenderer;
import ru.ok.android.webrtc.topology.direct.DirectCallTopology;
import ru.ok.media.PublisherImpl;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.VideoCBRMode;
import xsna.eeu0;
import xsna.ikv0;
import xsna.kkk0;
import xsna.sy70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class b04 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b04(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Size size = null;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                c04 c04Var = (c04) this.c;
                synchronized (c04Var.a) {
                    try {
                        if (c04Var.m) {
                            return;
                        }
                        long j = c04Var.l - 1;
                        c04Var.l = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            c04Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (c04Var.a) {
                            c04Var.n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
                AudioBookGenreCatalogRootVh audioBookGenreCatalogRootVh = (AudioBookGenreCatalogRootVh) this.c;
                g3a.a(audioBookGenreCatalogRootVh.p, audioBookGenreCatalogRootVh);
                return;
            case 2:
                ((CarouselLayoutManager) this.c).F();
                return;
            case 3:
                ((DirectCallTopology) this.c).c();
                return;
            case 4:
                FeedReactionsStack feedReactionsStack = (FeedReactionsStack) this.c;
                feedReactionsStack.n = false;
                feedReactionsStack.requestLayout();
                return;
            case 5:
                View view = ((xxu) this.c).k;
                if (view != null) {
                    view.sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 6:
                ((ImMultiPinView) this.c).j = false;
                return;
            case 7:
                fcy fcyVar = (fcy) this.c;
                int i = ImStickerView.p;
                ((gzs) fcyVar).invoke();
                return;
            case 8:
                ((eeu0.a.C2801a) this.c).g();
                return;
            case 9:
                NetworkPerformanceMeasurer.a aVar = (NetworkPerformanceMeasurer.a) this.c;
                ArrayList arrayList = NetworkPerformanceMeasurer.l;
                synchronized (arrayList) {
                    arrayList.add(new WeakReference(aVar));
                    s3q0 s3q0Var = s3q0.a;
                }
                return;
            case 10:
                Streamer streamer = (Streamer) this.c;
                VideoCBRMode videoCBRMode = sy70.c0;
                sy70.a.b(streamer);
                return;
            case 11:
                PodcastCatalogRootVh podcastCatalogRootVh = (PodcastCatalogRootVh) this.c;
                g3a.a(podcastCatalogRootVh.s, podcastCatalogRootVh);
                return;
            case 12:
                ((PublisherImpl) this.c).lambda$startNetworkClient$12();
                return;
            case 13:
                kkk0 kkk0Var = (kkk0) this.c;
                Surface surface = kkk0Var.i;
                if (surface != null) {
                    Iterator<kkk0.b> it = kkk0Var.b.iterator();
                    while (it.hasNext()) {
                        it.next().z();
                    }
                }
                SurfaceTexture surfaceTexture = kkk0Var.h;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kkk0Var.h = null;
                kkk0Var.i = null;
                return;
            case 14:
                ((gzs) this.c).invoke();
                return;
            case 15:
                Context context = (Context) this.c;
                ikv0.a aVar2 = new ikv0.a(context);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), size, 12);
                aVar2.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.clips_publish_no_space_error_snack_title)), new ikv0.d.b(context.getString(R.string.clips_publish_no_space_error_snack_subtitle)), (ikv0.d.a) (objArr == true ? 1 : 0), 4);
                pkv0.f(aVar2);
                return;
            case 16:
                ((VideoFileRenderer) this.c).lambda$release$3();
                return;
            case 17:
                VideoView.J((VideoView) this.c);
                return;
            case 18:
                VkFeedOverlayProductCarousel.T4((VkFeedOverlayProductCarousel) this.c);
                return;
            case 19:
                ((com.ironsource.lifecycle.b) this.c).j();
                return;
            case 20:
                ((mxy0) this.c).a();
                return;
            default:
                yads.ul2.c((yads.ul2) this.c);
                return;
        }
    }
}
