package xsna;

import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.VideoFeatures;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qxv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qxv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (StoryViewerComponent) ((g8m) obj).a(fpf0.a(StoryViewerComponent.class));
            case 1:
                return ((OnboardingComponent) m7m.a(((nx50) obj).b).a(fpf0.a(OnboardingComponent.class))).uc();
            case 2:
                return ((com.vk.toggle.e) obj).a.b();
            case 3:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                return ((NewsFeedComponentImpl) obj).C7().b();
            case 4:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                wh40 wh40Var = (wh40) offlineAudioComponentImpl.w.getValue();
                vp40 vp40Var = (vp40) offlineAudioComponentImpl.F.getValue();
                k850 Ib = offlineAudioComponentImpl.Ib();
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                return new sg40(wh40Var, vp40Var, Ib, r5v0Var, offlineAudioComponentImpl.n7(), offlineAudioComponentImpl.K1(), offlineAudioComponentImpl.O2(), offlineAudioComponentImpl.Ae(), offlineAudioComponentImpl.v7(), offlineAudioComponentImpl.W8(), offlineAudioComponentImpl.u3());
            default:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_START_TAB;
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
