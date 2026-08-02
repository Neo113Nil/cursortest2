package xsna;

import xsna.agl0;
import xsna.kw40;

/* compiled from: MusicPlayerStopEventComposer.kt */
/* loaded from: classes3.dex */
public final class zy40 extends u96 {
    public final kw40.c g(nw40 nw40Var) {
        agl0 fVar;
        mw40 e = e(nw40Var);
        int i = nw40Var.c;
        switch (i) {
            case 7:
            case 10:
            case 20:
            case 22:
                fVar = new agl0.f(0);
                break;
            case 8:
            case 11:
            case 21:
            case 23:
                fVar = new agl0.f(1);
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 26:
            case 29:
            case 31:
            case 35:
            default:
                bn40.f(lhg.a(i, "Unknown action trigger for a stop event: "));
                fVar = agl0.g.a;
                break;
            case 12:
            case 32:
            case 34:
            case 36:
                fVar = agl0.b.a;
                break;
            case 13:
            case 24:
                fVar = new agl0.f(2);
                break;
            case 14:
            case 25:
                fVar = new agl0.f(3);
                break;
            case 27:
                fVar = agl0.d.a;
                break;
            case 28:
            case 37:
                fVar = agl0.c.a;
                break;
            case 30:
                fVar = agl0.e.a;
                break;
            case 33:
                fVar = agl0.a.a;
                break;
        }
        return new kw40.c(e, fVar);
    }
}
