package xsna;

import android.content.Context;
import android.graphics.Gainmap;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.StepsRecord;
import android.net.http.HttpEngine;
import android.service.credentials.BeginGetCredentialRequest;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class x81 {
    public static /* bridge */ /* synthetic */ Gainmap c(Object obj) {
        return (Gainmap) obj;
    }

    public static /* bridge */ /* synthetic */ LeanBodyMassRecord e(Object obj) {
        return (LeanBodyMassRecord) obj;
    }

    public static /* synthetic */ OvulationTestRecord.Builder f(Metadata metadata, Instant instant, int i) {
        return new OvulationTestRecord.Builder(metadata, instant, i);
    }

    public static /* bridge */ /* synthetic */ PowerRecord.PowerRecordSample g(Object obj) {
        return (PowerRecord.PowerRecordSample) obj;
    }

    public static /* synthetic */ HttpEngine.Builder i(Context context) {
        return new HttpEngine.Builder(context);
    }

    public static /* synthetic */ BeginGetCredentialRequest.Builder j() {
        return new BeginGetCredentialRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return StepsRecord.class;
    }

    public static /* synthetic */ void l() {
    }
}
