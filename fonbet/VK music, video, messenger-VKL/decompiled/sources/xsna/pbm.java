package xsna;

import com.vk.dto.common.Peer;
import java.util.List;

/* compiled from: DialogCheckMembersInCmd.kt */
/* loaded from: classes2.dex */
public final class pbm {
    public final List<Peer> a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public pbm(List<? extends Peer> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbm)) {
            return false;
        }
        pbm pbmVar = (pbm) obj;
        return epx.f(this.a, pbmVar.a) && this.b == pbmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogCheckMembersInCmdResponse(inDialogMembers=");
        sb.append(this.a);
        sb.append(", isActual=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
