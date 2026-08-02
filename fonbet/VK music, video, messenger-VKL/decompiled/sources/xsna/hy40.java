package xsna;

import xsna.kw40;
import xsna.xua0;

/* compiled from: MusicPlayerPlayEventComposer.kt */
/* loaded from: classes3.dex */
public class hy40 extends u96 {
    public static boolean h(nw40 nw40Var) {
        return nw40Var.a == 0 && nw40Var.b == 0;
    }

    public kw40.b g(nw40 nw40Var) {
        xua0 cVar;
        mw40 e = e(nw40Var);
        int i = nw40Var.c;
        switch (i) {
            case -3:
            case 33:
                cVar = new xua0.c(0);
                break;
            case -2:
                cVar = new xua0.c(1);
                break;
            case -1:
                cVar = xua0.h.a;
                break;
            case 0:
            case 5:
            case 28:
            case 29:
            case 37:
                cVar = new xua0.b(false);
                break;
            case 1:
            case 3:
            case 4:
            case 15:
            case 16:
            case 26:
            case 32:
            case 34:
            case 35:
            case 36:
            default:
                bn40.f(lhg.a(i, "Unknown action trigger for a play event: "));
                cVar = xua0.j.a;
                break;
            case 2:
                cVar = xua0.a.a;
                break;
            case 6:
            case 12:
                cVar = xua0.e.a;
                break;
            case 7:
                cVar = new xua0.i(0);
                break;
            case 8:
                cVar = new xua0.i(1);
                break;
            case 9:
                cVar = new xua0.k(0);
                break;
            case 10:
                cVar = new xua0.k(1);
                break;
            case 11:
                cVar = new xua0.k(2);
                break;
            case 13:
                cVar = new xua0.i(2);
                break;
            case 14:
                cVar = new xua0.i(3);
                break;
            case 17:
            case 18:
            case 19:
                long j = nw40Var.a;
                long j2 = nw40Var.e;
                cVar = new xua0.g(0, ((j2 != Long.MAX_VALUE ? j2 < j : j < nw40Var.b) ? 0 : 1) ^ 1);
                break;
            case 20:
                if (!h(nw40Var)) {
                    cVar = new xua0.g(1, 0);
                    break;
                } else {
                    cVar = new xua0.i(0);
                    break;
                }
            case 21:
                if (!h(nw40Var)) {
                    cVar = new xua0.g(1, 1);
                    break;
                } else {
                    cVar = new xua0.i(1);
                    break;
                }
            case 22:
                if (!h(nw40Var)) {
                    cVar = new xua0.g(1, 0);
                    break;
                } else {
                    cVar = new xua0.k(1);
                    break;
                }
            case 23:
                if (!h(nw40Var)) {
                    cVar = new xua0.g(1, 1);
                    break;
                } else {
                    cVar = new xua0.k(2);
                    break;
                }
            case 24:
                if (!h(nw40Var)) {
                    cVar = new xua0.g(1, 0);
                    break;
                } else {
                    cVar = new xua0.i(2);
                    break;
                }
            case 25:
                if (!h(nw40Var)) {
                    cVar = new xua0.g(1, 1);
                    break;
                } else {
                    cVar = new xua0.i(3);
                    break;
                }
            case 27:
                cVar = new xua0.b(true);
                break;
            case 30:
                cVar = xua0.f.a;
                break;
            case 31:
                cVar = new xua0.g(0, 1);
                break;
        }
        return new kw40.b(e, cVar);
    }
}
