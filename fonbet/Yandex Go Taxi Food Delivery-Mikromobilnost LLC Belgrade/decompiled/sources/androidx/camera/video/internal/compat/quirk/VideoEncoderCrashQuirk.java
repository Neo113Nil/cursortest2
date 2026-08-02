package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.ar7;
import defpackage.kgg0;

/* loaded from: classes10.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean d(ar7 ar7Var, kgg0 kgg0Var) {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL) && ar7Var.d() == 0 && kgg0Var == kgg0.a;
    }
}
