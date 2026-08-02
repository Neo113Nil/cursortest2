package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.a7f0;
import xsna.l310;
import xsna.o410;
import xsna.p410;
import xsna.t310;
import xsna.wk50;

/* compiled from: MarketItemReviewRepliesActionDelegate.kt */
/* loaded from: classes18.dex */
public final class r210 implements oj50<x410, l310, p410> {
    public final wj50<o410> a;
    public final wj50<t310> b;
    public final m410 c;

    public r210(f4z f4zVar, f4z f4zVar2, m410 m410Var) {
        this.a = f4zVar;
        this.b = f4zVar2;
        this.c = m410Var;
    }

    public static k4g0 b(int i, int i2, Map map) {
        List<k4g0> list;
        n210 n210Var = (n210) map.get(Integer.valueOf(i));
        Object obj = null;
        if (n210Var == null || (list = n210Var.n) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((k4g0) next).a == i2) {
                obj = next;
                break;
            }
        }
        return (k4g0) obj;
    }

    public static void e(nj50 nj50Var, boolean z, x410 x410Var) {
        if (z && !x410Var.u) {
            nj50Var.b(new p410.i(true));
        } else {
            if (z || !x410Var.u) {
                return;
            }
            nj50Var.b(new p410.i(false));
        }
    }

    public static void f(wk50.a aVar, x410 x410Var, int i, int i2, izs izsVar) {
        n210 n210Var = x410Var.k.get(Integer.valueOf(i));
        if (n210Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(n210Var.n);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k4g0 k4g0Var = (k4g0) it.next();
            if (k4g0Var.a == i2) {
                k4g0Var = (k4g0) izsVar.invoke(k4g0Var);
            }
            arrayList2.add(k4g0Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(x410Var.k);
        linkedHashMap.put(Integer.valueOf(i), n210.a(n210Var, false, false, arrayList2, 122879));
        aVar.b(new p410.j(linkedHashMap));
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        ListBuilder k;
        x410 x410Var = (x410) km50Var;
        l310 l310Var = (l310) kj50Var;
        Map<Integer, n210> map = x410Var.k;
        UserId userId = x410Var.b;
        s410 s410Var = x410Var.B;
        if (l310Var instanceof l310.q) {
            l310.q qVar = (l310.q) l310Var;
            boolean equals = qVar.equals(l310.q.b.b);
            wj50<o410> wj50Var = this.a;
            if (equals) {
                UserId userId2 = s410Var.d;
                if (userId2 == null) {
                    userId2 = UserId.d;
                }
                wj50Var.b(new o410.g(userId, userId2));
                return;
            }
            if (qVar.equals(l310.q.e.b)) {
                Integer num = s410Var.a;
                if (num != null) {
                    d(num.intValue(), s410Var.b, x410Var);
                }
            } else {
                if (qVar.equals(l310.q.f.b)) {
                    aVar.b(p410.h.a.b);
                    return;
                }
                if (!(qVar instanceof l310.q.a)) {
                    if (qVar instanceof l310.q.c) {
                        aVar.b(new p410.h.c(((l310.q.c) l310Var).b));
                        return;
                    }
                    if (qVar instanceof l310.q.d) {
                        l310.q.d dVar = (l310.q.d) l310Var;
                        k4g0 b = b(dVar.c, dVar.b, map);
                        if (b == null || (k = up2.k(b.f.toString(), b.g, b.i, b.e)) == null) {
                            return;
                        }
                        int i = dVar.b;
                        int i2 = dVar.c;
                        UserId userId3 = dVar.d;
                        Long l = dVar.e;
                        if (l != null) {
                            wj50Var.b(new o410.a(i, i2, userId3, l.longValue(), k));
                            return;
                        }
                        return;
                    }
                    boolean z = qVar instanceof l310.q.g;
                    m410 m410Var = this.c;
                    if (z) {
                        l310.q.g gVar = (l310.q.g) l310Var;
                        e(aVar, true, x410Var);
                        b2g0 b2g0Var = gVar.d;
                        e210 e210Var = b2g0Var instanceof e210 ? (e210) b2g0Var : null;
                        if (e210Var != null) {
                            a7f0.a.d(aVar, m410Var.b.d(gVar.b, (int) e210Var.a, gVar.c, x410Var.b), null, new n15(this, aVar, x410Var, 6), new p210(this, aVar, x410Var, gVar), 1);
                            return;
                        }
                        return;
                    }
                    if (qVar instanceof l310.q.h) {
                        l310.q.h hVar = (l310.q.h) l310Var;
                        String str = hVar.b;
                        List<Attachment> list = hVar.c;
                        Integer num2 = s410Var.a;
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            Integer num3 = s410Var.b;
                            e(aVar, true, x410Var);
                            UserId userId4 = s410Var.d;
                            if (userId4 == null) {
                                return;
                            }
                            UserId userId5 = x410Var.b;
                            Long l2 = s410Var.e;
                            if (l2 != null) {
                                a7f0.a.f(aVar, m410Var.b.a(intValue, userId5, l2.longValue(), userId4, str, num3, pq20.c(x410Var.A, list)), new cp9(this, aVar, x410Var, 3), new ync(this, aVar, x410Var, 4), 1);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (qVar instanceof l310.q.i) {
                        l310.q.i iVar = (l310.q.i) l310Var;
                        wj50Var.b(new o410.d(userId, iVar.c, iVar.b));
                        return;
                    }
                    if (qVar instanceof l310.q.j) {
                        l310.q.j jVar = (l310.q.j) l310Var;
                        f(aVar, x410Var, jVar.c, jVar.b, new pqz(1));
                        return;
                    }
                    if (!(qVar instanceof l310.q.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l310.q.k kVar = (l310.q.k) l310Var;
                    if (kVar instanceof l310.q.k.a) {
                        l310.q.k.a aVar2 = (l310.q.k.a) kVar;
                        k4g0 b2 = b(aVar2.c, aVar2.b, map);
                        t310.a aVar3 = new t310.a(String.valueOf(b2 != null ? b2.f : null));
                        wj50<t310> wj50Var2 = this.b;
                        wj50Var2.b(aVar3);
                        wj50Var2.b(new t310.e(tq.h(tlo0.Companion, R.string.text_copied)));
                        return;
                    }
                    if (kVar instanceof l310.q.k.b) {
                        l310.q.k.b bVar = (l310.q.k.b) kVar;
                        e(aVar, true, x410Var);
                        a7f0.a.d(aVar, m410Var.b.b(bVar.c, (int) bVar.d, bVar.b, x410Var.b), null, new o83(this, aVar, x410Var, 5), new q210(this, aVar, x410Var, bVar), 1);
                        return;
                    } else {
                        if (!(kVar instanceof l310.q.k.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l310.q.k.c cVar = (l310.q.k.c) kVar;
                        c(aVar, x410Var, cVar.c, Integer.valueOf(cVar.b), cVar.d, cVar.e);
                        return;
                    }
                }
                l310.q.a aVar4 = (l310.q.a) l310Var;
                int i3 = aVar4.c;
                Integer num4 = aVar4.b;
                UserId userId6 = aVar4.d;
                Long l3 = aVar4.e;
                if (l3 != null) {
                    c(aVar, x410Var, i3, num4, userId6, l3.longValue());
                }
            }
        }
    }

    public final void c(wk50.a aVar, x410 x410Var, int i, Integer num, UserId userId, long j) {
        UserId userId2 = x410Var.B.d;
        if (userId2 == null) {
            userId2 = x410Var.A;
        }
        if (x410Var.m) {
            userId2 = x410Var.b;
        }
        aVar.b(new p410.h.b(Integer.valueOf(i), num, userId, userId2, j));
        d(i, num, x410Var);
    }

    public final void d(int i, Integer num, x410 x410Var) {
        k4g0 k4g0Var;
        Integer valueOf;
        List<k4g0> list;
        Object obj;
        if (num == null) {
            valueOf = Integer.valueOf(i);
        } else {
            n210 n210Var = x410Var.k.get(Integer.valueOf(i));
            if (n210Var == null || (list = n210Var.n) == null) {
                k4g0Var = null;
            } else {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((k4g0) obj).a == num.intValue()) {
                            break;
                        }
                    }
                }
                k4g0Var = (k4g0) obj;
            }
            valueOf = k4g0Var != null ? Integer.valueOf(k4g0Var.k) : null;
        }
        this.b.b(new t310.c(valueOf));
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
