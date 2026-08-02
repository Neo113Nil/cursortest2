package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.c;
import xsna.ij20;

/* compiled from: DialogsSetStyleCmd.kt */
/* loaded from: classes2.dex */
public final class vvm extends le6<s3q0> {
    public final Peer b;
    public final com.vk.im.engine.models.dialogs.c c;

    public vvm(Peer peer, com.vk.im.engine.models.dialogs.c cVar) {
        this.b = peer;
        this.c = cVar;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        final com.vk.im.engine.models.dialogs.c cVar = this.c;
        String str = cVar != null ? cVar.a : null;
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        if (str == null || str.equals(c.C1124c.c.a)) {
            aVar.c = "messages.resetConversationStyle";
        } else {
            aVar.c = "messages.setConversationStyle";
            aVar.b(TtmlNode.TAG_STYLE, str);
        }
        final long j = this.b.b;
        aVar.f.put("peer_id", Long.valueOf(j).toString());
        bz2.f(new ij20(aVar), uvm.b);
        final hpm e = w2wVar.I0().b().e();
        if (cVar == null) {
            cVar = c.C1124c.c;
        }
        e.c.a(Long.valueOf(j), new x2e(cVar, 9), new izs() { // from class: xsna.unm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                hpm.this.b.b().execSQL("UPDATE dialogs SET theme_id = ? WHERE id = ?", new Object[]{cVar.a, Long.valueOf(j)});
                return s3q0.a;
            }
        });
        w2wVar.S0().V(j);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvm)) {
            return false;
        }
        vvm vvmVar = (vvm) obj;
        return epx.f(this.b, vvmVar.b) && epx.f(this.c, vvmVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        com.vk.im.engine.models.dialogs.c cVar = this.c;
        return hashCode + (cVar == null ? 0 : cVar.a.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsSetStyleCmd(peer=" + this.b + ", themeId=" + this.c + ')';
    }
}
