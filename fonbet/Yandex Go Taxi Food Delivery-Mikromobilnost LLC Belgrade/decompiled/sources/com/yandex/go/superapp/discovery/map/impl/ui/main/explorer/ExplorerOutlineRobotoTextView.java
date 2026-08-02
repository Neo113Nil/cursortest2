package com.yandex.go.superapp.discovery.map.impl.ui.main.explorer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/explorer/ExplorerOutlineRobotoTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "strokeColor", CA20Status.STATUS_USER_I, "", "strokeWidth", "F", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExplorerOutlineRobotoTextView extends RobotoTextView {
    private final int strokeColor;
    private final float strokeWidth;

    public ExplorerOutlineRobotoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.strokeColor = qje.t(xng0.bgMain, context);
        this.strokeWidth = tje.x(getContext(), 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int currentTextColor = getCurrentTextColor();
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setStrokeWidth(this.strokeWidth);
        getPaint().setStrokeJoin(Paint.Join.ROUND);
        setTextColor(this.strokeColor);
        super.onDraw(canvas);
        getPaint().setStyle(Paint.Style.FILL);
        setTextColor(currentTextColor);
        super.onDraw(canvas);
    }

    public ExplorerOutlineRobotoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ExplorerOutlineRobotoTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ExplorerOutlineRobotoTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
