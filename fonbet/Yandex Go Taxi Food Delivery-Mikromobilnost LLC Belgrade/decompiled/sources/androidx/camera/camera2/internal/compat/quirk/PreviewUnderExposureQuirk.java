package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.cvu0;
import defpackage.glg0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/internal/compat/quirk/PreviewUnderExposureQuirk;", "Lglg0;", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PreviewUnderExposureQuirk implements glg0 {
    public static final PreviewUnderExposureQuirk a = new PreviewUnderExposureQuirk();
    public static final boolean b = cvu0.t(Build.BRAND, "TCL", true);
}
