package xsna;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class ea1 {
    public static /* synthetic */ RestingHeartRateRecord.Builder c(Metadata metadata, Instant instant, long j) {
        return new RestingHeartRateRecord.Builder(metadata, instant, j);
    }

    public static /* bridge */ /* synthetic */ TotalCaloriesBurnedRecord d(Object obj) {
        return (TotalCaloriesBurnedRecord) obj;
    }
}
