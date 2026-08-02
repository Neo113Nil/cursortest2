package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.ddp0;
import xsna.mlo;
import xsna.qu90;

/* compiled from: ExternalElementModifierView.kt */
/* loaded from: classes4.dex */
public final class heq extends FrameLayout implements geq, ddp0.a {
    public final a b;
    public final a c;
    public Matrix d;
    public mv10 e;
    public nv10 f;
    public boolean g;

    /* compiled from: ExternalElementModifierView.kt */
    public static final class a extends View {
        public qkp0 b;
        public boolean c;
        public final feq d;
        public final b e;
        public veq f;

        public a(Context context) {
            super(context);
            this.d = new feq(context);
            this.e = new b();
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            veq veqVar = this.f;
            if (veqVar != null) {
                veqVar.a(canvas);
            }
        }

        @Override // android.view.View
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.e.init(i, i2);
            invalidate();
        }

        @Override // android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (!this.c) {
                return false;
            }
            veq veqVar = this.f;
            if (veqVar == null) {
                return super.onTouchEvent(motionEvent);
            }
            boolean d = veqVar.d(motionEvent);
            if (!d) {
                this.f = null;
                feq feqVar = this.d;
                feqVar.b.reset();
                feqVar.a.reset();
                feqVar.e = 1.0f;
            }
            invalidate();
            return d;
        }
    }

    public heq(Context context) {
        super(context, null, 0);
        a aVar = new a(context);
        this.b = aVar;
        this.c = aVar;
        this.d = new Matrix();
        setClipChildren(false);
        setClipToPadding(false);
        addView(aVar);
        fyt0.k(17, aVar);
    }

    @Override // xsna.geq
    public final boolean a(uap uapVar, u66 u66Var, qr0 qr0Var) {
        Matrix matrix;
        nv10 nv10Var = this.f;
        mv10 provide = nv10Var != null ? nv10Var.provide() : null;
        this.e = provide;
        if (provide == null || (matrix = provide.b) == null) {
            matrix = this.d;
        }
        this.d = matrix;
        a aVar = this.b;
        feq feqVar = aVar.d;
        feq feqVar2 = aVar.d;
        feqVar.c.set(matrix);
        Matrix matrix2 = feqVar2.b;
        this.d.invert(matrix2);
        feqVar2.e = Math.min(Math.abs(nn10.d(matrix2)), Math.abs(nn10.e(matrix2)));
        boolean z = true;
        float f = 1;
        matrix2.postScale(f / nn10.d(matrix2), f / nn10.e(matrix2), getWidth() / 2.0f, getHeight() / 2.0f);
        mv10 mv10Var = this.e;
        if (mv10Var != null && mv10Var.g) {
            feqVar2.a.postScale(-1.0f, 1.0f, getWidth() / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (Math.abs(nn10.c(this.d)) >= 90.0f) {
            feqVar2.a.postScale(-1.0f, -1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        if (uapVar instanceof skp0) {
            veq veqVar = aVar.f;
            if (veqVar != null) {
                veqVar.finish();
            }
            aVar.f = new veq((skp0) uapVar, aVar.e, aVar.d, aVar.b, qr0Var, new com.vk.movika.sdk.base.logic.processor.actions.e(8, aVar, u66Var));
            aVar.invalidate();
        } else {
            z = false;
        }
        invalidate();
        return z;
    }

    @Override // xsna.ddp0.a
    public final boolean b(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.b.f != null) {
            canvas.concat(this.d);
            mv10 mv10Var = this.e;
            if (mv10Var != null && mv10Var.g) {
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.g) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final View getDrawView() {
        return this.c;
    }

    public final boolean getHandleTouchesFromDelegate() {
        return this.g;
    }

    public final qkp0 getListener() {
        return this.b.b;
    }

    public final nv10 getMediaPropertiesProvider() {
        return this.f;
    }

    public final void setHandleTouchesFromDelegate(boolean z) {
        this.g = z;
    }

    public final void setListener(qkp0 qkp0Var) {
        this.b.b = qkp0Var;
    }

    public final void setMediaPropertiesProvider(nv10 nv10Var) {
        this.f = nv10Var;
    }

    public final void setTouchesEnabled(boolean z) {
        this.b.c = z;
    }

    /* compiled from: ExternalElementModifierView.kt */
    public static final class b implements hr9 {
        public final pb7 a = new pb7();
        public final jzm b = new jzm();

        @Override // xsna.jti0
        public final qu90 c() {
            return qu90.a.b;
        }

        @Override // xsna.jti0
        public final mlo d() {
            return mlo.a.b;
        }

        @Override // xsna.jti0
        public final void g(Canvas canvas, uap uapVar) {
            jzm jzmVar = this.b;
            jzmVar.b = canvas;
            if (uapVar instanceof jio) {
                ((jio) uapVar).a(jzmVar);
            }
            jzmVar.b = null;
        }

        @Override // xsna.hr9
        public final void init(int i, int i2) {
            this.a.a(i, i2);
        }

        @Override // xsna.hr9
        public final void a(Canvas canvas) {
        }

        @Override // xsna.hr9
        public final void b(vlo vloVar) {
        }

        @Override // xsna.hr9
        public final void e(jio jioVar) {
        }
    }
}
