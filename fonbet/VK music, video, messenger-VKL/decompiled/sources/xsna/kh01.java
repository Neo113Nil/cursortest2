package xsna;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class kh01 implements a.d.b {

    @Nullable
    public final GoogleSignInAccount b;

    public kh01(Context context, GoogleSignInAccount googleSignInAccount) {
        if ("<<default account>>".equals(googleSignInAccount.d) && context.getPackageManager().hasSystemFeature("cn.google")) {
            googleSignInAccount = null;
        }
        this.b = googleSignInAccount;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != this) {
            return (obj instanceof kh01) && dq70.b(((kh01) obj).b, this.b);
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.a.d.b
    @Nullable
    public final GoogleSignInAccount f() {
        return this.b;
    }

    public final int hashCode() {
        GoogleSignInAccount googleSignInAccount = this.b;
        if (googleSignInAccount != null) {
            return googleSignInAccount.hashCode();
        }
        return 0;
    }
}
