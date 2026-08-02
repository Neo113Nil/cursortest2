package ru.ok.android.externcalls.sdk.factory;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import ru.ok.android.webrtc.OKCameraCapturer;
import xsna.izs;
import xsna.ozl;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: JoinAnonByLinkParams.kt */
/* loaded from: classes9.dex */
public final class JoinAnonByLinkParams extends BaseCallParams<JoinAnonByLinkParams, Builder> {
    private final String apiEndpoint;
    private final String link;
    private final String token;

    /* compiled from: JoinAnonByLinkParams.kt */
    public static final class Builder extends BaseCallParams.Builder<JoinAnonByLinkParams, Builder> {
        private String apiEndpoint;
        private String link;
        private String token;

        public final Builder setLink(String str) {
            this.link = str;
            return this;
        }

        @ozl
        public final Builder setToken(String str) {
            this.token = str;
            return this;
        }

        public final Builder setTokenInfo(String str, String str2) {
            this.token = str;
            this.apiEndpoint = str2;
            return this;
        }

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public JoinAnonByLinkParams build() {
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
            String str2 = this.token;
            if (str2 == null) {
                throw new IllegalArgumentException("Token is required");
            }
            return new JoinAnonByLinkParams(str, str2, this.apiEndpoint, myId, getShouldStartWithVideo(), onPrepared, onError, getEventListener(), getFrameInterceptor(), getCameraCapturerFactory(), getFieldTrials(), null);
        }
    }

    public /* synthetic */ JoinAnonByLinkParams(String str, String str2, String str3, ParticipantId participantId, boolean z, izs izsVar, izs izsVar2, ConversationEventsListener conversationEventsListener, CapturedFrameInterceptor capturedFrameInterceptor, OKCameraCapturer.Factory factory, String str4, zcl zclVar) {
        this(str, str2, str3, participantId, z, izsVar, izsVar2, conversationEventsListener, capturedFrameInterceptor, factory, str4);
    }

    public final String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getToken() {
        return this.token;
    }

    private JoinAnonByLinkParams(String str, String str2, String str3, ParticipantId participantId, boolean z, izs<? super Conversation, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, ConversationEventsListener conversationEventsListener, CapturedFrameInterceptor capturedFrameInterceptor, OKCameraCapturer.Factory factory, String str4) {
        super(participantId, conversationEventsListener, izsVar, izsVar2, z, capturedFrameInterceptor, factory, str4);
        this.link = str;
        this.token = str2;
        this.apiEndpoint = str3;
    }
}
