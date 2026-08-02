package com.ybsdk.feature.passes.widget.api.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cma1;
import defpackage.jbh0;
import defpackage.ny61;
import defpackage.rnh0;
import defpackage.sls;
import defpackage.zgv;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/passes/widget/api/presentation/PassesWidgetErrorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lzy11;", "block", "setOnRetryClick", "(Lsls;)V", "retryClickListener", "Lsls;", "feature-passes-widget-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassesWidgetErrorView extends FrameLayout {
    private sls retryClickListener;

    public PassesWidgetErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(rnh0.ybsdk_passes_widget_error_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = jbh0.button;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, inflate);
        if (ybButtonView != null) {
            i2 = jbh0.title;
            if (((TextView) cma1.O(i2, inflate)) != null) {
                ybButtonView.setOnClickListener(new zgv(27, this));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(PassesWidgetErrorView passesWidgetErrorView, View view) {
        sls slsVar = passesWidgetErrorView.retryClickListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public final void setOnRetryClick(sls block) {
        this.retryClickListener = block;
    }

    public PassesWidgetErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PassesWidgetErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PassesWidgetErrorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
