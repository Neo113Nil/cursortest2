package xsna;

import com.vk.dto.common.Good;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.y6u;

/* compiled from: GoodPreviewReducer.kt */
/* loaded from: classes18.dex */
public final class b7u extends dm50<j7u, y6u, d7u> {
    @Override // xsna.dm50
    public final d7u c(d7u d7uVar, y6u y6uVar) {
        e6u e6uVar;
        e6u e6uVar2;
        e6u e6uVar3;
        ArrayList arrayList;
        e6u e6uVar4;
        e6u e6uVar5;
        d7u d7uVar2 = d7uVar;
        y6u y6uVar2 = y6uVar;
        e6u e6uVar6 = d7uVar2.b;
        if (y6uVar2 instanceof y6u.d) {
            y6u.d dVar = (y6u.d) y6uVar2;
            if (epx.f(dVar, y6u.d.b.b)) {
                return d7u.a(d7uVar2, null, true, null, 1);
            }
            if (!(dVar instanceof y6u.d.c)) {
                if (dVar instanceof y6u.d.a) {
                    return d7u.a(d7uVar2, null, false, ((y6u.d.a) dVar).b, 1);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (e6uVar6 != null) {
                e6u e6uVar7 = ((y6u.d.c) dVar).b;
                e6uVar5 = e6u.a(e6uVar6, e6uVar7.a, e6uVar7.b, e6uVar7.c, e6uVar7.d, e6uVar7.e, e6uVar7.f, e6uVar7.g, null, 128);
            } else {
                e6uVar5 = ((y6u.d.c) dVar).b;
            }
            return new d7u(e6uVar5, false, null);
        }
        if (y6uVar2 instanceof y6u.e) {
            y6u.e eVar = (y6u.e) y6uVar2;
            if (epx.f(eVar, y6u.e.b.b)) {
                return d7u.a(d7uVar2, e6uVar6 != null ? e6u.a(e6uVar6, null, null, null, 0, false, true, false, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : null, false, null, 2);
            }
            if (!(eVar instanceof y6u.e.c)) {
                if (eVar instanceof y6u.e.a) {
                    return d7u.a(d7uVar2, e6uVar6 != null ? e6u.a(e6uVar6, null, null, null, 0, false, true, false, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : null, false, null, 2);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (e6uVar6 != null) {
                y6u.e.c cVar = (y6u.e.c) eVar;
                ArrayList arrayList2 = cVar.b;
                boolean isEmpty = arrayList2.isEmpty();
                List<k7u> list = e6uVar6.c;
                e6uVar4 = e6u.a(e6uVar6, null, null, list != null ? j5g.u0(arrayList2, list) : null, cVar.c, false, false, isEmpty, null, 147);
            } else {
                e6uVar4 = null;
            }
            return d7u.a(d7uVar2, e6uVar4, false, null, 2);
        }
        if (y6uVar2 instanceof y6u.a) {
            y6u.a aVar = (y6u.a) y6uVar2;
            if (epx.f(aVar, y6u.a.b.b)) {
                return d7u.a(d7uVar2, null, true, null, 1);
            }
            if (aVar instanceof y6u.a.c) {
                return new d7u(e6uVar6 != null ? e6u.a(e6uVar6, null, null, null, 0, true, false, false, null, 239) : null, false, null);
            }
            if (aVar instanceof y6u.a.C4080a) {
                return d7u.a(d7uVar2, null, false, null, 1);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (y6uVar2 instanceof y6u.f) {
            y6u.f fVar = (y6u.f) y6uVar2;
            k7u k7uVar = fVar.b;
            Good good = new Good(k7uVar.a);
            good.J = fVar.c;
            k7u k7uVar2 = new k7u(good, k7uVar.b);
            if (!fVar.d) {
                return d7u.a(d7uVar2, e6uVar6 != null ? e6u.a(e6uVar6, k7uVar2, null, null, 0, false, false, false, null, 254) : null, false, null, 2);
            }
            if (e6uVar6 != null) {
                List<k7u> list2 = e6uVar6.c;
                if (list2 != null) {
                    List<k7u> list3 = list2;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                    for (k7u k7uVar3 : list3) {
                        if (k7uVar3.a.c.equals(good.c) && k7uVar3.a.b == good.b) {
                            k7uVar3 = k7uVar2;
                        }
                        arrayList3.add(k7uVar3);
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                e6uVar3 = e6u.a(e6uVar6, null, null, arrayList, 0, false, false, false, null, 251);
            } else {
                e6uVar3 = null;
            }
            return d7u.a(d7uVar2, e6uVar3, false, null, 6);
        }
        if (y6uVar2 instanceof y6u.b) {
            y6u.b bVar = (y6u.b) y6uVar2;
            if (bVar instanceof y6u.b.a) {
                if (e6uVar6 != null) {
                    f7u f7uVar = e6uVar6.h;
                    e6uVar2 = e6u.a(e6uVar6, null, null, null, 0, false, false, false, f7uVar != null ? new f7u(f7uVar.a, ((y6u.b.a) bVar).b) : null, 127);
                } else {
                    e6uVar2 = null;
                }
                return d7u.a(d7uVar2, e6uVar2, false, null, 6);
            }
            if (!(bVar instanceof y6u.b.C4081b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (e6uVar6 != null) {
                f7u f7uVar2 = e6uVar6.h;
                e6uVar = e6u.a(e6uVar6, null, null, null, 0, false, false, false, f7uVar2 != null ? new f7u(((y6u.b.C4081b) bVar).b, f7uVar2.b) : null, 127);
            } else {
                e6uVar = null;
            }
            return d7u.a(d7uVar2, e6uVar, false, null, 6);
        }
        if (!(y6uVar2 instanceof y6u.c)) {
            throw new NoWhenBranchMatchedException();
        }
        y6u.c cVar2 = (y6u.c) y6uVar2;
        if (cVar2 instanceof y6u.c.a) {
            return d7u.a(d7uVar2, e6uVar6 != null ? e6u.a(e6uVar6, null, null, null, 0, true, false, false, null, 239) : null, false, null, 6);
        }
        if (cVar2 instanceof y6u.c.b) {
            return d7u.a(d7uVar2, e6uVar6 != null ? e6u.a(e6uVar6, null, null, null, 0, false, false, false, null, 239) : null, false, null, 6);
        }
        if (!(cVar2 instanceof y6u.c.C4082c)) {
            throw new NoWhenBranchMatchedException();
        }
        y6u.c.C4082c c4082c = (y6u.c.C4082c) cVar2;
        if (e6uVar6 == null) {
            return d7uVar2;
        }
        k7u k7uVar4 = e6uVar6.a;
        Good good2 = new Good(k7uVar4.a);
        good2.J = c4082c.b;
        return d7u.a(d7uVar2, e6u.a(e6uVar6, new k7u(good2, k7uVar4.b), null, null, 0, false, false, false, null, 254), false, null, 6);
    }

    @Override // xsna.dm50
    public final j7u d() {
        return new j7u(e(new z6u(0)), e(new sd4(25)), e(new z13(23)));
    }

    @Override // xsna.dm50
    public final void h(d7u d7uVar, j7u j7uVar) {
        d7u d7uVar2 = d7uVar;
        j7u j7uVar2 = j7uVar;
        if (d7uVar2.c) {
            f(j7uVar2.a, d7uVar2);
        } else if (d7uVar2.d != null) {
            f(j7uVar2.b, d7uVar2);
        } else {
            f(j7uVar2.c, d7uVar2);
        }
    }
}
