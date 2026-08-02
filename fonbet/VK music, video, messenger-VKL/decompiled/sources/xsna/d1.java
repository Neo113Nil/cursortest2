package xsna;

import com.vk.browserlogin.impl.di.BrowserLoginComponentImpl;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import java.util.regex.Pattern;
import org.json.JSONObject;
import xsna.k5w;
import xsna.k840;
import xsna.kb30;
import xsna.ps30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d1 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ d1(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String obj;
        switch (this.b) {
            case 0:
                return new y1();
            case 1:
                return new ptc0();
            case 2:
                return new s290();
            case 3:
                return o25.a().c();
            case 4:
                return com.vk.movika.sdk.base.model.n.a(16.0f);
            case 5:
                qcy<Object>[] qcyVarArr = BrowserLoginComponentImpl.b;
                return new mk8();
            case 6:
                return Boolean.valueOf(MusicFeatures.AUDIO_NEW_DOWNLOADED_FILTERS.h());
            case 7:
                return g2v.c();
            case 8:
                return s3q0.a;
            case 9:
                return wjs0.a;
            case 10:
                qcy<Object>[] qcyVarArr2 = DiscoverMediaTabFragment2.C0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 11:
                qcy<Object>[] qcyVarArr3 = DiscoverSimilarFeedFragment.s0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 12:
                int i = DisplayAudioBookChaptersFragment.b0;
                return new w7k0();
            case 13:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 14:
                FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 15:
                CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().a());
            case 16:
                return new x1w0();
            case 17:
                return s3q0.a;
            case 18:
                return "#tryToRecover - with clear cache";
            case 19:
                b.d i2 = com.vk.toggle.b.A.i(ImFeatures.CHANNELS_IN_ALL_FOLDER);
                if (i2 == null) {
                    return null;
                }
                if (!i2.a) {
                    i2 = null;
                }
                if (i2 == null || (obj = i2.c.toString()) == null) {
                    return null;
                }
                JSONObject j = cqm0.j(obj);
                int optInt = j.optInt("method_flood_fix");
                boolean optBoolean = j.optBoolean("ignore_expired");
                if (optInt > 0) {
                    return new k5w.a(optInt, optBoolean);
                }
                return null;
            case 20:
                return Pattern.compile("<a\\s+[^>]*href=\"(.*?)\"[^>]*>(.*?)</a>");
            case 21:
                return kb30.a.a;
            case 22:
                return s3q0.a;
            case 23:
                return s3q0.a;
            case 24:
                return k840.a.g().b();
            case 25:
                return new ps30.c();
            case 26:
                return new r9a(new bpn0(new uw3(25)), new ida[0]);
            case 27:
                return Boolean.valueOf(MusicFeatures.AUDIO_NEW_DOWNLOADED_FILTERS.h());
            case 28:
                return Boolean.valueOf(e370.s != null && com.vk.toggle.b.A.a(SaFeatures.MULTI_INTERSTITIAL));
            default:
                FeedFeatures feedFeatures2 = FeedFeatures.FRESH_TIMER;
                feedFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures2));
        }
    }
}
