package xsna;

import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.units.Mass;
import android.view.inputmethod.SelectRangeGesture;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class v91 {
    public static /* synthetic */ LeanBodyMassRecord.Builder b(Metadata metadata, Instant instant, Mass mass) {
        return new LeanBodyMassRecord.Builder(metadata, instant, mass);
    }

    public static /* bridge */ /* synthetic */ boolean k(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof SleepSessionRecord;
    }
}
