package ru.ok.android.commons.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public class PendingIntentCompat {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static int flagMutableIfNotImmutable(int i) {
        return (Build.VERSION.SDK_INT < 31 || (67108864 & i) != 0) ? i : i | 33554432;
    }

    public static PendingIntent getActivities(Context context, int i, @NonNull Intent[] intentArr, int i2) {
        return PendingIntent.getActivities(context, i, intentArr, flagMutableIfNotImmutable(i2));
    }

    public static PendingIntent getActivity(Context context, int i, @NonNull Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, flagMutableIfNotImmutable(i2));
    }

    public static PendingIntent getBroadcast(Context context, int i, @NonNull Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, intent, flagMutableIfNotImmutable(i2));
    }

    public static PendingIntent getService(Context context, int i, @NonNull Intent intent, int i2) {
        return PendingIntent.getService(context, i, intent, flagMutableIfNotImmutable(i2));
    }

    public static PendingIntent getActivity(Context context, int i, @NonNull Intent intent, int i2, @Nullable Bundle bundle) {
        return PendingIntent.getActivity(context, i, intent, flagMutableIfNotImmutable(i2), bundle);
    }
}
