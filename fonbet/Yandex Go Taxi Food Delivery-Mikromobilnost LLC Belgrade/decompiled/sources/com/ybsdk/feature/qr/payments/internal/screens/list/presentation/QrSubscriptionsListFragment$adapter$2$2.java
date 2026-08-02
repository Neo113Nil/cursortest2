package com.ybsdk.feature.qr.payments.internal.screens.list.presentation;

import defpackage.p0v0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class QrSubscriptionsListFragment$adapter$2$2 extends FunctionReferenceImpl implements tls {
    public QrSubscriptionsListFragment$adapter$2$2(QrSubscriptionsListFragment qrSubscriptionsListFragment) {
        super(1, qrSubscriptionsListFragment, QrSubscriptionsListFragment.class, "showRemoveDialog", "showRemoveDialog(Lcom/ybsdk/feature/qr/payments/internal/screens/list/data/entities/SubscriptionEntity;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((QrSubscriptionsListFragment) this.receiver).showRemoveDialog((p0v0) obj);
        return zy11.a;
    }
}
