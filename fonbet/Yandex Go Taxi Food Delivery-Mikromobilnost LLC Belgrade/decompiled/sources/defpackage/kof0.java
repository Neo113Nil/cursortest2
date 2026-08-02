package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.a;

/* loaded from: classes.dex */
public final class kof0 implements a {
    public final nfh a;
    public final dyx b;

    public kof0(nfh nfhVar, dyx dyxVar) {
        this.a = nfhVar;
        this.b = dyxVar;
    }

    @Override // ru.yandex.taxi.layers.a
    public final void a(String str, MapObjectComponentType mapObjectComponentType, LayersAnalyticEventEmmiter.Event event, sm00 sm00Var) {
        int i = jof0.a[event.ordinal()];
        nfh nfhVar = this.a;
        if (i == 1) {
            String b = b();
            if (((HashSet) nfhVar.c).add(str)) {
                kf00 kf00Var = (kf00) nfhVar.a;
                kf00Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(ClidProvider.STATE, str);
                hashMap.put(CRLReasonCodeExtension.REASON, "layers");
                kf00Var.a.a("Map.PromoObject.Available", hashMap, 1, tse0.r("mode", hashMap, b));
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3) {
                c(str, true);
                return;
            } else {
                if (i == 4) {
                    return;
                }
                w511.b();
                return;
            }
        }
        String b2 = b();
        String lowerCase = this.b.a().a.name().toLowerCase(Locale.ROOT);
        if (((HashSet) nfhVar.b).add(str)) {
            kf00 kf00Var2 = (kf00) nfhVar.a;
            kf00Var2.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(ClidProvider.STATE, str);
            hashMap2.put("open_reason", "layers");
            kf00Var2.a.a("Map.PromoObject.Shown", hashMap2, 1, x4e.q(hashMap2, "mode", b2, MetaDataField.SCREEN_FIELD, lowerCase));
        }
    }

    public final String b() {
        return this.b.a().b.a.name().toLowerCase(Locale.ROOT);
    }

    public final void c(String str, boolean z) {
        String b = b();
        String lowerCase = this.b.a().a.name().toLowerCase(Locale.ROOT);
        kf00 kf00Var = (kf00) this.a.a;
        kf00Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(ClidProvider.STATE, str);
        hashMap.put("openedPromo", Boolean.valueOf(z));
        hashMap.put("open_reason", "layers");
        kf00Var.a.a("Map.PromoObject.Tapped", hashMap, 1, x4e.q(hashMap, "mode", b, MetaDataField.SCREEN_FIELD, lowerCase));
    }
}
