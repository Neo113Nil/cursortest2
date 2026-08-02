package defpackage;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lb9p;", "Lvn11;", "Lc6z;", "Companion", "a9p", "z8p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class b9p implements vn11, c6z {
    public static final a9p Companion = new a9p();
    public static final i3y[] n = {null, null, null, null, null, null, null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(18))};
    public static final b9p o = new b9p(0);
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final boolean l;
    public final Map m;

    public /* synthetic */ b9p(int i, boolean z, String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, int i2, boolean z2, Map map) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 32) == 0) {
            this.g = 7000L;
        } else {
            this.g = j;
        }
        if ((i & 64) == 0) {
            this.h = MapiClientImpl.RETRIES_TIME_MILLIS;
        } else {
            this.h = j2;
        }
        if ((i & 128) == 0) {
            this.i = 2000L;
        } else {
            this.i = j3;
        }
        this.j = (i & 256) == 0 ? DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT : j4;
        if ((i & 512) == 0) {
            this.k = 0;
        } else {
            this.k = i2;
        }
        this.l = (i & 1024) == 0 ? true : z2;
        this.m = (i & 2048) == 0 ? b.f() : map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9p)) {
            return false;
        }
        b9p b9pVar = (b9p) obj;
        return this.b == b9pVar.b && jl40.l(this.c, b9pVar.c) && jl40.l(this.d, b9pVar.d) && jl40.l(this.e, b9pVar.e) && jl40.l(this.f, b9pVar.f) && this.g == b9pVar.g && this.h == b9pVar.h && this.i == b9pVar.i && this.j == b9pVar.j && this.k == b9pVar.k && this.l == b9pVar.l && jl40.l(this.m, b9pVar.m);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.m;
    }

    public final int hashCode() {
        return this.m.hashCode() + unr0.e(oyr.b(this.k, qv10.c(qv10.c(qv10.c(qv10.c(unr0.b(unr0.b(unr0.b(unr0.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        StringBuilder v = ly3.v("FailureNotificatorExperiment(enabled=", ", defaultHeader=", this.c, ", defaultDescription=", this.b);
        g8e.D(v, this.d, ", noInternetHeader=", this.e, ", noInternetDescription=");
        ly3.y(this.g, this.f, ", notificatorTimeMs=", v);
        x4e.A(this.h, ", notificatorInternetTimeMs=", ", notificatorLingeringTimeMs=", v);
        v.append(this.i);
        x4e.A(this.j, ", notificatorShowAnywayMs=", ", skipRetries=", v);
        tse0.z(v, this.k, ", shouldShowServerError=", this.l, ", l10n=");
        return b64.r(v, this.m, Extension.C_BRAKE);
    }

    public b9p() {
        this(0);
    }

    public b9p(int i) {
        Map f = b.f();
        this.b = false;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = 7000L;
        this.h = MapiClientImpl.RETRIES_TIME_MILLIS;
        this.i = 2000L;
        this.j = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
        this.k = 0;
        this.l = true;
        this.m = f;
    }
}
