package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NotificationListFeatureV2.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2", f = "NotificationListFeatureV2.kt", l = {664}, m = "loadNotifications")
/* loaded from: classes4.dex */
public final class ab70 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wa70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab70(wa70 wa70Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wa70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c0(null, false, null, 0, false, this);
    }
}
