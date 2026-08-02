package xsna;

import android.os.Handler;
import android.os.Looper;
import com.github.luben.zstd.ZstdInputStreamNoFinalizer;
import com.github.luben.zstd.ZstdOutputStreamNoFinalizer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.core.preference.Preference;
import com.vk.dto.newsfeed.discover.DiscoverCategoryType;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.metrics.eventtracking.Event;
import com.vk.posting.presentation.root.PickerRootFragment;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vk.superapp.core.js.bridge.impl.di.JsCoreDelegateComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import xsna.aof0;
import xsna.k840;
import xsna.nyd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pr6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pr6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        switch (this.b) {
            case 0:
                int i = qr6.q;
                return "UPLOAD_TRACE convert: converting simple format";
            case 1:
                return new v8l0(new zq70(), new u8l0());
            case 2:
                b.d i2 = com.vk.toggle.b.A.i(SaFeatures.SA_APP_VIEW_PART_RECS);
                int i3 = 50;
                if (i2 != null && (g = i2.g()) != null) {
                    i3 = g.optInt("view_percentage", 50);
                }
                return Integer.valueOf(i3);
            case 3:
                return s3q0.a;
            case 4:
                return new ots();
            case 5:
                return new ngj0();
            case 6:
                throw new IllegalStateException("You should provide ClipsUploadIcons with CompositionLocalProvider");
            case 7:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_VISIBILITY;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 8:
                return s3q0.a;
            case 9:
                int recommendedCOutSize = (int) ZstdOutputStreamNoFinalizer.recommendedCOutSize();
                int recommendedDInSize = (int) ZstdInputStreamNoFinalizer.recommendedDInSize();
                if (recommendedCOutSize < recommendedDInSize) {
                    recommendedCOutSize = recommendedDInSize;
                }
                int recommendedDOutSize = (int) ZstdInputStreamNoFinalizer.recommendedDOutSize();
                if (recommendedCOutSize < recommendedDOutSize) {
                    recommendedCOutSize = recommendedDOutSize;
                }
                return Integer.valueOf(recommendedCOutSize);
            case 10:
                return new DiscoverId("discover_media", 0, DiscoverCategoryType.DISCOVER_MEDIA, y8g0.e(R.string.newsfeed_for_you_stub), false, -1L, -1L);
            case 11:
                return new Handler(Looper.getMainLooper());
            case 12:
                return new laq(28, TimeUnit.MILLISECONDS.toMillis(500L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, TimeUnit.SECONDS.toMillis(60L));
            case 13:
                return s3q0.a;
            case 14:
                return new io.reactivex.rxjava3.disposables.b();
            case 15:
                return (LinksGeneratorComponent) ((k7m) m7m.f(y8w.b)).mo408a(fpf0.a(LinksGeneratorComponent.class));
            case 16:
                qcy<Object>[] qcyVarArr = JsCoreDelegateComponentImpl.b;
                return new l3y();
            case 17:
                iyk0 iyk0Var = uvz.a;
                return fdi.d;
            case 18:
                return s3q0.a;
            case 19:
                return k840.a.g().b();
            case 20:
                return Preference.f("music_search");
            case 21:
                el3 el3Var = Event.b;
                return new Event.a();
            case 22:
                FeedFeatures feedFeatures = FeedFeatures.FEED_DS_TOOLTIP;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 23:
                return new p6i();
            case 24:
                return s3q0.a;
            case 25:
                int i4 = PickerRootFragment.W;
                return new fjl();
            case 26:
                PlaylistScreenFragmentInternalComponent.a aVar = PlaylistScreenFragmentInternalComponent.x;
                bpn0 bpn0Var = fxc0.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                return (g7s0) bpn0Var.getValue();
            case 27:
                int i5 = ProfileFabView.r;
                return s3q0.a;
            case 28:
                return new nyd0.g();
            default:
                return new aof0.a.C2558a();
        }
    }
}
