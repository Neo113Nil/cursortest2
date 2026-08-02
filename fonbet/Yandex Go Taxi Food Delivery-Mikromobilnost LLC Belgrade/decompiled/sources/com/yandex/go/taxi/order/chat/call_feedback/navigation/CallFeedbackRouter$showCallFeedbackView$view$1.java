package com.yandex.go.taxi.order.chat.call_feedback.navigation;

import com.yandex.go.taxi.order.chat.call_feedback.ui.CallFeedbackTimedNotification;
import defpackage.qn5;
import defpackage.sh60;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CallFeedbackRouter$showCallFeedbackView$view$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        sh60 sh60Var = (sh60) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        CallFeedbackTimedNotification callFeedbackTimedNotification = new CallFeedbackTimedNotification("CallFeedbackTimedNotification", sh60Var.a, sh60Var.b, aVar.E, null, 0, 48, null);
        callFeedbackTimedNotification.setExpiresListener(new qn5(1, aVar, callFeedbackTimedNotification));
        aVar.G.e(callFeedbackTimedNotification);
        callFeedbackTimedNotification.startExpiresTimer();
        return zy11.a;
    }
}
