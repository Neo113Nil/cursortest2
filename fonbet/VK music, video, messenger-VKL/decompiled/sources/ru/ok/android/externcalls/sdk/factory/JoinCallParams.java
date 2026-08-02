package ru.ok.android.externcalls.sdk.factory;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import ru.ok.android.webrtc.OKCameraCapturer;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: JoinCallParams.kt */
/* loaded from: classes9.dex */
public final class JoinCallParams extends BaseCallParams<JoinCallParams, Builder> {
    private final Long chatId;
    private final String conversationId;

    /* compiled from: JoinCallParams.kt */
    public static final class Builder extends BaseCallParams.Builder<JoinCallParams, Builder> {
        private Long chatId;
        private String conversationId;

        public final Builder setChatId(long j) {
            this.chatId = Long.valueOf(j);
            return this;
        }

        public final Builder setConversationId(String str) {
            this.conversationId = str;
            return this;
        }

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public JoinCallParams build() {
            String str = this.conversationId;
            if (str == null) {
                throw new IllegalArgumentException("Conversation id is required");
            }
            ParticipantId myId = getMyId();
            if (myId == null) {
                throw new IllegalArgumentException("Caller id is required");
            }
            izs<Conversation, s3q0> onPrepared = getOnPrepared();
            if (onPrepared == null) {
                throw new IllegalArgumentException("onPrepared callback is required");
            }
            izs<Throwable, s3q0> onError = getOnError();
            if (onError == null) {
                throw new IllegalArgumentException("onError callback is required");
            }
            ConversationEventsListener eventListener = getEventListener();
            return new JoinCallParams(str, this.chatId, myId, onPrepared, onError, getShouldStartWithVideo(), eventListener, getFrameInterceptor(), getCameraCapturerFactory(), getFieldTrials(), null);
        }
    }

    public /* synthetic */ JoinCallParams(String str, Long l, ParticipantId participantId, izs izsVar, izs izsVar2, boolean z, ConversationEventsListener conversationEventsListener, CapturedFrameInterceptor capturedFrameInterceptor, OKCameraCapturer.Factory factory, String str2, zcl zclVar) {
        this(str, l, participantId, izsVar, izsVar2, z, conversationEventsListener, capturedFrameInterceptor, factory, str2);
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    private JoinCallParams(String str, Long l, ParticipantId participantId, izs<? super Conversation, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, boolean z, ConversationEventsListener conversationEventsListener, CapturedFrameInterceptor capturedFrameInterceptor, OKCameraCapturer.Factory factory, String str2) {
        super(participantId, conversationEventsListener, izsVar, izsVar2, z, capturedFrameInterceptor, factory, str2);
        this.conversationId = str;
        this.chatId = l;
    }
}
