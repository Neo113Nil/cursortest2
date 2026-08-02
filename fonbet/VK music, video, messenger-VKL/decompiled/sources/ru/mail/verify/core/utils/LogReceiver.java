package ru.mail.verify.core.utils;

import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public interface LogReceiver {
    void d(@NonNull String str, @NonNull String str2);

    void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    void e(@NonNull String str, @NonNull String str2);

    void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    void v(@NonNull String str, @NonNull String str2);

    void v(@NonNull String str, @NonNull String str2, @NonNull Throwable th);
}
