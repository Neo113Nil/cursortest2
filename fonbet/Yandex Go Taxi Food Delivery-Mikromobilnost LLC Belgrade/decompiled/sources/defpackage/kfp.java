package defpackage;

import ru.yandex.taxi.fragment.favorites.edit.FavoriteEditFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class kfp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FavoriteEditFragment b;

    public /* synthetic */ kfp(FavoriteEditFragment favoriteEditFragment, int i) {
        this.a = i;
        this.b = favoriteEditFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        FavoriteEditFragment favoriteEditFragment = this.b;
        switch (i) {
            case 0:
                FavoriteEditFragment.bindViewsInFields$lambda$6(favoriteEditFragment);
                break;
            case 1:
                FavoriteEditFragment.setListeners$lambda$0(favoriteEditFragment);
                break;
            case 2:
                favoriteEditFragment.onBack();
                break;
            case 3:
                FavoriteEditFragment.bindViewsInFields$lambda$2(favoriteEditFragment);
                break;
            case 4:
                favoriteEditFragment.showAddressSearchModal();
                break;
            case 5:
                FavoriteEditFragment.bindViewsInFields$lambda$4(favoriteEditFragment);
                break;
            default:
                FavoriteEditFragment.bindViewsInFields$lambda$5(favoriteEditFragment);
                break;
        }
    }
}
