package xsna;

import com.vk.comments.impl.di.CommentsComponentImpl;
import com.vk.libvideo.impl.di.VideoAdvertisementsComponentImpl;
import com.vk.libvideo.impl.di.VideoApiHelperComponentImpl;
import com.vk.superapp.vkhealth.permissions.impl.di.VkHealthPermissionsComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import org.json.JSONObject;
import xsna.lbs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class wfl implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wfl(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object failure;
        JSONObject g;
        Object lbs0Var;
        switch (this.b) {
            case 0:
                return new yfl();
            case 1:
                return new t7n0();
            case 2:
                return Executors.newSingleThreadExecutor();
            case 3:
                return new mx3();
            case 4:
                lbs0.a aVar = lbs0.f;
                b.d i = com.vk.toggle.b.A.i(VideoFeatures.VIDEO_COLD_START_DELAY);
                aVar.getClass();
                if (i != null) {
                    try {
                        g = i.g();
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (g != null) {
                        lbs0Var = new lbs0(f370.p(g, "preload_forbidden", false), f370.p(g, "autoplay_after_show_images", false), f370.y(g, "max_images_waiting_ms", 0L), f370.z(g, "low_network_bandwidth_preload"), f370.z(g, "low_network_bandwidth_autoplay"));
                        failure = lbs0Var;
                        lbs0 lbs0Var2 = (lbs0) (failure instanceof Result.Failure ? null : failure);
                        return lbs0Var2 != null ? new lbs0(0) : lbs0Var2;
                    }
                }
                lbs0Var = null;
                failure = lbs0Var;
                lbs0 lbs0Var22 = (lbs0) (failure instanceof Result.Failure ? null : failure);
                if (lbs0Var22 != null) {
                }
            case 5:
                return new VideoAdvertisementsComponentImpl.a();
            case 6:
                return new CommentsComponentImpl.a();
            case 7:
                return new VideoApiHelperComponentImpl.a();
            case 8:
                return new AtomicBoolean(false);
            case 9:
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                return asu0.y() ? asu0.n() : asu0Var.b(5, 0L, "vk-slow-tasks-queue-thread");
            default:
                qcy<Object>[] qcyVarArr = VkHealthPermissionsComponentImpl.b;
                return new dyu0();
        }
    }
}
