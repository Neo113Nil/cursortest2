package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.go.taxi.order.state.search.c;

/* loaded from: classes14.dex */
public final class nz70 {
    public final SearchState a;
    public final Screen b;

    static {
        c cVar = SearchState.Companion;
    }

    public nz70(SearchState searchState, Screen screen) {
        this.a = searchState;
        this.b = screen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz70)) {
            return false;
        }
        nz70 nz70Var = (nz70) obj;
        return jl40.l(this.a, nz70Var.a) && this.b == nz70Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
