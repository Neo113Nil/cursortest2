package xsna;

import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.net.http.QuicException;
import android.view.inputmethod.InsertGesture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class f91 {
    public static /* bridge */ /* synthetic */ Class f() {
        return BasalMetabolicRateRecord.class;
    }

    public static /* synthetic */ void j() {
    }

    public static /* bridge */ /* synthetic */ boolean k(Exception exc) {
        return exc instanceof QuicException;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj) {
        return obj instanceof OvulationTestRecord;
    }
}
