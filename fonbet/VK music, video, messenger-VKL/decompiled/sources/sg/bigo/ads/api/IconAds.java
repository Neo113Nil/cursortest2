package sg.bigo.ads.api;

/* loaded from: classes9.dex */
public interface IconAds extends Ad {
    NativeAd[] getNativeAds();

    @Override // sg.bigo.ads.api.Ad
    @Deprecated
    void setAdInteractionListener(AdInteractionListener adInteractionListener);

    void setAdInteractionListener(d dVar);
}
