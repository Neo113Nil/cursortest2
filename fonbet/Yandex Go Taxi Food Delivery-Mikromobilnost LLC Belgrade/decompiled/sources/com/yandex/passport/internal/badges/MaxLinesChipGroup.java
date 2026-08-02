package com.yandex.passport.internal.badges;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.chip.ChipGroup;
import defpackage.eng0;
import defpackage.g8e;
import defpackage.h8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/passport/internal/badges/MaxLinesChipGroup;", "Lcom/google/android/material/chip/ChipGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "maxLines", CA20Status.STATUS_USER_I, "getMaxLines", "()I", "setMaxLines", "(I)V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MaxLinesChipGroup extends ChipGroup {
    public static final int $stable = 8;
    private int maxLines;

    public /* synthetic */ MaxLinesChipGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? eng0.chipGroupStyle : i);
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // com.google.android.material.internal.FlowLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Integer num;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        h8 h8Var = new h8(3, this);
        if (h8Var.hasNext()) {
            Integer valueOf = Integer.valueOf(((View) h8Var.next()).getMeasuredHeight());
            while (h8Var.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((View) h8Var.next()).getMeasuredHeight());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + g8e.d(this.maxLines, 1, getLineSpacing(), (num != null ? num.intValue() : 0) * this.maxLines);
        while (getMeasuredHeight() > paddingBottom && getChildCount() > 0) {
            removeViewInLayout(getChildAt(getChildCount() - 1));
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setMaxLines(int i) {
        this.maxLines = i;
    }

    public MaxLinesChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MaxLinesChipGroup(Context context) {
        this(context, null, 0, 6, null);
    }

    public MaxLinesChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxLines = Integer.MAX_VALUE;
    }
}
