package com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import defpackage.clk;
import defpackage.d250;
import defpackage.f250;
import defpackage.g250;
import defpackage.h250;
import defpackage.i250;
import defpackage.m020;
import defpackage.pdc;
import defpackage.plk;
import defpackage.rvo;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.json.JSONObject;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class a implements plk {
    public final h250 b;
    public final m020 c;
    public final sls d;
    public final tls e;
    public final pdc f;

    public a(h250 h250Var, m020 m020Var, sls slsVar, tls tlsVar, pdc pdcVar) {
        this.b = h250Var;
        this.c = m020Var;
        this.d = slsVar;
        this.e = tlsVar;
        this.f = pdcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007c A[SYNTHETIC] */
    @Override // defpackage.plk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        View assetView;
        d250 d250Var = NativeAdSlot.Companion;
        String str = clkVar.j;
        d250Var.getClass();
        NativeAdSlot a = d250.a(str);
        if (a == null) {
            return;
        }
        NativeAdViewBinder nativeAdViewBinder = null;
        NativeAdSlotContainerView nativeAdSlotContainerView = view instanceof NativeAdSlotContainerView ? (NativeAdSlotContainerView) view : null;
        if (nativeAdSlotContainerView == null || (assetView = nativeAdSlotContainerView.getAssetView()) == null) {
            return;
        }
        JSONObject jSONObject = clkVar.i;
        if (jSONObject != null) {
            nativeAdSlotContainerView.bind(a, jSONObject);
        }
        h250 h250Var = this.b;
        LinkedHashSet linkedHashSet = h250Var.b;
        LinkedHashMap linkedHashMap = h250Var.d;
        if (h250Var.e || !linkedHashSet.contains(a.getRole()) || linkedHashMap.containsKey(a.getRole())) {
            return;
        }
        linkedHashMap.put(a.getRole(), new f250(assetView, nativeAdSlotContainerView));
        if (!h250Var.e && linkedHashMap.keySet().containsAll(linkedHashSet)) {
            NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(h250Var.a);
            Iterator it = NativeAdSlot.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    NativeAdSlot nativeAdSlot = (NativeAdSlot) it.next();
                    f250 f250Var = (f250) linkedHashMap.get(nativeAdSlot.getRole());
                    if (f250Var != null) {
                        View view2 = f250Var.a;
                        switch (g250.a[nativeAdSlot.ordinal()]) {
                            case 1:
                                TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
                                if (textView != null) {
                                    builder = builder.setTitleView(textView);
                                    if (builder != null) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                            case 2:
                                TextView textView2 = view2 instanceof TextView ? (TextView) view2 : null;
                                if (textView2 != null) {
                                    builder = builder.setDomainView(textView2);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 3:
                                TextView textView3 = view2 instanceof TextView ? (TextView) view2 : null;
                                if (textView3 != null) {
                                    builder = builder.setWarningView(textView3);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 4:
                                TextView textView4 = view2 instanceof TextView ? (TextView) view2 : null;
                                if (textView4 != null) {
                                    builder = builder.setSponsoredView(textView4);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 5:
                                TextView textView5 = view2 instanceof TextView ? (TextView) view2 : null;
                                if (textView5 != null) {
                                    builder = builder.setBodyView(textView5);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 6:
                                TextView textView6 = view2 instanceof TextView ? (TextView) view2 : null;
                                if (textView6 != null) {
                                    builder = builder.setPriceView(textView6);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 7:
                                TextView textView7 = view2 instanceof TextView ? (TextView) view2 : null;
                                if (textView7 != null) {
                                    builder = builder.setAgeView(textView7);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 8:
                                TextView textView8 = view2 instanceof TextView ? (TextView) view2 : null;
                                if (textView8 != null) {
                                    builder = builder.setReviewCountView(textView8);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 9:
                                TextView textView9 = view2 instanceof TextView ? (TextView) view2 : null;
                                if (textView9 != null) {
                                    builder = builder.setCallToActionView(textView9);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 10:
                                ImageView imageView = view2 instanceof ImageView ? (ImageView) view2 : null;
                                if (imageView != null) {
                                    builder = builder.setFeedbackView(imageView);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 11:
                                ImageView imageView2 = view2 instanceof ImageView ? (ImageView) view2 : null;
                                if (imageView2 != null) {
                                    builder = builder.setIconView(imageView2);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 12:
                                ImageView imageView3 = view2 instanceof ImageView ? (ImageView) view2 : null;
                                if (imageView3 != null) {
                                    builder = builder.setFaviconView(imageView3);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 13:
                                MediaView mediaView = view2 instanceof MediaView ? (MediaView) view2 : null;
                                if (mediaView != null) {
                                    builder = builder.setMediaView(mediaView);
                                    if (builder != null) {
                                    }
                                }
                                builder = null;
                                if (builder != null) {
                                }
                                break;
                            case 14:
                                if (builder != null) {
                                }
                                break;
                            default:
                                w511.b();
                                break;
                        }
                    }
                } else {
                    nativeAdViewBinder = builder.build();
                }
            }
            if (nativeAdViewBinder == null) {
                return;
            }
            h250Var.e = true;
            ((MobileAdsNativeBannerView$configure$registry$1) h250Var.c).invoke(nativeAdViewBinder);
        }
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        d250 d250Var = NativeAdSlot.Companion;
        String str = clkVar.j;
        d250Var.getClass();
        NativeAdSlot a = d250.a(str);
        Context context = div2View.getContext();
        NativeAdSlotContainerView nativeAdSlotContainerView = new NativeAdSlotContainerView(context, this.f, this.d);
        if (a != null) {
            int i = i250.a[a.ordinal()];
            View nativeAdShimmerImageView = i != 1 ? (i == 2 || i == 3) ? new NativeAdShimmerImageView(context, this.c, this.e) : i != 4 ? i != 5 ? new RobotoTextView(context, null, 0, 6, null) : new FrameLayout(context) : new GoImageView(context, null, 0, 6, null) : new MediaView(context);
            nativeAdSlotContainerView.setAssetView(nativeAdShimmerImageView);
            nativeAdSlotContainerView.addView(nativeAdShimmerImageView, new FrameLayout.LayoutParams(-1, -1));
        }
        return nativeAdSlotContainerView;
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        NativeAdSlot.Companion.getClass();
        return d250.a(str) != null;
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
    }
}
