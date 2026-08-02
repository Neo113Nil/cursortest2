package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.camera.clips.api.stub.CameraClipsComponentStub;
import com.vk.clips.viewer.impl.di.ClipsViewerAdapterComponentImpl;
import com.vk.common.links.generator.impl.di.LinksGeneratorComponentImpl;
import com.vk.ecomm.market.di.MarketProductFilterComponentImpl;
import com.vk.ecomm.moderation.api.di.ModerationComponent$Companion$STUB$1;
import com.vk.menu.di.MenuComponent;
import com.vk.notifications.list.impl.presentation.base.fragment.grouped.GroupedNotificationListFragment;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.music.impl.di.MusicInVideoComponentImpl;
import java.util.Map;
import xsna.qhd;
import xsna.sl8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class n1 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ n1(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AboutAppFragment.X;
                return new y1();
            case 1:
                return ((MenuComponent) ((k7m) m7m.f(new w7m())).a(fpf0.a(MenuComponent.class))).S2();
            case 2:
                return new io.reactivex.rxjava3.subjects.f();
            case 3:
                return new a390();
            case 4:
                return new mo4();
            case 5:
                return Boolean.valueOf(fxc0.B().J().N1());
            case 6:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 7:
                int i = sl8.d;
                return sl8.a.a(4);
            case 8:
                qcy<Object>[] qcyVarArr2 = CameraClipsComponentStub.h;
                qhd.a.getClass();
                return qhd.a.b;
            case 9:
                return Boolean.valueOf(com.vk.toggle.b.A.a(StoriesFeatures.VERTICALIZATION));
            case 10:
                return s3q0.a;
            case 11:
                return new es();
            case 12:
                qcy<Object>[] qcyVarArr3 = ClipsViewerAdapterComponentImpl.b;
                return new ClipsViewerAdapterComponentImpl.b();
            case 13:
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                int i2 = com.vk.channelrestrictions.b.h1;
                return s3q0.a;
            case 16:
                return new Handler(Looper.getMainLooper());
            case 17:
                return new s290();
            case 18:
                int i3 = GroupedNotificationListFragment.Y;
                return new he70();
            case 19:
                return new i1t0(true, bo.h());
            case 20:
                return new kaz((Map) jaz.a.getValue());
            case 21:
                qcy<Object>[] qcyVarArr4 = LinksGeneratorComponentImpl.f;
                return new qde();
            case 22:
                qcy<Object>[] qcyVarArr5 = MarketProductFilterComponentImpl.e;
                return new god0();
            case 23:
                qcy<Object>[] qcyVarArr6 = ModerationComponent$Companion$STUB$1.f;
                return new o530();
            case 24:
                return Boolean.valueOf(MusicFeatures.CATALOG_MY_MUSIC_SECTION_CACHE.h());
            case 25:
                qcy<Object>[] qcyVarArr7 = MusicInVideoComponentImpl.e;
                return new oxs0(new rxs0(new uft0()));
            case 26:
                return s3q0.a;
            case 27:
                return new p4r();
            case 28:
                return new he70();
            default:
                return s3q0.a;
        }
    }
}
