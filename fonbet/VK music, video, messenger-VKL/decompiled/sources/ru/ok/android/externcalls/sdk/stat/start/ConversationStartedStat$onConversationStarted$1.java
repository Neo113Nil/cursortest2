package ru.ok.android.externcalls.sdk.stat.start;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ConversationStartedStat.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class ConversationStartedStat$onConversationStarted$1 extends FunctionReferenceImpl implements izs<CallEventualStatSender, s3q0> {
    public ConversationStartedStat$onConversationStarted$1(Object obj) {
        super(1, obj, ConversationStartedStat.class, "report", "report(Lru/ok/android/webrtc/stat/call/methods/eventual/CallEventualStatSender;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(CallEventualStatSender callEventualStatSender) {
        invoke2(callEventualStatSender);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CallEventualStatSender callEventualStatSender) {
        ((ConversationStartedStat) this.receiver).report(callEventualStatSender);
    }
}
