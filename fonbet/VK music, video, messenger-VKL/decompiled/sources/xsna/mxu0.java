package xsna;

import com.google.android.gms.common.api.ApiException;

/* compiled from: VkHealthGoogleFitAvailabilityStorageNew.kt */
/* loaded from: classes6.dex */
public final class mxu0 {
    public static boolean a(Throwable th) {
        if (!(th instanceof ApiException)) {
            return false;
        }
        int g = ((ApiException) th).g();
        return g == 4 || g == 5000;
    }
}
