package xsna;

import com.google.gson.Gson;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.time.DurationUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.zno;

/* compiled from: ScreenThermalStatusReportConfig.kt */
/* loaded from: classes3.dex */
public final class zch0 {
    public static final Gson f = new Gson();
    public final long a;
    public final r8a0 b;
    public final float c;
    public final float d;
    public final int e;

    /* compiled from: ScreenThermalStatusReportConfig.kt */
    public static final class a {
        public static zch0 a(JSONObject jSONObject) {
            Object obj;
            JSONArray optJSONArray = jSONObject.optJSONArray("reported_screens");
            if (optJSONArray == null) {
                obj = EmptyList.b;
            } else {
                k9x q = swe0.q(0, optJSONArray.length());
                ArrayList arrayList = new ArrayList();
                j9x it = q.iterator();
                while (it.d) {
                    String optString = optJSONArray.optString(it.nextInt());
                    if (optString.length() == 0) {
                        optString = null;
                    }
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = optString != null ? (MobileOfficialAppsCoreNavStat$EventScreen) zch0.f.fromJson(optString, MobileOfficialAppsCoreNavStat$EventScreen.class) : null;
                    if (mobileOfficialAppsCoreNavStat$EventScreen != null) {
                        arrayList.add(mobileOfficialAppsCoreNavStat$EventScreen);
                    }
                }
                obj = arrayList;
            }
            zno.a aVar = zno.c;
            return new zch0(eoo.e(jSONObject.optInt("status_check_interval_seconds", 60), DurationUnit.SECONDS), new r8a0(obj, 14), (float) jSONObject.optDouble("report_min_cpu_temperature_delta", 5.0d), (float) jSONObject.optDouble("report_min_thermal_headroom_delta", 0.05d), jSONObject.optInt("report_min_thermal_status_delta", 1));
        }
    }

    public zch0() {
        throw null;
    }

    public zch0(long j, r8a0 r8a0Var, float f2, float f3, int i) {
        this.a = j;
        this.b = r8a0Var;
        this.c = f2;
        this.d = f3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zch0)) {
            return false;
        }
        zch0 zch0Var = (zch0) obj;
        return zno.d(this.a, zch0Var.a) && epx.f(this.b, zch0Var.b) && Float.compare(this.c, zch0Var.c) == 0 && Float.compare(this.d, zch0Var.d) == 0 && this.e == zch0Var.e;
    }

    public final int hashCode() {
        zno.a aVar = zno.c;
        return Integer.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenThermalStatusReportConfig(statusCheckInterval=");
        sb.append((Object) zno.m(this.a));
        sb.append(", shouldReportThermalsForScreen=");
        sb.append(this.b);
        sb.append(", reportMinCpuTemperatureDelta=");
        sb.append(this.c);
        sb.append(", reportMinThermalHeadroomDelta=");
        sb.append(this.d);
        sb.append(", reportMinThermalStatusDelta=");
        return vu5.b(sb, this.e, ')');
    }
}
