package xsna;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y3q implements f9e0 {
    @Override // xsna.f9e0
    public final Object get() {
        cqy<ScheduledExecutorService> cqyVar = ExecutorsRegistrar.a;
        return new gul(Executors.newCachedThreadPool(new wok("Firebase Blocking", 11, null)), ExecutorsRegistrar.d.get());
    }
}
