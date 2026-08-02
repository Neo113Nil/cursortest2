package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.pushes.NotificationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InAppMsgPushSettingsHelper.kt */
/* loaded from: classes17.dex */
public final class vqw {
    public static List a(String str) {
        JSONArray jSONArray;
        ArrayList arrayList = null;
        if (drm0.N(str)) {
            str = null;
        }
        try {
            jSONArray = new JSONArray(str);
        } catch (Throwable unused) {
            jSONArray = null;
        }
        if (jSONArray != null) {
            arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new uqw(jSONObject.optBoolean("isPrivateMessagesEnabled"), new UserId(jSONObject.optLong("ownerId")), jSONObject.optBoolean("isChatMessagesEnabled")));
            }
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }

    public static String b(List list) {
        uqw uqwVar;
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            UserId userId = new UserId(((Number) it.next()).longValue());
            if (BuildInfo.t()) {
                aaw.b.getClass();
                if (aaw.d(userId).getBoolean("is_migration_done", false)) {
                    uqwVar = new uqw(aaw.b(NotificationUtils.Type.PrivateMessages, userId), userId, aaw.b(NotificationUtils.Type.ChatMessages, userId));
                    arrayList.add(uqwVar);
                }
            }
            uqwVar = new uqw(true, userId, true);
            arrayList.add(uqwVar);
        }
        return kvf.a(arrayList).toString();
    }
}
