package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;

/* compiled from: CDataNode.java */
/* loaded from: classes8.dex */
public final class c extends l {
    @Override // org.jsoup.nodes.l
    /* renamed from: E */
    public final l k() {
        return (c) super.k();
    }

    @Override // org.jsoup.nodes.l, org.jsoup.nodes.j
    /* renamed from: clone */
    public final Object k() throws CloneNotSupportedException {
        return (c) super.k();
    }

    @Override // org.jsoup.nodes.l, org.jsoup.nodes.j
    public final j k() {
        return (c) super.k();
    }

    @Override // org.jsoup.nodes.l, org.jsoup.nodes.j
    public final String s() {
        return "#cdata";
    }

    @Override // org.jsoup.nodes.l, org.jsoup.nodes.j
    public final void v(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("<![CDATA[").append(c("#cdata"));
    }

    @Override // org.jsoup.nodes.l, org.jsoup.nodes.j
    public final void w(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("]]>");
    }
}
