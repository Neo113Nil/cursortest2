package xsna;

import android.content.Context;
import com.vk.camera.sdk.impl.CameraException;
import com.vk.log.L;

/* compiled from: CameraMngWrp.kt */
/* loaded from: classes13.dex */
public final class ij9 {
    public static final aj9 a;

    /* compiled from: CameraMngWrp.kt */
    public static final class a {
        public final void a(String str, String str2) {
            L.e(str, str2);
        }

        public final void b(String str, String str2) {
            L.l(str, str2);
        }

        public final void c(String str, String str2) {
            L.p(str, str2);
        }

        public final void d(String str, String str2) {
            L.A(str, str2);
        }

        public final void e(String str, String str2) {
            L.G(str, str2);
        }
    }

    /* compiled from: CameraMngWrp.kt */
    public static final class b {
        public final void a(CameraException cameraException) {
            com.vk.metrics.eventtracking.b.a.a(cameraException);
        }
    }

    /* compiled from: CameraMngWrp.kt */
    public static final class c {
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Context context2 = context;
        a aVar = new a();
        b bVar = new b();
        c cVar = new c();
        aj9 aj9Var = new aj9();
        aj9Var.a = new bpn0(new vd0(context2, aVar, bVar, cVar, 1));
        a = aj9Var;
    }
}
