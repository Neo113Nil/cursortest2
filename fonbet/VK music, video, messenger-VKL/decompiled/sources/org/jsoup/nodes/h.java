package org.jsoup.nodes;

import org.jsoup.select.Elements;
import xsna.c0o0;

/* compiled from: FormElement.java */
/* loaded from: classes8.dex */
public final class h extends g {
    public final Elements k;

    public h(c0o0 c0o0Var, b bVar) {
        super(c0o0Var, null, bVar);
        this.k = new Elements();
    }

    @Override // org.jsoup.nodes.j
    public final void A(j jVar) {
        super.A(jVar);
        this.k.remove(jVar);
    }

    @Override // org.jsoup.nodes.g
    /* renamed from: F */
    public final g clone() {
        return (h) super.clone();
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.j
    /* renamed from: clone */
    public final Object k() throws CloneNotSupportedException {
        return (h) super.clone();
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.j
    public final j k() {
        return (h) super.clone();
    }
}
