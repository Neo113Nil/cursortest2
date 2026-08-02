package xsna;

import android.content.Context;
import android.os.Bundle;
import kotlin.time.DurationUnit;

/* compiled from: LocalOverrideSettings.kt */
/* loaded from: classes.dex */
public final class qvz implements i3j0 {
    public final Bundle a;

    public qvz(Context context) {
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // xsna.i3j0
    public final Double a() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // xsna.i3j0
    public final Object b(spj<? super s3q0> spjVar) {
        return s3q0.a;
    }

    @Override // xsna.i3j0
    public final Boolean c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // xsna.i3j0
    public final zno d() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new zno(eoo.e(bundle.getInt("firebase_sessions_sessions_restart_timeout"), DurationUnit.SECONDS));
        }
        return null;
    }
}
