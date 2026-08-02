package com.yandex.go.taxi.order.feed.ui;

import defpackage.loq;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiOrderFlexView$onAttachedToWindow$2 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((TaxiOrderFlexView) this.receiver).updateFeed((loq) obj);
        return zy11.a;
    }
}
