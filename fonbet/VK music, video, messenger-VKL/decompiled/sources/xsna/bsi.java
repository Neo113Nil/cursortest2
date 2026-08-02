package xsna;

import com.vk.dto.common.Peer;
import java.util.ArrayList;

/* compiled from: ComposingGetByDialogIdCmd.kt */
/* loaded from: classes2.dex */
public final class bsi extends le6<ArrayList<vh30>> {
    public final Peer b;

    public bsi(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final ArrayList<vh30> e(w2w w2wVar) {
        return w2wVar.U0().b(this.b.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bsi) {
            return epx.f(this.b, ((bsi) obj).b);
        }
        return false;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("ComposingGetByDialogIdCmd(peer="), this.b, ')');
    }
}
