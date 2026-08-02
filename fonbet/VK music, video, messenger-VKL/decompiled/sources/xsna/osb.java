package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: ChatLoadInviteLinkCmd.kt */
/* loaded from: classes2.dex */
public final class osb extends xl6<msx> {
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final boolean e = true;
    public final String f = "qsb";

    public osb(Peer peer, boolean z, boolean z2) {
        this.b = peer;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-chat-invite";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        int i;
        Dialog dialog = (Dialog) ((wpp) w2wVar.J0(this, new tqm(new sqm(this.b, Source.ACTUAL, this.e, this.f, 16))).await()).c.get(Long.valueOf(this.b.b));
        Peer Q0 = w2wVar.Q0();
        if (this.c) {
            w2wVar.getConfig().getClass();
            i = 250;
        } else {
            i = 0;
        }
        String str = (String) bz2.c(new cf20(this.b, this.d, this.e, Q0, i), null);
        ChatSettings Hb = dialog.Hb();
        return new msx(Hb != null ? Hb.b : null, str, dialog.tc());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osb)) {
            return false;
        }
        osb osbVar = (osb) obj;
        return epx.f(this.b, osbVar.b) && this.d == osbVar.d && this.e == osbVar.e && epx.f(this.f, osbVar.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return b + (str != null ? str.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatLoadInviteLinkCmd(peer=");
        sb.append(this.b);
        sb.append(", invalidate=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        sb.append(this.e);
        sb.append(", changerTag=");
        return tq.f(sb, this.f, ')');
    }
}
