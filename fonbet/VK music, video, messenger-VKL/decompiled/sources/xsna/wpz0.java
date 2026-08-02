package xsna;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class wpz0 extends com.google.android.gms.common.api.b implements z7o0 {
    public static final com.google.android.gms.common.api.a a = new com.google.android.gms.common.api.a("ClientTelemetry.API", new rpz0(), new a.g());

    public final Task<Void> a(final TelemetryData telemetryData) {
        f5o0.a a2 = f5o0.a();
        a2.d = new Feature[]{com.google.android.gms.internal.base.zad.zaa};
        a2.c = true;
        a2.b = false;
        a2.a = new ouf0() { // from class: xsna.upz0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                com.google.android.gms.common.api.a aVar = wpz0.a;
                ((xoz0) ((ypz0) obj).getService()).f(TelemetryData.this);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        return doBestEffortWrite(a2.a());
    }
}
