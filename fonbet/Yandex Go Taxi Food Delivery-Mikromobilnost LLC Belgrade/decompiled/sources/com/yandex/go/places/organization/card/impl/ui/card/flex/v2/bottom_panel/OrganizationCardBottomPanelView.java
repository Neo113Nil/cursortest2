package com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.be6;
import defpackage.exu0;
import defpackage.fr;
import defpackage.fug0;
import defpackage.fx00;
import defpackage.ge80;
import defpackage.iqf0;
import defpackage.kr;
import defpackage.lhc;
import defpackage.mrg0;
import defpackage.nrt;
import defpackage.pav;
import defpackage.qje;
import defpackage.rnf0;
import defpackage.scc;
import defpackage.tje;
import defpackage.tls;
import defpackage.ud6;
import defpackage.ur70;
import defpackage.vuh0;
import defpackage.xng0;
import defpackage.y5e;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 e2\u00020\u0001:\u0001fBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\n2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020$*\u00020\u00022\u0006\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+J7\u00102\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020$H\u0014¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u00020,¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\n2\u0006\u0010;\u001a\u00020,¢\u0006\u0004\b<\u00106J\u0015\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020$¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u0018\u0010G\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u00104\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010IR\u0016\u0010J\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u0014\u0010X\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010VR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0014\u0010_\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/bottom_panel/OrganizationCardBottomPanelView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lexu0;", "styleDelegate", "Lkotlin/Function1;", "Lfr;", "Lzy11;", "onActionClick", "Lkr;", "onPromoDetailClick", "<init>", "(Landroid/content/Context;Lpav;Lexu0;Ltls;Ltls;)V", "showShimmer", "()V", "redraw", "applyBackgroundTints", "renderContent", "", "Lud6;", "buttonsList", "renderButtons", "(Ljava/util/List;)V", "Lrnf0;", "promoInfo", "flexAction", "renderPromoInfo", "(Lrnf0;Lkr;)V", "Landroid/text/SpannedString;", "makePromoText", "(Lrnf0;)Landroid/text/SpannedString;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "", "computeStyleRes", "(Lru/yandex/taxi/theme/ThemeType;)I", "attr", "colorAttr", "(Landroid/content/Context;I)I", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "isShimmering", "setShimmering", "(Z)V", "Lbe6;", "buttons", "setContent", "(Lbe6;)V", "isUltima", "setUltimaMode", "", "radius", "setBottomCornersRadius", "(F)V", "bottomPadding", "setBottomPadding", "(I)V", "Lpav;", "Lexu0;", "Ltls;", "currentContent", "Lbe6;", "Z", "isUltimaActive", "Landroid/view/ContextThemeWrapper;", "themedContext", "Landroid/view/ContextThemeWrapper;", "Liqf0;", "promoTextFormatter", "Liqf0;", "Lcom/google/android/material/shape/b;", "shapeAppearanceModel", "Lcom/google/android/material/shape/b;", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "backgroundDrawable", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "shadowDrawable", "underlayDrawable", "Landroid/graphics/drawable/LayerDrawable;", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "topCornerRadius", "F", "panelElevation", "shadowBottomCornerRadius", "Lru/yandex/taxi/widget/RobotoTextView;", "promoTextView", "Lru/yandex/taxi/widget/RobotoTextView;", "buttonsRow", "Lcom/yandex/go/design/view/GoLinearLayout;", "Companion", "ge80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardBottomPanelView extends GoLinearLayout {
    public static final int $stable = 8;
    private static final ge80 Companion = new ge80();

    @Deprecated
    public static final int SHADOW_ALPHA = 64;
    private final MaterialShapeDrawable backgroundDrawable;
    private final GoLinearLayout buttonsRow;
    private be6 currentContent;
    private final pav imageLoader;
    private boolean isShimmering;
    private boolean isUltimaActive;
    private final LayerDrawable layerDrawable;
    private final tls onActionClick;
    private final tls onPromoDetailClick;
    private final float panelElevation;
    private final iqf0 promoTextFormatter;
    private final RobotoTextView promoTextView;
    private final float shadowBottomCornerRadius;
    private final MaterialShapeDrawable shadowDrawable;
    private b shapeAppearanceModel;
    private final exu0 styleDelegate;
    private final ContextThemeWrapper themedContext;
    private final float topCornerRadius;
    private final MaterialShapeDrawable underlayDrawable;

    public OrganizationCardBottomPanelView(Context context, pav pavVar, exu0 exu0Var, tls tlsVar, tls tlsVar2) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.styleDelegate = exu0Var;
        this.onActionClick = tlsVar;
        this.onPromoDetailClick = tlsVar2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, computeStyleRes(qje.X(getContext())));
        this.themedContext = contextThemeWrapper;
        this.promoTextFormatter = new iqf0();
        this.topCornerRadius = tje.r(fug0.places_card_bottom_panel_top_corners, context);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(fug0.places_card_bottom_panel_elevation);
        this.panelElevation = dimensionPixelSize;
        this.shadowBottomCornerRadius = context.getResources().getDimensionPixelSize(fug0.discovery_organizations_card_content_container_corner_round_size);
        RobotoTextView robotoTextView = new RobotoTextView(contextThemeWrapper, null, 0, 6, null);
        robotoTextView.setMaxLines(3);
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_caption, robotoTextView.getContext()));
        robotoTextView.setTextTypeface(0);
        robotoTextView.setVisibility(8);
        this.promoTextView = robotoTextView;
        GoLinearLayout goLinearLayout = new GoLinearLayout(contextThemeWrapper, null, 0, 0, 14, null);
        goLinearLayout.setOrientation(0);
        goLinearLayout.setGravity(16);
        this.buttonsRow = goLinearLayout;
        setOrientation(1);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(fug0.places_card_bottom_panel_padding_horizontal);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(fug0.places_card_bottom_panel_padding_vertical);
        setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
        b.a aVar = new b.a();
        aVar.c(0.0f);
        this.shapeAppearanceModel = aVar.a();
        b.a aVar2 = new b.a();
        aVar2.c(0.0f);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar2.a());
        this.underlayDrawable = materialShapeDrawable;
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.shapeAppearanceModel);
        materialShapeDrawable2.setFillColor(ColorStateList.valueOf(0));
        materialShapeDrawable2.setShadowCompatibilityMode(2);
        materialShapeDrawable2.setElevation(dimensionPixelSize);
        this.shadowDrawable = materialShapeDrawable2;
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.shapeAppearanceModel);
        this.backgroundDrawable = materialShapeDrawable3;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable, materialShapeDrawable2, materialShapeDrawable3});
        layerDrawable.setLayerInset(1, 0, 0, 0, 0);
        this.layerDrawable = layerDrawable;
        setBackground(layerDrawable);
        applyBackgroundTints();
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(fr frVar) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(kr krVar) {
        return zy11.a;
    }

    private final void applyBackgroundTints() {
        this.backgroundDrawable.setTint(colorAttr(this.themedContext, xng0.bgFloating));
        this.underlayDrawable.setTint(colorAttr(this.themedContext, xng0.bgMain));
        this.shadowDrawable.setShadowColor(lhc.f(colorAttr(this.themedContext, xng0.effectShadowTop), 64));
    }

    private final int colorAttr(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    private final int computeStyleRes(ThemeType themeType) {
        return ((nrt) this.styleDelegate).b(themeType, this.isUltimaActive ? "ultima" : "").b;
    }

    private final SpannedString makePromoText(rnf0 promoInfo) {
        int colorAttr = colorAttr(this.themedContext, xng0.textMain);
        int colorAttr2 = colorAttr(this.themedContext, xng0.textMinor);
        this.promoTextFormatter.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(colorAttr);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) promoInfo.a);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(colorAttr2);
        int length2 = spannableStringBuilder.length();
        String str = promoInfo.c;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append((CharSequence) str);
        }
        List list = promoInfo.d;
        if (list != null) {
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append((CharSequence) a.X(list, " ", null, null, null, 62));
        }
        spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    private final void redraw() {
        if (this.isShimmering) {
            showShimmer();
        } else {
            renderContent();
        }
    }

    private final void renderButtons(List<ud6> buttonsList) {
        List<ud6> list = buttonsList;
        if (list == null || list.isEmpty()) {
            this.buttonsRow.setVisibility(8);
            return;
        }
        addView(this.buttonsRow);
        int i = 0;
        this.buttonsRow.setVisibility(0);
        int r = tje.r(fug0.places_card_bottom_panel_button_spacing, getContext());
        for (Object obj : buttonsList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ud6 ud6Var = (ud6) obj;
            BottomPanelButtonView bottomPanelButtonView = new BottomPanelButtonView(this.themedContext, this.imageLoader);
            bottomPanelButtonView.setButton(ud6Var, new fx00(11, this, ud6Var));
            if (i > 0) {
                ViewGroup.LayoutParams layoutParams = bottomPanelButtonView.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.setMarginStart(r);
                }
            }
            this.buttonsRow.addView(bottomPanelButtonView);
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButtons$lambda$0$0(OrganizationCardBottomPanelView organizationCardBottomPanelView, ud6 ud6Var, View view) {
        organizationCardBottomPanelView.onActionClick.invoke(ud6Var.f);
    }

    private final void renderContent() {
        removeAllViews();
        this.buttonsRow.removeAllViews();
        be6 be6Var = this.currentContent;
        ArrayList arrayList = be6Var != null ? be6Var.a : null;
        rnf0 rnf0Var = be6Var != null ? be6Var.b : null;
        if ((arrayList == null || arrayList.isEmpty()) && rnf0Var == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        renderPromoInfo(rnf0Var, be6Var.c);
        renderButtons(arrayList);
    }

    private final void renderPromoInfo(rnf0 promoInfo, kr flexAction) {
        RobotoTextView robotoTextView = this.promoTextView;
        if (promoInfo == null) {
            robotoTextView.setVisibility(8);
            return;
        }
        addView(robotoTextView);
        int r = tje.r(fug0.places_card_bottom_panel_promo_padding_horizontal, getContext());
        this.promoTextView.setPadding(r, 0, r, tje.r(fug0.places_card_bottom_panel_promo_padding_vertical, getContext()));
        this.promoTextView.setVisibility(0);
        this.promoTextView.setText(makePromoText(promoInfo));
        this.promoTextView.setOnClickListener(new fx00(10, flexAction, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderPromoInfo$lambda$0(kr krVar, OrganizationCardBottomPanelView organizationCardBottomPanelView, View view) {
        if (krVar != null) {
            organizationCardBottomPanelView.onPromoDetailClick.invoke(krVar);
        }
    }

    private final void showShimmer() {
        removeAllViews();
        this.buttonsRow.removeAllViews();
        setVisibility(0);
        LayoutInflater.from(this.themedContext).inflate(vuh0.organization_card_bottom_panel_shimmer, (ViewGroup) this.buttonsRow, true);
        addView(this.buttonsRow);
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        y5e.Q(this.themedContext, computeStyleRes(themeType));
        applyBackgroundTints();
        redraw();
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int i = bottom - top;
        if (i > 0) {
            int i2 = i - ((int) (this.topCornerRadius + this.panelElevation));
            if (i2 < 0) {
                i2 = 0;
            }
            this.layerDrawable.setLayerInset(1, 0, 0, 0, i2);
        }
    }

    public final void setBottomCornersRadius(float radius) {
        b.a aVar = new b.a();
        aVar.j(this.topCornerRadius);
        aVar.l(this.topCornerRadius);
        aVar.f(radius);
        aVar.h(radius);
        b a = aVar.a();
        this.shapeAppearanceModel = a;
        this.backgroundDrawable.setShapeAppearanceModel(a);
        MaterialShapeDrawable materialShapeDrawable = this.shadowDrawable;
        b.a aVar2 = new b.a();
        aVar2.j(this.topCornerRadius);
        aVar2.l(this.topCornerRadius);
        aVar2.f(this.shadowBottomCornerRadius);
        aVar2.h(this.shadowBottomCornerRadius);
        materialShapeDrawable.setShapeAppearanceModel(aVar2.a());
        MaterialShapeDrawable materialShapeDrawable2 = this.underlayDrawable;
        b.a aVar3 = new b.a();
        aVar3.j(0.0f);
        aVar3.l(0.0f);
        aVar3.f(radius);
        aVar3.h(radius);
        materialShapeDrawable2.setShapeAppearanceModel(aVar3.a());
    }

    public final void setBottomPadding(int bottomPadding) {
        int r = tje.r(fug0.places_card_bottom_panel_padding_horizontal, getContext());
        int r2 = tje.r(fug0.places_card_bottom_panel_padding_vertical, getContext());
        setPadding(r, r2, r, bottomPadding + r2);
    }

    public final void setContent(be6 buttons) {
        this.currentContent = buttons;
        this.isShimmering = false;
        renderContent();
    }

    public final void setShimmering(boolean isShimmering) {
        if (this.isShimmering == isShimmering) {
            return;
        }
        this.isShimmering = isShimmering;
        if (isShimmering) {
            showShimmer();
        } else {
            renderContent();
        }
    }

    public final void setUltimaMode(boolean isUltima) {
        if (this.isUltimaActive == isUltima) {
            return;
        }
        this.isUltimaActive = isUltima;
        y5e.Q(this.themedContext, computeStyleRes(qje.X(getContext())));
        applyBackgroundTints();
        redraw();
    }

    public /* synthetic */ OrganizationCardBottomPanelView(Context context, pav pavVar, exu0 exu0Var, tls tlsVar, tls tlsVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pavVar, exu0Var, (i & 8) != 0 ? new ur70(19) : tlsVar, (i & 16) != 0 ? new ur70(20) : tlsVar2);
    }
}
