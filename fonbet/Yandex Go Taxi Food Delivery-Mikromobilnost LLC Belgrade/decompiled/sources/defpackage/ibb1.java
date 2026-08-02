package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.ui.draw.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class ibb1 {
    public static fn6 a(Canvas canvas, Context context) {
        return new fn6(canvas, context, false);
    }

    public static fn6 b(Canvas canvas, Context context, boolean z) {
        return new fn6(canvas, context, z);
    }

    public static f530 c(f530 f530Var, float f, ehr0 ehr0Var, long j, long j2, int i) {
        boolean z = false;
        if ((i & 4) != 0 && y7m.a(f, 0.0f) > 0) {
            z = true;
        }
        return (y7m.a(f, 0.0f) > 0 || z) ? f530Var.k(new d(f, ehr0Var, z, (i & 8) != 0 ? n0u.a : j, (i & 16) != 0 ? n0u.a : j2)) : f530Var;
    }

    public static final ArrayList d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                obj = e((JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                obj = d((JSONArray) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final LinkedHashMap e(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                obj = e((JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                obj = d((JSONArray) obj);
            }
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }
}
