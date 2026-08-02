package defpackage;

import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$RideSettingsModalCloseReason;
import ru.yandex.taxi.favorites.rides.settings_modal.domain.a;

/* loaded from: classes5.dex */
public final class aar0 extends ad5 {
    public final aip A;
    public final car0 B;
    public FavoritesAnalytics$RideSettingsModalCloseReason C;
    public final a x;
    public final tt2 y;
    public final pwy0 z;

    public aar0(a aVar, tt2 tt2Var, pwy0 pwy0Var, aip aipVar, car0 car0Var) {
        super(x9r0.class);
        this.x = aVar;
        this.y = tt2Var;
        this.z = pwy0Var;
        this.A = aipVar;
        this.B = car0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        FavoritesAnalytics$RideSettingsModalCloseReason favoritesAnalytics$RideSettingsModalCloseReason = this.C;
        if (favoritesAnalytics$RideSettingsModalCloseReason != null) {
            String str = this.B.a;
            aip aipVar = this.A;
            aipVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("id", str);
            hashMap.put(CRLReasonCodeExtension.REASON, favoritesAnalytics$RideSettingsModalCloseReason.getEventValue());
            aipVar.a.a("Favorites.SettingsModal.Closed", hashMap, 1, new HashMap());
        }
        super.Cg();
    }
}
