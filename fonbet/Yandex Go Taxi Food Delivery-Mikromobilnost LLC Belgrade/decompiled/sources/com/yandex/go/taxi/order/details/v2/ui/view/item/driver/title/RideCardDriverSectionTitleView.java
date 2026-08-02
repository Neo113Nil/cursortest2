package com.yandex.go.taxi.order.details.v2.ui.view.item.driver.title;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import defpackage.b0y;
import defpackage.cma1;
import defpackage.lgk0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.vgk0;
import defpackage.w511;
import defpackage.wgk0;
import defpackage.xgk0;
import defpackage.xz;
import defpackage.zkh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/driver/title/RideCardDriverSectionTitleView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lvgk0;", "title", "Lzy11;", "renderTitleV1", "(Lvgk0;)V", "Lwgk0;", "renderTitleV2", "(Lwgk0;)V", "updateWidthSizing", "()V", "", "newWeight", "setMainTextWeight", "(F)V", "Lxgk0;", "render", "(Lxgk0;)V", "measurePreRenderedHeight", "()I", "Lb0y;", "binding", "Lb0y;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardDriverSectionTitleView extends GoLinearLayout {
    public static final int $stable = 8;
    private final b0y binding;

    public RideCardDriverSectionTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(zkh0.layout_details_card_driver_title, this);
        int i2 = p8h0.badges;
        RideCardDriverSectionBadgesView rideCardDriverSectionBadgesView = (RideCardDriverSectionBadgesView) cma1.O(i2, this);
        if (rideCardDriverSectionBadgesView != null) {
            i2 = p8h0.end_filler;
            GoView goView = (GoView) cma1.O(i2, this);
            if (goView != null) {
                i2 = p8h0.main_text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView != null) {
                    i2 = p8h0.rating_text;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
                    if (robotoTextView2 != null) {
                        this.binding = new b0y(this, rideCardDriverSectionBadgesView, goView, robotoTextView, robotoTextView2);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void renderTitleV1(vgk0 title) {
        b0y b0yVar = this.binding;
        b0yVar.d.setText(title.a);
        b0yVar.e.setVisibility(8);
        b0yVar.b.setVisibility(8);
        b0yVar.c.setVisibility(8);
    }

    private final void renderTitleV2(wgk0 title) {
        b0y b0yVar = this.binding;
        RobotoTextView robotoTextView = b0yVar.d;
        RideCardDriverSectionBadgesView rideCardDriverSectionBadgesView = b0yVar.b;
        RobotoTextView robotoTextView2 = b0yVar.e;
        CharSequence charSequence = title.a;
        lgk0 lgk0Var = title.c;
        robotoTextView.setText(charSequence);
        CharSequence charSequence2 = title.b;
        robotoTextView2.setVisibility(charSequence2 != null ? 0 : 8);
        robotoTextView2.setText(charSequence2);
        rideCardDriverSectionBadgesView.setVisibility(lgk0Var != null ? 0 : 8);
        if (lgk0Var != null) {
            rideCardDriverSectionBadgesView.render(lgk0Var);
        }
        updateWidthSizing();
    }

    private final void setMainTextWeight(float newWeight) {
        ViewGroup.LayoutParams layoutParams = this.binding.d.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            this.binding.d.setLayoutParams(layoutParams2);
        }
        if (newWeight == layoutParams2.weight) {
            return;
        }
        RobotoTextView robotoTextView = this.binding.d;
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) robotoTextView.getLayoutParams();
        layoutParams3.weight = newWeight;
        robotoTextView.setLayoutParams(layoutParams3);
    }

    private final void updateWidthSizing() {
        b0y b0yVar = this.binding;
        b0yVar.c.setVisibility(0);
        GoView goView = b0yVar.c;
        int width = goView.getWidth();
        c.D(0, goView.getLayoutParams().height, goView);
        setMainTextWeight(0.0f);
        measure(0, 0);
        c.D(width, goView.getLayoutParams().height, goView);
        setMainTextWeight(1.0f);
        int measuredWidth = getMeasuredWidth();
        requestLayout();
        OneShotPreDrawListener.add(this, new xz(measuredWidth, this, b0yVar));
    }

    public final int measurePreRenderedHeight() {
        int i;
        b0y b0yVar = this.binding;
        RobotoTextView robotoTextView = b0yVar.d;
        RideCardDriverSectionBadgesView rideCardDriverSectionBadgesView = b0yVar.b;
        int i2 = 0;
        robotoTextView.measure(1073741824, 0);
        RobotoTextView robotoTextView2 = b0yVar.e;
        if (robotoTextView2.getVisibility() == 0) {
            robotoTextView2.measure(1073741824, 0);
            i = robotoTextView2.getMeasuredHeight();
        } else {
            i = 0;
        }
        if (rideCardDriverSectionBadgesView.getVisibility() == 0) {
            rideCardDriverSectionBadgesView.measure(0, 0);
            i2 = rideCardDriverSectionBadgesView.getMeasuredHeight();
        }
        return Math.max(b0yVar.d.getMeasuredHeight(), Math.max(i, i2));
    }

    public final void render(xgk0 title) {
        if (title instanceof vgk0) {
            renderTitleV1((vgk0) title);
        } else if (title instanceof wgk0) {
            renderTitleV2((wgk0) title);
        } else {
            w511.b();
        }
    }

    public RideCardDriverSectionTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RideCardDriverSectionTitleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RideCardDriverSectionTitleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
