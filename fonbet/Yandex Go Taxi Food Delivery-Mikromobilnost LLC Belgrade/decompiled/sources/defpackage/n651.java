package defpackage;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.a;

/* loaded from: classes10.dex */
public final class n651 {
    public static final /* synthetic */ n651 a = new n651();
    public static final i3y b;
    public static final wfz c;

    static {
        qoi0.a(o651.class).d();
        b = a.a(new q251(4));
        c = wfz.D;
    }

    public static androidx.window.layout.a a(Context context) {
        z551 z551Var = (z551) b.getValue();
        if (z551Var == null) {
            androidx.window.layout.adapter.sidecar.a aVar = androidx.window.layout.adapter.sidecar.a.c;
            if (androidx.window.layout.adapter.sidecar.a.c == null) {
                ReentrantLock reentrantLock = androidx.window.layout.adapter.sidecar.a.d;
                reentrantLock.lock();
                try {
                    if (androidx.window.layout.adapter.sidecar.a.c == null) {
                        dbs0 dbs0Var = null;
                        try {
                            ca31 b2 = cbs0.b();
                            if (b2 != null) {
                                if (((BigInteger) b2.x.getValue()).compareTo((BigInteger) ca31.y.x.getValue()) >= 0) {
                                    dbs0 dbs0Var2 = new dbs0(context);
                                    if (dbs0Var2.e()) {
                                        dbs0Var = dbs0Var2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        androidx.window.layout.adapter.sidecar.a.c = new androidx.window.layout.adapter.sidecar.a(dbs0Var);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            z551Var = androidx.window.layout.adapter.sidecar.a.c;
        }
        new z751(0);
        new g851();
        androidx.window.layout.a aVar2 = new androidx.window.layout.a(z551Var);
        c.getClass();
        return aVar2;
    }
}
