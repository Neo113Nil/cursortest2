package xsna;

import android.graphics.drawable.GradientDrawable;
import com.vk.clips.attachments.impl.di.ClipsAttachmentsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.metrics.reporters.AnrAppExitExceptions;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.search.ui.impl.catalog.GlobalSearchMarketCatalogFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.text.Regex;
import ru.ok.android.commons.http.Http;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f20 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ f20(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Integer.valueOf(iah0.a(8));
            case 1:
                return Integer.valueOf(iah0.a(10.0f));
            case 2:
                bpn0 bpn0Var = AnrAppExitExceptions.b;
                return new Regex(".*Broadcast of.*");
            case 3:
                qcy<Object>[] qcyVarArr = BookingServicesScreenFragment.S;
                return null;
            case 4:
                return new com.vk.catalog2.common.dto.api.style.a();
            case 5:
                qcy<Object>[] qcyVarArr2 = ClipsAttachmentsComponentImpl.f;
                return new qne();
            case 6:
                return new io.reactivex.rxjava3.disposables.g();
            case 7:
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return new m0x();
            case 9:
                return s3q0.a;
            case 10:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 11:
                return rl3.y0(new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome"});
            case 12:
                FeedFeatures feedFeatures = FeedFeatures.CLEAR_STACK_INACTIVE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 13:
                return new GlobalSearchMarketCatalogFragment.a(GlobalSearchMarketCatalogFragment.class, null, null).f();
            case 14:
                return new jhv();
            case 15:
                return androidx.compose.runtime.k.b(Boolean.FALSE);
            case 16:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 17:
                qcy<Object>[] qcyVarArr4 = GameUnavailableFragment.W;
                return new re3();
            case 18:
                return GroupPrivacy.h();
            case 19:
                VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 20:
                return new Regex("^vk\\.(cc|link)");
            case 21:
                return Boolean.valueOf(fxc0.B().J().w());
            case 22:
                return new ArrayList(10);
            case 23:
                return TimeZone.getDefault();
            case 24:
                return new pc40();
            case 25:
                qcy<Object>[] qcyVarArr5 = NewsfeedCustomFragment2.r0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 26:
                return new h170();
            case 27:
                return new q73(new ykg());
            case 28:
                HashMap hashMap = new HashMap();
                hq.c(104, hashMap, "wide", 156, "wide_1.5x");
                hq.c(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, hashMap, "wide_2x", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, "wide_3x");
                hashMap.put(Integer.valueOf(Http.StatusCode.RANGE_NOT_SATISFIABLE), "wide_4x");
                return hashMap;
            default:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setGradientType(1);
                gradientDrawable.setGradientCenter(0.5f, 1.0f);
                return gradientDrawable;
        }
    }
}
