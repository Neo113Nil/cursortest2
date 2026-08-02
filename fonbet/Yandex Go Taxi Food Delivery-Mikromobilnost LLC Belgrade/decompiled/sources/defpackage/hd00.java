package defpackage;

import android.os.Looper;
import com.arkivanov.mvikotlin.core.utils.internal.AtomicKt$atomic$1;

/* loaded from: classes.dex */
public abstract class hd00 {
    public static final AtomicKt$atomic$1 a = new AtomicKt$atomic$1(null);

    public static final void a() {
        Object obj;
        kd00 kd00Var;
        while (true) {
            AtomicKt$atomic$1 atomicKt$atomic$1 = a;
            obj = atomicKt$atomic$1.get();
            if (obj != null) {
                break;
            }
            try {
                kd00Var = new kd00(Looper.getMainLooper().getThread().getId());
            } catch (Throwable th) {
                nk91.b("Unable to determine Main thread id: " + th.getMessage());
                kd00Var = null;
            }
            if (kd00Var == null) {
                nk91.b("Main thread id is undefined, main thread assert is disabled");
            }
            ld00 ld00Var = new ld00(kd00Var);
            if (atomicKt$atomic$1.compareAndSet(null, ld00Var)) {
                obj = ld00Var;
                break;
            }
        }
        kd00 kd00Var2 = ((ld00) obj).a;
        if (kd00Var2 == null || kd00Var2.a == Thread.currentThread().getId()) {
            return;
        }
        w511.f("Not on Main thread, current thread is: ".concat(Thread.currentThread().toString()));
    }
}
