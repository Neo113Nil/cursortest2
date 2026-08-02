package xsna;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.e57;
import xsna.o57;
import xsna.ujk;

/* compiled from: AuthenticationCallbackProvider.java */
/* loaded from: classes11.dex */
public final class y65 {

    @Nullable
    public BiometricPrompt.AuthenticationCallback a;

    @NonNull
    public final o57.a b;

    /* compiled from: AuthenticationCallbackProvider.java */
    public static class b {
        public static int a(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* compiled from: AuthenticationCallbackProvider.java */
    public static class c {
    }

    public y65(@NonNull o57.a aVar) {
        this.b = aVar;
    }

    /* compiled from: AuthenticationCallbackProvider.java */
    public static class a {
        @NonNull
        public static BiometricPrompt.AuthenticationCallback a(@NonNull c cVar) {
            return new C4078a(cVar);
        }

        /* compiled from: AuthenticationCallbackProvider.java */
        /* renamed from: xsna.y65$a$a, reason: collision with other inner class name */
        public class C4078a extends BiometricPrompt.AuthenticationCallback {
            public final /* synthetic */ c a;

            public C4078a(c cVar) {
                this.a = cVar;
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                WeakReference<o57> weakReference = ((o57.a) this.a).a;
                if (weakReference.get() == null || weakReference.get().m || !weakReference.get().l) {
                    return;
                }
                weakReference.get().j(new p47(i, charSequence));
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                WeakReference<o57> weakReference = ((o57.a) this.a).a;
                if (weakReference.get() == null || !weakReference.get().l) {
                    return;
                }
                o57 o57Var = weakReference.get();
                if (o57Var.s == null) {
                    o57Var.s = new ug50<>();
                }
                o57.n(o57Var.s, Boolean.TRUE);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                int i;
                BiometricPrompt.CryptoObject cryptoObject;
                IdentityCredential b;
                e57.c cVar = null;
                if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
                    Cipher d = ujk.b.d(cryptoObject);
                    if (d != null) {
                        cVar = new e57.c(d);
                    } else {
                        Signature f = ujk.b.f(cryptoObject);
                        if (f != null) {
                            cVar = new e57.c(f);
                        } else {
                            Mac e = ujk.b.e(cryptoObject);
                            if (e != null) {
                                cVar = new e57.c(e);
                            } else if (Build.VERSION.SDK_INT >= 30 && (b = ujk.c.b(cryptoObject)) != null) {
                                cVar = new e57.c(b);
                            }
                        }
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    if (authenticationResult != null) {
                        i = b.a(authenticationResult);
                    }
                    i = -1;
                } else {
                    if (i2 != 29) {
                        i = 2;
                    }
                    i = -1;
                }
                e57.b bVar = new e57.b(cVar, i);
                WeakReference<o57> weakReference = ((o57.a) this.a).a;
                if (weakReference.get() == null || !weakReference.get().l) {
                    return;
                }
                if (i == -1) {
                    int i3 = weakReference.get().i();
                    bVar = new e57.b(cVar, ((i3 & OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND) == 0 || e75.a(i3)) ? -1 : 2);
                }
                o57 o57Var = weakReference.get();
                if (o57Var.p == null) {
                    o57Var.p = new ug50<>();
                }
                o57.n(o57Var.p, bVar);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }
        }
    }
}
