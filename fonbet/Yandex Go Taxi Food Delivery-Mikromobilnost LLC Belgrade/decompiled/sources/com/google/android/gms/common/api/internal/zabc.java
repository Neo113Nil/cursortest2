package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
final class zabc extends zau {
    final /* synthetic */ d zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(d dVar, Looper looper) {
        super(looper);
        this.zaa = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            d.r(this.zaa);
            return;
        }
        d dVar = this.zaa;
        ReentrantLock reentrantLock = dVar.b;
        reentrantLock.lock();
        try {
            if (dVar.s()) {
                dVar.u();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
