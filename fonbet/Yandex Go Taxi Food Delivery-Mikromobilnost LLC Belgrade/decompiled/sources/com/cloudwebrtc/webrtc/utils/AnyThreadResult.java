package com.cloudwebrtc.webrtc.utils;

import android.os.Handler;
import android.os.Looper;
import defpackage.da20;
import defpackage.hc;
import defpackage.jg;
import defpackage.l9;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class AnyThreadResult implements da20 {
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final da20 result;

    public AnyThreadResult(da20 da20Var) {
        this.result = da20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$error$1(String str, String str2, Object obj) {
        this.result.error(str, str2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$success$0(Object obj) {
        this.result.success(obj);
    }

    private void post(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.handler.post(runnable);
        }
    }

    @Override // defpackage.da20
    public void error(String str, String str2, Object obj) {
        post(new l9(this, str, str2, obj, 4));
    }

    @Override // defpackage.da20
    public void notImplemented() {
        da20 da20Var = this.result;
        Objects.requireNonNull(da20Var);
        post(new jg(21, da20Var));
    }

    @Override // defpackage.da20
    public void success(Object obj) {
        post(new hc(21, this, obj));
    }
}
