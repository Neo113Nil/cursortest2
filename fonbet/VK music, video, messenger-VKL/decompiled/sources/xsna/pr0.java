package xsna;

import android.content.IntentFilter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.clips.download.impl.di.ClipsDownloadComponentImpl;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.attaches.CarouselRatio;
import com.vk.dto.common.id.UserId;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.channelcreation.impl.di.ChannelCreationInternalDiComponent;
import com.vk.im.engine.models.groups.GroupType;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.posting.additional_settings.presentation.base.fragment.AdditionalSettingsFragment;
import com.vk.onboardingpromo.impl.data.OnboardingPromoConfig;
import com.vk.pushes.PushComponent;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.api.id.CallId;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import xsna.ylg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pr0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pr0(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (((xsna.b25) r3.getValue()).b() == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        JSONObject g;
        JSONObject g2;
        String jSONObject;
        Object failure;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AdditionalSettingsFragment.U;
                return f870.v(InternalVkMiniApps.ORD.h());
            case 1:
                return new p2m();
            case 2:
                return Boolean.valueOf(e370.s != null && com.vk.toggle.b.A.a(SaFeatures.MULTI_INTERSTITIAL));
            case 3:
                return new CallId(ConversationFactory.generateConversationId());
            case 4:
                qcy<Object>[] qcyVarArr2 = ChannelCreationInternalDiComponent.j;
                return asu0.a;
            case 5:
                f9w f9wVar = xyb.C;
                return "loadMore: alreadyLoading";
            case 6:
                return new oqc();
            case 7:
                qcy<Object>[] qcyVarArr3 = ClipsDownloadComponentImpl.c;
                return new trd();
            case 8:
                qcy<Object>[] qcyVarArr4 = ClipsInterestsComponentImpl.o;
                return new amf();
            case 9:
                return ((PushComponent) ((k7m) m7m.f(new ylg.a())).a(fpf0.a(PushComponent.class))).sc();
            case 10:
                return EmptyList.b;
            case 11:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 12:
                return new rru(10);
            case 13:
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return new CarouselRatio(f, f, 3, objArr == true ? 1 : 0);
            case 14:
                int i = GalleryFragmentImpl.R0;
                return s3q0.a;
            case 15:
                int i2 = GamesCatalogFragment.i0;
                Object obj = uca.a;
                b.d i3 = com.vk.toggle.b.A.i(SaFeatures.SA_APP_VIEW_PART_RECS);
                int i4 = 50;
                if (i3 != null && (g = i3.g()) != null) {
                    i4 = g.optInt("view_percentage", 50);
                }
                return Float.valueOf(i35.k(i4 / 100.0f, 2));
            case 16:
                return GroupType.h();
            case 17:
                int i5 = HomeFragment2.x0;
                return new ec60();
            case 18:
                return Pattern.compile("(#[\\d\\w]{2,})(?:@([-_a-z\\d.]{2,}))?", 66);
            case 19:
                return s3q0.a;
            case 20:
                vn20 vn20Var = vn20.a;
                wh50 wh50Var = vn20.l;
                ((zak0) wh50Var).setValue(Boolean.valueOf(true ^ ((Boolean) ((zak0) wh50Var).getValue()).booleanValue()));
                return s3q0.a;
            case 21:
                return Boolean.valueOf(MusicFeatures.AUTO_DOWNLOAD_GENERAL_SECTION_BANNER.h());
            case 22:
                return new llf0();
            case 23:
                return new e260();
            case 24:
                return s3q0.a;
            case 25:
                VideoFeatures videoFeatures = VideoFeatures.ONBOARDING_PROMO_ANON;
                videoFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(videoFeatures) && BuildInfo.q()) {
                    bpn0 bpn0Var = o25.a;
                    if (bpn0Var == null) {
                        bpn0Var = null;
                    }
                    break;
                }
                videoFeatures = VideoFeatures.ONBOARDING_PROMO;
                b.d i6 = bVar.i(videoFeatures);
                if (i6 == null || (g2 = i6.g()) == null || (jSONObject = g2.toString()) == null) {
                    return null;
                }
                try {
                    failure = (OnboardingPromoConfig) GsonHolder.a().fromJson(jSONObject, OnboardingPromoConfig.class);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    L.e(a, m5k.b(a, new StringBuilder("Can't parse config: ")));
                }
                return (OnboardingPromoConfig) (failure instanceof Result.Failure ? null : failure);
            case 26:
                return new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            case 27:
                return UserId.d;
            case 28:
                int i7 = PostFragment.S0;
                return new j2c0();
            default:
                ComFeatures comFeatures2 = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
                comFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures2));
        }
    }

    public /* synthetic */ pr0(xg80 xg80Var) {
        this.b = 25;
    }
}
