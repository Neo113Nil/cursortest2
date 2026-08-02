package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import com.adjust.sdk.Constants;
import defpackage.cvu0;
import defpackage.glg0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewFreezeAfterHighSpeedRecordingQuirk;", "Lglg0;", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements glg0 {
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk a = new PreviewFreezeAfterHighSpeedRecordingQuirk();
    public static final boolean b;

    static {
        b = cvu0.t(Build.BRAND, Constants.REFERRER_API_GOOGLE, true) && cvu0.x(Build.MODEL, "Pixel", true);
    }
}
