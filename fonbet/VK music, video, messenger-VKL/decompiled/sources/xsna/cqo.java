package xsna;

import android.app.Activity;
import com.vk.core.dynamic_loader.b;
import java.util.concurrent.locks.ReentrantLock;
import xsna.c63;

/* compiled from: DynamicLibLoader.kt */
/* loaded from: classes.dex */
public final class cqo extends c63.b {
    @Override // xsna.c63.b
    public final void x(Activity activity) {
        ReentrantLock reentrantLock = com.vk.core.dynamic_loader.b.l;
        reentrantLock.lock();
        try {
            s3q0 s3q0Var = s3q0.a;
            if (!com.vk.core.dynamic_loader.b.m) {
                b.a l = com.vk.core.dynamic_loader.b.k.l();
                if (l == null) {
                    reentrantLock.unlock();
                    return;
                } else {
                    com.vk.core.dynamic_loader.b.i(l.c, l.a, l.b);
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
