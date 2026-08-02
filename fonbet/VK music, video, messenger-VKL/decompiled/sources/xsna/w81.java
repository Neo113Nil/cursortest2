package xsna;

import android.health.connect.AggregateRecordsRequest;
import android.health.connect.TimeRangeFilter;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.service.credentials.BeginGetCredentialResponse;
import android.view.inputmethod.SelectGesture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class w81 {
    public static /* synthetic */ AggregateRecordsRequest.Builder c(TimeRangeFilter timeRangeFilter) {
        return new AggregateRecordsRequest.Builder(timeRangeFilter);
    }

    public static /* synthetic */ BeginGetCredentialResponse.Builder f() {
        return new BeginGetCredentialResponse.Builder();
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return BodyWaterMassRecord.class;
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj) {
        return obj instanceof LeanBodyMassRecord;
    }
}
