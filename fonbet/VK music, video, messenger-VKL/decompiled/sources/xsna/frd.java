package xsna;

import com.vk.toggle.features.VideoFeatures;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ClipsDiskCacheStorage.kt */
/* loaded from: classes.dex */
public final class frd {
    public static final io.reactivex.rxjava3.subjects.e a = new io.reactivex.rxjava3.subjects.e();
    public static final z0d0 b;
    public static final AtomicBoolean c;
    public static final wqd d;

    static {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIPS_NEW_DISK_CACHE;
        videoFeatures.getClass();
        b = com.vk.toggle.b.A.a(videoFeatures) ? new z0d0(0) : null;
        c = new AtomicBoolean(false);
        wqd b2 = com.vk.toggle.d.g0.b();
        if (b2 == null) {
            wqd.d.getClass();
            b2 = wqd.e;
        }
        d = b2;
    }

    public static boolean a() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIPS_NEW_DISK_CACHE;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures) && b != null;
    }
}
