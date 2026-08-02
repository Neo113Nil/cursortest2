package com.yandex.go.scooters.discovery;

import android.content.Context;
import android.graphics.Canvas;
import com.yandex.go.design.view.GoImageView;
import defpackage.kyk0;
import defpackage.myk0;
import defpackage.tmm0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/yandex/go/scooters/discovery/ScootersDiscoveryModalView$createToolbarLogotype$1$2", "Lcom/yandex/go/design/view/GoImageView;", "", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkyk0;", "roundedCornersViewHelper", "Lkyk0;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersDiscoveryModalView$createToolbarLogotype$1$2 extends GoImageView {
    private final kyk0 roundedCornersViewHelper;

    public ScootersDiscoveryModalView$createToolbarLogotype$1$2(Context context) {
        super(context, null, 0, 6, null);
        myk0 myk0Var = new myk0(this);
        myk0Var.b(1000.0f, 1000.0f);
        this.roundedCornersViewHelper = myk0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onDraw$lambda$1(ScootersDiscoveryModalView$createToolbarLogotype$1$2 scootersDiscoveryModalView$createToolbarLogotype$1$2, Canvas canvas) {
        super.onDraw(canvas);
        return zy11.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.roundedCornersViewHelper.a(canvas, new tmm0(16, this, canvas));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.roundedCornersViewHelper.d(w, h);
    }
}
