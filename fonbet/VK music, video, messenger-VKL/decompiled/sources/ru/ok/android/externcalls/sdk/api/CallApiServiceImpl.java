package ru.ok.android.externcalls.sdk.api;

import android.annotation.SuppressLint;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.schedulers.a;
import ru.ok.android.externcalls.sdk.api.request.HangupConversation;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.HangupReason;
import ru.ok.android.webrtc.api.CallApiService;

/* compiled from: CallApiServiceImpl.kt */
/* loaded from: classes9.dex */
public final class CallApiServiceImpl implements CallApiService {
    private final String anonToken;
    private OkApiServiceInternal apiServiceImpl;
    private final ConversationIdProvider cidProvider;

    public CallApiServiceImpl(ConversationIdProvider conversationIdProvider, String str) {
        this.cidProvider = conversationIdProvider;
        this.anonToken = str;
    }

    public final OkApiServiceInternal getApiServiceImpl$calls_sdk_release() {
        return this.apiServiceImpl;
    }

    @Override // ru.ok.android.webrtc.api.CallApiService
    @SuppressLint({"CheckResult"})
    public void hangupConversation(HangupReason hangupReason) {
        x<HangupConversation.Response> hangupConversation;
        OkApiServiceInternal okApiServiceInternal = this.apiServiceImpl;
        if (okApiServiceInternal == null || (hangupConversation = okApiServiceInternal.hangupConversation(this.cidProvider.getConversationId(), hangupReason, this.anonToken)) == null) {
            return;
        }
        hangupConversation.q(a.b()).subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.api.CallApiServiceImpl$hangupConversation$1
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(HangupConversation.Response response) {
            }
        }, new f() { // from class: ru.ok.android.externcalls.sdk.api.CallApiServiceImpl$hangupConversation$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
            }
        });
    }

    public final void setApiServiceImpl(OkApiServiceInternal okApiServiceInternal) {
        this.apiServiceImpl = okApiServiceInternal;
    }
}
