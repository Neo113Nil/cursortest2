package ru.ok.android.externcalls.sdk.api.interceptor;

import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.interceptor.MethodListenerInterceptor;
import ru.ok.android.sdk.api.login.LoginResponse;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.zcl;

/* compiled from: LoginInterceptorListener.kt */
/* loaded from: classes9.dex */
public final class LoginInterceptorListener implements MethodListenerInterceptor.Listener<LoginResponse> {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "LoginInterceptorListener";

    /* renamed from: me, reason: collision with root package name */
    private final ConversationParticipant f106me;
    private final RTCLog rtcLog;

    /* compiled from: LoginInterceptorListener.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public LoginInterceptorListener(ConversationParticipant conversationParticipant, RTCLog rTCLog) {
        this.f106me = conversationParticipant;
        this.rtcLog = rTCLog;
    }

    @Override // ru.ok.android.externcalls.sdk.api.interceptor.MethodListenerInterceptor.Listener
    public void onMethod(LoginResponse loginResponse) {
        CallParticipant.ParticipantId fromStringValueSafe = CallParticipant.ParticipantId.fromStringValueSafe(loginResponse.uid);
        if (fromStringValueSafe == null) {
            return;
        }
        if (this.f106me.getInternalId() == null || !fromStringValueSafe.equals(this.f106me.getInternalId())) {
            this.rtcLog.log(LOG_TAG, "internalId updated from " + this.f106me.getInternalId() + " to " + fromStringValueSafe);
            this.f106me.setInternalId(fromStringValueSafe);
        }
    }
}
