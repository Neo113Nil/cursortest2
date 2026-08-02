package xsna;

import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.ij20;
import xsna.k7r0;
import xsna.m7r0;

/* compiled from: ChatsChangeAvatarApiCmd.kt */
/* loaded from: classes2.dex */
public final class qzb extends nx2<s3q0> {
    public final Peer b;
    public final String c;
    public final Peer d;
    public final ckq<b> e = new ckq<>(new q60(1, this, qzb.class, "buildUploadPhotoCall", "buildUploadPhotoCall(Ljava/lang/String;)Lcom/vk/api/internal/HttpPostCall;", 0, 3), new a());

    /* compiled from: ChatsChangeAvatarApiCmd.kt */
    public static final class a implements k7r0<b> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return new b(jSONObject.getString("response"));
            } catch (Exception e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* compiled from: ChatsChangeAvatarApiCmd.kt */
    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }
    }

    /* compiled from: ChatsChangeAvatarApiCmd.kt */
    public static final class c {
        public final ocq0 a;

        public c(ocq0 ocq0Var) {
            this.a = ocq0Var;
        }
    }

    /* compiled from: ChatsChangeAvatarApiCmd.kt */
    public static final class d implements k7r0<c> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                return new c(new ocq0(jSONObject2.getString(ApiProtocol.KEY_UPLOAD_URL), jSONObject2.optString("fallback_upload_url", null)));
            } catch (Exception e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public qzb(Peer peer, String str, Peer peer2) {
        this.b = peer;
        this.c = str;
        this.d = peer2;
        if (peer.zb()) {
            return;
        }
        throw new IllegalStateException(("Invalid argument " + peer + ". Chat Peer required").toString());
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "photos.getChatUploadServer";
        aVar.f.put("chat_id", Long.valueOf(this.b.d).toString());
        aVar.i = false;
        b a2 = this.e.a(((c) bz2.f(new ij20(aVar), new d())).a, m7r0.a.a);
        ij20.a aVar2 = new ij20.a();
        aVar2.d = l7r0Var.a.g;
        aVar2.c = "messages.setChatPhoto";
        aVar2.b(X3.i.b, a2.a);
        Peer peer = this.d;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar2.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        aVar2.i = false;
        l7r0Var.f(new ij20(aVar2));
        return s3q0.a;
    }
}
