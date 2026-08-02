package xsna;

import com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.nph0;

/* compiled from: SearchDatabaseReducer.kt */
/* loaded from: classes5.dex */
public final class sph0<Item> extends dm50<com.vk.search.params.impl.presentation.modal.database.mvi.model.b<Item>, nph0<? extends Item>, SearchDatabaseState<Item>> {
    public final jph0<Item> d;

    public sph0(SearchDatabaseState<Item> searchDatabaseState, jph0<Item> jph0Var) {
        super(searchDatabaseState);
        this.d = jph0Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.search.params.impl.presentation.modal.database.mvi.model.a, java.lang.Object] */
    @Override // xsna.dm50
    public final km50 c(km50 km50Var, xl50 xl50Var) {
        SearchDatabaseState.a aVar;
        SearchDatabaseState searchDatabaseState = (SearchDatabaseState) km50Var;
        nph0 nph0Var = (nph0) xl50Var;
        String str = searchDatabaseState.c;
        SearchDatabaseState.a aVar2 = searchDatabaseState.e;
        if (nph0Var instanceof nph0.b) {
            nph0.b bVar = (nph0.b) nph0Var;
            if (aVar2 instanceof SearchDatabaseState.a.d) {
                SearchDatabaseState.a.d dVar = (SearchDatabaseState.a.d) aVar2;
                if (epx.f(dVar.b, bVar.b)) {
                    aVar = new SearchDatabaseState.a.d(dVar.b, dVar.c, SearchDatabaseState.ListEnd.LOADING_NEXT);
                    return SearchDatabaseState.a(searchDatabaseState, null, bVar.b, null, aVar, null, 21);
                }
            }
            if (epx.f(aVar2, SearchDatabaseState.a.b.b)) {
                aVar2 = SearchDatabaseState.a.e.b;
            }
            aVar = aVar2;
            return SearchDatabaseState.a(searchDatabaseState, null, bVar.b, null, aVar, null, 21);
        }
        if (nph0Var instanceof nph0.c) {
            if (epx.f(((nph0.c) nph0Var).b, str)) {
                return SearchDatabaseState.a(searchDatabaseState, null, null, null, SearchDatabaseState.a.b.b, null, 21);
            }
        } else {
            if (!(nph0Var instanceof nph0.d)) {
                if (nph0Var instanceof nph0.e) {
                    return SearchDatabaseState.a(searchDatabaseState, ((nph0.e) nph0Var).b, null, null, null, null, 30);
                }
                if (nph0Var instanceof nph0.a) {
                    return SearchDatabaseState.a(searchDatabaseState, null, null, null, null, ((nph0.a) nph0Var).b, 15);
                }
                if (nph0Var instanceof nph0.f) {
                    return SearchDatabaseState.a(searchDatabaseState, null, null, ((nph0.f) nph0Var).b, null, null, 27);
                }
                throw new NoWhenBranchMatchedException();
            }
            nph0.d dVar2 = (nph0.d) nph0Var;
            String str2 = dVar2.b;
            ArrayList arrayList = dVar2.c;
            if (epx.f(str2, str)) {
                if (aVar2 instanceof SearchDatabaseState.a.d) {
                    SearchDatabaseState.a.d dVar3 = (SearchDatabaseState.a.d) aVar2;
                    if (epx.f(dVar3.b, str2)) {
                        arrayList = j5g.u0(arrayList, dVar3.c);
                    }
                }
                return SearchDatabaseState.a(searchDatabaseState, null, null, null, new SearchDatabaseState.a.d(str2, arrayList, dVar2.d ? SearchDatabaseState.ListEnd.END : SearchDatabaseState.ListEnd.LOAD_NEXT_TRIGGER), null, 21);
            }
        }
        return searchDatabaseState;
    }

    @Override // xsna.dm50
    public final ao50 d() {
        return new com.vk.search.params.impl.presentation.modal.database.mvi.model.b(e(new pyz(26)), e(new p6e0(4)), e(new bk30(this, 29)), e(new k220(21)), e(new pey(27)));
    }

    @Override // xsna.dm50
    public final void h(km50 km50Var, ao50 ao50Var) {
        SearchDatabaseState searchDatabaseState = (SearchDatabaseState) km50Var;
        com.vk.search.params.impl.presentation.modal.database.mvi.model.b bVar = (com.vk.search.params.impl.presentation.modal.database.mvi.model.b) ao50Var;
        fi50 fi50Var = bVar.d;
        fi50 fi50Var2 = bVar.b;
        f(bVar.a, searchDatabaseState);
        SearchDatabaseState.a<Item> aVar = searchDatabaseState.e;
        if (epx.f(aVar, SearchDatabaseState.a.c.b)) {
            f(fi50Var2, SearchDatabaseState.a.e.b);
            return;
        }
        if (aVar instanceof SearchDatabaseState.a.e) {
            f(fi50Var2, aVar);
            return;
        }
        if (aVar instanceof SearchDatabaseState.a.b) {
            f(bVar.e, aVar);
            return;
        }
        if (aVar instanceof SearchDatabaseState.a.d) {
            if (((SearchDatabaseState.a.d) aVar).c.isEmpty()) {
                f(fi50Var, SearchDatabaseState.a.C1763a.b);
                return;
            } else {
                f(bVar.c, searchDatabaseState);
                return;
            }
        }
        SearchDatabaseState.a.C1763a c1763a = SearchDatabaseState.a.C1763a.b;
        if (!epx.f(aVar, c1763a)) {
            throw new NoWhenBranchMatchedException();
        }
        f(fi50Var, c1763a);
    }
}
