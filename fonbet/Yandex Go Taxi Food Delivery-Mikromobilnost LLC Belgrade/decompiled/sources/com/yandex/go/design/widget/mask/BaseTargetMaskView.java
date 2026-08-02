package com.yandex.go.design.widget.mask;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import defpackage.tje;
import defpackage.tls;
import defpackage.vhr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H$¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0017R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R0\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0015\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/yandex/go/design/widget/mask/BaseTargetMaskView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lvhr0;", "createMask", "(Landroid/content/Context;)Lvhr0;", "w", "h", "Landroid/graphics/Rect;", "computeTargetRect", "(II)Landroid/graphics/Rect;", "", "isVisible", "Lzy11;", "setStrokeVisibility", "(Z)V", "reset", "()V", "", "Landroid/graphics/Point;", CRLDistributionPointsExtension.POINTS, "setPoints", "(Ljava/util/List;)V", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "mask", "Lvhr0;", "value", "showDebugPoints", "Z", "getShowDebugPoints", "()Z", "setShowDebugPoints", "incomingPoints", "Ljava/util/List;", "Landroid/graphics/Paint;", "debugPaint", "Landroid/graphics/Paint;", "Lkotlin/Function1;", "onFullyCapturedListener", "Ltls;", "getOnFullyCapturedListener", "()Ltls;", "setOnFullyCapturedListener", "(Ltls;)V", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseTargetMaskView extends View {
    public static final int $stable = 8;
    private final Paint debugPaint;
    private List<? extends Point> incomingPoints;
    private final vhr0 mask;
    private tls onFullyCapturedListener;
    private boolean showDebugPoints;

    public BaseTargetMaskView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mask = createMask(context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(DebugGraphView.DEFAULT_GRAPH_COLOR);
        paint.setStrokeWidth(tje.u(3, getContext()));
        this.debugPaint = paint;
    }

    public abstract Rect computeTargetRect(int w, int h);

    public abstract vhr0 createMask(Context context);

    @Override // android.view.View
    public void draw(Canvas canvas) {
        List<? extends Point> list;
        super.draw(canvas);
        vhr0 vhr0Var = this.mask;
        vhr0Var.getClass();
        int save = canvas.save();
        try {
            canvas.clipOutPath(vhr0Var.d);
            canvas.drawColor(vhr0Var.a);
            canvas.restoreToCount(save);
            if (vhr0Var.b) {
                vhr0Var.d(canvas, vhr0Var.f);
            }
            if (this.showDebugPoints && (list = this.incomingPoints) != null) {
                save = canvas.save();
                try {
                    for (Point point : list) {
                        canvas.drawPoint(point.x, point.y, this.debugPaint);
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    public final tls getOnFullyCapturedListener() {
        return this.onFullyCapturedListener;
    }

    public final boolean getShowDebugPoints() {
        return this.showDebugPoints;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Rect computeTargetRect = computeTargetRect(w, h);
        vhr0 vhr0Var = this.mask;
        Path path = vhr0Var.d;
        path.reset();
        Matrix matrix = vhr0Var.c;
        matrix.reset();
        vhr0Var.c(computeTargetRect, path, matrix);
        path.close();
        path.transform(matrix);
        Region region = vhr0Var.e;
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        region.setPath(path, new Region(rect));
    }

    public final void reset() {
        this.incomingPoints = null;
        this.mask.e();
        invalidate();
    }

    public final void setOnFullyCapturedListener(tls tlsVar) {
        this.onFullyCapturedListener = tlsVar;
    }

    public final void setPoints(List<? extends Point> points) {
        this.incomingPoints = points;
        this.mask.a(points);
        invalidate();
        tls tlsVar = this.onFullyCapturedListener;
        if (tlsVar != null) {
            tlsVar.invoke(Boolean.valueOf(this.mask.b()));
        }
    }

    public final void setShowDebugPoints(boolean z) {
        this.showDebugPoints = z;
        invalidate();
    }

    public final void setStrokeVisibility(boolean isVisible) {
        this.mask.b = isVisible;
        invalidate();
    }

    public BaseTargetMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BaseTargetMaskView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public BaseTargetMaskView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ BaseTargetMaskView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
