package xsna;

import android.view.View;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.storycamera.builder.StoryCameraParams;
import java.util.Set;

/* compiled from: CameraUIPositions.kt */
/* loaded from: classes16.dex */
public interface fm9 {
    public static final a a = a.a;

    /* compiled from: CameraUIPositions.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Set<StoryCameraMode> b;
        public static final Set<StoryCameraMode> c;
        public static final Set<StoryCameraMode> d;
        public static final Set<StoryCameraMode> e;

        static {
            StoryCameraMode storyCameraMode = StoryCameraMode.STORY;
            StoryCameraMode storyCameraMode2 = StoryCameraMode.STORY_VIDEO;
            StoryCameraMode storyCameraMode3 = StoryCameraMode.LIVE;
            StoryCameraMode storyCameraMode4 = StoryCameraMode.PING_PONG;
            StoryCameraMode storyCameraMode5 = StoryCameraMode.CLIPS;
            b = rl3.y0(new StoryCameraMode[]{storyCameraMode, storyCameraMode2, storyCameraMode3, storyCameraMode4, storyCameraMode5});
            StoryCameraMode storyCameraMode6 = StoryCameraMode.PHOTO;
            StoryCameraMode storyCameraMode7 = StoryCameraMode.VIDEO;
            c = rl3.y0(new StoryCameraMode[]{storyCameraMode6, storyCameraMode7, storyCameraMode3, StoryCameraMode.QR_SCANNER, StoryCameraMode.VMOJI_CAPTURE});
            d = rl3.y0(new StoryCameraMode[]{storyCameraMode2, storyCameraMode7, storyCameraMode5});
            e = rl3.y0(new StoryCameraMode[]{storyCameraMode2, storyCameraMode7, storyCameraMode5});
        }
    }

    void a();

    void b();

    void c();

    void d();

    p5p e();

    pe8 f();

    void g(View view);

    an9 getState();

    void h(p5p p5pVar);

    void i(StoryCameraParams storyCameraParams);

    void j(View view);

    void k(g8p0 g8p0Var);

    void setBroadcast(pe8 pe8Var);

    StoryCameraParams x();
}
