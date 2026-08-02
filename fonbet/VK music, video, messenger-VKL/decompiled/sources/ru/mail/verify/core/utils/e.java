package ru.mail.verify.core.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class e {
    public static void a(@NonNull Context context, @NonNull Object obj, boolean z) {
        if (VerificationJobService.a(context, obj)) {
            return;
        }
        VerificationService.a(context, obj, z);
    }

    public static void a(@NonNull Context context, @NonNull Object obj) {
        if (VerificationJobService.b(context, obj)) {
            return;
        }
        VerificationService.a(obj);
    }

    public static void a(@NonNull Context context) {
        if (VerificationJobService.a(context)) {
            return;
        }
        VerificationService.b();
    }
}
