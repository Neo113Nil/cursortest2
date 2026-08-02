package yads;

import com.ironsource.O6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.j8y;

/* loaded from: classes10.dex */
public final class jr1 implements er2 {
    public final i92 a;
    public final js1 b;

    public /* synthetic */ jr1() {
        this(new j92(), new js1());
    }

    @Override // yads.er2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ir1 a(xq2 xq2Var) {
        String a = ((j92) this.a).a(xq2Var);
        if (a == null || a.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a);
            try {
                j8y j8yVar = je1.a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                MapBuilder mapBuilder = new MapBuilder();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    mapBuilder.put(next, jSONObject2.getString(next));
                }
                MapBuilder h = mapBuilder.h();
                if (h.isEmpty()) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray(O6.E1);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    rr1 a2 = this.b.a(jSONArray.getJSONObject(i));
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new ir1(arrayList, h);
            } catch (JSONException e) {
                throw new JSONException(e.getMessage());
            }
        } catch (JSONException unused) {
            return null;
        }
    }

    public jr1(i92 i92Var, js1 js1Var) {
        this.a = i92Var;
        this.b = js1Var;
    }
}
