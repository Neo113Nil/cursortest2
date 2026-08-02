package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MasksResponse.java */
/* loaded from: classes15.dex */
public final class gi10 {
    public final VKList<Mask> a;
    public final ArrayList<UserProfile> b;
    public final ArrayList<Group> c;
    public final HashMap<Integer, Long> d;

    /* compiled from: MasksResponse.java */
    public class a extends aay<UserProfile> {
        @Override // xsna.aay
        public final UserProfile a(JSONObject jSONObject) throws JSONException {
            return new UserProfile(jSONObject);
        }
    }

    /* compiled from: MasksResponse.java */
    public class b extends aay<Group> {
        @Override // xsna.aay
        public final Group a(JSONObject jSONObject) throws JSONException {
            return new Group(jSONObject);
        }
    }

    /* compiled from: MasksResponse.java */
    public class c extends aay<Mask> {
        public c() {
        }

        @Override // xsna.aay
        public final Mask a(JSONObject jSONObject) throws JSONException {
            Group group;
            UserProfile userProfile;
            UserId userId = new UserId(jSONObject.optLong("owner_id"));
            int optInt = jSONObject.optInt("id");
            gi10 gi10Var = gi10.this;
            HashMap<Integer, Long> hashMap = gi10Var.d;
            long longValue = hashMap.containsKey(Integer.valueOf(optInt)) ? hashMap.get(Integer.valueOf(optInt)).longValue() : 0L;
            ArrayList<UserProfile> arrayList = gi10Var.b;
            int i = 0;
            int i2 = 0;
            while (true) {
                group = null;
                if (i2 >= arrayList.size()) {
                    userProfile = null;
                    break;
                }
                if (arrayList.get(i2).c.equals(userId)) {
                    userProfile = arrayList.get(i2);
                    break;
                }
                i2++;
            }
            ArrayList<Group> arrayList2 = gi10Var.c;
            while (true) {
                if (i >= arrayList2.size()) {
                    break;
                }
                if (fkq0.e(arrayList2.get(i).c).equals(userId)) {
                    group = arrayList2.get(i);
                    break;
                }
                i++;
            }
            Serializer.c<Mask> cVar = Mask.CREATOR;
            return Mask.a.a(jSONObject, userProfile, group, longValue);
        }
    }

    public gi10(JSONObject jSONObject) throws JSONException {
        HashMap<Integer, Long> hashMap;
        this.b = a(jSONObject.optJSONArray("profiles"), new a());
        this.c = a(jSONObject.optJSONArray("groups"), new b());
        JSONArray optJSONArray = jSONObject.optJSONArray("counters");
        if (optJSONArray == null) {
            hashMap = new HashMap<>();
        } else {
            HashMap<Integer, Long> hashMap2 = new HashMap<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                hashMap2.put(Integer.valueOf(jSONObject2.getInt("id")), Long.valueOf(jSONObject2.getLong("clips_count")));
            }
            hashMap = hashMap2;
        }
        this.d = hashMap;
        this.a = new VKList<>(jSONObject, new c());
    }

    public static <T> ArrayList<T> a(JSONArray jSONArray, aay<T> aayVar) throws JSONException {
        if (jSONArray == null) {
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(aayVar.a(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }
}
