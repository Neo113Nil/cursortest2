package xsna;

import android.app.Activity;

/* compiled from: FcmFisAuthError.kt */
/* loaded from: classes18.dex */
public final class stq extends ztq {
    public final String i;

    public stq(Throwable th, Activity activity) {
        super(activity, th);
        this.i = "FIS_AUTH_ERROR";
    }

    @Override // xsna.ztq
    public final String b() {
        return this.i;
    }
}
