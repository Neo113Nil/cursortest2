package xsna;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class h4k {
    public static void a(@NonNull Context context, @NonNull Throwable th) {
        try {
            exc0.i(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }
}
