package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.CamcorderProfile;
import android.util.Size;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.vk.media.MediaUtils;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: CameraUtils.java */
/* loaded from: classes.dex */
public final class io9 {
    public static final String[] a = {"Nexus 6", "Swift 2 X", "MI 5s"};
    public static final String[] b = {"Nexus 5X"};
    public static a c;

    /* compiled from: CameraUtils.java */
    public static class a {
        public WeakReference<Context> a;
    }

    /* compiled from: CameraUtils.java */
    /* loaded from: classes3.dex */
    public interface b {
    }

    /* compiled from: CameraUtils.java */
    /* loaded from: classes3.dex */
    public interface c {
        void c(Bitmap bitmap, byte[] bArr);
    }

    /* compiled from: CameraUtils.java */
    /* loaded from: classes3.dex */
    public static class d {
        public final int a;
        public final MediaUtils.e b = new MediaUtils.e(CoverVideoUploadTask.y, PublisherConfiguration.DEFAULT_MAX_RES, 4000000, 30, 156000, 44100);

        public d(int i, int i2) {
            this.a = i * i2;
        }

        public static void a(CamcorderProfile camcorderProfile) {
            if (camcorderProfile == null) {
                return;
            }
            Iterator<MediaUtils.g> it = MediaUtils.c.a.iterator();
            while (it.hasNext()) {
                MediaUtils.g next = it.next();
                if (next.b * next.a >= camcorderProfile.videoFrameWidth * camcorderProfile.videoFrameHeight) {
                    camcorderProfile.videoBitRate = next.c;
                    return;
                }
            }
        }

        public static MediaUtils.e d(CamcorderProfile camcorderProfile) {
            return new MediaUtils.e(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate);
        }

        public final MediaUtils.e b(int i) {
            int i2;
            CamcorderProfile camcorderProfile = (!CamcorderProfile.hasProfile(i, 5) || (i2 = this.a) <= 0 || i2 < 921600) ? CamcorderProfile.hasProfile(i, 4) ? CamcorderProfile.get(i, 4) : CamcorderProfile.hasProfile(i, 7) ? CamcorderProfile.get(i, 7) : null : CamcorderProfile.get(i, 5);
            a(camcorderProfile);
            return camcorderProfile != null ? d(camcorderProfile) : c(i);
        }

        public final MediaUtils.e c(int i) {
            CamcorderProfile camcorderProfile;
            if (CamcorderProfile.hasProfile(i, 4)) {
                camcorderProfile = CamcorderProfile.get(i, 4);
            } else if (CamcorderProfile.hasProfile(i, 0)) {
                camcorderProfile = CamcorderProfile.get(i, 0);
            } else {
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(lhg.a(i, "Missing configs at CamcorderProfile: ")));
                camcorderProfile = null;
            }
            a(camcorderProfile);
            return camcorderProfile != null ? d(camcorderProfile) : this.b;
        }
    }

    public static int a() {
        int d2 = d();
        if (d2 == 1) {
            return 90;
        }
        if (d2 == 2) {
            return 180;
        }
        if (d2 != 3) {
            return 0;
        }
        return atv0.b;
    }

    public static long b(@NonNull sj9 sj9Var) {
        Size[] a2 = sj9Var.a();
        long j = -1;
        if (a2 == null) {
            return -1L;
        }
        for (Size size : a2) {
            j = Math.max(j, size.getHeight() * size.getWidth());
        }
        return j;
    }

    public static MediaUtils.d c(@NonNull MediaUtils.e eVar, boolean z) {
        int min = Math.min(eVar.c(), eVar.a());
        int max = Math.max(eVar.c(), eVar.a());
        return z ? new MediaUtils.d(min, max) : new MediaUtils.d(max, min);
    }

    public static int d() {
        WindowManager windowManager = (WindowManager) c.a.get().getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static boolean e(MediaUtils.e eVar, MediaUtils.e eVar2) {
        return eVar != null && eVar.c() == eVar2.c() && eVar.a() == eVar2.a();
    }

    public static void f(Context context) {
        if (c == null) {
            a aVar = new a();
            aVar.a = new WeakReference<>(context);
            c = aVar;
        }
    }
}
