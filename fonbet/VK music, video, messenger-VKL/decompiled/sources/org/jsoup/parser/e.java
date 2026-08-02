package org.jsoup.parser;

import java.util.ArrayList;
import java.util.HashMap;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.g;
import org.jsoup.parser.Token;
import xsna.bmb;
import xsna.c0o0;
import xsna.cj90;
import xsna.od50;

/* compiled from: TreeBuilder.java */
/* loaded from: classes8.dex */
public abstract class e {
    public od50 a;
    public bmb b;
    public c c;
    public Document d;
    public ArrayList<g> e;
    public String f;
    public Token g;
    public cj90 h;
    public HashMap i;
    public Token.g j;
    public Token.f k;

    public final g a() {
        int size = this.e.size();
        return size > 0 ? this.e.get(size - 1) : this.d;
    }

    public final boolean b(String str) {
        g a;
        return (this.e.size() == 0 || (a = a()) == null || !a.e.c.equals(str)) ? false : true;
    }

    public abstract boolean c(Token token);

    public final boolean d(String str) {
        Token token = this.g;
        Token.f fVar = this.k;
        if (token == fVar) {
            Token.f fVar2 = new Token.f();
            fVar2.t(str);
            return c(fVar2);
        }
        fVar.l();
        fVar.t(str);
        return c(fVar);
    }

    public final void e(String str) {
        Token.g gVar = this.j;
        if (this.g == gVar) {
            Token.g gVar2 = new Token.g();
            gVar2.t(str);
            c(gVar2);
        } else {
            gVar.l();
            gVar.t(str);
            c(gVar);
        }
    }

    public final void f() {
        Token token;
        c cVar = this.c;
        Token.TokenType tokenType = Token.TokenType.EOF;
        do {
            Token.b bVar = cVar.l;
            while (!cVar.e) {
                cVar.c.k(cVar, cVar.a);
            }
            StringBuilder sb = cVar.g;
            if (sb.length() != 0) {
                String sb2 = sb.toString();
                sb.delete(0, sb.length());
                bVar.c = sb2;
                cVar.f = null;
                token = bVar;
            } else {
                String str = cVar.f;
                if (str != null) {
                    bVar.c = str;
                    cVar.f = null;
                    token = bVar;
                } else {
                    cVar.e = false;
                    token = cVar.d;
                }
            }
            c(token);
            token.l();
        } while (token.b != tokenType);
    }

    public final c0o0 g(String str, cj90 cj90Var) {
        c0o0 c0o0Var = (c0o0) this.i.get(str);
        if (c0o0Var != null) {
            return c0o0Var;
        }
        c0o0 a = c0o0.a(str, cj90Var);
        this.i.put(str, a);
        return a;
    }
}
