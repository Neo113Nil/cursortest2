package ru.ok.android.externcalls.sdk.stat.accept;

import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.gzs;
import xsna.md;
import xsna.nj;
import xsna.oj;
import xsna.s3q0;

/* compiled from: AcceptCallStat.kt */
/* loaded from: classes9.dex */
public final class AcceptCallStat extends SingleShotStat {
    public AcceptCallStat(gzs<? extends CallEventualStatSender> gzsVar) {
        super(gzsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 onAcceptCall$lambda$0(CallEventualStatSender callEventualStatSender) {
        CallEventualStatSender.send$default(callEventualStatSender, CallEventualStatName.CALL_ACCEPT_INCOMING, EventItemValueKt.toEventItemValue("concurrent"), null, 4, null);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 onAcceptCall$lambda$1(CallEventualStatSender callEventualStatSender) {
        CallEventualStatSender.send$default(callEventualStatSender, CallEventualStatName.CALL_ACCEPT_OUTGOING, null, null, 6, null);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 onAcceptCall$lambda$2(CallEventualStatSender callEventualStatSender) {
        CallEventualStatSender.send$default(callEventualStatSender, CallEventualStatName.CALL_ACCEPT_INCOMING, null, null, 6, null);
        return s3q0.a;
    }

    public final void onAcceptCall(boolean z, boolean z2, boolean z3) {
        if (z && z2 && z3) {
            reportOnce(new nj(0));
            return;
        }
        if (z && !z2 && !z3) {
            reportOnce(new md(1));
        } else {
            if (z || !z2 || z3) {
                return;
            }
            reportOnce(new oj(0));
        }
    }
}
