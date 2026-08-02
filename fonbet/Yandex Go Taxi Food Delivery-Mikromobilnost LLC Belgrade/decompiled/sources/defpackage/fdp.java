package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.yandex.taxi.fragment.favorites.list.FavoritesFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class fdp implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FavoriteAddress b;

    public /* synthetic */ fdp(int i, FavoriteAddress favoriteAddress) {
        this.a = i;
        this.b = favoriteAddress;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        FavoriteAddress favoriteAddress = this.b;
        switch (i) {
            case 0:
                FavoritesFragment favoritesFragment = ((jjp) obj).a.c0;
                if (favoritesFragment != null) {
                    favoritesFragment.addNewFavorite(favoriteAddress);
                }
                return zy11Var;
            case 1:
                FavoritesFragment favoritesFragment2 = ((jjp) obj).a.c0;
                if (favoritesFragment2 != null) {
                    favoritesFragment2.addNewFavorite(favoriteAddress);
                }
                return zy11Var;
            case 2:
                FavoritesFragment favoritesFragment3 = ((jjp) obj).a.c0;
                if (favoritesFragment3 != null) {
                    favoritesFragment3.removeAddress(favoriteAddress);
                }
                return zy11Var;
            case 3:
                ((ycp) obj).F0(favoriteAddress);
                return zy11Var;
            case 4:
                ((idp) obj).a.r(new fdp(1, favoriteAddress));
                return zy11Var;
            case 5:
                ((idp) obj).a.r(new fdp(2, favoriteAddress));
                return zy11Var;
            default:
                return Boolean.valueOf(jl40.l(favoriteAddress.getId(), ((FavoriteAddress) obj).getId()));
        }
    }
}
