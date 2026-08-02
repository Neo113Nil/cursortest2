package ru.ok.android.externcalls.sdk.factory;

import java.util.UUID;
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

/* compiled from: StartCallParams.kt */
/* loaded from: classes9.dex */
public final class StartCallParams extends BaseCallParams<StartCallParams, Builder> {
    private final Long chatId;
    private final UUID conversationId;
    private final boolean isWaitingForAdminEnabled;
    private final boolean isWatchTogetherEnabledForAll;
    private final ParticipantId opponentId;
    private final String payload;
    private final long ringingTimeout;
    private final ApiTokenInfoProvider tokenInfoProvider;
    private final TokenProvider tokenProvider;

    /* compiled from: StartCallParams.kt */
    public static final class Builder extends BaseCallParams.Builder<StartCallParams, Builder> {
        private Long chatId;
        private UUID conversationId;
        private boolean isWaitingForAdminEnabled;
        private boolean isWatchTogetherEnabledForAll;
        private ParticipantId opponentId;
        private String payload;
        private long ringingTimeout;
        private ApiTokenInfoProvider tokenInfoProvider;
        private TokenProvider tokenProvider;

        public final Builder setChatId(long j) {
            this.chatId = Long.valueOf(j);
            return this;
        }

        public final Builder setConversationId(UUID uuid) {
            this.conversationId = uuid;
            return this;
        }

        public final Builder setOpponentId(ParticipantId participantId) {
            this.opponentId = participantId;
            return this;
        }

        public final Builder setPayload(String str) {
            this.payload = str;
            return this;
        }

        public final Builder setRingingTimeout(long j) {
            this.ringingTimeout = j;
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

        public final Builder setWaitingForAdminEnabled(boolean z) {
            this.isWaitingForAdminEnabled = z;
            return this;
        }

        public final Builder setWatchTogetherEnabledForAll(boolean z) {
            this.isWatchTogetherEnabledForAll = z;
            return this;
        }

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public StartCallParams build() {
            if (this.chatId == null && this.opponentId == null) {
                throw new IllegalArgumentException("target should exist: userId, callId or groupId");
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
            boolean shouldStartWithVideo = getShouldStartWithVideo();
            boolean z = this.isWaitingForAdminEnabled;
            UUID uuid = this.conversationId;
            long j = this.ringingTimeout;
            ConversationEventsListener eventListener = getEventListener();
            ParticipantId participantId = this.opponentId;
            Long l = this.chatId;
            return new StartCallParams(participantId, this.payload, this.tokenProvider, this.tokenInfoProvider, l, this.isWatchTogetherEnabledForAll, z, uuid, j, myId, onPrepared, onError, getFrameInterceptor(), eventListener, getCameraCapturerFactory(), shouldStartWithVideo, getFieldTrials(), null);
        }
    }

    public /* synthetic */ StartCallParams(ParticipantId participantId, String str, TokenProvider tokenProvider, ApiTokenInfoProvider apiTokenInfoProvider, Long l, boolean z, boolean z2, UUID uuid, long j, ParticipantId participantId2, izs izsVar, izs izsVar2, CapturedFrameInterceptor capturedFrameInterceptor, ConversationEventsListener conversationEventsListener, OKCameraCapturer.Factory factory, boolean z3, String str2, zcl zclVar) {
        this(participantId, str, tokenProvider, apiTokenInfoProvider, l, z, z2, uuid, j, participantId2, izsVar, izsVar2, capturedFrameInterceptor, conversationEventsListener, factory, z3, str2);
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final ParticipantId getOpponentId() {
        return this.opponentId;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final long getRingingTimeout() {
        return this.ringingTimeout;
    }

    public final ApiTokenInfoProvider getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final TokenProvider getTokenProvider() {
        return this.tokenProvider;
    }

    public final boolean isWaitingForAdminEnabled() {
        return this.isWaitingForAdminEnabled;
    }

    public final boolean isWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    private StartCallParams(ParticipantId participantId, String str, TokenProvider tokenProvider, ApiTokenInfoProvider apiTokenInfoProvider, Long l, boolean z, boolean z2, UUID uuid, long j, ParticipantId participantId2, izs<? super Conversation, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, CapturedFrameInterceptor capturedFrameInterceptor, ConversationEventsListener conversationEventsListener, OKCameraCapturer.Factory factory, boolean z3, String str2) {
        super(participantId2, conversationEventsListener, izsVar, izsVar2, z3, capturedFrameInterceptor, factory, str2);
        this.opponentId = participantId;
        this.payload = str;
        this.tokenProvider = tokenProvider;
        this.tokenInfoProvider = apiTokenInfoProvider;
        this.chatId = l;
        this.isWatchTogetherEnabledForAll = z;
        this.isWaitingForAdminEnabled = z2;
        this.conversationId = uuid;
        this.ringingTimeout = j;
    }
}
