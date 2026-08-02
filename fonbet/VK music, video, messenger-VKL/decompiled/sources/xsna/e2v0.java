package xsna;

import com.vk.core.native_loader.CpuType;
import com.vk.core.native_loader.NativeLibLoadException;
import com.vk.core.native_loader.NativeLibLoader;

/* compiled from: VkLibLogger.kt */
/* loaded from: classes11.dex */
public final class e2v0 implements NativeLibLoader.b {
    public static final e2v0 a = new e2v0();

    @Override // com.vk.core.native_loader.NativeLibLoader.b
    public final void a(Throwable th) {
        NativeLibLoader.a.getClass();
        if (NativeLibLoader.f == CpuType.UNKNOWN || NativeLibLoader.f == CpuType.X86 || NativeLibLoader.f == CpuType.X86_64) {
            com.vk.metrics.eventtracking.b.a.a(th);
        } else {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
    }

    @Override // com.vk.core.native_loader.NativeLibLoader.b
    public final void b(Throwable th, CpuType cpuType, String str, String str2) {
        new sv50(str, cpuType.name(), str2).q();
        NativeLibLoader.b.a.a(this, th, cpuType);
    }

    @Override // com.vk.core.native_loader.NativeLibLoader.b
    public final void c(NativeLibLoadException nativeLibLoadException, CpuType cpuType) {
        NativeLibLoader.b.a.b(this, nativeLibLoadException, cpuType);
    }
}
