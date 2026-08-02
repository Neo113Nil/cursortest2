package xsna;

import xsna.bzp0;

/* compiled from: DefaultInputApiErrorViewDelegate.kt */
/* loaded from: classes15.dex */
public final class ngl implements g1x {
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;

    /* compiled from: DefaultInputApiErrorViewDelegate.kt */
    public interface a {
        void e(bzp0.c cVar);
    }

    public ngl(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, cfz cfzVar, j630 j630Var, a aVar7, ux0 ux0Var, int i) {
        aVar = (i & 1) != 0 ? null : aVar;
        aVar2 = (i & 2) != 0 ? null : aVar2;
        aVar3 = (i & 4) != 0 ? null : aVar3;
        aVar4 = (i & 8) != 0 ? null : aVar4;
        aVar5 = (i & 16) != 0 ? null : aVar5;
        aVar6 = (i & 32) != 0 ? null : aVar6;
        cfzVar = (i & 64) != 0 ? null : cfzVar;
        j630Var = (i & 128) != 0 ? null : j630Var;
        aVar7 = (i & 256) != 0 ? null : aVar7;
        ux0Var = (i & 512) != 0 ? null : ux0Var;
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.g = cfzVar;
        this.h = j630Var;
        this.i = aVar7;
        this.j = ux0Var;
    }

    public static boolean b(a aVar, bzp0.c cVar) {
        s3q0 s3q0Var;
        if (aVar != null) {
            aVar.e(cVar);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        return s3q0Var != null;
    }

    @Override // xsna.g1x
    public final boolean a(bzp0.c cVar) {
        wz2 wz2Var = cVar.b;
        if (!(wz2Var instanceof cfv0)) {
            if (!(wz2Var instanceof fp70)) {
                return false;
            }
            String str = ((fp70) wz2Var).c;
            if (epx.f(str, "need_authcheck") || epx.f(str, "invalid_client")) {
                return b(this.f, cVar);
            }
            return false;
        }
        cfv0 cfv0Var = (cfv0) wz2Var;
        int i = cfv0Var.d;
        if (i == 15) {
            return b(this.h, cVar);
        }
        if (i == 100) {
            return b(this.a, cVar);
        }
        if (i == 104) {
            return b(this.d, cVar);
        }
        if (i != 106) {
            return i != 1000 ? i != 1004 ? i != 1110 ? i != 3618 ? b(this.i, cVar) : b(this.j, cVar) : b(this.e, cVar) : b(this.c, cVar) : b(this.b, cVar);
        }
        if (cfv0Var.e == 1164) {
            return b(this.g, cVar);
        }
        return false;
    }
}
