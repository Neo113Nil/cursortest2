package xsna;

import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class x101 implements Callable {
    public final /* synthetic */ FirebaseAnalytics b;

    public x101(FirebaseAnalytics firebaseAnalytics) {
        this.b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.b.a.zzl();
    }
}
