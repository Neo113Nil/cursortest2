package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import defpackage.fz81;
import defpackage.nnm;

/* loaded from: classes11.dex */
final class zacz extends zau {
    final /* synthetic */ fz81 zaa;

    public zacz(fz81 fz81Var, Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            nnm.q(i, "TransformationResultHandler received unknown message type: ", "TransformedResultImpl");
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
            throw runtimeException;
        }
    }
}
