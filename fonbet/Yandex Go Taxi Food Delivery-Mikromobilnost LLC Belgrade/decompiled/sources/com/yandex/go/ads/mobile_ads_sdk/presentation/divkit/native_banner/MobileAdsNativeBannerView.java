package com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.mobile.ads.common.AdBindingResult;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import defpackage.bq81;
import defpackage.btk;
import defpackage.e781;
import defpackage.eg90;
import defpackage.exu0;
import defpackage.f250;
import defpackage.fd81;
import defpackage.gjf;
import defpackage.gs20;
import defpackage.gtq0;
import defpackage.h250;
import defpackage.hs20;
import defpackage.hst;
import defpackage.hxy;
import defpackage.irb1;
import defpackage.is20;
import defpackage.j73;
import defpackage.jl40;
import defpackage.js20;
import defpackage.jst;
import defpackage.ke00;
import defpackage.kl40;
import defpackage.kvo;
import defpackage.lml;
import defpackage.m020;
import defpackage.nwy0;
import defpackage.omk;
import defpackage.pdc;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.u2l;
import defpackage.u4l;
import defpackage.ujk;
import defpackage.uk10;
import defpackage.w511;
import defpackage.xng0;
import defpackage.y6k;
import defpackage.ynk;
import defpackage.yt31;
import defpackage.zmk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0002-TBI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0014J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010\u0014J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010,\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010,\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u0010\u0014J\u0017\u00108\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/yandex/go/ads/mobile_ads_sdk/presentation/divkit/native_banner/MobileAdsNativeBannerView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lexu0;", "styleDelegate", "Lpwy0;", "themeSwitcherProvider", "Lpdc;", "colorConverter", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILexu0;Lpwy0;Lpdc;)V", "Lzy11;", "reset", "()V", "Lorg/json/JSONObject;", "nativeDivCard", "configure", "(Lorg/json/JSONObject;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "resolveShimmeringColor", "(Lru/yandex/taxi/theme/ThemeType;)I", "Landroid/view/ContextThemeWrapper;", "createThemedContext", "(Lru/yandex/taxi/theme/ThemeType;)Landroid/view/ContextThemeWrapper;", "installFallback", "Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "binder", "onBinderReady", "(Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;)V", "tryBind", "Lcom/yandex/mobile/ads/nativeads/NativeAd;", "nativeAd", "bindAd", "(Lcom/yandex/mobile/ads/nativeads/NativeAd;Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;)V", "showShimmerForMissingImages", "(Lcom/yandex/mobile/ads/nativeads/NativeAd;)V", "json", "Ljs20;", "parseNativeDivCard", "(Lorg/json/JSONObject;)Ljs20;", "Lomk;", "parseDivData", "(Lorg/json/JSONObject;)Lomk;", "Lgs20;", "properties", "loadAd", "(Lgs20;)V", "release", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "allowTraverse", "Lexu0;", "Lpwy0;", "Lpdc;", "Lcom/yandex/mobile/ads/nativeads/NativeAdView;", "nativeAdView", "Lcom/yandex/mobile/ads/nativeads/NativeAdView;", "Lcom/yandex/div/core/view2/Div2View;", "customDivView", "Lcom/yandex/div/core/view2/Div2View;", "Lh250;", "nativeAdSlotsRegistry", "Lh250;", "pendingAd", "Lcom/yandex/mobile/ads/nativeads/NativeAd;", "pendingBinder", "Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "Lcom/yandex/mobile/ads/nativeads/NativeAdLoader;", "adLoader", "Lcom/yandex/mobile/ads/nativeads/NativeAdLoader;", "currentThemeType", "Lru/yandex/taxi/theme/ThemeType;", "Companion", "is20", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MobileAdsNativeBannerView extends FrameLayout implements nwy0 {
    private static final is20 Companion = new is20();
    private static final String NATIVE_DIV_CARD_TAG = "yx_mobile_ads_native_div_card";
    private NativeAdLoader adLoader;
    private final pdc colorConverter;
    private ThemeType currentThemeType;
    private Div2View customDivView;
    private h250 nativeAdSlotsRegistry;
    private final NativeAdView nativeAdView;
    private NativeAd pendingAd;
    private NativeAdViewBinder pendingBinder;
    private final exu0 styleDelegate;
    private final pwy0 themeSwitcherProvider;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MobileAdsNativeBannerView(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, defpackage.exu0 r13, defpackage.pwy0 r14, defpackage.pdc r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L5
            r10 = 0
        L5:
            r2 = r10
            r10 = r16 & 4
            r0 = 0
            if (r10 == 0) goto Ld
            r3 = r0
            goto Le
        Ld:
            r3 = r11
        Le:
            r10 = r16 & 8
            if (r10 == 0) goto L19
            r4 = r0
            r1 = r9
            r5 = r13
            r6 = r14
            r7 = r15
            r0 = r8
            goto L1f
        L19:
            r4 = r12
            r0 = r8
            r1 = r9
            r5 = r13
            r6 = r14
            r7 = r15
        L1f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner.MobileAdsNativeBannerView.<init>(android.content.Context, android.util.AttributeSet, int, int, exu0, pwy0, pdc, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final void bindAd(NativeAd nativeAd, NativeAdViewBinder binder) {
        AdBindingResult bindNativeAd = nativeAd.bindNativeAd(binder);
        if (jl40.l(bindNativeAd, AdBindingResult.Success.INSTANCE)) {
            showShimmerForMissingImages(nativeAd);
            return;
        }
        if (!(bindNativeAd instanceof AdBindingResult.Failure)) {
            w511.b();
            return;
        }
        hst hstVar = jst.e;
        ke00 a = hstVar.b.a();
        if (a == null || !a.b(15)) {
            return;
        }
        a.a(15, null, null, "MobileAdsNativeBannerView: bind failed: " + bindNativeAd, hstVar.a);
    }

    private final void configure(JSONObject nativeDivCard) {
        js20 parseNativeDivCard = nativeDivCard != null ? parseNativeDivCard(nativeDivCard) : null;
        if (parseNativeDivCard == null) {
            installFallback();
            return;
        }
        omk omkVar = parseNativeDivCard.a;
        h250 h250Var = new h250(this.nativeAdView, parseNativeDivCard.b, new MobileAdsNativeBannerView$configure$registry$1(1, this, MobileAdsNativeBannerView.class, "onBinderReady", "onBinderReady(Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;)V", 0));
        this.nativeAdSlotsRegistry = h250Var;
        hs20 hs20Var = new hs20();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean defaultValue = Experiment.TAP_BEACONS_ENABLED.getDefaultValue();
        boolean defaultValue2 = Experiment.VISIBILITY_BEACONS_ENABLED.getDefaultValue();
        boolean defaultValue3 = Experiment.SWIPE_OUT_BEACONS_ENABLED.getDefaultValue();
        boolean defaultValue4 = Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.getDefaultValue();
        boolean defaultValue5 = Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED.getDefaultValue();
        boolean defaultValue6 = Experiment.HYPHENATION_SUPPORT_ENABLED.getDefaultValue();
        boolean defaultValue7 = Experiment.VISUAL_ERRORS_ENABLED.getDefaultValue();
        boolean defaultValue8 = Experiment.ACCESSIBILITY_ENABLED.getDefaultValue();
        boolean defaultValue9 = Experiment.VIEW_POOL_ENABLED.getDefaultValue();
        boolean defaultValue10 = Experiment.VIEW_POOL_PROFILING_ENABLED.getDefaultValue();
        boolean defaultValue11 = Experiment.VIEW_POOL_OPTIMIZATION_DEBUG.getDefaultValue();
        boolean defaultValue12 = Experiment.RESOURCE_CACHE_ENABLED.getDefaultValue();
        boolean defaultValue13 = Experiment.MULTIPLE_STATE_CHANGE_ENABLED.getDefaultValue();
        boolean defaultValue14 = Experiment.COMPLEX_REBIND_ENABLED.getDefaultValue();
        boolean defaultValue15 = Experiment.PAGER_PAGE_CLIP_ENABLED.getDefaultValue();
        boolean defaultValue16 = Experiment.PERMANENT_DEBUG_PANEL_ENABLED.getDefaultValue();
        boolean defaultValue17 = Experiment.RENDER_EFFECT_ENABLED.getDefaultValue();
        ujk ujkVar = new ujk(hs20Var, new y6k(), new com.yandex.div.state.a(), arrayList, new a(h250Var, new m020(6, this), new MobileAdsNativeBannerView$configure$divConfiguration$3(0, this, MobileAdsNativeBannerView.class, "createThemedContext", "createThemedContext(Lru/yandex/taxi/theme/ThemeType;)Landroid/view/ContextThemeWrapper;", 0), new MobileAdsNativeBannerView$configure$divConfiguration$4(1, this, MobileAdsNativeBannerView.class, "resolveShimmeringColor", "resolveShimmeringColor(Lru/yandex/taxi/theme/ThemeType;)I", 0), this.colorConverter), u4l.a, kl40.x, arrayList2, ynk.P1, lml.a, new HashMap(), new yt31(), new com.yandex.div.core.expression.variables.a(), defaultValue, defaultValue2, defaultValue3, defaultValue4, defaultValue5, defaultValue7, defaultValue6, defaultValue8, defaultValue9, defaultValue10, defaultValue11, defaultValue12, defaultValue13, false, defaultValue14, defaultValue15, defaultValue16, defaultValue17);
        Context context = getContext();
        ContextThemeWrapper contextThemeWrapper = context instanceof ContextThemeWrapper ? (ContextThemeWrapper) context : null;
        if (contextThemeWrapper == null) {
            contextThemeWrapper = new ContextThemeWrapper(getContext(), 0);
        }
        Div2View div2View = new Div2View(new Div2Context(contextThemeWrapper, ujkVar, 0, null, 12, null), null, 0, 6, null);
        this.customDivView = div2View;
        this.nativeAdView.addView(div2View);
        div2View.setData(omkVar, new zmk(NATIVE_DIV_CARD_TAG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hxy configure$lambda$0(String str, btk btkVar) {
        return new gjf(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$0$0() {
    }

    private final ContextThemeWrapper createThemedContext(ThemeType themeType) {
        return new ContextThemeWrapper(getContext(), this.styleDelegate.a(themeType).b);
    }

    public static /* synthetic */ ContextThemeWrapper createThemedContext$default(MobileAdsNativeBannerView mobileAdsNativeBannerView, ThemeType themeType, int i, Object obj) {
        if ((i & 1) != 0) {
            themeType = mobileAdsNativeBannerView.currentThemeType;
        }
        return mobileAdsNativeBannerView.createThemedContext(themeType);
    }

    private final void installFallback() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        this.nativeAdView.addView(robotoTextView);
        GoImageView goImageView = new GoImageView(getContext(), null, 0, 6, null);
        this.nativeAdView.addView(goImageView);
        MediaView mediaView = new MediaView(getContext());
        this.nativeAdView.addView(mediaView);
        this.pendingBinder = new NativeAdViewBinder.Builder(this.nativeAdView).setTitleView(robotoTextView).setDomainView(robotoTextView).setWarningView(robotoTextView).setSponsoredView(robotoTextView).setFeedbackView(goImageView).setMediaView(mediaView).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBinderReady(NativeAdViewBinder binder) {
        this.pendingBinder = binder;
        tryBind();
    }

    private final omk parseDivData(JSONObject json2) {
        try {
            u2l u2lVar = new u2l(eg90.b);
            kvo kvoVar = omk.i;
            return gtq0.n(u2lVar, json2);
        } catch (Exception e) {
            jst.e.k(e, "MobileAdsNativeBannerView: parseDivData failed");
            return null;
        }
    }

    private final js20 parseNativeDivCard(JSONObject json2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        irb1.c(json2, linkedHashSet);
        if (!linkedHashSet.isEmpty()) {
            omk parseDivData = parseDivData(json2);
            if (parseDivData != null) {
                return new js20(parseDivData, linkedHashSet);
            }
            hst hstVar = jst.e;
            ke00 a = hstVar.b.a();
            if (a != null && a.b(15)) {
                a.a(15, null, null, "MobileAdsNativeBannerView: failed to parse native_div_card", hstVar.a);
            }
        }
        return null;
    }

    private final void reset() {
        this.pendingAd = null;
        this.pendingBinder = null;
        this.customDivView = null;
        this.nativeAdSlotsRegistry = null;
        this.nativeAdView.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int resolveShimmeringColor(ThemeType themeType) {
        return qje.t(xng0.shimmeringDefaultColor, createThemedContext(themeType));
    }

    private final void showShimmerForMissingImages(NativeAd nativeAd) {
        f250 f250Var;
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        NativeAdSlot nativeAdSlot = NativeAdSlot.ICON;
        fd81 fd81Var = (fd81) adAssets;
        e781 e781Var = fd81Var.a.c;
        if ((e781Var != null ? new bq81(e781Var) : null) != null) {
            nativeAdSlot = null;
        }
        NativeAdSlot nativeAdSlot2 = NativeAdSlot.FAVICON;
        e781 e781Var2 = fd81Var.a.b;
        if ((e781Var2 != null ? new bq81(e781Var2) : null) != null) {
            nativeAdSlot2 = null;
        }
        for (NativeAdSlot nativeAdSlot3 : j73.A(new NativeAdSlot[]{nativeAdSlot, nativeAdSlot2})) {
            h250 h250Var = this.nativeAdSlotsRegistry;
            View view = (h250Var == null || (f250Var = (f250) h250Var.d.get(nativeAdSlot3.getRole())) == null) ? null : f250Var.a;
            NativeAdShimmerImageView nativeAdShimmerImageView = view instanceof NativeAdShimmerImageView ? (NativeAdShimmerImageView) view : null;
            if (nativeAdShimmerImageView != null) {
                nativeAdShimmerImageView.showShimmer();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryBind() {
        NativeAd nativeAd;
        NativeAdViewBinder nativeAdViewBinder = this.pendingBinder;
        if (nativeAdViewBinder == null || (nativeAd = this.pendingAd) == null) {
            return;
        }
        bindAd(nativeAd, nativeAdViewBinder);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return false;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.currentThemeType = themeType;
        h250 h250Var = this.nativeAdSlotsRegistry;
        if (h250Var != null) {
            Iterator it = h250Var.d.values().iterator();
            while (it.hasNext()) {
                ((f250) it.next()).b.applyTheme(themeType);
            }
        }
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void loadAd(gs20 properties) {
        this.currentThemeType = this.themeSwitcherProvider.getThemeType();
        reset();
        configure(properties.d);
        NativeAdLoader nativeAdLoader = new NativeAdLoader(getContext());
        nativeAdLoader.loadAd(properties.a, properties.c, new uk10(this));
        this.adLoader = nativeAdLoader;
    }

    public final void release() {
        NativeAdLoader nativeAdLoader = this.adLoader;
        if (nativeAdLoader != null) {
            nativeAdLoader.cancelLoading();
        }
        this.adLoader = null;
        reset();
    }

    public MobileAdsNativeBannerView(Context context, AttributeSet attributeSet, int i, exu0 exu0Var, pwy0 pwy0Var, pdc pdcVar) {
        this(context, attributeSet, i, 0, exu0Var, pwy0Var, pdcVar, 8, null);
    }

    public MobileAdsNativeBannerView(Context context, AttributeSet attributeSet, exu0 exu0Var, pwy0 pwy0Var, pdc pdcVar) {
        this(context, attributeSet, 0, 0, exu0Var, pwy0Var, pdcVar, 12, null);
    }

    public MobileAdsNativeBannerView(Context context, AttributeSet attributeSet, int i, int i2, exu0 exu0Var, pwy0 pwy0Var, pdc pdcVar) {
        super(context, attributeSet, i, i2);
        this.styleDelegate = exu0Var;
        this.themeSwitcherProvider = pwy0Var;
        this.colorConverter = pdcVar;
        NativeAdView nativeAdView = new NativeAdView(context);
        addView(nativeAdView);
        this.nativeAdView = nativeAdView;
        this.currentThemeType = pwy0Var.getThemeType();
    }

    public MobileAdsNativeBannerView(Context context, exu0 exu0Var, pwy0 pwy0Var, pdc pdcVar) {
        this(context, null, 0, 0, exu0Var, pwy0Var, pdcVar, 14, null);
    }
}
