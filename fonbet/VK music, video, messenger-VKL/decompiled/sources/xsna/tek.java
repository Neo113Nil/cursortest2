package xsna;

import org.chromium.net.impl.CronetLibraryLoader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class tek implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        CronetLibraryLoader.initializeOnInitThread();
    }
}
