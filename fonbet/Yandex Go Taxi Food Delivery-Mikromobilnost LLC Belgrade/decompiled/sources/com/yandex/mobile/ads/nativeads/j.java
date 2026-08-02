package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdBindingResult;
import defpackage.a481;
import defpackage.fd81;
import defpackage.hk61;
import defpackage.jl40;
import defpackage.l081;
import defpackage.m171;
import defpackage.w511;
import defpackage.z681;

/* loaded from: classes7.dex */
public class j implements NativeAd {
    public final hk61 a;
    public final m171 b;

    public j(hk61 hk61Var) {
        m171 m171Var = new m171();
        this.a = hk61Var;
        this.b = m171Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final AdBindingResult bindNativeAd(NativeAdViewBinder nativeAdViewBinder) {
        z681 a = this.a.a(l.a(nativeAdViewBinder));
        if (a instanceof a481) {
            return AdBindingResult.Success.INSTANCE;
        }
        if (a instanceof l081) {
            l081 l081Var = (l081) a;
            return new AdBindingResult.Failure(l081Var.a, l081Var.b);
        }
        w511.b();
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && jl40.l(((j) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return new fd81(this.a.getAdAssets());
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
