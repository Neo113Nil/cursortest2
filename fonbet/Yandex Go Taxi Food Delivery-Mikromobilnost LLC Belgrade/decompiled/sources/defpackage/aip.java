package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$DismissType;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$RideSettingsModalButtonName;

/* loaded from: classes5.dex */
public final class aip {
    public final pho a;

    public aip(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(FavoritesAnalytics$DismissType favoritesAnalytics$DismissType) {
        HashMap hashMap = new HashMap();
        hashMap.put("dismiss_type", favoritesAnalytics$DismissType.getEventValue());
        this.a.a("Favorites.CreateRegularAddressModalCard.Closed", hashMap, 1, new HashMap());
    }

    public final void b(String str, FavoritesAnalytics$RideSettingsModalButtonName favoritesAnalytics$RideSettingsModalButtonName) {
        HashMap p = x4e.p("id", str);
        p.put("button_name", favoritesAnalytics$RideSettingsModalButtonName.getEventValue());
        this.a.a("Favorites.SettingsModal.Tapped", p, 1, new HashMap());
    }
}
