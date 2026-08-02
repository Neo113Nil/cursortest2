package ru.ok.native_loader_bridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes11.dex */
public class NativeLibLoaderBridge {

    @Nullable
    private static volatile NativeLibLoader loader;

    private NativeLibLoaderBridge() {
    }

    public static synchronized void init(@NonNull NativeLibLoader nativeLibLoader) {
        synchronized (NativeLibLoaderBridge.class) {
            loader = nativeLibLoader;
        }
    }

    public static void loadLibrary(@NonNull String str) {
        NativeLibLoader nativeLibLoader = loader;
        if (nativeLibLoader == null || !nativeLibLoader.canLoadLibrary(str)) {
            System.loadLibrary(str);
        } else {
            nativeLibLoader.loadLibrary(str);
        }
    }
}
