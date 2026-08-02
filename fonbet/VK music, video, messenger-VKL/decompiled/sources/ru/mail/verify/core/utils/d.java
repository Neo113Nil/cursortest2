package ru.mail.verify.core.utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class d {
    public static void a(@NonNull Context context, @NonNull Intent intent) {
        try {
            IntentProcessJobService.a(context, intent);
        } catch (Exception e) {
            Log.e("IntentProcessService", "critical exception", e);
        }
    }
}
