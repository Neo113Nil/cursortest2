package defpackage;

import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.panorama.PanoramaAnalytics$PanoramaPinType;
import ru.yandex.taxi.panorama.PanoramaAnalytics$UserInteractAction;

/* loaded from: classes6.dex */
public final class a8y0 {
    public final u8w a;

    public a8y0(u8w u8wVar) {
        this.a = u8wVar;
    }

    public static PanoramaAnalytics$PanoramaPinType b(String str) {
        return jl40.l(str, "a") ? PanoramaAnalytics$PanoramaPinType.A : PanoramaAnalytics$PanoramaPinType.B;
    }

    public final void a(String str, String str2, String str3, Double d) {
        PanoramaAnalytics$PanoramaPinType b = b(str3);
        Integer valueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
        u8w u8wVar = this.a;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, str2);
        hashMap.put("pin_type", b.getEventValue());
        if (valueOf != null) {
            hashMap.put("distance_m", valueOf);
        }
        if (str != null) {
            hashMap.put("panorama_id", str);
        }
        u8wVar.a.a("Panorama.Closed", hashMap, 1, new HashMap());
    }

    public final void c(String str, String str2, String str3, Double d) {
        PanoramaAnalytics$PanoramaPinType b = b(str3);
        Integer valueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
        u8w u8wVar = this.a;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, str2);
        hashMap.put("pin_type", b.getEventValue());
        if (valueOf != null) {
            hashMap.put("distance_m", valueOf);
        }
        if (str != null) {
            hashMap.put("panorama_id", str);
        }
        u8wVar.a.a("Panorama.Shown", hashMap, 1, new HashMap());
    }

    public final void d(String str, String str2, String str3, Double d) {
        PanoramaAnalytics$PanoramaPinType b = b(str3);
        Integer valueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
        u8w u8wVar = this.a;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, str2);
        hashMap.put("pin_type", b.getEventValue());
        if (valueOf != null) {
            hashMap.put("distance_m", valueOf);
        }
        if (str != null) {
            hashMap.put("panorama_id", str);
        }
        u8wVar.a.a("Panorama.Tapped", hashMap, 1, new HashMap());
    }

    public final void e(String str, String str2, String str3, Double d, PanoramaAnalytics$UserInteractAction panoramaAnalytics$UserInteractAction) {
        PanoramaAnalytics$PanoramaPinType b = b(str3);
        Integer valueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
        u8w u8wVar = this.a;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, str2);
        hashMap.put("pin_type", b.getEventValue());
        if (valueOf != null) {
            hashMap.put("distance_m", valueOf);
        }
        if (str != null) {
            hashMap.put("panorama_id", str);
        }
        if (panoramaAnalytics$UserInteractAction != null) {
            hashMap.put("action", panoramaAnalytics$UserInteractAction.getEventValue());
        }
        u8wVar.a.a("Panorama.UserInteract", hashMap, 2, new HashMap());
    }
}
