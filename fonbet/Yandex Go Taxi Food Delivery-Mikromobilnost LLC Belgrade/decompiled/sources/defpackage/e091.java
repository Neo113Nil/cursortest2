package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.zzw;

/* loaded from: classes.dex */
public final class e091 extends ust implements pdy0 {
    public static final zm2 k = new zm2("ClientTelemetry.API", new b091(0), new pm2());

    public final zzw e(TelemetryData telemetryData) {
        ysx0 a = zsx0.a();
        a.c = new Feature[]{nz81.a};
        a.b = false;
        a.a = new qc20(telemetryData);
        return d(2, a.a());
    }
}
