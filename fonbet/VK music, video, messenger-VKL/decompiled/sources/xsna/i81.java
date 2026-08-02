package xsna;

import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.NutritionRecord;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class i81 {
    public static /* bridge */ /* synthetic */ FloorsClimbedRecord c(Object obj) {
        return (FloorsClimbedRecord) obj;
    }

    public static /* synthetic */ NutritionRecord.Builder d(Metadata metadata, Instant instant, Instant instant2) {
        return new NutritionRecord.Builder(metadata, instant, instant2);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return MenstruationFlowRecord.class;
    }
}
