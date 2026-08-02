package com.yandex.plus.pay.ui.common.api.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import defpackage.bb1;
import defpackage.fmh0;
import defpackage.kgx;
import defpackage.qoi0;
import defpackage.w9h0;
import defpackage.wv5;
import defpackage.xzr;
import defpackage.yjf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ProgressBar;", "progressBar$delegate", "Lwv5;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "value", "getProgress", "()I", "setProgress", "(I)V", "progress", "Companion", "yjf0", "pay-sdk-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressView extends FrameLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    public static final yjf0 Companion;
    public static final String VIEW_TAG = "com.yandex.plus.pay.ui.common.api.ui.view.ProgressView";

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final wv5 progressBar;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("progressBar", 0, "getProgressBar()Landroid/widget/ProgressBar;", ProgressView.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
        Companion = new yjf0();
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.progressBar = new wv5(new xzr(this, w9h0.progress_bar, 5));
        bb1.v(this, fmh0.pay_sdk_view_tarifficator_progress, true);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(VIEW_TAG);
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar.a($$delegatedProperties[0]);
    }

    public final int getProgress() {
        return getProgressBar().getProgress();
    }

    public final void setProgress(int i) {
        getProgressBar().setProgress(i);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ProgressView(Context context) {
        this(context, null, 0, 6, null);
    }
}
