package xsna;

import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.Metadata;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class b81 {
    public static /* bridge */ /* synthetic */ DistanceRecord c(Object obj) {
        return (DistanceRecord) obj;
    }

    public static /* synthetic */ IntermenstrualBleedingRecord.Builder d(Metadata metadata, Instant instant) {
        return new IntermenstrualBleedingRecord.Builder(metadata, instant);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return HeartRateRecord.class;
    }
}
