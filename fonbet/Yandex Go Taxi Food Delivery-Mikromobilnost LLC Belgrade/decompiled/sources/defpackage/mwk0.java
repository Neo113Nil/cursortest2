package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* loaded from: classes11.dex */
public final class mwk0 {
    public static mwk0 b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    public static synchronized mwk0 b() {
        mwk0 mwk0Var;
        synchronized (mwk0.class) {
            try {
                if (b == null) {
                    b = new mwk0();
                }
                mwk0Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mwk0Var;
    }

    public final RootTelemetryConfiguration a() {
        return this.a;
    }
}
