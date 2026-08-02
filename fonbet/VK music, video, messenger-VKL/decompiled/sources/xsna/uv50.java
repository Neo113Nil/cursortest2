package xsna;

import com.vk.core.native_loader.NativeLib;
import ru.ok.native_loader_bridge.NativeLibLoader;

/* compiled from: NativeLoaderInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class uv50 implements NativeLibLoader {
    @Override // ru.ok.native_loader_bridge.NativeLibLoader
    public final boolean canLoadLibrary(String str) {
        NativeLib.Companion.getClass();
        return NativeLib.a.a(str) != null;
    }

    @Override // ru.ok.native_loader_bridge.NativeLibLoader
    public final boolean loadLibrary(String str) {
        NativeLib.Companion.getClass();
        NativeLib a = NativeLib.a.a(str);
        if (a == null) {
            return false;
        }
        return com.vk.core.native_loader.NativeLibLoader.j(com.vk.core.native_loader.NativeLibLoader.a, a);
    }
}
