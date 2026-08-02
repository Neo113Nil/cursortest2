package xsna;

import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.units.Mass;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class hb1 {
    public static /* bridge */ /* synthetic */ BodyTemperatureRecord c(Object obj) {
        return (BodyTemperatureRecord) obj;
    }

    public static /* synthetic */ WeightRecord.Builder e(Metadata metadata, Instant instant, Mass mass) {
        return new WeightRecord.Builder(metadata, instant, mass);
    }

    public static /* synthetic */ void i() {
    }
}
