package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.r231;
import jason.statham.interpreter.error.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes9.dex */
public final class juw {
    public final r231 a = new r231();
    public Object b;

    public static String j(jje jjeVar, hif hifVar, char c) {
        StringBuilder sb = (StringBuilder) jjeVar.g.b();
        while (hifVar.c()) {
            char f = hifVar.f();
            if (f == c) {
                String sb2 = sb.toString();
                jjeVar.g.a(sb);
                return sb2;
            }
            if (f == '\\') {
                sb.append(hifVar.f());
            } else {
                sb.append(f);
            }
        }
        throw a.i("Unclosed string literal (expected " + rhb1.e(Character.valueOf(c)) + " character)");
    }

    public static yi9 k(jje jjeVar, hif hifVar, char c) {
        char d;
        if (('a' > c || c >= '{') && (('A' > c || c >= '[') && c != '_')) {
            throw a.h();
        }
        yi9 yi9Var = (yi9) jjeVar.f.b();
        yi9Var.b(c);
        while (hifVar.c() && (('a' <= (d = hifVar.d()) && d < '{') || (('A' <= d && d < '[') || (('0' <= d && d < ':') || d == '_')))) {
            yi9Var.b(d);
            hifVar.e();
        }
        return yi9Var;
    }

    public static void m(hif hifVar, char c) {
        if (!hifVar.c()) {
            throw a.e(c, hifVar.c);
        }
        if (hifVar.d() != c) {
            throw a.m(hifVar.d(), hifVar.c, Character.valueOf(c));
        }
        hifVar.e();
    }

    public static void n(hif hifVar, char c) {
        while (hifVar.c()) {
            char d = hifVar.d();
            if (d != ' ') {
                if (d != c) {
                    throw a.m(d, hifVar.c, Character.valueOf(c));
                }
                hifVar.e();
                return;
            }
            hifVar.e();
        }
        throw a.e(c, hifVar.c);
    }

    public static void o(hif hifVar) {
        n(hifVar, '{');
        int i = 1;
        while (hifVar.c()) {
            char f = hifVar.f();
            if (f == '{') {
                i++;
            } else if (f == '}') {
                if (i <= 0) {
                    throw a.m('}', hifVar.c, null);
                }
                i--;
                if (i == 0) {
                    return;
                }
            } else if (f == '\'') {
                t(hifVar, '\'');
            } else if (f == '\"') {
                t(hifVar, OpenList.CHAR_QUOTE);
            }
        }
        throw a.i("Unclosed control flow");
    }

    public static void p(hif hifVar, int i) {
        while (true) {
            boolean z = true;
            while (hifVar.c()) {
                char d = hifVar.d();
                if (d == ' ' || d == '\n' || d == '\t') {
                    hifVar.e();
                } else if (z) {
                    hifVar.e();
                    q(hifVar, d);
                    z = false;
                } else if (d == '+') {
                    if (11 < i) {
                        return;
                    } else {
                        hifVar.e();
                    }
                } else if (d == '-') {
                    if (12 < i) {
                        return;
                    } else {
                        hifVar.e();
                    }
                } else if (d == '*') {
                    if (13 < i) {
                        return;
                    } else {
                        hifVar.e();
                    }
                } else if (d == '/') {
                    if (14 < i) {
                        return;
                    } else {
                        hifVar.e();
                    }
                } else if (d == '%') {
                    if (15 < i) {
                        return;
                    } else {
                        hifVar.e();
                    }
                } else if (d == '&') {
                    if (4 < i) {
                        return;
                    }
                    hifVar.e();
                    m(hifVar, '&');
                } else if (d == '|') {
                    if (3 < i) {
                        return;
                    }
                    hifVar.e();
                    m(hifVar, '|');
                } else if (d == '!') {
                    if (16 < i) {
                        return;
                    }
                    hifVar.e();
                    hifVar.h('=');
                } else if (d == '=') {
                    if (5 < i) {
                        return;
                    }
                    hifVar.e();
                    hifVar.h('=');
                } else if (d == '>') {
                    if (8 < i) {
                        return;
                    }
                    hifVar.e();
                    hifVar.h('=');
                } else if (d == '<') {
                    if (7 < i) {
                        return;
                    }
                    hifVar.e();
                    hifVar.h('=');
                } else {
                    if (d != '?') {
                        return;
                    }
                    if (2 >= i && hifVar.i("??")) {
                        p(hifVar, 2);
                    } else {
                        if (1 < i) {
                            return;
                        }
                        hifVar.e();
                        p(hifVar, 1);
                        n(hifVar, ':');
                        p(hifVar, 1);
                    }
                }
            }
            return;
        }
    }

    public static void q(hif hifVar, char c) {
        char d;
        if ('0' <= c && c < ':') {
            r(hifVar);
            return;
        }
        if (('a' <= c && c < '{') || (('A' <= c && c < '[') || c == '_')) {
            while (hifVar.c() && (('a' <= (d = hifVar.d()) && d < '{') || (('A' <= d && d < '[') || (('0' <= d && d < ':') || d == '_')))) {
                hifVar.e();
            }
            if (hifVar.c()) {
                char d2 = hifVar.d();
                if (d2 != '(') {
                    if (d2 == '[') {
                        hifVar.e();
                        p(hifVar, 0);
                        m(hifVar, ']');
                        return;
                    }
                    return;
                }
                hifVar.e();
                while (hifVar.c()) {
                    char d3 = hifVar.d();
                    if (d3 == ',' || d3 == ' ' || d3 == '\n' || d3 == '\t') {
                        hifVar.e();
                    } else if (d3 == '(') {
                        p(hifVar, 0);
                    } else {
                        if (d3 == ')') {
                            hifVar.e();
                            return;
                        }
                        p(hifVar, 0);
                    }
                }
                throw a.i("Incomplete function call");
            }
            return;
        }
        if (c == '-') {
            r(hifVar);
            return;
        }
        if (c == '!') {
            q(hifVar, hifVar.f());
            return;
        }
        if (c == '@') {
            while (hifVar.c()) {
                char d4 = hifVar.d();
                if (('a' > d4 || d4 >= '{') && (('A' > d4 || d4 >= '[') && (('0' > d4 || d4 >= ':') && d4 != '_'))) {
                    return;
                } else {
                    hifVar.e();
                }
            }
            return;
        }
        if (c == '\'') {
            t(hifVar, '\'');
            return;
        }
        if (c == '\"') {
            t(hifVar, OpenList.CHAR_QUOTE);
            return;
        }
        if (c == '[') {
            while (hifVar.c()) {
                char d5 = hifVar.d();
                if (d5 == ',' || d5 == ' ' || d5 == '\n' || d5 == '\t') {
                    hifVar.e();
                } else {
                    if (d5 == ']') {
                        hifVar.e();
                        return;
                    }
                    p(hifVar, 0);
                }
            }
            throw a.i("Incomplete list initializer");
        }
        if (c != '{') {
            if (c != '(') {
                hifVar.b();
                throw a.m(c, hifVar.c, null);
            }
            p(hifVar, 0);
            m(hifVar, ')');
            return;
        }
        while (hifVar.c()) {
            char d6 = hifVar.d();
            if (d6 == ',' || d6 == ' ' || d6 == '\n' || d6 == '\t') {
                hifVar.e();
            } else if (d6 == '}') {
                hifVar.e();
                return;
            } else {
                p(hifVar, 0);
                n(hifVar, ':');
                p(hifVar, 0);
            }
        }
        throw a.i("Incomplete dictionary initializer");
    }

    public static void r(hif hifVar) {
        char d;
        while (hifVar.c()) {
            char d2 = hifVar.d();
            if ('0' > d2 || d2 >= ':') {
                if (d2 == '.') {
                    hifVar.e();
                    while (hifVar.c() && '0' <= (d = hifVar.d()) && d < ':') {
                        hifVar.e();
                    }
                    return;
                }
                return;
            }
            hifVar.e();
        }
    }

    public static char s(hif hifVar) {
        while (hifVar.c()) {
            char d = hifVar.d();
            if (d != ' ') {
                return d;
            }
            hifVar.e();
        }
        return (char) 0;
    }

    public static void t(hif hifVar, char c) {
        char f;
        while (hifVar.c() && (f = hifVar.f()) != c) {
            if (f == '\\') {
                hifVar.e();
            }
        }
    }

    public final Object a(jje jjeVar, char[] cArr) {
        hif hifVar = new hif(cArr);
        while (hifVar.c()) {
            try {
                char f = hifVar.f();
                if (f != '\n' && f != '\t' && f != ';' && f != ' ') {
                    int h = h(jjeVar, hifVar, f);
                    if (h == 1) {
                        return this.b;
                    }
                    if (h == 2) {
                        throw a.i("Unexpected keyword 'continue'");
                    }
                    if (h == 3) {
                        throw a.i("Unexpected keyword 'break'");
                    }
                }
            } finally {
            }
        }
        return this.b;
    }

    public final int b(jje jjeVar, hif hifVar) {
        n(hifVar, '{');
        while (hifVar.c()) {
            char f = hifVar.f();
            if (f != '\n' && f != '\t' && f != ';' && f != ' ') {
                if (f == '}') {
                    return 0;
                }
                int h = h(jjeVar, hifVar, f);
                if (h != 0) {
                    return h;
                }
            }
        }
        throw a.i("Unclosed control flow");
    }

    public final Object c(jje jjeVar, hif hifVar) {
        Object c;
        Object c2;
        Object c3;
        seu seuVar = seu.E;
        ye7 ye7Var = (ye7) jjeVar.h.b();
        while (hifVar.c()) {
            char d = hifVar.d();
            if (d != ' ' && d != '\n' && d != '\t') {
                if (!ye7Var.c) {
                    if (d != '+') {
                        if (d != '-') {
                            if (d != '*') {
                                if (d != '/') {
                                    if (d != '%') {
                                        if (d != '&') {
                                            if (d != '|') {
                                                if (d != '!') {
                                                    if (d != '=') {
                                                        if (d != '>') {
                                                            if (d != '<') {
                                                                if (d != '?') {
                                                                    break;
                                                                }
                                                                hifVar.e();
                                                                if (hifVar.h('?')) {
                                                                    Object c4 = ye7Var.c(2);
                                                                    if (jl40.l(c4, seuVar)) {
                                                                        ye7Var.d(c(jjeVar, hifVar));
                                                                    } else {
                                                                        ye7Var.d(c4);
                                                                        p(hifVar, 2);
                                                                    }
                                                                } else {
                                                                    Object c5 = ye7Var.c(1);
                                                                    if (!(c5 instanceof Boolean)) {
                                                                        throw a.a("Invalid condition " + c5 + " (allowed boolean only)");
                                                                    }
                                                                    if (((Boolean) c5).booleanValue()) {
                                                                        c3 = c(jjeVar, hifVar);
                                                                        n(hifVar, ':');
                                                                        p(hifVar, 1);
                                                                    } else {
                                                                        p(hifVar, 1);
                                                                        n(hifVar, ':');
                                                                        c3 = c(jjeVar, hifVar);
                                                                    }
                                                                    ye7Var.d(c3);
                                                                }
                                                            } else {
                                                                hifVar.e();
                                                                if (hifVar.h('=')) {
                                                                    ye7Var.a(9);
                                                                } else {
                                                                    ye7Var.a(7);
                                                                }
                                                            }
                                                        } else {
                                                            hifVar.e();
                                                            if (hifVar.h('=')) {
                                                                ye7Var.a(10);
                                                            } else {
                                                                ye7Var.a(8);
                                                            }
                                                        }
                                                    } else {
                                                        hifVar.e();
                                                        m(hifVar, '=');
                                                        ye7Var.a(5);
                                                    }
                                                } else {
                                                    hifVar.e();
                                                    if (hifVar.h('=')) {
                                                        ye7Var.a(6);
                                                    } else {
                                                        ye7Var.a(16);
                                                    }
                                                }
                                            } else {
                                                hifVar.e();
                                                m(hifVar, '|');
                                                Object c6 = ye7Var.c(3);
                                                if (!(c6 instanceof Boolean)) {
                                                    throw a.a("Disjunction for " + rhb1.e(c6) + " is not defined");
                                                }
                                                if (((Boolean) c6).booleanValue()) {
                                                    p(hifVar, 3);
                                                    c2 = Boolean.TRUE;
                                                } else {
                                                    c2 = c(jjeVar, hifVar);
                                                }
                                                ye7Var.d(c2);
                                            }
                                        } else {
                                            hifVar.e();
                                            m(hifVar, '&');
                                            Object c7 = ye7Var.c(4);
                                            if (!(c7 instanceof Boolean)) {
                                                throw a.a("Conjunction for " + rhb1.e(c7) + " is not defined");
                                            }
                                            if (((Boolean) c7).booleanValue()) {
                                                c = c(jjeVar, hifVar);
                                            } else {
                                                p(hifVar, 4);
                                                c = Boolean.FALSE;
                                            }
                                            ye7Var.d(c);
                                        }
                                    } else {
                                        ye7Var.a(15);
                                        hifVar.e();
                                    }
                                } else {
                                    ye7Var.a(14);
                                    hifVar.e();
                                }
                            } else {
                                ye7Var.a(13);
                                hifVar.e();
                            }
                        } else {
                            ye7Var.a(12);
                            hifVar.e();
                        }
                    } else {
                        ye7Var.a(11);
                        hifVar.e();
                    }
                } else {
                    hifVar.e();
                    ye7Var.d(f(jjeVar, hifVar, d));
                }
            } else {
                hifVar.e();
            }
        }
        while (ye7Var.b.c > 0) {
            ye7Var.b();
        }
        jnj jnjVar = ye7Var.a;
        int i = jnjVar.c;
        if (i != 1) {
            throw a.i("Missing value");
        }
        Object obj = jnjVar.a[i - 1];
        jjeVar.h.a(ye7Var);
        if (jl40.l(obj, seuVar)) {
            throw a.a("Missing value");
        }
        return obj;
    }

    public final Object d(jje jjeVar, hif hifVar, yi9 yi9Var) {
        ams amsVar = null;
        switch (yi9Var.d) {
            case 3:
                char a = yi9Var.a(0);
                if (a != 'i') {
                    if (a != 's') {
                        if (a != 'a') {
                            if (a != 'm') {
                                if (a != 'p') {
                                    if (a == 'n' && yi9Var.a(1) == 'o' && yi9Var.a(2) == 'w') {
                                        amsVar = xms.H;
                                        break;
                                    }
                                } else if (yi9Var.a(1) == 'o' && yi9Var.a(2) == 'p') {
                                    amsVar = xms.K;
                                    break;
                                }
                            } else {
                                char a2 = yi9Var.a(1);
                                if (a2 != 'a') {
                                    if (a2 == 'i' && yi9Var.a(2) == 'n') {
                                        amsVar = xms.k;
                                        break;
                                    }
                                } else if (yi9Var.a(2) == 'x') {
                                    amsVar = xms.j;
                                    break;
                                }
                            }
                        } else if (yi9Var.a(1) == 'b' && yi9Var.a(2) == 's') {
                            amsVar = xms.i;
                            break;
                        }
                    } else if (yi9Var.a(1) == 't' && yi9Var.a(2) == 'r') {
                        amsVar = xms.e;
                        break;
                    }
                } else if (yi9Var.a(1) == 'n' && yi9Var.a(2) == 't') {
                    amsVar = xms.c;
                    break;
                }
                break;
            case 4:
                char a3 = yi9Var.a(0);
                if (a3 != 'b') {
                    if (a3 != 'l') {
                        if (a3 != 'd') {
                            if (a3 != 'j') {
                                if (a3 != 't') {
                                    if (a3 != 'p') {
                                        if (a3 != 's') {
                                            if (a3 == 'c' && yi9Var.a(1) == 'o' && yi9Var.a(2) == 'p' && yi9Var.a(3) == 'y') {
                                                amsVar = xms.E;
                                                break;
                                            }
                                        } else {
                                            char a4 = yi9Var.a(1);
                                            if (a4 != 'o') {
                                                if (a4 == 'a' && yi9Var.a(2) == 'm' && yi9Var.a(3) == 'e') {
                                                    amsVar = xms.F;
                                                    break;
                                                }
                                            } else if (yi9Var.a(2) == 'r' && yi9Var.a(3) == 't') {
                                                amsVar = xms.N;
                                                break;
                                            }
                                        }
                                    } else if (yi9Var.a(1) == 'u' && yi9Var.a(2) == 's' && yi9Var.a(3) == 'h') {
                                        amsVar = xms.J;
                                        break;
                                    }
                                } else if (yi9Var.a(1) == 'r' && yi9Var.a(2) == 'i' && yi9Var.a(3) == 'm') {
                                    amsVar = xms.s;
                                    break;
                                }
                            } else if (yi9Var.a(1) == 's' && yi9Var.a(2) == 'o' && yi9Var.a(3) == 'n') {
                                amsVar = xms.f;
                                break;
                            }
                        } else if (yi9Var.a(1) == 'i' && yi9Var.a(2) == 'c' && yi9Var.a(3) == 't') {
                            amsVar = xms.h;
                            break;
                        }
                    } else {
                        char a5 = yi9Var.a(1);
                        if (a5 != 'i') {
                            if (a5 == 'o' && yi9Var.a(2) == 'a' && yi9Var.a(3) == 'd') {
                                amsVar = xms.B;
                                break;
                            }
                        } else if (yi9Var.a(2) == 's' && yi9Var.a(3) == 't') {
                            amsVar = xms.g;
                            break;
                        }
                    }
                } else if (yi9Var.a(1) == 'o' && yi9Var.a(2) == 'o' && yi9Var.a(3) == 'l') {
                    amsVar = xms.b;
                    break;
                }
                break;
            case 5:
                char a6 = yi9Var.a(0);
                if (a6 != 'f') {
                    if (a6 != 'b') {
                        if (a6 != 'u') {
                            if (a6 != 'l') {
                                if (a6 != 'c') {
                                    if (a6 != 'i') {
                                        if (a6 != 'e') {
                                            if (a6 != 'p') {
                                                if (a6 == 's' && yi9Var.a(1) == 't' && yi9Var.a(2) == 'o' && yi9Var.a(3) == 'r' && yi9Var.a(4) == 'e') {
                                                    amsVar = xms.C;
                                                    break;
                                                }
                                            } else if (yi9Var.a(1) == 'r' && yi9Var.a(2) == 'i' && yi9Var.a(3) == 'n' && yi9Var.a(4) == 't') {
                                                amsVar = xms.a;
                                                break;
                                            }
                                        } else if (yi9Var.a(1) == 'm' && yi9Var.a(2) == 'p' && yi9Var.a(3) == 't' && yi9Var.a(4) == 'y') {
                                            amsVar = xms.l;
                                            break;
                                        }
                                    } else if (yi9Var.a(1) == 'n' && yi9Var.a(2) == 'd' && yi9Var.a(3) == 'e' && yi9Var.a(4) == 'x') {
                                        amsVar = xms.o;
                                        break;
                                    }
                                } else {
                                    char a7 = yi9Var.a(1);
                                    if (a7 != 'l') {
                                        if (a7 == 'o' && yi9Var.a(2) == 'u' && yi9Var.a(3) == 'n' && yi9Var.a(4) == 't') {
                                            amsVar = xms.m;
                                            break;
                                        }
                                    } else if (yi9Var.a(2) == 'o' && yi9Var.a(3) == 'n' && yi9Var.a(4) == 'e') {
                                        amsVar = xms.M;
                                        break;
                                    }
                                }
                            } else if (yi9Var.a(1) == 'o' && yi9Var.a(2) == 'w' && yi9Var.a(3) == 'e' && yi9Var.a(4) == 'r') {
                                amsVar = xms.r;
                                break;
                            }
                        } else if (yi9Var.a(1) == 'p' && yi9Var.a(2) == 'p' && yi9Var.a(3) == 'e' && yi9Var.a(4) == 'r') {
                            amsVar = xms.q;
                            break;
                        }
                    } else if (yi9Var.a(1) == 'l' && yi9Var.a(2) == 'a' && yi9Var.a(3) == 'n' && yi9Var.a(4) == 'k') {
                        amsVar = xms.p;
                        break;
                    }
                } else if (yi9Var.a(1) == 'l' && yi9Var.a(2) == 'o' && yi9Var.a(3) == 'a' && yi9Var.a(4) == 't') {
                    amsVar = xms.d;
                    break;
                }
                break;
            case 6:
                char a8 = yi9Var.a(0);
                if (a8 != 'i') {
                    if (a8 != 'r') {
                        if (a8 == 'd' && yi9Var.a(1) == 'e' && yi9Var.a(2) == 'l' && yi9Var.a(3) == 'e' && yi9Var.a(4) == 't' && yi9Var.a(5) == 'e') {
                            amsVar = xms.D;
                            break;
                        }
                    } else {
                        char a9 = yi9Var.a(1);
                        if (a9 != 'e') {
                            if (a9 == 'a' && yi9Var.a(2) == 'n' && yi9Var.a(3) == 'd' && yi9Var.a(4) == 'o' && yi9Var.a(5) == 'm') {
                                amsVar = xms.I;
                                break;
                            }
                        } else if (yi9Var.a(2) == 'm' && yi9Var.a(3) == 'o' && yi9Var.a(4) == 'v' && yi9Var.a(5) == 'e') {
                            amsVar = xms.x;
                            break;
                        }
                    }
                } else if (yi9Var.a(1) == 'n' && yi9Var.a(2) == 's' && yi9Var.a(3) == 'e' && yi9Var.a(4) == 'r' && yi9Var.a(5) == 't') {
                    amsVar = xms.L;
                    break;
                }
                break;
            case 7:
                char a10 = yi9Var.a(0);
                if (a10 != 't') {
                    if (a10 != 'r') {
                        if (a10 == 's' && yi9Var.a(1) == 'u' && yi9Var.a(2) == 'b' && yi9Var.a(3) == 'l' && yi9Var.a(4) == 'i' && yi9Var.a(5) == 's' && yi9Var.a(6) == 't') {
                            amsVar = xms.A;
                            break;
                        }
                    } else if (yi9Var.a(1) == 'e') {
                        char a11 = yi9Var.a(2);
                        if (a11 != 'p') {
                            if (a11 == 'v' && yi9Var.a(3) == 'e' && yi9Var.a(4) == 'r' && yi9Var.a(5) == 's' && yi9Var.a(6) == 'e') {
                                amsVar = xms.O;
                                break;
                            }
                        } else if (yi9Var.a(3) == 'l' && yi9Var.a(4) == 'a' && yi9Var.a(5) == 'c' && yi9Var.a(6) == 'e') {
                            amsVar = xms.y;
                            break;
                        }
                    }
                } else if (yi9Var.a(1) == 'r' && yi9Var.a(2) == 'i' && yi9Var.a(3) == 'm' && yi9Var.a(4) == 'e' && yi9Var.a(5) == 'n' && yi9Var.a(6) == 'd') {
                    amsVar = xms.u;
                    break;
                }
                break;
            case 8:
                char a12 = yi9Var.a(0);
                if (a12 != 'e') {
                    if (a12 != 'd') {
                        if (a12 == 'c' && yi9Var.a(1) == 'o' && yi9Var.a(2) == 'n' && yi9Var.a(3) == 't' && yi9Var.a(4) == 'a' && yi9Var.a(5) == 'i' && yi9Var.a(6) == 'n' && yi9Var.a(7) == 's') {
                            amsVar = xms.n;
                            break;
                        }
                    } else if (yi9Var.a(1) == 'i' && yi9Var.a(2) == 's') {
                        char a13 = yi9Var.a(3);
                        if (a13 != 't') {
                            if (a13 == 'p' && yi9Var.a(4) == 'a' && yi9Var.a(5) == 't' && yi9Var.a(6) == 'c' && yi9Var.a(7) == 'h') {
                                amsVar = xms.G;
                                break;
                            }
                        } else if (yi9Var.a(4) == 'i' && yi9Var.a(5) == 'n' && yi9Var.a(6) == 'c' && yi9Var.a(7) == 't') {
                            amsVar = xms.P;
                            break;
                        }
                    }
                } else if (yi9Var.a(1) == 'n' && yi9Var.a(2) == 'd' && yi9Var.a(3) == 's' && yi9Var.a(4) == 'w' && yi9Var.a(5) == 'i' && yi9Var.a(6) == 't' && yi9Var.a(7) == 'h') {
                    amsVar = xms.w;
                    break;
                }
                break;
            case 9:
                char a14 = yi9Var.a(0);
                if (a14 != 't') {
                    if (a14 != 's') {
                        if (a14 == 'l' && yi9Var.a(1) == 'a' && yi9Var.a(2) == 's' && yi9Var.a(3) == 't' && yi9Var.a(4) == 'i' && yi9Var.a(5) == 'n' && yi9Var.a(6) == 'd' && yi9Var.a(7) == 'e' && yi9Var.a(8) == 'x') {
                            amsVar = xms.Q;
                            break;
                        }
                    } else if (yi9Var.a(1) == 'u' && yi9Var.a(2) == 'b' && yi9Var.a(3) == 's' && yi9Var.a(4) == 't' && yi9Var.a(5) == 'r' && yi9Var.a(6) == 'i' && yi9Var.a(7) == 'n' && yi9Var.a(8) == 'g') {
                        amsVar = xms.z;
                        break;
                    }
                } else if (yi9Var.a(1) == 'r' && yi9Var.a(2) == 'i' && yi9Var.a(3) == 'm' && yi9Var.a(4) == 's' && yi9Var.a(5) == 't' && yi9Var.a(6) == 'a' && yi9Var.a(7) == 'r' && yi9Var.a(8) == 't') {
                    amsVar = xms.t;
                    break;
                }
                break;
            case 10:
                if (yi9Var.a(0) == 's' && yi9Var.a(1) == 't' && yi9Var.a(2) == 'a' && yi9Var.a(3) == 'r' && yi9Var.a(4) == 't' && yi9Var.a(5) == 's' && yi9Var.a(6) == 'w' && yi9Var.a(7) == 'i' && yi9Var.a(8) == 't' && yi9Var.a(9) == 'h') {
                    amsVar = xms.v;
                    break;
                }
                break;
        }
        ams amsVar2 = amsVar;
        if (amsVar2 == null) {
            hifVar.b();
            String yi9Var2 = yi9Var.toString();
            jjeVar.a(yi9Var);
            throw a.k(yi9Var2);
        }
        jjeVar.a(yi9Var);
        ije ijeVar = jjeVar.i;
        inj injVar = (inj) ijeVar.b();
        while (hifVar.c()) {
            char d = hifVar.d();
            if (d != ',' && d != ' ' && d != '\n') {
                if (d != '\t') {
                    if (d == '(') {
                        injVar.a(c(jjeVar, hifVar));
                    } else {
                        if (d == ')') {
                            hifVar.e();
                            Object d2 = amsVar2.d(jjeVar, injVar);
                            ijeVar.a(injVar);
                            return d2;
                        }
                        injVar.a(c(jjeVar, hifVar));
                    }
                }
            }
            hifVar.e();
        }
        throw a.i("Incomplete function call");
    }

    public final int e(jje jjeVar, hif hifVar) {
        Object c = c(jjeVar, hifVar);
        if (!(c instanceof Boolean)) {
            throw a.a("Invalid condition " + rhb1.e(c) + " (allowed boolean only)");
        }
        if (!((Boolean) c).booleanValue()) {
            o(hifVar);
            s(hifVar);
            if (!hifVar.i("else")) {
                return 0;
            }
            s(hifVar);
            return hifVar.i("if") ? e(jjeVar, hifVar) : b(jjeVar, hifVar);
        }
        int b = b(jjeVar, hifVar);
        while (true) {
            if (!hifVar.c()) {
                break;
            }
            s(hifVar);
            if (!hifVar.i("else")) {
                break;
            }
            s(hifVar);
            if (!hifVar.i("if")) {
                o(hifVar);
                break;
            }
            p(hifVar, 0);
            o(hifVar);
        }
        return b;
    }

    public final Object f(jje jjeVar, hif hifVar, char c) {
        char d;
        char d2;
        if ('0' <= c && c < ':') {
            long j = c - MoneyInputEditView.DEFAULT_VALUE;
            while (hifVar.c()) {
                char d3 = hifVar.d();
                if ('0' > d3 || d3 >= ':') {
                    if (d3 != '.') {
                        return Long.valueOf(j);
                    }
                    hifVar.e();
                    double d4 = j;
                    double d5 = 0.0d;
                    double d6 = 0.1d;
                    while (hifVar.c() && '0' <= (d2 = hifVar.d()) && d2 < ':') {
                        d5 += (d2 - '0') * d6;
                        d6 /= 10.0d;
                        hifVar.e();
                    }
                    return Double.valueOf(d4 + d5);
                }
                j = (j * 10) + (d3 - '0');
                hifVar.e();
            }
            return Long.valueOf(j);
        }
        if (c == '-') {
            return bb1.A(-1L, f(jjeVar, hifVar, hifVar.f()));
        }
        if (c == '!') {
            Object f = f(jjeVar, hifVar, hifVar.f());
            if (f instanceof Boolean) {
                return Boolean.valueOf(!((Boolean) f).booleanValue());
            }
            throw a.a("Inversion of " + rhb1.e(f) + " is not defined");
        }
        if (c == '@') {
            seu seuVar = seu.E;
            StringBuilder sb = (StringBuilder) jjeVar.g.b();
            while (hifVar.c() && (('a' <= (d = hifVar.d()) && d < '{') || (('A' <= d && d < '[') || (('0' <= d && d < ':') || d == '_')))) {
                sb.append(d);
                hifVar.e();
            }
            String sb2 = sb.toString();
            jjeVar.g.a(sb);
            Object obj = jjeVar.d.get(sb2);
            if (obj == null) {
                obj = seuVar;
            }
            if (!obj.equals(seuVar)) {
                return obj;
            }
            throw a.a("Resource with name " + rhb1.e(sb2) + " is missing");
        }
        if (('a' <= c && c < '{') || (('A' <= c && c < '[') || c == '_')) {
            yi9 k = k(jjeVar, hifVar, c);
            int K = jl40.K(k);
            if (K != 0) {
                jjeVar.a(k);
                if (K == 9) {
                    return Boolean.TRUE;
                }
                if (K == 10) {
                    return Boolean.FALSE;
                }
                throw a.i("Unexpected keyword '" + ocb1.e(K) + '\'');
            }
            if (hifVar.c()) {
                char d7 = hifVar.d();
                if (d7 == '(') {
                    hifVar.e();
                    return d(jjeVar, hifVar, k);
                }
                if (d7 == '[') {
                    hifVar.e();
                    Object b = znb1.b(i(jjeVar, k), c(jjeVar, hifVar));
                    m(hifVar, ']');
                    return b;
                }
            }
            return i(jjeVar, k);
        }
        if (c == '\'') {
            return j(jjeVar, hifVar, '\'');
        }
        if (c == '\"') {
            return j(jjeVar, hifVar, OpenList.CHAR_QUOTE);
        }
        if (c == '[') {
            ArrayList arrayList = new ArrayList();
            while (hifVar.c()) {
                char d8 = hifVar.d();
                if (d8 == ',' || d8 == ' ' || d8 == '\n' || d8 == '\t') {
                    hifVar.e();
                } else {
                    if (d8 == ']') {
                        hifVar.e();
                        return arrayList;
                    }
                    arrayList.add(c(jjeVar, hifVar));
                }
            }
            throw a.i("Incomplete list initializer");
        }
        if (c != '{') {
            if (c != '(') {
                hifVar.b();
                throw a.m(c, hifVar.c, null);
            }
            Object c2 = c(jjeVar, hifVar);
            m(hifVar, ')');
            return c2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (hifVar.c()) {
            char d9 = hifVar.d();
            if (d9 == ',' || d9 == ' ' || d9 == '\n' || d9 == '\t') {
                hifVar.e();
            } else {
                if (d9 == '}') {
                    hifVar.e();
                    return linkedHashMap;
                }
                Object c3 = c(jjeVar, hifVar);
                n(hifVar, ':');
                Object c4 = c(jjeVar, hifVar);
                if (!(c3 instanceof String)) {
                    throw a.d(c3);
                }
                linkedHashMap.put(c3, c4);
            }
        }
        throw a.i("Incomplete dictionary initializer");
    }

    public final void g(jje jjeVar, hif hifVar, yi9 yi9Var) {
        Object c = c(jjeVar, hifVar);
        r231.a aVar = this.a.a[yi9Var.c & 7];
        inj injVar = aVar.a;
        inj injVar2 = aVar.b;
        int i = injVar.c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                injVar.a(yi9Var);
                injVar2.a(c);
                yi9Var = null;
                break;
            } else {
                if (jl40.l(injVar.a[i2], yi9Var)) {
                    injVar2.a[i2] = c;
                    break;
                }
                i2++;
            }
        }
        if (yi9Var != null) {
            jjeVar.a(yi9Var);
        }
    }

    public final int h(jje jjeVar, hif hifVar, char c) {
        if (('a' > c || c >= '{') && (('A' > c || c >= '[') && c != '_')) {
            hifVar.b();
            throw a.m(c, hifVar.c, null);
        }
        yi9 k = k(jjeVar, hifVar, c);
        int K = jl40.K(k);
        if (K == 0) {
            if (!hifVar.c()) {
                String yi9Var = k.toString();
                jjeVar.a(k);
                throw a.n(yi9Var);
            }
            char f = hifVar.f();
            if (f == '(') {
                d(jjeVar, hifVar, k);
                return 0;
            }
            if (f == '[') {
                Object c2 = c(jjeVar, hifVar);
                m(hifVar, ']');
                n(hifVar, '=');
                znb1.d(i(jjeVar, k), c2, c(jjeVar, hifVar));
                return 0;
            }
            if (f == '=') {
                g(jjeVar, hifVar, k);
                return 0;
            }
            if (f != ' ') {
                jjeVar.a(k);
                throw a.m(f, hifVar.c, null);
            }
            char s = s(hifVar);
            if (s != '=') {
                jjeVar.a(k);
                throw a.m(s, hifVar.c, '=');
            }
            hifVar.e();
            g(jjeVar, hifVar, k);
            return 0;
        }
        jjeVar.a(k);
        if (K == 1) {
            return e(jjeVar, hifVar);
        }
        if (K != 11) {
            switch (K) {
                case 3:
                    s(hifVar);
                    int i = hifVar.c;
                    long currentTimeMillis = System.currentTimeMillis();
                    while (true) {
                        Object c3 = c(jjeVar, hifVar);
                        if (!(c3 instanceof Boolean)) {
                            throw a.a("Invalid condition " + rhb1.e(c3) + " (allowed boolean only)");
                        }
                        if (!((Boolean) c3).booleanValue()) {
                            o(hifVar);
                            return 0;
                        }
                        int b = b(jjeVar, hifVar);
                        if (b == 1) {
                            break;
                        } else {
                            if (b == 2) {
                                hifVar.c = i;
                            } else if (b == 3) {
                                hifVar.c = i;
                                p(hifVar, 0);
                                o(hifVar);
                                return 0;
                            }
                            if (System.currentTimeMillis() - currentTimeMillis > 1000) {
                                throw a.j("Looped for more than " + rhb1.e(1000) + " milliseconds");
                            }
                            hifVar.c = i;
                        }
                    }
                case 4:
                    return 2;
                case 5:
                    return 3;
                case 6:
                    Object c4 = c(jjeVar, hifVar);
                    if (c4 instanceof String) {
                        throw a.g((String) c4);
                    }
                    throw a.a("Keyword \"throw\" should be used with string argument (actual " + rhb1.e(c4) + ')');
                case 7:
                    Object c5 = c(jjeVar, hifVar);
                    if (!(c5 instanceof Boolean)) {
                        throw a.a("Keyword \"assert\" should be used with boolean condition (actual " + rhb1.e(c5) + ')');
                    }
                    if (!((Boolean) c5).booleanValue()) {
                        throw a.b();
                    }
                    break;
                case 8:
                    char s2 = s(hifVar);
                    if (s2 != '\n' && s2 != 0 && s2 != ';') {
                        this.b = c(jjeVar, hifVar);
                        return 1;
                    }
                    return 1;
                default:
                    throw a.i("Unexpected keyword '" + ocb1.e(K) + '\'');
            }
        } else {
            Object c6 = c(jjeVar, hifVar);
            if (!(c6 instanceof String)) {
                throw a.a("Keyword \"breakpoint\" should be used with string argument (actual " + rhb1.e(c6) + ')');
            }
            String str = (String) c6;
            r231 r231Var = this.a;
            r231Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (r231.a aVar : r231Var.a) {
                int i2 = aVar.a.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    yi9 yi9Var2 = (yi9) aVar.a.a[i3];
                    StringBuilder sb = new StringBuilder();
                    int i4 = yi9Var2.d;
                    for (int i5 = 0; i5 < i4; i5++) {
                        sb.append(yi9Var2.a[i5]);
                    }
                    linkedHashMap.put(sb.toString(), aVar.b.a[i3]);
                }
            }
            b5x b5xVar = jjeVar.b;
            if (b5xVar != null) {
                b5xVar.a(str, jjeVar.c, linkedHashMap);
            }
        }
        return 0;
    }

    public final Object i(jje jjeVar, yi9 yi9Var) {
        Object obj;
        r231.a aVar = this.a.a[yi9Var.c & 7];
        inj injVar = aVar.a;
        int i = injVar.c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                obj = null;
                break;
            }
            if (jl40.l(injVar.a[i2], yi9Var)) {
                obj = aVar.b.a[i2];
                break;
            }
            i2++;
        }
        if (obj != null) {
            jjeVar.a(yi9Var);
            return obj;
        }
        String yi9Var2 = yi9Var.toString();
        jjeVar.a(yi9Var);
        throw a.l(yi9Var2);
    }

    public final void l(jje jjeVar) {
        for (r231.a aVar : this.a.a) {
            inj injVar = aVar.a;
            int i = injVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                jjeVar.a((yi9) injVar.a[i2]);
            }
            injVar.c = 0;
            aVar.b.c = 0;
        }
        this.b = null;
    }
}
