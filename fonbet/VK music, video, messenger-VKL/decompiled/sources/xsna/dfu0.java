package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurContentView;

/* compiled from: VkBlurDrawable.kt */
/* loaded from: classes17.dex */
public final class dfu0 extends Drawable {
    public final View a;
    public final RenderNode b;
    public final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public VkBlurContentView g;
    public final m0t0 h;
    public final int[] i;
    public final int[] j;
    public int k;
    public int l;
    public final cfu0 m;

    /* JADX WARN: Type inference failed for: r2v10, types: [xsna.cfu0] */
    public dfu0(View view) {
        this.a = view;
        this.b = Build.VERSION.SDK_INT >= 31 ? nr9.a() : null;
        this.c = new Paint();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.d = paint;
        this.h = new m0t0(this, 2);
        this.i = new int[2];
        this.j = new int[2];
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.m = new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.cfu0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                dfu0 dfu0Var = dfu0.this;
                int[] iArr = dfu0Var.j;
                int[] iArr2 = dfu0Var.i;
                VkBlurContentView vkBlurContentView = dfu0Var.g;
                if (vkBlurContentView != null) {
                    vkBlurContentView.getLocationOnScreen(iArr2);
                }
                dfu0Var.a.getLocationOnScreen(iArr);
                if (iArr2[0] - iArr[0] != dfu0Var.k || iArr2[1] - iArr[1] != dfu0Var.l) {
                    dfu0Var.invalidateSelf();
                }
                return true;
            }
        };
    }

    public final void a(float f) {
        this.e = f;
        invalidateSelf();
    }

    public final void b(VkBlurContentView vkBlurContentView) {
        if (epx.f(this.g, vkBlurContentView) || Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (vkBlurContentView == null) {
            e();
            this.g = null;
            return;
        }
        VkBlurContentView vkBlurContentView2 = this.g;
        m0t0 m0t0Var = this.h;
        if (vkBlurContentView2 != null) {
            vkBlurContentView2.b(m0t0Var);
        }
        vkBlurContentView.a(m0t0Var);
        this.g = vkBlurContentView;
        View view = this.a;
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new a(view, this));
        } else if (this.g != null) {
            view.getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new b(view, this));
        } else {
            e();
        }
    }

    public final void c(float f) {
        this.f = f;
        invalidateSelf();
    }

    public final void d(Integer num) {
        this.c.setColor(num != null ? num.intValue() : 0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        int width = getBounds().width();
        int height = getBounds().height();
        if (width == 0 || height == 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
            RenderNode renderNode = this.b;
            VkBlurContentView vkBlurContentView = this.g;
            RenderNode renderNode$foundation_release = vkBlurContentView != null ? vkBlurContentView.getRenderNode$foundation_release() : null;
            if (renderNode != null && renderNode$foundation_release != null) {
                VkBlurContentView vkBlurContentView2 = this.g;
                int[] iArr = this.i;
                if (vkBlurContentView2 != null) {
                    vkBlurContentView2.getLocationOnScreen(iArr);
                }
                View view = this.a;
                int[] iArr2 = this.j;
                view.getLocationOnScreen(iArr2);
                this.k = iArr[0] - iArr2[0];
                this.l = iArr[1] - iArr2[1];
                renderNode.setPosition(0, 0, getBounds().width(), getBounds().height());
                beginRecording = renderNode.beginRecording();
                try {
                    VkBlurContentView vkBlurContentView3 = this.g;
                    beginRecording.drawColor(vkBlurContentView3 != null ? vkBlurContentView3.c() : 0);
                    float f = 1 / 2.0f;
                    beginRecording.scale(f, f);
                    float f2 = iArr[0] - iArr2[0];
                    float f3 = iArr[1] - iArr2[1];
                    int save = beginRecording.save();
                    beginRecording.translate(f2, f3);
                    try {
                        beginRecording.drawRenderNode(renderNode$foundation_release);
                        beginRecording.restoreToCount(save);
                        renderNode.endRecording();
                        float f4 = this.e / 2.0f;
                        if (f4 < 1.0f) {
                            f4 = 1.0f;
                        }
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        createBlurEffect = RenderEffect.createBlurEffect(f4, f4, Shader.TileMode.CLAMP);
                        renderNode.setRenderEffect(createBlurEffect);
                        int save2 = canvas.save();
                        canvas.scale(2.0f, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        try {
                            canvas.drawRenderNode(renderNode);
                        } finally {
                            canvas.restoreToCount(save2);
                        }
                    } catch (Throwable th) {
                        beginRecording.restoreToCount(save);
                        throw th;
                    }
                } catch (Throwable th2) {
                    renderNode.endRecording();
                    throw th2;
                }
            }
        }
        float f5 = width;
        float f6 = height;
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, f6, this.c);
        float f7 = this.f;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, f6, f7, f7, this.d);
    }

    public final void e() {
        VkBlurContentView vkBlurContentView = this.g;
        if (vkBlurContentView != null) {
            vkBlurContentView.b(this.h);
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this.m);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        RenderNode renderNode;
        if (Build.VERSION.SDK_INT < 31 || (renderNode = this.b) == null) {
            return;
        }
        renderNode.setAlpha(i / 255.0f);
    }

    /* compiled from: View.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ dfu0 c;

        public a(View view, dfu0 dfu0Var) {
            this.b = view;
            this.c = dfu0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            dfu0 dfu0Var = this.c;
            if (dfu0Var.g != null) {
                view.getViewTreeObserver().addOnPreDrawListener(dfu0Var.m);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ dfu0 c;

        public b(View view, dfu0 dfu0Var) {
            this.b = view;
            this.c = dfu0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
