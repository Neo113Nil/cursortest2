package xsna;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.internal.zzap;
import com.ironsource.X3;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class cyz0 extends w201 {
    public final /* synthetic */ MediaLoadRequestData d;
    public final /* synthetic */ lvf0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyz0(lvf0 lvf0Var, MediaLoadRequestData mediaLoadRequestData) {
        super(lvf0Var, false);
        this.d = mediaLoadRequestData;
        this.e = lvf0Var;
    }

    @Override // xsna.w201
    public final void a() throws zzap {
        zyz0 zyz0Var = this.e.c;
        nzz0 b = b();
        zyz0Var.getClass();
        MediaLoadRequestData mediaLoadRequestData = this.d;
        MediaInfo mediaInfo = mediaLoadRequestData.b;
        MediaQueueData mediaQueueData = mediaLoadRequestData.c;
        if (mediaInfo == null && mediaQueueData == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo2 = mediaLoadRequestData.b;
            if (mediaInfo2 != null) {
                jSONObject.put(X3.i.I0, mediaInfo2.k());
            }
            if (mediaQueueData != null) {
                jSONObject.put("queueData", mediaQueueData.i());
            }
            jSONObject.putOpt("autoplay", mediaLoadRequestData.d);
            long j = mediaLoadRequestData.e;
            if (j != -1) {
                Pattern pattern = o0a.a;
                jSONObject.put("currentTime", j / 1000.0d);
            }
            jSONObject.put("playbackRate", mediaLoadRequestData.f);
            jSONObject.putOpt("credentials", mediaLoadRequestData.j);
            jSONObject.putOpt("credentialsType", mediaLoadRequestData.k);
            jSONObject.putOpt("atvCredentials", mediaLoadRequestData.l);
            jSONObject.putOpt("atvCredentialsType", mediaLoadRequestData.m);
            long[] jArr = mediaLoadRequestData.g;
            if (jArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jArr.length; i++) {
                    jSONArray.put(i, jArr[i]);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            jSONObject.putOpt("customData", mediaLoadRequestData.i);
            jSONObject.put("requestId", mediaLoadRequestData.n);
        } catch (JSONException e) {
            o100 o100Var = MediaLoadRequestData.o;
            Log.e(o100Var.a, o100Var.c("Error transforming MediaLoadRequestData into JSONObject", e));
            jSONObject = new JSONObject();
        }
        long c = zyz0Var.c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "LOAD");
        } catch (JSONException unused) {
        }
        zyz0Var.b(c, jSONObject.toString());
        zyz0Var.j.a(c, b);
    }
}
