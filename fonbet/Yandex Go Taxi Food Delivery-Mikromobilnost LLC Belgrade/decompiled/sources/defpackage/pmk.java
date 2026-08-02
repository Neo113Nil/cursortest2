package defpackage;

import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class pmk implements d4x {
    public final ArrayList a;
    public final ArrayList b;
    public final r9l c;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r4.size() < 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pmk(JSONObject jSONObject) {
        ArrayList arrayList;
        r9l r9lVar = null;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(C0553n3.g);
            arrayList = optJSONArray != null ? lfk.a(optJSONArray) : null;
            if (arrayList != null) {
            }
        } catch (JSONException e) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
            }
        }
        this.a = arrayList;
        JSONArray a = b4x.a("states", jSONObject);
        int length = a.length();
        ArrayList arrayList2 = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject optJSONObject = a.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList2.add(new nmk(optJSONObject));
                }
            } catch (JSONException e2) {
                if (ydz.a.a()) {
                    ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e2);
                }
            }
        }
        this.b = arrayList2;
        if (arrayList2.size() < 1) {
            z3k.c("states does not meet condition states.size() >= 1");
            throw null;
        }
        try {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("width");
            if (optJSONObject2 != null) {
                r9lVar = new r9l(optJSONObject2, 0);
            }
        } catch (JSONException e3) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e3);
            }
        }
        if (r9lVar == null) {
            this.c = new r9l(new JSONObject("{\"type\": \"predefined\", \"value\": \"match_parent\"}"), 0);
        } else {
            this.c = r9lVar;
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, C0553n3.g);
        tjz0Var.a(this.b, "states");
        tjz0Var.a(this.c, "width");
        return tjz0Var.a.toString();
    }
}
