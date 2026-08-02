package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.PinnedMsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PinnedMsgParser.kt */
/* loaded from: classes2.dex */
public final class qoa0 {
    public static void a(NestedMsg nestedMsg, ProfilesSimpleInfo profilesSimpleInfo) {
        if (profilesSimpleInfo.isEmpty()) {
            return;
        }
        Iterator it = nestedMsg.j.iterator();
        while (it.hasNext()) {
            w04.b((Attach) it.next(), profilesSimpleInfo);
        }
        Iterator it2 = nestedMsg.k.iterator();
        while (it2.hasNext()) {
            a((NestedMsg) it2.next(), profilesSimpleInfo);
        }
    }

    public static void b(JSONObject jSONObject, f1e0 f1e0Var, List list) {
        JSONArray jSONArray;
        if (jSONObject.has("fwd_messages") && (jSONArray = jSONObject.getJSONArray("fwd_messages")) != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                NestedMsg nestedMsg = new NestedMsg();
                nestedMsg.b = NestedMsg.Type.FWD;
                nestedMsg.c = 0;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                nestedMsg.f = Peer.a.b(jSONObject2.getLong("from_id"));
                nestedMsg.m = jSONObject2.getLong("date") * 1000;
                nestedMsg.g = jSONObject2.optString("title", "");
                nestedMsg.h = jSONObject2.optString("text", "");
                try {
                    w04.F(jSONObject2, f1e0Var, nestedMsg.j);
                    f1e0Var.c(nestedMsg.f);
                    b(jSONObject2, f1e0Var, nestedMsg.k);
                    list.add(nestedMsg);
                } catch (JSONException e) {
                    throw new VKApiIllegalResponseException(e);
                }
            }
        }
    }

    public static PinnedMsg c(JSONObject jSONObject, f1e0 f1e0Var, long j) {
        BotKeyboard botKeyboard;
        PinnedMsg pinnedMsg = new PinnedMsg();
        pinnedMsg.b = j;
        pinnedMsg.c = jSONObject.has("conversation_message_id") ? jSONObject.getInt("conversation_message_id") : 0;
        pinnedMsg.m = jSONObject.has("is_unavailable") ? jSONObject.getBoolean("is_unavailable") : false;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        pinnedMsg.d = Peer.a.b(jSONObject.getLong("from_id"));
        pinnedMsg.f = jSONObject.has("title") ? jSONObject.getString("title") : "";
        pinnedMsg.g = jSONObject.has("text") ? jSONObject.getString("text") : "";
        pinnedMsg.e = jSONObject.getLong("date") * 1000;
        ArrayList arrayList = null;
        try {
            botKeyboard = yey.b(jSONObject.optJSONObject("keyboard"), pinnedMsg.d);
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            botKeyboard = null;
        }
        pinnedMsg.l = botKeyboard;
        try {
            arrayList = cdi.G(jSONObject, pinnedMsg.d);
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
        }
        pinnedMsg.k = arrayList;
        f1e0Var.c(pinnedMsg.d);
        try {
            w04.F(jSONObject, f1e0Var, pinnedMsg.i);
            b(jSONObject, f1e0Var, pinnedMsg.j);
            return pinnedMsg;
        } catch (JSONException e3) {
            throw new VKApiIllegalResponseException(e3);
        }
    }
}
