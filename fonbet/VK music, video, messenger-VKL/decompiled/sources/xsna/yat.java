package xsna;

import com.vk.games.presentation.catalog.model.GamesDetailCatalogHeaderType;
import com.vk.games.presentation.catalog.model.ListNextState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ebt;
import xsna.kbt;
import xsna.xat;

/* compiled from: GamesCatalogDetailReducer.kt */
/* loaded from: classes17.dex */
public final class yat extends dm50<ibt, xat, hbt> {

    /* compiled from: GamesCatalogDetailReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GamesDetailCatalogHeaderType.values().length];
            try {
                iArr[GamesDetailCatalogHeaderType.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamesDetailCatalogHeaderType.OLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yat() {
        super(new hbt(0));
    }

    @Override // xsna.dm50
    public final hbt c(hbt hbtVar, xat xatVar) {
        ArrayList arrayList;
        int i;
        int i2;
        hbt hbtVar2 = hbtVar;
        xat xatVar2 = xatVar;
        Collection collection = hbtVar2.i;
        if (xatVar2 instanceof xat.i) {
            return hbt.a(hbtVar2, false, null, null, false, 0, null, ((xat.i) xatVar2).b, null, 191);
        }
        if (xatVar2 instanceof xat.c) {
            return hbt.a(hbtVar2, false, ((xat.c) xatVar2).b ? kbt.a.a : kbt.b.a, null, false, 0, null, null, null, 120);
        }
        if (xatVar2.equals(xat.d.b)) {
            return hbt.a(hbtVar2, false, null, ListNextState.ERROR, false, 0, null, null, null, 250);
        }
        int i3 = 0;
        if (xatVar2 instanceof xat.f) {
            ArrayList arrayList2 = new ArrayList(20);
            while (i3 < 20) {
                arrayList2.add(((xat.f) xatVar2).b);
                i3++;
            }
            return hbt.a(hbtVar2, true, null, null, false, 0, null, null, arrayList2, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        if (xatVar2.equals(xat.g.b)) {
            return hbt.a(hbtVar2, false, null, ListNextState.LOADING, false, 0, null, null, null, 249);
        }
        if (xatVar2 instanceof xat.e) {
            xat.e eVar = (xat.e) xatVar2;
            List<ebt> list = eVar.c;
            String str = hbtVar2.g;
            if (str == null) {
                str = eVar.b;
            }
            return hbt.a(hbtVar2, false, null, null, eVar.d, 1, str, null, list, 66);
        }
        if (xatVar2 instanceof xat.h) {
            if (collection == null) {
                collection = EmptyList.b;
            }
            xat.h hVar = (xat.h) xatVar2;
            return hbt.a(hbtVar2, false, null, null, hVar.c, hbtVar2.f + 1, null, null, j5g.u0(hVar.b, collection), 98);
        }
        ArrayList arrayList3 = null;
        if (!(xatVar2 instanceof xat.b)) {
            if (!(xatVar2 instanceof xat.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (collection != null) {
                arrayList3 = new ArrayList();
                for (Object obj : collection) {
                    ebt ebtVar = (ebt) obj;
                    if (!((ebtVar instanceof ebt.f) && ((ebt.f) ebtVar).a.a.a.b == ((xat.a) xatVar2).b)) {
                        arrayList3.add(obj);
                    }
                }
            }
            return hbt.a(hbtVar2, false, null, null, false, 0, null, null, arrayList3, 127);
        }
        int i4 = ((xat.b) xatVar2).b;
        if (collection != null) {
            arrayList = new ArrayList();
            for (Object obj2 : collection) {
                ebt ebtVar2 = (ebt) obj2;
                if (!(ebtVar2 instanceof ebt.h) || ((ebt.h) ebtVar2).a.i != i4) {
                    if (!(ebtVar2 instanceof ebt.i) || ((ebt.i) ebtVar2).a.i != i4) {
                        arrayList.add(obj2);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ebt) it.next()) instanceof ebt.h) {
                    i = 1;
                    break;
                }
            }
        }
        i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((ebt) it2.next()) instanceof ebt.i) {
                    i3 = 1;
                    break;
                }
            }
        }
        if (arrayList != null) {
            arrayList3 = new ArrayList();
            for (Object obj3 : arrayList) {
                ebt ebtVar3 = (ebt) obj3;
                if (ebtVar3 instanceof ebt.e) {
                    int i5 = a.$EnumSwitchMapping$0[((ebt.e) ebtVar3).a.ordinal()];
                    if (i5 == 1) {
                        i2 = i;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = i3;
                    }
                } else {
                    i2 = 1;
                }
                if (i2 != 0) {
                    arrayList3.add(obj3);
                }
            }
        }
        return hbt.a(hbtVar2, false, null, null, false, 0, null, null, arrayList3, 127);
    }

    @Override // xsna.dm50
    public final ibt d() {
        return new ibt(e(new h2s(this, 3)));
    }

    @Override // xsna.dm50
    public final void h(hbt hbtVar, ibt ibtVar) {
        f(ibtVar.a, hbtVar);
    }
}
