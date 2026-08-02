package com.yandex.go.chargers.design.utils;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/chargers/design/utils/ClickableImageSpanKt$appendClickableImage$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "Lzy11;", "onClick", "(Landroid/view/View;)V", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ClickableImageSpanKt$appendClickableImage$clickableSpan$1 extends ClickableSpan {
    final /* synthetic */ Drawable $drawable;
    final /* synthetic */ ClickableImageSpanKt$appendClickableImage$imageSpan$1 $imageSpan;
    final /* synthetic */ tls $onClick;
    final /* synthetic */ ViewGroup $parentToCalcCoordinates;

    public ClickableImageSpanKt$appendClickableImage$clickableSpan$1(ViewGroup viewGroup, ClickableImageSpanKt$appendClickableImage$imageSpan$1 clickableImageSpanKt$appendClickableImage$imageSpan$1, tls tlsVar, Drawable drawable) {
        this.$parentToCalcCoordinates = viewGroup;
        this.$imageSpan = clickableImageSpanKt$appendClickableImage$imageSpan$1;
        this.$onClick = tlsVar;
        this.$drawable = drawable;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        Rect rect = new Rect();
        widget.getDrawingRect(rect);
        this.$parentToCalcCoordinates.offsetDescendantRectToMyCoords(widget, rect);
        int i = rect.top;
        int i2 = rect.left + this.$imageSpan.getPosition().x;
        this.$onClick.invoke(new Rect(i2, i, this.$drawable.getIntrinsicWidth() + i2, this.$drawable.getIntrinsicHeight() + i));
    }
}
