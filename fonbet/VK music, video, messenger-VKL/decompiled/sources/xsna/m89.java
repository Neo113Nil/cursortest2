package xsna;

import com.vk.im.engine.models.attaches.CallParticipants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CallParticipantsParser.kt */
/* loaded from: classes2.dex */
public final class m89 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r6 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CallParticipants a(JSONObject jSONObject, f1e0 f1e0Var) {
        List list;
        if (jSONObject == null) {
            return null;
        }
        int i = jSONObject.has("count") ? jSONObject.getInt("count") : 0;
        JSONArray optJSONArray = jSONObject.optJSONArray("list");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(Long.valueOf(optJSONArray.getLong(i2)));
            }
            list = j5g.D0(cgg0.b, arrayList);
        }
        list = EmptyList.b;
        CallParticipants callParticipants = new CallParticipants(list, i);
        f1e0Var.d(j5g.H0(CallParticipants.a.a(callParticipants.b), 3));
        return callParticipants;
    }
}
