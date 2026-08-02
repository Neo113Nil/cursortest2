package xsna;

import android.os.SystemClock;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import java.util.concurrent.TimeUnit;

/* compiled from: EcosystemVerificationMethod.kt */
/* loaded from: classes15.dex */
public final class cyo {
    public final VerificationMethodTypes a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final long f;

    public cyo(VerificationMethodTypes verificationMethodTypes, int i, int i2, String str, boolean z) {
        this.a = verificationMethodTypes;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = z;
        this.f = TimeUnit.SECONDS.toMillis(i) + SystemClock.elapsedRealtime();
    }
}
