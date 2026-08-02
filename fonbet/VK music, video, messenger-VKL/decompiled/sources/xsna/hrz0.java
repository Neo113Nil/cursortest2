package xsna;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class hrz0 {

    @Nullable
    public static hrz0 c;
    public final lgl0 a;

    @Nullable
    public GoogleSignInAccount b;

    public hrz0(Context context) {
        String e;
        lgl0 a = lgl0.a(context);
        this.a = a;
        this.b = a.b();
        String e2 = a.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e2) || (e = a.e(lgl0.f("googleSignInOptions", e2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e);
        } catch (JSONException unused) {
        }
    }

    public static synchronized hrz0 a(@NonNull Context context) {
        hrz0 hrz0Var;
        synchronized (hrz0.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (hrz0.class) {
                hrz0Var = c;
                if (hrz0Var == null) {
                    hrz0Var = new hrz0(applicationContext);
                    c = hrz0Var;
                }
            }
            return hrz0Var;
        }
        return hrz0Var;
    }

    public final synchronized void b() {
        lgl0 lgl0Var = this.a;
        ReentrantLock reentrantLock = lgl0Var.a;
        reentrantLock.lock();
        try {
            lgl0Var.b.edit().clear().apply();
            reentrantLock.unlock();
            this.b = null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
