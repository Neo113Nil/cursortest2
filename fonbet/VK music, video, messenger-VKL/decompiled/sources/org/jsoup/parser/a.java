package org.jsoup.parser;

import com.coremedia.iso.boxes.MetaBox;
import com.ironsource.B5;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.net.NetError;
import org.jsoup.helper.ValidationException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.g;
import org.jsoup.nodes.h;
import org.jsoup.nodes.i;
import org.jsoup.nodes.j;
import org.jsoup.nodes.l;
import org.jsoup.parser.Token;
import org.jsoup.parser.b;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bmb;
import xsna.c0o0;
import xsna.cj90;
import xsna.j0u0;
import xsna.kir0;
import xsna.od50;
import xsna.sqm0;
import xsna.xy9;

/* compiled from: HtmlTreeBuilder.java */
/* loaded from: classes8.dex */
public final class a extends e {
    public b l;
    public b m;
    public boolean n;
    public g o;
    public h p;
    public g q;
    public ArrayList<g> r;
    public ArrayList<b> s;
    public ArrayList t;
    public Token.f u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final String[] y;
    public static final String[] z = {"applet", "caption", "html", "marquee", "object", B5.R, "td", "th"};
    public static final String[] A = {"ol", "ul"};
    public static final String[] B = {"button"};
    public static final String[] C = {"html", B5.R};
    public static final String[] D = {"optgroup", "option"};
    public static final String[] E = {"dd", O6.w0, "li", "optgroup", "option", TtmlNode.TAG_P, "rb", "rp", "rt", "rtc"};
    public static final String[] F = {"caption", "colgroup", "dd", O6.w0, "li", "optgroup", "option", TtmlNode.TAG_P, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] G = {RTCStatsConstants.KEY_ADDRESS, "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", TtmlNode.TAG_BR, "button", "caption", TtmlNode.CENTER, "col", "colgroup", "command", "dd", "details", "dir", TtmlNode.TAG_DIV, "dl", O6.w0, "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", TtmlNode.TAG_HEAD, "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", MetaBox.TYPE, "nav", "noembed", "noframes", "noscript", "object", "ol", TtmlNode.TAG_P, "param", "plaintext", "pre", "script", "section", "select", TtmlNode.TAG_STYLE, "summary", B5.R, "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    public a() {
        this.j = new Token.g();
        this.k = new Token.f();
        this.y = new String[]{null};
    }

    public static boolean G(ArrayList<g> arrayList, g gVar) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (arrayList.get(i) == gVar) {
                return true;
            }
            i--;
        }
        return false;
    }

    public static void z(Token.b bVar, g gVar) {
        i eVar;
        String str = gVar.e.c;
        String str2 = bVar.c;
        if (bVar instanceof Token.a) {
            eVar = new org.jsoup.nodes.c(str2);
        } else if (str.equals("script") || str.equals(TtmlNode.TAG_STYLE)) {
            eVar = new org.jsoup.nodes.e();
            eVar.e = str2;
        } else {
            eVar = new l(str2);
        }
        gVar.C(eVar);
    }

    public final void A(Token.c cVar) {
        String str = cVar.d;
        if (str == null) {
            str = cVar.c.toString();
        }
        org.jsoup.nodes.d dVar = new org.jsoup.nodes.d();
        dVar.e = str;
        E(dVar);
    }

    public final g B(Token.g gVar) {
        c0o0 g = g(gVar.s(), this.h);
        cj90 cj90Var = this.h;
        org.jsoup.nodes.b bVar = gVar.m;
        cj90Var.a(bVar);
        g gVar2 = new g(g, null, bVar);
        E(gVar2);
        if (gVar.l) {
            if (!c0o0.k.containsKey(g.b)) {
                g.g = true;
            } else if (!g.f) {
                c cVar = this.c;
                Object[] objArr = {g.c};
                ParseErrorList parseErrorList = cVar.b;
                if (parseErrorList.i()) {
                    parseErrorList.add(new j0u0(cVar.a, "Tag [%s] cannot be self closing; not a void tag", objArr));
                    return gVar2;
                }
            }
        }
        return gVar2;
    }

    public final void C(Token.g gVar, boolean z2, boolean z3) {
        c0o0 g = g(gVar.s(), this.h);
        cj90 cj90Var = this.h;
        org.jsoup.nodes.b bVar = gVar.m;
        cj90Var.a(bVar);
        h hVar = new h(g, bVar);
        if (!z3) {
            this.p = hVar;
        } else if (!F("template")) {
            this.p = hVar;
        }
        E(hVar);
        if (z2) {
            this.e.add(hVar);
        }
    }

    public final void D(j jVar) {
        g gVar;
        g q = q(B5.R);
        boolean z2 = false;
        if (q != null) {
            gVar = (g) q.b;
            if (gVar != null) {
                z2 = true;
            } else {
                gVar = h(q);
            }
        } else {
            gVar = this.e.get(0);
        }
        if (!z2) {
            gVar.C(jVar);
            return;
        }
        kir0.c(q);
        kir0.c(q.b);
        j jVar2 = jVar.b;
        if (jVar2 == q.b && jVar2 != null) {
            jVar2.A(jVar);
        }
        q.b.b(q.c, jVar);
    }

    public final void E(j jVar) {
        h hVar;
        if (this.e.isEmpty()) {
            this.d.C(jVar);
        } else if (this.w && sqm0.b(a().e.c, b.z.B)) {
            D(jVar);
        } else {
            a().C(jVar);
        }
        if (jVar instanceof g) {
            g gVar = (g) jVar;
            if (!gVar.e.i || (hVar = this.p) == null) {
                return;
            }
            hVar.k.add(gVar);
        }
    }

    public final boolean F(String str) {
        return q(str) != null;
    }

    public final boolean H(String[] strArr) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i > 100 ? size + NetError.ERR_CONNECTION_RESET : 0;
        while (i >= i2) {
            if (!sqm0.b(this.e.get(i).e.c, strArr)) {
                return true;
            }
            i--;
        }
        return false;
    }

    public final void I() {
        this.e.remove(this.e.size() - 1);
    }

    public final void J(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            g gVar = this.e.get(size);
            this.e.remove(size);
            if (gVar.e.c.equals(str)) {
                return;
            }
        }
    }

    public final void K() {
        if (this.s.size() > 0) {
            this.s.remove(r0.size() - 1);
        }
    }

    public final boolean L(Token token, b bVar) {
        this.g = token;
        return bVar.i(token, this);
    }

    public final void M(b bVar) {
        this.s.add(bVar);
    }

    public final void N() {
        if (this.e.size() > 256) {
            return;
        }
        boolean z2 = true;
        g gVar = this.r.size() > 0 ? (g) xy9.b(1, this.r) : null;
        if (gVar == null || G(this.e, gVar)) {
            return;
        }
        int size = this.r.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            gVar = this.r.get(i3);
            if (gVar == null || G(this.e, gVar)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i3++;
                gVar = this.r.get(i3);
            }
            kir0.c(gVar);
            g gVar2 = new g(g(gVar.e.c, this.h), null, gVar.e().clone());
            E(gVar2);
            this.e.add(gVar2);
            this.r.set(i3, gVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    public final void O(g gVar) {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            if (this.r.get(size) == gVar) {
                this.r.remove(size);
                return;
            }
        }
    }

    public final void P(g gVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == gVar) {
                this.e.remove(size);
                return;
            }
        }
    }

    public final void Q() {
        g D2;
        g D3;
        if (!F("body")) {
            ArrayList<g> arrayList = this.e;
            Document document = this.d;
            Iterator<g> it = document.E().iterator();
            while (true) {
                if (!it.hasNext()) {
                    D2 = document.D("html");
                    break;
                } else {
                    D2 = it.next();
                    if (D2.e.c.equals("html")) {
                        break;
                    }
                }
            }
            Iterator<g> it2 = D2.E().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    D3 = D2.D("body");
                    break;
                }
                D3 = it2.next();
                if ("body".equals(D3.e.c) || "frameset".equals(D3.e.c)) {
                    break;
                }
            }
            arrayList.add(D3);
        }
        this.l = b.InBody;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x014c, code lost:
    
        r9.l = org.jsoup.parser.b.InSelect;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0157, code lost:
    
        if (r9.s.size() <= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0159, code lost:
    
        r0 = (org.jsoup.parser.b) xsna.xy9.b(1, r9.s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0163, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0165, code lost:
    
        r9.l = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x016f, code lost:
    
        throw new org.jsoup.helper.ValidationException("Bug: no template insertion mode on stack!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0162, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0170, code lost:
    
        r9.l = org.jsoup.parser.b.InFrameset;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
    
        switch(r8) {
            case 0: goto L127;
            case 1: goto L126;
            case 2: goto L125;
            case 3: goto L124;
            case 4: goto L98;
            case 5: goto L98;
            case 6: goto L123;
            case 7: goto L122;
            case 8: goto L94;
            case 9: goto L121;
            case 10: goto L120;
            case 11: goto L119;
            case 12: goto L119;
            case 13: goto L119;
            case 14: goto L118;
            default: goto L100;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0124, code lost:
    
        if (r4 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
    
        r9.l = org.jsoup.parser.b.InHead;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0135, code lost:
    
        if (r4 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0137, code lost:
    
        r9.l = org.jsoup.parser.b.InCell;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013c, code lost:
    
        if (r4 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013e, code lost:
    
        r9.l = org.jsoup.parser.b.InBody;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0107, code lost:
    
        r9.l = org.jsoup.parser.b.InCaption;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010d, code lost:
    
        r9.l = org.jsoup.parser.b.InTableBody;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0113, code lost:
    
        r9.l = org.jsoup.parser.b.InTable;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011a, code lost:
    
        if (r9.o != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x011c, code lost:
    
        r0 = org.jsoup.parser.b.BeforeHead;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0121, code lost:
    
        r9.l = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011f, code lost:
    
        r0 = org.jsoup.parser.b.AfterHead;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012b, code lost:
    
        r9.l = org.jsoup.parser.b.InBody;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0130, code lost:
    
        r9.l = org.jsoup.parser.b.InRow;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0147, code lost:
    
        r9.l = org.jsoup.parser.b.InColumnGroup;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R() {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        b bVar = this.l;
        if (this.e.size() == 0) {
            this.l = b.InBody;
        }
        boolean z2 = false;
        while (true) {
            if (i >= i2) {
                g gVar = this.e.get(i);
                if (i == i2) {
                    if (this.x) {
                        gVar = this.q;
                    }
                    z2 = true;
                }
                String str = gVar != null ? gVar.e.c : "";
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals("frameset")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1321546630:
                        if (str.equals("template")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -906021636:
                        if (str.equals("select")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -636197633:
                        if (str.equals("colgroup")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3696:
                        if (str.equals("td")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3700:
                        if (str.equals("th")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3710:
                        if (str.equals("tr")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3029410:
                        if (str.equals("body")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 3198432:
                        if (str.equals(TtmlNode.TAG_HEAD)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 3213227:
                        if (str.equals("html")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 110115790:
                        if (str.equals(B5.R)) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            c = 14;
                            break;
                        }
                        break;
                }
            }
            i--;
        }
        return this.l != bVar;
    }

    @Override // org.jsoup.parser.e
    public final boolean c(Token token) {
        this.g = token;
        return this.l.i(token, this);
    }

    public final g h(g gVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == gVar) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    public final void i(g gVar) {
        int size = this.r.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            g gVar2 = this.r.get(i3);
            if (gVar2 == null) {
                return;
            }
            if (gVar.e.c.equals(gVar2.e.c) && gVar.e().equals(gVar2.e())) {
                i2++;
            }
            if (i2 == 3) {
                this.r.remove(i3);
                return;
            }
        }
    }

    public final void j() {
        while (!this.r.isEmpty()) {
            int size = this.r.size();
            if ((size > 0 ? this.r.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void k(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            g gVar = this.e.get(size);
            String str = gVar.e.c;
            String[] strArr2 = sqm0.a;
            for (String str2 : strArr) {
                if (str2.equals(str)) {
                    return;
                }
            }
            if (gVar.e.c.equals("html")) {
                return;
            }
            this.e.remove(size);
        }
    }

    public final void l() {
        k(B5.R, "template");
    }

    public final void m(b bVar) {
        if (((ParseErrorList) this.a.c).i()) {
            ((ParseErrorList) this.a.c).add(new j0u0(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, bVar}));
        }
    }

    public final void n(String str) {
        while (sqm0.b(a().e.c, E)) {
            if (str != null && b(str)) {
                return;
            } else {
                I();
            }
        }
    }

    public final void o(boolean z2) {
        String[] strArr = z2 ? F : E;
        while (sqm0.b(a().e.c, strArr)) {
            I();
        }
    }

    public final g p(String str) {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            g gVar = this.r.get(size);
            if (gVar == null) {
                return null;
            }
            if (gVar.e.c.equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    public final g q(String str) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            g gVar = this.e.get(i);
            if (gVar.e.c.equals(str)) {
                return gVar;
            }
            i--;
        }
        return null;
    }

    public final boolean r(String str) {
        String[] strArr = this.y;
        strArr[0] = str;
        return u(strArr, z, B);
    }

    public final boolean s(String str) {
        String[] strArr = this.y;
        strArr[0] = str;
        return u(strArr, z, null);
    }

    public final boolean t(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String str2 = this.e.get(size).e.c;
            if (str2.equals(str)) {
                return true;
            }
            if (!sqm0.b(str2, D)) {
                return false;
            }
        }
        throw new ValidationException("Should not be reachable");
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.l + ", currentElement=" + a() + '}';
    }

    public final boolean u(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i > 100 ? size + NetError.ERR_CONNECTION_RESET : 0;
        while (i >= i2) {
            String str = this.e.get(i).e.c;
            if (!sqm0.b(str, strArr)) {
                if (sqm0.b(str, strArr2) || (strArr3 != null && sqm0.b(str, strArr3))) {
                    break;
                }
                i--;
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean v(String str) {
        String[] strArr = this.y;
        strArr[0] = str;
        return u(strArr, C, null);
    }

    public final void w(StringReader stringReader, String str, od50 od50Var) {
        Document document = new Document(str);
        this.d = document;
        document.l = od50Var;
        this.a = od50Var;
        this.h = cj90.c;
        bmb bmbVar = new bmb(stringReader, 32768);
        this.b = bmbVar;
        ParseErrorList parseErrorList = (ParseErrorList) od50Var.c;
        boolean z2 = parseErrorList.j() > 0;
        if (z2 && bmbVar.i == null) {
            bmbVar.i = new ArrayList<>(InterfaceC4413l1.a.b.i);
            bmbVar.y();
        } else if (!z2) {
            bmbVar.i = null;
        }
        this.g = null;
        this.c = new c(this.b, parseErrorList);
        this.e = new ArrayList<>(32);
        this.i = new HashMap();
        this.f = str;
        this.l = b.Initial;
        this.m = null;
        this.n = false;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = new ArrayList<>();
        this.s = new ArrayList<>();
        this.t = new ArrayList();
        this.u = new Token.f();
        this.v = true;
        this.w = false;
        this.x = false;
    }

    public final g x(Token.g gVar) {
        org.jsoup.nodes.b bVar;
        int i;
        String str;
        if (gVar.r() && (i = (bVar = gVar.m).b) != 0) {
            cj90 cj90Var = this.h;
            int i2 = 0;
            if (i != 0) {
                boolean z2 = cj90Var.b;
                int i3 = 0;
                while (i2 < bVar.c.length) {
                    int i4 = i2 + 1;
                    int i5 = i4;
                    while (true) {
                        String[] strArr = bVar.c;
                        if (i5 < strArr.length && (str = strArr[i5]) != null) {
                            if (!z2 || !strArr[i2].equals(str)) {
                                if (!z2) {
                                    String[] strArr2 = bVar.c;
                                    if (!strArr2[i2].equalsIgnoreCase(strArr2[i5])) {
                                    }
                                }
                                i5++;
                            }
                            i3++;
                            bVar.m(i5);
                            i5--;
                            i5++;
                        }
                    }
                    i2 = i4;
                }
                i2 = i3;
            }
            if (i2 > 0) {
                Object[] objArr = {gVar.d};
                ParseErrorList parseErrorList = (ParseErrorList) this.a.c;
                if (parseErrorList.i()) {
                    parseErrorList.add(new j0u0(this.b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
                }
            }
        }
        if (!gVar.l) {
            c0o0 g = g(gVar.s(), this.h);
            cj90 cj90Var2 = this.h;
            org.jsoup.nodes.b bVar2 = gVar.m;
            cj90Var2.a(bVar2);
            g gVar2 = new g(g, null, bVar2);
            E(gVar2);
            this.e.add(gVar2);
            return gVar2;
        }
        g B2 = B(gVar);
        this.e.add(B2);
        this.c.p(d.Data);
        c cVar = this.c;
        Token.f fVar = this.u;
        fVar.l();
        fVar.t(B2.e.b);
        cVar.i(fVar);
        return B2;
    }

    public final void y(Token.b bVar) {
        z(bVar, a());
    }
}
