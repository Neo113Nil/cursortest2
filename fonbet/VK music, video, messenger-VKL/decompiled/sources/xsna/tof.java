package xsna;

import com.unity3d.ads.BuildConfig;
import com.vk.clips.config.viewers.api.experiments.models.ClipsRtmpLivePlaybackSettings;
import com.vk.log.L;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONObject;

/* compiled from: ClipsViewerExperimentsPlayer.kt */
/* loaded from: classes16.dex */
public final class tof {
    public static final /* synthetic */ qcy<Object>[] b;
    public final a a;

    /* compiled from: FeatureFactory.kt */
    public static final class a extends enk<ClipsRtmpLivePlaybackSettings> {
        @Override // xsna.enk
        public final ClipsRtmpLivePlaybackSettings b(b.a aVar) {
            if (aVar != null) {
                ClipsRtmpLivePlaybackSettings clipsRtmpLivePlaybackSettings = ClipsRtmpLivePlaybackSettings.c;
                boolean c = puq.c(aVar, 3);
                JSONObject a = puq.a(aVar);
                ClipsRtmpLivePlaybackSettings clipsRtmpLivePlaybackSettings2 = c ? new ClipsRtmpLivePlaybackSettings(ClipsRtmpLivePlaybackSettings.a.b("rtmp", BuildConfig.FLAVOR, a), ClipsRtmpLivePlaybackSettings.a.b("okmp", "live", a)) : ClipsRtmpLivePlaybackSettings.c;
                if (puq.c(aVar, 3)) {
                    L.p("ClipsViewerExperimentsPlayer", clipsRtmpLivePlaybackSettings2);
                }
                if (clipsRtmpLivePlaybackSettings2 != null) {
                    return clipsRtmpLivePlaybackSettings2;
                }
            }
            return ClipsRtmpLivePlaybackSettings.c;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(tof.class, "rtmpLivePlaybackSettings", "getRtmpLivePlaybackSettings()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsRtmpLivePlaybackSettings;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public tof(kuq kuqVar) {
        this.a = new a(Features.Type.FEATURE_CLIPS_PLAYBACK_LIVES_VIA_RTMP_ENABLED, kuqVar.c, kuqVar.a, false, kuqVar.b);
    }

    public final ClipsRtmpLivePlaybackSettings a() {
        return this.a.getValue(this, b[0]);
    }
}
