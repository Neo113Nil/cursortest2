package xsna;

import android.app.Activity;

/* compiled from: FcmAuthenticationError.kt */
/* loaded from: classes18.dex */
public final class ktq extends ztq {
    public final String i;

    public ktq(Throwable th, Activity activity) {
        super(activity, th);
        this.i = "AUTHENTICATION_FAILED_ERROR";
    }

    @Override // xsna.ztq
    public final String b() {
        return this.i;
    }
}
