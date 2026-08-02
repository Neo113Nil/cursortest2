package xsna;

import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.core.telemetry.VideoOpenTelemetryComponent;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import xsna.eil0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class sb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                return (ClipsViewerAdapterComponent) ((g8m) r1).a(fpf0.a(ClipsViewerAdapterComponent.class));
            case 1:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((CatalogLegacyComponent) r1.getValue()).qf();
            case 2:
                return new mkz(new bpn0(new nwk((gxw) r1, 12)), o25.a());
            case 3:
                return ((StorefrontServicesComponent) ((LinksBridgeComponentImpl) r1).q.getValue()).a();
            case 4:
                return ((VideoOpenTelemetryComponent) ((r360) r1).c().a(fpf0.a(VideoOpenTelemetryComponent.class))).Nc();
            case 5:
                return new wsp((OfflineAudioDatabase_Impl) r1);
            case 6:
                PhotosComponentImpl photosComponentImpl = (PhotosComponentImpl) r1;
                qcy<Object>[] qcyVarArr2 = PhotosComponentImpl.u;
                aha0 d = f9t.d();
                AlbumsRepository i3 = photosComponentImpl.i3();
                nwy nwyVar = photosComponentImpl.n;
                qcy<Object> qcyVar = PhotosComponentImpl.u[13];
                return new xi3(d, i3, (aga0) nwyVar.c());
            case 7:
                bpn0 bpn0Var = ((aid0) r1).q;
                if (!lhs.d()) {
                    return new ixf0((thd0) bpn0Var.getValue());
                }
                lhs.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
                try {
                    return new ixf0((thd0) bpn0Var.getValue());
                } finally {
                    lhs.b();
                }
            case 8:
                return new eil0.a(((eil0) r1).a);
            case 9:
                StoryViewerComponentImpl storyViewerComponentImpl = (StoryViewerComponentImpl) r1;
                StoriesComponent storiesComponent = storyViewerComponentImpl.a;
                return new rnm0(storiesComponent.w(), storiesComponent.r2(), storyViewerComponentImpl.b.r4());
            default:
                if (((qks0) r1).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_CARD_TO_DS;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
