package ru.ok.android.webrtc.utils;

import xsna.h7j;

/* loaded from: classes9.dex */
public interface Consumer<T> {
    static <T> Consumer<T> fromRunnable(final Runnable runnable) {
        return runnable == null ? new h7j() : new Consumer() { // from class: xsna.i7j
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                runnable.run();
            }
        };
    }

    void accept(T t);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$fromRunnable$0(Object obj) {
    }
}
