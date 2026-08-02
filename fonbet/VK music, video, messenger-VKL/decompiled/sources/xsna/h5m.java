package xsna;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import xsna.qlo;
import xsna.tl6;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes13.dex */
public final class h5m<S extends tl6> extends xko {
    public static final a r = new a();
    public final qlo<S> m;
    public final vmk0 n;
    public final smk0 o;
    public final qlo.a p;
    public boolean q;

    /* compiled from: DeterminateDrawable.java */
    public class a extends be {
        @Override // xsna.be
        public final float R(Object obj) {
            return ((h5m) obj).p.b * 10000.0f;
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            h5m h5mVar = (h5m) obj;
            h5mVar.p.b = f / 10000.0f;
            h5mVar.invalidateSelf();
        }
    }

    public h5m(@NonNull Context context, @NonNull tl6 tl6Var, @NonNull qlo<S> qloVar) {
        super(context, tl6Var);
        this.q = false;
        this.m = qloVar;
        this.p = new qlo.a();
        vmk0 vmk0Var = new vmk0();
        this.n = vmk0Var;
        vmk0Var.a(1.0f);
        vmk0Var.b(50.0f);
        smk0 smk0Var = new smk0(this, r);
        smk0Var.v = Float.MAX_VALUE;
        smk0Var.w = false;
        this.o = smk0Var;
        smk0Var.u = vmk0Var;
        if (this.i != 1.0f) {
            this.i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // xsna.xko
    public final boolean d(boolean z, boolean z2, boolean z3) {
        boolean d = super.d(z, z2, z3);
        br2 br2Var = this.d;
        ContentResolver contentResolver = this.b.getContentResolver();
        br2Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.q = true;
            return d;
        }
        this.q = false;
        this.n.b(50.0f / f);
        return d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float b = b();
            ObjectAnimator objectAnimator = this.e;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            qlo<S> qloVar = this.m;
            qloVar.a.a();
            qloVar.a(canvas, bounds, b, z, z2);
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.j;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            tl6 tl6Var = this.c;
            int i = tl6Var.c[0];
            qlo.a aVar = this.p;
            aVar.c = i;
            int i2 = tl6Var.g;
            if (i2 > 0) {
                if (!(this.m instanceof w7z)) {
                    i2 = (int) ((xwk.a(aVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.01f) * i2) / 0.01f);
                }
                this.m.d(canvas, paint, aVar.b, 1.0f, tl6Var.d, this.k, i2);
            } else {
                this.m.d(canvas, paint, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, tl6Var.d, this.k, 0);
            }
            this.m.c(canvas, paint, aVar, this.k);
            this.m.b(canvas, tl6Var.c[0], this.k, paint);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.m.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.m.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.o.k();
        this.p.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.q;
        qlo.a aVar = this.p;
        smk0 smk0Var = this.o;
        if (z) {
            smk0Var.k();
            aVar.b = i / 10000.0f;
            invalidateSelf();
        } else {
            smk0Var.b = aVar.b * 10000.0f;
            smk0Var.c = true;
            smk0Var.j(i);
        }
        return true;
    }
}
