package xsna;

import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.OvulationTestRecord;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vd2 {
    public static /* bridge */ /* synthetic */ CredentialOption b(Object obj) {
        return (CredentialOption) obj;
    }

    public static /* synthetic */ GetCredentialException c(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return OvulationTestRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof HeartRateVariabilityRmssdRecord;
    }
}
