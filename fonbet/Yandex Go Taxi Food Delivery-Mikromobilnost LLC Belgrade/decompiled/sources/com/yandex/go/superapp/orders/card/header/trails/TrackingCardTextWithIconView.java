package com.yandex.go.superapp.orders.card.header.trails;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.c8h0;
import defpackage.cma1;
import defpackage.cn70;
import defpackage.jxi;
import defpackage.mkh0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pxy0;
import defpackage.s980;
import defpackage.tje;
import defpackage.zgz0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;

@jxi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/superapp/orders/card/header/trails/TrackingCardTextWithIconView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lpav;", "imageLoader", "", "labelBackground", "labelTextColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Lpav;IILandroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcn70;", "uiState", "Lzy11;", "render", "(Lcn70;)V", "Lpav;", CA20Status.STATUS_USER_I, "Ls980;", "binding", "Ls980;", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrackingCardTextWithIconView extends GoFrameLayout {
    private final s980 binding;
    private final pav imageLoader;
    private final int labelBackground;
    private final int labelTextColor;

    public TrackingCardTextWithIconView(pav pavVar, int i, int i2, Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3, 0, 8, null);
        this.imageLoader = pavVar;
        this.labelBackground = i;
        this.labelTextColor = i2;
        LayoutInflater.from(context).inflate(mkh0.order_trail_view_text_with_icon, this);
        int i4 = c8h0.order_trail_view_text_with_icon_icon;
        GoImageView goImageView = (GoImageView) cma1.O(i4, this);
        if (goImageView != null) {
            i4 = c8h0.order_trail_view_text_with_icon_label;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i4, this);
            if (robotoTextView != null) {
                this.binding = new s980(this, goImageView, robotoTextView);
                setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                robotoTextView.setBackgroundResource(i);
                robotoTextView.setTextColorAttr(i2);
                setPaddingRelative(getPaddingStart(), getPaddingTop(), tje.r(mrg0.go_design_m_space, getContext()), getPaddingBottom());
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i4)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$0$0(TrackingCardTextWithIconView trackingCardTextWithIconView, Drawable drawable) {
        trackingCardTextWithIconView.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$0$1(TrackingCardTextWithIconView trackingCardTextWithIconView) {
        trackingCardTextWithIconView.setVisibility(8);
        return zy11.a;
    }

    public final void render(cn70 uiState) {
        s980 s980Var = this.binding;
        s980Var.c.setText(uiState.b);
        pav pavVar = this.imageLoader;
        if (pavVar == null) {
            return;
        }
        nac nacVar = (nac) pavVar.a(s980Var.b);
        nacVar.h = new pxy0(16, this);
        nacVar.i = new zgz0(15, this);
        nacVar.c(uiState.a);
    }

    public TrackingCardTextWithIconView(pav pavVar, int i, int i2, Context context, AttributeSet attributeSet) {
        this(pavVar, i, i2, context, attributeSet, 0, 32, null);
    }

    public TrackingCardTextWithIconView(pav pavVar, int i, int i2, Context context) {
        this(pavVar, i, i2, context, null, 0, 48, null);
    }

    public /* synthetic */ TrackingCardTextWithIconView(pav pavVar, int i, int i2, Context context, AttributeSet attributeSet, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(pavVar, i, i2, context, (i4 & 16) != 0 ? null : attributeSet, (i4 & 32) != 0 ? 0 : i3);
    }
}
