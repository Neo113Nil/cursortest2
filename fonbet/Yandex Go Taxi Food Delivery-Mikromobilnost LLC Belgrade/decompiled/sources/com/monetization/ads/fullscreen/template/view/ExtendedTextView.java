package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.dl71;
import defpackage.hm61;
import defpackage.k581;
import defpackage.my71;
import defpackage.rv71;
import defpackage.wp61;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/ExtendedTextView;", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "Lwp61;", "measureSpecProvider", "Lmy71;", "appCompatAutoSizeControllerFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILwp61;Lmy71;)V", "Lzy11;", "setMeasureSpecProvider", "(Lwp61;)V", "autoSizeTextType", "setAutoSizeTextType", "(I)V", "unit", "", "size", "setTextSize", "(IF)V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtendedTextView extends TextView {
    private wp61 a;
    private final rv71 b;

    public /* synthetic */ ExtendedTextView(Context context, AttributeSet attributeSet, int i, wp61 wp61Var, my71 my71Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new dl71() : wp61Var, (i2 & 16) != 0 ? new my71() : my71Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        hm61 l = this.a.l(i, i2);
        super.onMeasure(l.a, l.b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public final void setAutoSizeTextType(int autoSizeTextType) {
        setAutoSizeTextTypeWithDefaults(autoSizeTextType);
    }

    public final void setMeasureSpecProvider(wp61 measureSpecProvider) {
        this.a = measureSpecProvider;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int unit, float size) {
        super.setTextSize(unit, size);
    }

    public ExtendedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
    }

    public ExtendedTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, null, 24, null);
    }

    public ExtendedTextView(Context context, AttributeSet attributeSet, int i, wp61 wp61Var) {
        this(context, attributeSet, i, wp61Var, null, 16, null);
    }

    public ExtendedTextView(Context context) {
        this(context, null, 0, null, null, 30, null);
    }

    public ExtendedTextView(Context context, AttributeSet attributeSet, int i, wp61 wp61Var, my71 my71Var) {
        super(context, attributeSet, i);
        this.a = wp61Var;
        my71Var.getClass();
        getContext();
        new k581();
        this.b = new rv71();
    }
}
