package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.f;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.a;

/* loaded from: classes10.dex */
public final class ibm extends pa90 implements dui0 {
    public final oz40 A;
    public final i3y B;
    public final Drawable y;
    public final oz40 z = f.j(0);

    public ibm(Drawable drawable) {
        this.y = drawable;
        i3y i3yVar = kbm.a;
        this.A = f.j(new cjs0((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : cma1.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.B = a.a(new bxl(5, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.pa90
    public final boolean a(float f) {
        this.y.setAlpha(y6i0.d(m810.b(f * 255.0f), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dui0
    public final void b() {
        Drawable.Callback callback = (Drawable.Callback) this.B.getValue();
        Drawable drawable = this.y;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.pa90
    public final boolean c(wec wecVar) {
        this.y.setColorFilter(wecVar != null ? wecVar.a : null);
        return true;
    }

    @Override // defpackage.dui0
    public final void d() {
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dui0
    public final void e() {
        Drawable drawable = this.y;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.pa90
    public final void f(LayoutDirection layoutDirection) {
        int i = fbm.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            w511.b();
            return;
        }
        this.y.setLayoutDirection(i2);
    }

    @Override // defpackage.pa90
    public final long i() {
        return ((cjs0) this.A.getValue()).a;
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        i28 q = qamVar.N().q();
        ((Number) this.z.getValue()).intValue();
        try {
            q.save();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.y;
            if (i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, m810.b(cjs0.d(qamVar.c())), m810.b(cjs0.b(qamVar.c())));
            } else {
                q.j(cjs0.d(qamVar.c()) / cjs0.d(i()), cjs0.b(qamVar.c()) / cjs0.b(i()));
            }
            Canvas canvas = t72.a;
            drawable.draw(((s72) q).a);
            q.n();
        } catch (Throwable th) {
            q.n();
            throw th;
        }
    }
}
