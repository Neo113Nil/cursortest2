package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.cma1;
import defpackage.db61;
import defpackage.fch0;
import defpackage.lwg0;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rje;
import defpackage.s451;
import defpackage.sm91;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.vpb;
import defpackage.xty0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/widgets/common/WidgetWithSwitchView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "", "Lzy11;", "listener", "setListener", "(Ltls;)V", "Ls451;", ClidProvider.STATE, "render", "(Ls451;)V", "Ldb61;", "binding", "Ldb61;", "Ltls;", "switchInRender", "Z", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WidgetWithSwitchView extends CardView {
    private final db61 binding;
    private tls listener;
    private boolean switchInRender;

    public WidgetWithSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_widget_widget_with_switch_layout, this);
        int i2 = fch0.description;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = fch0.enableSwitch;
            SwitchCompat switchCompat = (SwitchCompat) cma1.O(i2, this);
            if (switchCompat != null) {
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
                                this.binding = new db61(this, textView, switchCompat, appCompatImageView, shimmerFrameLayout, textView2);
                                setCardElevation(0.0f);
                                setRadius(rje.d(lwg0.ybsdk_widget_view_corner_radius, context));
                                switchCompat.setOnCheckedChangeListener(new vpb(5, this));
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
    public static final void _init_$lambda$0(WidgetWithSwitchView widgetWithSwitchView, CompoundButton compoundButton, boolean z) {
        tls tlsVar;
        if (widgetWithSwitchView.switchInRender || (tlsVar = widgetWithSwitchView.listener) == null) {
            return;
        }
        tlsVar.invoke(Boolean.valueOf(z));
    }

    public final void render(s451 state) {
        db61 db61Var = this.binding;
        ColorModel colorModel = state.f;
        Context c = sm91.c(db61Var);
        TextView textView = db61Var.f;
        setCardBackgroundColor(colorModel.get(c));
        boolean z = state.e;
        ShimmerFrameLayout shimmerFrameLayout = db61Var.e;
        if (z) {
            shimmerFrameLayout.startShimmer();
        } else {
            shimmerFrameLayout.stopShimmer();
        }
        TextView textView2 = db61Var.b;
        SwitchCompat switchCompat = db61Var.c;
        xty0.d(textView, state.a);
        xty0.e(textView, state.g);
        xty0.d(textView2, state.b);
        xty0.e(textView2, state.h);
        v4b1.k(state.c, db61Var.d, null, null, 6);
        this.switchInRender = true;
        switchCompat.setChecked(state.d);
        this.switchInRender = false;
        switchCompat.setEnabled(!z && state.j);
        switchCompat.setTrackTintList(state.i.b(sm91.c(db61Var)));
    }

    public final void setListener(tls listener) {
        this.listener = listener;
    }

    public WidgetWithSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WidgetWithSwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public WidgetWithSwitchView(Context context) {
        this(context, null, 0, 6, null);
    }
}
