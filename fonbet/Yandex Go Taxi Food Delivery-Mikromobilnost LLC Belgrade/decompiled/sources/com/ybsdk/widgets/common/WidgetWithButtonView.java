package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.aq41;
import defpackage.cma1;
import defpackage.eb61;
import defpackage.fch0;
import defpackage.lwg0;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.qq31;
import defpackage.r451;
import defpackage.rje;
import defpackage.sls;
import defpackage.sm91;
import defpackage.v4b1;
import defpackage.xty0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/widgets/common/WidgetWithButtonView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lzy11;", "listener", "setListener", "(Lsls;)V", "Lr451;", ClidProvider.STATE, "render", "(Lr451;)V", "Leb61;", "binding", "Leb61;", "Lsls;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WidgetWithButtonView extends CardView {
    private final eb61 binding;
    private sls listener;

    public WidgetWithButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_widget_with_button_layout, this);
        int i2 = fch0.description;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = fch0.icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                i2 = fch0.shimmerLayout;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i2, this);
                if (shimmerFrameLayout != null) {
                    i2 = fch0.title;
                    TextView textView2 = (TextView) cma1.O(i2, this);
                    if (textView2 != null) {
                        i2 = fch0.widget;
                        if (((ConstraintLayout) cma1.O(i2, this)) != null) {
                            i2 = fch0.widgetWithButtonButton;
                            YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
                            if (ybButtonView != null) {
                                this.binding = new eb61(this, textView, appCompatImageView, shimmerFrameLayout, textView2, ybButtonView);
                                setCardElevation(0.0f);
                                setRadius(rje.d(lwg0.ybsdk_widget_view_corner_radius, context));
                                ybButtonView.setOnClickListener(new aq41(4, this));
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(WidgetWithButtonView widgetWithButtonView, View view) {
        sls slsVar = widgetWithButtonView.listener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$2$lambda$1(r451 r451Var, YbButtonView.a aVar) {
        return new YbButtonView.a(r451Var.j, null, null, r451Var.h, r451Var.i, null, null, false, false, null, 4070);
    }

    public final void render(r451 state) {
        eb61 eb61Var = this.binding;
        ColorModel colorModel = state.e;
        Context c = sm91.c(eb61Var);
        TextView textView = eb61Var.e;
        setCardBackgroundColor(colorModel.get(c));
        boolean z = state.d;
        ShimmerFrameLayout shimmerFrameLayout = eb61Var.d;
        if (z) {
            shimmerFrameLayout.startShimmer();
        } else {
            shimmerFrameLayout.stopShimmer();
        }
        TextView textView2 = eb61Var.b;
        xty0.d(textView, state.a);
        xty0.e(textView, state.f);
        xty0.d(textView2, state.b);
        xty0.e(textView2, state.g);
        eb61Var.f.render(new qq31(17, state));
        v4b1.k(state.c, eb61Var.c, null, null, 6);
    }

    public final void setListener(sls listener) {
        this.listener = listener;
    }

    public WidgetWithButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WidgetWithButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public WidgetWithButtonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
