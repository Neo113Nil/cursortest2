package xsna;

import android.view.View;
import com.vk.cast.api.di.CastComponent;
import com.vk.libvideo.api.promo.stats.VkVideoBackgroundViewStatDelegateComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.music.bottomsheets.di.PodcastBottomSheetHeaderComponent;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uvs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uvs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (CastComponent) ((f8m) obj).a(fpf0.a(CastComponent.class));
            case 1:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) obj;
                VideoOfflineFragment.e eVar = videoOfflineFragment.T0;
                if (eVar == null) {
                    eVar = null;
                }
                eVar.notifyDataSetChanged();
                VideoOfflineFragment.f fVar = videoOfflineFragment.U0;
                if (fVar == null) {
                    fVar = null;
                }
                fVar.notifyDataSetChanged();
                VideoOfflineFragment.a aVar = videoOfflineFragment.V0;
                (aVar != null ? aVar : null).notifyDataSetChanged();
                return s3q0.a;
            case 2:
                VideoView videoView = (VideoView) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                fqt0 fqt0Var = new fqt0(videoView);
                fot fotVar = new fot(videoView.getContext(), fqt0Var, null);
                fotVar.a.setOnDoubleTapListener(fqt0Var);
                return fotVar;
            case 3:
                return ((sqt0) obj).C.findViewById(R.id.position_duration_view);
            case 4:
                return ((VkVideoBackgroundViewStatDelegateComponent) ((k7m) m7m.f((nst0) obj)).a(fpf0.a(VkVideoBackgroundViewStatDelegateComponent.class))).b5();
            case 5:
                com.vk.superapp.browser.ui.a aVar2 = (com.vk.superapp.browser.ui.a) obj;
                return aVar2.Fn(aVar2);
            case 6:
                return (PodcastBottomSheetHeaderComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).mo408a(fpf0.a(PodcastBottomSheetHeaderComponent.class));
            case 7:
                View view = (View) ((WeakReference) obj).get();
                if (view != null) {
                    return f4m.e(view);
                }
                return null;
            case 8:
                vlw0 vlw0Var = (vlw0) obj;
                vlw0Var.k.b(vlw0Var.V(null));
                return s3q0.a;
            default:
                return Boolean.valueOf(((o4x0) obj).b());
        }
    }
}
