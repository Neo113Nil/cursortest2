package xsna;

import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.StepsRecord;
import android.net.http.InlineExecutionProhibitedException;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class e91 {
    public static /* bridge */ /* synthetic */ NutritionRecord d(Object obj) {
        return (NutritionRecord) obj;
    }

    public static /* synthetic */ StepsRecord.Builder e(Metadata metadata, Instant instant, Instant instant2, long j) {
        return new StepsRecord.Builder(metadata, instant, instant2, j);
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return BasalBodyTemperatureRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean m(Exception exc) {
        return exc instanceof InlineExecutionProhibitedException;
    }
}
