package defpackage;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import androidx.privacysandbox.ads.adservices.measurement.a;

/* loaded from: classes10.dex */
public abstract class ma10 {
    public static final MeasurementManagerFutures$Api33Ext5JavaImpl a(Context context) {
        ka10 a = a.a(context);
        if (a != null) {
            return new MeasurementManagerFutures$Api33Ext5JavaImpl(a);
        }
        return null;
    }
}
