package xsna;

import com.vk.core.preference.Preference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class sir implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sir(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((com.google.firebase.installations.a) obj).a();
                return;
            default:
                String[] strArr = (String[]) obj;
                ReentrantReadWriteLock.ReadLock readLock = Preference.o.readLock();
                readLock.lock();
                try {
                    Preference.j();
                    Preference.l();
                    Preference.i();
                    for (String str : strArr) {
                        Preference.f(str);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    readLock.unlock();
                    return;
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
        }
    }
}
