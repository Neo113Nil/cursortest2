package xsna;

import android.app.Application;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.libnative.NativeCore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: NativeCoreInitTask.kt */
/* loaded from: classes11.dex */
public final class pv50 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "NativeCoreInit";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        NativeCore nativeCore = NativeCore.a;
        Application application = this.b;
        nativeCore.getClass();
        AtomicBoolean atomicBoolean = NativeCore.d;
        if (!atomicBoolean.get()) {
            ReentrantLock reentrantLock = NativeCore.b;
            reentrantLock.lock();
            try {
                if (atomicBoolean.get()) {
                    reentrantLock.unlock();
                } else {
                    NativeCore.context = application;
                    NativeLibLoader.j(NativeLibLoader.a, NativeLib.VK_CORE);
                    atomicBoolean.set(true);
                    NativeCore.c.signalAll();
                    s3q0 s3q0Var = s3q0.a;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return s3q0.a;
    }
}
