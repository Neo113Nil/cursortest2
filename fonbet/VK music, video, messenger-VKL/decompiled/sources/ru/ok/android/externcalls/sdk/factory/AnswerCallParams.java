package ru.ok.android.externcalls.sdk.factory;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.sdk.api.TokenProvider;
import ru.ok.android.sdk.api.token.ApiTokenInfoProvider;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import ru.ok.android.webrtc.OKCameraCapturer;
import xsna.izs;
import xsna.ozl;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: AnswerCallParams.kt */
/* loaded from: classes9.dex */
public final class AnswerCallParams extends BaseCallParams<AnswerCallParams, Builder> {
    private final boolean answerAsContact;
    private final String conversationId;
    private final String conversationParams;
    private final ParticipantId opponentId;
    private final ApiTokenInfoProvider tokenInfoProvider;
    private final TokenProvider tokenProvider;

    /* compiled from: AnswerCallParams.kt */
    public static final class Builder extends BaseCallParams.Builder<AnswerCallParams, Builder> {
        private boolean answerAsContact;
        private String conversationId;
        private String conversationParams;
        private ParticipantId opponentId;
        private ApiTokenInfoProvider tokenInfoProvider;
        private TokenProvider tokenProvider;

        public final Builder setAnswerAsContact(boolean z) {
            this.answerAsContact = z;
            return this;
        }

        public final Builder setConversationId(String str) {
            this.conversationId = str;
            return this;
        }

        public final Builder setConversationParams(String str) {
            this.conversationParams = str;
            return this;
        }

        public final Builder setOpponentId(ParticipantId participantId) {
            this.opponentId = participantId;
            return this;
        }

        public final Builder setTokenInfoProvider(ApiTokenInfoProvider apiTokenInfoProvider) {
            this.tokenInfoProvider = apiTokenInfoProvider;
            return this;
        }

        @ozl
        public final Builder setTokenProvider(TokenProvider tokenProvider) {
            this.tokenProvider = tokenProvider;
            return this;
        }

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public AnswerCallParams build() {
            String str = this.conversationId;
            if (str == null) {
                throw new IllegalArgumentException("Conversation id is required");
            }
            ParticipantId participantId = this.opponentId;
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
            boolean shouldStartWithVideo = getShouldStartWithVideo();
            boolean z = this.answerAsContact;
            CapturedFrameInterceptor frameInterceptor = getFrameInterceptor();
            return new AnswerCallParams(str, participantId, z, this.tokenProvider, this.tokenInfoProvider, this.conversationParams, myId, shouldStartWithVideo, frameInterceptor, eventListener, onPrepared, onError, getCameraCapturerFactory(), getFieldTrials(), null);
        }
    }

    public /* synthetic */ AnswerCallParams(String str, ParticipantId participantId, boolean z, TokenProvider tokenProvider, ApiTokenInfoProvider apiTokenInfoProvider, String str2, ParticipantId participantId2, boolean z2, CapturedFrameInterceptor capturedFrameInterceptor, ConversationEventsListener conversationEventsListener, izs izsVar, izs izsVar2, OKCameraCapturer.Factory factory, String str3, zcl zclVar) {
        this(str, participantId, z, tokenProvider, apiTokenInfoProvider, str2, participantId2, z2, capturedFrameInterceptor, conversationEventsListener, izsVar, izsVar2, factory, str3);
    }

    public final boolean getAnswerAsContact() {
        return this.answerAsContact;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationParams() {
        return this.conversationParams;
    }

    public final ParticipantId getOpponentId() {
        return this.opponentId;
    }

    public final ApiTokenInfoProvider getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final TokenProvider getTokenProvider() {
        return this.tokenProvider;
    }

    private AnswerCallParams(String str, ParticipantId participantId, boolean z, TokenProvider tokenProvider, ApiTokenInfoProvider apiTokenInfoProvider, String str2, ParticipantId participantId2, boolean z2, CapturedFrameInterceptor capturedFrameInterceptor, ConversationEventsListener conversationEventsListener, izs<? super Conversation, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, OKCameraCapturer.Factory factory, String str3) {
        super(participantId2, conversationEventsListener, izsVar, izsVar2, z2, capturedFrameInterceptor, factory, str3);
        this.conversationId = str;
        this.opponentId = participantId;
        this.answerAsContact = z;
        this.tokenProvider = tokenProvider;
        this.tokenInfoProvider = apiTokenInfoProvider;
        this.conversationParams = str2;
    }
}
