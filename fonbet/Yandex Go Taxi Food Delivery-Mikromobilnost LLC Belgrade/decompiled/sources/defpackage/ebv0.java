package defpackage;

import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$IdType;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$TripButtonName;

/* loaded from: classes5.dex */
public final /* synthetic */ class ebv0 implements rqs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbv0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ebv0(fbv0 fbv0Var, String str, int i) {
        this.a = i;
        this.b = fbv0Var;
        this.c = str;
    }

    @Override // defpackage.rqs0
    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
        int i = this.a;
        String str = this.c;
        fbv0 fbv0Var = this.b;
        switch (i) {
            case 0:
                fbv0Var.S.invoke(nqs0Var, new tpk0(str, FavoritesAnalytics$IdType.Order, FavoritesAnalytics$TripButtonName.Save));
                break;
            default:
                fbv0Var.S.invoke(nqs0Var, new tpk0(str, FavoritesAnalytics$IdType.Order, FavoritesAnalytics$TripButtonName.Trip));
                break;
        }
    }
}
