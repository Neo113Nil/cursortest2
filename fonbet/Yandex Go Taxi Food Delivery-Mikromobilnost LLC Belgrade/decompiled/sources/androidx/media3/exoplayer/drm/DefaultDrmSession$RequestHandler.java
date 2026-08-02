package androidx.media3.exoplayer.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import defpackage.gno;
import defpackage.lk91;
import defpackage.lno;
import defpackage.oah;
import defpackage.swy;
import defpackage.uwy;
import java.io.IOException;

/* loaded from: classes10.dex */
class DefaultDrmSession$RequestHandler extends Handler {
    private boolean isReleased;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDrmSession$RequestHandler(a aVar, Looper looper) {
        super(looper);
        this.this$0 = aVar;
    }

    private boolean maybeRetryRequest(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
        oah oahVar = (oah) message.obj;
        if (oahVar.b) {
            int i = oahVar.d + 1;
            oahVar.d = i;
            if (i <= this.this$0.j.getMinimumLoadableRetryCount(3)) {
                mediaDrmCallbackException.getClass();
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                long retryDelayMsFor = this.this$0.j.getRetryDelayMsFor(new swy(mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new DefaultDrmSession$UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), oahVar.d));
                if (retryDelayMsFor != -9223372036854775807L) {
                    synchronized (this) {
                        try {
                            if (this.isReleased) {
                                return false;
                            }
                            sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
                            return true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Exception exc;
        oah oahVar = (oah) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                a aVar = this.this$0;
                exc = aVar.l.executeProvisionRequest(aVar.m, (lno) oahVar.c);
            } else {
                if (i != 2) {
                    throw new RuntimeException();
                }
                a aVar2 = this.this$0;
                exc = aVar2.l.executeKeyRequest(aVar2.m, (gno) oahVar.c);
            }
        } catch (Exception e) {
            lk91.k("Key/provisioning request produced an unexpected exception. Not retrying.", e);
            exc = e;
        }
        this.this$0.j.onLoadTaskConcluded(oahVar.a);
        synchronized (this) {
            try {
                if (!this.isReleased) {
                    obtainMessage(message.what, Pair.create(oahVar.c, exc)).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void post(int i, Object obj, boolean z) {
        obtainMessage(i, new oah(uwy.f.getAndIncrement(), SystemClock.elapsedRealtime(), obj, z)).sendToTarget();
    }

    public synchronized void release() {
        removeCallbacksAndMessages(null);
        this.isReleased = true;
    }
}
