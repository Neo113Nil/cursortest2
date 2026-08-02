package xsna;

import android.credentials.GetCredentialResponse;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.units.Energy;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class e92 {
    public static /* synthetic */ TotalCaloriesBurnedRecord.Builder c(Metadata metadata, Instant instant, Instant instant2, Energy energy) {
        return new TotalCaloriesBurnedRecord.Builder(metadata, instant, instant2, energy);
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return GetCredentialResponse.class;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof BloodGlucoseRecord;
    }
}
