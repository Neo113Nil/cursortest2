package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;

/* compiled from: DataNode.java */
/* loaded from: classes8.dex */
public final class e extends i {
    @Override // org.jsoup.nodes.j
    /* renamed from: clone */
    public final Object k() throws CloneNotSupportedException {
        return (e) super.k();
    }

    @Override // org.jsoup.nodes.j
    public final j k() {
        return (e) super.k();
    }

    @Override // org.jsoup.nodes.j
    public final String s() {
        return "#data";
    }

    @Override // org.jsoup.nodes.j
    public final String toString() {
        return u();
    }

    @Override // org.jsoup.nodes.j
    public final void v(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(c("#data"));
    }

    @Override // org.jsoup.nodes.j
    public final void w(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }
}
