package xsna;

import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public class os01 {
    public static final os01 c = new os01(null, null, true);
    public final boolean a;
    public final Throwable b;

    public os01(String str, Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }

    public static os01 b(@NonNull String str) {
        return new os01(str, null, false);
    }

    public static os01 c(@NonNull Exception exc, @NonNull String str) {
        return new os01(str, exc, false);
    }

    public static os01 e() {
        return new os01(null, null, true);
    }

    public static os01 f(@NonNull String str, PackageManager.NameNotFoundException nameNotFoundException) {
        return new os01(str, nameNotFoundException, false);
    }

    public final void d() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.b != null) {
            a();
        } else {
            a();
        }
    }

    public void a() {
    }
}
