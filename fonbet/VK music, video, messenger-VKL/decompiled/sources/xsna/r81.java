package xsna;

import android.app.slice.Slice;
import android.health.connect.ReadRecordsResponse;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.service.credentials.Action;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class r81 {
    public static /* bridge */ /* synthetic */ ReadRecordsResponse b(Object obj) {
        return (ReadRecordsResponse) obj;
    }

    public static /* synthetic */ Action f(Slice slice) {
        return new Action(slice);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return RestingHeartRateRecord.class;
    }

    public static /* synthetic */ void h() {
    }

    public static /* bridge */ /* synthetic */ boolean k(Object obj) {
        return obj instanceof HydrationRecord;
    }
}
