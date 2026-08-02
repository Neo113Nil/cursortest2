package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;

/* loaded from: classes10.dex */
public abstract class kx5 {
    public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
