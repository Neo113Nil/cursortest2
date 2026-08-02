package xsna;

import android.app.Application;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class ahd0 {
    public static String a;
    public static Boolean b;

    @Nullable
    public static String a() {
        if (a == null) {
            a = Application.getProcessName();
        }
        return a;
    }
}
