package xsna;

import android.adservices.measurement.MeasurementManager;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.units.Volume;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class z81 {
    public static /* synthetic */ HydrationRecord.Builder d(Metadata metadata, Instant instant, Instant instant2, Volume volume) {
        return new HydrationRecord.Builder(metadata, instant, instant2, volume);
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return Vo2MaxRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof MenstruationFlowRecord;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return MeasurementManager.class;
    }
}
