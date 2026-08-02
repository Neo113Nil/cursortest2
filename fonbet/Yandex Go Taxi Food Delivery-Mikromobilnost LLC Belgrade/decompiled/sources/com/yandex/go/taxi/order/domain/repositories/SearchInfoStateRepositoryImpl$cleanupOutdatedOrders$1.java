package com.yandex.go.taxi.order.domain.repositories;

import com.yandex.passport.internal.ui.social.gimap.SmtpServerPrefsFragment;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl", f = "SearchInfoStateRepositoryImpl.kt", l = {403, SmtpServerPrefsFragment.DEFAULT_SMTP_PORT, 415}, m = "cleanupOutdatedOrders", v = 2)
/* loaded from: classes14.dex */
final class SearchInfoStateRepositoryImpl$cleanupOutdatedOrders$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInfoStateRepositoryImpl$cleanupOutdatedOrders$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n.a(this.this$0, null, this);
    }
}
