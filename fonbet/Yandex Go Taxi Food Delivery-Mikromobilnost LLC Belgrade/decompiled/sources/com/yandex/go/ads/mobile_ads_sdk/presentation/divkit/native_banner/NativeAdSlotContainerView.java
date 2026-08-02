package com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.bdc;
import defpackage.cvw;
import defpackage.e250;
import defpackage.hrb1;
import defpackage.kdc;
import defpackage.nwy0;
import defpackage.pdc;
import defpackage.s8o;
import defpackage.sls;
import defpackage.ufu;
import defpackage.w511;
import defpackage.xng0;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'¨\u0006("}, d2 = {"Lcom/yandex/go/ads/mobile_ads_sdk/presentation/divkit/native_banner/NativeAdSlotContainerView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lpdc;", "colorConverter", "Lkotlin/Function0;", "Landroid/view/ContextThemeWrapper;", "themedContextProvider", "<init>", "(Landroid/content/Context;Lpdc;Lsls;)V", "Lzy11;", "applyStyle", "()V", "Lcom/yandex/go/ads/mobile_ads_sdk/presentation/divkit/native_banner/NativeAdSlot;", "slot", "Lorg/json/JSONObject;", "props", "bind", "(Lcom/yandex/go/ads/mobile_ads_sdk/presentation/divkit/native_banner/NativeAdSlot;Lorg/json/JSONObject;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "allowTraverse", "Lpdc;", "Lsls;", "Landroid/view/View;", "assetView", "Landroid/view/View;", "getAssetView", "()Landroid/view/View;", "setAssetView", "(Landroid/view/View;)V", "Lcom/yandex/go/ads/mobile_ads_sdk/presentation/divkit/native_banner/NativeAdSlot;", "Lorg/json/JSONObject;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NativeAdSlotContainerView extends FrameLayout implements nwy0 {
    private View assetView;
    private final pdc colorConverter;
    private JSONObject props;
    private NativeAdSlot slot;
    private final sls themedContextProvider;

    public NativeAdSlotContainerView(Context context, pdc pdcVar, sls slsVar) {
        super(context);
        this.colorConverter = pdcVar;
        this.themedContextProvider = slsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r4 != Integer.MIN_VALUE) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void applyStyle() {
        NativeAdSlot nativeAdSlot;
        Integer num;
        kdc kdcVar;
        Integer valueOf;
        RobotoTextView robotoTextView;
        JSONObject jSONObject = this.props;
        if (jSONObject == null || (nativeAdSlot = this.slot) == null) {
            return;
        }
        ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) this.themedContextProvider.invoke();
        pdc pdcVar = this.colorConverter;
        if (jSONObject.has("corner_radius") && !jSONObject.isNull("corner_radius")) {
            int optInt = jSONObject.optInt("corner_radius", Integer.MIN_VALUE);
            num = Integer.valueOf(optInt);
        }
        num = null;
        int intValue = num != null ? num.intValue() : 0;
        String J = cvw.J("background_color", jSONObject);
        if (J != null) {
            if (J.length() <= 0) {
                J = null;
            }
            if (J != null) {
                kdcVar = ((ufu) pdcVar).a(new bdc(xng0.bgMain), J);
                valueOf = kdcVar == null ? Integer.valueOf(s8o.m(kdcVar, contextThemeWrapper)) : null;
                if (valueOf == null || intValue > 0) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    if (intValue > 0) {
                        gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, intValue, getResources().getDisplayMetrics()));
                    }
                    gradientDrawable.setColor(valueOf != null ? valueOf.intValue() : 0);
                    setBackground(gradientDrawable);
                    if (intValue > 0) {
                        setClipToOutline(true);
                    }
                }
                switch (e250.a[nativeAdSlot.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        View view = this.assetView;
                        robotoTextView = view instanceof RobotoTextView ? (RobotoTextView) view : null;
                        if (robotoTextView != null) {
                            hrb1.a(robotoTextView, jSONObject, this.colorConverter, contextThemeWrapper);
                            break;
                        }
                        break;
                    case 9:
                        View view2 = this.assetView;
                        robotoTextView = view2 instanceof RobotoTextView ? (RobotoTextView) view2 : null;
                        if (robotoTextView != null) {
                            hrb1.a(robotoTextView, jSONObject, this.colorConverter, contextThemeWrapper);
                            robotoTextView.setGravity(17);
                            break;
                        }
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        break;
                    default:
                        w511.b();
                        break;
                }
            }
        }
        kdcVar = null;
        if (kdcVar == null) {
        }
        if (valueOf == null) {
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        if (intValue > 0) {
        }
        gradientDrawable2.setColor(valueOf != null ? valueOf.intValue() : 0);
        setBackground(gradientDrawable2);
        if (intValue > 0) {
        }
        switch (e250.a[nativeAdSlot.ordinal()]) {
        }
    }

    @Override // defpackage.nwy0
    public boolean allowTraverse() {
        return false;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyStyle();
        KeyEvent.Callback callback = this.assetView;
        nwy0 nwy0Var = callback instanceof nwy0 ? (nwy0) callback : null;
        if (nwy0Var != null) {
            nwy0Var.applyTheme(themeType);
        }
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void bind(NativeAdSlot slot, JSONObject props) {
        this.slot = slot;
        this.props = props;
        applyStyle();
    }

    public final View getAssetView() {
        return this.assetView;
    }

    public final void setAssetView(View view) {
        this.assetView = view;
    }
}
