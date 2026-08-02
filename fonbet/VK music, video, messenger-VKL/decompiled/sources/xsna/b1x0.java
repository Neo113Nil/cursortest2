package xsna;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.a990;
import xsna.c1x0;
import xsna.z0x0;

/* compiled from: VoipSelectVideoTabReducer.kt */
/* loaded from: classes7.dex */
public final class b1x0 extends dm50<d1x0, z0x0, c1x0> {
    public final y0x0 d;

    public b1x0(y0x0 y0x0Var) {
        super(c1x0.c.b);
        this.d = y0x0Var;
    }

    @Override // xsna.dm50
    public final c1x0 c(c1x0 c1x0Var, z0x0 z0x0Var) {
        c1x0 c1x0Var2 = c1x0Var;
        z0x0 z0x0Var2 = z0x0Var;
        boolean z = false;
        if (z0x0Var2 instanceof z0x0.a) {
            z0x0.a aVar = (z0x0.a) z0x0Var2;
            if (aVar instanceof z0x0.a.c) {
                return c1x0.c.b;
            }
            if (!(aVar instanceof z0x0.a.b)) {
                if (aVar instanceof z0x0.a.C4148a) {
                    return new c1x0.b(((z0x0.a.C4148a) aVar).b);
                }
                throw new NoWhenBranchMatchedException();
            }
            z0x0.a.b bVar = (z0x0.a.b) aVar;
            String str = bVar.b;
            ArrayList arrayList = bVar.c;
            if (str != null && arrayList.size() < bVar.d) {
                z = true;
            }
            return new c1x0.a(arrayList, new a990(str, z, a990.a.b.a, a990.b.a.a));
        }
        if (z0x0Var2 instanceof z0x0.c) {
            z0x0.c cVar = (z0x0.c) z0x0Var2;
            if (cVar instanceof z0x0.c.C4150c) {
                if (!(c1x0Var2 instanceof c1x0.a)) {
                    return c1x0.c.b;
                }
                c1x0.a aVar2 = (c1x0.a) c1x0Var2;
                return c1x0.a.a(aVar2, a990.a(aVar2.c, null, false, null, a990.b.C2531b.a, 7));
            }
            if (!(cVar instanceof z0x0.c.b)) {
                if (cVar instanceof z0x0.c.a) {
                    return new c1x0.b(((z0x0.c.a) cVar).b);
                }
                throw new NoWhenBranchMatchedException();
            }
            z0x0.c.b bVar2 = (z0x0.c.b) cVar;
            String str2 = bVar2.b;
            ArrayList arrayList2 = bVar2.c;
            if (str2 != null && arrayList2.size() < bVar2.d) {
                z = true;
            }
            return new c1x0.a(arrayList2, new a990(str2, z, a990.a.b.a, a990.b.a.a));
        }
        if (!(z0x0Var2 instanceof z0x0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        z0x0.b bVar3 = (z0x0.b) z0x0Var2;
        if (!(c1x0Var2 instanceof c1x0.a)) {
            return c1x0Var2;
        }
        if (bVar3 instanceof z0x0.b.c) {
            c1x0.a aVar3 = (c1x0.a) c1x0Var2;
            return c1x0.a.a(aVar3, a990.a(aVar3.c, null, false, a990.a.c.a, null, 11));
        }
        if (!(bVar3 instanceof z0x0.b.C4149b)) {
            if (!(bVar3 instanceof z0x0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c1x0.a aVar4 = (c1x0.a) c1x0Var2;
            return c1x0.a.a(aVar4, a990.a(aVar4.c, null, false, new a990.a.C2530a(((z0x0.b.a) bVar3).b), null, 11));
        }
        c1x0.a aVar5 = (c1x0.a) c1x0Var2;
        z0x0.b.C4149b c4149b = (z0x0.b.C4149b) bVar3;
        ArrayList u0 = j5g.u0(c4149b.c, aVar5.b);
        a990<String> a990Var = aVar5.c;
        String str3 = c4149b.b;
        return new c1x0.a(u0, a990.a(a990Var, str3, str3 != null && u0.size() < c4149b.d, a990.a.b.a, null, 8));
    }

    @Override // xsna.dm50
    public final d1x0 d() {
        return new d1x0(e(new aer0(this, 15)));
    }

    @Override // xsna.dm50
    public final void h(c1x0 c1x0Var, d1x0 d1x0Var) {
        f(d1x0Var.a, c1x0Var);
    }
}
