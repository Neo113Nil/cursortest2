package org.jsoup.parser;

import com.coremedia.iso.boxes.MetaBox;
import com.ironsource.B5;
import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.ImageSizeKey;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Token;
import ru.ok.android.api.json.JsonToken;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.ad0;
import xsna.c0o0;
import xsna.cj90;
import xsna.kir0;
import xsna.sqm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HtmlTreeBuilderState.java */
/* loaded from: classes8.dex */
public abstract class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b AfterAfterBody;
    public static final b AfterAfterFrameset;
    public static final b AfterBody;
    public static final b AfterFrameset;
    public static final b AfterHead;
    public static final b BeforeHead;
    public static final b BeforeHtml;
    public static final b ForeignContent;
    public static final b InBody;
    public static final b InCaption;
    public static final b InCell;
    public static final b InColumnGroup;
    public static final b InFrameset;
    public static final b InHead;
    public static final b InHeadNoscript;
    public static final b InRow;
    public static final b InSelect;
    public static final b InSelectInTable;
    public static final b InTable;
    public static final b InTableBody;
    public static final b InTableText;
    public static final b InTemplate;
    public static final b Initial;
    public static final b Text;
    private static final String nullString;

    /* compiled from: HtmlTreeBuilderState.java */
    public static /* synthetic */ class q {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            a = iArr;
            try {
                iArr[Token.TokenType.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Token.TokenType.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Token.TokenType.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Token.TokenType.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Token.TokenType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    public static final class z {
        public static final String[] a = {"base", "basefont", "bgsound", "command", "link"};
        public static final String[] b = {"noframes", TtmlNode.TAG_STYLE};
        public static final String[] c = {"body", TtmlNode.TAG_BR, "html"};
        public static final String[] d = {"body", TtmlNode.TAG_BR, "html"};
        public static final String[] e = {"body", TtmlNode.TAG_BR, TtmlNode.TAG_HEAD, "html"};
        public static final String[] f = {"basefont", "bgsound", "link", MetaBox.TYPE, "noframes", TtmlNode.TAG_STYLE};
        public static final String[] g = {"base", "basefont", "bgsound", "command", "link", MetaBox.TYPE, "noframes", "script", TtmlNode.TAG_STYLE, "template", "title"};
        public static final String[] h = {RTCStatsConstants.KEY_ADDRESS, "article", "aside", "blockquote", TtmlNode.CENTER, "details", "dir", TtmlNode.TAG_DIV, "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", TtmlNode.TAG_P, "section", "summary", "ul"};
        public static final String[] i = {"h1", "h2", "h3", "h4", "h5", "h6"};
        public static final String[] j = {RTCStatsConstants.KEY_ADDRESS, TtmlNode.TAG_DIV, TtmlNode.TAG_P};
        public static final String[] k = {"dd", O6.w0};
        public static final String[] l = {"applet", "marquee", "object"};
        public static final String[] m = {"param", "source", "track"};
        public static final String[] n = {"action", "name", "prompt"};
        public static final String[] o = {"caption", "col", "colgroup", "frame", TtmlNode.TAG_HEAD, "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] p = {RTCStatsConstants.KEY_ADDRESS, "article", "aside", "blockquote", "button", TtmlNode.CENTER, "details", "dir", TtmlNode.TAG_DIV, "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        public static final String[] q = {"body", "dd", O6.w0, "html", "li", "optgroup", "option", TtmlNode.TAG_P, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] r = {"a", "b", "big", "code", "em", "font", "i", "nobr", UcumUtils.UCUM_SECONDS, "small", "strike", "strong", TtmlNode.TAG_TT, "u"};
        public static final String[] s = {B5.R, "tbody", "tfoot", "thead", "tr"};
        public static final String[] t = {"tbody", "tfoot", "thead"};
        public static final String[] u = {"td", "th", "tr"};
        public static final String[] v = {"script", TtmlNode.TAG_STYLE, "template"};
        public static final String[] w = {"td", "th"};
        public static final String[] x = {"body", "caption", "col", "colgroup", "html"};
        public static final String[] y = {B5.R, "tbody", "tfoot", "thead", "tr"};
        public static final String[] z = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] A = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] B = {B5.R, "tbody", "tfoot", "thead", "tr"};
        public static final String[] C = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        public static final String[] D = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        public static final String[] E = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        public static final String[] F = {"body", "caption", "col", "colgroup", "html", "td", "th"};
        public static final String[] G = {"input", "keygen", "textarea"};
        public static final String[] H = {"caption", B5.R, "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] I = {"tbody", "tfoot", "thead"};
        public static final String[] J = {TtmlNode.TAG_HEAD, "noscript"};
        public static final String[] K = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] L = {"base", "basefont", "bgsound", "link", MetaBox.TYPE, "noframes", "script", TtmlNode.TAG_STYLE, "template", "title"};
        public static final String[] M = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    }

    static {
        b bVar = new b() { // from class: org.jsoup.parser.b.k
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (b.a(token)) {
                    return true;
                }
                if (token.a()) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (!token.e()) {
                    aVar.l = b.BeforeHtml;
                    return aVar.c(token);
                }
                Token.d dVar = (Token.d) token;
                cj90 cj90Var = aVar.h;
                String sb = dVar.c.toString();
                cj90Var.getClass();
                String trim = sb.trim();
                if (!cj90Var.a) {
                    trim = ad0.C(trim);
                }
                String sb2 = dVar.e.toString();
                String sb3 = dVar.f.toString();
                org.jsoup.nodes.f fVar = new org.jsoup.nodes.f();
                kir0.c(trim);
                kir0.c(sb2);
                kir0.c(sb3);
                fVar.C("name", trim);
                fVar.C("publicId", sb2);
                fVar.C("systemId", sb3);
                if (fVar.E("publicId")) {
                    fVar.C("pubSysKey", Privacy.PUBLIC);
                } else if (fVar.E("systemId")) {
                    fVar.C("pubSysKey", "SYSTEM");
                }
                String str = dVar.d;
                if (str != null) {
                    fVar.C("pubSysKey", str);
                }
                aVar.d.C(fVar);
                if (dVar.g) {
                    aVar.d.m = Document.QuirksMode.quirks;
                }
                aVar.l = b.BeforeHtml;
                return true;
            }
        };
        Initial = bVar;
        b bVar2 = new b() { // from class: org.jsoup.parser.b.r
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (token.e()) {
                    aVar.m(this);
                    return false;
                }
                if (token.a()) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (b.a(token)) {
                    aVar.y((Token.b) token);
                    return true;
                }
                if (token.k()) {
                    Token.g gVar = (Token.g) token;
                    if (gVar.d.equals("html")) {
                        aVar.x(gVar);
                        aVar.l = b.BeforeHead;
                        return true;
                    }
                }
                if (token.j() && sqm0.b(((Token.f) token).d, z.e)) {
                    org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g(aVar.g("html", aVar.h), null, null);
                    aVar.E(gVar2);
                    aVar.e.add(gVar2);
                    aVar.l = b.BeforeHead;
                    return aVar.c(token);
                }
                if (token.j()) {
                    aVar.m(this);
                    return false;
                }
                org.jsoup.nodes.g gVar3 = new org.jsoup.nodes.g(aVar.g("html", aVar.h), null, null);
                aVar.E(gVar3);
                aVar.e.add(gVar3);
                aVar.l = b.BeforeHead;
                return aVar.c(token);
            }
        };
        BeforeHtml = bVar2;
        b bVar3 = new b() { // from class: org.jsoup.parser.b.s
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (b.a(token)) {
                    aVar.y((Token.b) token);
                    return true;
                }
                if (token.a()) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (token.e()) {
                    aVar.m(this);
                    return false;
                }
                if (token.k() && ((Token.g) token).d.equals("html")) {
                    return b.InBody.i(token, aVar);
                }
                if (token.k()) {
                    Token.g gVar = (Token.g) token;
                    if (gVar.d.equals(TtmlNode.TAG_HEAD)) {
                        aVar.o = aVar.x(gVar);
                        aVar.l = b.InHead;
                        return true;
                    }
                }
                if (token.j() && sqm0.b(((Token.f) token).d, z.e)) {
                    aVar.e(TtmlNode.TAG_HEAD);
                    return aVar.c(token);
                }
                if (token.j()) {
                    aVar.m(this);
                    return false;
                }
                aVar.e(TtmlNode.TAG_HEAD);
                return aVar.c(token);
            }
        };
        BeforeHead = bVar3;
        b bVar4 = new b() { // from class: org.jsoup.parser.b.t
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (b.a(token)) {
                    aVar.y((Token.b) token);
                    return true;
                }
                int i2 = q.a[token.b.ordinal()];
                if (i2 == 1) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (i2 == 2) {
                    aVar.m(this);
                    return false;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        aVar.d(TtmlNode.TAG_HEAD);
                        return aVar.c(token);
                    }
                    String str = ((Token.f) token).d;
                    if (str.equals(TtmlNode.TAG_HEAD)) {
                        aVar.I();
                        aVar.l = b.AfterHead;
                        return true;
                    }
                    if (sqm0.b(str, z.c)) {
                        aVar.d(TtmlNode.TAG_HEAD);
                        return aVar.c(token);
                    }
                    if (!str.equals("template")) {
                        aVar.m(this);
                        return false;
                    }
                    if (!aVar.F(str)) {
                        aVar.m(this);
                        return true;
                    }
                    aVar.o(true);
                    if (!str.equals(aVar.a().e.c)) {
                        aVar.m(this);
                    }
                    aVar.J(str);
                    aVar.j();
                    aVar.K();
                    aVar.R();
                    return true;
                }
                Token.g gVar = (Token.g) token;
                String str2 = gVar.d;
                if (str2.equals("html")) {
                    return b.InBody.i(token, aVar);
                }
                if (sqm0.b(str2, z.a)) {
                    org.jsoup.nodes.g B = aVar.B(gVar);
                    if (str2.equals("base") && B.o("href") && !aVar.n) {
                        String a2 = B.a("href");
                        if (a2.length() != 0) {
                            aVar.f = a2;
                            aVar.n = true;
                            Document document = aVar.d;
                            document.getClass();
                            document.G(a2);
                        }
                    }
                    return true;
                }
                if (str2.equals(MetaBox.TYPE)) {
                    aVar.B(gVar);
                    return true;
                }
                if (str2.equals("title")) {
                    aVar.c.p(org.jsoup.parser.d.Rcdata);
                    aVar.m = aVar.l;
                    aVar.l = b.Text;
                    aVar.x(gVar);
                    return true;
                }
                if (sqm0.b(str2, z.b)) {
                    b.b(gVar, aVar);
                    return true;
                }
                if (str2.equals("noscript")) {
                    aVar.x(gVar);
                    aVar.l = b.InHeadNoscript;
                    return true;
                }
                if (str2.equals("script")) {
                    aVar.c.p(org.jsoup.parser.d.ScriptData);
                    aVar.m = aVar.l;
                    aVar.l = b.Text;
                    aVar.x(gVar);
                    return true;
                }
                if (str2.equals(TtmlNode.TAG_HEAD)) {
                    aVar.m(this);
                    return false;
                }
                if (!str2.equals("template")) {
                    aVar.d(TtmlNode.TAG_HEAD);
                    return aVar.c(token);
                }
                aVar.x(gVar);
                aVar.r.add(null);
                aVar.v = false;
                b bVar5 = b.InTemplate;
                aVar.l = bVar5;
                aVar.M(bVar5);
                return true;
            }
        };
        InHead = bVar4;
        b bVar5 = new b() { // from class: org.jsoup.parser.b.u
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (token.e()) {
                    aVar.m(this);
                    return true;
                }
                if (token.k() && ((Token.g) token).d.equals("html")) {
                    b bVar6 = b.InBody;
                    aVar.g = token;
                    return bVar6.i(token, aVar);
                }
                if (token.j() && ((Token.f) token).d.equals("noscript")) {
                    aVar.I();
                    aVar.l = b.InHead;
                    return true;
                }
                if (b.a(token) || token.a() || (token.k() && sqm0.b(((Token.g) token).d, z.f))) {
                    b bVar7 = b.InHead;
                    aVar.g = token;
                    return bVar7.i(token, aVar);
                }
                if (token.j() && ((Token.f) token).d.equals(TtmlNode.TAG_BR)) {
                    aVar.m(this);
                    Token.b bVar8 = new Token.b();
                    bVar8.c = token.toString();
                    aVar.y(bVar8);
                    return true;
                }
                if ((token.k() && sqm0.b(((Token.g) token).d, z.J)) || token.j()) {
                    aVar.m(this);
                    return false;
                }
                aVar.m(this);
                Token.b bVar9 = new Token.b();
                bVar9.c = token.toString();
                aVar.y(bVar9);
                return true;
            }
        };
        InHeadNoscript = bVar5;
        b bVar6 = new b() { // from class: org.jsoup.parser.b.v
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (b.a(token)) {
                    aVar.y((Token.b) token);
                } else if (token.a()) {
                    aVar.A((Token.c) token);
                } else if (token.e()) {
                    aVar.m(this);
                } else if (token.k()) {
                    Token.g gVar = (Token.g) token;
                    String str = gVar.d;
                    if (str.equals("html")) {
                        b bVar7 = b.InBody;
                        aVar.g = token;
                        return bVar7.i(token, aVar);
                    }
                    if (str.equals("body")) {
                        aVar.x(gVar);
                        aVar.v = false;
                        aVar.l = b.InBody;
                    } else if (str.equals("frameset")) {
                        aVar.x(gVar);
                        aVar.l = b.InFrameset;
                    } else if (sqm0.b(str, z.g)) {
                        aVar.m(this);
                        org.jsoup.nodes.g gVar2 = aVar.o;
                        aVar.e.add(gVar2);
                        aVar.L(token, b.InHead);
                        aVar.P(gVar2);
                    } else {
                        if (str.equals(TtmlNode.TAG_HEAD)) {
                            aVar.m(this);
                            return false;
                        }
                        aVar.e("body");
                        aVar.v = true;
                        aVar.c(token);
                    }
                } else if (token.j()) {
                    String str2 = ((Token.f) token).d;
                    if (sqm0.b(str2, z.d)) {
                        aVar.e("body");
                        aVar.v = true;
                        aVar.c(token);
                    } else {
                        if (!str2.equals("template")) {
                            aVar.m(this);
                            return false;
                        }
                        aVar.L(token, b.InHead);
                    }
                } else {
                    aVar.e("body");
                    aVar.v = true;
                    aVar.c(token);
                }
                return true;
            }
        };
        AfterHead = bVar6;
        b bVar7 = new b() { // from class: org.jsoup.parser.b.w
            private static final int MaxStackScan = 24;

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Can't wrap try/catch for region: R(15:69|(6:72|(1:74)|75|(2:77|78)(1:(13:107|108|(2:110|(3:112|(1:115)|116)(3:117|(1:120)|121))|122|(4:124|(1:126)(1:151)|127|(3:128|(2:133|(2:135|(3:143|144|145)(4:137|(1:139)|140|141))(1:146))(3:147|148|149)|142))|152|(1:154)(1:167)|155|156|157|158|(2:160|161)(2:163|164)|162)(10:81|(1:83)(1:106)|84|(1:86)(1:105)|87|(3:89|(2:90|(2:92|(1:95)(1:94))(2:97|98))|96)|99|(1:102)|103|104))|79|70)|168|108|(0)|122|(0)|152|(0)(0)|155|156|157|158|(0)(0)|162) */
            /* JADX WARN: Code restructure failed: missing block: B:166:0x0377, code lost:
            
                r31.r.add(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:172:?, code lost:
            
                return true;
             */
            /* JADX WARN: Removed duplicated region for block: B:110:0x02ae  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x02f1  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x034c  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x0388  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x038b  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x034f  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x0204 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x020d  */
            @Override // org.jsoup.parser.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                char c2;
                org.jsoup.nodes.g q2;
                org.jsoup.nodes.h hVar;
                org.jsoup.nodes.b bVar8;
                char c3;
                String[] strArr;
                org.jsoup.nodes.g gVar;
                int i2;
                List unmodifiableList;
                String str;
                ArrayList<org.jsoup.nodes.g> arrayList;
                int i3 = q.a[token.b.ordinal()];
                String[] strArr2 = org.jsoup.parser.a.G;
                String[] strArr3 = z.i;
                String[] strArr4 = z.l;
                String[] strArr5 = z.q;
                String[] strArr6 = strArr2;
                switch (i3) {
                    case 1:
                        aVar.A((Token.c) token);
                        return true;
                    case 2:
                        aVar.m(this);
                        return false;
                    case 3:
                        String[] strArr7 = strArr6;
                        Token.g gVar2 = (Token.g) token;
                        String str2 = gVar2.d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1644953643:
                                if (str2.equals("frameset")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1377687758:
                                if (str2.equals("button")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1191214428:
                                if (str2.equals("iframe")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1134665583:
                                if (str2.equals("keygen")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1010136971:
                                if (str2.equals("option")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1003243718:
                                if (str2.equals("textarea")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -906021636:
                                if (str2.equals("select")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -891985998:
                                if (str2.equals("strike")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -891980137:
                                if (str2.equals("strong")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -80773204:
                                if (str2.equals("optgroup")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 97:
                                if (str2.equals("a")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case JsonToken.BOOLEAN /* 98 */:
                                if (str2.equals("b")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 105:
                                if (str2.equals("i")) {
                                    c2 = '\f';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case INVALID_INDEX_URL_VALUE:
                                if (str2.equals(UcumUtils.UCUM_SECONDS)) {
                                    c2 = '\r';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                                if (str2.equals("u")) {
                                    c2 = 14;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3152:
                                if (str2.equals(TtmlNode.TAG_BR)) {
                                    c2 = 15;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3200:
                                if (str2.equals("dd")) {
                                    c2 = 16;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3216:
                                if (str2.equals(O6.w0)) {
                                    c2 = 17;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3240:
                                if (str2.equals("em")) {
                                    c2 = 18;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3273:
                                if (str2.equals("h1")) {
                                    c2 = 19;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3274:
                                if (str2.equals("h2")) {
                                    c2 = 20;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3275:
                                if (str2.equals("h3")) {
                                    c2 = 21;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3276:
                                if (str2.equals("h4")) {
                                    c2 = 22;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3277:
                                if (str2.equals("h5")) {
                                    c2 = 23;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3278:
                                if (str2.equals("h6")) {
                                    c2 = 24;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3338:
                                if (str2.equals("hr")) {
                                    c2 = 25;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3453:
                                if (str2.equals("li")) {
                                    c2 = 26;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3632:
                                if (str2.equals("rb")) {
                                    c2 = 27;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3646:
                                if (str2.equals("rp")) {
                                    c2 = 28;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3650:
                                if (str2.equals("rt")) {
                                    c2 = 29;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3712:
                                if (str2.equals(TtmlNode.TAG_TT)) {
                                    c2 = 30;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 97536:
                                if (str2.equals("big")) {
                                    c2 = 31;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 104387:
                                if (str2.equals("img")) {
                                    c2 = ' ';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 111267:
                                if (str2.equals("pre")) {
                                    c2 = '!';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 113249:
                                if (str2.equals("rtc")) {
                                    c2 = '\"';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 114276:
                                if (str2.equals("svg")) {
                                    c2 = '#';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 117511:
                                if (str2.equals("wbr")) {
                                    c2 = '$';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 118811:
                                if (str2.equals("xmp")) {
                                    c2 = '%';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3002509:
                                if (str2.equals("area")) {
                                    c2 = '&';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3029410:
                                if (str2.equals("body")) {
                                    c2 = '\'';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3059181:
                                if (str2.equals("code")) {
                                    c2 = '(';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3148879:
                                if (str2.equals("font")) {
                                    c2 = ')';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3148996:
                                if (str2.equals("form")) {
                                    c2 = ImageSizeKey.SIZE_KEY_BASE;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3213227:
                                if (str2.equals("html")) {
                                    c2 = '+';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3344136:
                                if (str2.equals("math")) {
                                    c2 = ',';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3386833:
                                if (str2.equals("nobr")) {
                                    c2 = '-';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3536714:
                                if (str2.equals(TtmlNode.TAG_SPAN)) {
                                    c2 = JwtParser.SEPARATOR_CHAR;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96620249:
                                if (str2.equals("embed")) {
                                    c2 = '/';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 100313435:
                                if (str2.equals("image")) {
                                    c2 = ImageSizeKey.SIZE_KEY_UNDEFINED;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 100358090:
                                if (str2.equals("input")) {
                                    c2 = '1';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 109548807:
                                if (str2.equals("small")) {
                                    c2 = '2';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 110115790:
                                if (str2.equals(B5.R)) {
                                    c2 = '3';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 181975684:
                                if (str2.equals("listing")) {
                                    c2 = '4';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1973234167:
                                if (str2.equals("plaintext")) {
                                    c2 = '5';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2091304424:
                                if (str2.equals("isindex")) {
                                    c2 = '6';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2115613112:
                                if (str2.equals("noembed")) {
                                    c2 = '7';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        String[] strArr8 = z.j;
                        switch (c2) {
                            case 0:
                                aVar.m(this);
                                ArrayList<org.jsoup.nodes.g> arrayList2 = aVar.e;
                                if (arrayList2.size() == 1) {
                                    return false;
                                }
                                if ((arrayList2.size() > 2 && !arrayList2.get(1).e.c.equals("body")) || !aVar.v) {
                                    return false;
                                }
                                org.jsoup.nodes.g gVar3 = arrayList2.get(1);
                                org.jsoup.nodes.j jVar = gVar3.b;
                                if (((org.jsoup.nodes.g) jVar) != null && jVar != null) {
                                    jVar.A(gVar3);
                                }
                                while (arrayList2.size() > 1) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                }
                                aVar.x(gVar2);
                                aVar.l = b.InFrameset;
                                return true;
                            case 1:
                                if (aVar.r("button")) {
                                    aVar.m(this);
                                    aVar.d("button");
                                    aVar.c(gVar2);
                                    return true;
                                }
                                aVar.N();
                                aVar.x(gVar2);
                                aVar.v = false;
                                return true;
                            case 2:
                                aVar.v = false;
                                b.b(gVar2, aVar);
                                return true;
                            case 3:
                            case 15:
                            case ' ':
                            case '$':
                            case '&':
                            case '/':
                                aVar.N();
                                aVar.B(gVar2);
                                aVar.v = false;
                                return true;
                            case 4:
                            case '\t':
                                if (aVar.b("option")) {
                                    aVar.d("option");
                                }
                                aVar.N();
                                aVar.x(gVar2);
                                return true;
                            case 5:
                                aVar.x(gVar2);
                                if (!gVar2.l) {
                                    aVar.c.p(org.jsoup.parser.d.Rcdata);
                                    aVar.m = aVar.l;
                                    aVar.v = false;
                                    aVar.l = b.Text;
                                    return true;
                                }
                                return true;
                            case 6:
                                aVar.N();
                                aVar.x(gVar2);
                                aVar.v = false;
                                if (!gVar2.l) {
                                    b bVar9 = aVar.l;
                                    if (bVar9.equals(b.InTable) || bVar9.equals(b.InCaption) || bVar9.equals(b.InTableBody) || bVar9.equals(b.InRow) || bVar9.equals(b.InCell)) {
                                        aVar.l = b.InSelectInTable;
                                        return true;
                                    }
                                    aVar.l = b.InSelect;
                                    return true;
                                }
                                return true;
                            case 7:
                            case '\b':
                            case 11:
                            case '\f':
                            case '\r':
                            case 14:
                            case 18:
                            case 30:
                            case 31:
                            case '(':
                            case ')':
                            case '2':
                                aVar.N();
                                org.jsoup.nodes.g x2 = aVar.x(gVar2);
                                aVar.i(x2);
                                aVar.r.add(x2);
                                return true;
                            case '\n':
                                if (aVar.p("a") != null) {
                                    aVar.m(this);
                                    aVar.d("a");
                                    org.jsoup.nodes.g q3 = aVar.q("a");
                                    if (q3 != null) {
                                        aVar.O(q3);
                                        aVar.P(q3);
                                    }
                                }
                                aVar.N();
                                org.jsoup.nodes.g x3 = aVar.x(gVar2);
                                aVar.i(x3);
                                aVar.r.add(x3);
                                return true;
                            case 16:
                            case 17:
                                aVar.v = false;
                                ArrayList<org.jsoup.nodes.g> arrayList3 = aVar.e;
                                int size = arrayList3.size();
                                int i4 = size - 1;
                                int i5 = i4 >= 24 ? size - 25 : 0;
                                while (true) {
                                    if (i4 >= i5) {
                                        c0o0 c0o0Var = arrayList3.get(i4).e;
                                        if (sqm0.b(c0o0Var.c, z.k)) {
                                            aVar.d(c0o0Var.c);
                                        } else if (!sqm0.b(c0o0Var.c, strArr7) || sqm0.b(c0o0Var.c, strArr8)) {
                                            i4--;
                                        }
                                    }
                                }
                                if (aVar.r(TtmlNode.TAG_P)) {
                                    aVar.d(TtmlNode.TAG_P);
                                }
                                aVar.x(gVar2);
                                return true;
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                                if (aVar.r(TtmlNode.TAG_P)) {
                                    aVar.d(TtmlNode.TAG_P);
                                }
                                if (sqm0.b(aVar.a().e.c, strArr3)) {
                                    aVar.m(this);
                                    aVar.I();
                                }
                                aVar.x(gVar2);
                                return true;
                            case 25:
                                if (aVar.r(TtmlNode.TAG_P)) {
                                    aVar.d(TtmlNode.TAG_P);
                                }
                                aVar.B(gVar2);
                                aVar.v = false;
                                return true;
                            case 26:
                                aVar.v = false;
                                ArrayList<org.jsoup.nodes.g> arrayList4 = aVar.e;
                                int size2 = arrayList4.size() - 1;
                                while (true) {
                                    if (size2 > 0) {
                                        c0o0 c0o0Var2 = arrayList4.get(size2).e;
                                        if (c0o0Var2.c.equals("li")) {
                                            aVar.d("li");
                                        } else {
                                            String[] strArr9 = strArr7;
                                            if (!sqm0.b(c0o0Var2.c, strArr9) || sqm0.b(c0o0Var2.c, strArr8)) {
                                                size2--;
                                                strArr7 = strArr9;
                                            }
                                        }
                                    }
                                }
                                if (aVar.r(TtmlNode.TAG_P)) {
                                    aVar.d(TtmlNode.TAG_P);
                                }
                                aVar.x(gVar2);
                                return true;
                            case 27:
                            case '\"':
                                if (aVar.s("ruby")) {
                                    aVar.o(false);
                                    if (!aVar.b("ruby")) {
                                        aVar.m(this);
                                    }
                                }
                                aVar.x(gVar2);
                                return true;
                            case 28:
                            case 29:
                                if (aVar.s("ruby")) {
                                    aVar.n("rtc");
                                    if (!aVar.b("rtc") && !aVar.b("ruby")) {
                                        aVar.m(this);
                                    }
                                }
                                aVar.x(gVar2);
                                return true;
                            case '!':
                            case '4':
                                if (aVar.r(TtmlNode.TAG_P)) {
                                    aVar.d(TtmlNode.TAG_P);
                                }
                                aVar.x(gVar2);
                                aVar.b.p("\n");
                                aVar.v = false;
                                return true;
                            case '#':
                                aVar.N();
                                aVar.x(gVar2);
                                return true;
                            case '%':
                                if (aVar.r(TtmlNode.TAG_P)) {
                                    aVar.d(TtmlNode.TAG_P);
                                }
                                aVar.N();
                                aVar.v = false;
                                b.b(gVar2, aVar);
                                return true;
                            case '\'':
                                aVar.m(this);
                                ArrayList<org.jsoup.nodes.g> arrayList5 = aVar.e;
                                if (arrayList5.size() == 1) {
                                    return false;
                                }
                                if ((arrayList5.size() > 2 && !arrayList5.get(1).e.c.equals("body")) || aVar.F("template")) {
                                    return false;
                                }
                                aVar.v = false;
                                if (gVar2.r() && (q2 = aVar.q("body")) != null) {
                                    org.jsoup.nodes.b bVar10 = gVar2.m;
                                    bVar10.getClass();
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < bVar10.b && org.jsoup.nodes.b.j(bVar10.c[i6])) {
                                            i6++;
                                        } else if (i6 < bVar10.b) {
                                            String str3 = bVar10.c[i6];
                                            String str4 = (String) bVar10.d[i6];
                                            org.jsoup.nodes.a aVar2 = new org.jsoup.nodes.a();
                                            kir0.c(str3);
                                            String trim = str3.trim();
                                            kir0.b(trim);
                                            aVar2.b = trim;
                                            aVar2.c = str4;
                                            aVar2.d = bVar10;
                                            i6++;
                                            if (!q2.o(trim)) {
                                                q2.e().l(aVar2);
                                            }
                                        }
                                    }
                                }
                                return true;
                            case '*':
                                if (aVar.p != null && !aVar.F("template")) {
                                    aVar.m(this);
                                    return false;
                                }
                                if (aVar.r(TtmlNode.TAG_P)) {
                                    aVar.n(TtmlNode.TAG_P);
                                    if (!TtmlNode.TAG_P.equals(aVar.a().e.c)) {
                                        aVar.m(aVar.l);
                                    }
                                    aVar.J(TtmlNode.TAG_P);
                                }
                                aVar.C(gVar2, true, true);
                                return true;
                            case '+':
                                aVar.m(this);
                                if (aVar.F("template")) {
                                    return false;
                                }
                                if (aVar.e.size() > 0) {
                                    org.jsoup.nodes.g gVar4 = aVar.e.get(0);
                                    if (gVar2.r()) {
                                        org.jsoup.nodes.b bVar11 = gVar2.m;
                                        bVar11.getClass();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 < bVar11.b && org.jsoup.nodes.b.j(bVar11.c[i7])) {
                                                i7++;
                                            } else if (i7 < bVar11.b) {
                                                String str5 = bVar11.c[i7];
                                                String str6 = (String) bVar11.d[i7];
                                                org.jsoup.nodes.a aVar3 = new org.jsoup.nodes.a();
                                                kir0.c(str5);
                                                String trim2 = str5.trim();
                                                kir0.b(trim2);
                                                aVar3.b = trim2;
                                                aVar3.c = str6;
                                                aVar3.d = bVar11;
                                                i7++;
                                                if (!gVar4.o(trim2)) {
                                                    gVar4.e().l(aVar3);
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            case ',':
                                aVar.N();
                                aVar.x(gVar2);
                                return true;
                            case '-':
                                aVar.N();
                                if (aVar.s("nobr")) {
                                    aVar.m(this);
                                    aVar.d("nobr");
                                    aVar.N();
                                }
                                org.jsoup.nodes.g x4 = aVar.x(gVar2);
                                aVar.i(x4);
                                aVar.r.add(x4);
                                return true;
                            case '.':
                                aVar.N();
                                aVar.x(gVar2);
                                return true;
                            case '0':
                                if (aVar.q("svg") == null) {
                                    gVar2.t("img");
                                    return aVar.c(gVar2);
                                }
                                aVar.x(gVar2);
                                return true;
                            case '1':
                                aVar.N();
                                if (!aVar.B(gVar2).c("type").equalsIgnoreCase("hidden")) {
                                    aVar.v = false;
                                    return true;
                                }
                                return true;
                            case '3':
                                if (aVar.d.m != Document.QuirksMode.quirks && aVar.r(TtmlNode.TAG_P)) {
                                    aVar.d(TtmlNode.TAG_P);
                                }
                                aVar.x(gVar2);
                                aVar.v = false;
                                aVar.l = b.InTable;
                                return true;
                            case '5':
                                if (aVar.r(TtmlNode.TAG_P)) {
                                    aVar.d(TtmlNode.TAG_P);
                                }
                                aVar.x(gVar2);
                                aVar.c.p(org.jsoup.parser.d.PLAINTEXT);
                                return true;
                            case '6':
                                aVar.m(this);
                                if (aVar.p != null) {
                                    return false;
                                }
                                aVar.e("form");
                                org.jsoup.nodes.b bVar12 = gVar2.m;
                                if (bVar12 != null && bVar12.h("action") != -1 && (hVar = aVar.p) != null && (bVar8 = gVar2.m) != null && bVar8.h("action") != -1) {
                                    hVar.e().k("action", gVar2.m.f("action"));
                                }
                                aVar.e("hr");
                                aVar.e("label");
                                org.jsoup.nodes.b bVar13 = gVar2.m;
                                String f2 = (bVar13 == null || bVar13.h("prompt") == -1) ? "This is a searchable index. Enter search keywords: " : gVar2.m.f("prompt");
                                Token.b bVar14 = new Token.b();
                                bVar14.c = f2;
                                aVar.c(bVar14);
                                org.jsoup.nodes.b bVar15 = new org.jsoup.nodes.b();
                                if (gVar2.r()) {
                                    org.jsoup.nodes.b bVar16 = gVar2.m;
                                    bVar16.getClass();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 < bVar16.b && org.jsoup.nodes.b.j(bVar16.c[i8])) {
                                            i8++;
                                        } else if (i8 < bVar16.b) {
                                            String str7 = bVar16.c[i8];
                                            String str8 = (String) bVar16.d[i8];
                                            org.jsoup.nodes.a aVar4 = new org.jsoup.nodes.a();
                                            kir0.c(str7);
                                            String trim3 = str7.trim();
                                            kir0.b(trim3);
                                            aVar4.b = trim3;
                                            aVar4.c = str8;
                                            aVar4.d = bVar16;
                                            i8++;
                                            if (!sqm0.b(trim3, z.n)) {
                                                bVar15.l(aVar4);
                                            }
                                        }
                                    }
                                }
                                bVar15.k("name", "isindex");
                                Token.g gVar5 = aVar.j;
                                if (aVar.g == gVar5) {
                                    Token.g gVar6 = new Token.g();
                                    gVar6.c = "input";
                                    gVar6.m = bVar15;
                                    gVar6.d = ad0.C("input");
                                    aVar.c(gVar6);
                                } else {
                                    gVar5.l();
                                    gVar5.c = "input";
                                    gVar5.m = bVar15;
                                    gVar5.d = ad0.C("input");
                                    aVar.c(gVar5);
                                }
                                aVar.d("label");
                                aVar.e("hr");
                                aVar.d("form");
                                return true;
                            case '7':
                                b.b(gVar2, aVar);
                                return true;
                            default:
                                if (!c0o0.k.containsKey(str2)) {
                                    aVar.x(gVar2);
                                    return true;
                                }
                                if (sqm0.b(str2, z.h)) {
                                    if (aVar.r(TtmlNode.TAG_P)) {
                                        aVar.d(TtmlNode.TAG_P);
                                    }
                                    aVar.x(gVar2);
                                    return true;
                                }
                                if (sqm0.b(str2, z.g)) {
                                    b bVar17 = b.InHead;
                                    aVar.g = token;
                                    return bVar17.i(token, aVar);
                                }
                                if (sqm0.b(str2, strArr4)) {
                                    aVar.N();
                                    aVar.x(gVar2);
                                    aVar.r.add(null);
                                    aVar.v = false;
                                    return true;
                                }
                                if (sqm0.b(str2, z.m)) {
                                    aVar.B(gVar2);
                                    return true;
                                }
                                if (sqm0.b(str2, z.o)) {
                                    aVar.m(this);
                                    return false;
                                }
                                aVar.N();
                                aVar.x(gVar2);
                                return true;
                        }
                    case 4:
                        Token.f fVar = (Token.f) token;
                        String str9 = fVar.d;
                        str9.getClass();
                        switch (str9.hashCode()) {
                            case -1321546630:
                                if (str9.equals("template")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 112:
                                if (str9.equals(TtmlNode.TAG_P)) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3152:
                                if (str9.equals(TtmlNode.TAG_BR)) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3200:
                                if (str9.equals("dd")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3216:
                                if (str9.equals(O6.w0)) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3273:
                                if (str9.equals("h1")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3274:
                                if (str9.equals("h2")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3275:
                                if (str9.equals("h3")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3276:
                                if (str9.equals("h4")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3277:
                                if (str9.equals("h5")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3278:
                                if (str9.equals("h6")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3453:
                                if (str9.equals("li")) {
                                    c3 = 11;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3029410:
                                if (str9.equals("body")) {
                                    c3 = '\f';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3148996:
                                if (str9.equals("form")) {
                                    c3 = '\r';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3213227:
                                if (str9.equals("html")) {
                                    c3 = 14;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3536714:
                                if (str9.equals(TtmlNode.TAG_SPAN)) {
                                    c3 = 15;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1869063452:
                                if (str9.equals("sarcasm")) {
                                    c3 = 16;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        String[] strArr10 = org.jsoup.parser.a.z;
                        switch (c3) {
                            case 0:
                                aVar.L(token, b.InHead);
                                return true;
                            case 1:
                                if (!aVar.r(str9)) {
                                    aVar.m(this);
                                    aVar.e(str9);
                                    return aVar.c(fVar);
                                }
                                aVar.n(str9);
                                if (!aVar.b(str9)) {
                                    aVar.m(this);
                                }
                                aVar.J(str9);
                                return true;
                            case 2:
                                aVar.m(this);
                                aVar.e(TtmlNode.TAG_BR);
                                return false;
                            case 3:
                            case 4:
                                if (!aVar.s(str9)) {
                                    aVar.m(this);
                                    return false;
                                }
                                aVar.n(str9);
                                if (!aVar.b(str9)) {
                                    aVar.m(this);
                                }
                                aVar.J(str9);
                                return true;
                            case 5:
                            case 6:
                            case 7:
                            case '\b':
                            case '\t':
                            case '\n':
                                if (!aVar.u(strArr3, strArr10, null)) {
                                    aVar.m(this);
                                    return false;
                                }
                                aVar.n(str9);
                                if (!aVar.b(str9)) {
                                    aVar.m(this);
                                }
                                for (int size3 = aVar.e.size() - 1; size3 >= 0; size3--) {
                                    org.jsoup.nodes.g gVar7 = aVar.e.get(size3);
                                    aVar.e.remove(size3);
                                    if (sqm0.b(gVar7.e.c, strArr3)) {
                                        break;
                                    }
                                }
                                break;
                            case 11:
                                String[] strArr11 = aVar.y;
                                strArr11[0] = str9;
                                if (!aVar.u(strArr11, strArr10, org.jsoup.parser.a.A)) {
                                    aVar.m(this);
                                    return false;
                                }
                                aVar.n(str9);
                                if (!aVar.b(str9)) {
                                    aVar.m(this);
                                }
                                aVar.J(str9);
                                return true;
                            case '\f':
                                if (!aVar.s("body")) {
                                    aVar.m(this);
                                    return false;
                                }
                                if (aVar.H(strArr5)) {
                                    aVar.m(this);
                                }
                                aVar.l = b.AfterBody;
                                return true;
                            case '\r':
                                if (aVar.F("template")) {
                                    if (!aVar.s(str9)) {
                                        aVar.m(this);
                                        return false;
                                    }
                                    aVar.o(false);
                                    if (!aVar.b(str9)) {
                                        aVar.m(this);
                                    }
                                    aVar.J(str9);
                                    return true;
                                }
                                org.jsoup.nodes.g gVar8 = aVar.p;
                                aVar.p = null;
                                if (gVar8 == null || !aVar.s(str9)) {
                                    aVar.m(this);
                                    return false;
                                }
                                aVar.o(false);
                                if (!aVar.b(str9)) {
                                    aVar.m(this);
                                }
                                aVar.P(gVar8);
                                return true;
                            case 14:
                                if (!aVar.F("body")) {
                                    aVar.m(this);
                                    return false;
                                }
                                if (aVar.H(strArr5)) {
                                    aVar.m(this);
                                }
                                aVar.l = b.AfterBody;
                                return aVar.c(token);
                            case 15:
                            case 16:
                                return j(token, aVar);
                            default:
                                if (sqm0.b(str9, z.r)) {
                                    String str10 = fVar.d;
                                    ArrayList<org.jsoup.nodes.g> arrayList6 = aVar.e;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= 8) {
                                            break;
                                        } else {
                                            org.jsoup.nodes.g p2 = aVar.p(str10);
                                            if (p2 == null) {
                                                return j(token, aVar);
                                            }
                                            c0o0 c0o0Var3 = p2.e;
                                            if (!org.jsoup.parser.a.G(aVar.e, p2)) {
                                                aVar.m(this);
                                                aVar.O(p2);
                                                break;
                                            } else {
                                                if (!aVar.s(c0o0Var3.c)) {
                                                    aVar.m(this);
                                                    return false;
                                                }
                                                if (aVar.a() != p2) {
                                                    aVar.m(this);
                                                }
                                                int size4 = arrayList6.size();
                                                boolean z2 = false;
                                                int i10 = 1;
                                                org.jsoup.nodes.g gVar9 = null;
                                                int i11 = -1;
                                                while (i10 < size4 && i10 < 64) {
                                                    gVar = arrayList6.get(i10);
                                                    if (gVar == p2) {
                                                        gVar9 = arrayList6.get(i10 - 1);
                                                        i11 = 0;
                                                        while (true) {
                                                            if (i11 >= aVar.r.size()) {
                                                                i11 = -1;
                                                            } else if (gVar != aVar.r.get(i11)) {
                                                                i11++;
                                                            }
                                                        }
                                                        strArr = strArr6;
                                                        z2 = true;
                                                    } else if (z2) {
                                                        strArr = strArr6;
                                                        if (sqm0.b(gVar.e.c, strArr)) {
                                                            if (gVar != null) {
                                                                aVar.J(c0o0Var3.c);
                                                                aVar.O(p2);
                                                                break;
                                                            } else {
                                                                org.jsoup.nodes.g gVar10 = gVar;
                                                                org.jsoup.nodes.g gVar11 = gVar10;
                                                                int i12 = 0;
                                                                while (i12 < 3) {
                                                                    if (org.jsoup.parser.a.G(aVar.e, gVar10)) {
                                                                        gVar10 = aVar.h(gVar10);
                                                                    }
                                                                    if (!org.jsoup.parser.a.G(aVar.r, gVar10)) {
                                                                        aVar.P(gVar10);
                                                                        str = str10;
                                                                        arrayList = arrayList6;
                                                                    } else if (gVar10 == p2) {
                                                                        String str11 = str10;
                                                                        ArrayList<org.jsoup.nodes.g> arrayList7 = arrayList6;
                                                                        if (gVar9 != null) {
                                                                            if (sqm0.b(gVar9.e.c, z.s)) {
                                                                                org.jsoup.nodes.j jVar2 = gVar11.b;
                                                                                if (((org.jsoup.nodes.g) jVar2) != null && jVar2 != null) {
                                                                                    jVar2.A(gVar11);
                                                                                }
                                                                                aVar.D(gVar11);
                                                                            } else {
                                                                                org.jsoup.nodes.j jVar3 = gVar11.b;
                                                                                if (((org.jsoup.nodes.g) jVar3) != null && jVar3 != null) {
                                                                                    jVar3.A(gVar11);
                                                                                }
                                                                                gVar9.C(gVar11);
                                                                            }
                                                                        }
                                                                        org.jsoup.nodes.g gVar12 = new org.jsoup.nodes.g(c0o0Var3, aVar.f, null);
                                                                        org.jsoup.nodes.b e2 = gVar12.e();
                                                                        org.jsoup.nodes.b e3 = p2.e();
                                                                        e2.getClass();
                                                                        i2 = e3.b;
                                                                        if (i2 != 0) {
                                                                            e2.c(e2.b + i2);
                                                                            boolean z3 = e2.b != 0;
                                                                            int i13 = 0;
                                                                            while (true) {
                                                                                if (i13 < e3.b && org.jsoup.nodes.b.j(e3.c[i13])) {
                                                                                    i13++;
                                                                                } else if (i13 < e3.b) {
                                                                                    String str12 = e3.c[i13];
                                                                                    String str13 = (String) e3.d[i13];
                                                                                    org.jsoup.nodes.a aVar5 = new org.jsoup.nodes.a();
                                                                                    kir0.c(str12);
                                                                                    String trim4 = str12.trim();
                                                                                    kir0.b(trim4);
                                                                                    aVar5.b = trim4;
                                                                                    aVar5.c = str13;
                                                                                    aVar5.d = e3;
                                                                                    i13++;
                                                                                    if (z3) {
                                                                                        e2.l(aVar5);
                                                                                    } else {
                                                                                        if (str13 == null) {
                                                                                            str13 = "";
                                                                                        }
                                                                                        e2.a(trim4, str13);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gVar.j() != 0) {
                                                                            unmodifiableList = org.jsoup.nodes.j.d;
                                                                        } else {
                                                                            List<org.jsoup.nodes.j> n2 = gVar.n();
                                                                            ArrayList arrayList8 = new ArrayList(n2.size());
                                                                            arrayList8.addAll(n2);
                                                                            unmodifiableList = Collections.unmodifiableList(arrayList8);
                                                                        }
                                                                        gVar12.H(unmodifiableList);
                                                                        gVar.C(gVar12);
                                                                        aVar.O(p2);
                                                                        aVar.i(gVar12);
                                                                        aVar.r.add(i11, gVar12);
                                                                        aVar.P(p2);
                                                                        int lastIndexOf = aVar.e.lastIndexOf(gVar);
                                                                        kir0.a(lastIndexOf == -1);
                                                                        aVar.e.add(lastIndexOf + 1, gVar12);
                                                                        i9++;
                                                                        strArr6 = strArr;
                                                                        str10 = str11;
                                                                        arrayList6 = arrayList7;
                                                                    } else {
                                                                        str = str10;
                                                                        arrayList = arrayList6;
                                                                        org.jsoup.nodes.g gVar13 = new org.jsoup.nodes.g(aVar.g(gVar10.s(), cj90.d), aVar.f, null);
                                                                        ArrayList<org.jsoup.nodes.g> arrayList9 = aVar.r;
                                                                        int lastIndexOf2 = arrayList9.lastIndexOf(gVar10);
                                                                        kir0.a(lastIndexOf2 != -1);
                                                                        arrayList9.set(lastIndexOf2, gVar13);
                                                                        ArrayList<org.jsoup.nodes.g> arrayList10 = aVar.e;
                                                                        int lastIndexOf3 = arrayList10.lastIndexOf(gVar10);
                                                                        kir0.a(lastIndexOf3 != -1);
                                                                        arrayList10.set(lastIndexOf3, gVar13);
                                                                        if (gVar11 == gVar) {
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 >= aVar.r.size()) {
                                                                                    i14 = -1;
                                                                                } else if (gVar13 != aVar.r.get(i14)) {
                                                                                    i14++;
                                                                                }
                                                                            }
                                                                            i11 = i14 + 1;
                                                                        }
                                                                        org.jsoup.nodes.j jVar4 = gVar11.b;
                                                                        if (((org.jsoup.nodes.g) jVar4) != null && jVar4 != null) {
                                                                            jVar4.A(gVar11);
                                                                        }
                                                                        gVar13.C(gVar11);
                                                                        gVar10 = gVar13;
                                                                        gVar11 = gVar10;
                                                                    }
                                                                    i12++;
                                                                    str10 = str;
                                                                    arrayList6 = arrayList;
                                                                }
                                                                String str112 = str10;
                                                                ArrayList<org.jsoup.nodes.g> arrayList72 = arrayList6;
                                                                if (gVar9 != null) {
                                                                }
                                                                org.jsoup.nodes.g gVar122 = new org.jsoup.nodes.g(c0o0Var3, aVar.f, null);
                                                                org.jsoup.nodes.b e22 = gVar122.e();
                                                                org.jsoup.nodes.b e32 = p2.e();
                                                                e22.getClass();
                                                                i2 = e32.b;
                                                                if (i2 != 0) {
                                                                }
                                                                if (gVar.j() != 0) {
                                                                }
                                                                gVar122.H(unmodifiableList);
                                                                gVar.C(gVar122);
                                                                aVar.O(p2);
                                                                aVar.i(gVar122);
                                                                aVar.r.add(i11, gVar122);
                                                                aVar.P(p2);
                                                                int lastIndexOf4 = aVar.e.lastIndexOf(gVar);
                                                                kir0.a(lastIndexOf4 == -1);
                                                                aVar.e.add(lastIndexOf4 + 1, gVar122);
                                                                i9++;
                                                                strArr6 = strArr;
                                                                str10 = str112;
                                                                arrayList6 = arrayList72;
                                                            }
                                                        }
                                                    } else {
                                                        strArr = strArr6;
                                                    }
                                                    i10++;
                                                    strArr6 = strArr;
                                                }
                                                strArr = strArr6;
                                                gVar = null;
                                                if (gVar != null) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (sqm0.b(str9, z.p)) {
                                        if (!aVar.s(str9)) {
                                            aVar.m(this);
                                            return false;
                                        }
                                        aVar.o(false);
                                        if (!aVar.b(str9)) {
                                            aVar.m(this);
                                        }
                                        aVar.J(str9);
                                        return true;
                                    }
                                    if (!sqm0.b(str9, strArr4)) {
                                        return j(token, aVar);
                                    }
                                    if (!aVar.s("name")) {
                                        if (!aVar.s(str9)) {
                                            aVar.m(this);
                                            return false;
                                        }
                                        aVar.o(false);
                                        if (!aVar.b(str9)) {
                                            aVar.m(this);
                                        }
                                        aVar.J(str9);
                                        aVar.j();
                                        return true;
                                    }
                                }
                                break;
                        }
                        return true;
                    case 5:
                        Token.b bVar18 = (Token.b) token;
                        if (bVar18.c.equals(b.nullString)) {
                            aVar.m(this);
                            return false;
                        }
                        if (aVar.v && b.a(bVar18)) {
                            aVar.N();
                            aVar.y(bVar18);
                            return true;
                        }
                        aVar.N();
                        aVar.y(bVar18);
                        aVar.v = false;
                        return true;
                    case 6:
                        if (aVar.s.size() > 0) {
                            b bVar19 = b.InTemplate;
                            aVar.g = token;
                            return bVar19.i(token, aVar);
                        }
                        if (aVar.H(strArr5)) {
                            aVar.m(this);
                            return true;
                        }
                        return true;
                    default:
                        return true;
                }
            }

            public final boolean j(Token token, org.jsoup.parser.a aVar) {
                token.getClass();
                String str = ((Token.f) token).d;
                ArrayList<org.jsoup.nodes.g> arrayList = aVar.e;
                if (aVar.q(str) == null) {
                    aVar.m(this);
                    return false;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    org.jsoup.nodes.g gVar = arrayList.get(size);
                    if (gVar.e.c.equals(str)) {
                        aVar.n(str);
                        if (!aVar.b(str)) {
                            aVar.m(this);
                        }
                        aVar.J(str);
                        return true;
                    }
                    if (sqm0.b(gVar.e.c, org.jsoup.parser.a.G)) {
                        aVar.m(this);
                        return false;
                    }
                }
                return true;
            }
        };
        InBody = bVar7;
        b bVar8 = new b() { // from class: org.jsoup.parser.b.x
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (token.b == Token.TokenType.Character) {
                    aVar.y((Token.b) token);
                    return true;
                }
                if (token.i()) {
                    aVar.m(this);
                    aVar.I();
                    aVar.l = aVar.m;
                    return aVar.c(token);
                }
                if (!token.j()) {
                    return true;
                }
                aVar.I();
                aVar.l = aVar.m;
                return true;
            }
        };
        Text = bVar8;
        b bVar9 = new b() { // from class: org.jsoup.parser.b.y
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (token.b == Token.TokenType.Character && sqm0.b(aVar.a().e.c, z.B)) {
                    aVar.t = new ArrayList();
                    aVar.m = aVar.l;
                    aVar.l = b.InTableText;
                    return aVar.c(token);
                }
                if (token.a()) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (token.e()) {
                    aVar.m(this);
                    return false;
                }
                if (!token.k()) {
                    if (!token.j()) {
                        if (!token.i()) {
                            j(token, aVar);
                            return true;
                        }
                        if (aVar.b("html")) {
                            aVar.m(this);
                        }
                        return true;
                    }
                    String str = ((Token.f) token).d;
                    if (str.equals(B5.R)) {
                        if (!aVar.v(str)) {
                            aVar.m(this);
                            return false;
                        }
                        aVar.J(B5.R);
                        aVar.R();
                        return true;
                    }
                    if (sqm0.b(str, z.A)) {
                        aVar.m(this);
                        return false;
                    }
                    if (str.equals("template")) {
                        aVar.L(token, b.InHead);
                        return true;
                    }
                    j(token, aVar);
                    return true;
                }
                Token.g gVar = (Token.g) token;
                String str2 = gVar.d;
                if (str2.equals("caption")) {
                    aVar.l();
                    aVar.r.add(null);
                    aVar.x(gVar);
                    aVar.l = b.InCaption;
                    return true;
                }
                if (str2.equals("colgroup")) {
                    aVar.l();
                    aVar.x(gVar);
                    aVar.l = b.InColumnGroup;
                    return true;
                }
                if (str2.equals("col")) {
                    aVar.l();
                    aVar.e("colgroup");
                    return aVar.c(token);
                }
                if (sqm0.b(str2, z.t)) {
                    aVar.l();
                    aVar.x(gVar);
                    aVar.l = b.InTableBody;
                    return true;
                }
                if (sqm0.b(str2, z.u)) {
                    aVar.l();
                    aVar.e("tbody");
                    return aVar.c(token);
                }
                if (str2.equals(B5.R)) {
                    aVar.m(this);
                    if (aVar.v(str2)) {
                        aVar.J(str2);
                        if (aVar.R()) {
                            return aVar.c(token);
                        }
                        aVar.x(gVar);
                        return true;
                    }
                } else {
                    if (sqm0.b(str2, z.v)) {
                        b bVar10 = b.InHead;
                        aVar.g = token;
                        return bVar10.i(token, aVar);
                    }
                    if (str2.equals("input")) {
                        if (gVar.r() && gVar.m.f("type").equalsIgnoreCase("hidden")) {
                            aVar.B(gVar);
                            return true;
                        }
                        j(token, aVar);
                        return true;
                    }
                    if (!str2.equals("form")) {
                        j(token, aVar);
                        return true;
                    }
                    aVar.m(this);
                    if (aVar.p == null && !aVar.F("template")) {
                        aVar.C(gVar, false, false);
                        return true;
                    }
                }
                return false;
            }

            public final void j(Token token, org.jsoup.parser.a aVar) {
                aVar.m(this);
                aVar.w = true;
                aVar.L(token, b.InBody);
                aVar.w = false;
            }
        };
        InTable = bVar9;
        b bVar10 = new b() { // from class: org.jsoup.parser.b.a
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (token.b == Token.TokenType.Character) {
                    Token.b bVar11 = (Token.b) token;
                    if (bVar11.c.equals(b.nullString)) {
                        aVar.m(this);
                        return false;
                    }
                    aVar.t.add(bVar11.clone());
                    return true;
                }
                if (aVar.t.size() > 0) {
                    Iterator it = aVar.t.iterator();
                    while (it.hasNext()) {
                        Token.b bVar12 = (Token.b) it.next();
                        if (b.a(bVar12)) {
                            aVar.y(bVar12);
                        } else {
                            aVar.m(this);
                            if (sqm0.b(aVar.a().e.c, z.B)) {
                                aVar.w = true;
                                aVar.L(bVar12, b.InBody);
                                aVar.w = false;
                            } else {
                                aVar.L(bVar12, b.InBody);
                            }
                        }
                    }
                    aVar.t = new ArrayList();
                }
                aVar.l = aVar.m;
                return aVar.c(token);
            }
        };
        InTableText = bVar10;
        b bVar11 = new b() { // from class: org.jsoup.parser.b.b
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (token.j()) {
                    Token.f fVar = (Token.f) token;
                    if (fVar.d.equals("caption")) {
                        if (!aVar.v(fVar.d)) {
                            aVar.m(this);
                            return false;
                        }
                        aVar.o(false);
                        if (!aVar.b("caption")) {
                            aVar.m(this);
                        }
                        aVar.J("caption");
                        aVar.j();
                        aVar.l = b.InTable;
                        return true;
                    }
                }
                if ((token.k() && sqm0.b(((Token.g) token).d, z.z)) || (token.j() && ((Token.f) token).d.equals(B5.R))) {
                    aVar.m(this);
                    if (aVar.d("caption")) {
                        return aVar.c(token);
                    }
                    return true;
                }
                if (token.j() && sqm0.b(((Token.f) token).d, z.K)) {
                    aVar.m(this);
                    return false;
                }
                b bVar12 = b.InBody;
                aVar.g = token;
                return bVar12.i(token, aVar);
            }
        };
        InCaption = bVar11;
        b bVar12 = new b() { // from class: org.jsoup.parser.b.c
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0084, code lost:
            
                if (r3.equals("html") == false) goto L39;
             */
            @Override // org.jsoup.parser.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (b.a(token)) {
                    aVar.y((Token.b) token);
                    return true;
                }
                int i2 = q.a[token.b.ordinal()];
                if (i2 == 1) {
                    aVar.A((Token.c) token);
                    return true;
                }
                char c2 = 2;
                if (i2 == 2) {
                    aVar.m(this);
                    return true;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 6) {
                            return j(token, aVar);
                        }
                        if (aVar.b("html")) {
                            return true;
                        }
                        return j(token, aVar);
                    }
                    String str = ((Token.f) token).d;
                    str.getClass();
                    if (str.equals("template")) {
                        aVar.L(token, b.InHead);
                        return true;
                    }
                    if (!str.equals("colgroup")) {
                        return j(token, aVar);
                    }
                    if (!aVar.b(str)) {
                        aVar.m(this);
                        return false;
                    }
                    aVar.I();
                    aVar.l = b.InTable;
                    return true;
                }
                Token.g gVar = (Token.g) token;
                String str2 = gVar.d;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -1321546630:
                        if (str2.equals("template")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 98688:
                        if (str2.equals("col")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3213227:
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        aVar.L(token, b.InHead);
                        return true;
                    case 1:
                        aVar.B(gVar);
                        return true;
                    case 2:
                        b bVar13 = b.InBody;
                        aVar.g = token;
                        return bVar13.i(token, aVar);
                    default:
                        return j(token, aVar);
                }
            }

            public final boolean j(Token token, org.jsoup.parser.a aVar) {
                if (!aVar.b("colgroup")) {
                    aVar.m(this);
                    return false;
                }
                aVar.I();
                aVar.l = b.InTable;
                aVar.c(token);
                return true;
            }
        };
        InColumnGroup = bVar12;
        b bVar13 = new b() { // from class: org.jsoup.parser.b.d
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                int i2 = q.a[token.b.ordinal()];
                if (i2 == 3) {
                    Token.g gVar = (Token.g) token;
                    String str = gVar.d;
                    if (str.equals("tr")) {
                        aVar.k("tbody", "tfoot", "thead", "template");
                        aVar.x(gVar);
                        aVar.l = b.InRow;
                        return true;
                    }
                    if (sqm0.b(str, z.w)) {
                        aVar.m(this);
                        aVar.e("tr");
                        return aVar.c(gVar);
                    }
                    if (sqm0.b(str, z.C)) {
                        return j(token, aVar);
                    }
                    b bVar14 = b.InTable;
                    aVar.g = token;
                    return bVar14.i(token, aVar);
                }
                if (i2 != 4) {
                    b bVar15 = b.InTable;
                    aVar.g = token;
                    return bVar15.i(token, aVar);
                }
                String str2 = ((Token.f) token).d;
                if (sqm0.b(str2, z.I)) {
                    if (!aVar.v(str2)) {
                        aVar.m(this);
                        return false;
                    }
                    aVar.k("tbody", "tfoot", "thead", "template");
                    aVar.I();
                    aVar.l = b.InTable;
                    return true;
                }
                if (str2.equals(B5.R)) {
                    return j(token, aVar);
                }
                if (sqm0.b(str2, z.D)) {
                    aVar.m(this);
                    return false;
                }
                b bVar16 = b.InTable;
                aVar.g = token;
                return bVar16.i(token, aVar);
            }

            public final boolean j(Token token, org.jsoup.parser.a aVar) {
                if (!aVar.v("tbody") && !aVar.v("thead") && !aVar.s("tfoot")) {
                    aVar.m(this);
                    return false;
                }
                aVar.k("tbody", "tfoot", "thead", "template");
                aVar.d(aVar.a().e.c);
                return aVar.c(token);
            }
        };
        InTableBody = bVar13;
        b bVar14 = new b() { // from class: org.jsoup.parser.b.e
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (token.k()) {
                    Token.g gVar = (Token.g) token;
                    String str = gVar.d;
                    if (sqm0.b(str, z.w)) {
                        aVar.k("tr", "template");
                        aVar.x(gVar);
                        aVar.l = b.InCell;
                        aVar.r.add(null);
                        return true;
                    }
                    if (sqm0.b(str, z.E)) {
                        if (aVar.d("tr")) {
                            return aVar.c(token);
                        }
                        return false;
                    }
                    b bVar15 = b.InTable;
                    aVar.g = token;
                    return bVar15.i(token, aVar);
                }
                if (!token.j()) {
                    b bVar16 = b.InTable;
                    aVar.g = token;
                    return bVar16.i(token, aVar);
                }
                String str2 = ((Token.f) token).d;
                if (str2.equals("tr")) {
                    if (!aVar.v(str2)) {
                        aVar.m(this);
                        return false;
                    }
                    aVar.k("tr", "template");
                    aVar.I();
                    aVar.l = b.InTableBody;
                    return true;
                }
                if (str2.equals(B5.R)) {
                    if (aVar.d("tr")) {
                        return aVar.c(token);
                    }
                    return false;
                }
                if (!sqm0.b(str2, z.t)) {
                    if (sqm0.b(str2, z.F)) {
                        aVar.m(this);
                        return false;
                    }
                    b bVar17 = b.InTable;
                    aVar.g = token;
                    return bVar17.i(token, aVar);
                }
                if (!aVar.v(str2) || !aVar.v("tr")) {
                    aVar.m(this);
                    return false;
                }
                aVar.k("tr", "template");
                aVar.I();
                aVar.l = b.InTableBody;
                return true;
            }
        };
        InRow = bVar14;
        b bVar15 = new b() { // from class: org.jsoup.parser.b.f
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (!token.j()) {
                    if (!token.k() || !sqm0.b(((Token.g) token).d, z.z)) {
                        b bVar16 = b.InBody;
                        aVar.g = token;
                        return bVar16.i(token, aVar);
                    }
                    if (!aVar.v("td") && !aVar.v("th")) {
                        aVar.m(this);
                        return false;
                    }
                    if (aVar.v("td")) {
                        aVar.d("td");
                    } else {
                        aVar.d("th");
                    }
                    return aVar.c(token);
                }
                String str = ((Token.f) token).d;
                if (sqm0.b(str, z.w)) {
                    if (!aVar.v(str)) {
                        aVar.m(this);
                        aVar.l = b.InRow;
                        return false;
                    }
                    aVar.o(false);
                    if (!aVar.b(str)) {
                        aVar.m(this);
                    }
                    aVar.J(str);
                    aVar.j();
                    aVar.l = b.InRow;
                    return true;
                }
                if (sqm0.b(str, z.x)) {
                    aVar.m(this);
                    return false;
                }
                if (!sqm0.b(str, z.y)) {
                    b bVar17 = b.InBody;
                    aVar.g = token;
                    return bVar17.i(token, aVar);
                }
                if (!aVar.v(str)) {
                    aVar.m(this);
                    return false;
                }
                if (aVar.v("td")) {
                    aVar.d("td");
                } else {
                    aVar.d("th");
                }
                return aVar.c(token);
            }
        };
        InCell = bVar15;
        b bVar16 = new b() { // from class: org.jsoup.parser.b.g
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                String str;
                switch (q.a[token.b.ordinal()]) {
                    case 1:
                        aVar.A((Token.c) token);
                        return true;
                    case 2:
                        aVar.m(this);
                        return false;
                    case 3:
                        Token.g gVar = (Token.g) token;
                        String str2 = gVar.d;
                        if (str2.equals("html")) {
                            b bVar17 = b.InBody;
                            aVar.g = gVar;
                            return bVar17.i(gVar, aVar);
                        }
                        if (str2.equals("option")) {
                            if (aVar.b("option")) {
                                aVar.d("option");
                            }
                            aVar.x(gVar);
                        } else {
                            if (!str2.equals("optgroup")) {
                                if (str2.equals("select")) {
                                    aVar.m(this);
                                    return aVar.d("select");
                                }
                                if (sqm0.b(str2, z.G)) {
                                    aVar.m(this);
                                    if (!aVar.t("select")) {
                                        return false;
                                    }
                                    aVar.d("select");
                                    return aVar.c(gVar);
                                }
                                if (!str2.equals("script") && !str2.equals("template")) {
                                    aVar.m(this);
                                    return false;
                                }
                                b bVar18 = b.InHead;
                                aVar.g = token;
                                return bVar18.i(token, aVar);
                            }
                            if (aVar.b("option")) {
                                aVar.d("option");
                            }
                            if (aVar.b("optgroup")) {
                                aVar.d("optgroup");
                            }
                            aVar.x(gVar);
                        }
                        return true;
                    case 4:
                        str = ((Token.f) token).d;
                        str.getClass();
                        switch (str) {
                            case "template":
                                b bVar19 = b.InHead;
                                aVar.g = token;
                                return bVar19.i(token, aVar);
                            case "option":
                                if (aVar.b("option")) {
                                    aVar.I();
                                } else {
                                    aVar.m(this);
                                }
                                return true;
                            case "select":
                                if (!aVar.t(str)) {
                                    aVar.m(this);
                                    return false;
                                }
                                aVar.J(str);
                                aVar.R();
                                return true;
                            case "optgroup":
                                if (aVar.b("option") && aVar.h(aVar.a()) != null && aVar.h(aVar.a()).e.c.equals("optgroup")) {
                                    aVar.d("option");
                                }
                                if (aVar.b("optgroup")) {
                                    aVar.I();
                                } else {
                                    aVar.m(this);
                                }
                                return true;
                            default:
                                aVar.m(this);
                                return false;
                        }
                    case 5:
                        Token.b bVar20 = (Token.b) token;
                        if (bVar20.c.equals(b.nullString)) {
                            aVar.m(this);
                            return false;
                        }
                        aVar.y(bVar20);
                        return true;
                    case 6:
                        if (!aVar.b("html")) {
                            aVar.m(this);
                        }
                        return true;
                    default:
                        aVar.m(this);
                        return false;
                }
            }
        };
        InSelect = bVar16;
        b bVar17 = new b() { // from class: org.jsoup.parser.b.h
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                boolean k2 = token.k();
                String[] strArr = z.H;
                if (k2 && sqm0.b(((Token.g) token).d, strArr)) {
                    aVar.m(this);
                    aVar.J("select");
                    aVar.R();
                    return aVar.c(token);
                }
                if (token.j()) {
                    Token.f fVar = (Token.f) token;
                    if (sqm0.b(fVar.d, strArr)) {
                        aVar.m(this);
                        if (!aVar.v(fVar.d)) {
                            return false;
                        }
                        aVar.J("select");
                        aVar.R();
                        return aVar.c(token);
                    }
                }
                b bVar18 = b.InSelect;
                aVar.g = token;
                return bVar18.i(token, aVar);
            }
        };
        InSelectInTable = bVar17;
        b bVar18 = new b() { // from class: org.jsoup.parser.b.i
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                switch (q.a[token.b.ordinal()]) {
                    case 1:
                    case 2:
                    case 5:
                        aVar.L(token, b.InBody);
                        return true;
                    case 3:
                        String str = ((Token.g) token).d;
                        if (sqm0.b(str, z.L)) {
                            aVar.L(token, b.InHead);
                            return true;
                        }
                        if (sqm0.b(str, z.M)) {
                            aVar.K();
                            b bVar19 = b.InTable;
                            aVar.M(bVar19);
                            aVar.l = bVar19;
                            return aVar.c(token);
                        }
                        if (str.equals("col")) {
                            aVar.K();
                            b bVar20 = b.InColumnGroup;
                            aVar.M(bVar20);
                            aVar.l = bVar20;
                            return aVar.c(token);
                        }
                        if (str.equals("tr")) {
                            aVar.K();
                            b bVar21 = b.InTableBody;
                            aVar.M(bVar21);
                            aVar.l = bVar21;
                            return aVar.c(token);
                        }
                        if (str.equals("td") || str.equals("th")) {
                            aVar.K();
                            b bVar22 = b.InRow;
                            aVar.M(bVar22);
                            aVar.l = bVar22;
                            return aVar.c(token);
                        }
                        aVar.K();
                        b bVar23 = b.InBody;
                        aVar.M(bVar23);
                        aVar.l = bVar23;
                        return aVar.c(token);
                    case 4:
                        if (((Token.f) token).d.equals("template")) {
                            aVar.L(token, b.InHead);
                            return true;
                        }
                        aVar.m(this);
                        return false;
                    case 6:
                        if (aVar.F("template")) {
                            aVar.m(this);
                            aVar.J("template");
                            aVar.j();
                            aVar.K();
                            aVar.R();
                            if (aVar.l != b.InTemplate && aVar.s.size() < 12) {
                                return aVar.c(token);
                            }
                        }
                        break;
                    default:
                        return true;
                }
            }
        };
        InTemplate = bVar18;
        b bVar19 = new b() { // from class: org.jsoup.parser.b.j
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (b.a(token)) {
                    org.jsoup.nodes.g q2 = aVar.q("html");
                    if (q2 != null) {
                        org.jsoup.parser.a.z((Token.b) token, q2);
                        return true;
                    }
                    aVar.L(token, b.InBody);
                    return true;
                }
                if (token.a()) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (token.e()) {
                    aVar.m(this);
                    return false;
                }
                if (token.k() && ((Token.g) token).d.equals("html")) {
                    b bVar20 = b.InBody;
                    aVar.g = token;
                    return bVar20.i(token, aVar);
                }
                if (token.j() && ((Token.f) token).d.equals("html")) {
                    if (aVar.x) {
                        aVar.m(this);
                        return false;
                    }
                    aVar.l = b.AfterAfterBody;
                    return true;
                }
                if (token.i()) {
                    return true;
                }
                aVar.m(this);
                aVar.Q();
                return aVar.c(token);
            }
        };
        AfterBody = bVar19;
        b bVar20 = new b() { // from class: org.jsoup.parser.b.l
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                Token.g gVar;
                if (b.a(token)) {
                    aVar.y((Token.b) token);
                    return true;
                }
                if (token.a()) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (token.e()) {
                    aVar.m(this);
                    return false;
                }
                if (!token.k()) {
                    if (token.j() && ((Token.f) token).d.equals("frameset")) {
                        if (aVar.b("html")) {
                            aVar.m(this);
                            return false;
                        }
                        aVar.I();
                        if (!aVar.x && !aVar.b("frameset")) {
                            aVar.l = b.AfterFrameset;
                            return true;
                        }
                    } else {
                        if (!token.i()) {
                            aVar.m(this);
                            return false;
                        }
                        if (!aVar.b("html")) {
                            aVar.m(this);
                        }
                    }
                    return true;
                }
                gVar = (Token.g) token;
                String str = gVar.d;
                str.getClass();
                switch (str) {
                    case "frameset":
                        aVar.x(gVar);
                        break;
                    case "html":
                        b bVar21 = b.InBody;
                        aVar.g = gVar;
                        break;
                    case "frame":
                        aVar.B(gVar);
                        break;
                    case "noframes":
                        b bVar22 = b.InHead;
                        aVar.g = gVar;
                        break;
                    default:
                        aVar.m(this);
                        break;
                }
                return true;
            }
        };
        InFrameset = bVar20;
        b bVar21 = new b() { // from class: org.jsoup.parser.b.m
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (b.a(token)) {
                    aVar.y((Token.b) token);
                    return true;
                }
                if (token.a()) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (token.e()) {
                    aVar.m(this);
                    return false;
                }
                if (token.k() && ((Token.g) token).d.equals("html")) {
                    b bVar22 = b.InBody;
                    aVar.g = token;
                    return bVar22.i(token, aVar);
                }
                if (token.j() && ((Token.f) token).d.equals("html")) {
                    aVar.l = b.AfterAfterFrameset;
                    return true;
                }
                if (token.k() && ((Token.g) token).d.equals("noframes")) {
                    b bVar23 = b.InHead;
                    aVar.g = token;
                    return bVar23.i(token, aVar);
                }
                if (token.i()) {
                    return true;
                }
                aVar.m(this);
                return false;
            }
        };
        AfterFrameset = bVar21;
        b bVar22 = new b() { // from class: org.jsoup.parser.b.n
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (token.a()) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (token.e() || (token.k() && ((Token.g) token).d.equals("html"))) {
                    b bVar23 = b.InBody;
                    aVar.g = token;
                    return bVar23.i(token, aVar);
                }
                if (b.a(token)) {
                    org.jsoup.parser.a.z((Token.b) token, aVar.d);
                    return true;
                }
                if (token.i()) {
                    return true;
                }
                aVar.m(this);
                aVar.Q();
                return aVar.c(token);
            }
        };
        AfterAfterBody = bVar22;
        b bVar23 = new b() { // from class: org.jsoup.parser.b.o
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                if (token.a()) {
                    aVar.A((Token.c) token);
                    return true;
                }
                if (token.e() || b.a(token) || (token.k() && ((Token.g) token).d.equals("html"))) {
                    b bVar24 = b.InBody;
                    aVar.g = token;
                    return bVar24.i(token, aVar);
                }
                if (token.i()) {
                    return true;
                }
                if (!token.k() || !((Token.g) token).d.equals("noframes")) {
                    aVar.m(this);
                    return false;
                }
                b bVar25 = b.InHead;
                aVar.g = token;
                return bVar25.i(token, aVar);
            }
        };
        AfterAfterFrameset = bVar23;
        b bVar24 = new b() { // from class: org.jsoup.parser.b.p
            @Override // org.jsoup.parser.b
            public final boolean i(Token token, org.jsoup.parser.a aVar) {
                return true;
            }
        };
        ForeignContent = bVar24;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24};
        nullString = String.valueOf((char) 0);
    }

    public b() {
        throw null;
    }

    public static boolean a(Token token) {
        if (token.b == Token.TokenType.Character) {
            return sqm0.c(((Token.b) token).c);
        }
        return false;
    }

    public static void b(Token.g gVar, org.jsoup.parser.a aVar) {
        aVar.c.p(org.jsoup.parser.d.Rawtext);
        aVar.m = aVar.l;
        aVar.l = Text;
        aVar.x(gVar);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public abstract boolean i(Token token, org.jsoup.parser.a aVar);
}
