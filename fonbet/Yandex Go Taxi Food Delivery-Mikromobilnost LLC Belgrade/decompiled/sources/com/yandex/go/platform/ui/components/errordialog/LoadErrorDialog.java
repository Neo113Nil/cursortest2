package com.yandex.go.platform.ui.components.errordialog;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.ing0;
import defpackage.kob1;
import defpackage.s6h0;
import defpackage.xuh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR$\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010(\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010+\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R$\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u00020,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/yandex/go/platform/ui/components/errordialog/LoadErrorDialog;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "listener", "Lzy11;", "setOnCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "setOnActionClickListener", "onDetachedFromWindow", "()V", "Landroid/view/View;", "cancelView", "Landroid/view/View;", "Landroid/widget/TextView;", "actionView", "Landroid/widget/TextView;", "titleView", "subtitleView", "getPrimaryColor", "()I", "primaryColor", "getTextColor", "textColor", "", "value", "getDialogTitle", "()Ljava/lang/String;", "setDialogTitle", "(Ljava/lang/String;)V", "dialogTitle", "getDialogSubtitle", "setDialogSubtitle", "dialogSubtitle", "getActionText", "setActionText", "actionText", "", "isActionButtonVisible", "()Z", "setActionButtonVisible", "(Z)V", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoadErrorDialog extends FrameLayout {
    private final TextView actionView;
    private final View cancelView;
    private final TextView subtitleView;
    private final TextView titleView;

    public LoadErrorDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, xuh0.dialog_loading_error, this);
        setBackgroundColor(kob1.b(ing0.bgMinor, context));
        this.cancelView = findViewById(s6h0.dialog_cancel_button);
        TextView textView = (TextView) findViewById(s6h0.dialog_action_button);
        this.actionView = textView;
        this.titleView = (TextView) findViewById(s6h0.dialog_title);
        this.subtitleView = (TextView) findViewById(s6h0.dialog_message);
        if (isInEditMode()) {
            return;
        }
        textView.setTextColor(getTextColor());
        textView.setBackgroundTintList(ColorStateList.valueOf(getPrimaryColor()));
    }

    private final int getPrimaryColor() {
        return kob1.b(ing0.controlMain, getContext());
    }

    private final int getTextColor() {
        return kob1.b(ing0.textOnControl, getContext());
    }

    public final String getActionText() {
        return this.actionView.getText().toString();
    }

    public final String getDialogSubtitle() {
        return this.subtitleView.getText().toString();
    }

    public final String getDialogTitle() {
        return this.titleView.getText().toString();
    }

    public final boolean isActionButtonVisible() {
        return this.actionView.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        animate().cancel();
        super.onDetachedFromWindow();
    }

    public final void setActionButtonVisible(boolean z) {
        this.actionView.setVisibility(z ? 0 : 8);
    }

    public final void setActionText(String str) {
        this.actionView.setText(str);
    }

    public final void setDialogSubtitle(String str) {
        this.subtitleView.setText(str);
    }

    public final void setDialogTitle(String str) {
        this.titleView.setText(str);
    }

    public final void setOnActionClickListener(View.OnClickListener listener) {
        this.actionView.setOnClickListener(listener);
    }

    public final void setOnCancelClickListener(View.OnClickListener listener) {
        this.cancelView.setOnClickListener(listener);
    }

    public LoadErrorDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ LoadErrorDialog(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public LoadErrorDialog(Context context) {
        this(context, null, 0, 6, null);
    }
}
