package org.jsoup.nodes;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import org.jsoup.nodes.Document;
import xsna.c0o0;
import xsna.sqm0;

/* compiled from: TextNode.java */
/* loaded from: classes8.dex */
public class l extends i {
    public l(String str) {
        this.e = str;
    }

    @Override // org.jsoup.nodes.j
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public l k() {
        return (l) super.k();
    }

    @Override // org.jsoup.nodes.j
    public String s() {
        return "#text";
    }

    @Override // org.jsoup.nodes.j
    public final String toString() {
        return u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x008d, code lost:
    
        if (xsna.sqm0.c(r1.c(r1.s())) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a4, code lost:
    
        if (r0.t().equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_BR) != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    @Override // org.jsoup.nodes.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        j jVar;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4 = outputSettings.f;
        j jVar2 = this.b;
        g gVar = jVar2 instanceof g ? (g) jVar2 : null;
        boolean z5 = false;
        if (!z4 || g.I(jVar2)) {
            jVar = null;
            z = false;
        } else {
            jVar = null;
            z = true;
        }
        if (gVar != null) {
            c0o0 c0o0Var = gVar.e;
            if (c0o0Var.d || c0o0Var.e) {
                z2 = true;
                if (z) {
                    z3 = false;
                } else {
                    boolean z6 = (z2 && this.c == 0) || (this.b instanceof Document);
                    if (z2 && r() == null) {
                        z5 = true;
                    }
                    j r = r();
                    j jVar3 = this.b;
                    if (jVar3 != null && this.c > 0) {
                        jVar = jVar3.n().get(this.c - 1);
                    }
                    boolean c = sqm0.c(c(s()));
                    if (!(r instanceof g) || !((g) r).J(outputSettings)) {
                        if (r instanceof l) {
                            l lVar = (l) r;
                        }
                        if (jVar instanceof g) {
                            if (!((g) jVar).e.d) {
                            }
                        }
                        i2 = this.c;
                        if ((i2 == 0 && gVar != null && gVar.e.e && !c) || (i2 > 0 && jVar != null && jVar.t().equals(TtmlNode.TAG_BR))) {
                            j.q(appendable, i, outputSettings);
                        }
                        z3 = z6;
                    }
                    if (c) {
                        return;
                    }
                    i2 = this.c;
                    if (i2 == 0) {
                        j.q(appendable, i, outputSettings);
                        z3 = z6;
                    }
                    j.q(appendable, i, outputSettings);
                    z3 = z6;
                }
                Entities.b(appendable, c(s()), outputSettings, false, z, z3, z5);
            }
        }
        z2 = false;
        if (z) {
        }
        Entities.b(appendable, c(s()), outputSettings, false, z, z3, z5);
    }

    @Override // org.jsoup.nodes.j
    public void w(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
    }
}
