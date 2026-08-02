package xsna;

import android.app.Activity;

/* compiled from: FcmServiceNotAvailableError.kt */
/* loaded from: classes18.dex */
public final class ytq extends ztq {
    public final String i;

    public ytq(Throwable th, Activity activity) {
        super(activity, th);
        this.i = "SERVICE_NOT_AVAILABLE";
    }

    @Override // xsna.ztq
    public final String b() {
        return this.i;
    }
}
