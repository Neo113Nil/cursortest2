package xsna;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DrawablePainter.kt */
/* loaded from: classes17.dex */
public final class yjo extends lg90 implements huf0 {
    public final Drawable g;
    public final wh50 i;
    public final wh50 h = androidx.compose.runtime.k.b(0);
    public final bpn0 j = new bpn0(new jpf(this, 14));

    /* compiled from: DrawablePainter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DrawablePainter.kt */
    public static final class b implements Drawable.Callback {
        public final bpn0 b = new bpn0(new n1(16));

        public b() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            yjo yjoVar = yjo.this;
            wh50 wh50Var = yjoVar.h;
            ((zak0) wh50Var).setValue(Integer.valueOf(((Number) ((zak0) wh50Var).getValue()).intValue() + 1));
            long j = emi.j(yjoVar.g);
            ((zak0) yjoVar.i).setValue(new mxj0(j));
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            ((Handler) this.b.getValue()).postAtTime(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            ((Handler) this.b.getValue()).removeCallbacks(runnable);
        }
    }

    public yjo(Drawable drawable) {
        this.g = drawable;
        this.i = androidx.compose.runtime.k.b(new mxj0(emi.j(drawable)));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // xsna.lg90
    public final boolean a(float f) {
        this.g.setAlpha(swe0.g(an10.b(f * 255), 0, 255));
        return true;
    }

    @Override // xsna.lg90
    public final boolean b(d6g d6gVar) {
        this.g.setColorFilter(d6gVar != null ? d6gVar.a : null);
        return true;
    }

    @Override // xsna.lg90
    public final void c(LayoutDirection layoutDirection) {
        int i = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.g.setLayoutDirection(i2);
    }

    @Override // xsna.huf0
    public final void d() {
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.huf0
    public final void e() {
        Drawable.Callback callback = (Drawable.Callback) this.j.getValue();
        Drawable drawable = this.g;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.huf0
    public final void f() {
        Drawable drawable = this.g;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // xsna.lg90
    public final long i() {
        return ((mxj0) ((zak0) this.i).getValue()).a;
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        yq9 a2 = oioVar.a0().a();
        ((Number) ((zak0) this.h).getValue()).intValue();
        int b2 = an10.b(Float.intBitsToFloat((int) (oioVar.d() >> 32)));
        int b3 = an10.b(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)));
        Drawable drawable = this.g;
        drawable.setBounds(0, 0, b2, b3);
        try {
            a2.e();
            Canvas canvas = e52.a;
            drawable.draw(((d52) a2).a);
        } finally {
            a2.a();
        }
    }
}
