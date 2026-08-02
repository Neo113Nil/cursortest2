package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.RequestUserProfile;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.wyd0;

/* compiled from: AccountSearchContacts.kt */
/* loaded from: classes14.dex */
public final class aq extends rsg0<b> {
    public final a s;
    public final List<t7j> t;
    public final boolean u;

    /* compiled from: AccountSearchContacts.kt */
    public interface a {
        String a(int i);
    }

    /* compiled from: AccountSearchContacts.kt */
    public static final class b {
        public final List<zxq0> a;
        public final List<RequestUserProfile> b;

        public b() {
            this(0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(int i) {
            this(r1, r1);
            EmptyList emptyList = EmptyList.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<zxq0> list, List<? extends RequestUserProfile> list2) {
            this.a = list;
            this.b = list2;
        }
    }

    public aq(a aVar, List list, String str, boolean z) {
        super("account.searchContacts");
        this.s = aVar;
        this.t = list;
        this.u = z;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractList abstractList = ((t7j) it.next()).b;
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = abstractList.iterator();
            while (it2.hasNext()) {
                jSONArray2.put((String) it2.next());
            }
            jSONArray.put(jSONArray2);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (str.length() != 0) {
            jSONObject2.put("user_contact", str);
        }
        jSONObject2.put("contacts", jSONArray);
        jSONObject.put("phone", jSONObject2);
        K("contacts", jSONObject.toString());
        C(5000, "count");
        C(1, "need_mutual");
        K("fields", "online_info,career,city,country,education,verified,trending,is_friend,friend_status,can_send_friend_request,photo_base");
        K("search_only", "0");
        K("sort", "common_friends");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList;
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("found") : null;
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("user");
                RequestUserProfile requestUserProfile = new RequestUserProfile(jSONObject3);
                requestUserProfile.n0 = true;
                if (requestUserProfile.E == null) {
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("descriptions");
                    if (optJSONArray2 != null) {
                        Serializer.c<ProfileDescription> cVar = ProfileDescription.CREATOR;
                        arrayList = ProfileDescription.a.b(optJSONArray2);
                    } else {
                        arrayList = null;
                    }
                    requestUserProfile.E = arrayList;
                }
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("mutual");
                JSONObject optJSONObject3 = jSONObject3.optJSONObject("mutual");
                if (optJSONObject3 != null) {
                    optJSONObject2 = optJSONObject3;
                }
                wyd0.a c = wyd0.c(optJSONObject2);
                arrayList2.add(new zxq0(requestUserProfile, c.a, c.b));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.u) {
            HashMap hashMap = new HashMap();
            for (t7j t7jVar : this.t) {
                Iterator it = t7jVar.b.iterator();
                while (it.hasNext()) {
                    hashMap.put((String) it.next(), t7jVar);
                }
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("response");
            JSONArray optJSONArray3 = optJSONObject4 != null ? optJSONObject4.optJSONArray("other") : null;
            int length2 = optJSONArray3 != null ? optJSONArray3.length() : 0;
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject4 = optJSONArray3.getJSONObject(i2);
                String optString = jSONObject4 != null ? jSONObject4.optString("contact") : null;
                t7j t7jVar2 = (t7j) hashMap.get(optString);
                if (t7jVar2 != null) {
                    RequestUserProfile requestUserProfile2 = new RequestUserProfile();
                    requestUserProfile2.h = null;
                    requestUserProfile2.e = t7jVar2.a;
                    requestUserProfile2.n0 = true;
                    requestUserProfile2.r = optString;
                    int optInt = jSONObject4 != null ? jSONObject4.optInt("common_count") : 0;
                    if (optInt > 0) {
                        requestUserProfile2.s0 = this.s.a(optInt);
                    }
                    requestUserProfile2.E = e43.l(new ProfileDescription(requestUserProfile2.r), new ProfileDescription(requestUserProfile2.s0));
                    requestUserProfile2.p0 = true;
                    requestUserProfile2.r0 = jSONObject4 != null ? jSONObject4.optString("invite_text") : null;
                    arrayList3.add(requestUserProfile2);
                }
            }
        }
        return new b(arrayList2, arrayList3);
    }
}
