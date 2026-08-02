package com.yandex.mobile.ads.nativeads;

/* loaded from: classes8.dex */
public interface NativeAd {
    void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    NativeAdAssets getAdAssets();

    void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener);
}
