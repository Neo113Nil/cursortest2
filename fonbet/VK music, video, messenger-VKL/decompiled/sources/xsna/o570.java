package xsna;

import com.vk.ml.MLFeatures;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.VoipFeatures;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NoiseSuppressorMLFeatures.kt */
/* loaded from: classes7.dex */
public final class o570 {
    public static final List<MLFeatures.MLFeature> a = Collections.singletonList(MLFeatures.MLFeature.NS_PIPELINE_SPLIT);
    public static final List<MLFeatures.MLFeature> b = Collections.singletonList(MLFeatures.MLFeature.NS_PIPELINE_48K);
    public static final List<MLFeatures.MLFeature> c = Collections.singletonList(MLFeatures.MLFeature.NS_DF_TINY);

    public static List a() {
        JSONObject g;
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(VoipFeatures.ENABLE_NS_DF_TINY)) {
            return c;
        }
        b.d i = bVar.i(Features.Type.FEATURE_VOIP_NOISE_SUPPRESSION);
        return (i == null || (g = i.g()) == null) ? false : g.optBoolean("enable48k") ? b : a;
    }
}
