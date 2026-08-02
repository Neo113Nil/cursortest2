package com.cloudwebrtc.webrtc.utils;

import android.os.Handler;
import android.os.Looper;
import defpackage.dm2;
import defpackage.hc;
import defpackage.l9;
import defpackage.xeo;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class AnyThreadSink implements xeo {
    private final xeo eventSink;
    private final Handler handler = new Handler(Looper.getMainLooper());

    public AnyThreadSink(xeo xeoVar) {
        this.eventSink = xeoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$error$1(String str, String str2, Object obj) {
        this.eventSink.error(str, str2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$success$0(Object obj) {
        this.eventSink.success(obj);
    }

    private void post(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.handler.post(runnable);
        }
    }

    @Override // defpackage.xeo
    public void endOfStream() {
        xeo xeoVar = this.eventSink;
        Objects.requireNonNull(xeoVar);
        post(new dm2(xeoVar, 0));
    }

    @Override // defpackage.xeo
    public void error(String str, String str2, Object obj) {
        post(new l9(this, str, str2, obj, 5));
    }

    @Override // defpackage.xeo
    public void success(Object obj) {
        post(new hc(22, this, obj));
    }
}
