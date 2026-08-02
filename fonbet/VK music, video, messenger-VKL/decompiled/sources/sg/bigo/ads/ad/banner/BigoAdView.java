package sg.bigo.ads.ad.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.api.InnerBannerAd;

/* loaded from: classes9.dex */
public class BigoAdView extends sg.bigo.ads.api.a<sg.bigo.ads.core.adview.d> implements Ad {
    private BannerAd a;
    private AdLoadListener<BigoAdView> b;
    private ViewGroup.LayoutParams c;
    private final AdLoadListener<BannerAd> d;

    public BigoAdView(@NonNull Context context) {
        super(context);
        this.d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(@NonNull BannerAd bannerAd) {
                BigoAdView.this.a = bannerAd;
                BigoAdView.this.a(true);
                if (BigoAdView.this.b != null) {
                    BigoAdView.this.b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(@NonNull AdError adError) {
                if (BigoAdView.this.b != null) {
                    BigoAdView.this.b.onError(adError);
                }
            }
        };
    }

    @Override // sg.bigo.ads.api.Ad
    public void destroy() {
        BannerAd bannerAd = this.a;
        if (bannerAd != null) {
            bannerAd.destroy();
        }
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public AdBid getBid() {
        BannerAd bannerAd = this.a;
        if (bannerAd != null) {
            return bannerAd.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        BannerAd bannerAd = this.a;
        if (bannerAd != null) {
            return bannerAd.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getExtraInfo(String str) {
        BannerAd bannerAd = this.a;
        if (bannerAd != null) {
            return bannerAd.getExtraInfo(str);
        }
        return null;
    }

    public int getHeightInDP() {
        BannerAd bannerAd = this.a;
        if (bannerAd != null) {
            return bannerAd.getHeight();
        }
        return 0;
    }

    public int getWidthInDP() {
        BannerAd bannerAd = this.a;
        if (bannerAd != null) {
            return bannerAd.getWidth();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        BannerAd bannerAd = this.a;
        if (bannerAd != null) {
            return bannerAd.isExpired();
        }
        return false;
    }

    public void loadAd(BannerAdRequest bannerAdRequest) {
        new BannerAdLoader.Builder().withAdLoadListener(this.d).build().loadAd((BannerAdLoader) bannerAdRequest);
    }

    @Override // sg.bigo.ads.api.Ad
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        BannerAd bannerAd = this.a;
        if (bannerAd != null) {
            bannerAd.setAdInteractionListener(adInteractionListener);
        }
    }

    public void setAdLoadListener(AdLoadListener<BigoAdView> adLoadListener) {
        this.b = adLoadListener;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.c = layoutParams;
        a(false);
        super.setLayoutParams(layoutParams);
    }

    public BigoAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(@NonNull BannerAd bannerAd) {
                BigoAdView.this.a = bannerAd;
                BigoAdView.this.a(true);
                if (BigoAdView.this.b != null) {
                    BigoAdView.this.b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(@NonNull AdError adError) {
                if (BigoAdView.this.b != null) {
                    BigoAdView.this.b.onError(adError);
                }
            }
        };
    }

    @Override // java.lang.Comparable
    public int compareTo(Ad ad) {
        BannerAd bannerAd = this.a;
        if (bannerAd != null) {
            return bannerAd.compareTo(ad);
        }
        return 0;
    }

    public void loadAd(BannerAdRequest bannerAdRequest, String str) {
        new BannerAdLoader.Builder().withAdLoadListener(this.d).withExt(str).build().loadAd((BannerAdLoader) bannerAdRequest);
    }

    public BigoAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(@NonNull BannerAd bannerAd) {
                BigoAdView.this.a = bannerAd;
                BigoAdView.this.a(true);
                if (BigoAdView.this.b != null) {
                    BigoAdView.this.b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(@NonNull AdError adError) {
                if (BigoAdView.this.b != null) {
                    BigoAdView.this.b.onError(adError);
                }
            }
        };
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.core.adview.d a() {
        return new sg.bigo.ads.core.adview.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        BannerAd bannerAd = this.a;
        if (!(bannerAd instanceof InnerBannerAd) || bannerAd.adView() == null) {
            return;
        }
        View adView = this.a.adView();
        int a = sg.bigo.ads.common.utils.f.a(getContext(), this.a.getWidth());
        int a2 = sg.bigo.ads.common.utils.f.a(getContext(), this.a.getHeight());
        BannerAd bannerAd2 = this.a;
        if ((bannerAd2 instanceof i) && (((i) bannerAd2).y instanceof e) && (layoutParams = this.c) != null) {
            int i = -2 == layoutParams.width ? a : 1;
            int i2 = -2 == layoutParams.height ? a2 : 1;
            if (i != 1 || 1 == bannerAd2.getWidth()) {
                a = i;
            } else {
                int i3 = this.c.width;
                if (-1 == i3 || i3 > 1) {
                    a = i3;
                }
            }
            if (i2 != 1 || 1 == this.a.getHeight()) {
                a2 = i2;
            } else {
                int i4 = this.c.height;
                if (-1 == i4 || i4 > 1) {
                    a2 = i4;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams2 = adView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(a, a2);
        } else {
            layoutParams2.width = a;
            layoutParams2.height = a2;
        }
        if (((InnerBannerAd) this.a).getWebView() != null) {
            ViewGroup.LayoutParams layoutParams3 = ((InnerBannerAd) this.a).getWebView().getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new FrameLayout.LayoutParams(a, a2);
            } else {
                layoutParams3.width = a;
                layoutParams3.height = a2;
            }
            ((InnerBannerAd) this.a).getWebView().setLayoutParams(layoutParams3);
        }
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        adView.setLayoutParams(layoutParams2);
        if (z) {
            removeAllViews();
            addView(adView);
        }
    }
}
