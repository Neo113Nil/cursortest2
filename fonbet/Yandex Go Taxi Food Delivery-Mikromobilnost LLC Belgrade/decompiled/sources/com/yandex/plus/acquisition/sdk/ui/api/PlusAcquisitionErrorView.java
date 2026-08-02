package com.yandex.plus.acquisition.sdk.ui.api;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a0d0;
import defpackage.b1i0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.m3i0;
import defpackage.mvg0;
import defpackage.q9h0;
import defpackage.qng0;
import defpackage.qoi0;
import defpackage.t9b0;
import defpackage.vng;
import defpackage.wv5;
import defpackage.zlh0;
import defpackage.zzc0;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001 B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/ui/api/PlusAcquisitionErrorView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/TextView;", "errorTextView$delegate", "Lwv5;", "getErrorTextView", "()Landroid/widget/TextView;", "errorTextView", "errorAdditionalTextView$delegate", "Li3y;", "getErrorAdditionalTextView", "errorAdditionalTextView", "Landroid/widget/Button;", "retryButton$delegate", "getRetryButton", "()Landroid/widget/Button;", "retryButton", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Companion", "zzc0", "acquisition-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusAcquisitionErrorView extends LinearLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("errorTextView", 0, "getErrorTextView()Landroid/widget/TextView;", PlusAcquisitionErrorView.class), b64.x(qoi0.a, PlusAcquisitionErrorView.class, "retryButton", "getRetryButton()Landroid/widget/Button;", 0)};
    private static final zzc0 Companion = new zzc0();

    @Deprecated
    public static final int WITHOUT_IMAGE_TYPE_VALUE = 0;

    /* renamed from: errorAdditionalTextView$delegate, reason: from kotlin metadata */
    private final i3y errorAdditionalTextView;

    /* renamed from: errorTextView$delegate, reason: from kotlin metadata */
    private final wv5 errorTextView;

    /* renamed from: retryButton$delegate, reason: from kotlin metadata */
    private final wv5 retryButton;

    public PlusAcquisitionErrorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3;
        int i4 = 0;
        this.errorTextView = new wv5(new a0d0(this, q9h0.error_text_view, i4));
        this.errorAdditionalTextView = a.a(new t9b0(29, this));
        this.retryButton = new wv5(new a0d0(this, q9h0.retry_button, 1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m3i0.acquisition_sdk_PlusAcquisitionErrorScreen, i, i2);
        if (obtainStyledAttributes.getInt(m3i0.acquisition_sdk_PlusAcquisitionErrorScreen_acquisition_sdk_type, 0) == 0) {
            i3 = zlh0.acquisition_sdk_view_error_without_image;
        } else {
            int i5 = zlh0.acquisition_sdk_view_error_with_image;
            i4 = vng.s(mvg0.acquisition_sdk_dimension_size_200, context);
            i3 = i5;
        }
        bb1.v(this, i3, true);
        setPadding(i4, i4, i4, i4);
        obtainStyledAttributes.recycle();
        setOrientation(1);
        setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView errorAdditionalTextView_delegate$lambda$0(PlusAcquisitionErrorView plusAcquisitionErrorView) {
        return (TextView) plusAcquisitionErrorView.findViewById(q9h0.error_additional_text_view);
    }

    public TextView getErrorAdditionalTextView() {
        return (TextView) this.errorAdditionalTextView.getValue();
    }

    public TextView getErrorTextView() {
        return (TextView) this.errorTextView.a($$delegatedProperties[0]);
    }

    public Button getRetryButton() {
        return (Button) this.retryButton.a($$delegatedProperties[1]);
    }

    public View getView() {
        return this;
    }

    public PlusAcquisitionErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PlusAcquisitionErrorView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ PlusAcquisitionErrorView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? qng0.acquisition_sdk_errorScreenStyle : i, (i3 & 8) != 0 ? b1i0.AcquisitionSdk_Widget_ErrorScreen : i2);
    }

    public PlusAcquisitionErrorView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
