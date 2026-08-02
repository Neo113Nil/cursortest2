package defpackage;

import core.network.mapi.exception.MapiClientException;
import flex.engine.model.DocumentErrorIssueType;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class a2m implements xmi0, dez {
    public final jah a;
    public final zjr b;

    public a2m(jah jahVar) {
        this.a = jahVar;
        this.b = new zjr(new hwn(), EmptyList.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r4 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final z2m c(v0m v0mVar, a2m a2mVar, int i, xzl xzlVar) {
        DocumentErrorIssueType documentErrorIssueType;
        u1m u1mVar = v0mVar.a;
        Throwable th = v0mVar.b;
        String d = qoi0.a(th.getClass()).d();
        if (d == null) {
            d = "";
        }
        String message = th.getMessage();
        if (a2mVar.a != null) {
            if (th instanceof MapiClientException) {
                int i2 = iah.a[((MapiClientException) th).getIssueType().ordinal()];
                if (i2 == 1) {
                    documentErrorIssueType = DocumentErrorIssueType.PARSING;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    documentErrorIssueType = DocumentErrorIssueType.NETWORK;
                }
            } else {
                documentErrorIssueType = DocumentErrorIssueType.UNKNOWN;
            }
        }
        documentErrorIssueType = DocumentErrorIssueType.UNKNOWN;
        return new z2m(i, xzlVar, u1mVar, new azl(d, message, documentErrorIssueType));
    }

    public static final d3m d(x0m x0mVar, int i) {
        xzl xzlVar = x0mVar.b;
        u1m u1mVar = xzlVar.b;
        if (u1mVar == null) {
            u1mVar = x0mVar.a;
        }
        zwl zwlVar = zwl.d;
        return new d3m(i, xzlVar, u1mVar, zwlVar, zwlVar);
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.b;
    }

    @Override // defpackage.xmi0
    public final Object b(Object obj, peo peoVar) {
        e3m e3mVar = (e3m) obj;
        if (peoVar instanceof o1m) {
            n1m n1mVar = ((o1m) peoVar).a;
            if (n1mVar instanceof dyi0) {
                dyi0 dyi0Var = (dyi0) n1mVar;
                u1m u1mVar = dyi0Var.b;
                xzl xzlVar = dyi0Var.a;
                zwl zwlVar = dyi0Var.c;
                zwl zwlVar2 = dyi0Var.d;
                if (e3mVar instanceof a3m) {
                    zyl zylVar = ((a3m) e3mVar).a;
                    return new d3m(zylVar != null ? 1 + zylVar.a : 1, xzlVar, u1mVar, zwlVar, zwlVar2);
                }
                if (e3mVar instanceof c3m) {
                    return new d3m(((c3m) e3mVar).a + 1, xzlVar, u1mVar, zwlVar, zwlVar2);
                }
                if (e3mVar instanceof b3m) {
                    return new d3m(((b3m) e3mVar).a + 1, xzlVar, u1mVar, zwlVar, zwlVar2);
                }
                if (e3mVar instanceof d3m) {
                    return new d3m(((d3m) e3mVar).a + 1, xzlVar, u1mVar, zwlVar, zwlVar2);
                }
                if (e3mVar instanceof z2m) {
                    return new d3m(((z2m) e3mVar).a + 1, xzlVar, u1mVar, zwlVar, zwlVar2);
                }
                w511.b();
                return null;
            }
        } else {
            if (peoVar instanceof oxl) {
                oxl oxlVar = (oxl) peoVar;
                if ((e3mVar instanceof a3m) || (e3mVar instanceof b3m) || (e3mVar instanceof c3m)) {
                    return e3mVar;
                }
                if (e3mVar instanceof d3m) {
                    d3m d3mVar = (d3m) e3mVar;
                    int i = d3mVar.a + 1;
                    xzl xzlVar2 = d3mVar.b;
                    return new d3m(i, xzl.a(xzlVar2, ywl.a(xzlVar2.a, oxlVar.a, null, null, null, 62)), d3mVar.c, d3mVar.d, d3mVar.e);
                }
                if (e3mVar instanceof z2m) {
                    return e3mVar;
                }
                w511.b();
                return null;
            }
            if (peoVar instanceof m2m) {
                if ((e3mVar instanceof a3m) || (e3mVar instanceof b3m) || (e3mVar instanceof c3m)) {
                    return e3mVar;
                }
                if (e3mVar instanceof d3m) {
                    ywl ywlVar = ((d3m) e3mVar).b.a;
                    throw null;
                }
                if (e3mVar instanceof z2m) {
                    return e3mVar;
                }
                w511.b();
                return null;
            }
            if (peoVar instanceof d1m) {
                d1m d1mVar = (d1m) peoVar;
                ywl ywlVar2 = d1mVar.b;
                u1m u1mVar2 = d1mVar.a;
                if (e3mVar instanceof a3m) {
                    zyl zylVar2 = ((a3m) e3mVar).a;
                    return new b3m(zylVar2 != null ? 1 + zylVar2.a : 1, null, u1mVar2, ywlVar2);
                }
                if (e3mVar instanceof b3m) {
                    b3m b3mVar = (b3m) e3mVar;
                    return !jl40.l(b3mVar.c, u1mVar2) ? new b3m(b3mVar.a + 1, b3mVar.b, u1mVar2, ywlVar2) : b3mVar;
                }
                if (e3mVar instanceof c3m) {
                    c3m c3mVar = (c3m) e3mVar;
                    return !jl40.l(c3mVar.c.a, u1mVar2.a) ? new b3m(c3mVar.a + 1, c3mVar.b, u1mVar2, ywlVar2) : e3mVar;
                }
                if (e3mVar instanceof d3m) {
                    d3m d3mVar2 = (d3m) e3mVar;
                    u1m u1mVar3 = d3mVar2.c;
                    boolean l = jl40.l(u1mVar3 != null ? u1mVar3.a : null, u1mVar2.a);
                    int i2 = d3mVar2.a;
                    xzl xzlVar3 = d3mVar2.b;
                    return !l ? new b3m(i2 + 1, xzlVar3, u1mVar2, ywlVar2) : new c3m(i2 + 1, xzlVar3, u1mVar2, ywlVar2);
                }
                if (!(e3mVar instanceof z2m)) {
                    w511.b();
                    return null;
                }
                z2m z2mVar = (z2m) e3mVar;
                xzl xzlVar4 = z2mVar.b;
                int i3 = z2mVar.a;
                return (!jl40.l(z2mVar.c.a, u1mVar2.a) || xzlVar4 == null) ? new b3m(i3 + 1, xzlVar4, u1mVar2, ywlVar2) : new c3m(i3 + 1, xzlVar4, u1mVar2, ywlVar2);
            }
            if (peoVar instanceof x0m) {
                x0m x0mVar = (x0m) peoVar;
                if (e3mVar instanceof a3m) {
                    return e3mVar;
                }
                if (e3mVar instanceof b3m) {
                    return d(x0mVar, ((b3m) e3mVar).a);
                }
                if (e3mVar instanceof c3m) {
                    return d(x0mVar, ((c3m) e3mVar).a + 1);
                }
                if (e3mVar instanceof d3m) {
                    return d(x0mVar, ((d3m) e3mVar).a + 1);
                }
                if (e3mVar instanceof z2m) {
                    return d(x0mVar, ((z2m) e3mVar).a + 1);
                }
                w511.b();
                return null;
            }
            if (peoVar instanceof v0m) {
                v0m v0mVar = (v0m) peoVar;
                if (e3mVar instanceof a3m) {
                    return e3mVar;
                }
                if (e3mVar instanceof b3m) {
                    b3m b3mVar2 = (b3m) e3mVar;
                    return c(v0mVar, this, b3mVar2.a, b3mVar2.b);
                }
                if (e3mVar instanceof d3m) {
                    d3m d3mVar3 = (d3m) e3mVar;
                    return c(v0mVar, this, d3mVar3.a + 1, d3mVar3.b);
                }
                if (e3mVar instanceof c3m) {
                    c3m c3mVar2 = (c3m) e3mVar;
                    return c(v0mVar, this, c3mVar2.a + 1, c3mVar2.b);
                }
                if (e3mVar instanceof z2m) {
                    z2m z2mVar2 = (z2m) e3mVar;
                    return c(v0mVar, this, z2mVar2.a + 1, z2mVar2.b);
                }
                w511.b();
                return null;
            }
            if (peoVar instanceof g2m) {
                if (e3mVar instanceof a3m) {
                    return e3mVar;
                }
                int i4 = 2;
                if (e3mVar instanceof b3m) {
                    b3m b3mVar3 = (b3m) e3mVar;
                    return new a3m(new zyl(b3mVar3.a), b3mVar3.c, i4);
                }
                if (e3mVar instanceof c3m) {
                    c3m c3mVar3 = (c3m) e3mVar;
                    return new a3m(new zyl(c3mVar3.a), c3mVar3.c, i4);
                }
                if (e3mVar instanceof d3m) {
                    d3m d3mVar4 = (d3m) e3mVar;
                    return new a3m(new zyl(d3mVar4.a), d3mVar4.c, i4);
                }
                if (e3mVar instanceof z2m) {
                    z2m z2mVar3 = (z2m) e3mVar;
                    return new a3m(new zyl(z2mVar3.a), z2mVar3.c, i4);
                }
                w511.b();
                return null;
            }
            if (peoVar instanceof ube0) {
                ube0 ube0Var = (ube0) peoVar;
                zyl a = e3mVar.a();
                int i5 = a != null ? 1 + a.a : 1;
                u1m u1mVar4 = ube0Var.a;
                xzl xzlVar5 = ube0Var.c;
                zwl zwlVar3 = zwl.d;
                return new d3m(i5, xzlVar5, u1mVar4, zwlVar3, zwlVar3);
            }
            if (peoVar instanceof g3m) {
                g3m g3mVar = (g3m) peoVar;
                e3m a2 = g3mVar.a();
                zyl a3 = e3mVar.a();
                zyl a4 = a2.a();
                if ((a3 == null || a4 == null || jl40.q(a3.a, a4.a) <= 0) ? false : true) {
                    return e3mVar;
                }
                if (!(g3mVar.a() instanceof d3m)) {
                    return g3mVar.a();
                }
                e3m a5 = g3mVar.a();
                ((d3m) a5).f = true;
                return a5;
            }
        }
        return e3mVar;
    }

    public a2m() {
        this(null);
    }
}
