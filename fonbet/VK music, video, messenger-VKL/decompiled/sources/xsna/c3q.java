package xsna;

import android.text.TextUtils;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: ExecuteSetSubscriptionStatus.kt */
/* loaded from: classes14.dex */
public final class c3q extends rsg0<Integer> {

    /* compiled from: ExecuteSetSubscriptionStatus.kt */
    public static final class a {
        public static c3q a(UserId userId, String str, boolean z) {
            long j = userId.b;
            if (!TextUtils.isEmpty(str) && !fkq0.c(userId) && z) {
                c3q c3qVar = new c3q("friends.add");
                c3qVar.K("access_key", str);
                return c3qVar;
            }
            if (!TextUtils.isEmpty(str) && !fkq0.c(userId) && !z) {
                c3q c3qVar2 = new c3q("friends.delete");
                c3qVar2.K("access_key", str);
                return c3qVar2;
            }
            if (fkq0.d(userId)) {
                if (z) {
                    c3q c3qVar3 = new c3q("friends.add");
                    c3qVar3.K("access_key", str);
                    c3qVar3.D(j, "user_id");
                    return c3qVar3;
                }
                c3q c3qVar4 = new c3q("friends.delete");
                c3qVar4.K("access_key", str);
                c3qVar4.D(j, "user_id");
                return c3qVar4;
            }
            if (z) {
                c3q c3qVar5 = new c3q("groups.join");
                c3qVar5.K("access_key", str);
                c3qVar5.D(-j, "group_id");
                return c3qVar5;
            }
            c3q c3qVar6 = new c3q("groups.leave");
            c3qVar6.K("access_key", str);
            c3qVar6.D(-j, "group_id");
            return c3qVar6;
        }
    }

    public final void F0(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        K("ref", str);
        K("source", str);
    }

    public final void H0(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        K("track_code", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            return Integer.valueOf(jSONObject.getInt("response"));
        } catch (Exception unused) {
            return -1;
        }
    }
}
