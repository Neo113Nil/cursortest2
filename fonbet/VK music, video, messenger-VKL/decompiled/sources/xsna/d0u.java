package xsna;

import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.log.L;
import ru.ok.gleffects.ExternalLibraryLoader;

/* compiled from: GlEffectsLibraryInitializer.kt */
/* loaded from: classes11.dex */
public final class d0u implements ExternalLibraryLoader {
    @Override // ru.ok.gleffects.ExternalLibraryLoader
    public final boolean loadLibrary(String str) {
        L.p("GlEffectsLibraryInitializer", go9.b("loadLibrary: ", str));
        if (str == null) {
            return false;
        }
        NativeLib.Companion.getClass();
        NativeLib a = NativeLib.a.a(str);
        if (a == null) {
            return false;
        }
        return NativeLibLoader.j(NativeLibLoader.a, a);
    }
}
