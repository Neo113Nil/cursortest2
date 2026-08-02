package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class idl extends n15 {
    public final ArrayList x;
    public final ArrayList y;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r6.size() < 1) goto L22;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public idl(JSONObject jSONObject) {
        super(jSONObject, r0);
        ArrayList arrayList;
        int length;
        ArrayList arrayList2;
        quz quzVar = quz.c;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("columns");
            if (optJSONArray != null) {
                int length2 = optJSONArray.length();
                arrayList = new ArrayList(length2);
                for (int i = 0; i < length2; i++) {
                    try {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            arrayList.add(new ddl(optJSONObject));
                        }
                    } catch (JSONException e) {
                        quzVar.e(e);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
            }
        } catch (JSONException e2) {
            quzVar.e(e2);
            arrayList = null;
            this.x = arrayList;
            JSONArray a = b4x.a("rows", jSONObject);
            length = a.length();
            arrayList2 = new ArrayList(length);
            while (r1 < length) {
            }
            this.y = arrayList2;
            if (arrayList2.size() < 1) {
            }
        }
        this.x = arrayList;
        JSONArray a2 = b4x.a("rows", jSONObject);
        length = a2.length();
        arrayList2 = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject optJSONObject2 = a2.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    arrayList2.add(new edl(optJSONObject2));
                }
            } catch (JSONException e3) {
                quzVar.e(e3);
            }
        }
        this.y = arrayList2;
        if (arrayList2.size() < 1) {
            return;
        }
        z3k.c("rows does not meet condition rows.size() >= 1");
        throw null;
    }

    @Override // defpackage.n15
    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        String n15Var = super.toString();
        StringBuilder sb = tjz0Var.a;
        sb.append(n15Var);
        tjz0Var.a(this.x, "columns");
        tjz0Var.a(this.y, "rows");
        return sb.toString();
    }
}
