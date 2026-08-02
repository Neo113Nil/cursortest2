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

/* compiled from: JoinByLinkParams.kt */
/* loaded from: classes9.dex */
public final class JoinByLinkParams extends BaseCallParams<JoinByLinkParams, Builder> {
    private final String link;
    private final String payload;
    private final ApiTokenInfoProvider tokenInfoProvider;
    private final TokenProvider tokenProvider;

    /* compiled from: JoinByLinkParams.kt */
    public static final class Builder extends BaseCallParams.Builder<JoinByLinkParams, Builder> {
        private String link;
        private String payload;
        private ApiTokenInfoProvider tokenInfoProvider;
        private TokenProvider tokenProvider;

        public final Builder setLink(String str) {
            this.link = str;
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

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public JoinByLinkParams build() {
            String str = this.link;
            if (str == null) {
                throw new IllegalArgumentException("Link is required");
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
            return new JoinByLinkParams(str, this.tokenProvider, this.tokenInfoProvider, this.payload, myId, onPrepared, onError, getShouldStartWithVideo(), eventListener, getFrameInterceptor(), getCameraCapturerFactory(), getFieldTrials(), null);
        }
    }

    public /* synthetic */ JoinByLinkParams(String str, TokenProvider tokenProvider, ApiTokenInfoProvider apiTokenInfoProvider, String str2, ParticipantId participantId, izs izsVar, izs izsVar2, boolean z, ConversationEventsListener conversationEventsListener, CapturedFrameInterceptor capturedFrameInterceptor, OKCameraCapturer.Factory factory, String str3, zcl zclVar) {
        this(str, tokenProvider, apiTokenInfoProvider, str2, participantId, izsVar, izsVar2, z, conversationEventsListener, capturedFrameInterceptor, factory, str3);
    }

    public final String getLink() {
        return this.link;
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

    private JoinByLinkParams(String str, TokenProvider tokenProvider, ApiTokenInfoProvider apiTokenInfoProvider, String str2, ParticipantId participantId, izs<? super Conversation, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, boolean z, ConversationEventsListener conversationEventsListener, CapturedFrameInterceptor capturedFrameInterceptor, OKCameraCapturer.Factory factory, String str3) {
        super(participantId, conversationEventsListener, izsVar, izsVar2, z, capturedFrameInterceptor, factory, str3);
        this.link = str;
        this.tokenProvider = tokenProvider;
        this.tokenInfoProvider = apiTokenInfoProvider;
        this.payload = str2;
    }
}
