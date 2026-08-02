package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.yandex.taxi.fragment.favorites.list.FavoritesFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class hdp implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ FavoriteAddress c;

    public /* synthetic */ hdp(String str, FavoriteAddress favoriteAddress, int i) {
        this.a = i;
        this.b = str;
        this.c = favoriteAddress;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        FavoriteAddress favoriteAddress = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                FavoritesFragment favoritesFragment = ((jjp) obj).a.c0;
                if (favoritesFragment != null) {
                    favoritesFragment.updateAddress(str, favoriteAddress);
                    break;
                }
                break;
            default:
                ((idp) obj).a.r(new hdp(str, favoriteAddress, 0));
                break;
        }
        return zy11Var;
    }
}
