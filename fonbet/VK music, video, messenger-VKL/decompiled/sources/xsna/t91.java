package xsna;

import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.service.credentials.Action;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class t91 {
    public static /* bridge */ /* synthetic */ BasalMetabolicRateRecord c(Object obj) {
        return (BasalMetabolicRateRecord) obj;
    }

    public static /* synthetic */ WheelchairPushesRecord.Builder d(Metadata metadata, Instant instant, Instant instant2, long j) {
        return new WheelchairPushesRecord.Builder(metadata, instant, instant2, j);
    }

    public static /* bridge */ /* synthetic */ Action e(Object obj) {
        return (Action) obj;
    }
}
