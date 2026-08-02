package com.yandex.go.taxi.order.chat.data;

import defpackage.sls;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class TaxiOrderChatRepository$handleResponse$result$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(((AtomicLong) this.receiver).getAndIncrement());
    }
}
