package xsna;

import android.os.Trace;
import com.vk.core.telemetry.VideoOpenTelemetryComponentImpl;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import org.json.JSONObject;
import xsna.c7r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qdh0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qdh0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        boolean z = false;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return CommonMarketStat$TypeRefSource.SEARCH_GOODS;
            case 2:
                return new esl0();
            case 3:
                ComFeatures comFeatures = ComFeatures.COM_EASY_PROMOTE;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 4:
                return new c7r0.a(30);
            case 5:
                qcy<Object>[] qcyVarArr = VideoOpenTelemetryComponentImpl.f;
                if (com.vk.toggle.d.L()) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_TRACE_OTEL;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                return new tub0(fpf0.a(k1u0.class), new Annotation[0]);
            case 7:
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                Features.Type type = Features.Type.FEATURE_REEF;
                if (!bVar.a(type)) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                b.d j = bVar.j(type.getKey(), false);
                if (j != null && (g = j.g()) != null) {
                    for (String str : drm0.c0(g.optString("features"), new String[]{StringUtils.COMMA}, 0, 6)) {
                        String obj = drm0.p0(str).toString();
                        com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
                        bVar2.getClass();
                        boolean e = ndp0.e();
                        if (e) {
                            ndp0.b("ToggleManager.isFeatureEnabled " + obj);
                        }
                        try {
                            b.d j2 = bVar2.j(obj, false);
                            hashMap.put(str, Boolean.valueOf(j2 != null ? j2.a : false));
                        } finally {
                            if (e) {
                                Trace.endSection();
                            }
                        }
                    }
                }
                return hashMap;
            default:
                return s3q0.a;
        }
    }
}
