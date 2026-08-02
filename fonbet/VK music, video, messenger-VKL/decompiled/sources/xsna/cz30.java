package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.WidgetDataAttach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import java.util.Collections;
import xsna.ij20;

/* compiled from: MsgSendUncheckedCmd.kt */
/* loaded from: classes2.dex */
public final class cz30 extends le6<s3q0> {
    public final Peer b;
    public final String c;
    public final String d;
    public final Attach e;
    public final String f = "share";
    public final String g;
    public final String h;
    public final String i;
    public w2w j;

    public cz30(Peer peer, String str, String str2, Attach attach, String str3, String str4, String str5) {
        this.b = peer;
        this.c = str;
        this.d = str2;
        this.e = attach;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        this.j = w2wVar;
        Attach attach = this.e;
        if (attach instanceof WidgetDataAttach) {
            WidgetDataAttach widgetDataAttach = (WidgetDataAttach) attach;
            String m = bz2.m();
            String str = "1_" + o25.a().c().b;
            ij20.a aVar = new ij20.a();
            aVar.d = m;
            aVar.c = "widgetsKit.create";
            aVar.b("peer_id", str);
            aVar.b(TtmlNode.TAG_LAYOUT, widgetDataAttach.c);
            aVar.b("payload", widgetDataAttach.b);
            aVar.b("payload_hash", widgetDataAttach.d);
            aVar.g = 1;
            aVar.i = true;
            String str2 = (String) bz2.f(new ij20(aVar), new bz30(str));
            if (str2 != null) {
                if (this.c.length() > 0) {
                    w2w w2wVar2 = this.j;
                    if (w2wVar2 == null) {
                        w2wVar2 = null;
                    }
                    x6x O0 = w2wVar2.O0();
                    w2w w2wVar3 = this.j;
                    if (w2wVar3 == null) {
                        w2wVar3 = null;
                    }
                    O0.a(new dz30(this.b, this.c, this.d, w2wVar3.getConfig().p, this.g, this.h, this.i, null, null));
                    w2w w2wVar4 = this.j;
                    if (w2wVar4 == null) {
                        w2wVar4 = null;
                    }
                    x6x O02 = w2wVar4.O0();
                    w2w w2wVar5 = this.j;
                    O02.a(new dz30(this.b, this.c, this.d, (w2wVar5 != null ? w2wVar5 : null).getConfig().p, this.g, this.h, this.i, str2, null));
                } else {
                    w2w w2wVar6 = this.j;
                    if (w2wVar6 == null) {
                        w2wVar6 = null;
                    }
                    x6x O03 = w2wVar6.O0();
                    w2w w2wVar7 = this.j;
                    O03.a(new dz30(this.b, this.c, this.d, (w2wVar7 != null ? w2wVar7 : null).getConfig().p, this.g, this.h, this.i, str2, null));
                }
            }
        } else if (attach instanceof MiniAppSnippetDataAttach) {
            MiniAppSnippetDataAttach miniAppSnippetDataAttach = (MiniAppSnippetDataAttach) attach;
            x6x O04 = w2wVar.O0();
            w2w w2wVar8 = this.j;
            if (w2wVar8 == null) {
                w2wVar8 = null;
            }
            O04.a(new dz30(this.b, this.c, this.d, w2wVar8.getConfig().p, this.g, this.h, this.i, null, miniAppSnippetDataAttach.d()));
        } else if (attach != null) {
            pz30 pz30Var = new pz30(this.b, this.c, null, null, null, this.h, this.i, this.f, Collections.singletonList(attach), null, null, this.g, null, 13852);
            w2w w2wVar9 = this.j;
            (w2wVar9 != null ? w2wVar9 : null).L0(this, pz30Var);
        } else {
            x6x O05 = w2wVar.O0();
            w2w w2wVar10 = this.j;
            O05.a(new dz30(this.b, this.c, this.d, (w2wVar10 != null ? w2wVar10 : null).getConfig().p, this.g, this.h, this.i, null, null));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz30)) {
            return false;
        }
        cz30 cz30Var = (cz30) obj;
        return epx.f(this.b, cz30Var.b) && epx.f(this.c, cz30Var.c) && epx.f(this.d, cz30Var.d) && epx.f(this.e, cz30Var.e) && epx.f(this.f, cz30Var.f) && epx.f(this.g, cz30Var.g) && epx.f(this.h, cz30Var.h) && epx.f(this.i, cz30Var.i);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        Attach attach = this.e;
        return this.i.hashCode() + urd0.a(urd0.a(urd0.a((a + (attach == null ? 0 : attach.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSendUncheckedCmd(dialog=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", attachmentsStr=");
        sb.append(this.d);
        sb.append(", attach=");
        sb.append(this.e);
        sb.append(", entryPoint=");
        sb.append(this.f);
        sb.append(", trackCode=");
        sb.append(this.g);
        sb.append(", ref=");
        sb.append(this.h);
        sb.append(", refSource=");
        return ho8.a(sb, this.i, ')');
    }
}
