package com.yandex.delivery.attrbutedtext.impl.text.base.span;

import android.text.style.StyleSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0082\u0004J\n\u0010\n\u001a\u00020\u0003H\u0096\u0080\u0004¨\u0006\u000b"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/impl/text/base/span/StyleSpanFix;", "Landroid/text/style/StyleSpan;", "style", "", "<init>", "(I)V", "equals", "", "other", "", "hashCode", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StyleSpanFix extends StyleSpan {
    public static final int $stable = 8;

    public StyleSpanFix(int i) {
        super(i);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return StyleSpanFix.class.equals(other != null ? other.getClass() : null) && getStyle() == ((StyleSpanFix) other).getStyle();
    }

    public int hashCode() {
        return getStyle();
    }
}
