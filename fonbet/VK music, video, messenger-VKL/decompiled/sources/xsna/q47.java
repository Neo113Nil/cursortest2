package xsna;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import xsna.e57;
import xsna.o57;
import xsna.uq9;
import xsna.y65;

/* compiled from: BiometricFragment.java */
/* loaded from: classes11.dex */
public class q47 extends Fragment {
    public final Handler h = new Handler(Looper.getMainLooper());
    public o57 i;

    /* compiled from: BiometricFragment.java */
    public class a implements Runnable {
        public final /* synthetic */ int b;
        public final /* synthetic */ CharSequence c;

        public a(int i, CharSequence charSequence) {
            this.b = i;
            this.c = charSequence;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o57 o57Var = q47.this.i;
            if (o57Var.c == null) {
                o57Var.c = new n57();
            }
            o57Var.c.a(this.b, this.c);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class b {
        @Nullable
        public static Intent a(@NonNull KeyguardManager keyguardManager, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class c {
        public static void a(@NonNull BiometricPrompt biometricPrompt, @NonNull BiometricPrompt.CryptoObject cryptoObject, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }

        public static void b(@NonNull BiometricPrompt biometricPrompt, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        @NonNull
        public static BiometricPrompt c(@NonNull BiometricPrompt.Builder builder) {
            return builder.build();
        }

        @NonNull
        public static BiometricPrompt.Builder d(@NonNull Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void e(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void f(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void g(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void h(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class d {
        public static void a(@NonNull BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        public static void b(@NonNull BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class e {
        public static void a(@NonNull BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class f implements Executor {
        public final Handler b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            this.b.post(runnable);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class g implements Runnable {

        @NonNull
        public final WeakReference<q47> b;

        public g(@Nullable q47 q47Var) {
            this.b = new WeakReference<>(q47Var);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<q47> weakReference = this.b;
            if (weakReference.get() != null) {
                weakReference.get().Bn();
            }
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class h implements Runnable {

        @NonNull
        public final WeakReference<o57> b;

        public h(@Nullable o57 o57Var) {
            this.b = new WeakReference<>(o57Var);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<o57> weakReference = this.b;
            if (weakReference.get() != null) {
                weakReference.get().n = false;
            }
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class i implements Runnable {

        @NonNull
        public final WeakReference<o57> b;

        public i(@Nullable o57 o57Var) {
            this.b = new WeakReference<>(o57Var);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<o57> weakReference = this.b;
            if (weakReference.get() != null) {
                weakReference.get().o = false;
            }
        }
    }

    public final void An(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.i.l(2);
        this.i.k(charSequence);
    }

    public final void Bn() {
        if (this.i.k || mo2getContext() == null) {
            return;
        }
        o57 o57Var = this.i;
        o57Var.k = true;
        o57Var.l = true;
        if (wn()) {
            yn(12, p490.m(12, requireContext().getApplicationContext()));
            return;
        }
        BiometricPrompt.Builder d2 = c.d(requireContext().getApplicationContext());
        e57.d dVar = this.i.d;
        CharSequence charSequence = null;
        CharSequence charSequence2 = dVar != null ? dVar.a : null;
        CharSequence charSequence3 = dVar != null ? dVar.b : null;
        CharSequence charSequence4 = dVar != null ? dVar.c : null;
        if (charSequence2 != null) {
            c.h(d2, charSequence2);
        }
        if (charSequence3 != null) {
            c.g(d2, charSequence3);
        }
        if (charSequence4 != null) {
            c.e(d2, charSequence4);
        }
        o57 o57Var2 = this.i;
        String str = o57Var2.i;
        if (str != null) {
            charSequence = str;
        } else {
            e57.d dVar2 = o57Var2.d;
            if (dVar2 != null && (charSequence = dVar2.d) == null) {
                charSequence = "";
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Executor executor = this.i.b;
            if (executor == null) {
                executor = new o57.b();
            }
            o57 o57Var3 = this.i;
            if (o57Var3.h == null) {
                o57Var3.h = new o57.c(o57Var3);
            }
            c.f(d2, charSequence, executor, o57Var3.h);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            e57.d dVar3 = this.i.d;
            d.a(d2, dVar3 == null || dVar3.e);
        }
        int i3 = this.i.i();
        if (i2 >= 30) {
            e.a(d2, i3);
        } else if (i2 >= 29) {
            d.b(d2, e75.a(i3));
        }
        BiometricPrompt c2 = c.c(d2);
        Context mo2getContext = mo2getContext();
        BiometricPrompt.CryptoObject b2 = ujk.b(this.i.e);
        o57 o57Var4 = this.i;
        if (o57Var4.g == null) {
            o57Var4.g = new uq9();
        }
        uq9 uq9Var = o57Var4.g;
        if (uq9Var.a == null) {
            uq9Var.a = uq9.b.b();
        }
        CancellationSignal cancellationSignal = uq9Var.a;
        f fVar = new f();
        o57 o57Var5 = this.i;
        if (o57Var5.f == null) {
            o57Var5.f = new y65(new o57.a(o57Var5));
        }
        y65 y65Var = o57Var5.f;
        if (y65Var.a == null) {
            y65Var.a = y65.a.a(y65Var.b);
        }
        BiometricPrompt.AuthenticationCallback authenticationCallback = y65Var.a;
        try {
            if (b2 == null) {
                c.b(c2, cancellationSignal, fVar, authenticationCallback);
            } else {
                c.a(c2, b2, cancellationSignal, fVar, authenticationCallback);
            }
        } catch (NullPointerException e2) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
            yn(1, mo2getContext != null ? mo2getContext.getString(R.string.default_error_msg) : "");
        }
    }

    public final void dismiss() {
        this.i.k = false;
        un();
        if (!this.i.m && isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.q(this);
            aVar.k(true);
        }
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : mo2getContext.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        o57 o57Var = this.i;
                        o57Var.n = true;
                        this.h.postDelayed(new h(o57Var), 600L);
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            o57 o57Var = this.i;
            o57Var.m = false;
            if (i3 != -1) {
                yn(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            e57.b bVar = new e57.b(null, 1);
            if (o57Var.l) {
                o57Var.l = false;
                Executor executor = o57Var.b;
                if (executor == null) {
                    executor = new o57.b();
                }
                executor.execute(new z47(this, bVar));
            }
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        vyt0 vyt0Var = new vyt0(activity.getViewModelStore(), activity.getDefaultViewModelProviderFactory(), activity.getDefaultViewModelCreationExtras());
        rfc a2 = fpf0.a(o57.class);
        String h2 = a2.h();
        if (h2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        o57 o57Var = (o57) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h2), a2);
        this.i = o57Var;
        if (o57Var.p == null) {
            o57Var.p = new ug50<>();
        }
        o57Var.p.e(this, new s47(this));
        o57 o57Var2 = this.i;
        if (o57Var2.q == null) {
            o57Var2.q = new ug50<>();
        }
        o57Var2.q.e(this, new t47(this));
        o57 o57Var3 = this.i;
        if (o57Var3.r == null) {
            o57Var3.r = new ug50<>();
        }
        o57Var3.r.e(this, new u47(this));
        o57 o57Var4 = this.i;
        if (o57Var4.s == null) {
            o57Var4.s = new ug50<>();
        }
        o57Var4.s.e(this, new v47(this));
        o57 o57Var5 = this.i;
        if (o57Var5.t == null) {
            o57Var5.t = new ug50<>();
        }
        o57Var5.t.e(this, new w47(this, 0));
        o57 o57Var6 = this.i;
        if (o57Var6.v == null) {
            o57Var6.v = new ug50<>();
        }
        o57Var6.v.e(this, new x47(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && e75.a(this.i.i())) {
            o57 o57Var = this.i;
            o57Var.o = true;
            this.h.postDelayed(new i(o57Var), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.i.m) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            tn(0);
        }
    }

    public final void tn(int i2) {
        if (i2 == 3 || !this.i.o) {
            if (wn()) {
                this.i.j = i2;
                if (i2 == 1) {
                    zn(10, p490.m(10, mo2getContext()));
                }
            }
            o57 o57Var = this.i;
            if (o57Var.g == null) {
                o57Var.g = new uq9();
            }
            uq9 uq9Var = o57Var.g;
            CancellationSignal cancellationSignal = uq9Var.a;
            if (cancellationSignal != null) {
                try {
                    uq9.b.a(cancellationSignal);
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e2);
                }
                uq9Var.a = null;
            }
            rq9 rq9Var = uq9Var.b;
            if (rq9Var != null) {
                try {
                    rq9Var.a();
                } catch (NullPointerException e3) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e3);
                }
                uq9Var.b = null;
            }
        }
    }

    public final void un() {
        this.i.k = false;
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            ghr ghrVar = (ghr) parentFragmentManager.H("androidx.biometric.FingerprintDialogFragment");
            if (ghrVar != null) {
                if (ghrVar.isAdded()) {
                    ghrVar.tn();
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                aVar.q(ghrVar);
                aVar.k(true);
            }
        }
    }

    public final boolean vn() {
        return Build.VERSION.SDK_INT <= 28 && e75.a(this.i.i());
    }

    public final boolean wn() {
        int i2 = Build.VERSION.SDK_INT;
        FragmentActivity activity = getActivity();
        if (activity != null && this.i.e != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (i2 == 28) {
                if (str != null) {
                    for (String str3 : activity.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                        if (str.equalsIgnoreCase(str3)) {
                            break;
                        }
                    }
                }
                String str4 = Build.MODEL;
                if (str4 != null) {
                    for (String str5 : activity.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                        if (str4.startsWith(str5)) {
                            return true;
                        }
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Context mo2getContext = mo2getContext();
        return mo2getContext == null || mo2getContext.getPackageManager() == null || !c890.a(mo2getContext.getPackageManager());
    }

    public final void xn() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a2 = why.a(activity);
        if (a2 == null) {
            yn(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        e57.d dVar = this.i.d;
        CharSequence charSequence = dVar != null ? dVar.a : null;
        CharSequence charSequence2 = dVar != null ? dVar.b : null;
        CharSequence charSequence3 = dVar != null ? dVar.c : null;
        if (charSequence2 == null) {
            charSequence2 = charSequence3;
        }
        Intent a3 = b.a(a2, charSequence, charSequence2);
        if (a3 == null) {
            yn(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.i.m = true;
        if (wn()) {
            un();
        }
        a3.setFlags(134742016);
        startActivityForResult(a3, 1);
    }

    public final void yn(int i2, @NonNull CharSequence charSequence) {
        zn(i2, charSequence);
        dismiss();
    }

    public final void zn(int i2, @NonNull CharSequence charSequence) {
        o57 o57Var = this.i;
        if (!o57Var.m && o57Var.l) {
            o57Var.l = false;
            Executor executor = o57Var.b;
            if (executor == null) {
                executor = new o57.b();
            }
            executor.execute(new a(i2, charSequence));
        }
    }
}
