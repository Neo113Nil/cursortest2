package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import defpackage.ay5;
import defpackage.cy5;
import defpackage.dy40;
import defpackage.gm3;
import defpackage.gx5;
import defpackage.hm3;
import defpackage.oy5;
import defpackage.p1b1;
import defpackage.wcf;
import defpackage.xcf;
import defpackage.zx5;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes10.dex */
public abstract class AuthenticationCallbackProvider$Api28Impl {
    public static BiometricPrompt.AuthenticationCallback a(final hm3 hm3Var) {
        return new BiometricPrompt.AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider$Api28Impl.1
            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                WeakReference weakReference = ((oy5) hm3.this).a;
                if (weakReference.get() == null || ((BiometricViewModel) weakReference.get()).F || !((BiometricViewModel) weakReference.get()).E) {
                    return;
                }
                ((BiometricViewModel) weakReference.get()).W(new gx5(i, charSequence));
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                WeakReference weakReference = ((oy5) hm3.this).a;
                if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).E) {
                    return;
                }
                BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
                if (biometricViewModel.L == null) {
                    biometricViewModel.L = new dy40();
                }
                BiometricViewModel.a0(biometricViewModel.L, Boolean.TRUE);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                int i;
                int i2;
                BiometricPrompt.CryptoObject cryptoObject;
                IdentityCredential b;
                ay5 ay5Var = null;
                if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
                    Cipher d = wcf.d(cryptoObject);
                    if (d != null) {
                        ay5Var = new ay5(d);
                    } else {
                        Signature f = wcf.f(cryptoObject);
                        if (f != null) {
                            ay5Var = new ay5(f);
                        } else {
                            Mac e = wcf.e(cryptoObject);
                            if (e != null) {
                                ay5Var = new ay5(e);
                            } else if (Build.VERSION.SDK_INT >= 30 && (b = xcf.b(cryptoObject)) != null) {
                                ay5Var = new ay5(b);
                            }
                        }
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    if (authenticationResult != null) {
                        i = gm3.a(authenticationResult);
                    }
                    i = -1;
                } else {
                    if (i3 != 29) {
                        i = 2;
                    }
                    i = -1;
                }
                zx5 zx5Var = new zx5(ay5Var, i);
                WeakReference weakReference = ((oy5) hm3.this).a;
                if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).E) {
                    return;
                }
                if (i == -1) {
                    BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
                    cy5 cy5Var = biometricViewModel.w;
                    if (cy5Var != null) {
                        ay5 ay5Var2 = biometricViewModel.x;
                        i2 = cy5Var.d;
                        if (i2 == 0) {
                            i2 = ay5Var2 != null ? 15 : 255;
                        }
                    } else {
                        i2 = 0;
                    }
                    zx5Var = new zx5(ay5Var, ((i2 & 32767) == 0 || p1b1.d(i2)) ? -1 : 2);
                }
                BiometricViewModel biometricViewModel2 = (BiometricViewModel) weakReference.get();
                if (biometricViewModel2.I == null) {
                    biometricViewModel2.I = new dy40();
                }
                BiometricViewModel.a0(biometricViewModel2.I, zx5Var);
            }
        };
    }
}
