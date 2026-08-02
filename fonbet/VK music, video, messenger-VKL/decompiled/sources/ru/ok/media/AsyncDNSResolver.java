package ru.ok.media;

import android.os.Handler;
import android.os.HandlerThread;
import java.net.InetAddress;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.h5s;
import xsna.iy2;
import xsna.izs;
import xsna.n52;
import xsna.ne7;
import xsna.oo;
import xsna.rl3;
import xsna.s3q0;
import xsna.sx3;
import xsna.zcl;

/* compiled from: AsyncDNSResolver.kt */
/* loaded from: classes9.dex */
public final class AsyncDNSResolver {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AsyncDNSResolver";
    private volatile boolean complete;
    private final izs<Boolean, s3q0> completionBlock;
    private volatile boolean error;
    private final Handler handler;
    private final String hostname;
    private volatile boolean started;
    private volatile String errorString = "";
    private volatile InetAddress[] addresses = new InetAddress[0];
    private final Lazy handlerThread$delegate = new bpn0(new iy2(1));
    private final Lazy workerHandler$delegate = new bpn0(new oo(this, 4));

    /* compiled from: AsyncDNSResolver.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncDNSResolver(String str, Handler handler, izs<? super Boolean, s3q0> izsVar) {
        this.hostname = str;
        this.handler = handler;
        this.completionBlock = izsVar;
    }

    private final HandlerThread getHandlerThread() {
        return (HandlerThread) this.handlerThread$delegate.getValue();
    }

    private final Handler getWorkerHandler() {
        return (Handler) this.workerHandler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandlerThread handlerThread_delegate$lambda$1() {
        return h5s.a("async DNS resolver");
    }

    private final void setComplete(boolean z, String str, boolean z2) {
        izs<Boolean, s3q0> izsVar;
        synchronized (this) {
            if (this.complete) {
                ne7.n(TAG, "setComplete() - already completed");
                return;
            }
            this.error = z;
            this.errorString = str;
            this.complete = true;
            s3q0 s3q0Var = s3q0.a;
            ne7.t(TAG, "setComplete(" + z + ", \"" + str + "\", " + z2 + ")");
            if (!z2 || (izsVar = this.completionBlock) == null) {
                return;
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new n52(this, 2));
            } else {
                izsVar.invoke(Boolean.valueOf(getSucceeded()));
            }
        }
    }

    public static /* synthetic */ void setComplete$default(AsyncDNSResolver asyncDNSResolver, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        asyncDNSResolver.setComplete(z, str, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setComplete$lambda$6(AsyncDNSResolver asyncDNSResolver) {
        asyncDNSResolver.completionBlock.invoke(Boolean.valueOf(asyncDNSResolver.getSucceeded()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$4(AsyncDNSResolver asyncDNSResolver) {
        AsyncDNSResolver asyncDNSResolver2;
        if (asyncDNSResolver.complete) {
            ne7.n(TAG, "start() closure - not starting, already completed (cancelled?)");
            return;
        }
        ne7.m(TAG, "start() closure enter");
        try {
            asyncDNSResolver.addresses = InetAddress.getAllByName(asyncDNSResolver.hostname);
            ne7.t(TAG, "start() closure - resolved " + asyncDNSResolver.hostname + " to " + rl3.Z(asyncDNSResolver.addresses, " ", null, null, null, 62));
            asyncDNSResolver2 = asyncDNSResolver;
            try {
                setComplete$default(asyncDNSResolver2, false, null, false, 6, null);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                ne7.n(TAG, "start() closure - exception: " + th2);
                setComplete$default(asyncDNSResolver2, true, th2.toString(), false, 4, null);
                asyncDNSResolver2.getHandlerThread().quitSafely();
                ne7.m(TAG, "start() closure exit");
            }
        } catch (Throwable th3) {
            th = th3;
            asyncDNSResolver2 = asyncDNSResolver;
        }
        asyncDNSResolver2.getHandlerThread().quitSafely();
        ne7.m(TAG, "start() closure exit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler workerHandler_delegate$lambda$2(AsyncDNSResolver asyncDNSResolver) {
        return new Handler(asyncDNSResolver.getHandlerThread().getLooper());
    }

    public final void cancel() {
        ne7.t(TAG, "cancel()");
        setComplete(true, "cancelled", false);
    }

    public final InetAddress[] getAddresses() {
        return this.addresses;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final boolean getError() {
        return this.error;
    }

    public final String getErrorString() {
        return this.errorString;
    }

    public final String getHostname() {
        return this.hostname;
    }

    public final boolean getStarted() {
        return this.started;
    }

    public final boolean getSucceeded() {
        return this.complete && !this.error;
    }

    public final void start() {
        synchronized (this) {
            if (this.started) {
                ne7.n(TAG, "start() - already started");
                return;
            }
            ne7.m(TAG, "start() - " + this.hostname);
            this.started = true;
            s3q0 s3q0Var = s3q0.a;
            getWorkerHandler().post(new sx3(this, 0));
        }
    }

    public String toString() {
        return "host=" + this.hostname + "\nsucceeded=" + getSucceeded() + ", error=" + this.error + "\n" + (this.started ? "" : "NOT ") + "started, " + (this.complete ? "" : "NOT ") + "complete\n" + this.addresses.length + " address(es) resolved";
    }
}
