package xsna;

import android.app.Application;
import com.vk.core.apps.BuildInfo;
import com.vk.core.native_loader.CpuType;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VoipFeatures;
import ru.ok.native_loader_bridge.NativeLibLoaderBridge;

/* compiled from: NativeLoaderInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class vv50 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "nativeloader";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        VoipFeatures voipFeatures = VoipFeatures.DISABLE_NATIVE_LIB_LOADER_REFACTOR;
        voipFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean a = bVar.a(voipFeatures);
        CoreFeatures coreFeatures = CoreFeatures.ENABLE_SOLOADER;
        coreFeatures.getClass();
        boolean a2 = bVar.a(coreFeatures);
        NativeLibLoader nativeLibLoader = NativeLibLoader.a;
        CpuType.a aVar = CpuType.Companion;
        String str = BuildInfo.c;
        aVar.getClass();
        CpuType cpuType = CpuType.X86;
        if (!str.equals(cpuType.h())) {
            cpuType = CpuType.X86_64;
            if (!str.equals(cpuType.h())) {
                cpuType = CpuType.ARM;
                if (!str.equals(cpuType.h())) {
                    cpuType = CpuType.UNKNOWN;
                }
            }
        }
        nativeLibLoader.getClass();
        Application application = this.b;
        NativeLibLoader.h(application, cpuType, e2v0.a, a, a2);
        vpo vpoVar = com.vk.core.dynamic_loader.b.a;
        asu0.a.getClass();
        com.vk.core.dynamic_loader.b.f(application, asu0.u(), new bti(suv0.a, gqo.a));
        if (com.vk.core.dynamic_loader.a.e.compareAndSet(false, true)) {
            com.vk.core.utils.newtork.b.a.getClass();
            com.vk.core.utils.newtork.b.d.subscribe(new jpo(new ipo(0), 0));
        }
        NativeLibLoaderBridge.init(new uv50());
        return s3q0.a;
    }
}
