package org.jsoup.parser;

import com.ironsource.B5;
import java.util.Locale;
import org.jsoup.parser.Token;
import ru.ok.android.webrtc.Privacy;
import xsna.bmb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TokeniserState.java */
/* loaded from: classes8.dex */
public abstract class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d AfterAttributeName;
    public static final d AfterAttributeValue_quoted;
    public static final d AfterDoctypeName;
    public static final d AfterDoctypePublicIdentifier;
    public static final d AfterDoctypePublicKeyword;
    public static final d AfterDoctypeSystemIdentifier;
    public static final d AfterDoctypeSystemKeyword;
    public static final d AttributeName;
    public static final d AttributeValue_doubleQuoted;
    public static final d AttributeValue_singleQuoted;
    public static final d AttributeValue_unquoted;
    public static final d BeforeAttributeName;
    public static final d BeforeAttributeValue;
    public static final d BeforeDoctypeName;
    public static final d BeforeDoctypePublicIdentifier;
    public static final d BeforeDoctypeSystemIdentifier;
    public static final d BetweenDoctypePublicAndSystemIdentifiers;
    public static final d BogusComment;
    public static final d BogusDoctype;
    public static final d CdataSection;
    public static final d CharacterReferenceInData;
    public static final d CharacterReferenceInRcdata;
    public static final d Comment;
    public static final d CommentEnd;
    public static final d CommentEndBang;
    public static final d CommentEndDash;
    public static final d CommentStart;
    public static final d CommentStartDash;
    public static final d Data;
    public static final d Doctype;
    public static final d DoctypeName;
    public static final d DoctypePublicIdentifier_doubleQuoted;
    public static final d DoctypePublicIdentifier_singleQuoted;
    public static final d DoctypeSystemIdentifier_doubleQuoted;
    public static final d DoctypeSystemIdentifier_singleQuoted;
    public static final d EndTagOpen;
    public static final d MarkupDeclarationOpen;
    public static final d PLAINTEXT;
    public static final d RCDATAEndTagName;
    public static final d RCDATAEndTagOpen;
    public static final d Rawtext;
    public static final d RawtextEndTagName;
    public static final d RawtextEndTagOpen;
    public static final d RawtextLessthanSign;
    public static final d Rcdata;
    public static final d RcdataLessthanSign;
    public static final d ScriptData;
    public static final d ScriptDataDoubleEscapeEnd;
    public static final d ScriptDataDoubleEscapeStart;
    public static final d ScriptDataDoubleEscaped;
    public static final d ScriptDataDoubleEscapedDash;
    public static final d ScriptDataDoubleEscapedDashDash;
    public static final d ScriptDataDoubleEscapedLessthanSign;
    public static final d ScriptDataEndTagName;
    public static final d ScriptDataEndTagOpen;
    public static final d ScriptDataEscapeStart;
    public static final d ScriptDataEscapeStartDash;
    public static final d ScriptDataEscaped;
    public static final d ScriptDataEscapedDash;
    public static final d ScriptDataEscapedDashDash;
    public static final d ScriptDataEscapedEndTagName;
    public static final d ScriptDataEscapedEndTagOpen;
    public static final d ScriptDataEscapedLessthanSign;
    public static final d ScriptDataLessthanSign;
    public static final d SelfClosingStartTag;
    public static final d TagName;
    public static final d TagOpen;
    static final char[] attributeNameCharsSorted;
    static final char[] attributeValueUnquoted;
    private static final char eof = 65535;
    static final char nullChar = 0;
    private static final char replacementChar = 65533;
    private static final String replacementStr;

    static {
        d dVar = new d() { // from class: org.jsoup.parser.d.k
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char l2 = bmbVar.l();
                if (l2 == 0) {
                    cVar.n(this);
                    cVar.f(bmbVar.e());
                } else {
                    if (l2 == '&') {
                        cVar.a(d.CharacterReferenceInData);
                        return;
                    }
                    if (l2 == '<') {
                        cVar.a(d.TagOpen);
                    } else if (l2 != 65535) {
                        cVar.g(bmbVar.g());
                    } else {
                        cVar.i(new Token.e());
                    }
                }
            }
        };
        Data = dVar;
        d dVar2 = new d() { // from class: org.jsoup.parser.d.v
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d dVar3 = d.Data;
                int[] c2 = cVar.c(null, false);
                if (c2 == null) {
                    cVar.f('&');
                } else {
                    cVar.g(new String(c2, 0, c2.length));
                }
                cVar.p(dVar3);
            }
        };
        CharacterReferenceInData = dVar2;
        d dVar3 = new d() { // from class: org.jsoup.parser.d.g0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char l2 = bmbVar.l();
                if (l2 == 0) {
                    cVar.n(this);
                    bmbVar.a();
                    cVar.f(d.replacementChar);
                } else {
                    if (l2 == '&') {
                        cVar.a(d.CharacterReferenceInRcdata);
                        return;
                    }
                    if (l2 == '<') {
                        cVar.a(d.RcdataLessthanSign);
                    } else if (l2 != 65535) {
                        cVar.g(bmbVar.g());
                    } else {
                        cVar.i(new Token.e());
                    }
                }
            }
        };
        Rcdata = dVar3;
        d dVar4 = new d() { // from class: org.jsoup.parser.d.r0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d dVar5 = d.Rcdata;
                int[] c2 = cVar.c(null, false);
                if (c2 == null) {
                    cVar.f('&');
                } else {
                    cVar.g(new String(c2, 0, c2.length));
                }
                cVar.p(dVar5);
            }
        };
        CharacterReferenceInRcdata = dVar4;
        d dVar5 = new d() { // from class: org.jsoup.parser.d.c1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d.a(cVar, bmbVar, this, d.RawtextLessthanSign);
            }
        };
        Rawtext = dVar5;
        d dVar6 = new d() { // from class: org.jsoup.parser.d.l1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d.a(cVar, bmbVar, this, d.ScriptDataLessthanSign);
            }
        };
        ScriptData = dVar6;
        d dVar7 = new d() { // from class: org.jsoup.parser.d.m1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char l2 = bmbVar.l();
                if (l2 == 0) {
                    cVar.n(this);
                    bmbVar.a();
                    cVar.f(d.replacementChar);
                } else if (l2 != 65535) {
                    cVar.g(bmbVar.i(d.nullChar));
                } else {
                    cVar.i(new Token.e());
                }
            }
        };
        PLAINTEXT = dVar7;
        d dVar8 = new d() { // from class: org.jsoup.parser.d.n1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char l2 = bmbVar.l();
                if (l2 == '!') {
                    cVar.a(d.MarkupDeclarationOpen);
                    return;
                }
                if (l2 == '/') {
                    cVar.a(d.EndTagOpen);
                    return;
                }
                if (l2 == '?') {
                    cVar.n.l();
                    cVar.p(d.BogusComment);
                } else if (bmbVar.t()) {
                    cVar.d(true);
                    cVar.p(d.TagName);
                } else {
                    cVar.n(this);
                    cVar.f('<');
                    cVar.p(d.Data);
                }
            }
        };
        TagOpen = dVar8;
        d dVar9 = new d() { // from class: org.jsoup.parser.d.o1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.n()) {
                    cVar.m(this);
                    cVar.g("</");
                    cVar.p(d.Data);
                } else if (bmbVar.t()) {
                    cVar.d(false);
                    cVar.p(d.TagName);
                } else if (bmbVar.r('>')) {
                    cVar.n(this);
                    cVar.a(d.Data);
                } else {
                    cVar.n(this);
                    cVar.n.l();
                    cVar.n.n('/');
                    cVar.p(d.BogusComment);
                }
            }
        };
        EndTagOpen = dVar9;
        d dVar10 = new d() { // from class: org.jsoup.parser.d.a
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char c2;
                bmbVar.b();
                int i2 = bmbVar.e;
                int i3 = bmbVar.c;
                char[] cArr = bmbVar.a;
                int i4 = i2;
                while (i4 < i3 && (c2 = cArr[i4]) != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ' && c2 != '/' && c2 != '<' && c2 != '>') {
                    i4++;
                }
                bmbVar.e = i4;
                cVar.k.q(i4 > i2 ? bmb.c(bmbVar.a, bmbVar.h, i2, i4 - i2) : "");
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.k.q(d.replacementStr);
                    return;
                }
                if (e2 != ' ') {
                    if (e2 == '/') {
                        cVar.p(d.SelfClosingStartTag);
                        return;
                    }
                    if (e2 == '<') {
                        bmbVar.z();
                        cVar.n(this);
                    } else if (e2 != '>') {
                        if (e2 == 65535) {
                            cVar.m(this);
                            cVar.p(d.Data);
                            return;
                        } else if (e2 != '\t' && e2 != '\n' && e2 != '\f' && e2 != '\r') {
                            Token.h hVar = cVar.k;
                            hVar.getClass();
                            hVar.q(String.valueOf(e2));
                            return;
                        }
                    }
                    cVar.l();
                    cVar.p(d.Data);
                    return;
                }
                cVar.p(d.BeforeAttributeName);
            }
        };
        TagName = dVar10;
        d dVar11 = new d() { // from class: org.jsoup.parser.d.b
            /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
            
                if (r1 >= r8.e) goto L33;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
            @Override // org.jsoup.parser.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.r('/')) {
                    cVar.e();
                    cVar.a(d.RCDATAEndTagOpen);
                    return;
                }
                if (bmbVar.k && bmbVar.t() && cVar.o != null) {
                    if (cVar.p == null) {
                        cVar.p = "</" + cVar.o;
                    }
                    String str = cVar.p;
                    if (str.equals(bmbVar.l)) {
                        int i2 = bmbVar.m;
                        if (i2 == -1) {
                            r3 = false;
                        }
                        if (!r3) {
                            Token.h d = cVar.d(false);
                            d.t(cVar.o);
                            cVar.k = d;
                            cVar.l();
                            cVar.p(d.TagOpen);
                            return;
                        }
                    }
                    bmbVar.l = str;
                    Locale locale = Locale.ENGLISH;
                    int v2 = bmbVar.v(str.toLowerCase(locale));
                    if (v2 > -1) {
                        bmbVar.m = bmbVar.e + v2;
                    } else {
                        int v3 = bmbVar.v(str.toUpperCase(locale));
                        r3 = v3 > -1;
                        bmbVar.m = r3 ? bmbVar.e + v3 : -1;
                    }
                    if (!r3) {
                    }
                }
                cVar.g("<");
                cVar.p(d.Rcdata);
            }
        };
        RcdataLessthanSign = dVar11;
        d dVar12 = new d() { // from class: org.jsoup.parser.d.c
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (!bmbVar.t()) {
                    cVar.g("</");
                    cVar.p(d.Rcdata);
                    return;
                }
                cVar.d(false);
                Token.h hVar = cVar.k;
                char l2 = bmbVar.l();
                hVar.getClass();
                hVar.q(String.valueOf(l2));
                cVar.h.append(bmbVar.l());
                cVar.a(d.RCDATAEndTagName);
            }
        };
        RCDATAEndTagOpen = dVar12;
        d dVar13 = new d() { // from class: org.jsoup.parser.d.d
            public static void l(org.jsoup.parser.c cVar, bmb bmbVar) {
                cVar.g("</");
                cVar.h(cVar.h);
                bmbVar.z();
                cVar.p(d.Rcdata);
            }

            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.t()) {
                    String h2 = bmbVar.h();
                    cVar.k.q(h2);
                    cVar.h.append(h2);
                    return;
                }
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    if (cVar.o()) {
                        cVar.p(d.BeforeAttributeName);
                        return;
                    } else {
                        l(cVar, bmbVar);
                        return;
                    }
                }
                if (e2 == '/') {
                    if (cVar.o()) {
                        cVar.p(d.SelfClosingStartTag);
                        return;
                    } else {
                        l(cVar, bmbVar);
                        return;
                    }
                }
                if (e2 != '>') {
                    l(cVar, bmbVar);
                } else if (!cVar.o()) {
                    l(cVar, bmbVar);
                } else {
                    cVar.l();
                    cVar.p(d.Data);
                }
            }
        };
        RCDATAEndTagName = dVar13;
        d dVar14 = new d() { // from class: org.jsoup.parser.d.e
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.r('/')) {
                    cVar.e();
                    cVar.a(d.RawtextEndTagOpen);
                } else {
                    cVar.f('<');
                    cVar.p(d.Rawtext);
                }
            }
        };
        RawtextLessthanSign = dVar14;
        d dVar15 = new d() { // from class: org.jsoup.parser.d.f
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d dVar16 = d.RawtextEndTagName;
                d dVar17 = d.Rawtext;
                if (bmbVar.t()) {
                    cVar.d(false);
                    cVar.p(dVar16);
                } else {
                    cVar.g("</");
                    cVar.p(dVar17);
                }
            }
        };
        RawtextEndTagOpen = dVar15;
        d dVar16 = new d() { // from class: org.jsoup.parser.d.g
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d.i(cVar, bmbVar, d.Rawtext);
            }
        };
        RawtextEndTagName = dVar16;
        d dVar17 = new d() { // from class: org.jsoup.parser.d.h
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '!') {
                    cVar.g("<!");
                    cVar.p(d.ScriptDataEscapeStart);
                    return;
                }
                if (e2 == '/') {
                    cVar.e();
                    cVar.p(d.ScriptDataEndTagOpen);
                } else if (e2 != 65535) {
                    cVar.g("<");
                    bmbVar.z();
                    cVar.p(d.ScriptData);
                } else {
                    cVar.g("<");
                    cVar.m(this);
                    cVar.p(d.Data);
                }
            }
        };
        ScriptDataLessthanSign = dVar17;
        d dVar18 = new d() { // from class: org.jsoup.parser.d.i
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d dVar19 = d.ScriptDataEndTagName;
                d dVar20 = d.ScriptData;
                if (bmbVar.t()) {
                    cVar.d(false);
                    cVar.p(dVar19);
                } else {
                    cVar.g("</");
                    cVar.p(dVar20);
                }
            }
        };
        ScriptDataEndTagOpen = dVar18;
        d dVar19 = new d() { // from class: org.jsoup.parser.d.j
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d.i(cVar, bmbVar, d.ScriptData);
            }
        };
        ScriptDataEndTagName = dVar19;
        d dVar20 = new d() { // from class: org.jsoup.parser.d.l
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (!bmbVar.r('-')) {
                    cVar.p(d.ScriptData);
                } else {
                    cVar.f('-');
                    cVar.a(d.ScriptDataEscapeStartDash);
                }
            }
        };
        ScriptDataEscapeStart = dVar20;
        d dVar21 = new d() { // from class: org.jsoup.parser.d.m
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (!bmbVar.r('-')) {
                    cVar.p(d.ScriptData);
                } else {
                    cVar.f('-');
                    cVar.a(d.ScriptDataEscapedDashDash);
                }
            }
        };
        ScriptDataEscapeStartDash = dVar21;
        d dVar22 = new d() { // from class: org.jsoup.parser.d.n
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.n()) {
                    cVar.m(this);
                    cVar.p(d.Data);
                    return;
                }
                char l2 = bmbVar.l();
                if (l2 == 0) {
                    cVar.n(this);
                    bmbVar.a();
                    cVar.f(d.replacementChar);
                } else if (l2 == '-') {
                    cVar.f('-');
                    cVar.a(d.ScriptDataEscapedDash);
                } else if (l2 != '<') {
                    cVar.g(bmbVar.j('-', '<', d.nullChar));
                } else {
                    cVar.a(d.ScriptDataEscapedLessthanSign);
                }
            }
        };
        ScriptDataEscaped = dVar22;
        d dVar23 = new d() { // from class: org.jsoup.parser.d.o
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.n()) {
                    cVar.m(this);
                    cVar.p(d.Data);
                    return;
                }
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.f(d.replacementChar);
                    cVar.p(d.ScriptDataEscaped);
                } else if (e2 == '-') {
                    cVar.f(e2);
                    cVar.p(d.ScriptDataEscapedDashDash);
                } else if (e2 == '<') {
                    cVar.p(d.ScriptDataEscapedLessthanSign);
                } else {
                    cVar.f(e2);
                    cVar.p(d.ScriptDataEscaped);
                }
            }
        };
        ScriptDataEscapedDash = dVar23;
        d dVar24 = new d() { // from class: org.jsoup.parser.d.p
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.n()) {
                    cVar.m(this);
                    cVar.p(d.Data);
                    return;
                }
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.f(d.replacementChar);
                    cVar.p(d.ScriptDataEscaped);
                } else {
                    if (e2 == '-') {
                        cVar.f(e2);
                        return;
                    }
                    if (e2 == '<') {
                        cVar.p(d.ScriptDataEscapedLessthanSign);
                    } else if (e2 != '>') {
                        cVar.f(e2);
                        cVar.p(d.ScriptDataEscaped);
                    } else {
                        cVar.f(e2);
                        cVar.p(d.ScriptData);
                    }
                }
            }
        };
        ScriptDataEscapedDashDash = dVar24;
        d dVar25 = new d() { // from class: org.jsoup.parser.d.q
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.t()) {
                    cVar.e();
                    cVar.h.append(bmbVar.l());
                    cVar.g("<");
                    cVar.f(bmbVar.l());
                    cVar.a(d.ScriptDataDoubleEscapeStart);
                    return;
                }
                if (bmbVar.r('/')) {
                    cVar.e();
                    cVar.a(d.ScriptDataEscapedEndTagOpen);
                } else {
                    cVar.f('<');
                    cVar.p(d.ScriptDataEscaped);
                }
            }
        };
        ScriptDataEscapedLessthanSign = dVar25;
        d dVar26 = new d() { // from class: org.jsoup.parser.d.r
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (!bmbVar.t()) {
                    cVar.g("</");
                    cVar.p(d.ScriptDataEscaped);
                    return;
                }
                cVar.d(false);
                Token.h hVar = cVar.k;
                char l2 = bmbVar.l();
                hVar.getClass();
                hVar.q(String.valueOf(l2));
                cVar.h.append(bmbVar.l());
                cVar.a(d.ScriptDataEscapedEndTagName);
            }
        };
        ScriptDataEscapedEndTagOpen = dVar26;
        d dVar27 = new d() { // from class: org.jsoup.parser.d.s
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d.i(cVar, bmbVar, d.ScriptDataEscaped);
            }
        };
        ScriptDataEscapedEndTagName = dVar27;
        d dVar28 = new d() { // from class: org.jsoup.parser.d.t
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d.j(cVar, bmbVar, d.ScriptDataDoubleEscaped, d.ScriptDataEscaped);
            }
        };
        ScriptDataDoubleEscapeStart = dVar28;
        d dVar29 = new d() { // from class: org.jsoup.parser.d.u
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char l2 = bmbVar.l();
                if (l2 == 0) {
                    cVar.n(this);
                    bmbVar.a();
                    cVar.f(d.replacementChar);
                } else if (l2 == '-') {
                    cVar.f(l2);
                    cVar.a(d.ScriptDataDoubleEscapedDash);
                } else if (l2 == '<') {
                    cVar.f(l2);
                    cVar.a(d.ScriptDataDoubleEscapedLessthanSign);
                } else if (l2 != 65535) {
                    cVar.g(bmbVar.j('-', '<', d.nullChar));
                } else {
                    cVar.m(this);
                    cVar.p(d.Data);
                }
            }
        };
        ScriptDataDoubleEscaped = dVar29;
        d dVar30 = new d() { // from class: org.jsoup.parser.d.w
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.f(d.replacementChar);
                    cVar.p(d.ScriptDataDoubleEscaped);
                } else if (e2 == '-') {
                    cVar.f(e2);
                    cVar.p(d.ScriptDataDoubleEscapedDashDash);
                } else if (e2 == '<') {
                    cVar.f(e2);
                    cVar.p(d.ScriptDataDoubleEscapedLessthanSign);
                } else if (e2 != 65535) {
                    cVar.f(e2);
                    cVar.p(d.ScriptDataDoubleEscaped);
                } else {
                    cVar.m(this);
                    cVar.p(d.Data);
                }
            }
        };
        ScriptDataDoubleEscapedDash = dVar30;
        d dVar31 = new d() { // from class: org.jsoup.parser.d.x
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.f(d.replacementChar);
                    cVar.p(d.ScriptDataDoubleEscaped);
                    return;
                }
                if (e2 == '-') {
                    cVar.f(e2);
                    return;
                }
                if (e2 == '<') {
                    cVar.f(e2);
                    cVar.p(d.ScriptDataDoubleEscapedLessthanSign);
                } else if (e2 == '>') {
                    cVar.f(e2);
                    cVar.p(d.ScriptData);
                } else if (e2 != 65535) {
                    cVar.f(e2);
                    cVar.p(d.ScriptDataDoubleEscaped);
                } else {
                    cVar.m(this);
                    cVar.p(d.Data);
                }
            }
        };
        ScriptDataDoubleEscapedDashDash = dVar31;
        d dVar32 = new d() { // from class: org.jsoup.parser.d.y
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (!bmbVar.r('/')) {
                    cVar.p(d.ScriptDataDoubleEscaped);
                    return;
                }
                cVar.f('/');
                cVar.e();
                cVar.a(d.ScriptDataDoubleEscapeEnd);
            }
        };
        ScriptDataDoubleEscapedLessthanSign = dVar32;
        d dVar33 = new d() { // from class: org.jsoup.parser.d.z
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                d.j(cVar, bmbVar, d.ScriptDataEscaped, d.ScriptDataDoubleEscaped);
            }
        };
        ScriptDataDoubleEscapeEnd = dVar33;
        d dVar34 = new d() { // from class: org.jsoup.parser.d.a0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    bmbVar.z();
                    cVar.n(this);
                    cVar.k.u();
                    cVar.p(d.AttributeName);
                    return;
                }
                if (e2 != ' ') {
                    if (e2 != '\"' && e2 != '\'') {
                        if (e2 == '/') {
                            cVar.p(d.SelfClosingStartTag);
                            return;
                        }
                        if (e2 == 65535) {
                            cVar.m(this);
                            cVar.p(d.Data);
                            return;
                        }
                        if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r') {
                            return;
                        }
                        switch (e2) {
                            case '<':
                                bmbVar.z();
                                cVar.n(this);
                                break;
                            case '=':
                                break;
                            case '>':
                                break;
                            default:
                                cVar.k.u();
                                bmbVar.z();
                                cVar.p(d.AttributeName);
                                return;
                        }
                        cVar.l();
                        cVar.p(d.Data);
                        return;
                    }
                    cVar.n(this);
                    cVar.k.u();
                    Token.h hVar = cVar.k;
                    StringBuilder sb = hVar.e;
                    hVar.g = true;
                    String str = hVar.f;
                    if (str != null) {
                        sb.append(str);
                        hVar.f = null;
                    }
                    sb.append(e2);
                    cVar.p(d.AttributeName);
                }
            }
        };
        BeforeAttributeName = dVar34;
        d dVar35 = new d() { // from class: org.jsoup.parser.d.b0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                String k2 = bmbVar.k(d.attributeNameCharsSorted);
                Token.h hVar = cVar.k;
                hVar.getClass();
                StringBuilder sb = hVar.e;
                String replace = k2.replace(d.nullChar, d.replacementChar);
                hVar.g = true;
                String str = hVar.f;
                if (str != null) {
                    sb.append(str);
                    hVar.f = null;
                }
                if (sb.length() == 0) {
                    hVar.f = replace;
                } else {
                    sb.append(replace);
                }
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    cVar.p(d.AfterAttributeName);
                    return;
                }
                if (e2 != '\"' && e2 != '\'') {
                    if (e2 == '/') {
                        cVar.p(d.SelfClosingStartTag);
                        return;
                    }
                    if (e2 == 65535) {
                        cVar.m(this);
                        cVar.p(d.Data);
                        return;
                    }
                    switch (e2) {
                        case '<':
                            break;
                        case '=':
                            cVar.p(d.BeforeAttributeValue);
                            break;
                        case '>':
                            cVar.l();
                            cVar.p(d.Data);
                            break;
                        default:
                            Token.h hVar2 = cVar.k;
                            StringBuilder sb2 = hVar2.e;
                            hVar2.g = true;
                            String str2 = hVar2.f;
                            if (str2 != null) {
                                sb2.append(str2);
                                hVar2.f = null;
                            }
                            sb2.append(e2);
                            break;
                    }
                    return;
                }
                cVar.n(this);
                Token.h hVar3 = cVar.k;
                StringBuilder sb3 = hVar3.e;
                hVar3.g = true;
                String str3 = hVar3.f;
                if (str3 != null) {
                    sb3.append(str3);
                    hVar3.f = null;
                }
                sb3.append(e2);
            }
        };
        AttributeName = dVar35;
        d dVar36 = new d() { // from class: org.jsoup.parser.d.c0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    Token.h hVar = cVar.k;
                    StringBuilder sb = hVar.e;
                    hVar.g = true;
                    String str = hVar.f;
                    if (str != null) {
                        sb.append(str);
                        hVar.f = null;
                    }
                    sb.append(d.replacementChar);
                    cVar.p(d.AttributeName);
                    return;
                }
                if (e2 != ' ') {
                    if (e2 != '\"' && e2 != '\'') {
                        if (e2 == '/') {
                            cVar.p(d.SelfClosingStartTag);
                            return;
                        }
                        if (e2 == 65535) {
                            cVar.m(this);
                            cVar.p(d.Data);
                            return;
                        }
                        if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r') {
                            return;
                        }
                        switch (e2) {
                            case '<':
                                break;
                            case '=':
                                cVar.p(d.BeforeAttributeValue);
                                break;
                            case '>':
                                cVar.l();
                                cVar.p(d.Data);
                                break;
                            default:
                                cVar.k.u();
                                bmbVar.z();
                                cVar.p(d.AttributeName);
                                break;
                        }
                        return;
                    }
                    cVar.n(this);
                    cVar.k.u();
                    Token.h hVar2 = cVar.k;
                    StringBuilder sb2 = hVar2.e;
                    hVar2.g = true;
                    String str2 = hVar2.f;
                    if (str2 != null) {
                        sb2.append(str2);
                        hVar2.f = null;
                    }
                    sb2.append(e2);
                    cVar.p(d.AttributeName);
                }
            }
        };
        AfterAttributeName = dVar36;
        d dVar37 = new d() { // from class: org.jsoup.parser.d.d0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.k.n(d.replacementChar);
                    cVar.p(d.AttributeValue_unquoted);
                    return;
                }
                if (e2 != ' ') {
                    if (e2 == '\"') {
                        cVar.p(d.AttributeValue_doubleQuoted);
                        return;
                    }
                    if (e2 != '`') {
                        if (e2 == 65535) {
                            cVar.m(this);
                            cVar.l();
                            cVar.p(d.Data);
                            return;
                        }
                        if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r') {
                            return;
                        }
                        if (e2 == '&') {
                            bmbVar.z();
                            cVar.p(d.AttributeValue_unquoted);
                            return;
                        }
                        if (e2 == '\'') {
                            cVar.p(d.AttributeValue_singleQuoted);
                            return;
                        }
                        switch (e2) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                cVar.n(this);
                                cVar.l();
                                cVar.p(d.Data);
                                break;
                            default:
                                bmbVar.z();
                                cVar.p(d.AttributeValue_unquoted);
                                break;
                        }
                        return;
                    }
                    cVar.n(this);
                    cVar.k.n(e2);
                    cVar.p(d.AttributeValue_unquoted);
                }
            }
        };
        BeforeAttributeValue = dVar37;
        d dVar38 = new d() { // from class: org.jsoup.parser.d.e0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                String f2 = bmbVar.f(false);
                if (f2.length() > 0) {
                    cVar.k.o(f2);
                } else {
                    cVar.k.k = true;
                }
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.k.n(d.replacementChar);
                    return;
                }
                if (e2 == '\"') {
                    cVar.p(d.AfterAttributeValue_quoted);
                    return;
                }
                if (e2 != '&') {
                    if (e2 != 65535) {
                        cVar.k.n(e2);
                        return;
                    } else {
                        cVar.m(this);
                        cVar.p(d.Data);
                        return;
                    }
                }
                int[] c2 = cVar.c('\"', true);
                if (c2 != null) {
                    cVar.k.p(c2);
                } else {
                    cVar.k.n('&');
                }
            }
        };
        AttributeValue_doubleQuoted = dVar38;
        d dVar39 = new d() { // from class: org.jsoup.parser.d.f0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                String f2 = bmbVar.f(true);
                if (f2.length() > 0) {
                    cVar.k.o(f2);
                } else {
                    cVar.k.k = true;
                }
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.k.n(d.replacementChar);
                    return;
                }
                if (e2 == 65535) {
                    cVar.m(this);
                    cVar.p(d.Data);
                    return;
                }
                if (e2 != '&') {
                    if (e2 != '\'') {
                        cVar.k.n(e2);
                        return;
                    } else {
                        cVar.p(d.AfterAttributeValue_quoted);
                        return;
                    }
                }
                int[] c2 = cVar.c('\'', true);
                if (c2 != null) {
                    cVar.k.p(c2);
                } else {
                    cVar.k.n('&');
                }
            }
        };
        AttributeValue_singleQuoted = dVar39;
        d dVar40 = new d() { // from class: org.jsoup.parser.d.h0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                String k2 = bmbVar.k(d.attributeValueUnquoted);
                if (k2.length() > 0) {
                    cVar.k.o(k2);
                }
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.k.n(d.replacementChar);
                    return;
                }
                if (e2 != ' ') {
                    if (e2 != '\"' && e2 != '`') {
                        if (e2 == 65535) {
                            cVar.m(this);
                            cVar.p(d.Data);
                            return;
                        }
                        if (e2 != '\t' && e2 != '\n' && e2 != '\f' && e2 != '\r') {
                            if (e2 == '&') {
                                int[] c2 = cVar.c('>', true);
                                if (c2 != null) {
                                    cVar.k.p(c2);
                                    return;
                                } else {
                                    cVar.k.n('&');
                                    return;
                                }
                            }
                            if (e2 != '\'') {
                                switch (e2) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        cVar.l();
                                        cVar.p(d.Data);
                                        break;
                                    default:
                                        cVar.k.n(e2);
                                        break;
                                }
                                return;
                            }
                        }
                    }
                    cVar.n(this);
                    cVar.k.n(e2);
                    return;
                }
                cVar.p(d.BeforeAttributeName);
            }
        };
        AttributeValue_unquoted = dVar40;
        d dVar41 = new d() { // from class: org.jsoup.parser.d.i0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    cVar.p(d.BeforeAttributeName);
                    return;
                }
                if (e2 == '/') {
                    cVar.p(d.SelfClosingStartTag);
                    return;
                }
                if (e2 == '>') {
                    cVar.l();
                    cVar.p(d.Data);
                } else if (e2 == 65535) {
                    cVar.m(this);
                    cVar.p(d.Data);
                } else {
                    bmbVar.z();
                    cVar.n(this);
                    cVar.p(d.BeforeAttributeName);
                }
            }
        };
        AfterAttributeValue_quoted = dVar41;
        d dVar42 = new d() { // from class: org.jsoup.parser.d.j0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '>') {
                    cVar.k.l = true;
                    cVar.l();
                    cVar.p(d.Data);
                } else if (e2 == 65535) {
                    cVar.m(this);
                    cVar.p(d.Data);
                } else {
                    bmbVar.z();
                    cVar.n(this);
                    cVar.p(d.BeforeAttributeName);
                }
            }
        };
        SelfClosingStartTag = dVar42;
        d dVar43 = new d() { // from class: org.jsoup.parser.d.k0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                cVar.n.o(bmbVar.i('>'));
                char l2 = bmbVar.l();
                if (l2 == '>' || l2 == 65535) {
                    bmbVar.e();
                    cVar.j();
                    cVar.p(d.Data);
                }
            }
        };
        BogusComment = dVar43;
        d dVar44 = new d() { // from class: org.jsoup.parser.d.l0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.p("--")) {
                    cVar.n.l();
                    cVar.p(d.CommentStart);
                } else {
                    if (bmbVar.q("DOCTYPE")) {
                        cVar.p(d.Doctype);
                        return;
                    }
                    if (bmbVar.p("[CDATA[")) {
                        cVar.e();
                        cVar.p(d.CdataSection);
                    } else {
                        cVar.n(this);
                        cVar.n.l();
                        cVar.p(d.BogusComment);
                    }
                }
            }
        };
        MarkupDeclarationOpen = dVar44;
        d dVar45 = new d() { // from class: org.jsoup.parser.d.m0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.n.n(d.replacementChar);
                    cVar.p(d.Comment);
                    return;
                }
                if (e2 == '-') {
                    cVar.p(d.CommentStartDash);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.j();
                    cVar.p(d.Data);
                } else if (e2 != 65535) {
                    bmbVar.z();
                    cVar.p(d.Comment);
                } else {
                    cVar.m(this);
                    cVar.j();
                    cVar.p(d.Data);
                }
            }
        };
        CommentStart = dVar45;
        d dVar46 = new d() { // from class: org.jsoup.parser.d.n0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.n.n(d.replacementChar);
                    cVar.p(d.Comment);
                    return;
                }
                if (e2 == '-') {
                    cVar.p(d.CommentEnd);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.j();
                    cVar.p(d.Data);
                } else if (e2 != 65535) {
                    cVar.n.n(e2);
                    cVar.p(d.Comment);
                } else {
                    cVar.m(this);
                    cVar.j();
                    cVar.p(d.Data);
                }
            }
        };
        CommentStartDash = dVar46;
        d dVar47 = new d() { // from class: org.jsoup.parser.d.o0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char l2 = bmbVar.l();
                if (l2 == 0) {
                    cVar.n(this);
                    bmbVar.a();
                    cVar.n.n(d.replacementChar);
                } else if (l2 == '-') {
                    cVar.a(d.CommentEndDash);
                } else {
                    if (l2 != 65535) {
                        cVar.n.o(bmbVar.j('-', d.nullChar));
                        return;
                    }
                    cVar.m(this);
                    cVar.j();
                    cVar.p(d.Data);
                }
            }
        };
        Comment = dVar47;
        d dVar48 = new d() { // from class: org.jsoup.parser.d.p0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    Token.c cVar2 = cVar.n;
                    cVar2.n('-');
                    cVar2.n(d.replacementChar);
                    cVar.p(d.Comment);
                    return;
                }
                if (e2 == '-') {
                    cVar.p(d.CommentEnd);
                    return;
                }
                if (e2 == 65535) {
                    cVar.m(this);
                    cVar.j();
                    cVar.p(d.Data);
                } else {
                    Token.c cVar3 = cVar.n;
                    cVar3.n('-');
                    cVar3.n(e2);
                    cVar.p(d.Comment);
                }
            }
        };
        CommentEndDash = dVar48;
        d dVar49 = new d() { // from class: org.jsoup.parser.d.q0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    Token.c cVar2 = cVar.n;
                    cVar2.o("--");
                    cVar2.n(d.replacementChar);
                    cVar.p(d.Comment);
                    return;
                }
                if (e2 == '!') {
                    cVar.p(d.CommentEndBang);
                    return;
                }
                if (e2 == '-') {
                    cVar.n.n('-');
                    return;
                }
                if (e2 == '>') {
                    cVar.j();
                    cVar.p(d.Data);
                } else if (e2 == 65535) {
                    cVar.m(this);
                    cVar.j();
                    cVar.p(d.Data);
                } else {
                    Token.c cVar3 = cVar.n;
                    cVar3.o("--");
                    cVar3.n(e2);
                    cVar.p(d.Comment);
                }
            }
        };
        CommentEnd = dVar49;
        d dVar50 = new d() { // from class: org.jsoup.parser.d.s0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    Token.c cVar2 = cVar.n;
                    cVar2.o("--!");
                    cVar2.n(d.replacementChar);
                    cVar.p(d.Comment);
                    return;
                }
                if (e2 == '-') {
                    cVar.n.o("--!");
                    cVar.p(d.CommentEndDash);
                    return;
                }
                if (e2 == '>') {
                    cVar.j();
                    cVar.p(d.Data);
                } else if (e2 == 65535) {
                    cVar.m(this);
                    cVar.j();
                    cVar.p(d.Data);
                } else {
                    Token.c cVar3 = cVar.n;
                    cVar3.o("--!");
                    cVar3.n(e2);
                    cVar.p(d.Comment);
                }
            }
        };
        CommentEndBang = dVar50;
        d dVar51 = new d() { // from class: org.jsoup.parser.d.t0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    cVar.p(d.BeforeDoctypeName);
                    return;
                }
                if (e2 != '>') {
                    if (e2 != 65535) {
                        cVar.n(this);
                        cVar.p(d.BeforeDoctypeName);
                        return;
                    }
                    cVar.m(this);
                }
                cVar.n(this);
                cVar.m.l();
                cVar.m.g = true;
                cVar.k();
                cVar.p(d.Data);
            }
        };
        Doctype = dVar51;
        d dVar52 = new d() { // from class: org.jsoup.parser.d.u0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.t()) {
                    cVar.m.l();
                    cVar.p(d.DoctypeName);
                    return;
                }
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.m.l();
                    cVar.m.c.append(d.replacementChar);
                    cVar.p(d.DoctypeName);
                    return;
                }
                if (e2 != ' ') {
                    if (e2 == 65535) {
                        cVar.m(this);
                        cVar.m.l();
                        cVar.m.g = true;
                        cVar.k();
                        cVar.p(d.Data);
                        return;
                    }
                    if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r') {
                        return;
                    }
                    cVar.m.l();
                    cVar.m.c.append(e2);
                    cVar.p(d.DoctypeName);
                }
            }
        };
        BeforeDoctypeName = dVar52;
        d dVar53 = new d() { // from class: org.jsoup.parser.d.v0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.u()) {
                    cVar.m.c.append(bmbVar.h());
                    return;
                }
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.m.c.append(d.replacementChar);
                    return;
                }
                if (e2 != ' ') {
                    if (e2 == '>') {
                        cVar.k();
                        cVar.p(d.Data);
                        return;
                    }
                    if (e2 == 65535) {
                        cVar.m(this);
                        cVar.m.g = true;
                        cVar.k();
                        cVar.p(d.Data);
                        return;
                    }
                    if (e2 != '\t' && e2 != '\n' && e2 != '\f' && e2 != '\r') {
                        cVar.m.c.append(e2);
                        return;
                    }
                }
                cVar.p(d.AfterDoctypeName);
            }
        };
        DoctypeName = dVar53;
        d dVar54 = new d() { // from class: org.jsoup.parser.d.w0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                if (bmbVar.n()) {
                    cVar.m(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                    return;
                }
                if (bmbVar.s('\t', '\n', '\r', '\f', ' ')) {
                    bmbVar.a();
                    return;
                }
                if (bmbVar.r('>')) {
                    cVar.k();
                    cVar.a(d.Data);
                    return;
                }
                if (bmbVar.q(Privacy.PUBLIC)) {
                    cVar.m.d = Privacy.PUBLIC;
                    cVar.p(d.AfterDoctypePublicKeyword);
                } else if (bmbVar.q("SYSTEM")) {
                    cVar.m.d = "SYSTEM";
                    cVar.p(d.AfterDoctypeSystemKeyword);
                } else {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.a(d.BogusDoctype);
                }
            }
        };
        AfterDoctypeName = dVar54;
        d dVar55 = new d() { // from class: org.jsoup.parser.d.x0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    cVar.p(d.BeforeDoctypePublicIdentifier);
                    return;
                }
                if (e2 == '\"') {
                    cVar.n(this);
                    cVar.p(d.DoctypePublicIdentifier_doubleQuoted);
                    return;
                }
                if (e2 == '\'') {
                    cVar.n(this);
                    cVar.p(d.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                    return;
                }
                if (e2 != 65535) {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.p(d.BogusDoctype);
                } else {
                    cVar.m(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                }
            }
        };
        AfterDoctypePublicKeyword = dVar55;
        d dVar56 = new d() { // from class: org.jsoup.parser.d.y0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    return;
                }
                if (e2 == '\"') {
                    cVar.p(d.DoctypePublicIdentifier_doubleQuoted);
                    return;
                }
                if (e2 == '\'') {
                    cVar.p(d.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                    return;
                }
                if (e2 != 65535) {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.p(d.BogusDoctype);
                } else {
                    cVar.m(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                }
            }
        };
        BeforeDoctypePublicIdentifier = dVar56;
        d dVar57 = new d() { // from class: org.jsoup.parser.d.z0
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.m.e.append(d.replacementChar);
                    return;
                }
                if (e2 == '\"') {
                    cVar.p(d.AfterDoctypePublicIdentifier);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                    return;
                }
                if (e2 != 65535) {
                    cVar.m.e.append(e2);
                    return;
                }
                cVar.m(this);
                cVar.m.g = true;
                cVar.k();
                cVar.p(d.Data);
            }
        };
        DoctypePublicIdentifier_doubleQuoted = dVar57;
        d dVar58 = new d() { // from class: org.jsoup.parser.d.a1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.m.e.append(d.replacementChar);
                    return;
                }
                if (e2 == '\'') {
                    cVar.p(d.AfterDoctypePublicIdentifier);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                    return;
                }
                if (e2 != 65535) {
                    cVar.m.e.append(e2);
                    return;
                }
                cVar.m(this);
                cVar.m.g = true;
                cVar.k();
                cVar.p(d.Data);
            }
        };
        DoctypePublicIdentifier_singleQuoted = dVar58;
        d dVar59 = new d() { // from class: org.jsoup.parser.d.b1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    cVar.p(d.BetweenDoctypePublicAndSystemIdentifiers);
                    return;
                }
                if (e2 == '\"') {
                    cVar.n(this);
                    cVar.p(d.DoctypeSystemIdentifier_doubleQuoted);
                    return;
                }
                if (e2 == '\'') {
                    cVar.n(this);
                    cVar.p(d.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                if (e2 == '>') {
                    cVar.k();
                    cVar.p(d.Data);
                } else if (e2 != 65535) {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.p(d.BogusDoctype);
                } else {
                    cVar.m(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                }
            }
        };
        AfterDoctypePublicIdentifier = dVar59;
        d dVar60 = new d() { // from class: org.jsoup.parser.d.d1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    return;
                }
                if (e2 == '\"') {
                    cVar.n(this);
                    cVar.p(d.DoctypeSystemIdentifier_doubleQuoted);
                    return;
                }
                if (e2 == '\'') {
                    cVar.n(this);
                    cVar.p(d.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                if (e2 == '>') {
                    cVar.k();
                    cVar.p(d.Data);
                } else if (e2 != 65535) {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.p(d.BogusDoctype);
                } else {
                    cVar.m(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                }
            }
        };
        BetweenDoctypePublicAndSystemIdentifiers = dVar60;
        d dVar61 = new d() { // from class: org.jsoup.parser.d.e1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    cVar.p(d.BeforeDoctypeSystemIdentifier);
                    return;
                }
                if (e2 == '\"') {
                    cVar.n(this);
                    cVar.p(d.DoctypeSystemIdentifier_doubleQuoted);
                    return;
                }
                if (e2 == '\'') {
                    cVar.n(this);
                    cVar.p(d.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                    return;
                }
                if (e2 != 65535) {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.k();
                } else {
                    cVar.m(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                }
            }
        };
        AfterDoctypeSystemKeyword = dVar61;
        d dVar62 = new d() { // from class: org.jsoup.parser.d.f1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    return;
                }
                if (e2 == '\"') {
                    cVar.p(d.DoctypeSystemIdentifier_doubleQuoted);
                    return;
                }
                if (e2 == '\'') {
                    cVar.p(d.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                    return;
                }
                if (e2 != 65535) {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.p(d.BogusDoctype);
                } else {
                    cVar.m(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                }
            }
        };
        BeforeDoctypeSystemIdentifier = dVar62;
        d dVar63 = new d() { // from class: org.jsoup.parser.d.g1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.m.f.append(d.replacementChar);
                    return;
                }
                if (e2 == '\"') {
                    cVar.p(d.AfterDoctypeSystemIdentifier);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                    return;
                }
                if (e2 != 65535) {
                    cVar.m.f.append(e2);
                    return;
                }
                cVar.m(this);
                cVar.m.g = true;
                cVar.k();
                cVar.p(d.Data);
            }
        };
        DoctypeSystemIdentifier_doubleQuoted = dVar63;
        d dVar64 = new d() { // from class: org.jsoup.parser.d.h1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == 0) {
                    cVar.n(this);
                    cVar.m.f.append(d.replacementChar);
                    return;
                }
                if (e2 == '\'') {
                    cVar.p(d.AfterDoctypeSystemIdentifier);
                    return;
                }
                if (e2 == '>') {
                    cVar.n(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                    return;
                }
                if (e2 != 65535) {
                    cVar.m.f.append(e2);
                    return;
                }
                cVar.m(this);
                cVar.m.g = true;
                cVar.k();
                cVar.p(d.Data);
            }
        };
        DoctypeSystemIdentifier_singleQuoted = dVar64;
        d dVar65 = new d() { // from class: org.jsoup.parser.d.i1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                    return;
                }
                if (e2 == '>') {
                    cVar.k();
                    cVar.p(d.Data);
                } else if (e2 != 65535) {
                    cVar.n(this);
                    cVar.p(d.BogusDoctype);
                } else {
                    cVar.m(this);
                    cVar.m.g = true;
                    cVar.k();
                    cVar.p(d.Data);
                }
            }
        };
        AfterDoctypeSystemIdentifier = dVar65;
        d dVar66 = new d() { // from class: org.jsoup.parser.d.j1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                char e2 = bmbVar.e();
                if (e2 == '>') {
                    cVar.k();
                    cVar.p(d.Data);
                } else {
                    if (e2 != 65535) {
                        return;
                    }
                    cVar.k();
                    cVar.p(d.Data);
                }
            }
        };
        BogusDoctype = dVar66;
        d dVar67 = new d() { // from class: org.jsoup.parser.d.k1
            @Override // org.jsoup.parser.d
            public final void k(org.jsoup.parser.c cVar, bmb bmbVar) {
                String c2;
                int v2 = bmbVar.v("]]>");
                if (v2 != -1) {
                    c2 = bmb.c(bmbVar.a, bmbVar.h, bmbVar.e, v2);
                    bmbVar.e += v2;
                } else {
                    int i2 = bmbVar.c;
                    int i3 = bmbVar.e;
                    if (i2 - i3 < 3) {
                        bmbVar.b();
                        char[] cArr = bmbVar.a;
                        String[] strArr = bmbVar.h;
                        int i4 = bmbVar.e;
                        c2 = bmb.c(cArr, strArr, i4, bmbVar.c - i4);
                        bmbVar.e = bmbVar.c;
                    } else {
                        int i5 = i2 - 2;
                        c2 = bmb.c(bmbVar.a, bmbVar.h, i3, i5 - i3);
                        bmbVar.e = i5;
                    }
                }
                cVar.h.append(c2);
                if (bmbVar.p("]]>") || bmbVar.n()) {
                    String sb = cVar.h.toString();
                    Token.a aVar = new Token.a();
                    aVar.c = sb;
                    cVar.i(aVar);
                    cVar.p(d.Data);
                }
            }
        };
        CdataSection = dVar67;
        $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23, dVar24, dVar25, dVar26, dVar27, dVar28, dVar29, dVar30, dVar31, dVar32, dVar33, dVar34, dVar35, dVar36, dVar37, dVar38, dVar39, dVar40, dVar41, dVar42, dVar43, dVar44, dVar45, dVar46, dVar47, dVar48, dVar49, dVar50, dVar51, dVar52, dVar53, dVar54, dVar55, dVar56, dVar57, dVar58, dVar59, dVar60, dVar61, dVar62, dVar63, dVar64, dVar65, dVar66, dVar67};
        attributeNameCharsSorted = new char[]{'\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', B5.U, '>'};
        attributeValueUnquoted = new char[]{nullChar, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', B5.U, '>', '`'};
        replacementStr = String.valueOf(replacementChar);
    }

    public d() {
        throw null;
    }

    public static void a(org.jsoup.parser.c cVar, bmb bmbVar, d dVar, d dVar2) {
        char l2 = bmbVar.l();
        if (l2 == 0) {
            cVar.n(dVar);
            bmbVar.a();
            cVar.f(replacementChar);
            return;
        }
        if (l2 == '<') {
            cVar.a(dVar2);
            return;
        }
        if (l2 == 65535) {
            cVar.i(new Token.e());
            return;
        }
        int i2 = bmbVar.e;
        int i3 = bmbVar.c;
        char[] cArr = bmbVar.a;
        int i4 = i2;
        while (i4 < i3) {
            char c2 = cArr[i4];
            if (c2 == 0 || c2 == '<') {
                break;
            } else {
                i4++;
            }
        }
        bmbVar.e = i4;
        cVar.g(i4 > i2 ? bmb.c(bmbVar.a, bmbVar.h, i2, i4 - i2) : "");
    }

    public static void i(org.jsoup.parser.c cVar, bmb bmbVar, d dVar) {
        if (bmbVar.u()) {
            String h2 = bmbVar.h();
            cVar.k.q(h2);
            cVar.h.append(h2);
            return;
        }
        boolean o2 = cVar.o();
        StringBuilder sb = cVar.h;
        if (o2 && !bmbVar.n()) {
            char e2 = bmbVar.e();
            if (e2 == '\t' || e2 == '\n' || e2 == '\f' || e2 == '\r' || e2 == ' ') {
                cVar.p(BeforeAttributeName);
                return;
            }
            if (e2 == '/') {
                cVar.p(SelfClosingStartTag);
                return;
            } else {
                if (e2 == '>') {
                    cVar.l();
                    cVar.p(Data);
                    return;
                }
                sb.append(e2);
            }
        }
        cVar.g("</");
        cVar.h(sb);
        cVar.p(dVar);
    }

    public static void j(org.jsoup.parser.c cVar, bmb bmbVar, d dVar, d dVar2) {
        if (bmbVar.u()) {
            String h2 = bmbVar.h();
            cVar.h.append(h2);
            cVar.g(h2);
            return;
        }
        char e2 = bmbVar.e();
        if (e2 != '\t' && e2 != '\n' && e2 != '\f' && e2 != '\r' && e2 != ' ' && e2 != '/' && e2 != '>') {
            bmbVar.z();
            cVar.p(dVar2);
        } else {
            if (cVar.h.toString().equals("script")) {
                cVar.p(dVar);
            } else {
                cVar.p(dVar2);
            }
            cVar.f(e2);
        }
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public abstract void k(org.jsoup.parser.c cVar, bmb bmbVar);
}
