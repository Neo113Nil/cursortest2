package androidx.camera.core.impl.utils;

import android.view.Surface;

/* loaded from: classes10.dex */
public abstract class SurfaceUtil {

    public static class a {
        public int a = 0;
        public int b = 0;
        public int c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.a = nativeGetSurfaceInfo[0];
        aVar.b = nativeGetSurfaceInfo[1];
        aVar.c = nativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
