package xsna;

import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class d81 {
    public static /* synthetic */ MenstruationPeriodRecord.Builder d(Metadata metadata, Instant instant, Instant instant2) {
        return new MenstruationPeriodRecord.Builder(metadata, instant, instant2);
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return HeartRateVariabilityRmssdRecord.class;
    }

    public static /* bridge */ /* synthetic */ void m(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean o(Object obj) {
        return obj instanceof ElevationGainedRecord;
    }
}
