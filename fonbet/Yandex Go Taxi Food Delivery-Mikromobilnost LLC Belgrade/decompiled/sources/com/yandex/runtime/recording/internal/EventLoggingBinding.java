package com.yandex.runtime.recording.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.recording.EventListener;
import com.yandex.runtime.recording.EventLogging;
import com.yandex.runtime.recording.LoggingLevel;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes8.dex */
public class EventLoggingBinding implements EventLogging {
    protected Subscription<EventListener> eventListenerSubscription = new Subscription<EventListener>(this) { // from class: com.yandex.runtime.recording.internal.EventLoggingBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(EventListener eventListener) {
            return EventLoggingBinding.createEventListener(eventListener);
        }
    };
    private final NativeObject nativeObject;

    public EventLoggingBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createEventListener(EventListener eventListener);

    @Override // com.yandex.runtime.recording.EventLogging
    public native boolean isValid();

    @Override // com.yandex.runtime.recording.EventLogging
    public native void subscribe(EventListener eventListener);

    @Override // com.yandex.runtime.recording.EventLogging
    public native void subscribe(EventListener eventListener, LoggingLevel loggingLevel);

    @Override // com.yandex.runtime.recording.EventLogging
    public native void unsubscribe(EventListener eventListener);
}
