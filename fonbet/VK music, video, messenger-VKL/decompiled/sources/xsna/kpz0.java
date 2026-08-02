package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class kpz0 implements Handler.Callback {
    public final d9a b;
    public final com.google.android.gms.internal.base.zar i;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public volatile boolean f = false;
    public final AtomicInteger g = new AtomicInteger(0);
    public boolean h = false;
    public final Object j = new Object();

    public kpz0(Looper looper, d9a d9aVar) {
        this.b = d9aVar;
        this.i = new com.google.android.gms.internal.base.zar(looper, this);
    }

    public final void a(c.InterfaceC0114c interfaceC0114c) {
        exc0.i(interfaceC0114c);
        synchronized (this.j) {
            try {
                ArrayList arrayList = this.e;
                if (arrayList.contains(interfaceC0114c)) {
                    new StringBuilder(String.valueOf(interfaceC0114c).length() + 67);
                } else {
                    arrayList.add(interfaceC0114c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.wtf("GmsClientEvents", z23.b(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
            return false;
        }
        c.b bVar = (c.b) message.obj;
        synchronized (this.j) {
            try {
                if (this.f && this.b.a() && this.c.contains(bVar)) {
                    bVar.f(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
