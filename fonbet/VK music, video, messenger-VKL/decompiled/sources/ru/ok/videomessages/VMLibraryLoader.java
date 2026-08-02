package ru.ok.videomessages;

import android.util.Log;
import ru.ok.gleffects.ExternalLibraryLoader;
import ru.ok.gleffects.ExternalLibraryLoaderHolder;

/* loaded from: classes9.dex */
public final class VMLibraryLoader {
    private static final VMLibraryLoader INSTANCE = new VMLibraryLoader();
    private static final String TAG = "VMLibLoader";
    private static final String VM_LIBRARY = "video-message-stencils";
    private final Throwable loadError;

    private VMLibraryLoader() {
        ExternalLibraryLoader externalLibraryLoader = ExternalLibraryLoaderHolder.externalLibraryLoader;
        Throwable th = null;
        if (externalLibraryLoader != null && externalLibraryLoader.loadLibrary(VM_LIBRARY)) {
            this.loadError = null;
            return;
        }
        try {
            System.loadLibrary(VM_LIBRARY);
        } catch (Throwable th2) {
            th = th2;
            Log.e(TAG, "Failed to load video-message-stencils library", th);
        }
        this.loadError = th;
    }

    public static Throwable getLoadError() {
        return INSTANCE.loadError;
    }

    public static boolean isLoaded() {
        return INSTANCE.loadError == null;
    }

    public static boolean loadLibrary(String str) {
        if (isLoaded()) {
            return true;
        }
        Log.e(TAG, str, getLoadError());
        return false;
    }
}
