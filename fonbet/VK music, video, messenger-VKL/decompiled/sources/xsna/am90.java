package xsna;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailability;

/* compiled from: PasskeyNativeAvailabilityResolverImpl.kt */
/* loaded from: classes4.dex */
public final class am90 implements zl90 {
    public final Context a;

    public am90(Context context) {
        this.a = context;
    }

    @Override // xsna.zl90
    public final boolean a() {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = this.a;
        if (googleApiAvailability.isGooglePlayServicesAvailable(context) == 0) {
            return Build.VERSION.SDK_INT < 34 || context.getSystemService("credential") != null;
        }
        return false;
    }
}
