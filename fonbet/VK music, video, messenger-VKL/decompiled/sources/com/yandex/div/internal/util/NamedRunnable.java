package com.yandex.div.internal.util;

import androidx.annotation.NonNull;
import xsna.ho8;

/* loaded from: classes7.dex */
public abstract class NamedRunnable implements Runnable {

    @NonNull
    private final String mThreadSuffix;

    public NamedRunnable(@NonNull String str) {
        this.mThreadSuffix = str;
    }

    public abstract void execute();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread currentThread = Thread.currentThread();
        StringBuilder b = ho8.b(name, "-");
        b.append(this.mThreadSuffix);
        currentThread.setName(b.toString());
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
