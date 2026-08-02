package com.yandex.plus.acquisition.sdk.ui.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import defpackage.b0d0;
import defpackage.b1i0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.kgx;
import defpackage.q9h0;
import defpackage.qng0;
import defpackage.qoi0;
import defpackage.wv5;
import defpackage.zlh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/ui/api/PlusAcquisitionLoadingView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/ProgressBar;", "progressBar$delegate", "Lwv5;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/TextView;", "infoTextView$delegate", "getInfoTextView", "()Landroid/widget/TextView;", "infoTextView", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "acquisition-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusAcquisitionLoadingView extends LinearLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("progressBar", 0, "getProgressBar()Landroid/widget/ProgressBar;", PlusAcquisitionLoadingView.class), b64.x(qoi0.a, PlusAcquisitionLoadingView.class, "infoTextView", "getInfoTextView()Landroid/widget/TextView;", 0)};

    /* renamed from: infoTextView$delegate, reason: from kotlin metadata */
    private final wv5 infoTextView;

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final wv5 progressBar;

    public PlusAcquisitionLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.progressBar = new wv5(new b0d0(this, q9h0.progress_bar, 0));
        this.infoTextView = new wv5(new b0d0(this, q9h0.text_view, 1));
        bb1.v(this, zlh0.acquisition_sdk_view_loading, true);
        setOrientation(1);
        setGravity(17);
    }

    public TextView getInfoTextView() {
        return (TextView) this.infoTextView.a($$delegatedProperties[1]);
    }

    public ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar.a($$delegatedProperties[0]);
    }

    public View getView() {
        return this;
    }

    public PlusAcquisitionLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PlusAcquisitionLoadingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ PlusAcquisitionLoadingView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? qng0.acquisition_sdk_loadingScreenStyle : i, (i3 & 8) != 0 ? b1i0.AcquisitionSdk_Widget_LoadingScreen : i2);
    }

    public PlusAcquisitionLoadingView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
