package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.cvw;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.wst;
import defpackage.wz81;
import defpackage.xst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class zak implements Handler.Callback {
    private final wz81 zab;
    private final Handler zah;
    private final ArrayList zac = new ArrayList();
    final ArrayList zaa = new ArrayList();
    private final ArrayList zad = new ArrayList();
    private volatile boolean zae = false;
    private final AtomicInteger zaf = new AtomicInteger(0);
    private boolean zag = false;
    private final Object zai = new Object();

    public zak(Looper looper, wz81 wz81Var) {
        this.zab = wz81Var;
        this.zah = new com.google.android.gms.internal.base.zau(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.wtf("GmsClientEvents", oyr.i(i, "Don't know how to handle message: "), new Exception());
            return false;
        }
        wst wstVar = (wst) message.obj;
        synchronized (this.zai) {
            try {
                if (this.zae && this.zab.isConnected() && this.zac.contains(wstVar)) {
                    wstVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void zaa() {
        this.zae = false;
        this.zaf.incrementAndGet();
    }

    public final void zab() {
        this.zae = true;
    }

    public final void zac(ConnectionResult connectionResult) {
        if (Looper.myLooper() != this.zah.getLooper()) {
            ny61.r("onConnectionFailure must only be called on the Handler thread");
            return;
        }
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            try {
                ArrayList arrayList = new ArrayList(this.zad);
                int i = this.zaf.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    xst xstVar = (xst) it.next();
                    if (this.zae && this.zaf.get() == i) {
                        if (this.zad.contains(xstVar)) {
                            xstVar.onConnectionFailed(connectionResult);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    public final void zad(Bundle bundle) {
        if (Looper.myLooper() != this.zah.getLooper()) {
            ny61.r("onConnectionSuccess must only be called on the Handler thread");
            return;
        }
        synchronized (this.zai) {
            try {
                cvw.o(!this.zag);
                this.zah.removeMessages(1);
                this.zag = true;
                cvw.o(this.zaa.isEmpty());
                ArrayList arrayList = new ArrayList(this.zac);
                int i = this.zaf.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    wst wstVar = (wst) it.next();
                    if (!this.zae || !this.zab.isConnected() || this.zaf.get() != i) {
                        break;
                    } else if (!this.zaa.contains(wstVar)) {
                        wstVar.onConnected(bundle);
                    }
                }
                this.zaa.clear();
                this.zag = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zae(int i) {
        if (Looper.myLooper() != this.zah.getLooper()) {
            ny61.r("onUnintentionalDisconnection must only be called on the Handler thread");
            return;
        }
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            try {
                this.zag = true;
                ArrayList arrayList = new ArrayList(this.zac);
                int i2 = this.zaf.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    wst wstVar = (wst) it.next();
                    if (!this.zae || this.zaf.get() != i2) {
                        break;
                    } else if (this.zac.contains(wstVar)) {
                        wstVar.onConnectionSuspended(i);
                    }
                }
                this.zaa.clear();
                this.zag = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zaf(wst wstVar) {
        cvw.l(wstVar);
        synchronized (this.zai) {
            if (!this.zac.contains(wstVar)) {
                this.zac.add(wstVar);
            }
        }
        if (this.zab.isConnected()) {
            Handler handler = this.zah;
            handler.sendMessage(handler.obtainMessage(1, wstVar));
        }
    }

    public final void zag(xst xstVar) {
        cvw.l(xstVar);
        synchronized (this.zai) {
            if (!this.zad.contains(xstVar)) {
                this.zad.add(xstVar);
            }
        }
    }

    public final void zah(wst wstVar) {
        cvw.l(wstVar);
        synchronized (this.zai) {
            try {
                if (this.zac.remove(wstVar) && this.zag) {
                    this.zaa.add(wstVar);
                }
            } finally {
            }
        }
    }

    public final void zai(xst xstVar) {
        cvw.l(xstVar);
        synchronized (this.zai) {
            this.zad.remove(xstVar);
        }
    }

    public final boolean zaj(wst wstVar) {
        boolean contains;
        cvw.l(wstVar);
        synchronized (this.zai) {
            contains = this.zac.contains(wstVar);
        }
        return contains;
    }

    public final boolean zak(xst xstVar) {
        boolean contains;
        cvw.l(xstVar);
        synchronized (this.zai) {
            contains = this.zad.contains(xstVar);
        }
        return contains;
    }
}
