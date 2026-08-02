package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.masks.Mask;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MasksGetEffectsCalls.kt */
/* loaded from: classes15.dex */
public final class vh10 extends rsg0<List<? extends Mask>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("response");
        if (optJSONArray == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            Mask mask = null;
            try {
                Serializer.c<Mask> cVar = Mask.CREATOR;
                mask = Mask.a.a(jSONObject2, null, null, 0L);
            } catch (Exception unused) {
            }
            if (mask != null) {
                arrayList.add(mask);
            }
        }
        return arrayList;
    }
}
