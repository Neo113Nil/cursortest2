package xsna;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class rqz0 extends lz3 implements xlj0 {
    public final Semaphore i;
    public final Set j;

    public rqz0(SignInHubActivity signInHubActivity, Set set) {
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    @Override // xsna.xlj0
    public final void onComplete() {
        this.i.release();
    }
}
