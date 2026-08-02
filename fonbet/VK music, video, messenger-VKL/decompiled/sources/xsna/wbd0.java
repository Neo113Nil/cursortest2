package xsna;

import android.util.Log;
import com.vk.core.apps.BuildInfo;
import com.vk.httpexecutor.api.NetworkClient;
import xsna.lkv;

/* compiled from: PriorityManager.kt */
/* loaded from: classes.dex */
public final class wbd0 {
    public final zbd0 a;
    public final Object b = new Object();

    public wbd0(zbd0 zbd0Var) {
        this.a = zbd0Var;
    }

    public final void a(ckv ckvVar) {
        if (BuildInfo.h()) {
            Log.e("PriorityManager", "newRequest threadName: " + Thread.currentThread().getName() + " clientType: " + ((NetworkClient.ClientType) ckvVar.h(lkv.c.a)) + ", screen: " + ((String) ckvVar.h(lkv.e.a)) + ", url: " + ckvVar.j());
        }
        synchronized (this.b) {
            this.a.b(ckvVar);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b(ckv ckvVar) {
        synchronized (this.b) {
            try {
                if (this.a.c(ckvVar)) {
                    this.b.notifyAll();
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ckv ckvVar) {
        while (true) {
            synchronized (this.b) {
                if (this.a.a(ckvVar)) {
                    return;
                }
                this.b.wait();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }
}
