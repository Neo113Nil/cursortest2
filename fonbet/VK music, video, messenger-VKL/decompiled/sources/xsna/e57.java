package xsna;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import xsna.q47;

/* compiled from: BiometricPrompt.java */
/* loaded from: classes11.dex */
public final class e57 {

    @Nullable
    public FragmentManager a;

    /* compiled from: BiometricPrompt.java */
    public static class b {
        public final c a;

        public b(c cVar, int i) {
            this.a = cVar;
        }
    }

    /* compiled from: BiometricPrompt.java */
    public static class d {

        @NonNull
        public final CharSequence a;

        @Nullable
        public final CharSequence b;

        @Nullable
        public final CharSequence c;

        @Nullable
        public final CharSequence d;
        public final boolean e;
        public final int f;

        /* compiled from: BiometricPrompt.java */
        public static class a {

            @Nullable
            public CharSequence a = null;

            @Nullable
            public CharSequence b = null;

            @Nullable
            public CharSequence c = null;

            @Nullable
            public CharSequence d = null;
            public boolean e = true;
            public int f = 0;

            @NonNull
            public final d a() {
                if (TextUtils.isEmpty(this.a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!e75.b(this.f)) {
                    StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
                    sb.append(Build.VERSION.SDK_INT);
                    sb.append(": ");
                    int i = this.f;
                    sb.append(i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
                    throw new IllegalArgumentException(sb.toString());
                }
                int i2 = this.f;
                boolean a = i2 != 0 ? e75.a(i2) : false;
                if (TextUtils.isEmpty(this.d) && !a) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.d) || !a) {
                    return new d(this.a, this.b, this.c, this.d, this.e, this.f);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
        }

        public d(@NonNull CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @Nullable CharSequence charSequence4, boolean z, int i) {
            this.a = charSequence;
            this.b = charSequence2;
            this.c = charSequence3;
            this.d = charSequence4;
            this.e = z;
            this.f = i;
        }
    }

    /* compiled from: BiometricPrompt.java */
    public static class e implements e5z {

        @NonNull
        public final WeakReference<o57> b;

        public e(@NonNull o57 o57Var) {
            this.b = new WeakReference<>(o57Var);
        }

        @androidx.lifecycle.o(Lifecycle.Event.ON_DESTROY)
        public void resetCallback() {
            WeakReference<o57> weakReference = this.b;
            if (weakReference.get() != null) {
                weakReference.get().c = null;
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public e57(@NonNull FragmentActivity fragmentActivity, @NonNull Executor executor, @NonNull a aVar) {
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        o57 c2 = c(fragmentActivity);
        this.a = supportFragmentManager;
        if (c2 != null) {
            c2.b = executor;
            c2.c = aVar;
        }
    }

    @Nullable
    public static o57 c(@Nullable FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            return null;
        }
        vyt0 vyt0Var = new vyt0(fragmentActivity.getViewModelStore(), fragmentActivity.getDefaultViewModelProviderFactory(), fragmentActivity.getDefaultViewModelCreationExtras());
        rfc a2 = fpf0.a(o57.class);
        String h = a2.h();
        if (h != null) {
            return (o57) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a2);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void a(@NonNull d dVar, @NonNull c cVar) {
        int i = dVar.f;
        if (i == 0) {
            i = 15;
        }
        if ((i & 255) == 255) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && e75.a(i)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        b(dVar, cVar);
    }

    public final void b(@NonNull d dVar, @Nullable c cVar) {
        FragmentManager fragmentManager = this.a;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (fragmentManager.T()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        FragmentManager fragmentManager2 = this.a;
        q47 q47Var = (q47) fragmentManager2.H("androidx.biometric.BiometricFragment");
        if (q47Var == null) {
            q47Var = new q47();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager2);
            aVar.f(0, q47Var, "androidx.biometric.BiometricFragment", 1);
            aVar.k(true);
            fragmentManager2.F();
        }
        FragmentActivity activity = q47Var.getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        o57 o57Var = q47Var.i;
        o57Var.d = dVar;
        int i = dVar.f;
        if (i == 0) {
            i = cVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i == 15 && cVar == null) {
            o57Var.e = ujk.a();
        } else {
            o57Var.e = cVar;
        }
        if (q47Var.vn()) {
            q47Var.i.i = q47Var.getString(R.string.confirm_device_credential_password);
        } else {
            q47Var.i.i = null;
        }
        if (q47Var.vn() && c57.c(activity).a(255) != 0) {
            q47Var.i.l = true;
            q47Var.xn();
        } else if (q47Var.i.n) {
            q47Var.h.postDelayed(new q47.g(q47Var), 600L);
        } else {
            q47Var.Bn();
        }
    }

    /* compiled from: BiometricPrompt.java */
    public static class c {

        @Nullable
        public final Signature a;

        @Nullable
        public final Cipher b;

        @Nullable
        public final Mac c;

        @Nullable
        public final IdentityCredential d;

        public c(@NonNull Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public c(@NonNull Cipher cipher) {
            this.a = null;
            this.b = cipher;
            this.c = null;
            this.d = null;
        }

        public c(@NonNull Mac mac) {
            this.a = null;
            this.b = null;
            this.c = mac;
            this.d = null;
        }

        public c(@NonNull IdentityCredential identityCredential) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = identityCredential;
        }
    }

    /* compiled from: BiometricPrompt.java */
    public static abstract class a {
        public void b() {
        }

        public void c(@NonNull b bVar) {
        }

        public void a(int i, @NonNull CharSequence charSequence) {
        }
    }
}
