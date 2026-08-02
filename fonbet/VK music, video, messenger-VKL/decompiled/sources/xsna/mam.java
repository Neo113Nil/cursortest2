package xsna;

import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.lam;

/* compiled from: DialogBackgroundModel.kt */
/* loaded from: classes2.dex */
public final class mam {
    public static final lam.a a(String str) {
        lam.a.b bVar;
        lam.a.b.d dVar;
        lam.a.b.C3244a c3244a;
        JSONObject j = cqm0.j(str);
        JSONObject optJSONObject = j.optJSONObject("raster");
        lam.a.C3243a c3243a = optJSONObject != null ? new lam.a.C3243a(optJSONObject.getString("image"), optJSONObject.getInt("width"), optJSONObject.getInt("height")) : null;
        JSONObject optJSONObject2 = j.optJSONObject("vector");
        if (optJSONObject2 != null) {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("svg");
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (optJSONObject3 != null) {
                String string = optJSONObject3.getString(X3.i.b);
                int i = optJSONObject3.getInt("width");
                int i2 = optJSONObject3.getInt("height");
                Float u = f370.u("opacity", optJSONObject3);
                float floatValue = u != null ? u.floatValue() : 0.0f;
                Boolean q = f370.q(optJSONObject3, "is_overlay");
                dVar = new lam.a.b.d(string, i, i2, floatValue, q != null ? q.booleanValue() : true);
            } else {
                dVar = null;
            }
            ListBuilder e = e43.e();
            JSONArray optJSONArray = optJSONObject2.optJSONArray("color_ellipses");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i3);
                    Float u2 = f370.u("x", jSONObject);
                    float floatValue2 = u2 != null ? u2.floatValue() : 0.0f;
                    Float u3 = f370.u("y", jSONObject);
                    float floatValue3 = u3 != null ? u3.floatValue() : 0.0f;
                    String string2 = jSONObject.getString("color");
                    Float u4 = f370.u("radiusX", jSONObject);
                    float floatValue4 = u4 != null ? u4.floatValue() : 0.0f;
                    Float u5 = f370.u("radiusY", jSONObject);
                    e.add(new lam.a.b.C3245b(floatValue2, floatValue3, string2, floatValue4, u5 != null ? u5.floatValue() : 0.0f));
                }
            }
            ListBuilder g = e.g();
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("gradient");
            lam.a.b.c cVar = optJSONObject4 != null ? new lam.a.b.c(f370.O(optJSONObject4.getJSONArray("colors")), optJSONObject4.getInt("angle")) : null;
            JSONObject optJSONObject5 = optJSONObject2.optJSONObject("blur");
            if (optJSONObject5 != null) {
                String string3 = optJSONObject5.getString("color");
                Float u6 = f370.u("opacity", optJSONObject5);
                if (u6 != null) {
                    f = u6.floatValue();
                }
                c3244a = new lam.a.b.C3244a(string3, f, optJSONObject5.getInt("radius"));
            } else {
                c3244a = null;
            }
            bVar = new lam.a.b(dVar, cVar, c3244a, g);
        } else {
            bVar = null;
        }
        return new lam.a(bVar, c3243a);
    }

    public static final JSONObject b(lam.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        lam.a.C3243a c3243a = aVar.b;
        JSONObject jSONObject4 = null;
        if (c3243a != null) {
            jSONObject = new JSONObject();
            jSONObject.put("image", c3243a.a);
            jSONObject.put("width", c3243a.b);
            jSONObject.put("height", c3243a.c);
        } else {
            jSONObject = null;
        }
        lam.a.b bVar = aVar.a;
        if (bVar != null) {
            JSONObject jSONObject5 = new JSONObject();
            lam.a.b.d dVar = bVar.a;
            if (dVar != null) {
                jSONObject2 = new JSONObject();
                jSONObject2.put(X3.i.b, dVar.a);
                jSONObject2.put("width", dVar.b);
                jSONObject2.put("height", dVar.c);
                jSONObject2.put("opacity", Float.valueOf(dVar.d));
                jSONObject2.put("is_overlay", dVar.e);
            } else {
                jSONObject2 = null;
            }
            jSONObject5.put("svg", jSONObject2);
            lam.a.b.c cVar = bVar.b;
            if (cVar != null) {
                jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<T> it = cVar.a.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject3.put("colors", jSONArray);
                jSONObject3.put("angle", cVar.b);
            } else {
                jSONObject3 = null;
            }
            jSONObject5.put("gradient", jSONObject3);
            lam.a.b.C3244a c3244a = bVar.c;
            if (c3244a != null) {
                jSONObject4 = new JSONObject();
                jSONObject4.put("color", c3244a.a);
                jSONObject4.put("opacity", Float.valueOf(c3244a.b));
                jSONObject4.put("radius", c3244a.c);
            }
            jSONObject5.put("blur", jSONObject4);
            JSONArray jSONArray2 = new JSONArray();
            List<lam.a.b.C3245b> list = bVar.d;
            if (list != null) {
                for (lam.a.b.C3245b c3245b : list) {
                    c3245b.getClass();
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("x", Float.valueOf(c3245b.a));
                    jSONObject6.put("y", Float.valueOf(c3245b.b));
                    jSONObject6.put("color", c3245b.c);
                    jSONObject6.put("radiusX", Float.valueOf(c3245b.d));
                    jSONObject6.put("radiusY", Float.valueOf(c3245b.e));
                    jSONArray2.put(jSONObject6);
                }
            }
            s3q0 s3q0Var = s3q0.a;
            jSONObject5.put("color_ellipses", jSONArray2);
            jSONObject4 = jSONObject5;
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("raster", jSONObject);
        jSONObject7.put("vector", jSONObject4);
        return jSONObject7;
    }
}
