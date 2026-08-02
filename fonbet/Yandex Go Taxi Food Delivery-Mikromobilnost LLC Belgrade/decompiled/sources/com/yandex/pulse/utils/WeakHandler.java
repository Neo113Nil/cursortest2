package com.yandex.pulse.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.u941;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/pulse/utils/WeakHandler;", "Landroid/os/Handler;", "Lu941;", "callback", "<init>", "(Lu941;)V", "Landroid/os/Looper;", "looper", "(Landroid/os/Looper;Lu941;)V", "Landroid/os/Message;", "m", "Lzy11;", "handleMessage", "(Landroid/os/Message;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WeakHandler extends Handler {
    private final WeakReference<u941> callback;

    public WeakHandler(u941 u941Var) {
        this.callback = new WeakReference<>(u941Var);
    }

    @Override // android.os.Handler
    public void handleMessage(Message m) {
        u941 u941Var = this.callback.get();
        if (u941Var == null) {
            return;
        }
        u941Var.handleMessage(m);
    }

    public WeakHandler(Looper looper, u941 u941Var) {
        super(looper);
        this.callback = new WeakReference<>(u941Var);
    }
}
