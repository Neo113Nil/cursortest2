package ru.ok.native_loader_bridge;

import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public interface NativeLibLoader {
    boolean canLoadLibrary(@NonNull String str);

    boolean loadLibrary(@NonNull String str);
}
