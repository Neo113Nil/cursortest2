package xsna;

import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.units.Energy;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.CallingAppInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class fb1 {
    public static /* bridge */ /* synthetic */ BodyFatRecord e(Object obj) {
        return (BodyFatRecord) obj;
    }

    public static /* bridge */ /* synthetic */ Energy f(Object obj) {
        return (Energy) obj;
    }

    public static /* synthetic */ BeginCreateCredentialRequest g(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        return new BeginCreateCredentialRequest(str, bundle, callingAppInfo);
    }
}
