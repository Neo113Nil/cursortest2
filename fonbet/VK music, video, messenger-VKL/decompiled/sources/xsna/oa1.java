package xsna;

import android.credentials.CreateCredentialException;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.units.Velocity;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class oa1 {
    public static /* synthetic */ SpeedRecord.SpeedRecordSample b(Velocity velocity, Instant instant) {
        return new SpeedRecord.SpeedRecordSample(velocity, instant);
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return CreateCredentialException.class;
    }

    public static /* bridge */ /* synthetic */ boolean j(Object obj) {
        return obj instanceof BloodPressureRecord;
    }
}
