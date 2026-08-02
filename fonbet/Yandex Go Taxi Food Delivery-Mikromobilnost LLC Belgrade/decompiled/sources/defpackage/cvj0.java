package defpackage;

import okhttp3.Protocol;

/* loaded from: classes9.dex */
public class cvj0 {
    public d5j0 a;
    public Protocol b;
    public String d;
    public o6u e;
    public k5t0 h;
    public kvj0 i;
    public kvj0 j;
    public kvj0 k;
    public long l;
    public long m;
    public q66 n;
    public int c = -1;
    public rvj0 g = rvj0.EMPTY;
    public pa01 o = pa01.i4;
    public keu f = new keu();

    public static void b(String str, kvj0 kvj0Var) {
        if (kvj0Var != null) {
            if (kvj0Var.B != null) {
                w511.f(str.concat(".networkResponse != null"));
            } else if (kvj0Var.C != null) {
                w511.f(str.concat(".cacheResponse != null"));
            } else {
                if (kvj0Var.D == null) {
                    return;
                }
                w511.f(str.concat(".priorResponse != null"));
            }
        }
    }

    public final kvj0 a() {
        int i = this.c;
        if (i < 0) {
            yci0.i(this.c, "code < 0: ");
            return null;
        }
        d5j0 d5j0Var = this.a;
        if (d5j0Var == null) {
            ny61.r("request == null");
            return null;
        }
        Protocol protocol = this.b;
        if (protocol == null) {
            ny61.r("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new kvj0(d5j0Var, protocol, str, i, this.e, this.f.d(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        ny61.r("message == null");
        return null;
    }
}
