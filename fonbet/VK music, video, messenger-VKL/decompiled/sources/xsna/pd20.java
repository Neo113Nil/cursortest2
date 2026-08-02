package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.k7r0;
import xsna.nd20;

/* compiled from: MessagesCreateGroupChatApiCmd.kt */
/* loaded from: classes2.dex */
public final class pd20<Result> implements k7r0 {
    public static final pd20<Result> b = new pd20<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer a = Peer.a.a(jSONObject2.getLong("id"), Peer.Type.CHAT);
        EmptyList emptyList = EmptyList.b;
        return new nd20.b(a, emptyList, emptyList);
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
