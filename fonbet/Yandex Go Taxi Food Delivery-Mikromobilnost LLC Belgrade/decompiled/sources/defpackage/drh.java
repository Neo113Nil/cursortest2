package defpackage;

import ru.yandex.taxi.favorites.delete.DeleteFavoriteModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class drh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeleteFavoriteModalView b;

    public /* synthetic */ drh(DeleteFavoriteModalView deleteFavoriteModalView, int i) {
        this.a = i;
        this.b = deleteFavoriteModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DeleteFavoriteModalView deleteFavoriteModalView = this.b;
        switch (i) {
            case 0:
                deleteFavoriteModalView.dismiss();
                break;
            case 1:
                DeleteFavoriteModalView.lambda$0$1(deleteFavoriteModalView);
                break;
            case 2:
                deleteFavoriteModalView.dismiss();
                break;
            default:
                DeleteFavoriteModalView.stopLoading$lambda$0$0(deleteFavoriteModalView);
                break;
        }
    }
}
