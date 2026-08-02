package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BestFriendsBatchEdit.kt */
/* loaded from: classes14.dex */
public final class nx6 extends xsg0 {

    /* compiled from: BestFriendsBatchEdit.kt */
    public static abstract class a {
        public final UserId a;
        public final String b;

        /* compiled from: BestFriendsBatchEdit.kt */
        /* renamed from: xsna.nx6$a$a, reason: collision with other inner class name */
        public static final class C3421a extends a {
            public C3421a(UserId userId) {
                super(userId, "add");
            }
        }

        /* compiled from: BestFriendsBatchEdit.kt */
        public static final class b extends a {
        }

        public a(UserId userId, String str) {
            this.a = userId;
            this.b = str;
        }
    }

    public nx6(ArrayList arrayList) {
        super("bestFriends.batchEdit");
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op", aVar.b);
            jSONObject.put("user_id", aVar.a.b);
            jSONArray.put(jSONObject);
        }
        K("operations", jSONArray.toString());
    }
}
