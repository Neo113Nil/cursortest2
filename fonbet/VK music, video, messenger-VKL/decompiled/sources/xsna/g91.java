package xsna;

import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.units.Percentage;
import android.net.http.QuicException;
import android.view.inputmethod.InsertGesture;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class g91 {
    public static /* bridge */ /* synthetic */ OvulationTestRecord c(Object obj) {
        return (OvulationTestRecord) obj;
    }

    public static /* synthetic */ OxygenSaturationRecord.Builder d(Metadata metadata, Instant instant, Percentage percentage) {
        return new OxygenSaturationRecord.Builder(metadata, instant, percentage);
    }

    public static /* bridge */ /* synthetic */ QuicException f(Exception exc) {
        return (QuicException) exc;
    }

    public static /* bridge */ /* synthetic */ InsertGesture g(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return BloodGlucoseRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof QuicException;
    }
}
