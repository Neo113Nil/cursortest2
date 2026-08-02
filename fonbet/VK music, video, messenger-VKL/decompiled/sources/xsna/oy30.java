package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Set;

/* compiled from: MsgSendMultipleCmd.kt */
/* loaded from: classes2.dex */
public final class oy30 extends le6<s3q0> {
    public final Set<Peer> b;
    public final String c = "";
    public final List<Attach> d;
    public final String e;

    public oy30(Set set, List list, String str) {
        this.b = set;
        this.d = list;
        this.e = str;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        List b = ph30.b(this.d, w2wVar);
        AttachUploadingEndpoint attachUploadingEndpoint = AttachUploadingEndpoint.CHAT;
        Set<Peer> set = this.b;
        w2wVar.O0().a(new py30("", rli0.r(rli0.t(new i5g((List) w2wVar.L0(this, new ch30(set, b, attachUploadingEndpoint, null))), new d4r(12)), StringUtils.COMMA, null, 62), set, this.e));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy30)) {
            return false;
        }
        oy30 oy30Var = (oy30) obj;
        return epx.f(this.b, oy30Var.b) && epx.f(this.c, oy30Var.c) && epx.f(this.d, oy30Var.d) && epx.f(this.e, oy30Var.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.e.hashCode() + fw3.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSendMultipleCmd(dialogs=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", attaches=");
        sb.append(this.d);
        sb.append(", entryPoint=");
        return ho8.a(sb, this.e, ')');
    }
}
