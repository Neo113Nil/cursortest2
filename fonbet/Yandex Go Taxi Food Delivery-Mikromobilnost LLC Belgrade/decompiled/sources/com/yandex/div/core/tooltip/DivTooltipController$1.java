package com.yandex.div.core.tooltip;

import android.view.View;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/yandex/div/core/util/SafePopupWindow;", "c", "Landroid/view/View;", "w", "", "h", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DivTooltipController$1 extends Lambda implements zls {
    public static final DivTooltipController$1 w = new DivTooltipController$1(3);

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new DivTooltipWindow((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), false, 8, null);
    }
}
