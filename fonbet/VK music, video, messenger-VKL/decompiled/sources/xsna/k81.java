package xsna;

import android.credentials.CreateCredentialException;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.NutritionRecord;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class k81 {
    public static /* synthetic */ CreateCredentialException a(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return NutritionRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof HeartRateRecord;
    }
}
