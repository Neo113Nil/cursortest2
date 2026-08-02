package xsna;

import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import org.chromium.net.CronetEngine;

/* compiled from: CronetEngineBuilder.kt */
/* loaded from: classes.dex */
public final class hek extends CronetEngine.Builder.LibraryLoader {
    public final /* synthetic */ iek a;

    public hek(iek iekVar) {
        this.a = iekVar;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) {
        if (this.a.c != null) {
            NativeLib.Companion.getClass();
            NativeLib a = NativeLib.a.a(str);
            if (a != null) {
                NativeLibLoader.j(NativeLibLoader.a, a);
            } else {
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Not found cronet lib with name: ".concat(str)));
                System.loadLibrary(str);
            }
        }
    }
}
