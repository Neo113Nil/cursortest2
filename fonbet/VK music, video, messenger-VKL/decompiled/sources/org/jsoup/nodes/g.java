package org.jsoup.nodes;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.ValidationException;
import org.jsoup.nodes.Document;
import xsna.ad0;
import xsna.c0o0;
import xsna.kir0;

/* compiled from: Element.java */
/* loaded from: classes8.dex */
public class g extends j {
    public static final List<g> i = Collections.EMPTY_LIST;
    public static final String j;
    public final c0o0 e;
    public WeakReference<List<g>> f;
    public List<j> g;
    public b h;

    /* compiled from: Element.java */
    public static final class a extends ChangeNotifyingArrayList<j> {
        private final g owner;

        public a(g gVar, int i) {
            super(i);
            this.owner = gVar;
        }

        @Override // org.jsoup.helper.ChangeNotifyingArrayList
        public final void i() {
            this.owner.f = null;
        }
    }

    static {
        Pattern.compile("\\s+");
        j = DomExceptionUtils.SEPARATOR.concat("baseUri");
    }

    public g(c0o0 c0o0Var, String str, b bVar) {
        kir0.c(c0o0Var);
        this.g = j.d;
        this.h = bVar;
        this.e = c0o0Var;
        if (str != null) {
            G(str);
        }
    }

    public static boolean I(j jVar) {
        if (jVar instanceof g) {
            g gVar = (g) jVar;
            int i2 = 0;
            while (!gVar.e.h) {
                gVar = (g) gVar.b;
                i2++;
                if (i2 < 6 && gVar != null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.jsoup.nodes.j] */
    @Override // org.jsoup.nodes.j
    public final j B() {
        g gVar = this;
        while (true) {
            ?? r1 = gVar.b;
            if (r1 == 0) {
                return gVar;
            }
            gVar = r1;
        }
    }

    public final void C(j jVar) {
        j jVar2 = jVar.b;
        if (jVar2 != null) {
            jVar2.A(jVar);
        }
        jVar.b = this;
        n();
        this.g.add(jVar);
        jVar.c = this.g.size() - 1;
    }

    public final g D(String str) {
        k.a(this);
        HashMap hashMap = c0o0.k;
        c0o0 c0o0Var = (c0o0) hashMap.get(str);
        if (c0o0Var == null) {
            String C = ad0.C(str.trim());
            kir0.b(C);
            c0o0Var = (c0o0) hashMap.get(ad0.C(C));
            if (c0o0Var == null) {
                c0o0Var = new c0o0(C);
                c0o0Var.d = false;
            }
        }
        g gVar = new g(c0o0Var, i(), null);
        C(gVar);
        return gVar;
    }

    public final List<g> E() {
        List<g> list;
        if (this.g.size() == 0) {
            return i;
        }
        WeakReference<List<g>> weakReference = this.f;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.g.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.g.get(i2);
            if (jVar instanceof g) {
                arrayList.add((g) jVar);
            }
        }
        this.f = new WeakReference<>(arrayList);
        return arrayList;
    }

    @Override // org.jsoup.nodes.j
    /* renamed from: F, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g k() {
        return (g) super.k();
    }

    public final void G(String str) {
        e().k(j, str);
    }

    public final void H(List list) {
        if (list == null) {
            throw new ValidationException("Children collection to be inserted must not be null.");
        }
        int size = this.g.size();
        if (!(size >= 0)) {
            throw new ValidationException("Insert position out of bounds.");
        }
        b(size, (j[]) new ArrayList(list).toArray(new j[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (xsna.sqm0.c(r2.c(r2.s())) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(Document.OutputSettings outputSettings) {
        int i2;
        g gVar;
        if (!outputSettings.f) {
            return false;
        }
        boolean z = this.e.d;
        if (!z && ((gVar = (g) this.b) == null || !gVar.e.e)) {
            return false;
        }
        if (!z) {
            j jVar = this.b;
            g gVar2 = (g) jVar;
            if ((gVar2 == null || gVar2.e.d) && (i2 = this.c) != 0) {
                if (i2 == 1) {
                    j jVar2 = null;
                    if (jVar != null && i2 > 0) {
                        jVar2 = jVar.n().get(this.c - 1);
                    }
                    if (jVar2 instanceof l) {
                        l lVar = (l) jVar2;
                    }
                }
                if (!t().equals(TtmlNode.TAG_BR)) {
                    return false;
                }
            }
        }
        return !I(this.b);
    }

    @Override // org.jsoup.nodes.j
    public final b e() {
        if (this.h == null) {
            this.h = new b();
        }
        return this.h;
    }

    @Override // org.jsoup.nodes.j
    public final String i() {
        for (g gVar = this; gVar != null; gVar = (g) gVar.b) {
            b bVar = gVar.h;
            if (bVar != null) {
                String str = j;
                if (bVar.h(str) != -1) {
                    return gVar.h.f(str);
                }
            }
        }
        return "";
    }

    @Override // org.jsoup.nodes.j
    public final int j() {
        return this.g.size();
    }

    @Override // org.jsoup.nodes.j
    public final j l(j jVar) {
        g gVar = (g) super.l(jVar);
        b bVar = this.h;
        gVar.h = bVar != null ? bVar.clone() : null;
        a aVar = new a(gVar, this.g.size());
        gVar.g = aVar;
        aVar.addAll(this.g);
        return gVar;
    }

    @Override // org.jsoup.nodes.j
    public final j m() {
        this.g.clear();
        return this;
    }

    @Override // org.jsoup.nodes.j
    public final List<j> n() {
        if (this.g == j.d) {
            this.g = new a(this, 4);
        }
        return this.g;
    }

    @Override // org.jsoup.nodes.j
    public final boolean p() {
        return this.h != null;
    }

    @Override // org.jsoup.nodes.j
    public String s() {
        return this.e.b;
    }

    @Override // org.jsoup.nodes.j
    public final String t() {
        return this.e.c;
    }

    @Override // org.jsoup.nodes.j
    public final void v(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        boolean z;
        if (J(outputSettings)) {
            if (!(appendable instanceof StringBuilder)) {
                j.q(appendable, i2, outputSettings);
            } else if (((StringBuilder) appendable).length() > 0) {
                j.q(appendable, i2, outputSettings);
            }
        }
        Appendable append = appendable.append('<');
        c0o0 c0o0Var = this.e;
        append.append(c0o0Var.b);
        b bVar = this.h;
        if (bVar != null) {
            bVar.g(appendable, outputSettings);
        }
        if (!this.g.isEmpty() || (!(z = c0o0Var.f) && !c0o0Var.g)) {
            appendable.append('>');
        } else if (outputSettings.i == Document.OutputSettings.Syntax.html && z) {
            appendable.append('>');
        } else {
            appendable.append(" />");
        }
    }

    @Override // org.jsoup.nodes.j
    public final void w(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        boolean isEmpty = this.g.isEmpty();
        c0o0 c0o0Var = this.e;
        if (isEmpty && (c0o0Var.f || c0o0Var.g)) {
            return;
        }
        if (outputSettings.f && !this.g.isEmpty() && c0o0Var.e && !I(this.b)) {
            j.q(appendable, i2, outputSettings);
        }
        appendable.append("</").append(c0o0Var.b).append('>');
    }

    @Override // org.jsoup.nodes.j
    public final j y() {
        return (g) this.b;
    }
}
