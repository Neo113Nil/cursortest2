package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AccountGetPrivacySettings.java */
/* loaded from: classes14.dex */
public final class io extends rsg0<ArrayList<ked0>> {
    public final boolean s;

    public io(boolean z) {
        this(null, z, true, false);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray jSONArray = jSONObject2.getJSONArray("sections");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            ked0 ked0Var = new ked0();
            ked0Var.b = new ArrayList<>();
            jSONObject3.getString("title");
            String string = jSONObject3.getString("name");
            ked0Var.a = string;
            arrayList.add(ked0Var);
            hashMap.put(string, ked0Var);
        }
        JSONArray jSONArray2 = jSONObject2.getJSONArray("settings");
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            PrivacySetting privacySetting = new PrivacySetting(jSONArray2.getJSONObject(i2));
            if (this.s || !privacySetting.b.equals("stories_replies")) {
                if (privacySetting.b.equals("stories_exclude")) {
                    privacySetting.d = "stories";
                }
                if (hashMap.containsKey(privacySetting.d)) {
                    ((ked0) hashMap.get(privacySetting.d)).b.add(privacySetting);
                } else {
                    L.l("No section with key " + privacySetting.d);
                }
            }
        }
        return arrayList;
    }

    public io(@Nullable List<String> list, boolean z, boolean z2, boolean z3) {
        super("account.getPrivacySettings");
        this.s = z;
        if (list != null && !list.isEmpty()) {
            K("privacy_keys", TextUtils.join(StringUtils.COMMA, list));
        }
        K("need_default", z2 ? "1" : "0");
        K("extend_friends_lists", z3 ? "1" : "0");
    }
}
