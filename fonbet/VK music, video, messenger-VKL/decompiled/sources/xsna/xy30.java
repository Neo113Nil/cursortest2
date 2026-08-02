package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.messages.LocalMsgId;
import java.util.List;

/* compiled from: MsgSendReporterParams.kt */
/* loaded from: classes2.dex */
public final class xy30 {
    public final LocalMsgId a;
    public final boolean b;
    public final boolean c;
    public final List<Attach> d;
    public final ImBgSyncState e;
    public final String f;

    /* JADX WARN: Multi-variable type inference failed */
    public xy30(LocalMsgId localMsgId, boolean z, boolean z2, List<? extends Attach> list, ImBgSyncState imBgSyncState, String str) {
        this.a = localMsgId;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = imBgSyncState;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy30)) {
            return false;
        }
        xy30 xy30Var = (xy30) obj;
        return epx.f(this.a, xy30Var.a) && this.b == xy30Var.b && this.c == xy30Var.c && epx.f(this.d, xy30Var.d) && this.e == xy30Var.e && epx.f(this.f, xy30Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + fw3.a(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSendReporterParams(msgId=");
        sb.append(this.a);
        sb.append(", isRetry=");
        sb.append(this.b);
        sb.append(", withUpload=");
        sb.append(this.c);
        sb.append(", attachList=");
        sb.append(this.d);
        sb.append(", bgSyncState=");
        sb.append(this.e);
        sb.append(", entry=");
        return ho8.a(sb, this.f, ')');
    }
}
