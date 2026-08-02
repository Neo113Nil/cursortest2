package xsna;

import java.util.Map;

/* compiled from: BannerServicesOnboardingRepository.kt */
/* loaded from: classes5.dex */
public final class l36 implements com.google.android.gms.internal.measurement.zzo {
    public final Object a;
    public final Object b;

    public /* synthetic */ l36(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public String zza(String str) {
        Map map = (Map) ((fb01) this.b).g.get((String) this.a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }

    public l36(fb01 fb01Var, String str) {
        this.b = fb01Var;
        this.a = str;
    }
}
