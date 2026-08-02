package xsna;

import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import java.util.EnumSet;
import java.util.regex.Pattern;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd4 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pd4(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.h());
            case 1:
                return new v7c0();
            case 2:
                zdw zdwVar = i7o0.b;
                if (zdwVar != null) {
                    return zdwVar;
                }
                return null;
            case 3:
                qcy<Object>[] qcyVarArr = ClipsInterestsComponentImpl.o;
                return new ihe();
            case 4:
                return new hve();
            case 5:
                return s3q0.a;
            case 6:
                return new io.reactivex.rxjava3.disposables.b();
            case 7:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_VISIBILITY;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 8:
                return Boolean.FALSE;
            case 9:
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var != null) {
                    return r5v0Var;
                }
                return null;
            case 10:
                qcy<Object>[] qcyVarArr2 = DiscoverMediaTabFragment2.C0;
                return new y3v();
            case 11:
                qcy<Object>[] qcyVarArr3 = DiscoverSimilarFeedFragment.s0;
                FeedFeatures feedFeatures = FeedFeatures.FEED_GET_CUSTOM_CHUNK;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 12:
                return new d2w0();
            case 13:
                qcy<Object>[] qcyVarArr4 = GoodFragment.U0;
                return new sld0(0);
            case 14:
                return "#tryToRecover - with in memory db";
            case 15:
                FeedFeatures feedFeatures2 = FeedFeatures.FRESH_TIMER;
                feedFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures2));
            case 16:
                return Pattern.compile("[a-zA-Z0-9+._%\\-]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
            case 17:
                return s3q0.a;
            case 18:
                return s3q0.a;
            case 19:
                return new com.vk.music.track.a();
            case 20:
                return new jwx(2, 8);
            case 21:
                return new com.vk.music.track.a();
            case 22:
                return new dhb0();
            case 23:
                return new u1r0();
            case 24:
                return rl3.y0(new p9c[]{new uc9(0), new t1l(), new lld(), new rxq(), new u1n(), new uc9(1), new q960(), new fh20(), new cf40(), new sri0(), new cbs0()});
            case 25:
                return s3q0.a;
            case 26:
                return EnumSet.noneOf(NetworkClient.ClientType.class);
            case 27:
                return new y3v();
            case 28:
                com.vk.voip.ui.a.a.getClass();
                ProximityTracker proximityTracker = com.vk.voip.ui.a.e;
                if (proximityTracker != null) {
                    return proximityTracker;
                }
                return null;
            default:
                OnlineBookingInternalComponent.a aVar = OnlineBookingInternalComponent.n;
                return new moi0();
        }
    }
}
