package ru.mail.verify.core.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes11.dex */
public interface UncaughtExceptionListener {
    void uncaughtException(@Nullable Thread thread, @NonNull Throwable th);
}
