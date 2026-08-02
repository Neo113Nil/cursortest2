package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;

/* compiled from: Comment.java */
/* loaded from: classes8.dex */
public final class d extends i {
    @Override // org.jsoup.nodes.j
    /* renamed from: clone */
    public final Object k() throws CloneNotSupportedException {
        return (d) super.k();
    }

    @Override // org.jsoup.nodes.j
    public final j k() {
        return (d) super.k();
    }

    @Override // org.jsoup.nodes.j
    public final String s() {
        return "#comment";
    }

    @Override // org.jsoup.nodes.j
    public final String toString() {
        return u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (xsna.sqm0.c(r3.c(r3.s())) != false) goto L18;
     */
    @Override // org.jsoup.nodes.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.f) {
            int i2 = this.c;
            if (i2 != 0) {
                if (i2 == 1) {
                    j jVar = this.b;
                    j jVar2 = null;
                    if (jVar != null && i2 > 0) {
                        jVar2 = jVar.n().get(this.c - 1);
                    }
                    if (jVar2 instanceof l) {
                        l lVar = (l) jVar2;
                    }
                }
            }
            j jVar3 = this.b;
            if ((jVar3 instanceof g) && ((g) jVar3).e.e) {
                j.q(appendable, i, outputSettings);
            }
        }
        appendable.append("<!--").append(c("#comment")).append("-->");
    }

    @Override // org.jsoup.nodes.j
    public final void w(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }
}
