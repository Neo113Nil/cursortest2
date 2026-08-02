package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.yandex.div.state.db.StateEntry;
import defpackage.ase;
import defpackage.e170;
import defpackage.gjb1;
import defpackage.j4b;
import defpackage.k3i0;
import defpackage.kjs0;
import defpackage.ny61;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001GB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\u001f\u0010#J\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010\rR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u0010\"\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00101R*\u00104\u001a\u0002022\u0006\u00103\u001a\u0002028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010:\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R.\u0010A\u001a\u0004\u0018\u00010@2\b\u00103\u001a\u0004\u0018\u00010@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/yandex/messaging/views/LimitedRoundFrameLayout;", "Landroid/widget/FrameLayout;", "Lj4b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "configurePath", "()V", "onDetachedFromWindow", "onAttachedToWindow", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "leftTop", "rightTop", "leftBottom", "rightBottom", "setCornerRadiiDp", "(FFFF)V", "Lase;", "radii", "(Lase;)V", "cleanup", "Landroid/graphics/RectF;", "destination", "Landroid/graphics/RectF;", "maskRect", "Landroid/graphics/Path;", "maskPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "clearPaint", "Landroid/graphics/Paint;", StateEntry.COLUMN_PATH, "", "[F", "", "value", "clipToPaddingCustom", "Z", "getClipToPaddingCustom", "()Z", "setClipToPaddingCustom", "(Z)V", "maxSize", CA20Status.STATUS_USER_I, "getMaxSize", "()I", "setMaxSize", "(I)V", "Le170;", "onViewLimitedCallback", "Le170;", "getOnViewLimitedCallback", "()Le170;", "setOnViewLimitedCallback", "(Le170;)V", "OutlineProvider", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LimitedRoundFrameLayout extends FrameLayout implements j4b {
    public static final int $stable = 8;
    private final Paint clearPaint;
    private boolean clipToPaddingCustom;
    private final RectF destination;
    private final Path maskPath;
    private final RectF maskRect;
    private int maxSize;
    private e170 onViewLimitedCallback;
    private final Path path;
    private float[] radii;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/views/LimitedRoundFrameLayout$OutlineProvider;", "Landroid/view/ViewOutlineProvider;", "<init>", "(Lcom/yandex/messaging/views/LimitedRoundFrameLayout;)V", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lzy11;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "Landroid/graphics/Rect;", "mRect", "Landroid/graphics/Rect;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class OutlineProvider extends ViewOutlineProvider {
        private final Rect mRect = new Rect();

        public OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            float f = LimitedRoundFrameLayout.this.radii[0];
            int i = 1;
            while (true) {
                LimitedRoundFrameLayout limitedRoundFrameLayout = LimitedRoundFrameLayout.this;
                if (i >= 8) {
                    limitedRoundFrameLayout.destination.round(this.mRect);
                    outline.setRoundRect((int) Math.ceil(this.mRect.left), (int) Math.ceil(this.mRect.top), (int) Math.floor(this.mRect.right), (int) Math.floor(this.mRect.bottom), f);
                    return;
                } else {
                    if (limitedRoundFrameLayout.radii[i] != f) {
                        outline.setConvexPath(LimitedRoundFrameLayout.this.path);
                        return;
                    }
                    i++;
                }
            }
        }
    }

    public LimitedRoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.destination = new RectF();
        this.maskRect = new RectF();
        this.maskPath = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.clearPaint = paint;
        this.path = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.RoundImageView, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(k3i0.RoundImageView_leftTopRadius, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(k3i0.RoundImageView_rightTopRadius, 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(k3i0.RoundImageView_leftBottomRadius, 0);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(k3i0.RoundImageView_rightBottomRadius, 0);
        obtainStyledAttributes.recycle();
        float f = dimensionPixelSize;
        if (f < 0.0f || dimensionPixelSize2 < 0.0f || dimensionPixelSize3 < 0.0f || dimensionPixelSize4 < 0.0f) {
            ny61.g("radius values cannot be negative.");
            throw null;
        }
        float f2 = dimensionPixelSize2;
        float f3 = dimensionPixelSize4;
        float f4 = dimensionPixelSize3;
        this.radii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        setOutlineProvider(new OutlineProvider());
    }

    private final void configurePath() {
        boolean z = this.clipToPaddingCustom;
        RectF rectF = this.destination;
        if (z) {
            rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        } else {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.path.rewind();
        this.path.addRoundRect(this.destination, this.radii, Path.Direction.CW);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, getWidth(), getHeight());
        this.maskPath.addRect(this.maskRect, Path.Direction.CCW);
    }

    public final void cleanup() {
        setOnViewLimitedCallback(null);
        setMaxSize(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.maskPath, this.clearPaint);
    }

    public final boolean getClipToPaddingCustom() {
        return this.clipToPaddingCustom;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public final e170 getOnViewLimitedCallback() {
        return this.onViewLimitedCallback;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        configurePath();
    }

    public final void setClipToPaddingCustom(boolean z) {
        boolean z2 = this.clipToPaddingCustom;
        this.clipToPaddingCustom = z;
        if (z2 != z) {
            configurePath();
            invalidate();
        }
    }

    public final void setCornerRadiiDp(float leftTop, float rightTop, float leftBottom, float rightBottom) {
        float c = kjs0.c(leftTop);
        float c2 = kjs0.c(rightTop);
        float c3 = kjs0.c(leftBottom);
        float c4 = kjs0.c(rightBottom);
        float[] fArr = this.radii;
        if (fArr.length == 8 && gjb1.b(fArr[0], c) && gjb1.b(this.radii[2], c2) && gjb1.b(this.radii[4], c4) && gjb1.b(this.radii[6], c3)) {
            return;
        }
        this.radii = new float[]{c, c, c2, c2, c4, c4, c3, c3};
        configurePath();
        invalidate();
    }

    @Override // defpackage.j4b
    public void setMaxSize(int i) {
        this.maxSize = i;
        e170 e170Var = this.onViewLimitedCallback;
        if (e170Var != null) {
            e170Var.d(i);
        }
    }

    public final void setOnViewLimitedCallback(e170 e170Var) {
        e170 e170Var2;
        this.onViewLimitedCallback = e170Var;
        if (getMaxSize() <= 0 || (e170Var2 = this.onViewLimitedCallback) == null) {
            return;
        }
        e170Var2.d(getMaxSize());
    }

    public final void setCornerRadiiDp(ase radii) {
        setCornerRadiiDp(radii.a, radii.b, radii.d, radii.c);
    }

    public LimitedRoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ LimitedRoundFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public LimitedRoundFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
