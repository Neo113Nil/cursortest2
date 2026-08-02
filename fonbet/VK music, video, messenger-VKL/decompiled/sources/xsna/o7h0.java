package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.log.L;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a990;
import xsna.j6h0;
import xsna.k7h0;
import xsna.l7h0;
import xsna.m7h0;
import xsna.r7h0;

/* compiled from: ScheduledCallsReducer.kt */
/* loaded from: classes7.dex */
public final class o7h0 extends dm50<v7h0, b59, r7h0> {
    public final h7h0 d;
    public final xd40 e;

    public o7h0(FragmentActivity fragmentActivity) {
        super(r7h0.c.b);
        hpt0 hpt0Var = new hpt0();
        k6h0 k6h0Var = new k6h0();
        d6h0 d6h0Var = new d6h0(fragmentActivity);
        this.d = new h7h0(new s6h0(k6h0Var, hpt0Var, d6h0Var), new z5h0(fragmentActivity), fragmentActivity);
        this.e = new xd40(this, 16);
    }

    @Override // xsna.dm50
    public final r7h0 c(r7h0 r7h0Var, b59 b59Var) {
        r7h0 r7h0Var2 = r7h0Var;
        b59 b59Var2 = b59Var;
        if (b59Var2 instanceof k7h0) {
            k7h0 k7h0Var = (k7h0) b59Var2;
            if (!(k7h0Var instanceof k7h0.b)) {
                if (k7h0Var instanceof k7h0.c) {
                    return r7h0.c.b;
                }
                if (k7h0Var instanceof k7h0.a) {
                    return new r7h0.b(((k7h0.a) k7h0Var).b);
                }
                throw new NoWhenBranchMatchedException();
            }
            k7h0.b bVar = (k7h0.b) k7h0Var;
            ArrayList arrayList = bVar.c;
            if (arrayList.isEmpty()) {
                return r7h0.d.a.b;
            }
            return new r7h0.a(bVar.b, bVar.f, new w6h0(arrayList), new a990(bVar.d, bVar.e, a990.a.b.a, a990.b.a.a));
        }
        if (b59Var2 instanceof m7h0) {
            m7h0 m7h0Var = (m7h0) b59Var2;
            if (r7h0Var2 instanceof r7h0.a) {
                if (m7h0Var instanceof m7h0.c) {
                    r7h0.a aVar = (r7h0.a) r7h0Var2;
                    return r7h0.a.a(aVar, null, null, a990.a(aVar.e, null, false, null, a990.b.C2531b.a, 7), 7);
                }
                if (m7h0Var instanceof m7h0.a) {
                    r7h0.a aVar2 = (r7h0.a) r7h0Var2;
                    return r7h0.a.a(aVar2, null, null, a990.a(aVar2.e, null, false, null, a990.b.a.a, 7), 7);
                }
                if (!(m7h0Var instanceof m7h0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                r7h0.a aVar3 = (r7h0.a) r7h0Var2;
                w6h0 w6h0Var = aVar3.d;
                m7h0.b bVar2 = (m7h0.b) m7h0Var;
                ArrayList arrayList2 = bVar2.b;
                w6h0Var.getClass();
                return r7h0.a.a(aVar3, null, new w6h0(arrayList2), new a990(bVar2.c, bVar2.d, a990.a.b.a, a990.b.a.a), 3);
            }
        } else if (b59Var2 instanceof l7h0) {
            l7h0 l7h0Var = (l7h0) b59Var2;
            if (r7h0Var2 instanceof r7h0.a) {
                if (l7h0Var instanceof l7h0.c) {
                    r7h0.a aVar4 = (r7h0.a) r7h0Var2;
                    return r7h0.a.a(aVar4, null, null, a990.a(aVar4.e, null, false, a990.a.c.a, null, 11), 7);
                }
                if (!(l7h0Var instanceof l7h0.b)) {
                    if (!(l7h0Var instanceof l7h0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r7h0.a aVar5 = (r7h0.a) r7h0Var2;
                    return r7h0.a.a(aVar5, null, null, a990.a(aVar5.e, null, false, new a990.a.C2530a(((l7h0.a) l7h0Var).b), null, 11), 7);
                }
                r7h0.a aVar6 = (r7h0.a) r7h0Var2;
                w6h0 w6h0Var2 = aVar6.d;
                l7h0.b bVar3 = (l7h0.b) l7h0Var;
                ArrayList arrayList3 = bVar3.b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(w6h0Var2.a);
                linkedHashSet.addAll(arrayList3);
                return r7h0.a.a(aVar6, null, new w6h0(j5g.O0(linkedHashSet)), a990.a(aVar6.e, bVar3.c, bVar3.d, a990.a.b.a, null, 8), 3);
            }
        } else if (b59Var2 instanceof j7h0) {
            j7h0 j7h0Var = (j7h0) b59Var2;
            if (r7h0Var2 instanceof r7h0.a) {
                boolean z = j7h0Var.c;
                CallsUserId callsUserId = j7h0Var.b;
                if (z || !epx.f(((r7h0.a) r7h0Var2).b, callsUserId)) {
                    r7h0.a aVar7 = (r7h0.a) r7h0Var2;
                    w6h0 w6h0Var3 = aVar7.d;
                    EmptyList emptyList = EmptyList.b;
                    w6h0Var3.getClass();
                    return r7h0.a.a(aVar7, callsUserId, new w6h0(emptyList), a990.a(aVar7.e, null, false, a990.a.c.a, null, 11), 2);
                }
            }
        } else {
            if (!(b59Var2 instanceof j6h0.a)) {
                L.G("Unknown patch " + b59Var2);
                return r7h0Var2;
            }
            j6h0.a aVar8 = (j6h0.a) b59Var2;
            if (r7h0Var2 instanceof r7h0.a) {
                r7h0.a aVar9 = (r7h0.a) r7h0Var2;
                List<x5h0> list = aVar9.d.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : list) {
                    if (!((x5h0) obj).a.equals(aVar8.b.a)) {
                        arrayList4.add(obj);
                    }
                }
                return r7h0.a.a(aVar9, null, new w6h0(arrayList4), null, 11);
            }
        }
        return r7h0Var2;
    }

    @Override // xsna.dm50
    public final v7h0 d() {
        fi50 e = e(new tcu(26));
        fi50 e2 = e(new nt10(this, 19));
        return new v7h0(e, e(new u4u(26)), e(new byo(22)), e2);
    }

    @Override // xsna.dm50
    public final void h(r7h0 r7h0Var, v7h0 v7h0Var) {
        r7h0 r7h0Var2 = r7h0Var;
        v7h0 v7h0Var2 = v7h0Var;
        if (r7h0Var2 instanceof r7h0.c) {
            f(v7h0Var2.b, r7h0Var2);
            return;
        }
        if (r7h0Var2 instanceof r7h0.b) {
            f(v7h0Var2.a, r7h0Var2);
        } else if (r7h0Var2 instanceof r7h0.d) {
            f(v7h0Var2.c, r7h0Var2);
        } else {
            if (!(r7h0Var2 instanceof r7h0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(v7h0Var2.d, r7h0Var2);
        }
    }
}
