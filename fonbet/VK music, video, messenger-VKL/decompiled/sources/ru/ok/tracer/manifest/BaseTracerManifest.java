package ru.ok.tracer.manifest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes11.dex */
public interface BaseTracerManifest {
    @NonNull
    String appToken();

    @Nullable
    String buildUuid();

    @Nullable
    default String environment() {
        return null;
    }

    default boolean isDisabled() {
        return false;
    }

    @NonNull
    String namespace();

    @NonNull
    String versionName();
}
