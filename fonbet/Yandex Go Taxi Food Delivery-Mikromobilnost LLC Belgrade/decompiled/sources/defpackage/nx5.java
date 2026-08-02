package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: classes10.dex */
public abstract class nx5 {
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }
}
