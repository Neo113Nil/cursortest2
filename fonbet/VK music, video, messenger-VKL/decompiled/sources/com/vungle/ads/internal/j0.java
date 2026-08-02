package com.vungle.ads.internal;

import com.vungle.ads.VungleError;

/* loaded from: classes7.dex */
public final class j0 extends com.vungle.ads.internal.presenter.c {
    public final /* synthetic */ k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.vungle.ads.internal.presenter.b bVar, k0 k0Var) {
        super(bVar);
        this.b = k0Var;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdEnd(String str) {
        this.b.a(h.f);
        this.a.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdImpression(String str) {
        this.b.a(h.e);
        this.a.onAdImpression(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdStart(String str) {
        this.b.a(h.d);
        this.a.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
    public final void onFailure(VungleError vungleError) {
        this.b.a(h.g);
        super.onFailure(vungleError);
    }
}
