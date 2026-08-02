package defpackage;

import com.yandex.go.superapp_favorites.analytics.SuperappFavoritesAnalytics$FavoritesTapActionType;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final /* synthetic */ class caw0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ daw0 b;

    public /* synthetic */ caw0(daw0 daw0Var, int i) {
        this.a = i;
        this.b = daw0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        daw0 daw0Var = this.b;
        switch (i) {
            case 0:
                return new v4c(8, new caw0(daw0Var, i2));
            default:
                x770 x770Var = daw0Var.a;
                SuperappFavoritesAnalytics$FavoritesTapActionType superappFavoritesAnalytics$FavoritesTapActionType = SuperappFavoritesAnalytics$FavoritesTapActionType.Back;
                x770Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("type", superappFavoritesAnalytics$FavoritesTapActionType.getEventValue());
                x770Var.a.a("SuperappFavorites.Action.Tapped", hashMap, 1, new HashMap());
                return zy11.a;
        }
    }
}
