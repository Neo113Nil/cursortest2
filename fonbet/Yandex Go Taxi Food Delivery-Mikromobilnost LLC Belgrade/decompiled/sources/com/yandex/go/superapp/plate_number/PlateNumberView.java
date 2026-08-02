package com.yandex.go.superapp.plate_number;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aq80;
import defpackage.cma1;
import defpackage.d8h0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.l1y;
import defpackage.nkh0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.uuc0;
import defpackage.we6;
import defpackage.xng0;
import defpackage.xuc0;
import defpackage.yuc0;
import defpackage.zuc0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0010*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/go/superapp/plate_number/PlateNumberView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Lnwy0;", "Lxuc0;", "style", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Lxuc0;Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzuc0;", "uiState", "Lzy11;", "renderPlate", "(Lzuc0;)V", "renderEmptyPlate", "()V", "Lru/yandex/taxi/widget/RobotoTextView;", "Luuc0;", "fontStyle", "setFontStyle", "(Lru/yandex/taxi/widget/RobotoTextView;Luuc0;)V", "render", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "strokeWidth", CA20Status.STATUS_USER_I, "Ll1y;", "binding", "Ll1y;", "Landroid/graphics/drawable/GradientDrawable;", "borderDrawable", "Landroid/graphics/drawable/GradientDrawable;", "currentUiState", "Lzuc0;", "plate_number"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public class PlateNumberView extends GoLinearLayout {
    private final l1y binding;
    private final GradientDrawable borderDrawable;
    private zuc0 currentUiState;
    private final int strokeWidth;

    public PlateNumberView(xuc0 xuc0Var, Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.strokeWidth = tje.u(1, getContext());
        LayoutInflater.from(context).inflate(nkh0.layout_plate_number, this);
        int i3 = d8h0.plate_divider_view;
        PlateNumberDividerView plateNumberDividerView = (PlateNumberDividerView) cma1.O(i3, this);
        if (plateNumberDividerView != null) {
            i3 = d8h0.primary_text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
            if (robotoTextView != null) {
                i3 = d8h0.secondary_text;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, this);
                if (robotoTextView2 != null) {
                    l1y l1yVar = new l1y(this, plateNumberDividerView, robotoTextView, robotoTextView2);
                    aq80 aq80Var = xuc0Var.a;
                    we6 we6Var = xuc0Var.b;
                    setFontStyle(robotoTextView, (uuc0) aq80Var.a);
                    setFontStyle(robotoTextView2, (uuc0) we6Var.c);
                    int u = tje.u(we6Var.b, getContext());
                    robotoTextView2.setPaddingRelative(u, robotoTextView2.getPaddingTop(), u, robotoTextView2.getPaddingBottom());
                    this.binding = l1yVar;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(tje.w(xuc0Var.c, getContext()));
                    this.borderDrawable = gradientDrawable;
                    setOrientation(0);
                    setLayoutDirection(0);
                    int u2 = tje.u(4, getContext());
                    setPadding(u2, u2, u2, u2);
                    setBackground(gradientDrawable);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private final void renderEmptyPlate() {
        setVisibility(8);
        l1y l1yVar = this.binding;
        l1yVar.c.setText((CharSequence) null);
        l1yVar.d.setText((CharSequence) null);
    }

    private final void renderPlate(zuc0 uiState) {
        setVisibility(0);
        l1y l1yVar = this.binding;
        RobotoTextView robotoTextView = l1yVar.c;
        yuc0 yuc0Var = uiState.a;
        String str = yuc0Var.a;
        yuc0 yuc0Var2 = uiState.b;
        String str2 = yuc0Var2.a;
        kdc kdcVar = yuc0Var.b;
        int m = kdcVar != null ? s8o.m(kdcVar, robotoTextView.getContext()) : qje.t(xng0.textMain, robotoTextView.getContext());
        robotoTextView.setText(str);
        robotoTextView.setTextColor(m);
        PlateNumberDividerView plateNumberDividerView = l1yVar.b;
        kdc kdcVar2 = uiState.c;
        int m2 = kdcVar2 != null ? s8o.m(kdcVar2, plateNumberDividerView.getContext()) : qje.t(xng0.line, plateNumberDividerView.getContext());
        plateNumberDividerView.setVisibility(str2.length() > 0 ? 0 : 8);
        plateNumberDividerView.setBackgroundColor(m2);
        RobotoTextView robotoTextView2 = l1yVar.d;
        kdc kdcVar3 = yuc0Var2.b;
        int m3 = kdcVar3 != null ? s8o.m(kdcVar3, robotoTextView2.getContext()) : qje.t(xng0.textMain, robotoTextView2.getContext());
        robotoTextView2.setVisibility(str2.length() <= 0 ? 8 : 0);
        robotoTextView2.setText(str2);
        robotoTextView2.setTextColor(m3);
        setContentDescription(str + " " + str2);
        kdc kdcVar4 = uiState.e;
        this.borderDrawable.setColor(kdcVar4 != null ? s8o.m(kdcVar4, getContext()) : qje.t(xng0.bgTransparent, getContext()));
        kdc kdcVar5 = uiState.d;
        this.borderDrawable.setStroke(this.strokeWidth, kdcVar5 != null ? s8o.m(kdcVar5, getContext()) : qje.t(xng0.textMain, getContext()));
    }

    private final void setFontStyle(RobotoTextView robotoTextView, uuc0 uuc0Var) {
        robotoTextView.setTextTypeface(uuc0Var.a);
        robotoTextView.setTextSize(uuc0Var.b);
        robotoTextView.setLineHeight((int) tje.b0(robotoTextView.getContext(), uuc0Var.c));
        robotoTextView.setLetterSpacing(uuc0Var.d);
        robotoTextView.setFontFeatureSettings("pnum, lnum");
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        zuc0 zuc0Var = this.currentUiState;
        this.currentUiState = null;
        if (zuc0Var != null) {
            render(zuc0Var);
        }
    }

    public final void render(zuc0 uiState) {
        if (jl40.l(uiState, this.currentUiState)) {
            return;
        }
        this.currentUiState = uiState;
        if (jl40.l(uiState, zuc0.f)) {
            renderEmptyPlate();
        } else {
            renderPlate(uiState);
        }
    }

    public PlateNumberView(xuc0 xuc0Var, Context context, AttributeSet attributeSet) {
        this(xuc0Var, context, attributeSet, 0, 0, 24, null);
    }

    public PlateNumberView(xuc0 xuc0Var, Context context, AttributeSet attributeSet, int i) {
        this(xuc0Var, context, attributeSet, i, 0, 16, null);
    }

    public PlateNumberView(xuc0 xuc0Var, Context context) {
        this(xuc0Var, context, null, 0, 0, 28, null);
    }

    public /* synthetic */ PlateNumberView(xuc0 xuc0Var, Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(xuc0Var, context, (i3 & 4) != 0 ? null : attributeSet, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
