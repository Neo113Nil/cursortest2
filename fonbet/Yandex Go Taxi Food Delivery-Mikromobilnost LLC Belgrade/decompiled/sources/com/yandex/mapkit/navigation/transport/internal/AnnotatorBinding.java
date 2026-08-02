package com.yandex.mapkit.navigation.transport.internal;

import com.yandex.mapkit.annotations.Speaker;
import com.yandex.mapkit.navigation.transport.Annotator;
import com.yandex.mapkit.navigation.transport.AnnotatorListener;
import com.yandex.mapkit.navigation.transport.TransportAnnotationLanguage;
import com.yandex.mapkit.navigation.transport.UpcomingManoeuvre;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes15.dex */
public class AnnotatorBinding implements Annotator {
    private final NativeObject nativeObject;
    protected Subscription<Speaker> speakerSubscription = new Subscription<Speaker>(this) { // from class: com.yandex.mapkit.navigation.transport.internal.AnnotatorBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(Speaker speaker) {
            return AnnotatorBinding.createSpeaker(speaker);
        }
    };
    protected Subscription<AnnotatorListener> annotatorListenerSubscription = new Subscription<AnnotatorListener>(this) { // from class: com.yandex.mapkit.navigation.transport.internal.AnnotatorBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(AnnotatorListener annotatorListener) {
            return AnnotatorBinding.createAnnotatorListener(annotatorListener);
        }
    };

    public AnnotatorBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createAnnotatorListener(AnnotatorListener annotatorListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createSpeaker(Speaker speaker);

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native void addListener(AnnotatorListener annotatorListener);

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native TransportAnnotationLanguage getAnnotationLanguage();

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native int getEnabledAnnotations();

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native List<UpcomingManoeuvre> getManoeuvres();

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native boolean isValid();

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native void mute();

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native void removeListener(AnnotatorListener annotatorListener);

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native void setAnnotationLanguage(TransportAnnotationLanguage transportAnnotationLanguage);

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native void setEnabledAnnotations(int i);

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native void setSpeaker(Speaker speaker);

    @Override // com.yandex.mapkit.navigation.transport.Annotator
    public native void unmute();
}
