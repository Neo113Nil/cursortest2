package ru.rustore.sdk.pushclient.l;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.k5z0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.NotificationIdDataSource", f = "NotificationIdDataSource.kt", l = {25, 26}, m = "compareAndSetLastClickedNotificationId")
/* loaded from: classes9.dex */
public final class m$b extends ContinuationImpl {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k5z0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m$b(k5z0 k5z0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = k5z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, this);
    }
}
