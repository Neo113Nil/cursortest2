package ru.ok.android.externcalls.sdk.factory;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import ru.ok.android.webrtc.OKCameraCapturer;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.gzs;
import xsna.izs;
import xsna.ozl;
import xsna.p76;
import xsna.s3q0;

/* compiled from: BaseCallParams.kt */
/* loaded from: classes9.dex */
public abstract class BaseCallParams<T, B extends Builder<T, B>> {
    private final OKCameraCapturer.Factory cameraCapturerFactory;
    private final ConversationEventsListener eventListener;
    private final String fieldTrials;
    private final CapturedFrameInterceptor frameInterceptor;
    private final ParticipantId myId;
    private final izs<Throwable, s3q0> onError;
    private final izs<Conversation, s3q0> onPrepared;
    private final boolean shouldStartWithVideo;

    /* compiled from: BaseCallParams.kt */
    public static abstract class Builder<T, B extends Builder<T, B>> {
        private OKCameraCapturer.Factory cameraCapturerFactory;
        private ConversationEventsListener eventListener;
        private String fieldTrials;
        private CapturedFrameInterceptor frameInterceptor;
        private ParticipantId myId;
        private izs<? super Throwable, s3q0> onError;
        private izs<? super Conversation, s3q0> onPrepared;
        private boolean shouldStartWithVideo;

        public abstract T build();

        public final OKCameraCapturer.Factory getCameraCapturerFactory() {
            return this.cameraCapturerFactory;
        }

        public final ConversationEventsListener getEventListener() {
            return this.eventListener;
        }

        public final String getFieldTrials() {
            return this.fieldTrials;
        }

        public final CapturedFrameInterceptor getFrameInterceptor() {
            return this.frameInterceptor;
        }

        public final ParticipantId getMyId() {
            return this.myId;
        }

        public final izs<Throwable, s3q0> getOnError() {
            return this.onError;
        }

        public final izs<Conversation, s3q0> getOnPrepared() {
            return this.onPrepared;
        }

        public final boolean getShouldStartWithVideo() {
            return this.shouldStartWithVideo;
        }

        /* renamed from: setCameraCapturerFactory, reason: collision with other method in class */
        public final void m341setCameraCapturerFactory(OKCameraCapturer.Factory factory) {
            this.cameraCapturerFactory = factory;
        }

        /* renamed from: setEventListener, reason: collision with other method in class */
        public final void m342setEventListener(ConversationEventsListener conversationEventsListener) {
            this.eventListener = conversationEventsListener;
        }

        /* renamed from: setFieldTrials, reason: collision with other method in class */
        public final void m343setFieldTrials(String str) {
            this.fieldTrials = str;
        }

        /* renamed from: setFrameInterceptor, reason: collision with other method in class */
        public final void m344setFrameInterceptor(CapturedFrameInterceptor capturedFrameInterceptor) {
            this.frameInterceptor = capturedFrameInterceptor;
        }

        /* renamed from: setMyId, reason: collision with other method in class */
        public final void m345setMyId(ParticipantId participantId) {
            this.myId = participantId;
        }

        /* renamed from: setOnError, reason: collision with other method in class */
        public final void m346setOnError(izs<? super Throwable, s3q0> izsVar) {
            this.onError = izsVar;
        }

        /* renamed from: setOnPrepared, reason: collision with other method in class */
        public final void m347setOnPrepared(izs<? super Conversation, s3q0> izsVar) {
            this.onPrepared = izsVar;
        }

        public final void setShouldStartWithVideo(boolean z) {
            this.shouldStartWithVideo = z;
        }

        public final B setStartWithVideo(boolean z) {
            this.shouldStartWithVideo = z;
            return this;
        }

        public final B setCameraCapturerFactory(OKCameraCapturer.Factory factory) {
            this.cameraCapturerFactory = factory;
            return this;
        }

        public final B setEventListener(ConversationEventsListener conversationEventsListener) {
            this.eventListener = conversationEventsListener;
            return this;
        }

        public final B setFieldTrials(String str) {
            this.fieldTrials = str;
            return this;
        }

        public final B setFrameInterceptor(CapturedFrameInterceptor capturedFrameInterceptor) {
            this.frameInterceptor = capturedFrameInterceptor;
            return this;
        }

        public final B setMyId(ParticipantId participantId) {
            this.myId = participantId;
            return this;
        }

        public final B setOnError(izs<? super Throwable, s3q0> izsVar) {
            this.onError = izsVar;
            return this;
        }

        public B setOnPrepared(izs<? super Conversation, s3q0> izsVar) {
            this.onPrepared = izsVar;
            return this;
        }

        public final B setOnError(Consumer<Throwable> consumer) {
            this.onError = new BaseCallParams$Builder$setOnError$1(consumer);
            return this;
        }

        public final B setOnPrepared(Consumer<Conversation> consumer) {
            this.onPrepared = new BaseCallParams$Builder$setOnPrepared$1(consumer);
            return this;
        }

        @ozl
        public final B setOnPrepared(gzs<s3q0> gzsVar) {
            setOnPrepared(Consumer.fromRunnable(new p76(0, gzsVar)));
            return this;
        }

        @ozl
        public final B setOnPrepared(Runnable runnable) {
            setOnPrepared(Consumer.fromRunnable(runnable));
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseCallParams(ParticipantId participantId, ConversationEventsListener conversationEventsListener, izs<? super Conversation, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, boolean z, CapturedFrameInterceptor capturedFrameInterceptor, OKCameraCapturer.Factory factory, String str) {
        this.myId = participantId;
        this.eventListener = conversationEventsListener;
        this.onPrepared = izsVar;
        this.onError = izsVar2;
        this.shouldStartWithVideo = z;
        this.frameInterceptor = capturedFrameInterceptor;
        this.cameraCapturerFactory = factory;
        this.fieldTrials = str;
    }

    public final OKCameraCapturer.Factory getCameraCapturerFactory() {
        return this.cameraCapturerFactory;
    }

    public final ConversationEventsListener getEventListener() {
        return this.eventListener;
    }

    public final String getFieldTrials() {
        return this.fieldTrials;
    }

    public final CapturedFrameInterceptor getFrameInterceptor() {
        return this.frameInterceptor;
    }

    public final ParticipantId getMyId() {
        return this.myId;
    }

    public final izs<Throwable, s3q0> getOnError() {
        return this.onError;
    }

    public final izs<Conversation, s3q0> getOnPrepared() {
        return this.onPrepared;
    }

    public final boolean getShouldStartWithVideo() {
        return this.shouldStartWithVideo;
    }
}
