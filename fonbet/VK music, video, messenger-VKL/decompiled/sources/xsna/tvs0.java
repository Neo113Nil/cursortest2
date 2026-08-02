package xsna;

import android.content.Context;
import android.os.Parcelable;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryInternalComponent;
import com.vk.video.ui.discovery.minimizable.di.VideoAsyncInflaterComponent;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import com.vk.voip.ui.broadcast.activity.UserRecordsWrapperActivity;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import xsna.phw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tvs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tvs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((VideoAsyncInflaterComponent) ((VideoMinimizableDiscoveryInternalComponent) obj).u.getValue()).p2();
            case 1:
                return VideoOverlayView.Q4((VideoOverlayView) obj);
            case 2:
                int i2 = VideoProfileFragmentOld.p0;
                return (SearchUiComponent) ((k7m) m7m.f((VideoProfileFragmentOld) obj)).a(fpf0.a(SearchUiComponent.class));
            case 3:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) obj;
                int i3 = VideoRelatedVideosFragment.n0;
                b.d dVar = b.d.b;
                videoRelatedVideosFragment.getClass();
                xn50.a.c(videoRelatedVideosFragment, dVar);
                return s3q0.a;
            case 4:
                y3i y3iVar = ((com.vk.attachpicker.screen.p) obj).c0;
                if (y3iVar != null) {
                    y3iVar.invoke();
                }
                return s3q0.a;
            case 5:
                return ((ggu0) obj).b;
            case 6:
                Context context = ((phw0.c) obj).a.get();
                if (context == null) {
                    return s3q0.a;
                }
                PastBroadcastsFragment.a aVar = new PastBroadcastsFragment.a(PastBroadcastsFragment.class, UserRecordsWrapperActivity.class, null);
                aVar.e = true;
                aVar.j.putBoolean("_fragment_impl_key_hide_bottom_fragment", true);
                aVar.s(true);
                aVar.k(context);
                return s3q0.a;
            case 7:
                Parcelable parcelable = (WebAction) obj;
                if (!(parcelable instanceof juu)) {
                    return null;
                }
                juu juuVar = (juu) parcelable;
                if (juuVar.d()) {
                    return Integer.valueOf((int) juuVar.e());
                }
                return null;
            default:
                return new w1y0((y1y0) obj);
        }
    }
}
