package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.d4g0;
import xsna.mxh;
import xsna.rxh;
import xsna.t2g0;

/* compiled from: RepliesViewEventsMapper.kt */
/* loaded from: classes18.dex */
public final class a3g0 {
    public static final t2g0 a(zzh zzhVar) {
        if (zzhVar instanceof rxh) {
            rxh rxhVar = (rxh) zzhVar;
            if (rxhVar instanceof rxh.a) {
                return x2g0.a;
            }
            if (rxhVar instanceof rxh.i) {
                qxh qxhVar = ((rxh.i) rxhVar).a;
                return new s2g0();
            }
            if (rxhVar instanceof rxh.j) {
                return new t2g0.d(((rxh.j) rxhVar).a);
            }
            if (rxhVar instanceof rxh.d) {
                return new y2g0(((rxh.d) rxhVar).a);
            }
            if (rxhVar instanceof rxh.h) {
                rxh.h hVar = (rxh.h) rxhVar;
                return new t2g0.c(null, Integer.valueOf(hVar.a), hVar.b, null);
            }
        } else if (zzhVar instanceof mxh) {
            mxh mxhVar = (mxh) zzhVar;
            if (mxhVar instanceof mxh.a) {
                return z2g0.a;
            }
            if (mxhVar instanceof mxh.b) {
                return new t2g0.d(null);
            }
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public static final t2g0 b(d4g0 d4g0Var) {
        if (d4g0Var instanceof d4g0.d) {
            d4g0.d dVar = (d4g0.d) d4g0Var;
            return new w2g0(dVar.a, dVar.b);
        }
        if (d4g0Var instanceof d4g0.b) {
            return new u2g0(((d4g0.b) d4g0Var).a);
        }
        if (d4g0Var instanceof d4g0.a) {
            d4g0.a aVar = (d4g0.a) d4g0Var;
            return new t2g0.c(Integer.valueOf(aVar.a), null, aVar.c, aVar.d);
        }
        if (d4g0Var instanceof d4g0.e) {
            return new t2g0.d(((d4g0.e) d4g0Var).a);
        }
        if (d4g0Var instanceof d4g0.c) {
            return new v2g0(((d4g0.c) d4g0Var).b);
        }
        return null;
    }
}
