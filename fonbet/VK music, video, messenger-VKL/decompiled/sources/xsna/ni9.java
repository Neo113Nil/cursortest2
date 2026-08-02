package xsna;

import android.os.Build;
import com.vk.camera.CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.toggle.Features;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: CameraExperiments.kt */
/* loaded from: classes13.dex */
public final class ni9 {
    public static final bpn0 a = new bpn0(new xu0(5));
    public static final File b;

    static {
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.MEDIA;
        b = privateFiles.b(privateSubdir, privateSubdir.h(), false).a;
    }

    public static boolean a() {
        int i;
        double d;
        int i2 = mi9.$EnumSwitchMapping$0[CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType.DUETS_SPEED.ordinal()];
        int i3 = 8;
        if (i2 == 1) {
            i = 26;
            d = 2180.0d;
        } else if (i2 == 2) {
            i = 24;
            i3 = 4;
            d = 1900.0d;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 29;
            d = 1700.0d;
        }
        if (i > Build.VERSION.SDK_INT) {
            return false;
        }
        b4k b4kVar = b4k.e;
        if (i3 > b4kVar.a) {
            return false;
        }
        double d2 = b4kVar.d;
        return (d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d <= d2) && b4kVar.b;
    }

    public static boolean b() {
        Features.Type type = Features.Type.FEATURE_VIDEO_LIVE_NEW_PUBLISHER;
        type.getClass();
        return com.vk.toggle.b.A.a(type);
    }
}
