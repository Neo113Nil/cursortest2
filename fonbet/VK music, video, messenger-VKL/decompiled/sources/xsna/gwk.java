package xsna;

import com.vk.superapp.api.dto.identity.WebCity;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DatabaseGetCities.java */
/* loaded from: classes14.dex */
public final class gwk extends aay {
    @Override // xsna.aay
    public final Object a(JSONObject jSONObject) throws JSONException {
        return new WebCity(jSONObject);
    }
}
