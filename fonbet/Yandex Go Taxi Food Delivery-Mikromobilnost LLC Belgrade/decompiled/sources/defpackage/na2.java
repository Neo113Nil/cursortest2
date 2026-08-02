package defpackage;

import java.util.List;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidFusedLocationProviderType$MobileServicesClient;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationUpdatesRequest$Quality;

/* loaded from: classes9.dex */
public final class na2 {
    public static final List i = scc.g(AndroidFusedLocationProviderType$MobileServicesClient.Google, AndroidFusedLocationProviderType$MobileServicesClient.Huawei, p92.a);
    public static final long j;
    public static final long k;
    public final e3n a;
    public final e3n b;
    public final double c;
    public final AndroidLocationUpdatesRequest$Quality d;
    public final List e;
    public final ma2 f;
    public final la2 g;
    public final boolean h;

    static {
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        j = kp50.U(1, durationUnit);
        k = kp50.U(1, durationUnit);
    }

    public na2(e3n e3nVar, e3n e3nVar2, double d, AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality, List list, ma2 ma2Var, la2 la2Var, boolean z) {
        this.a = e3nVar;
        this.b = e3nVar2;
        this.c = d;
        this.d = androidLocationUpdatesRequest$Quality;
        this.e = list;
        this.f = ma2Var;
        this.g = la2Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof na2) {
            na2 na2Var = (na2) obj;
            if (jl40.l(this.a, na2Var.a) && jl40.l(this.b, na2Var.b) && Double.compare(this.c, na2Var.c) == 0 && this.d == na2Var.d && jl40.l(this.e, na2Var.e) && jl40.l(this.f, na2Var.f) && jl40.l(this.g, na2Var.g) && this.h == na2Var.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        e3n e3nVar = this.a;
        int hashCode = (e3nVar == null ? 0 : Long.hashCode(e3nVar.a)) * 31;
        e3n e3nVar2 = this.b;
        int hashCode2 = (this.d.hashCode() + unr0.a((hashCode + (e3nVar2 == null ? 0 : Long.hashCode(e3nVar2.a))) * 31, 31, this.c)) * 31;
        List list = this.e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ma2 ma2Var = this.f;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((hashCode3 + (ma2Var != null ? ma2Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "AndroidLocationUpdatesRequest(interval=" + this.a + ", minInterval=" + this.b + ", minDistance=" + u1k.a(this.c) + ", quality=" + this.d + ", fusedProviderPreferenceOrder=" + this.e + ", restartOnTimeout=" + this.f + ", discardConfig=" + this.g + ", includePassive=" + this.h + Extension.C_BRAKE;
    }

    public /* synthetic */ na2(e3n e3nVar, e3n e3nVar2, double d, AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality, List list, ma2 ma2Var, la2 la2Var, boolean z, int i2) {
        this(e3nVar, e3nVar2, d, androidLocationUpdatesRequest$Quality, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : ma2Var, la2Var, (i2 & 128) != 0 ? false : z);
    }
}
