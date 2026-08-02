package com.ybsdk.feature.merchant.offers.internal.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ui.core.CoreShapeDrawable;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import defpackage.bqg0;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.fbh0;
import defpackage.fx00;
import defpackage.gob1;
import defpackage.j73;
import defpackage.kp50;
import defpackage.lhc;
import defpackage.lia1;
import defpackage.ly4;
import defpackage.nnh0;
import defpackage.ny61;
import defpackage.qa61;
import defpackage.rje;
import defpackage.rr51;
import defpackage.so10;
import defpackage.t8;
import defpackage.tif0;
import defpackage.tls;
import defpackage.to10;
import defpackage.ung0;
import defpackage.uo10;
import defpackage.v4b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 42\u00020\u0001:\u0003\u0015\u00185B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\u00020\u00122\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 J\u001d\u0010%\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/view/MerchantOffersBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "createNotificationShadowBackground", "()Landroid/graphics/drawable/Drawable;", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "value", "Lzy11;", "setDivActionHandler", "(Ltls;)V", "Lto10;", "setLongPressListener", "(Lto10;)V", "Luo10;", "setOnBannerClickListener", ClidProvider.STATE, "render", "(Luo10;)V", "", "scrollProgress", "setVerticalScrollProgress", "(F)V", "setHorizontalScrollProgress", "progress", "Lcom/ybsdk/core/utils/ColorModel;", "targetColorModel", "blendBackground", "(FLcom/ybsdk/core/utils/ColorModel;)V", "resetBackground", "()V", "Lqa61;", "binding", "Lqa61;", "currentState", "Luo10;", "currentVerticalScrollProgress", "F", "longPressListener", "Lto10;", "isLongPressed", "Z", "Companion", "so10", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MerchantOffersBannerView extends ConstraintLayout {

    @Deprecated
    public static final float HORIZONTAL_PARALLAX_MULTIPLIER = 0.2f;

    @Deprecated
    public static final float MAX_OPACITY_VALUE = 1.0f;

    @Deprecated
    public static final int OPACITY_SCROLL_PROGRESS_MULTIPLIER = 2;

    @Deprecated
    public static final float SHADOW_DX = 0.0f;

    @Deprecated
    public static final float VERTICAL_PARALLAX_MULTIPLIER = 0.25f;
    private final qa61 binding;
    private uo10 currentState;
    private float currentVerticalScrollProgress;
    private boolean isLongPressed;
    private to10 longPressListener;
    private static final so10 Companion = new so10();
    private static final float NOTIFICATION_CORNER_RADIUS = kp50.t(24);
    private static final float SHADOW_BLUR_RADIUS = kp50.t(28);
    private static final int SHADOW_SPREAD = kp50.r(28);
    private static final float SHADOW_DY = kp50.t(18);

    public MerchantOffersBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        LayoutInflater.from(context).inflate(nnh0.ybsdk_view_banner, this);
        int i2 = fbh0.bannerImage;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = fbh0.bannerLogo;
            ImageView imageView2 = (ImageView) cma1.O(i2, this);
            if (imageView2 != null) {
                i2 = fbh0.bannerNotification;
                YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
                if (ybDivView != null && (O = cma1.O((i2 = fbh0.bannerOverlay), this)) != null) {
                    i2 = fbh0.bannerSubtitle;
                    TextView textView = (TextView) cma1.O(i2, this);
                    if (textView != null) {
                        i2 = fbh0.bannerTitle;
                        TextView textView2 = (TextView) cma1.O(i2, this);
                        if (textView2 != null) {
                            this.binding = new qa61(this, imageView, imageView2, ybDivView, O, textView, textView2);
                            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                            setClipChildren(false);
                            setClipToPadding(false);
                            ybDivView.setBackground(createNotificationShadowBackground());
                            setOnLongClickListener(new ly4(6, this));
                            setOnTouchListener(new t8(11, this));
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r0 = ((defpackage.fp10) r0).a.timer;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean _init_$lambda$0(MerchantOffersBannerView merchantOffersBannerView, View view) {
        tif0 tif0Var;
        merchantOffersBannerView.isLongPressed = true;
        to10 to10Var = merchantOffersBannerView.longPressListener;
        if (to10Var != null && tif0Var != null) {
            tif0Var.a();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = ((defpackage.fp10) r2).a.timer;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean _init_$lambda$1(MerchantOffersBannerView merchantOffersBannerView, View view, MotionEvent motionEvent) {
        tif0 tif0Var;
        boolean onTouchEvent = view.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && merchantOffersBannerView.isLongPressed) {
            merchantOffersBannerView.isLongPressed = false;
            to10 to10Var = merchantOffersBannerView.longPressListener;
            if (to10Var != null && tif0Var != null) {
                tif0Var.b();
            }
        }
        return onTouchEvent;
    }

    private final Drawable createNotificationShadowBackground() {
        float f = NOTIFICATION_CORNER_RADIUS;
        float[] fArr = {f, f, f, f, f, f, f, f};
        CoreShapeDrawable.Companion.getClass();
        CoreShapeDrawable coreShapeDrawable = new CoreShapeDrawable(fArr, new RoundRectShape(fArr, null, null));
        coreShapeDrawable.getPaint().setColor(rje.a(getContext(), ung0.ybColor_background_primary));
        coreShapeDrawable.getPaint().setShadowLayer(SHADOW_BLUR_RADIUS, 0.0f, SHADOW_DY, getContext().getColor(bqg0.ybsdk_merchant_offers_banner_shadow));
        CoreShapeDrawable coreShapeDrawable2 = new CoreShapeDrawable(fArr, new RoundRectShape(fArr, null, null));
        coreShapeDrawable2.getPaint().setColor(rje.a(getContext(), ung0.ybColor_background_primary));
        coreShapeDrawable2.setShape(new RoundRectShape(fArr, null, null));
        LayerDrawable layerDrawable = new LayerDrawable(new CoreShapeDrawable[]{coreShapeDrawable, coreShapeDrawable2});
        int i = SHADOW_SPREAD;
        layerDrawable.setLayerInset(0, i, i, i, i);
        return layerDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnBannerClickListener$lambda$3(MerchantOffersBannerView merchantOffersBannerView, tls tlsVar, View view) {
        uo10 uo10Var = merchantOffersBannerView.currentState;
        if (uo10Var != null) {
            tlsVar.invoke(uo10Var);
        }
    }

    public final void blendBackground(float progress, ColorModel targetColorModel) {
        ColorModel colorModel;
        uo10 uo10Var = this.currentState;
        if (uo10Var == null || (colorModel = uo10Var.c) == null) {
            return;
        }
        this.binding.a.setBackgroundColor(lhc.b(progress, targetColorModel.get(getContext()), colorModel.get(getContext())));
    }

    public final void render(uo10 state) {
        qa61 qa61Var = this.binding;
        MerchantOffersBannerView merchantOffersBannerView = qa61Var.a;
        YbDivView ybDivView = qa61Var.d;
        String str = state.g;
        String str2 = state.h;
        merchantOffersBannerView.setContentDescription(lia1.i(j73.A(new String[]{str, str2})));
        gob1.a(qa61Var.a, state.c);
        v4b1.k(state.d, qa61Var.b, null, null, 6);
        v4b1.k(state.f, qa61Var.c, null, null, 6);
        qa61Var.g.setText(str);
        TextView textView = qa61Var.f;
        textView.setVisibility((str2 == null || evu0.J(str2)) ? 8 : 0);
        textView.setText(str2);
        rr51 rr51Var = state.a;
        if (rr51Var == null) {
            ybDivView.setVisibility(8);
        } else {
            ybDivView.setVisibility(0);
            YbDivView.setData$default(ybDivView, rr51Var, null, null, false, 14, null);
        }
        this.currentState = state;
    }

    public final void resetBackground() {
        uo10 uo10Var = this.currentState;
        if (uo10Var != null) {
            gob1.a(this.binding.a, uo10Var.c);
        }
    }

    public final void setDivActionHandler(tls value) {
        this.binding.d.setActionHandler(value);
    }

    public final void setHorizontalScrollProgress(float scrollProgress) {
        qa61 qa61Var = this.binding;
        float f = this.currentVerticalScrollProgress * 2.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        qa61Var.b.setAlpha(Math.min(1.0f - f, 1.0f - Math.abs(scrollProgress)));
        qa61Var.b.setTranslationX((-1.0f) * scrollProgress * qa61Var.a.getMeasuredWidth() * 0.2f);
    }

    public final void setLongPressListener(to10 value) {
        this.longPressListener = value;
    }

    public final void setOnBannerClickListener(tls value) {
        this.binding.a.setOnClickListener(new fx00(4, this, value));
    }

    public final void setVerticalScrollProgress(float scrollProgress) {
        this.currentVerticalScrollProgress = scrollProgress;
        qa61 qa61Var = this.binding;
        float f = 2.0f * scrollProgress;
        if (f > 1.0f) {
            f = 1.0f;
        }
        View view = qa61Var.e;
        ImageView imageView = qa61Var.b;
        view.setAlpha(f);
        imageView.setAlpha(1.0f - f);
        imageView.setTranslationY(qa61Var.a.getMeasuredHeight() * 0.25f * scrollProgress);
    }

    public MerchantOffersBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MerchantOffersBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public MerchantOffersBannerView(Context context) {
        this(context, null, 0, 6, null);
    }
}
