package xsna;

import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.SleepSessionRecord;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class z71 {
    public static /* bridge */ /* synthetic */ CyclingPedalingCadenceRecord c(Object obj) {
        return (CyclingPedalingCadenceRecord) obj;
    }

    public static /* synthetic */ SleepSessionRecord.Builder d(Metadata metadata, Instant instant, Instant instant2) {
        return new SleepSessionRecord.Builder(metadata, instant, instant2);
    }
}
