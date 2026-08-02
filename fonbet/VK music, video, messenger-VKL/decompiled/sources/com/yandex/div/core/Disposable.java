package com.yandex.div.core;

import java.io.Closeable;
import xsna.ggn;

/* compiled from: Disposable.kt */
/* loaded from: classes7.dex */
public interface Disposable extends AutoCloseable, Closeable {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Disposable NULL = new ggn();

    /* compiled from: Disposable.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    void close();

    /* JADX INFO: Access modifiers changed from: private */
    static void NULL$lambda$0() {
    }
}
