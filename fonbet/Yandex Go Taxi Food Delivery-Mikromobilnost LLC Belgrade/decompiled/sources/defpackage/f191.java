package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import java.util.Iterator;
import java.util.Set;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public abstract class f191 {
    public static final ngz a = new ngz("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        Object[] objArr = new Object[0];
        ngz ngzVar = a;
        if (ngzVar.b <= 3) {
            ngzVar.a("getSignInIntent()", objArr);
        }
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(ConfigConstants.CONFIG, signInConfiguration);
        intent.putExtra(ConfigConstants.CONFIG, bundle);
        return intent;
    }

    public static void b(Context context) {
        g191.f0(context).g0();
        Set set = yst.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((yst) it.next()).l();
        }
        GoogleApiManager.reportSignOut();
    }
}
