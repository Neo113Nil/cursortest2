package xsna;

import com.vk.clips.design.view.sidecontrols.side.favorites.FavoritesLoadingState;

/* compiled from: FavoritesState.kt */
/* loaded from: classes16.dex */
public final class itq {
    public final dtq a;
    public final etq b;
    public final FavoritesLoadingState c;

    public itq() {
        this(null, 7);
    }

    public static itq a(itq itqVar, dtq dtqVar, etq etqVar, FavoritesLoadingState favoritesLoadingState, int i) {
        if ((i & 1) != 0) {
            dtqVar = itqVar.a;
        }
        if ((i & 2) != 0) {
            etqVar = itqVar.b;
        }
        if ((i & 4) != 0) {
            favoritesLoadingState = itqVar.c;
        }
        itqVar.getClass();
        return new itq(dtqVar, etqVar, favoritesLoadingState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itq)) {
            return false;
        }
        itq itqVar = (itq) obj;
        return epx.f(this.a, itqVar.a) && epx.f(this.b, itqVar.b) && this.c == itqVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FavoritesState(config=" + this.a + ", content=" + this.b + ", loading=" + this.c + ')';
    }

    public itq(dtq dtqVar, etq etqVar, FavoritesLoadingState favoritesLoadingState) {
        this.a = dtqVar;
        this.b = etqVar;
        this.c = favoritesLoadingState;
    }

    public /* synthetic */ itq(dtq dtqVar, int i) {
        this((i & 1) != 0 ? new dtq(null, 7) : dtqVar, new etq(0), FavoritesLoadingState.NONE);
    }
}
