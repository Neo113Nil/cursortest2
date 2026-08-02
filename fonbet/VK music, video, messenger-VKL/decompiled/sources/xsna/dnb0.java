package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollGradient;
import com.vk.dto.polls.PollTile;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PollBackgrounds.kt */
/* loaded from: classes15.dex */
public final class dnb0 extends rsg0<List<? extends PollBackground>> {
    public dnb0() {
        super("polls.getBackgrounds");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        PollBackground pollBackground;
        JSONArray jSONArray = jSONObject.getJSONArray("response");
        ArrayList arrayList = new ArrayList();
        j9x it = swe0.q(0, jSONArray.length()).iterator();
        while (it.d) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(it.nextInt());
            String string = jSONObject2.getString("type");
            if (epx.f(string, "gradient")) {
                Serializer.c<PollGradient> cVar = PollGradient.CREATOR;
                pollBackground = PollGradient.a.a(jSONObject2);
            } else if (epx.f(string, "tile")) {
                Serializer.c<PollTile> cVar2 = PollTile.CREATOR;
                pollBackground = PollTile.a.a(jSONObject2);
            } else {
                pollBackground = null;
            }
            if (pollBackground != null) {
                arrayList.add(pollBackground);
            }
        }
        return arrayList;
    }
}
