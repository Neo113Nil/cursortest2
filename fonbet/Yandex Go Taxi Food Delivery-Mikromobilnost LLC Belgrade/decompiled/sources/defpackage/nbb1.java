package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class nbb1 {
    public static RoundRectShape a(float f, float f2, float f3, float f4) {
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        return new RoundRectShape(fArr, new RectF(), fArr);
    }

    public static Integer b() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }

    public static ArrayList c(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static w53 d(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject == JSONObject.NULL) {
            return null;
        }
        w53 w53Var = new w53();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null && opt != JSONObject.NULL) {
                if (opt instanceof JSONArray) {
                    opt = c((JSONArray) opt);
                } else if (opt instanceof JSONObject) {
                    opt = d((JSONObject) opt);
                }
                w53Var.put(next, opt);
            }
        }
        return w53Var;
    }
}
