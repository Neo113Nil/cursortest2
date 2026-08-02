package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class mmg0 {

    @Nullable
    public static mmg0 b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    @Nullable
    public RootTelemetryConfiguration a;

    @NonNull
    public static synchronized mmg0 a() {
        mmg0 mmg0Var;
        synchronized (mmg0.class) {
            try {
                if (b == null) {
                    b = new mmg0();
                }
                mmg0Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mmg0Var;
    }
}
