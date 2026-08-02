package xsna;

import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.messages.MessagesType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: UpdateAttachWallViewedStatusCmd.kt */
/* loaded from: classes2.dex */
public final class s7q0 extends le6<s3q0> {
    public final ArrayList b;
    public final boolean c = true;
    public final MessagesType d;

    public s7q0(ArrayList arrayList, MessagesType messagesType) {
        this.b = arrayList;
        this.d = messagesType;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        List A = rli0.A(rli0.u(rli0.j(new i5g(this.b), new rzl0(this, 10)), new b8e0(this, 16)));
        if (!A.isEmpty()) {
            if (this.d == MessagesType.DIALOG) {
                w2wVar.I0().o().q0(A);
            } else {
                g2b g2bVar = w2wVar.I0().y().b;
                g2bVar.d.I0().u(new k8(5, A, g2bVar));
            }
            Iterator it = A.iterator();
            while (it.hasNext()) {
                w2wVar.e1(this, new y080((AttachWall) it.next(), null));
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7q0)) {
            return false;
        }
        s7q0 s7q0Var = (s7q0) obj;
        return epx.f(this.b, s7q0Var.b) && this.c == s7q0Var.c && this.d == s7q0Var.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "UpdateAttachWallViewedStatusCmd(attaches=" + this.b + ", isViewed=" + this.c + ", messagesType=" + this.d + ')';
    }
}
