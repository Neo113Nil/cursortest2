package com.yandex.div.core.view2;

/* compiled from: CompositeLogId.kt */
/* loaded from: classes7.dex */
public final class CompositeLogIdKt {
    public static final CompositeLogId compositeLogIdOf(Div2View div2View, String str) {
        return new CompositeLogId(div2View.getDataTag().getId(), div2View.getLogId(), str);
    }
}
