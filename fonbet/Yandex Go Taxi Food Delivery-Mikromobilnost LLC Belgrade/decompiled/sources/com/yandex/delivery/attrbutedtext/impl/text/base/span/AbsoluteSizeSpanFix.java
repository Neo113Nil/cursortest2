package com.yandex.delivery.attrbutedtext.impl.text.base.span;

import android.text.style.AbsoluteSizeSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0082\u0004J\n\u0010\u000b\u001a\u00020\u0003H\u0096\u0080\u0004¨\u0006\f"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/impl/text/base/span/AbsoluteSizeSpanFix;", "Landroid/text/style/AbsoluteSizeSpan;", "size", "", "dip", "", "<init>", "(IZ)V", "equals", "other", "", "hashCode", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbsoluteSizeSpanFix extends AbsoluteSizeSpan {
    public static final int $stable = 8;

    public AbsoluteSizeSpanFix(int i, boolean z) {
        super(i, z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AbsoluteSizeSpanFix.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbsoluteSizeSpanFix absoluteSizeSpanFix = (AbsoluteSizeSpanFix) other;
        return getSize() == absoluteSizeSpanFix.getSize() && getDip() == absoluteSizeSpanFix.getDip();
    }

    public int hashCode() {
        return Boolean.hashCode(getDip()) + (getSize() * 31);
    }
}
