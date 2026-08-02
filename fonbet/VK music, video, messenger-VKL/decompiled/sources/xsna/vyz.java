package xsna;

import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;

/* compiled from: LocationSearchViewState.kt */
/* loaded from: classes5.dex */
public final class vyz implements ao50, fm50<LocationSearchState> {
    public final fi50 a;
    public final fi50 b;

    public vyz(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyz)) {
            return false;
        }
        vyz vyzVar = (vyz) obj;
        return this.a.equals(vyzVar.a) && this.b.equals(vyzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationSearchViewState(locationSearchAction=");
        sb.append(this.a);
        sb.append(", applyButton=");
        return j8.b(sb, this.b, ')');
    }
}
