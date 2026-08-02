package xsna;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.media.utils.RateRange;
import ru.ok.media.utils.VideoSize;
import ru.ok.proto.AudioAdaptationConfig;
import ru.ok.proto.AudioParams;
import ru.ok.proto.BitrateConfiguration;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: PublisherSettings.kt */
/* loaded from: classes3.dex */
public final class kfe0 {
    public static void a(AudioAdaptationConfig.Builder builder, JSONObject jSONObject) {
        builder.addEntry(new AudioAdaptationConfig.Entry(new RateRange(jSONObject.getLong(UcumUtils.UCUM_MINUTES), jSONObject.getLong(InneractiveMediationNameConsts.MAX)), new AudioParams(jSONObject.getInt("sr"), jSONObject.getInt(TtmlNode.TAG_BR))));
    }

    public static void b(BitrateConfiguration.Builder builder, JSONArray jSONArray, VideoSize videoSize) {
        if (jSONArray != null) {
            int optInt = jSONArray.optInt(0, 0);
            int optInt2 = jSONArray.optInt(1, 0);
            if (optInt == 0 && optInt2 == 0) {
                return;
            }
            builder.setBitrateForVideoSize(videoSize, optInt, optInt2);
        }
    }
}
