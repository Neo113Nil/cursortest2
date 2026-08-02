package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;

/* loaded from: classes7.dex */
public abstract class c implements b {
    public final b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) {
        this.a.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) {
        this.a.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
        this.a.onAdRewarded(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public void onFailure(VungleError vungleError) {
        this.a.onFailure(vungleError);
    }
}
