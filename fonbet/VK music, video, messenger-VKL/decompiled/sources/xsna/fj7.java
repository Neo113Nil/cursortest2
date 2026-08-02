package xsna;

import android.util.LongSparseArray;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BoardTopics.kt */
/* loaded from: classes18.dex */
public final class fj7 {
    public final VKList<ii7> a;
    public final boolean b;
    public final int c;

    public fj7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj7)) {
            return false;
        }
        fj7 fj7Var = (fj7) obj;
        return epx.f(this.a, fj7Var.a) && this.b == fj7Var.b && this.c == fj7Var.c;
    }

    public final int hashCode() {
        VKList<ii7> vKList = this.a;
        return Integer.hashCode(this.c) + qoy.b((vKList == null ? 0 : vKList.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoardTopics(topics=");
        sb.append(this.a);
        sb.append(", canCreate=");
        sb.append(this.b);
        sb.append(", order=");
        return vu5.b(sb, this.c, ')');
    }

    public /* synthetic */ fj7(int i) {
        this(0, null, false);
    }

    public fj7(int i, VKList vKList, boolean z) {
        this.a = vKList;
        this.b = z;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fj7(JSONObject jSONObject, float f, zj zjVar, ak akVar, String str) {
        this(0 == true ? 1 : 0);
        LongSparseArray longSparseArray = new LongSparseArray();
        JSONArray optJSONArray = jSONObject.optJSONArray("profiles");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                UserProfile userProfile = new UserProfile(optJSONArray.getJSONObject(i));
                longSparseArray.put(userProfile.c.b, userProfile);
            }
        }
        boolean z = z230.a;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("groups");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                UserProfile userProfile2 = new UserProfile();
                userProfile2.c = new UserId(-jSONObject2.getLong("id"));
                userProfile2.d = jSONObject2.getString("name");
                userProfile2.f = "";
                userProfile2.e = userProfile2.d + ' ' + userProfile2.f;
                userProfile2.g = jSONObject2.optString("photo_base");
                userProfile2.h = we7.q(jSONObject2, f, z);
                longSparseArray.put(userProfile2.c.b, userProfile2);
            }
        }
        this.a = new VKList<>(jSONObject, new ej7(zjVar, akVar, str, longSparseArray));
        this.b = jSONObject.getInt("can_add_topics") == 1;
        this.c = jSONObject.getInt("default_order");
    }
}
