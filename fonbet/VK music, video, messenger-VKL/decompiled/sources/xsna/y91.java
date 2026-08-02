package xsna;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.view.inputmethod.DeleteRangeGesture;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class y91 {
    public static /* synthetic */ RespiratoryRateRecord.Builder b(Metadata metadata, Instant instant, double d) {
        return new RespiratoryRateRecord.Builder(metadata, instant, d);
    }

    public static /* bridge */ /* synthetic */ SpeedRecord c(Object obj) {
        return (SpeedRecord) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture f(Object obj) {
        return (DeleteRangeGesture) obj;
    }
}
