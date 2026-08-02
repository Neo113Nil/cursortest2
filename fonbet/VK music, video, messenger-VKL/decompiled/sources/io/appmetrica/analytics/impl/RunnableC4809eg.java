package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.eg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4809eg implements Runnable {
    public final File a;
    public final Consumer b;

    public RunnableC4809eg(File file, C5161s6 c5161s6) {
        this.a = file;
        this.b = c5161s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.a.exists() || !this.a.isDirectory() || (listFiles = this.a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
