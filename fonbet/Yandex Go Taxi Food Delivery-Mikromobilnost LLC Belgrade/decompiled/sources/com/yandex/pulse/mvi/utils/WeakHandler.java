package com.yandex.pulse.mvi.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.v941;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class WeakHandler extends Handler {
    private final WeakReference<v941> mCallback;

    public WeakHandler(v941 v941Var) {
        this.mCallback = new WeakReference<>(v941Var);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        v941 v941Var = this.mCallback.get();
        if (v941Var == null) {
            return;
        }
        v941Var.a();
    }

    public WeakHandler(Looper looper, v941 v941Var) {
        super(looper);
        this.mCallback = new WeakReference<>(v941Var);
    }
}
