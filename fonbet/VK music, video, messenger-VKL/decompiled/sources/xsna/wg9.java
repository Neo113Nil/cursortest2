package xsna;

import android.app.Application;
import android.hardware.SensorManager;
import android.os.Build;
import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import java.util.Locale;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class wg9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wg9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                CameraClipsComponentBase cameraClipsComponentBase = (CameraClipsComponentBase) this.c;
                nwy nwyVar = cameraClipsComponentBase.b;
                qcy<Object> qcyVar = CameraClipsComponentBase.i[1];
                return new thd((oid) nwyVar.c(), cameraClipsComponentBase.c4(), cameraClipsComponentBase.X9());
            case 1:
                return ((k1q) this.c).a().compileStatement("SELECT event_name FROM events WHERE event_name=? AND user_id=?");
            case 2:
                axw axwVar = (axw) this.c;
                boolean z = pmr0.a;
                Application application = axwVar.b;
                if (pmr0.a(application)) {
                    r1 = (e43.l("redmi", "xiaomi", "poco", "pocophone").contains(Build.BRAND.toLowerCase(Locale.ROOT)) && Build.VERSION.SDK_INT == 34) ? false : true;
                    if (k0x.c(application) && r1) {
                        return new xwu0(application);
                    }
                }
                return null;
            case 3:
                return (SensorManager) ((h9e0) this.c).a.getSystemService("sensor");
            case 4:
                vx70.b bVar = (vx70.b) ((gzs) this.c).invoke();
                return new rsj0(bVar, new yei0(bVar, 5));
            case 5:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                vKApplication.getClass();
                lyd.a = new mpf();
                return s3q0.a;
            default:
                if (((qks0) this.c).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_PLAY_WITH_FINGER;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        r1 = true;
                    }
                }
                return Boolean.valueOf(r1);
        }
    }
}
