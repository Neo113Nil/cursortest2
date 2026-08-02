package xsna;

import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import kotlin.LazyThreadSafetyMode;
import xsna.oou0;

/* compiled from: CredentialsActivitySaverDelegate.kt */
/* loaded from: classes.dex */
public final class rdk {
    public static boolean g;
    public final DefaultAuthActivity a;
    public oou0.b b;
    public AuthResult c;
    public long d;
    public SignUpData e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new bia(this, 1));

    public rdk(DefaultAuthActivity defaultAuthActivity) {
        this.a = defaultAuthActivity;
    }

    public final void a() {
        DefaultAuthActivity defaultAuthActivity = this.a;
        defaultAuthActivity.W1();
        AuthResult authResult = this.c;
        if (authResult != null) {
            defaultAuthActivity.r1(authResult);
        }
        SignUpData signUpData = this.e;
        if (signUpData != null) {
            defaultAuthActivity.X1(this.d, signUpData);
        }
        g = false;
        this.c = null;
        this.d = 0L;
        this.e = null;
    }
}
