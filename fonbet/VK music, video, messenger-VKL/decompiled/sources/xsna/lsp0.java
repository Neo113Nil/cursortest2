package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.groups.Group;
import kotlin.Result;

/* compiled from: TryGetInfoBarForGroupCmd.kt */
/* loaded from: classes2.dex */
public final class lsp0 extends le6<Result<? extends InfoBar>> {
    public final Peer b;
    public final String c;
    public final String d = "res:/2131237484";
    public final Integer e;

    public lsp0(Peer peer, Integer num, String str) {
        this.b = peer;
        this.c = str;
        this.e = num;
    }

    @Override // xsna.le6
    public final Result<? extends InfoBar> e(w2w w2wVar) {
        bru n = w2wVar.I0().n();
        Peer peer = this.b;
        Group b = n.b(-peer.b);
        boolean Ab = peer.Ab(Peer.Type.GROUP);
        boolean z = false;
        if (b != null && b.h) {
            z = true;
        }
        return new Result<>((!Ab || z) ? null : new InfoBar(null, null, this.c, this.d, null, null, this.e, false, null, false, null, null, null, 8115, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsp0)) {
            return false;
        }
        lsp0 lsp0Var = (lsp0) obj;
        return epx.f(this.b, lsp0Var.b) && epx.f(this.c, lsp0Var.c) && epx.f(this.d, lsp0Var.d) && epx.f(this.e, lsp0Var.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        Integer num = this.e;
        return a + (num == null ? 0 : num.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("TryGetInfoBarForGroupCmd(peer=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", iconTintColor=");
        return uqi.b(sb, this.e, ')');
    }
}
