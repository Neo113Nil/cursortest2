package ru.ok.android.externcalls.sdk.stat.connect;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ConversationConnectedToSignalingStat.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class ConversationConnectedToSignalingStat$onConnectedToSignaling$1 extends FunctionReferenceImpl implements izs<CallEventualStatSender, s3q0> {
    public ConversationConnectedToSignalingStat$onConnectedToSignaling$1(Object obj) {
        super(1, obj, ConversationConnectedToSignalingStat.class, "report", "report(Lru/ok/android/webrtc/stat/call/methods/eventual/CallEventualStatSender;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(CallEventualStatSender callEventualStatSender) {
        invoke2(callEventualStatSender);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CallEventualStatSender callEventualStatSender) {
        ((ConversationConnectedToSignalingStat) this.receiver).report(callEventualStatSender);
    }
}
