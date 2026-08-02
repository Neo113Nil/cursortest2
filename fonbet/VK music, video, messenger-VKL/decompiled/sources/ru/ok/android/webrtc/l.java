package ru.ok.android.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.externcalls.sdk.exception.SubDomain;
import ru.ok.android.webrtc.events.destroy.HangupReasonMapper;
import ru.ok.android.webrtc.utils.HangupInfo;

/* loaded from: classes9.dex */
public final class l extends Handler {
    public final /* synthetic */ Call a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Call call) {
        super(Looper.getMainLooper());
        this.a = call;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 131) {
            if (i != 132) {
                return;
            }
            Call call = this.a;
            HangupReason hangupReason = HangupReason.CANCELED;
            HangupInfo hangupInfo = new HangupInfo(Collections.singleton(HangupInfo.HangupError.RINGING_TIMEOUT), null, new CallTerminatingException.Builder(Domain.INTERNAL, "ringing timeout").setSubDomain(SubDomain.RINGING_TIMEOUT).build().asString());
            call.logger.log("OKRTCCall", "💀 ".concat("ringing.timeout"));
            call.rejectReason = hangupReason;
            call.callEndInfoHolder.setReason(HangupReasonMapper.getCallEndReason(hangupReason, hangupInfo));
            call.b(CallEvents.PARTICIPANT_HANGUP, (Object) null);
            call.destroy("ringing.timeout", hangupReason);
            return;
        }
        Call call2 = this.a;
        HangupReason hangupReason2 = HangupReason.TIMEOUT;
        CallTerminatingException build = new CallTerminatingException.Builder(Domain.NETWORK, "pc timeout").setSubDomain(SubDomain.RTC).build();
        call2.logger.log("OKRTCCall", "💀 ".concat("pc.timeout"));
        call2.rejectReason = hangupReason2;
        call2.callEndInfoHolder.setReason(HangupReasonMapper.getCallEndReason(hangupReason2, null));
        if (build != null) {
            call2.callFinishReason = build;
        }
        call2.b(CallEvents.PARTICIPANT_HANGUP, (Object) null);
        call2.destroy("pc.timeout", hangupReason2);
    }
}
