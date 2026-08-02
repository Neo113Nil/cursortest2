package xsna;

import android.app.slice.Slice;
import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.service.credentials.CreateEntry;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class p92 {
    public static /* synthetic */ SleepSessionRecord.Stage e(Instant instant, Instant instant2, int i) {
        return new SleepSessionRecord.Stage(instant, instant2, i);
    }

    public static /* synthetic */ CreateEntry g(Slice slice) {
        return new CreateEntry(slice);
    }

    public static /* bridge */ /* synthetic */ boolean k(Object obj) {
        return obj instanceof ActiveCaloriesBurnedRecord;
    }
}
