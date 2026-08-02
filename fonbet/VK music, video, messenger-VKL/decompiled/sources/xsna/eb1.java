package xsna;

import android.content.pm.SigningInfo;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.DataOrigin;
import android.service.credentials.CallingAppInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class eb1 {
    public static /* bridge */ /* synthetic */ DataOrigin d(Object obj) {
        return (DataOrigin) obj;
    }

    public static /* synthetic */ CallingAppInfo e(String str, SigningInfo signingInfo, String str2) {
        return new CallingAppInfo(str, signingInfo, str2);
    }

    public static /* synthetic */ void h() {
    }

    public static /* bridge */ /* synthetic */ boolean j(Object obj) {
        return obj instanceof BodyFatRecord;
    }
}
