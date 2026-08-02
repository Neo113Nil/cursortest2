package com.ybsdk.feature.dashboard.internal.ui.dashboard3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.dye;
import defpackage.ha60;
import defpackage.jmg;
import defpackage.ny61;
import defpackage.pey;
import defpackage.rlg;
import defpackage.rs31;
import defpackage.ta60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u00060\u0019R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/view/DashboardTokenizationWidget;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lta60;", "widgetFactory", "Lha60;", "supportChecker", "Lrs31;", "storeOwner", "Lpey;", "hostLifecycleOwner", "Lzy11;", "setWidgetFactory", "(Lta60;Lha60;Lrs31;Lpey;)V", "Ljmg;", "nfcType", "bind", "(Ljmg;)Lzy11;", "Lrlg;", "widgetHolder", "Lrlg;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardTokenizationWidget extends FrameLayout {
    private final rlg widgetHolder;

    public /* synthetic */ DashboardTokenizationWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final zy11 bind(jmg nfcType) {
        Object invoke = this.widgetHolder.a.invoke(nfcType);
        if (invoke != null) {
            ny61.u();
            return null;
        }
        if (invoke == null) {
            return null;
        }
        ny61.u();
        return null;
    }

    public final void setWidgetFactory(ta60 widgetFactory, ha60 supportChecker, rs31 storeOwner, pey hostLifecycleOwner) {
        rlg rlgVar = this.widgetHolder;
        rlgVar.a = new dye(supportChecker, rlgVar.b, hostLifecycleOwner, storeOwner);
    }

    public DashboardTokenizationWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DashboardTokenizationWidget(Context context) {
        this(context, null, 0, 6, null);
    }

    public DashboardTokenizationWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.widgetHolder = new rlg(this);
    }
}
