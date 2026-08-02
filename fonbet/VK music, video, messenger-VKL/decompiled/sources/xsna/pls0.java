package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import java.text.DecimalFormat;
import java.util.Locale;
import xsna.x8s;

/* compiled from: VideoFileUtils.kt */
/* loaded from: classes16.dex */
public final class pls0 {
    public static final long a(VideoFile videoFile) {
        return videoFile.b0() * 1000;
    }

    public static final String b(Context context, VideoFile videoFile) {
        String c;
        if (fxc0.B().J().j0()) {
            return d(context, videoFile);
        }
        DecimalFormat decimalFormat = z8s.a;
        c = z8s.c(context, a(videoFile), x8s.a.g, true);
        return c;
    }

    public static final String c(int i) {
        String i2 = pvo0.i(true, i, false, true);
        if (i2.length() <= 0) {
            return i2;
        }
        return ((Object) String.valueOf(i2.charAt(0)).toUpperCase(Locale.ROOT)) + i2.substring(1);
    }

    public static final String d(Context context, VideoFile videoFile) {
        String c;
        if (g(videoFile)) {
            return c((int) videoFile.Na());
        }
        if (videoFile.k1() > 0) {
            return c(videoFile.k1());
        }
        DecimalFormat decimalFormat = z8s.a;
        c = z8s.c(context, a(videoFile), x8s.a.g, true);
        return c.toString();
    }

    public static final int e(VideoFile videoFile) {
        boolean j0 = fxc0.B().J().j0();
        if (videoFile.z0() && videoFile.Na() > 0) {
            return (int) videoFile.Na();
        }
        if (!j0 || videoFile.k1() <= 0) {
            return 0;
        }
        return videoFile.k1();
    }

    public static final boolean f(VideoFile videoFile) {
        if (!videoFile.t0() || fxc0.B().c(videoFile)) {
            return false;
        }
        VideoRestriction O = videoFile.O();
        return (O == null || O.f) && !fxc0.B().b0().e(videoFile) && videoFile.k1() > 0;
    }

    public static final boolean g(VideoFile videoFile) {
        return videoFile.z0() && videoFile.Na() > 0;
    }
}
