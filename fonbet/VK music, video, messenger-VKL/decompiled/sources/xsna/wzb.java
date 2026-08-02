package xsna;

import android.net.Uri;
import androidx.annotation.CheckResult;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.exceptions.ApiArgNotFoundException;
import com.vk.im.engine.exceptions.ImTaskExecutionException;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.chats.ChatPreview;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.g1e0;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChatsLoadPreviewCmd.kt */
/* loaded from: classes2.dex */
public final class wzb extends xl6<ChatPreview> {
    public final Uri b;
    public final boolean c;
    public final Peer d;

    /* compiled from: ChatsLoadPreviewCmd.kt */
    public static final class a {
        public static final Pair a(ProfilesSimpleInfo profilesSimpleInfo) {
            Collection values = profilesSimpleInfo.e.values();
            List H0 = j5g.H0(values, Math.min(2, values.size()));
            Collection values2 = profilesSimpleInfo.b.values();
            return new Pair(j5g.H0(values2, Math.min(4 - H0.size(), values2.size())), H0);
        }

        public static Throwable b(Throwable th) {
            Throwable cause;
            return (((th instanceof ImTaskExecutionException) || (th instanceof ApiArgNotFoundException)) && (cause = th.getCause()) != null) ? b(cause) : th;
        }
    }

    /* compiled from: ChatsLoadPreviewCmd.kt */
    public static final class b implements k7r0<ChatPreview> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            ?? r3;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("preview");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("chat_settings");
            Pair a = a.a(i1e0.b(jSONObject2));
            List list = (List) a.d();
            List list2 = (List) a.g();
            JSONArray jSONArray = jSONObject3.getJSONArray("members");
            if (jSONArray == null || jSONArray.length() == 0) {
                r3 = EmptyList.b;
            } else {
                r3 = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    long j = jSONArray.getLong(i);
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    r3.add(Peer.a.b(j));
                }
            }
            List list3 = r3;
            String string = jSONObject3.getString("title");
            JSONObject optJSONObject = jSONObject3.optJSONObject("photo");
            ImageList a2 = optJSONObject != null ? pr5.a(optJSONObject) : pr5.a;
            int i2 = jSONObject3.getInt("admin_id");
            long optLong = jSONObject3.optLong("local_id", 0L);
            boolean optBoolean = jSONObject3.optBoolean("is_group_channel");
            boolean optBoolean2 = jSONObject4.optBoolean("is_disappearing");
            boolean optBoolean3 = jSONObject4.optBoolean("is_donut");
            boolean optBoolean4 = jSONObject4.optBoolean("is_deleted_for_all");
            boolean optBoolean5 = jSONObject3.optBoolean("is_don");
            JSONObject optJSONObject2 = jSONObject3.optJSONObject("button");
            return new ChatPreview(string, a2, i2, optLong, optBoolean, optBoolean2, optBoolean3, optBoolean5, optBoolean4, optJSONObject2 != null ? new LinkButton(optJSONObject2) : null, jSONObject3.optInt("members_count"), list3, list, list2);
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public wzb(Uri uri, boolean z, Peer peer) {
        this.b = uri;
        this.c = z;
        this.d = peer;
    }

    @CheckResult
    public static ChatPreview f(ChatPreview chatPreview, w2w w2wVar, boolean z) {
        if (chatPreview.m.isEmpty()) {
            return chatPreview;
        }
        g1e0.a aVar = new g1e0.a();
        aVar.h(j5g.H0(chatPreview.m, 4));
        aVar.b = Source.ACTUAL;
        aVar.c = z;
        Pair a2 = a.a(((ProfilesInfo) w2wVar.L0(chatPreview, new d1e0(new g1e0(aVar)))).Ob());
        return new ChatPreview(chatPreview.b, chatPreview.c, chatPreview.d, chatPreview.e, chatPreview.f, chatPreview.g, chatPreview.h, chatPreview.i, chatPreview.j, chatPreview.k, chatPreview.l, chatPreview.m, (List) a2.d(), (List) a2.g());
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-chat-invite";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Throwable apiAccessDeniedException;
        boolean z = this.c;
        try {
            ij20.a aVar = new ij20.a();
            aVar.d = bz2.m();
            aVar.c = "messages.getChatPreview";
            Peer peer = this.d;
            if (peer != null) {
                aVar.f.put("peer_id", Long.valueOf(peer.b).toString());
            }
            Uri uri = this.b;
            if (uri != null) {
                aVar.b("link", epx.f(uri.getScheme(), "vk") ? uri.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build().toString() : uri.toString());
            }
            aVar.i = z;
            return f((ChatPreview) bz2.f(new ij20(aVar), new b()), w2wVar, z);
        } catch (VKApiExecutionException e) {
            int s = e.s();
            if (s == 15) {
                com.vk.metrics.eventtracking.b.a.a(e);
                apiAccessDeniedException = new ApiAccessDeniedException(e);
            } else {
                if (s != 100) {
                    throw e;
                }
                com.vk.metrics.eventtracking.b.a.a(e);
                apiAccessDeniedException = new ApiArgNotFoundException(e);
            }
            throw apiAccessDeniedException;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzb)) {
            return false;
        }
        wzb wzbVar = (wzb) obj;
        return epx.f(this.b, wzbVar.b) && this.c == wzbVar.c && epx.f(this.d, wzbVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        Uri uri = this.b;
        int b2 = qoy.b((uri != null ? uri.hashCode() : 0) * 31, 31, this.c);
        Peer peer = this.d;
        return b2 + (peer != null ? Long.hashCode(peer.b) : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatsLoadPreviewCmd(inviteLink='");
        sb.append(this.b);
        sb.append("', isAwaitNetwork=");
        sb.append(this.c);
        sb.append(" , peer=");
        return eq.a(sb, this.d, ')');
    }
}
