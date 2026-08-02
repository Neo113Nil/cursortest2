package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import defpackage.abe;
import defpackage.ay5;
import defpackage.cng0;
import defpackage.cy5;
import defpackage.dy40;
import defpackage.fm3;
import defpackage.h9r;
import defpackage.iub1;
import defpackage.j9r;
import defpackage.jdj;
import defpackage.kx5;
import defpackage.ls31;
import defpackage.lx5;
import defpackage.md6;
import defpackage.mrj;
import defpackage.mx5;
import defpackage.nx5;
import defpackage.ox5;
import defpackage.oy5;
import defpackage.p1b1;
import defpackage.px5;
import defpackage.pxh0;
import defpackage.py5;
import defpackage.u18;
import defpackage.v18;
import defpackage.vaa1;
import defpackage.xz;
import defpackage.ykx;
import defpackage.zx5;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes10.dex */
public class BiometricFragment extends Fragment {
    static final int CANCELED_FROM_CLIENT = 3;
    static final int CANCELED_FROM_INTERNAL = 0;
    static final int CANCELED_FROM_NEGATIVE_BUTTON = 2;
    static final int CANCELED_FROM_USER = 1;
    private static final int DISMISS_INSTANTLY_DELAY_MS = 500;
    private static final String FINGERPRINT_DIALOG_FRAGMENT_TAG = "androidx.biometric.FingerprintDialogFragment";
    private static final int HIDE_DIALOG_DELAY_MS = 2000;
    private static final int REQUEST_CONFIRM_CREDENTIAL = 1;
    private static final int SHOW_PROMPT_DELAY_MS = 600;
    private static final String TAG = "BiometricFragment";
    Handler mHandler = new Handler(Looper.getMainLooper());
    BiometricViewModel mViewModel;

    private static int checkForFingerprintPreAuthenticationErrors(j9r j9rVar) {
        FingerprintManager b = h9r.b(j9rVar.a);
        if (b == null || !h9r.d(b)) {
            return 12;
        }
        FingerprintManager b2 = h9r.b(j9rVar.a);
        return (b2 == null || !h9r.c(b2)) ? 11 : 0;
    }

    private void connectViewModel() {
        if (getActivity() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ls31(getActivity()).b(BiometricViewModel.class);
        this.mViewModel = biometricViewModel;
        if (biometricViewModel.I == null) {
            biometricViewModel.I = new dy40();
        }
        biometricViewModel.I.f(this, new c(this, 0));
        BiometricViewModel biometricViewModel2 = this.mViewModel;
        if (biometricViewModel2.J == null) {
            biometricViewModel2.J = new dy40();
        }
        biometricViewModel2.J.f(this, new c(this, 1));
        BiometricViewModel biometricViewModel3 = this.mViewModel;
        if (biometricViewModel3.K == null) {
            biometricViewModel3.K = new dy40();
        }
        biometricViewModel3.K.f(this, new c(this, 2));
        BiometricViewModel biometricViewModel4 = this.mViewModel;
        if (biometricViewModel4.L == null) {
            biometricViewModel4.L = new dy40();
        }
        biometricViewModel4.L.f(this, new c(this, 3));
        BiometricViewModel biometricViewModel5 = this.mViewModel;
        if (biometricViewModel5.M == null) {
            biometricViewModel5.M = new dy40();
        }
        biometricViewModel5.M.f(this, new c(this, 4));
        BiometricViewModel biometricViewModel6 = this.mViewModel;
        if (biometricViewModel6.O == null) {
            biometricViewModel6.O = new dy40();
        }
        biometricViewModel6.O.f(this, new c(this, 5));
    }

    private void dismissFingerprintDialog() {
        this.mViewModel.D = false;
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.F(FINGERPRINT_DIALOG_FRAGMENT_TAG);
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                aVar.p(fingerprintDialogFragment);
                aVar.l(true, true);
            }
        }
    }

    private int getDismissDialogDelay() {
        if (getContext() == null) {
            return HIDE_DIALOG_DELAY_MS;
        }
        String str = Build.MODEL;
        return HIDE_DIALOG_DELAY_MS;
    }

    private void handleConfirmCredentialResult(int i) {
        if (i == -1) {
            sendSuccessAndDismiss(new zx5(null, 1));
        } else {
            sendErrorAndDismiss(10, getString(pxh0.generic_error_user_canceled));
        }
    }

    private boolean isChangingConfigurations() {
        FragmentActivity activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    private boolean isFingerprintDialogNeededForCrypto() {
        if (getActivity() == null || this.mViewModel.x == null) {
            return false;
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return false;
    }

    private boolean isFingerprintDialogNeededForErrorHandling() {
        return false;
    }

    private boolean isUsingFingerprintDialog() {
        return isFingerprintDialogNeededForCrypto() || isFingerprintDialogNeededForErrorHandling();
    }

    private void launchConfirmCredentialActivity() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e(TAG, "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a = ykx.a(activity);
        if (a == null) {
            sendErrorAndDismiss(12, getString(pxh0.generic_error_no_keyguard));
            return;
        }
        cy5 cy5Var = this.mViewModel.w;
        Intent a2 = kx5.a(a, cy5Var != null ? cy5Var.a : null, null);
        if (a2 == null) {
            sendErrorAndDismiss(14, getString(pxh0.generic_error_no_device_credential));
            return;
        }
        this.mViewModel.F = true;
        if (isUsingFingerprintDialog()) {
            dismissFingerprintDialog();
        }
        a2.setFlags(134742016);
        startActivityForResult(a2, 1);
    }

    public static BiometricFragment newInstance() {
        return new BiometricFragment();
    }

    private void sendErrorToClient(int i, CharSequence charSequence) {
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (!biometricViewModel.F && biometricViewModel.E) {
            biometricViewModel.E = false;
            Executor executor = biometricViewModel.b;
            if (executor == null) {
                executor = new py5();
            }
            executor.execute(new a(this, i, charSequence));
        }
    }

    private void sendFailureToClient() {
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (biometricViewModel.E) {
            Executor executor = biometricViewModel.b;
            if (executor == null) {
                executor = new py5();
            }
            executor.execute(new b(this, 0));
        }
    }

    private void sendSuccessAndDismiss(zx5 zx5Var) {
        sendSuccessToClient(zx5Var);
        dismiss();
    }

    private void sendSuccessToClient(zx5 zx5Var) {
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (biometricViewModel.E) {
            biometricViewModel.E = false;
            Executor executor = biometricViewModel.b;
            if (executor == null) {
                executor = new py5();
            }
            executor.execute(new d(this, zx5Var));
        }
    }

    private void showBiometricPromptForAuthentication() {
        BiometricPrompt.Builder d = lx5.d(requireContext().getApplicationContext());
        cy5 cy5Var = this.mViewModel.w;
        CharSequence charSequence = null;
        CharSequence charSequence2 = cy5Var != null ? cy5Var.a : null;
        if (charSequence2 != null) {
            lx5.f(d, charSequence2);
        }
        BiometricViewModel biometricViewModel = this.mViewModel;
        String str = biometricViewModel.B;
        if (str != null) {
            charSequence = str;
        } else {
            cy5 cy5Var2 = biometricViewModel.w;
            if (cy5Var2 != null && (charSequence = cy5Var2.b) == null) {
                charSequence = "";
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Executor executor = this.mViewModel.b;
            if (executor == null) {
                executor = new py5();
            }
            BiometricViewModel biometricViewModel2 = this.mViewModel;
            if (biometricViewModel2.A == null) {
                biometricViewModel2.A = new BiometricViewModel.NegativeButtonListener(biometricViewModel2);
            }
            lx5.e(d, charSequence, executor, biometricViewModel2.A);
        }
        cy5 cy5Var3 = this.mViewModel.w;
        int i = 0;
        mx5.a(d, cy5Var3 == null || cy5Var3.c);
        BiometricViewModel biometricViewModel3 = this.mViewModel;
        cy5 cy5Var4 = biometricViewModel3.w;
        if (cy5Var4 != null) {
            ay5 ay5Var = biometricViewModel3.x;
            i = cy5Var4.d;
            if (i == 0) {
                i = ay5Var != null ? 15 : 255;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            nx5.a(d, i);
        } else {
            mx5.b(d, p1b1.d(i));
        }
        authenticateWithBiometricPrompt(lx5.c(d), getContext());
    }

    private void showFingerprintDialogForAuthentication() {
        Context applicationContext = requireContext().getApplicationContext();
        j9r j9rVar = new j9r(applicationContext);
        int checkForFingerprintPreAuthenticationErrors = checkForFingerprintPreAuthenticationErrors(j9rVar);
        if (checkForFingerprintPreAuthenticationErrors != 0) {
            sendErrorAndDismiss(checkForFingerprintPreAuthenticationErrors, vaa1.d(checkForFingerprintPreAuthenticationErrors, applicationContext));
            return;
        }
        if (isAdded()) {
            this.mViewModel.N = true;
            String str = Build.MODEL;
            this.mHandler.postDelayed(new b(this, 1), 500L);
            FingerprintDialogFragment.newInstance().show(getParentFragmentManager(), FINGERPRINT_DIALOG_FRAGMENT_TAG);
            this.mViewModel.C = 0;
            authenticateWithFingerprint(j9rVar, applicationContext);
        }
    }

    private void showFingerprintErrorMessage(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(pxh0.default_error_msg);
        }
        this.mViewModel.Y(2);
        this.mViewModel.X(charSequence);
    }

    public void authenticate(cy5 cy5Var, ay5 ay5Var) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e(TAG, "Not launching prompt. Client activity was null.");
            return;
        }
        BiometricViewModel biometricViewModel = this.mViewModel;
        biometricViewModel.w = cy5Var;
        int i = cy5Var.d;
        if (i == 0) {
            i = ay5Var != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i == 15 && ay5Var == null) {
            biometricViewModel.x = iub1.f();
        } else {
            biometricViewModel.x = ay5Var;
        }
        boolean isManagingDeviceCredentialButton = isManagingDeviceCredentialButton();
        BiometricViewModel biometricViewModel2 = this.mViewModel;
        if (isManagingDeviceCredentialButton) {
            biometricViewModel2.B = getString(pxh0.confirm_device_credential_password);
        } else {
            biometricViewModel2.B = null;
        }
        if (isManagingDeviceCredentialButton() && new mrj(new abe(activity, 2)).g(255) != 0) {
            this.mViewModel.E = true;
            launchConfirmCredentialActivity();
        } else if (this.mViewModel.G) {
            this.mHandler.postDelayed(new px5(this), 600L);
        } else {
            showPromptForAuthentication();
        }
    }

    public void authenticateWithBiometricPrompt(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject g = iub1.g(this.mViewModel.x);
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (biometricViewModel.z == null) {
            biometricViewModel.z = new md6();
        }
        md6 md6Var = biometricViewModel.z;
        if (((CancellationSignal) md6Var.b) == null) {
            md6Var.b = v18.b();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) md6Var.b;
        ox5 ox5Var = new ox5();
        BiometricViewModel biometricViewModel2 = this.mViewModel;
        if (biometricViewModel2.y == null) {
            biometricViewModel2.y = new mrj(new oy5(biometricViewModel2));
        }
        mrj mrjVar = biometricViewModel2.y;
        if (((BiometricPrompt.AuthenticationCallback) mrjVar.b) == null) {
            mrjVar.b = AuthenticationCallbackProvider$Api28Impl.a((oy5) mrjVar.w);
        }
        BiometricPrompt.AuthenticationCallback authenticationCallback = (BiometricPrompt.AuthenticationCallback) mrjVar.b;
        try {
            if (g == null) {
                lx5.b(biometricPrompt, cancellationSignal, ox5Var, authenticationCallback);
            } else {
                lx5.a(biometricPrompt, g, cancellationSignal, ox5Var, authenticationCallback);
            }
        } catch (NullPointerException e) {
            Log.e(TAG, "Got NPE while authenticating with biometric prompt.", e);
            sendErrorAndDismiss(1, context != null ? context.getString(pxh0.default_error_msg) : "");
        }
    }

    public void authenticateWithFingerprint(j9r j9rVar, Context context) {
        ay5 ay5Var = this.mViewModel.x;
        jdj jdjVar = null;
        if (ay5Var != null) {
            Cipher cipher = ay5Var.b;
            if (cipher != null) {
                jdjVar = new jdj(cipher);
            } else {
                Signature signature = ay5Var.a;
                if (signature != null) {
                    jdjVar = new jdj(signature);
                } else {
                    Mac mac = ay5Var.c;
                    if (mac != null) {
                        jdjVar = new jdj(mac);
                    } else if (Build.VERSION.SDK_INT >= 30 && ay5Var.d != null) {
                        Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                    }
                }
            }
        }
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (biometricViewModel.z == null) {
            biometricViewModel.z = new md6();
        }
        md6 md6Var = biometricViewModel.z;
        if (((u18) md6Var.c) == null) {
            md6Var.c = new u18();
        }
        u18 u18Var = (u18) md6Var.c;
        BiometricViewModel biometricViewModel2 = this.mViewModel;
        if (biometricViewModel2.y == null) {
            biometricViewModel2.y = new mrj(new oy5(biometricViewModel2));
        }
        mrj mrjVar = biometricViewModel2.y;
        if (((fm3) mrjVar.c) == null) {
            mrjVar.c = new fm3();
        }
        try {
            j9rVar.a(jdjVar, u18Var);
        } catch (NullPointerException e) {
            Log.e(TAG, "Got NPE while authenticating with fingerprint.", e);
            sendErrorAndDismiss(1, vaa1.d(1, context));
        }
    }

    public void cancelAuthentication(int i) {
        if (i == 3 || !this.mViewModel.H) {
            if (isUsingFingerprintDialog()) {
                this.mViewModel.C = i;
                if (i == 1) {
                    sendErrorToClient(10, vaa1.d(10, getContext()));
                }
            }
            BiometricViewModel biometricViewModel = this.mViewModel;
            if (biometricViewModel.z == null) {
                biometricViewModel.z = new md6();
            }
            md6 md6Var = biometricViewModel.z;
            CancellationSignal cancellationSignal = (CancellationSignal) md6Var.b;
            if (cancellationSignal != null) {
                try {
                    v18.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                md6Var.b = null;
            }
            u18 u18Var = (u18) md6Var.c;
            if (u18Var != null) {
                try {
                    u18Var.a();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                md6Var.c = null;
            }
        }
    }

    public void dismiss() {
        this.mViewModel.D = false;
        dismissFingerprintDialog();
        if (!this.mViewModel.F && isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.p(this);
            aVar.l(true, true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29) {
                return;
            }
            int i = cng0.delay_showing_prompt_models;
            if (str == null) {
                return;
            }
            for (String str2 : context.getResources().getStringArray(i)) {
                if (str.equals(str2)) {
                    BiometricViewModel biometricViewModel = this.mViewModel;
                    biometricViewModel.G = true;
                    this.mHandler.postDelayed(new px5(biometricViewModel, 1), 600L);
                    return;
                }
            }
        }
    }

    public boolean isManagingDeviceCredentialButton() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.mViewModel.F = false;
            handleConfirmCredentialResult(i2);
        }
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 6:
            default:
                i = 8;
                break;
        }
        getContext();
        if (!isUsingFingerprintDialog()) {
            if (charSequence == null) {
                charSequence = getString(pxh0.default_error_msg) + " " + i;
            }
            sendErrorAndDismiss(i, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = vaa1.d(i, getContext());
        }
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (i == 5) {
            int i2 = biometricViewModel.C;
            if (i2 == 0 || i2 == 3) {
                sendErrorToClient(i, charSequence);
            }
            dismiss();
            return;
        }
        if (biometricViewModel.N) {
            sendErrorAndDismiss(i, charSequence);
        } else {
            showFingerprintErrorMessage(charSequence);
            this.mHandler.postDelayed(new xz(this, i, charSequence, 2), getDismissDialogDelay());
        }
        this.mViewModel.N = true;
    }

    public void onAuthenticationFailed() {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(getString(pxh0.fingerprint_not_recognized));
        }
        sendFailureToClient();
    }

    public void onAuthenticationHelp(CharSequence charSequence) {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(charSequence);
        }
    }

    public void onAuthenticationSucceeded(zx5 zx5Var) {
        sendSuccessAndDismiss(zx5Var);
    }

    public void onCancelButtonPressed() {
        BiometricViewModel biometricViewModel = this.mViewModel;
        CharSequence charSequence = biometricViewModel.B;
        if (charSequence == null) {
            cy5 cy5Var = biometricViewModel.w;
            if (cy5Var != null) {
                charSequence = cy5Var.b;
                if (charSequence == null) {
                    charSequence = "";
                }
            } else {
                charSequence = null;
            }
        }
        if (charSequence == null) {
            charSequence = getString(pxh0.default_error_msg);
        }
        sendErrorAndDismiss(13, charSequence);
        cancelAuthentication(2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        connectViewModel();
    }

    public void onDeviceCredentialButtonPressed() {
        launchConfirmCredentialActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int i;
        super.onStart();
        if (Build.VERSION.SDK_INT == 29) {
            BiometricViewModel biometricViewModel = this.mViewModel;
            cy5 cy5Var = biometricViewModel.w;
            if (cy5Var != null) {
                ay5 ay5Var = biometricViewModel.x;
                i = cy5Var.d;
                if (i == 0) {
                    i = ay5Var != null ? 15 : 255;
                }
            } else {
                i = 0;
            }
            if (p1b1.d(i)) {
                BiometricViewModel biometricViewModel2 = this.mViewModel;
                biometricViewModel2.H = true;
                this.mHandler.postDelayed(new px5(biometricViewModel2, 2), 250L);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    public void sendErrorAndDismiss(int i, CharSequence charSequence) {
        sendErrorToClient(i, charSequence);
        dismiss();
    }

    public void showPromptForAuthentication() {
        if (this.mViewModel.D || getContext() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = this.mViewModel;
        biometricViewModel.D = true;
        biometricViewModel.E = true;
        if (isUsingFingerprintDialog()) {
            showFingerprintDialogForAuthentication();
        } else {
            showBiometricPromptForAuthentication();
        }
    }
}
