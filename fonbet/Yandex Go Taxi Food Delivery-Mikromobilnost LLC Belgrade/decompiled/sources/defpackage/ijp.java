package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.fragment.favorites.list.FavoritesFragment;

/* loaded from: classes5.dex */
public final class ijp implements vd0 {
    public final /* synthetic */ ljp a;
    public final /* synthetic */ g28 b;

    public ijp(ljp ljpVar, g28 g28Var) {
        this.a = ljpVar;
        this.b = g28Var;
    }

    @Override // defpackage.vd0
    public final void T0(Address address) {
        if (address.getIsFavorite()) {
            ljp ljpVar = this.a;
            FavoritesFragment favoritesFragment = ljpVar.c0;
            g28 g28Var = this.b;
            if (favoritesFragment != null) {
                favoritesFragment.addNewFavorite(g28Var.e);
            }
            FavoritesFragment favoritesFragment2 = ljpVar.c0;
            if (favoritesFragment2 != null) {
                favoritesFragment2.removeCandidate(g28Var);
            }
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        FavoritesFragment favoritesFragment = this.a.c0;
        if (favoritesFragment != null) {
            favoritesFragment.markAsViewed(this.b);
        }
    }
}
