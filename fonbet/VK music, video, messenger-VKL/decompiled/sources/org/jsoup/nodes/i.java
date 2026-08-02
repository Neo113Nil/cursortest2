package org.jsoup.nodes;

import java.util.List;
import xsna.ad0;

/* compiled from: LeafNode.java */
/* loaded from: classes8.dex */
public abstract class i extends j {
    public Object e;

    public final i C(String str, String str2) {
        if (!(this.e instanceof b) && str.equals("#doctype")) {
            this.e = str2;
            return this;
        }
        D();
        k.a(this);
        String C = ad0.C(str.trim());
        b e = e();
        int i = e.i(C);
        if (i == -1) {
            e.a(C, str2);
            return this;
        }
        e.d[i] = str2;
        if (!e.c[i].equals(C)) {
            e.c[i] = C;
        }
        return this;
    }

    public final void D() {
        Object obj = this.e;
        if (obj instanceof b) {
            return;
        }
        b bVar = new b();
        this.e = bVar;
        if (obj != null) {
            bVar.k(s(), (String) obj);
        }
    }

    @Override // org.jsoup.nodes.j
    public final String a(String str) {
        D();
        return super.a(str);
    }

    @Override // org.jsoup.nodes.j
    public final String c(String str) {
        return !(this.e instanceof b) ? s().equals(str) ? (String) this.e : "" : super.c(str);
    }

    @Override // org.jsoup.nodes.j
    public final b e() {
        D();
        return (b) this.e;
    }

    @Override // org.jsoup.nodes.j
    public final String i() {
        j jVar = this.b;
        return jVar != null ? jVar.i() : "";
    }

    @Override // org.jsoup.nodes.j
    public final int j() {
        return 0;
    }

    @Override // org.jsoup.nodes.j
    public final j l(j jVar) {
        i iVar = (i) super.l(jVar);
        Object obj = this.e;
        if (obj instanceof b) {
            iVar.e = ((b) obj).clone();
        }
        return iVar;
    }

    @Override // org.jsoup.nodes.j
    public final List<j> n() {
        return j.d;
    }

    @Override // org.jsoup.nodes.j
    public final boolean p() {
        return this.e instanceof b;
    }

    @Override // org.jsoup.nodes.j
    public final j m() {
        return this;
    }
}
