package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import org.json.JSONObject;
import xsna.pq8;

/* compiled from: BotsJsonSerializer.kt */
/* loaded from: classes2.dex */
public final class qq8 {
    public static pq8 a(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("type_id");
        if (optInt == 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new pq8.c(jSONObject.optInt("msg_cnv_id"), jSONObject.optInt("position_in_keyboard"), Peer.a.b(jSONObject.optLong("dialog_id")));
        }
        if (optInt == 1) {
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            return new pq8.a(jSONObject.optInt("msg_cnv_id"), jSONObject.optInt("carousel_item_position"), jSONObject.optInt("position_in_keyboard"), Peer.a.b(jSONObject.optLong("dialog_id")));
        }
        if (optInt != 2) {
            throw new IllegalArgumentException(lhg.a(optInt, "Unknown typeId "));
        }
        Serializer.c<Peer> cVar3 = Peer.CREATOR;
        return new pq8.b(jSONObject.optInt("position_in_keyboard"), Peer.a.b(jSONObject.optLong("dialog_id")));
    }
}
