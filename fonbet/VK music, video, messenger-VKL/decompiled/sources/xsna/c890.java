package xsna;

import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* compiled from: PackageUtils.java */
/* loaded from: classes11.dex */
public final class c890 {
    public static boolean a(@NonNull PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
