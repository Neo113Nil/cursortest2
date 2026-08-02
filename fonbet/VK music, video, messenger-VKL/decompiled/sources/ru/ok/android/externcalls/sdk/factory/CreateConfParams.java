package ru.ok.android.externcalls.sdk.factory;

import java.util.Collection;
import java.util.UUID;
import kotlin.collections.EmptyList;
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

/* compiled from: CreateConfParams.kt */
/* loaded from: classes9.dex */
public final class CreateConfParams extends BaseCallParams<CreateConfParams, Builder> {
    private final Long chatId;
    private final UUID conversationId;
    private final Collection<ParticipantId> initialIds;
    private final boolean isAnonForbidden;
    private final boolean isWaitingForAdminEnabled;
    private final boolean isWatchTogetherEnabledForAll;
    private final String payload;
    private final ApiTokenInfoProvider tokenInfoProvider;
    private final TokenProvider tokenProvider;

    /* compiled from: CreateConfParams.kt */
    public static final class Builder extends BaseCallParams.Builder<CreateConfParams, Builder> {
        private Long chatId;
        private UUID conversationId;
        private boolean isAnonForbidden;
        private boolean isWaitingForAdminEnabled;
        private String payload;
        private ApiTokenInfoProvider tokenInfoProvider;
        private TokenProvider tokenProvider;
        private Collection<ParticipantId> initialIds = EmptyList.b;
        private boolean isWatchTogetherEnabledForAll = true;

        public final Builder setAnonForbidden(boolean z) {
            this.isAnonForbidden = z;
            return this;
        }

        public final Builder setChatId(long j) {
            this.chatId = Long.valueOf(j);
            return this;
        }

        public final Builder setConversationId(UUID uuid) {
            this.conversationId = uuid;
            return this;
        }

        public final Builder setInitialIds(Collection<ParticipantId> collection) {
            this.initialIds = collection;
            return this;
        }

        public final Builder setPayload(String str) {
            this.payload = str;
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
        public CreateConfParams build() {
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
            CapturedFrameInterceptor frameInterceptor = getFrameInterceptor();
            TokenProvider tokenProvider = this.tokenProvider;
            ApiTokenInfoProvider apiTokenInfoProvider = this.tokenInfoProvider;
            boolean z = this.isAnonForbidden;
            boolean z2 = this.isWaitingForAdminEnabled;
            UUID uuid = this.conversationId;
            String str = this.payload;
            return new CreateConfParams(this.initialIds, tokenProvider, apiTokenInfoProvider, str, z, this.isWatchTogetherEnabledForAll, z2, uuid, this.chatId, shouldStartWithVideo, myId, onPrepared, onError, eventListener, frameInterceptor, getCameraCapturerFactory(), getFieldTrials(), null);
        }
    }

    public /* synthetic */ CreateConfParams(Collection collection, TokenProvider tokenProvider, ApiTokenInfoProvider apiTokenInfoProvider, String str, boolean z, boolean z2, boolean z3, UUID uuid, Long l, boolean z4, ParticipantId participantId, izs izsVar, izs izsVar2, ConversationEventsListener conversationEventsListener, CapturedFrameInterceptor capturedFrameInterceptor, OKCameraCapturer.Factory factory, String str2, zcl zclVar) {
        this(collection, tokenProvider, apiTokenInfoProvider, str, z, z2, z3, uuid, l, z4, participantId, izsVar, izsVar2, conversationEventsListener, capturedFrameInterceptor, factory, str2);
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final Collection<ParticipantId> getInitialIds() {
        return this.initialIds;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final ApiTokenInfoProvider getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final TokenProvider getTokenProvider() {
        return this.tokenProvider;
    }

    public final boolean isAnonForbidden() {
        return this.isAnonForbidden;
    }

    public final boolean isWaitingForAdminEnabled() {
        return this.isWaitingForAdminEnabled;
    }

    public final boolean isWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    private CreateConfParams(Collection<ParticipantId> collection, TokenProvider tokenProvider, ApiTokenInfoProvider apiTokenInfoProvider, String str, boolean z, boolean z2, boolean z3, UUID uuid, Long l, boolean z4, ParticipantId participantId, izs<? super Conversation, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, ConversationEventsListener conversationEventsListener, CapturedFrameInterceptor capturedFrameInterceptor, OKCameraCapturer.Factory factory, String str2) {
        super(participantId, conversationEventsListener, izsVar, izsVar2, z4, capturedFrameInterceptor, factory, str2);
        this.initialIds = collection;
        this.tokenProvider = tokenProvider;
        this.tokenInfoProvider = apiTokenInfoProvider;
        this.payload = str;
        this.isAnonForbidden = z;
        this.isWatchTogetherEnabledForAll = z2;
        this.isWaitingForAdminEnabled = z3;
        this.conversationId = uuid;
        this.chatId = l;
    }
}
