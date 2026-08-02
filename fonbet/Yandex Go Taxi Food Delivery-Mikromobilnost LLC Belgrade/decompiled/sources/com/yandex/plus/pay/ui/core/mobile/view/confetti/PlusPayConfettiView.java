package com.yandex.plus.pay.ui.core.mobile.view.confetti;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.abd0;
import defpackage.gih;
import defpackage.lhc;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016¨\u0006 "}, d2 = {"Lcom/yandex/plus/pay/ui/core/mobile/view/confetti/PlusPayConfettiView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "confettiPaint", "Landroid/graphics/Paint;", "", "confettiColors", "[I", "", "Landroid/graphics/PointF;", "confettiPoints", "Ljava/util/List;", "confettiRotation", "", "confettiGlobalAlpha", CA20Status.STATUS_USER_I, "Landroid/graphics/Path;", "confettiShapes", "Companion", "a", "abd0", "pay-sdk-ui-core-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlusPayConfettiView extends View {
    private static final abd0 Companion = new abd0();

    @Deprecated
    public static final double HIDING_START_PERCENT = 0.8d;
    private int[] confettiColors;
    private int confettiGlobalAlpha;
    private final Paint confettiPaint;
    private List<? extends PointF> confettiPoints;
    private int[] confettiRotation;
    private List<? extends Path> confettiShapes;

    /* loaded from: classes2.dex */
    public static final class a {
        public PlusPayConfettiView a;
        public final gih b = new gih();
        public final LinkedHashSet c = new LinkedHashSet();
        public List d = EmptyList.a;
        public ValueAnimator e;

        public final void a() {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.e = null;
        }
    }

    public PlusPayConfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.confettiPaint = paint;
        this.confettiColors = new int[0];
        EmptyList emptyList = EmptyList.a;
        this.confettiPoints = emptyList;
        this.confettiRotation = new int[0];
        this.confettiGlobalAlpha = 255;
        this.confettiShapes = emptyList;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int length = this.confettiColors.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f = this.confettiPoints.get(i2).x;
            float f2 = this.confettiPoints.get(i2).y;
            if (f2 > canvas.getHeight() * 0.8d) {
                i = (int) (((canvas.getHeight() - f2) / (canvas.getHeight() * 0.19999999999999996d)) * 255.0d);
                if (i < 0) {
                    i = 0;
                }
            } else {
                i = 255;
            }
            this.confettiPaint.setColor(lhc.f(this.confettiColors[i2], Math.min(i, this.confettiGlobalAlpha)));
            int save = canvas.save();
            canvas.translate(f, f2);
            try {
                float f3 = this.confettiRotation[i2];
                save = canvas.save();
                canvas.rotate(f3, 0.0f, 0.0f);
                try {
                    canvas.drawPath(this.confettiShapes.get(i2), this.confettiPaint);
                    canvas.restoreToCount(save);
                } finally {
                    canvas.restoreToCount(save);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ PlusPayConfettiView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlusPayConfettiView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
