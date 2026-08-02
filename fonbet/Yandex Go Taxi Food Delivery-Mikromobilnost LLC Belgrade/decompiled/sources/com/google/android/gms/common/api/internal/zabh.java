package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;
import defpackage.gy81;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public final class zabh extends zau {
    final /* synthetic */ e zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabh(e eVar, Looper looper) {
        super(looper);
        this.zaa = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            return;
        }
        gy81 gy81Var = (gy81) message.obj;
        e eVar = this.zaa;
        gy81Var.getClass();
        eVar.a.lock();
        try {
            if (eVar.D == gy81Var.a) {
                gy81Var.a();
            }
        } finally {
            eVar.a.unlock();
        }
    }
}
