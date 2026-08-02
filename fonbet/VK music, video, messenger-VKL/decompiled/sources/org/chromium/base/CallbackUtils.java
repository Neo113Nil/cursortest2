package org.chromium.base;

import xsna.vb9;
import xsna.y19;

/* loaded from: classes8.dex */
public class CallbackUtils {
    private static final Callback DO_NOTHING_CALLBACK = new vb9();
    private static final Runnable DO_NOTHING_RUNNABLE = new y19(1);

    public static <T> Callback<T> emptyCallback() {
        return DO_NOTHING_CALLBACK;
    }

    public static Runnable emptyRunnable() {
        return DO_NOTHING_RUNNABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Object obj) {
    }
}
