package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.channels.api.Channel;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.bbj0;
import xsna.c70;

/* compiled from: VkChannelsSharingBridge.kt */
/* loaded from: classes7.dex */
public final class nju0 implements pib {
    public final b25 a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new gos0(4));

    /* compiled from: VkChannelsSharingBridge.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final long c;

        public a(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Long.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RepostUserInfo(name=");
            sb.append(this.a);
            sb.append(", avatarUrl=");
            sb.append(this.b);
            sb.append(", userId=");
            return vu5.a(')', this.c, sb);
        }
    }

    public nju0(b25 b25Var) {
        this.a = b25Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
    
        if (r1.b == true) goto L40;
     */
    @Override // xsna.pib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, Channel channel, MsgFromChannel msgFromChannel, sz30 sz30Var) {
        String str;
        a aVar;
        boolean z;
        AdminLevel adminLevel;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton;
        List<Attach> list = msgFromChannel.E;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Attachment b = wdw.b((Attach) it.next(), null, false, 6);
            if (b != null) {
                arrayList.add(b);
            }
        }
        long j = channel.b;
        Peer peer = channel.A;
        int i = msgFromChannel.d;
        String str2 = channel.d;
        String str3 = msgFromChannel.I.a;
        String zb = msgFromChannel.T.zb();
        MsgFromChannel.b bVar = msgFromChannel.I;
        String str4 = bVar.j;
        PostDonut postDonut = bVar.g;
        Action action = (postDonut == null || (placeholder = postDonut.c) == null || (linkButton = placeholder.c) == null) ? null : linkButton.c;
        ActionOpenUrl actionOpenUrl = action instanceof ActionOpenUrl ? (ActionOpenUrl) action : null;
        if (actionOpenUrl == null || (str = actionOpenUrl.c) == null) {
            str = "";
        }
        ChannelMessageAttachment channelMessageAttachment = new ChannelMessageAttachment(j, peer, i, str2, str3, zb, arrayList, str4, str, postDonut, bVar.r, channel.c);
        if (channel.p || (adminLevel = channel.u) == AdminLevel.ADMIN || adminLevel == AdminLevel.EDITOR) {
            aVar = new a(channel.d, channel.c.Db(), channel.A.b);
        } else {
            cn o = this.a.o();
            aVar = new a(o.b, o.c, o.a.b);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("attachments", channelMessageAttachment);
        bundle.putString("link", msgFromChannel.mc());
        bundle.putString("authorName", aVar.a);
        bundle.putString("authorPhotoUrl", aVar.b);
        bundle.putLong("user_id", aVar.c);
        AttachmentInfo attachmentInfo = new AttachmentInfo(49, 0L, 0L, null, bundle);
        if (channel.z == ChannelType.COMMUNITY_CHANNEL) {
            PostDonut postDonut2 = msgFromChannel.I.g;
            z = true;
            if (postDonut2 != null) {
            }
            bbj0.a.getClass();
            tbj0 a2 = bbj0.b.d.a(context);
            a2.c = attachmentInfo;
            c70.b bVar2 = new c70.b();
            c(bVar2, z, sz30Var.a);
            a2.d = bVar2.b();
            a2.c();
        }
        z = false;
        bbj0.a.getClass();
        tbj0 a22 = bbj0.b.d.a(context);
        a22.c = attachmentInfo;
        c70.b bVar22 = new c70.b();
        c(bVar22, z, sz30Var.a);
        a22.d = bVar22.b();
        a22.c();
    }

    @Override // xsna.pib
    public final void b(Context context, String str) {
        bbj0.a.getClass();
        tbj0 a2 = bbj0.b.d.a(context);
        a2.k = ba3.b() ? Integer.valueOf(dhr0.t.c(R.attr.vk_ui_text_accent_themed)) : null;
        c70.b bVar = new c70.b();
        bVar.j = str;
        c(bVar, false, false);
        a2.d = bVar.b();
        a2.c();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(c70.b bVar, boolean z, boolean z2) {
        bVar.g();
        if (z) {
            bVar.k(true);
        }
        if (z2) {
            bVar.w = 3;
        }
        bVar.f();
        bVar.a(5);
        bVar.g = true;
        bVar.c(((pbj0) this.b.getValue()).c);
        bVar.v = true;
    }
}
