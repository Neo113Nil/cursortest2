package com.yandex.go.navigator.rate_route;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.go.navigator.ui.BubbleGridView;
import defpackage.i7i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/navigator/rate_route/RatingReasonsView;", "Lcom/yandex/go/navigator/ui/BubbleGridView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Li7i0;", "adapter", "Li7i0;", "getAdapter", "()Li7i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RatingReasonsView extends BubbleGridView {
    public static final int $stable = BubbleGridView.$stable | 8;
    private final i7i0 adapter;

    public /* synthetic */ RatingReasonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.yandex.go.navigator.ui.BubbleGridView
    public i7i0 getAdapter() {
        return this.adapter;
    }

    public RatingReasonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RatingReasonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.adapter = new i7i0(this);
    }

    public RatingReasonsView(Context context) {
        this(context, null, 0, 6, null);
    }
}
