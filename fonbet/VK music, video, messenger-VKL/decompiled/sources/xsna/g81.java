package xsna;

import android.health.connect.TimeRangeFilter;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.Metadata;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class g81 {
    public static /* bridge */ /* synthetic */ TimeRangeFilter a(Object obj) {
        return (TimeRangeFilter) obj;
    }

    public static /* bridge */ /* synthetic */ ExerciseSessionRecord c(Object obj) {
        return (ExerciseSessionRecord) obj;
    }

    public static /* synthetic */ MenstruationFlowRecord.Builder e(Metadata metadata, Instant instant, int i) {
        return new MenstruationFlowRecord.Builder(metadata, instant, i);
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return IntermenstrualBleedingRecord.class;
    }
}
