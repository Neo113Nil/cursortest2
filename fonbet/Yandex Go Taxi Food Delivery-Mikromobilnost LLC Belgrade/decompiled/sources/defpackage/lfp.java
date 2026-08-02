package defpackage;

import android.view.View;
import ru.yandex.taxi.fragment.favorites.edit.FavoriteEditFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class lfp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FavoriteEditFragment b;

    public /* synthetic */ lfp(FavoriteEditFragment favoriteEditFragment, int i) {
        this.a = i;
        this.b = favoriteEditFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        FavoriteEditFragment favoriteEditFragment = this.b;
        switch (i) {
            case 0:
                FavoriteEditFragment.onSaveClickListener$lambda$0(favoriteEditFragment, view);
                break;
            default:
                FavoriteEditFragment.setListeners$lambda$1(favoriteEditFragment, view);
                break;
        }
    }
}
