package xsna;

import com.vk.dto.geo.GeoLocation;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: MapVh.kt */
/* loaded from: classes2.dex */
public final class gm00 implements eer0 {
    public final /* synthetic */ ndr0 b;
    public final /* synthetic */ im00 c;

    public gm00(ndr0 ndr0Var, im00 im00Var) {
        this.b = ndr0Var;
        this.c = im00Var;
    }

    @Override // xsna.eer0
    public final void a() {
        wj00 wj00Var;
        edr0 target = this.b.h().getTarget();
        double d = target.a;
        im00 im00Var = this.c;
        ql00 ql00Var = im00Var.p;
        if (ql00Var == null) {
            ql00Var = null;
        }
        GeoLocation geoLocation = ql00Var.b;
        double d2 = geoLocation != null ? geoLocation.g : 0.0d;
        double d3 = geoLocation != null ? geoLocation.h : 0.0d;
        double d4 = target.b;
        if (d == ConnectivityTracker.DEFAULT_UPLINK_BITRATE && d4 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return;
        }
        if ((Math.abs(d2 - d) >= 9.999999747378752E-5d || Math.abs(d3 - d4) >= 9.999999747378752E-5d) && (wj00Var = im00Var.l) != null) {
            wj00Var.f(d, d4);
        }
    }
}
