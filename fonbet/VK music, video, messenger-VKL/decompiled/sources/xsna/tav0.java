package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VkPaginationList.kt */
/* loaded from: classes14.dex */
public final class tav0 {
    public static final <T extends Serializer.StreamParcelable> VkPaginationList<T> a(JSONObject jSONObject, izs<? super JSONObject, ? extends T> izsVar) {
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("items")) != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                T invoke = izsVar.invoke(optJSONArray.getJSONObject(i));
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
        }
        int optInt = jSONObject != null ? jSONObject.optInt("count", 0) : 0;
        return new VkPaginationList<>(arrayList, optInt, jSONObject == null || !jSONObject.has("more") ? arrayList.size() < optInt : jSONObject.optInt("more", 0) == 1, 0, 8, null);
    }

    public static final <T extends Serializer.StreamParcelable> VkPaginationList<T> b(JSONObject jSONObject, aay<T> aayVar) {
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("items")) != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                T a = aayVar.a(optJSONArray.getJSONObject(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        int optInt = jSONObject != null ? jSONObject.optInt("count", 0) : 0;
        return new VkPaginationList<>(arrayList, optInt, jSONObject == null || !jSONObject.has("more") ? arrayList.size() < optInt : jSONObject.optInt("more", 0) == 1, 0, 8, null);
    }
}
