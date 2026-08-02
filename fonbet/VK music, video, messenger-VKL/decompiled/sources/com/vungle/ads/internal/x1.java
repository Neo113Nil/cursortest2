package com.vungle.ads.internal;

/* loaded from: classes7.dex */
public final class x1 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    public x1(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return new com.vungle.ads.internal.bidding.e(this.b.a);
    }
}
