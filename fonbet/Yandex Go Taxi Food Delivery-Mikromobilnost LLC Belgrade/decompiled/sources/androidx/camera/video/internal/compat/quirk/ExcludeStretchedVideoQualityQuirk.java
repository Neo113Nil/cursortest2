package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.ar7;
import defpackage.kgg0;

/* loaded from: classes10.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean d(ar7 ar7Var, kgg0 kgg0Var) {
        String str = Build.BRAND;
        if ("Samsung".equalsIgnoreCase(str) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) {
            if (kgg0Var == kgg0.c || kgg0Var == kgg0.d) {
                return true;
            }
        } else if ((("Samsung".equalsIgnoreCase(str) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-G610M".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str) && "SM-J710MN".equalsIgnoreCase(Build.MODEL))))))) && kgg0Var == kgg0.c) {
            return true;
        }
        return false;
    }
}
