package xsna;

import android.content.Context;
import com.vk.toggle.Features;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ClipsViewerExperimentsAppStart.kt */
/* loaded from: classes.dex */
public final class pof {
    public static final /* synthetic */ qcy<Object>[] f;
    public final oof a;
    public final e18 b;
    public final mof c;
    public final nof d;
    public final bpn0 e;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(pof.class, "isCreateAvailable", "isCreateAvailable()Z", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, pof.class, "disableNavigationDot", "getDisableNavigationDot()Z", hpf0Var), ep.a(0, pof.class, "clipsFeedCacheSettings", "getClipsFeedCacheSettings()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsFeedCacheSettings;", hpf0Var), ep.a(0, pof.class, "discoverPreloadSettings", "getDiscoverPreloadSettings()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsDiscoverPreloadSettings;", hpf0Var)};
    }

    public pof(Context context, kuq kuqVar) {
        epf epfVar = kuqVar.b;
        gpf gpfVar = kuqVar.a;
        this.a = new oof(epfVar, gpfVar, context);
        this.b = kuqVar.a(Features.Type.FEATURE_CLIPS_DISABLE_NAVIGATION_DOT);
        this.c = new mof(Features.Type.FEATURE_CLIPS_TOP_CACHE, kuqVar.c, gpfVar, false, epfVar);
        this.d = new nof(Features.Type.FEATURE_CLIPS_PRELOAD_DISCOVER, kuqVar.c, gpfVar, epfVar, this);
        this.e = new bpn0(new fr4(context, 3));
    }
}
