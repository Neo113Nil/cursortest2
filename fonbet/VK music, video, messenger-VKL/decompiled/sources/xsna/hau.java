package xsna;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class hau extends com.google.android.gms.common.api.b<GoogleSignInOptions> {
    public static int a = 1;

    public final synchronized int a() {
        int i;
        try {
            i = a;
            if (i == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int c = googleApiAvailability.c(applicationContext, 12451000);
                if (c == 0) {
                    i = 4;
                    a = 4;
                } else if (googleApiAvailability.b(applicationContext, c, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    a = 2;
                } else {
                    i = 3;
                    a = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
