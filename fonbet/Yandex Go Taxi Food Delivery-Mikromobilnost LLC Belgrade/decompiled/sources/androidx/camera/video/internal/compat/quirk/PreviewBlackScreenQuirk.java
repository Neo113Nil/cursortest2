package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import com.adjust.sdk.Constants;
import defpackage.cvu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "<init>", "()V", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {
    public static final boolean a;
    public static final boolean b;

    static {
        String str = Build.BRAND;
        a = cvu0.t(str, "motorola", true) && cvu0.t(Build.MODEL, "motorola edge 20 fusion", true);
        b = cvu0.t(str, Constants.REFERRER_API_SAMSUNG, true) && cvu0.t(Build.MODEL, "sm-t580", true);
    }
}
