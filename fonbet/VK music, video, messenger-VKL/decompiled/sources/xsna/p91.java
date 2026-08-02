package xsna;

import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.units.Length;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class p91 {
    public static /* synthetic */ HeightRecord.Builder c(Metadata metadata, Instant instant, Length length) {
        return new HeightRecord.Builder(metadata, instant, length);
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return FloorsClimbedRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof RestingHeartRateRecord;
    }
}
