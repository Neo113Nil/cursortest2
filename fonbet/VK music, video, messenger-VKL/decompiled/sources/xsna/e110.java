package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.d110;

/* compiled from: MarketItemCommentsReducer.kt */
/* loaded from: classes17.dex */
public final class e110 extends dm50<l110, d110, k110> {
    public final m110 d;

    public e110(m110 m110Var) {
        super(new k110(0));
        this.d = m110Var;
    }

    @Override // xsna.dm50
    public final k110 c(k110 k110Var, d110 d110Var) {
        k110 k110Var2 = k110Var;
        d110 d110Var2 = d110Var;
        if (d110Var2 instanceof d110.a) {
            if (d110Var2 instanceof d110.a.c) {
                return k110.a(k110Var2, null, 0L, null, false, 0, true, false, null, null, false, 0, null, 14207);
            }
            if (d110Var2 instanceof d110.a.b) {
                return k110.a(k110Var2, null, 0L, null, false, 0, false, true, null, null, false, 0, null, 13951);
            }
            if (!(d110Var2 instanceof d110.a.d)) {
                return d110Var2 instanceof d110.a.C2695a ? k110.a(k110Var2, null, 0L, null, false, 0, false, false, ((d110.a.C2695a) d110Var2).b, null, false, 0, null, 13439) : k110Var2;
            }
            d110.a.d dVar = (d110.a.d) d110Var2;
            UserId userId = dVar.b;
            long j = dVar.c;
            int i = dVar.f;
            boolean z = dVar.e;
            ArrayList arrayList = dVar.d;
            return k110.a(k110Var2, userId, j, arrayList, z, i, false, false, null, Integer.valueOf(arrayList.size()), false, dVar.g, null, 8288);
        }
        if (!(d110Var2 instanceof d110.b)) {
            if (d110Var2 instanceof d110.c) {
                return k110.a(k110Var2, null, 0L, ((d110.c) d110Var2).b, false, 0, false, false, null, null, false, 0, null, 16379);
            }
            if (d110Var2 instanceof d110.d) {
                return k110.a(k110Var2, null, 0L, null, false, 0, false, false, null, null, false, 0, ((d110.d) d110Var2).b, 8191);
            }
            L.G("Unknown patch " + d110Var2);
            return k110Var2;
        }
        d110.b bVar = (d110.b) d110Var2;
        if (bVar instanceof d110.b.C2696b) {
            return k110.a(k110Var2, null, 0L, null, false, 0, false, false, null, null, true, 0, null, 13951);
        }
        if (!(bVar instanceof d110.b.c)) {
            if (bVar instanceof d110.b.a) {
                return k110.a(k110Var2, null, 0L, null, false, 0, false, false, ((d110.b.a) bVar).b, null, false, 0, null, 13439);
            }
            throw new NoWhenBranchMatchedException();
        }
        d110.b.c cVar = (d110.b.c) bVar;
        ArrayList arrayList2 = cVar.d;
        return k110.a(k110Var2, null, 0L, j5g.u0(arrayList2, k110Var2.d), cVar.c, cVar.b, false, false, null, Integer.valueOf(arrayList2.size()), false, cVar.e, null, 8291);
    }

    @Override // xsna.dm50
    public final l110 d() {
        return new l110(e(new rmg(this, 21)), e(new h2w(3)), e(new nj(27)), e(new per(10)));
    }

    @Override // xsna.dm50
    public final void h(k110 k110Var, l110 l110Var) {
        k110 k110Var2 = k110Var;
        l110 l110Var2 = l110Var;
        if (k110Var2.h) {
            f(l110Var2.b, k110Var2);
            return;
        }
        if (k110Var2.j != null && k110Var2.m == 0) {
            f(l110Var2.c, k110Var2);
        } else if (k110Var2.d.isEmpty()) {
            f(l110Var2.d, k110Var2);
        } else {
            f(l110Var2.a, k110Var2);
        }
    }
}
