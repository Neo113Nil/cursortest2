package xsna;

import android.app.Activity;

/* compiled from: FcmPhoneRegistrationError.kt */
/* loaded from: classes18.dex */
public final class xtq extends ztq {
    public final String i;

    public xtq(Throwable th, Activity activity) {
        super(activity, th);
        this.i = "PHONE_REGISTRATION_ERROR";
    }

    @Override // xsna.ztq
    public final String b() {
        return this.i;
    }
}
