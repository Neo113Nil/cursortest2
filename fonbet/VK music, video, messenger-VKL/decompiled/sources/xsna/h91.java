package xsna;

import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.net.http.NetworkException;
import android.view.inputmethod.SelectGesture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class h91 {
    public static /* bridge */ /* synthetic */ SelectGesture f(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return BoneMassRecord.class;
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ boolean k(Exception exc) {
        return exc instanceof NetworkException;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof BasalMetabolicRateRecord;
    }
}
