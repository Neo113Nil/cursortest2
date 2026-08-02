package xsna;

import com.vk.catalog2.common.ui.holders.search.SearchState;
import xsna.bcw0;

/* compiled from: SearchWithSuggesterRootDelegate.kt */
/* loaded from: classes16.dex */
public final class q0i0 extends bcw0 {
    public final /* synthetic */ o0i0<Object> a;

    public q0i0(o0i0<Object> o0i0Var) {
        this.a = o0i0Var;
    }

    @Override // xsna.bcw0
    public final void a(bcw0.a aVar) {
        SearchState searchState = SearchState.Suggestion;
        o0i0<Object> o0i0Var = this.a;
        o0i0Var.e(searchState);
        o0i0Var.m(aVar);
    }
}
