package xsna;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x3q implements f9e0 {
    @Override // xsna.f9e0
    public final Object get() {
        cqy<ScheduledExecutorService> cqyVar = ExecutorsRegistrar.a;
        return new gul(asu0.B(Math.max(2, Runtime.getRuntime().availableProcessors()), new wok("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.d.get());
    }
}
