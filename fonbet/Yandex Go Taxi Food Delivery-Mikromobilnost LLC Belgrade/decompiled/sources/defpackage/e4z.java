package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public final class e4z implements xcr0 {
    public final Bundle a;

    public e4z(Context context) {
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // defpackage.xcr0
    public final Double a() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // defpackage.xcr0
    public final Object b(Continuation continuation) {
        return zy11.a;
    }

    @Override // defpackage.xcr0
    public final Boolean c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // defpackage.xcr0
    public final e3n d() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new e3n(kp50.U(bundle.getInt("firebase_sessions_sessions_restart_timeout"), DurationUnit.SECONDS));
        }
        return null;
    }
}
