package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.trains.schedule.dto.MtScheduleScenario;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldh40;", "", "Companion", "bh40", "ch40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class dh40 {
    public static final ch40 Companion = new ch40();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final MtScheduleScenario f;
    public final boolean g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new e540(28)), a.b(lazyThreadSafetyMode, new ah40(0)), null};
    }

    public /* synthetic */ dh40(int i, String str, String str2, String str3, String str4, Map map, MtScheduleScenario mtScheduleScenario, boolean z) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = b.f();
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = MtScheduleScenario.UNKNOWN;
        } else {
            this.f = mtScheduleScenario;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh40)) {
            return false;
        }
        dh40 dh40Var = (dh40) obj;
        return jl40.l(this.a, dh40Var.a) && jl40.l(this.b, dh40Var.b) && jl40.l(this.c, dh40Var.c) && jl40.l(this.d, dh40Var.d) && jl40.l(this.e, dh40Var.e) && this.f == dh40Var.f && this.g == dh40Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + unr0.d((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTrainSchedulerRequestPayloadDto(date=", this.a, ", startingStopId=", this.b, ", destinationStopId=");
        g8e.D(v, this.c, ", lineId=", this.d, ", selectedFilterIds=");
        v.append(this.e);
        v.append(", scenario=");
        v.append(this.f);
        v.append(", includeUnpurchasableTrips=");
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }

    public dh40(String str, String str2, String str3, Map map, MtScheduleScenario mtScheduleScenario, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = null;
        this.e = map;
        this.f = mtScheduleScenario;
        this.g = z;
    }

    public dh40() {
        this(null, null, null, b.f(), MtScheduleScenario.UNKNOWN, true);
    }
}
