package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import defpackage.ar7;
import defpackage.kgg0;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes10.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    public static boolean e() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean h() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean c() {
        return e() || f() || g() || h();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean d(ar7 ar7Var, kgg0 kgg0Var) {
        if (e() || f()) {
            if (kgg0Var != kgg0.d) {
                return false;
            }
        } else if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            if (kgg0Var != kgg0.b && kgg0Var != kgg0.c) {
                return false;
            }
        } else if (g()) {
            if (ar7Var.d() != 0) {
                return false;
            }
            if (kgg0Var != kgg0.c && kgg0Var != kgg0.b) {
                return false;
            }
        } else if (!h() || ar7Var.d() != 1 || kgg0Var != kgg0.d) {
            return false;
        }
        return true;
    }
}
