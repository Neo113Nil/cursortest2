package com.yandex.messaging.internal.view.timeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.util.Size;
import android.view.Choreographer;
import android.view.WindowManager;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.aaz0;
import defpackage.drb1;
import defpackage.esb;
import defpackage.jng0;
import defpackage.kjs0;
import defpackage.lhc;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001dR\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/yandex/messaging/internal/view/timeline/DialogItemProgressDrawable;", "Lcom/yandex/messaging/internal/view/timeline/DialogItemDrawable;", "Laaz0;", "animator", "Landroid/content/Context;", "context", "", "itemType", "color", "strokeColor", "<init>", "(Laaz0;Landroid/content/Context;III)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "", "corners", "updateCornerRadii", "([F)V", "Laaz0;", CA20Status.STATUS_USER_I, "cornersRadii", "[F", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "strokePaint", "Landroid/graphics/Paint;", "", "shouldDrawStroke", "Z", "bgPaint", "Landroid/graphics/Shader;", "bgShader", "Landroid/graphics/Shader;", "Landroid/graphics/Matrix;", "bgShaderMatrix", "Landroid/graphics/Matrix;", "shiningColor", "", "gradientWith", "F", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DialogItemProgressDrawable extends DialogItemDrawable {
    public static final int $stable = 8;
    private final aaz0 animator;
    private final Paint bgPaint;
    private final Shader bgShader;
    private final Matrix bgShaderMatrix;
    private float[] cornersRadii;
    private final float gradientWith;
    private final int itemType;
    private final Path path;
    private final RectF rect;
    private final int shiningColor;
    private final boolean shouldDrawStroke;
    private final Paint strokePaint;

    public DialogItemProgressDrawable(aaz0 aaz0Var, Context context, int i, int i2, int i3) {
        super(context.getResources(), i);
        this.animator = aaz0Var;
        this.itemType = i;
        float[] fArr = new float[8];
        for (int i4 = 0; i4 < 8; i4++) {
            fArr[i4] = 0.0f;
        }
        this.cornersRadii = fArr;
        this.path = new Path();
        this.rect = new RectF();
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        this.shouldDrawStroke = i3 != 0;
        Paint paint2 = new Paint(1);
        this.bgPaint = paint2;
        this.bgShaderMatrix = new Matrix();
        int d = lhc.d(drb1.d(context, jng0.messagingDiscoveryPlaceholderAnimationColor, jng0.messagingDiscoveryPlaceholderAnimationColorAlpha), i2);
        this.shiningColor = d;
        float d2 = kjs0.d(260);
        this.gradientWith = d2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getOutlineWidth());
        paint.setColor(i3);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, d2, 0.0f, new int[]{i2, d, i2}, (float[]) null, Shader.TileMode.CLAMP);
        this.bgShader = linearGradient;
        paint2.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.bgShaderMatrix.reset();
        Matrix matrix = this.bgShaderMatrix;
        aaz0 aaz0Var = this.animator;
        float f = this.gradientWith;
        Context context = aaz0Var.a;
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(new Point());
        float width = new Size(r4.x, r4.y).getWidth() + f;
        float f2 = -f;
        if (aaz0Var.e == 0) {
            aaz0Var.e = SystemClock.elapsedRealtime();
            Choreographer choreographer = aaz0Var.c;
            esb esbVar = aaz0Var.d;
            choreographer.removeFrameCallback(esbVar);
            choreographer.postFrameCallback(esbVar);
        }
        aaz0Var.h = true;
        matrix.preTranslate((aaz0Var.g.getInterpolation((aaz0Var.f % 1000.0f) / 1000.0f) * width) + f2, 0.0f);
        this.bgShader.setLocalMatrix(this.bgShaderMatrix);
        this.rect.set(getBounds());
        if (this.shouldDrawStroke) {
            float outlineWidth = getOutlineWidth() * 0.5f;
            RectF rectF = this.rect;
            rectF.left += outlineWidth;
            rectF.top += outlineWidth;
            rectF.right -= outlineWidth;
            rectF.bottom -= outlineWidth;
        }
        this.path.reset();
        this.path.addRoundRect(this.rect, this.cornersRadii, Path.Direction.CW);
        canvas.drawPath(this.path, this.bgPaint);
        if (this.shouldDrawStroke) {
            canvas.drawPath(this.path, this.strokePaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        invalidateSelf();
    }

    @Override // com.yandex.messaging.internal.view.timeline.DialogItemDrawable
    public void updateCornerRadii(float[] corners) {
        this.cornersRadii = corners;
    }
}
