package xsna;

import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonParser.kt */
/* loaded from: classes17.dex */
public abstract class aay<T> {

    /* compiled from: JsonParser.kt */
    public static final class a {
        public static ArrayList a(JSONObject jSONObject, String str, aay aayVar) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                return null;
            }
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        Object a = aayVar.a(optJSONObject);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    } catch (Exception e) {
                        L.i(e);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
            return arrayList;
        }

        public static ArrayList b(JSONObject jSONObject, String str, aay aayVar) {
            ArrayList arrayList;
            List list;
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONArray jSONArray = optJSONArray.getJSONArray(i);
                if (jSONArray != null) {
                    arrayList = new ArrayList(jSONArray.length());
                    int length2 = jSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            arrayList.add(aayVar.a(optJSONObject));
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || (list = j5g.O0(j5g.V(arrayList))) == null) {
                    list = EmptyList.b;
                }
                arrayList2.add(list);
            }
            return arrayList2;
        }

        public static Object c(JSONObject jSONObject, String str, aay aayVar) {
            if (!jSONObject.has(str)) {
                return null;
            }
            try {
                return aayVar.a(jSONObject.getJSONObject(str));
            } catch (JSONException e) {
                L.i(e);
                return null;
            }
        }
    }

    public abstract T a(JSONObject jSONObject) throws JSONException;
}
