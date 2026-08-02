package defpackage;

import com.yandex.div.state.db.StateEntry;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nmk implements d4x {
    public final x3k a;
    public final ArrayList b;
    public final int c;

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nmk(JSONObject jSONObject) {
        x3k x3kVar;
        int length;
        ArrayList arrayList;
        int i;
        JSONObject optJSONObject;
        quz quzVar = quz.c;
        try {
            optJSONObject = jSONObject.optJSONObject("action");
        } catch (JSONException e) {
            quzVar.e(e);
        }
        if (optJSONObject != null) {
            x3kVar = new x3k(optJSONObject, quzVar);
            this.a = x3kVar;
            JSONArray a = b4x.a("blocks", jSONObject);
            length = a.length();
            arrayList = new ArrayList(length);
            for (i = 0; i < length; i++) {
                try {
                    JSONObject optJSONObject2 = a.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        arrayList.add(new lmk(optJSONObject2));
                    }
                } catch (JSONException e2) {
                    quzVar.e(e2);
                }
            }
            this.b = arrayList;
            if (arrayList.size() < 1) {
                this.c = b4x.h(StateEntry.COLUMN_STATE_ID, jSONObject).intValue();
                return;
            } else {
                z3k.c("blocks does not meet condition blocks.size() >= 1");
                throw null;
            }
        }
        x3kVar = null;
        this.a = x3kVar;
        JSONArray a2 = b4x.a("blocks", jSONObject);
        length = a2.length();
        arrayList = new ArrayList(length);
        while (i < length) {
        }
        this.b = arrayList;
        if (arrayList.size() < 1) {
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "action");
        tjz0Var.a(this.b, "blocks");
        tjz0Var.a(Integer.valueOf(this.c), "stateId");
        return tjz0Var.a.toString();
    }
}
