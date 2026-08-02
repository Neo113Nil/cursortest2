package xsna;

import com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.a;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SearchDatabaseReducer.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class rph0 extends FunctionReferenceImpl implements a0t<List<Object>, SearchDatabaseState.ListEnd, String, com.vk.search.params.impl.presentation.modal.database.mvi.model.a<Object>, List<? extends cph0>, List<? extends hfz>> {
    @Override // xsna.a0t
    public final List<? extends hfz> invoke(List<Object> list, SearchDatabaseState.ListEnd listEnd, String str, com.vk.search.params.impl.presentation.modal.database.mvi.model.a<Object> aVar, List<? extends cph0> list2) {
        boolean z;
        List<Object> list3 = list;
        SearchDatabaseState.ListEnd listEnd2 = listEnd;
        com.vk.search.params.impl.presentation.modal.database.mvi.model.a<Object> aVar2 = aVar;
        List<? extends cph0> list4 = list2;
        jph0<Item> jph0Var = ((sph0) this.receiver).d;
        ListBuilder e = e43.e();
        if (str.length() == 0) {
            int i = 0;
            for (Object obj : list4) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                cph0 cph0Var = (cph0) obj;
                if (aVar2 instanceof a.C1764a) {
                    ((a.C1764a) aVar2).a.getClass();
                    cph0Var.getClass();
                    z = true;
                } else {
                    z = false;
                }
                hfz h = jph0Var.h(z, cph0Var, i);
                if (h != null) {
                    e.add(h);
                }
                i = i2;
            }
            hfz o = jph0Var.o(epx.f(aVar2, a.c.a));
            if (o != null) {
                e.add(o);
            }
        }
        int i3 = 0;
        for (Object obj2 : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            e.add(jph0Var.n(i3, obj2, (aVar2 instanceof a.b) && ((a.b) aVar2).a.accept(obj2)));
            i3 = i4;
        }
        if (listEnd2 == SearchDatabaseState.ListEnd.LOAD_NEXT_TRIGGER || listEnd2 == SearchDatabaseState.ListEnd.LOADING_NEXT) {
            e.add(u170.b);
        }
        return e.g();
    }
}
