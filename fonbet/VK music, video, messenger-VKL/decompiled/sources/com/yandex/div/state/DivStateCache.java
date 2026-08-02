package com.yandex.div.state;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface DivStateCache {
    @Nullable
    String getRootState(@NonNull String str);

    @Nullable
    String getState(@NonNull String str, @NonNull String str2);

    void putRootState(@NonNull String str, @NonNull String str2);

    void putState(@NonNull String str, @NonNull String str2, @NonNull String str3);
}
