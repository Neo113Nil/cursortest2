package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.games.presentation.catalog.model.ListNextState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.edt;
import xsna.kbt;
import xsna.udt;

/* compiled from: GamesCatalogReducer.kt */
/* loaded from: classes17.dex */
public final class gdt extends dm50<xet, edt, jet> {

    /* compiled from: GamesCatalogReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GamesCatalogScreenTab.values().length];
            try {
                iArr[GamesCatalogScreenTab.CATALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamesCatalogScreenTab.CATEGORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gdt() {
        super(new jet(0));
    }

    public static v7t i(long j, v7t v7tVar) {
        ArrayList arrayList;
        List<udt> list = v7tVar.a;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (udt udtVar : list) {
                if (udtVar instanceof udt.e) {
                    udt.e eVar = (udt.e) udtVar;
                    List list2 = eVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list2) {
                        if (((g7t) obj).d.a.b != j) {
                            arrayList3.add(obj);
                        }
                    }
                    udtVar = !arrayList3.isEmpty() ? new udt.e(eVar.a, eVar.b, arrayList3) : null;
                }
                if (udtVar != null) {
                    arrayList2.add(udtVar);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return v7t.a(v7tVar, arrayList, false, false, null, false, 0, 254);
    }

    public static v7t j(int i, v7t v7tVar) {
        ArrayList arrayList;
        List<udt> list = v7tVar.a;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (udt udtVar : list) {
                if (udtVar instanceof udt.f) {
                    udt.f fVar = (udt.f) udtVar;
                    List<r7t> list2 = fVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list2) {
                        if (((r7t) obj).i != i) {
                            arrayList3.add(obj);
                        }
                    }
                    udtVar = !arrayList3.isEmpty() ? new udt.f(fVar.a, fVar.b, arrayList3) : null;
                }
                if (udtVar != null) {
                    arrayList2.add(udtVar);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return v7t.a(v7tVar, arrayList, false, false, null, false, 0, 254);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v7t k(v7t v7tVar, c7t c7tVar) {
        Pair pair;
        v7t v7tVar2;
        List<udt> list = v7tVar.a;
        int i = 0;
        v7t v7tVar3 = null;
        if (list != null) {
            Iterator<udt> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (it.next() instanceof udt.c) {
                    break;
                }
                i2++;
            }
            Object b0 = j5g.b0(i2, list);
            if (!(b0 instanceof udt.c)) {
                b0 = null;
            }
            udt.c cVar = (udt.c) b0;
            if (cVar != null) {
                pair = new Pair(cVar, Integer.valueOf(i2));
                if (pair != null) {
                    udt.c cVar2 = (udt.c) pair.d();
                    int intValue = ((Number) pair.g()).intValue();
                    if (list != null) {
                        List<udt> list2 = list;
                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                        for (Object obj : list2) {
                            int i3 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            udt udtVar = (udt) obj;
                            if (i == intValue) {
                                udtVar = new udt.c(cVar2.a, cVar2.b, c7tVar == null ? cVar2.c : c7tVar);
                            }
                            arrayList.add(udtVar);
                            i = i3;
                        }
                        v7tVar2 = v7tVar;
                        v7tVar3 = v7t.a(v7tVar2, arrayList, false, false, null, false, 0, 254);
                        return v7tVar3 == null ? v7tVar2 : v7tVar3;
                    }
                }
                v7tVar2 = v7tVar;
                if (v7tVar3 == null) {
                }
            }
        }
        pair = null;
        if (pair != null) {
        }
        v7tVar2 = v7tVar;
        if (v7tVar3 == null) {
        }
    }

    @Override // xsna.dm50
    public final jet c(jet jetVar, edt edtVar) {
        ArrayList arrayList;
        jet jetVar2 = jetVar;
        edt edtVar2 = edtVar;
        v7t v7tVar = jetVar2.f;
        v7t v7tVar2 = jetVar2.e;
        if (edtVar2 instanceof edt.e) {
            edt.e eVar = (edt.e) edtVar2;
            return jet.a(jetVar2, new tet(eVar.b, eVar.c, eVar.d, 8), false, null, null, null, 62);
        }
        if (edtVar2 instanceof edt.h) {
            tet tetVar = jetVar2.b;
            edt.h hVar = (edt.h) edtVar2;
            String str = hVar.b;
            if (str == null) {
                str = tetVar.a;
            }
            return jet.a(jetVar2, tet.a(tetVar, str, hVar.c, hVar.d, null, 8), false, null, null, null, 62);
        }
        ArrayList arrayList2 = null;
        if (edtVar2 instanceof edt.g) {
            edt.g gVar = (edt.g) edtVar2;
            String str2 = gVar.c;
            long j = gVar.b;
            List<udt> list = v7tVar2.a;
            if (list != null) {
                List<udt> list2 = list;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(aat.a((udt) it.next(), j, str2));
                }
            } else {
                arrayList = null;
            }
            v7t a2 = v7t.a(v7tVar2, arrayList, false, false, null, false, 0, 254);
            List<udt> list3 = v7tVar.a;
            if (list3 != null) {
                List<udt> list4 = list3;
                arrayList2 = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(aat.a((udt) it2.next(), j, str2));
                }
            }
            return jet.a(jetVar2, null, false, null, a2, v7t.a(v7tVar, arrayList2, false, false, null, false, 0, 254), 15);
        }
        if (!(edtVar2 instanceof edt.f)) {
            if (edtVar2 instanceof edt.a) {
                long j2 = ((edt.a) edtVar2).b;
                return jet.a(jetVar2, null, false, null, i(j2, v7tVar2), i(j2, v7tVar), 15);
            }
            if (edtVar2 instanceof edt.b) {
                int i = ((edt.b) edtVar2).b;
                return jet.a(jetVar2, null, false, null, j(i, v7tVar2), j(i, v7tVar), 15);
            }
            if (edtVar2.equals(edt.c.b)) {
                return jet.a(jetVar2, null, false, null, null, null, 59);
            }
            if (edtVar2 instanceof edt.d) {
                return jet.a(jetVar2, null, false, ((edt.d) edtVar2).b, null, null, 55);
            }
            throw new NoWhenBranchMatchedException();
        }
        edt.f fVar = (edt.f) edtVar2;
        int i2 = a.$EnumSwitchMapping$0[fVar.b.ordinal()];
        if (i2 == 1) {
            if (fVar instanceof edt.f.g) {
                return jet.a(jetVar2, null, false, null, v7t.a(jetVar2.e, null, true, ((edt.f.g) fVar).c, null, false, 0, 241), null, 47);
            }
            if (fVar instanceof edt.f.a) {
                return jet.a(jetVar2, null, false, null, new v7t(null, ((edt.f.a) fVar).c ? kbt.a.a : kbt.b.a, false, 0, 247), null, 47);
            }
            if (fVar instanceof edt.f.c) {
                return jet.a(jetVar2, null, false, null, v7t.a(jetVar2.e, null, false, false, ListNextState.ERROR, false, 0, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), null, 47);
            }
            if (fVar instanceof edt.f.d) {
                return jet.a(jetVar2, null, false, null, v7t.a(jetVar2.e, null, false, false, null, false, 0, 233), null, 47);
            }
            if (fVar instanceof edt.f.h) {
                return jet.a(jetVar2, null, false, null, v7t.a(jetVar2.e, null, false, false, ListNextState.LOADING, false, 0, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), null, 47);
            }
            if (fVar instanceof edt.f.e) {
                edt.f.e eVar2 = (edt.f.e) fVar;
                boolean z = eVar2.c;
                tet a3 = tet.a(jetVar2.b, null, false, false, eVar2.d, 7);
                ArrayList arrayList3 = eVar2.e;
                int i3 = eVar2.f;
                return jet.a(jetVar2, a3, z, null, new v7t(arrayList3, null, i3 < eVar2.g, i3, 62), null, 42);
            }
            if (!(fVar instanceof edt.f.i)) {
                if (fVar instanceof edt.f.C2795f) {
                    return jet.a(jetVar2, null, false, null, k(v7tVar2, ((edt.f.C2795f) fVar).c.c), null, 47);
                }
                if (fVar instanceof edt.f.b) {
                    return jet.a(jetVar2, null, false, null, k(v7tVar2, null), null, 47);
                }
                throw new NoWhenBranchMatchedException();
            }
            Collection collection = v7tVar2.a;
            if (collection == null) {
                collection = EmptyList.b;
            }
            edt.f.i iVar = (edt.f.i) fVar;
            ArrayList u0 = j5g.u0(iVar.c, collection);
            int i4 = v7tVar2.h + iVar.d;
            return jet.a(jetVar2, null, false, null, v7t.a(v7tVar2, u0, false, false, null, i4 < iVar.e, i4, 30), null, 47);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (fVar instanceof edt.f.g) {
            return jet.a(jetVar2, null, false, null, null, v7t.a(jetVar2.f, null, true, ((edt.f.g) fVar).c, null, false, 0, 241), 31);
        }
        if (fVar instanceof edt.f.a) {
            return jet.a(jetVar2, null, false, null, null, new v7t(null, ((edt.f.a) fVar).c ? kbt.a.a : kbt.b.a, false, 0, 247), 31);
        }
        if (fVar instanceof edt.f.c) {
            return jet.a(jetVar2, null, false, null, null, v7t.a(jetVar2.f, null, false, false, ListNextState.ERROR, false, 0, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), 31);
        }
        if (fVar instanceof edt.f.d) {
            return jet.a(jetVar2, null, false, null, null, v7t.a(jetVar2.f, null, false, false, null, false, 0, 233), 31);
        }
        if (fVar instanceof edt.f.h) {
            return jet.a(jetVar2, null, false, null, null, v7t.a(jetVar2.f, null, false, false, ListNextState.LOADING, false, 0, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), 31);
        }
        if (fVar instanceof edt.f.e) {
            edt.f.e eVar3 = (edt.f.e) fVar;
            boolean z2 = eVar3.c;
            ArrayList arrayList4 = eVar3.e;
            int i5 = eVar3.f;
            return jet.a(jetVar2, null, z2, null, null, new v7t(arrayList4, null, i5 < eVar3.g, i5, 62), 27);
        }
        if (!(fVar instanceof edt.f.i)) {
            if (fVar instanceof edt.f.C2795f) {
                return jet.a(jetVar2, null, false, null, null, k(v7tVar, ((edt.f.C2795f) fVar).c.c), 31);
            }
            if (fVar instanceof edt.f.b) {
                return jet.a(jetVar2, null, false, null, null, k(v7tVar, null), 31);
            }
            throw new NoWhenBranchMatchedException();
        }
        Collection collection2 = v7tVar.a;
        if (collection2 == null) {
            collection2 = EmptyList.b;
        }
        edt.f.i iVar2 = (edt.f.i) fVar;
        ArrayList u02 = j5g.u0(iVar2.c, collection2);
        int i6 = v7tVar.h + iVar2.d;
        return jet.a(jetVar2, null, false, null, null, v7t.a(v7tVar, u02, false, false, null, i6 < iVar2.e, i6, 30), 31);
    }

    @Override // xsna.dm50
    public final xet d() {
        return new xet(e(new wzf(this, 22)));
    }

    @Override // xsna.dm50
    public final void h(jet jetVar, xet xetVar) {
        f(xetVar.a, jetVar);
    }
}
