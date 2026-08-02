package defpackage;

import ru.yandex.taxi.share_favorites.view.ShareFavoritesModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class pjr0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jqr0 b;

    public /* synthetic */ pjr0(jqr0 jqr0Var, int i) {
        this.a = i;
        this.b = jqr0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 showFavorites$lambda$0$0;
        zy11 showFavorites$lambda$0$1;
        zy11 showFields$lambda$0$2;
        int i = this.a;
        jqr0 jqr0Var = this.b;
        switch (i) {
            case 0:
                showFavorites$lambda$0$0 = ShareFavoritesModalView.showFavorites$lambda$0$0(jqr0Var);
                return showFavorites$lambda$0$0;
            case 1:
                showFavorites$lambda$0$1 = ShareFavoritesModalView.showFavorites$lambda$0$1(jqr0Var);
                return showFavorites$lambda$0$1;
            default:
                showFields$lambda$0$2 = ShareFavoritesModalView.showFields$lambda$0$2(jqr0Var);
                return showFields$lambda$0$2;
        }
    }
}
