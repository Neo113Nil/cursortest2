package xsna;

import io.requery.android.database.sqlite.SQLiteStatementType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NotificationListCategoryTabsFeatureDelegate.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.delegate.NotificationListCategoryTabsFeatureDelegate", f = "NotificationListCategoryTabsFeatureDelegate.kt", l = {SQLiteStatementType.STATEMENT_OTHER}, m = "loadCategories")
/* loaded from: classes4.dex */
public final class sa70 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ua70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa70(ua70 ua70Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ua70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
