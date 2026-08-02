package com.bumptech.glide.request.target;

import android.os.Handler;
import android.os.Message;
import defpackage.oyr;

/* loaded from: classes10.dex */
class PreloadTarget$1 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        throw oyr.d(message.obj);
    }
}
