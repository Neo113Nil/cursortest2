package com.yandex.go.places.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoView;
import defpackage.c4i0;
import defpackage.cma1;
import defpackage.k6h0;
import defpackage.kyh0;
import defpackage.mia1;
import defpackage.ny61;
import defpackage.q7c0;
import defpackage.quh0;
import defpackage.sls;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0006\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/yandex/go/places/common/ui/FilterButtonView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "iconResId", "Lkotlin/Function0;", "Lzy11;", "onFilterClicked", "(Landroid/content/Context;ILsls;)V", "applyXmlAttributes", "(Landroid/util/AttributeSet;)V", "listener", "setOnFilterClicked", "(Lsls;)V", "resId", "setIcon", "(I)V", "", "isEnabled", "setFilterButtonEnabled", "(Z)V", "isVisible", "setBadgeDotVisible", "Lq7c0;", "binding", "Lq7c0;", "Lcom/yandex/go/places/common/ui/ControlButtonView;", "filterButton", "Lcom/yandex/go/places/common/ui/ControlButtonView;", "Lcom/yandex/go/design/view/GoView;", "badgeDot", "Lcom/yandex/go/design/view/GoView;", "filterButtonEnabled", "Z", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FilterButtonView extends GoFrameLayout {
    private final GoView badgeDot;
    private final q7c0 binding;
    private final ControlButtonView filterButton;
    private boolean filterButtonEnabled;

    public FilterButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        View inflate = LayoutInflater.from(context).inflate(quh0.places_filter_button_view, (ViewGroup) this, false);
        addView(inflate);
        int i = k6h0.filter_badge_dot;
        GoView goView = (GoView) cma1.O(i, inflate);
        if (goView != null) {
            i = k6h0.filter_button;
            ControlButtonView controlButtonView = (ControlButtonView) cma1.O(i, inflate);
            if (controlButtonView != null) {
                this.binding = new q7c0((FrameLayout) inflate, goView, controlButtonView);
                this.filterButton = controlButtonView;
                this.badgeDot = goView;
                goView.setVisibility(8);
                setContentDescription(context.getString(kyh0.discovery_list_filters));
                mia1.c(this);
                applyXmlAttributes(attributeSet);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    private final void applyXmlAttributes(AttributeSet attrs) {
        if (attrs == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.CircleButtonComponent, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(c4i0.CircleButtonComponent_component_circle_image, 0);
            if (resourceId != 0) {
                setIcon(resourceId);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setBadgeDotVisible(boolean isVisible) {
        this.badgeDot.setVisibility(isVisible ? 0 : 8);
    }

    public final void setFilterButtonEnabled(boolean isEnabled) {
        this.filterButtonEnabled = isEnabled;
        this.filterButton.setEnabled(isEnabled);
        this.filterButton.setIconTintAttr(isEnabled ? xng0.textMain : xng0.controlMinor);
    }

    public final void setIcon(int resId) {
        this.filterButton.setImageResource(resId);
    }

    public final void setOnFilterClicked(sls listener) {
        c.z(listener, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterButtonView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FilterButtonView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterButtonView(Context context, int i, sls slsVar) {
        this(context, null, 2, 0 == true ? 1 : 0);
        setOnFilterClicked(slsVar);
        setIcon(i);
    }
}
