package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes11.dex */
public final class nwt implements uyj0 {
    public final Status a;
    public final GoogleSignInAccount b;

    public nwt(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @Override // defpackage.uyj0
    public final Status getStatus() {
        return this.a;
    }
}
