package xsna;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: Logger.java */
/* loaded from: classes11.dex */
public final class s100 {
    public static int a = 3;

    public static void a(@NonNull String str, @NonNull String str2, @Nullable Throwable th) {
        if (a <= 6 || Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public static boolean b(@NonNull String str) {
        return a <= 3 || Log.isLoggable(str, 3);
    }
}
