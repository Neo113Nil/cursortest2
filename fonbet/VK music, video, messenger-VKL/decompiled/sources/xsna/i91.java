package xsna;

import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.net.http.NetworkException;
import android.view.inputmethod.RemoveSpaceGesture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class i91 {
    public static /* bridge */ /* synthetic */ NetworkException d(Exception exc) {
        return (NetworkException) exc;
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return BloodPressureRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean j(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ boolean k(Object obj) {
        return obj instanceof OxygenSaturationRecord;
    }
}
