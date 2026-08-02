package xsna;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: KeyguardUtils.java */
/* loaded from: classes11.dex */
public final class why {
    @Nullable
    public static KeyguardManager a(@NonNull Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(@NonNull KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
