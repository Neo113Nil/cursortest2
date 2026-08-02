package xsna;

import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.srt;

/* compiled from: GetGeoNews.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class trt extends FunctionReferenceImpl implements izs<JSONObject, srt.a> {
    @Override // xsna.izs
    public final srt.a invoke(JSONObject jSONObject) {
        ((srt) this.receiver).getClass();
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        ArrayList arrayList = new ArrayList();
        com.vk.dto.newsfeed.a.b(jSONObject2, null, arrayList, null, 8);
        return new srt.a(jSONObject2.optString("next_from"), arrayList);
    }
}
