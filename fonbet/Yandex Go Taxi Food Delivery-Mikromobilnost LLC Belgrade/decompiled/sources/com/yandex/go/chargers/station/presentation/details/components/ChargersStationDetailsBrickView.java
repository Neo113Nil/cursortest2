package com.yandex.go.chargers.station.presentation.details.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.cma1;
import defpackage.kra;
import defpackage.ny61;
import defpackage.vhh0;
import defpackage.wsh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationDetailsBrickView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isLoading", "Lzy11;", "setViewsVisibility", "(Z)V", "startLoading", "()V", "stopLoading", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "Lkra;", "binding", "Lkra;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationDetailsBrickView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final kra binding;

    public ChargersStationDetailsBrickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(wsh0.chargers_station_details_brick_view, this);
        int i2 = vhh0.subtitle;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
        if (robotoTextView != null) {
            i2 = vhh0.subtitle_shimmering_bar;
            ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i2, this);
            if (shimmeringBar != null) {
                i2 = vhh0.title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView2 != null) {
                    i2 = vhh0.title_shimmering_bar;
                    ShimmeringBar shimmeringBar2 = (ShimmeringBar) cma1.O(i2, this);
                    if (shimmeringBar2 != null) {
                        this.binding = new kra(this, robotoTextView, shimmeringBar, robotoTextView2, shimmeringBar2);
                        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void setViewsVisibility(boolean isLoading) {
        this.binding.e.setVisibility(isLoading ? 0 : 8);
        this.binding.c.setVisibility(isLoading ? 0 : 8);
        this.binding.d.setVisibility(isLoading ? 4 : 0);
        this.binding.b.setVisibility(isLoading ? 4 : 0);
    }

    public final void setSubtitle(CharSequence text) {
        this.binding.b.setText(text);
    }

    public final void setTitle(CharSequence text) {
        this.binding.d.setText(text);
    }

    public final void startLoading() {
        setViewsVisibility(true);
    }

    public final void stopLoading() {
        setViewsVisibility(false);
    }

    public ChargersStationDetailsBrickView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChargersStationDetailsBrickView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChargersStationDetailsBrickView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
