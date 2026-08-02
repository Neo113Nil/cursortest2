package com.yandex.go.taxi.order.state;

import defpackage.p1t;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class HorizontalButtonsPresenter$attachView$14$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        p1t p1tVar = (p1t) obj;
        p1t p1tVar2 = (p1t) obj2;
        ((e) this.receiver).getClass();
        return Boolean.valueOf(p1tVar.a == p1tVar2.a && p1tVar.b == p1tVar2.b && p1tVar.c == p1tVar2.c);
    }
}
