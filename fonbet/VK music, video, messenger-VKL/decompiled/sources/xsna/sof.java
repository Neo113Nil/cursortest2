package xsna;

import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.SoccomFeatures;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONObject;

/* compiled from: ClipsViewerExperimentsNewsFeed.kt */
/* loaded from: classes16.dex */
public final class sof {
    public static final /* synthetic */ qcy<Object>[] e;
    public final a a;
    public final e18 b;
    public final b c;
    public final e18 d;

    /* compiled from: FeatureFactory.kt */
    public static final class a extends enk<zme> {
        @Override // xsna.enk
        public final zme b(b.a aVar) {
            if (aVar != null) {
                boolean c = puq.c(aVar, 3);
                JSONObject a = puq.a(aVar);
                if (c && a != null) {
                    return new zme(swe0.g(a.optInt("initial_page_size", 3), 1, 15), swe0.g(a.optInt("next_page_size", 10), 1, 15));
                }
                if (c) {
                    JSONObject jSONObject = new JSONObject();
                    return new zme(swe0.g(jSONObject.optInt("initial_page_size", 3), 1, 15), swe0.g(jSONObject.optInt("next_page_size", 10), 1, 15));
                }
            }
            return zme.c;
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class b extends enk<yuf> {
        @Override // xsna.enk
        public final yuf b(b.a aVar) {
            JSONObject a;
            if (aVar == null || (a = puq.a(aVar)) == null) {
                return yuf.b;
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = a.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = a.opt(next);
                    if (opt != null) {
                        hashMap.put(next, opt);
                    }
                }
            }
            return new yuf(hashMap);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(sof.class, "newsfeedBlockPagingSettings", "getNewsfeedBlockPagingSettings()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsNewsfeedBlockPagingSettings;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, sof.class, "clipsTabletDisabled", "getClipsTabletDisabled()Z", hpf0Var), ep.a(0, sof.class, "clipsYandexAdParamsConfig", "getClipsYandexAdParamsConfig()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsYandexAdParamsConfig;", hpf0Var), ep.a(0, sof.class, "clipsShopsBadgeEnabled", "getClipsShopsBadgeEnabled()Z", hpf0Var)};
    }

    public sof(kuq kuqVar) {
        Features.Type type = Features.Type.FEATURE_CLIPS_NEWSFEED_BLOCK_PAGING_SETTINGS;
        izs<b.a, b.a> izsVar = kuqVar.c;
        gpf gpfVar = kuqVar.a;
        epf epfVar = kuqVar.b;
        this.a = new a(type, izsVar, gpfVar, false, epfVar);
        this.b = kuqVar.a(Features.Type.FEATURE_CLIPS_TABLETS_DISABLED);
        this.c = new b(ClipsFeatures.CLIPS_YANDEX_AD_PARAMS, kuqVar.c, gpfVar, false, epfVar);
        this.d = kuqVar.a(SoccomFeatures.CLIPS_SHOPS_BADGE);
    }

    public final boolean a() {
        return this.d.getValue(this, e[3]).booleanValue();
    }

    public final boolean b() {
        return this.b.getValue(this, e[1]).booleanValue();
    }

    public final yuf c() {
        return this.c.getValue(this, e[2]);
    }

    public final zme d() {
        return this.a.getValue(this, e[0]);
    }
}
