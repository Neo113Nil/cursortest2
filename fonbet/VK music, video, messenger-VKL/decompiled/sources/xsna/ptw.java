package xsna;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import xsna.qlo;
import xsna.tl6;

/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes13.dex */
public final class ptw<S extends tl6> extends xko {
    public final qlo<S> m;
    public otw<ObjectAnimator> n;
    public elr0 o;

    public ptw(@NonNull Context context, @NonNull tl6 tl6Var, @NonNull qlo<S> qloVar, @NonNull otw<ObjectAnimator> otwVar) {
        super(context, tl6Var);
        this.m = qloVar;
        this.n = otwVar;
        otwVar.a = this;
    }

    @Override // xsna.xko
    public final boolean d(boolean z, boolean z2, boolean z3) {
        elr0 elr0Var;
        boolean d = super.d(z, z2, z3);
        if (this.d != null && Settings.Global.getFloat(this.b.getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (elr0Var = this.o) != null) {
            return elr0Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.n.a();
        }
        if (z && z3) {
            this.n.f();
        }
        return d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i;
        elr0 elr0Var;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            br2 br2Var = this.d;
            tl6 tl6Var = this.c;
            if (br2Var != null && Settings.Global.getFloat(this.b.getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (elr0Var = this.o) != null) {
                elr0Var.setBounds(getBounds());
                this.o.setTint(tl6Var.c[0]);
                this.o.draw(canvas);
                return;
            }
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
            int i2 = tl6Var.g;
            int i3 = this.k;
            Paint paint = this.j;
            if (i2 == 0) {
                this.m.d(canvas, paint, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, tl6Var.d, i3, 0);
                i = i2;
            } else {
                qlo.a aVar = (qlo.a) this.n.b.get(0);
                qlo.a aVar2 = (qlo.a) xy9.b(1, this.n.b);
                qlo<S> qloVar2 = this.m;
                if (qloVar2 instanceof w7z) {
                    i = i2;
                    qloVar2.d(canvas, paint, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar.a, tl6Var.d, i3, i);
                    this.m.d(canvas, paint, aVar2.b, 1.0f, tl6Var.d, i3, i);
                } else {
                    i = i2;
                    i3 = 0;
                    qloVar2.d(canvas, paint, aVar2.b, aVar.a + 1.0f, tl6Var.d, 0, i);
                }
            }
            for (int i4 = 0; i4 < this.n.b.size(); i4++) {
                qlo.a aVar3 = (qlo.a) this.n.b.get(i4);
                this.m.c(canvas, paint, aVar3, this.k);
                if (i4 > 0 && i > 0) {
                    this.m.d(canvas, paint, ((qlo.a) this.n.b.get(i4 - 1)).b, aVar3.a, tl6Var.d, i3, i);
                }
            }
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
}
