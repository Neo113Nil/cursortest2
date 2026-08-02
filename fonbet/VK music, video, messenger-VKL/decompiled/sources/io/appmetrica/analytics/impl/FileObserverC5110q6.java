package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class FileObserverC5110q6 extends FileObserver {
    public final Consumer a;
    public final File b;
    public final C5010ma c;

    public FileObserverC5110q6(File file, C5161s6 c5161s6, C5010ma c5010ma) {
        super(file.getAbsolutePath(), 8);
        this.a = c5161s6;
        this.b = file;
        this.c = c5010ma;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.a;
        C5010ma c5010ma = this.c;
        File file = this.b;
        c5010ma.getClass();
        consumer.consume(new File(file, str));
    }
}
