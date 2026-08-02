package xsna;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: MulticastConsumerApi2.kt */
/* loaded from: classes12.dex */
public final class c740 implements o7j<WindowLayoutInfo>, Consumer2<WindowLayoutInfo> {
    public final Context b;
    public erx0 d;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashSet e = new LinkedHashSet();

    public c740(Context context) {
        this.b = context;
    }

    public final void a(o7j<erx0> o7jVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            erx0 erx0Var = this.d;
            if (erx0Var != null) {
                o7jVar.accept(erx0Var);
            }
            this.e.add(o7jVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // xsna.o7j
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        WindowLayoutInfo windowLayoutInfo2 = windowLayoutInfo;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            erx0 b = sdq.b(this.b, windowLayoutInfo2);
            this.d = b;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((o7j) it.next()).accept(b);
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
