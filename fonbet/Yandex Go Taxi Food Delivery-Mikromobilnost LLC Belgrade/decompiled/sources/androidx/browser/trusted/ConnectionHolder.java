package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.concurrent.futures.b;
import defpackage.euy;
import defpackage.gl7;
import defpackage.hsj0;
import defpackage.mi11;
import defpackage.ny61;
import defpackage.x4e;
import defpackage.z4e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
class ConnectionHolder implements ServiceConnection {
    private static final int STATE_AWAITING_CONNECTION = 0;
    private static final int STATE_CANCELLED = 3;
    private static final int STATE_CONNECTED = 1;
    private static final int STATE_DISCONNECTED = 2;
    private Exception mCancellationException;
    private final Runnable mCloseRunnable;
    private List<b> mCompleters;
    private mi11 mService;
    private int mState;
    private final z4e mWrapperFactory;

    public ConnectionHolder(Runnable runnable, z4e z4eVar) {
        this.mState = 0;
        this.mCompleters = new ArrayList();
        this.mCloseRunnable = runnable;
        this.mWrapperFactory = z4eVar;
    }

    private /* synthetic */ Object lambda$getServiceWrapper$0(b bVar) throws Exception {
        int i = this.mState;
        if (i == 0) {
            this.mCompleters.add(bVar);
        } else {
            if (i != 1) {
                if (i == 2) {
                    ny61.r("Service has been disconnected.");
                    return null;
                }
                if (i == 3) {
                    throw this.mCancellationException;
                }
                ny61.r("Connection state is invalid");
                return null;
            }
            mi11 mi11Var = this.mService;
            if (mi11Var == null) {
                ny61.r("ConnectionHolder state is incorrect.");
                return null;
            }
            bVar.b(mi11Var);
        }
        return "ConnectionHolder, state = " + this.mState;
    }

    public void cancel(Exception exc) {
        Iterator<b> it = this.mCompleters.iterator();
        while (it.hasNext()) {
            it.next().d(exc);
        }
        this.mCompleters.clear();
        this.mCloseRunnable.run();
        this.mState = 3;
        this.mCancellationException = exc;
    }

    public euy getServiceWrapper() {
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            Object lambda$getServiceWrapper$0 = lambda$getServiceWrapper$0(bVar);
            if (lambda$getServiceWrapper$0 == null) {
                return gl7Var;
            }
            bVar.a = lambda$getServiceWrapper$0;
            return gl7Var;
        } catch (Exception e) {
            gl7Var.a(e);
            return gl7Var;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.mWrapperFactory.getClass();
        this.mService = new mi11(ITrustedWebActivityService.Stub.asInterface(iBinder));
        Iterator<b> it = this.mCompleters.iterator();
        while (it.hasNext()) {
            it.next().b(this.mService);
        }
        this.mCompleters.clear();
        this.mState = 1;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.mService = null;
        this.mCloseRunnable.run();
        this.mState = 2;
    }

    public ConnectionHolder(Runnable runnable) {
        this(runnable, new z4e());
    }
}
