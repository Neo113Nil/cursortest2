package com.yandex.go.taxi.order.map_objects;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.p8h0;
import defpackage.zkh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/taxi/order/map_objects/OrderMapBubbleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "Lzy11;", "setTitle", "(Ljava/lang/CharSequence;)V", "", "size", "setTextSize", "(F)V", "lineHeight", "setTextLineHeight", "(I)V", "color", "setTextColor", "maxPixels", "setMaxWidth", "Landroid/widget/TextView;", "text", "Landroid/widget/TextView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderMapBubbleView extends FrameLayout {
    public static final int $stable = 8;
    private final TextView text;

    public OrderMapBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, zkh0.order_map_bubble_view, this);
        this.text = (TextView) findViewById(p8h0.bubble_text);
    }

    public final void setMaxWidth(int maxPixels) {
        this.text.setMaxWidth(maxPixels);
    }

    public final void setTextColor(int color) {
        this.text.setTextColor(color);
    }

    public final void setTextLineHeight(int lineHeight) {
        androidx.core.widget.b.b(this.text, lineHeight);
    }

    public final void setTextSize(float size) {
        this.text.setTextSize(size);
    }

    public final void setTitle(CharSequence title) {
        this.text.setText(title);
    }

    public OrderMapBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrderMapBubbleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OrderMapBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
