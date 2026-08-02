package xsna;

import android.credentials.CreateCredentialException;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.units.Power;
import android.view.inputmethod.JoinOrSplitGesture;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class h92 {
    public static /* bridge */ /* synthetic */ CreateCredentialException a(Object obj) {
        return (CreateCredentialException) obj;
    }

    public static /* synthetic */ PowerRecord.PowerRecordSample d(Power power, Instant instant) {
        return new PowerRecord.PowerRecordSample(power, instant);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return JoinOrSplitGesture.class;
    }
}
