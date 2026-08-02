package com.yandex.runtime.logging.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.logging.LogListener;
import com.yandex.runtime.logging.Logging;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes2.dex */
public class LoggingBinding implements Logging {
    protected Subscription<LogListener> logListenerSubscription = new Subscription<LogListener>(this) { // from class: com.yandex.runtime.logging.internal.LoggingBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(LogListener logListener) {
            return LoggingBinding.createLogListener(logListener);
        }
    };
    private final NativeObject nativeObject;

    public LoggingBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createLogListener(LogListener logListener);

    @Override // com.yandex.runtime.logging.Logging
    public native boolean isValid();

    @Override // com.yandex.runtime.logging.Logging
    public native void subscribe(LogListener logListener);

    @Override // com.yandex.runtime.logging.Logging
    public native void unsubscribe(LogListener logListener);
}
