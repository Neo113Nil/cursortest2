package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GroupedNotificationListFeature.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.grouped.GroupedNotificationListFeature", f = "GroupedNotificationListFeature.kt", l = {410}, m = "loadNotifications")
/* loaded from: classes4.dex */
public final class enu extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ gnu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enu(gnu gnuVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gnuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return gnu.U(this.this$0, null, this);
    }
}
