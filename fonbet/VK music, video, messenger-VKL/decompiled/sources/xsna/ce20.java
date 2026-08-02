package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MessagesEditChatApiCmd.kt */
/* loaded from: classes2.dex */
public final class ce20 extends nx2<s3q0> {
    public final Peer b;
    public final String c;
    public final ChatPermissions d;
    public final Boolean e;
    public final Boolean f;
    public final boolean g;
    public final Peer h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;

    public ce20(Peer peer, String str, ChatPermissions chatPermissions, Boolean bool, Boolean bool2, boolean z, Peer peer2, Boolean bool3, Boolean bool4, Boolean bool5, int i) {
        str = (i & 2) != 0 ? null : str;
        chatPermissions = (i & 4) != 0 ? null : chatPermissions;
        bool = (i & 8) != 0 ? null : bool;
        bool2 = (i & 16) != 0 ? null : bool2;
        if ((i & 64) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer2 = Peer.Unknown.e;
        }
        bool3 = (i & 128) != 0 ? null : bool3;
        bool4 = (i & 256) != 0 ? null : bool4;
        bool5 = (i & 512) != 0 ? null : bool5;
        this.b = peer;
        this.c = str;
        this.d = chatPermissions;
        this.e = bool;
        this.f = bool2;
        this.g = z;
        this.h = peer2;
        this.i = bool3;
        this.j = bool4;
        this.k = bool5;
        if (!peer.zb()) {
            throw new IllegalStateException(yq.b(peer, "MessagesEditChatApiCmd available only for chat! Called for ").toString());
        }
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        String str;
        int i = (int) this.b.d;
        ChatPermissions chatPermissions = this.d;
        if (chatPermissions != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("invite", chatPermissions.b);
            jSONObject.putOpt("change_info", chatPermissions.c);
            jSONObject.putOpt("change_pin", chatPermissions.d);
            jSONObject.putOpt("use_mass_mentions", chatPermissions.e);
            jSONObject.putOpt("change_admins", chatPermissions.h);
            jSONObject.putOpt("see_invite_link", chatPermissions.f);
            jSONObject.putOpt(NotificationCompat.CATEGORY_CALL, chatPermissions.g);
            jSONObject.putOpt("change_style", chatPermissions.i);
            str = jSONObject.toString();
        } else {
            str = null;
        }
        Peer peer = this.h;
        peer.getClass();
        UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.editChat", new eq0(19), new k73(20));
        tfxVar.f(i, 0, 100000000, "chat_id");
        String str2 = this.c;
        if (str2 != null) {
            tfx.o(tfxVar, "title", str2, 0, 0, 12);
        }
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        Boolean bool = this.j;
        if (bool != null) {
            tfxVar.j("disable_service_messages", bool.booleanValue());
        }
        Boolean bool2 = this.e;
        if (bool2 != null) {
            tfxVar.j("is_service", bool2.booleanValue());
        }
        Boolean bool3 = this.k;
        if (bool3 != null) {
            tfxVar.j("disable_forwarding", bool3.booleanValue());
        }
        if (str != null) {
            tfx.o(tfxVar, SignalingProtocol.KEY_PERMISSIONS, str, 0, 0, 12);
        }
        Boolean bool4 = this.f;
        if (bool4 != null) {
            tfxVar.j("is_disable_writing", bool4.booleanValue());
        }
        Boolean bool5 = this.i;
        if (bool5 != null) {
            tfxVar.j("is_disable_stickers_popup_autoplay", bool5.booleanValue());
        }
        bz2.l(tfxVar, this.g);
        return s3q0.a;
    }
}
