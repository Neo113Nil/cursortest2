package com.yandex.go.navigator.driving;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import defpackage.fmm;
import defpackage.jl40;
import defpackage.skm;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/navigator/driving/DrivingTimeTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "Lfmm;", "onTextSizeChangedListener", "Lfmm;", "getOnTextSizeChangedListener", "()Lfmm;", "setOnTextSizeChangedListener", "(Lfmm;)V", "", "lastTextSize", "F", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DrivingTimeTextView extends RobotoTextView {
    public static final int $stable = 8;
    private float lastTextSize;
    private fmm onTextSizeChangedListener;

    public /* synthetic */ DrivingTimeTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.robotoTextViewStyle : i);
    }

    public final fmm getOnTextSizeChangedListener() {
        return this.onTextSizeChangedListener;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        DrivingTimeTextView[] sizeAwareTextViews;
        super.onDraw(canvas);
        if (this.lastTextSize == getTextSize()) {
            return;
        }
        float textSize = getTextSize();
        this.lastTextSize = textSize;
        fmm fmmVar = this.onTextSizeChangedListener;
        if (fmmVar != null) {
            sizeAwareTextViews = ((skm) fmmVar).a.getSizeAwareTextViews();
            for (DrivingTimeTextView drivingTimeTextView : sizeAwareTextViews) {
                if (!jl40.l(drivingTimeTextView, this) && drivingTimeTextView.getTextSize() != getTextSize()) {
                    drivingTimeTextView.setAutoSizeTextTypeUniformWithPresetSizes(new int[]{(int) textSize}, 0);
                }
            }
        }
    }

    public final void setOnTextSizeChangedListener(fmm fmmVar) {
        this.onTextSizeChangedListener = fmmVar;
    }

    public DrivingTimeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DrivingTimeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lastTextSize = getTextSize();
    }

    public DrivingTimeTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
