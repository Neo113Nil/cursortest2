package ru.ok.media.logging;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Keep
/* loaded from: classes9.dex */
public interface LoggerInterface {
    boolean detailedEnabled();

    @NonNull
    String getNetType();

    void logDetailed(@NonNull String str);

    void logEvent(@NonNull String str, @NonNull String str2, @Nullable String str3);
}
