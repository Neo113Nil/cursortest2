package com.yandex.mobile.ads.nativeads;

import xsna.epx;
import yads.iu3;
import yads.k12;
import yads.nu3;
import yads.os3;
import yads.tm;
import yads.vu3;
import yads.x12;

/* loaded from: classes8.dex */
public class d implements NativeAd {
    public final x12 a;
    public final f b;
    public final vu3 c;
    public final tm d;

    public /* synthetic */ d(x12 x12Var) {
        this(x12Var, new f(), new vu3(), new tm());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) {
        try {
            this.b.getClass();
            this.a.a(f.a(nativeAdViewBinder));
        } catch (k12 e) {
            throw new NativeAdException(e.b, e);
        } catch (Throwable th) {
            throw new NativeAdException("Ad binding failed with unexpected exception", th);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && epx.f(((d) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return new iu3(this.a.getAdAssets());
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        this.a.a(nativeAdEventListener instanceof ClosableNativeAdEventListener ? new os3((ClosableNativeAdEventListener) nativeAdEventListener) : nativeAdEventListener != null ? new nu3(nativeAdEventListener) : null);
    }

    public d(x12 x12Var, f fVar, vu3 vu3Var, tm tmVar) {
        this.a = x12Var;
        this.b = fVar;
        this.c = vu3Var;
        this.d = tmVar;
    }
}
