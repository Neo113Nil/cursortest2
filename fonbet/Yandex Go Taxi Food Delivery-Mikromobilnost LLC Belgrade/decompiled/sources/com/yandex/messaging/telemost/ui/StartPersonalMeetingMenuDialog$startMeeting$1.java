package com.yandex.messaging.telemost.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.telemost.ui.StartPersonalMeetingMenuDialog", f = "StartPersonalMeetingMenuDialog.kt", l = {72}, m = "startMeeting")
/* loaded from: classes15.dex */
public final class StartPersonalMeetingMenuDialog$startMeeting$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StartPersonalMeetingMenuDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartPersonalMeetingMenuDialog$startMeeting$1(StartPersonalMeetingMenuDialog startPersonalMeetingMenuDialog, Continuation continuation) {
        super(continuation);
        this.this$0 = startPersonalMeetingMenuDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startMeeting;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startMeeting = this.this$0.startMeeting(null, this);
        return startMeeting;
    }
}
