package xsna;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: VKImageLoader.java */
/* loaded from: classes.dex */
public final class rcr0 implements ComponentCallbacks {
    public final /* synthetic */ AtomicInteger b;

    public rcr0(AtomicInteger atomicInteger) {
        this.b = atomicInteger;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AtomicInteger atomicInteger = this.b;
        int i = atomicInteger.get();
        int i2 = configuration.densityDpi;
        if (i != i2) {
            atomicInteger.set(i2);
            mcr0.b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
