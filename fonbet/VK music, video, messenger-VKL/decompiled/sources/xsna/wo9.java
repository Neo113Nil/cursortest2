package xsna;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.UUID;
import java.util.concurrent.Executor;
import xsna.oi9;
import xsna.th9;

/* compiled from: CameraXConfig.java */
/* loaded from: classes11.dex */
public final class wo9 implements x3o0<vo9> {
    public static final androidx.camera.core.impl.a t = Config.a.a(oi9.a.class, "camerax.core.appConfig.cameraFactoryProvider");
    public static final androidx.camera.core.impl.a u = Config.a.a(th9.a.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final androidx.camera.core.impl.a v = Config.a.a(UseCaseConfigFactory.a.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final androidx.camera.core.impl.a w = Config.a.a(Executor.class, "camerax.core.appConfig.cameraExecutor");
    public static final androidx.camera.core.impl.a x = Config.a.a(Handler.class, "camerax.core.appConfig.schedulerHandler");
    public static final androidx.camera.core.impl.a y = Config.a.a(Integer.TYPE, "camerax.core.appConfig.minimumLoggingLevel");
    public static final androidx.camera.core.impl.a z = Config.a.a(nl9.class, "camerax.core.appConfig.availableCamerasLimiter");
    public final androidx.camera.core.impl.o s;

    /* compiled from: CameraXConfig.java */
    public static final class a {
        public final androidx.camera.core.impl.n a;

        public a() {
            Object obj;
            androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
            this.a = z;
            Object obj2 = null;
            try {
                obj = z.f(x3o0.p);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(vo9.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            androidx.camera.core.impl.n nVar = this.a;
            nVar.C(x3o0.p, vo9.class);
            try {
                obj2 = nVar.f(x3o0.o);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                nVar.C(x3o0.o, vo9.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* compiled from: CameraXConfig.java */
    public interface b {
        @NonNull
        wo9 getCameraXConfig();
    }

    public wo9(androidx.camera.core.impl.o oVar) {
        this.s = oVar;
    }

    @Override // androidx.camera.core.impl.q
    @NonNull
    public final Config getConfig() {
        return this.s;
    }
}
