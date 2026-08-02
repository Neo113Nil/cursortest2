package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgReadIncomingChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class wxf implements e900 {
    public final Peer a;
    public final int b;
    public final Integer c;

    public wxf(Peer peer, int i, Integer num) {
        this.a = peer;
        this.b = i;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxf)) {
            return false;
        }
        wxf wxfVar = (wxf) obj;
        return epx.f(this.a, wxfVar.a) && this.b == wxfVar.b && epx.f(this.c, wxfVar.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        Integer num = this.c;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgReadIncomingChangeLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", tillMsgCnvId=");
        sb.append(this.b);
        sb.append(", countUnread=");
        return uqi.b(sb, this.c, ')');
    }
}
