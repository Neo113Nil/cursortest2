package xsna;

import android.content.Context;
import com.vk.attachpicker.di.PhotoEditorComponentImpl;
import com.vk.clips.viewer.vk.ClipsViewerEventsComponentImpl;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.im.engine.di.event.ImRxEventObserverComponentImpl;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.music.model.di.AudioModelsComponentImpl;
import com.vk.profile.community.address.impl.di.CommunityAddressComponentImpl;
import com.vk.search.params.impl.di.SearchParamsComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.slider.api.VideoSliderHolderComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.SuperAppMinimizablePlayerComponentImpl;
import xsna.nb3;
import xsna.vz2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wa3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wa3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                return new vz2.a(new nb3.e(0, vx2.a, vx2.class, "getSafeApiManager", "getSafeApiManager()Lcom/vk/api/internal/ApiManager;", 0));
            case 1:
                return new ClipsViewerEventsComponentImpl.a();
            case 2:
                return new com.vk.clips.upload.vk.impl.uploader.e(com.vk.clips.upload.vk.impl.uploader.c.f, com.vk.clips.upload.vk.impl.uploader.c.e, com.vk.clips.upload.vk.impl.uploader.c.d);
            case 3:
                qcy<Object>[] qcyVarArr = CommunityAddressComponentImpl.b;
                return new yqg();
            case 4:
                return Preference.f("display_cutout");
            case 5:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(com.vk.toggle.b.A.a(MusicFeatures.AUDIO_NEW_DOWNLOADED_TRACKS_DUPLICATE_FIX));
            case 6:
                a1w a1wVar = null;
                qcy<Object>[] qcyVarArr2 = ImRxEventObserverComponentImpl.b;
                a1w a1wVar2 = q1w.a;
                if (a1wVar2 != null) {
                    a1wVar = a1wVar2;
                }
                return new ybw(a1wVar);
            case 7:
                t6g0 t6g0Var = t6g0.b;
                return t6g0.b();
            case 8:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                b = e8r.a.b(r3, PrivateSubdir.VIDEO_LIVE_COVERS.h(), true);
                return new j7q(context, b.a, 52428800L, false, 0L, null, null, null, 1008);
            case 9:
                return Boolean.valueOf(com.vk.toggle.d.I());
            case 10:
                return new AudioModelsComponentImpl.a();
            case 11:
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_COMMENTS_INLINE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 12:
                return new StringBuilder();
            case 13:
                qcy<Object>[] qcyVarArr3 = SuperAppMinimizablePlayerComponentImpl.g;
                return io.reactivex.rxjava3.subjects.d.O0(VideoMinimizableState.Hidden.b);
            case 14:
                VKApplication.a aVar = VKApplication.c;
                return ((VideoSliderHolderComponent) m7m.e().a(fpf0.a(VideoSliderHolderComponent.class))).da();
            case 15:
                return dhr0.q0(dhr0.c.b.c);
            case 16:
                VideoFeatures videoFeatures = VideoFeatures.SWIPE_REMOVE;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 17:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_AD_IN_MINI_PLAYER;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 18:
                return new PhotoEditorComponentImpl.a();
            case 19:
                return new SearchParamsComponentImpl.a();
            default:
                com.vk.voip.ui.c.b.getClass();
                return new vbx0(com.vk.voip.ui.c.j0());
        }
    }

    public /* synthetic */ wa3(VKApplication vKApplication) {
        this.b = 14;
    }
}
