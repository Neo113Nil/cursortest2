package xsna;

import android.health.connect.AggregateRecordsResponse;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class v81 {
    public static /* bridge */ /* synthetic */ AggregateRecordsResponse a(Object obj) {
        return (AggregateRecordsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ BasalBodyTemperatureRecord c(Object obj) {
        return (BasalBodyTemperatureRecord) obj;
    }

    public static /* synthetic */ SexualActivityRecord.Builder d(Metadata metadata, Instant instant, int i) {
        return new SexualActivityRecord.Builder(metadata, instant, i);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return StepsCadenceRecord.class;
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void m() {
    }
}
