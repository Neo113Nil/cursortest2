package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.m810;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/CroppedTextView;", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CroppedTextView extends TextView {
    private final int a;

    public /* synthetic */ CroppedTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int lineHeight = getLineHeight();
        if (lineHeight > 0) {
            int min = Math.min((getMeasuredHeight() + m810.b(getLineHeight() * 0.05f)) / lineHeight, this.a);
            if (min == getMinLines() && min == getMaxLines()) {
                return;
            }
            setLines(min);
            TextUtils.TruncateAt ellipsize = getEllipsize();
            setEllipsize(null);
            setEllipsize(ellipsize);
        }
    }

    public CroppedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CroppedTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CroppedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getMaxLines();
    }
}
