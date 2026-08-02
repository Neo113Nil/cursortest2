package xsna;

import android.os.Looper;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import dalvik.system.PathClassLoader;

/* compiled from: SpyClassLoader.kt */
/* loaded from: classes18.dex */
public final class ank0 extends PathClassLoader {
    public static final /* synthetic */ int b = 0;
    public final q5x a;

    public ank0(ClassLoader classLoader, q5x q5xVar) {
        super("", classLoader);
        this.a = q5xVar;
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) {
        if (epx.f(Looper.getMainLooper().getThread(), Thread.currentThread()) && str != null) {
            zar zarVar = this.a.f;
            if (zarVar.a && brm0.B(str, "com.vk.", false) && !brm0.B(str, "com.vk.api", false) && !brm0.B(str, "com.vk.dto", false) && !brm0.B(str, "com.vk.mvi", false) && !brm0.B(str, "com.vk.mediastore", false) && !brm0.B(str, "com.vk.assistants", false) && !brm0.B(str, "com.vk.superapp.api", false) && !brm0.B(str, "com.vk.queuesync", false) && !brm0.B(str, "com.vk.core.ui.tracking", false) && !brm0.B(str, "com.vk.media.player", false) && !brm0.B(str, "com.vk.libvideo", false) && !brm0.B(str, "com.vk.reefton", false) && !brm0.B(str, "com.vk.bridges", false)) {
                int L = drm0.L(str, '$', 0, 6);
                String substring = L != -1 ? str.substring(0, L) : str;
                if (zarVar.d.add(substring)) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"FileUsageCollector", go9.b("class: ", substring)});
                    }
                }
            }
        }
        return super.loadClass(str, z);
    }
}
