package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: AnimatedDrawable2.kt */
/* loaded from: classes12.dex */
public final class aj2 extends Drawable implements Animatable, yko {
    public static final sv1 q = new sv1(7);
    public final ym2 b;
    public final emo c;
    public volatile boolean d;
    public long e;
    public long f;
    public long g;
    public int h;
    public long i;
    public long j;
    public int k;
    public final long l;
    public int m;
    public volatile sv1 n;
    public bko o;
    public final zi2 p;

    public aj2() {
        this(null);
    }

    @Override // xsna.yko
    public final void a() {
        ym2 ym2Var = this.b;
        if (ym2Var != null) {
            ym2Var.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        long j;
        if (this.b == null || this.c == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long max = this.d ? uptimeMillis - this.e : (long) Math.max(this.f, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        emo emoVar = this.c;
        rp2 rp2Var = emoVar.a;
        long a = emoVar.a();
        long j2 = 0;
        int i = 0;
        if (a == 0) {
            long j3 = 0;
            while (true) {
                j3 += rp2Var.getFrameDurationMs(i);
                int i2 = i + 1;
                if (0 < j3) {
                    break;
                } else {
                    i = i2;
                }
            }
        } else if (rp2Var.getLoopCount() != 0 && max / a >= rp2Var.getLoopCount()) {
            i = -1;
        } else {
            while (true) {
                j2 += rp2Var.getFrameDurationMs(i);
                int i3 = i + 1;
                if (max % a < j2) {
                    break;
                } else {
                    i = i3;
                }
            }
        }
        if (i == -1) {
            i = this.b.getFrameCount() - 1;
            this.n.getClass();
            this.d = false;
        } else if (i == 0 && this.h != -1 && uptimeMillis >= this.g) {
            this.n.getClass();
        }
        boolean drawFrame = this.b.drawFrame(this, canvas, i);
        if (drawFrame) {
            this.n.getClass();
            this.h = i;
        }
        if (!drawFrame) {
            this.m++;
            if (ahq.a.a(2)) {
                ahq.f(aj2.class, Integer.valueOf(this.m), "Dropped a frame. Count: %s");
            }
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (this.d) {
            emo emoVar2 = this.c;
            long j4 = uptimeMillis2 - this.e;
            rp2 rp2Var2 = emoVar2.a;
            long a2 = emoVar2.a();
            long j5 = 0;
            if (a2 != 0 && (rp2Var2.getLoopCount() == 0 || j4 / a2 < rp2Var2.getLoopCount())) {
                long j6 = j4 % a2;
                int frameCount = rp2Var2.getFrameCount();
                for (int i4 = 0; i4 < frameCount && j5 <= j6; i4++) {
                    j5 += rp2Var2.getFrameDurationMs(i4);
                }
                j = j4 + (j5 - j6);
            } else {
                j = -1;
            }
            if (j != -1) {
                long j7 = this.e + j + this.l;
                this.g = j7;
                scheduleSelf(this.p, j7);
            } else {
                this.n.getClass();
                this.d = false;
            }
        }
        this.f = max;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        ym2 ym2Var = this.b;
        return ym2Var != null ? ym2Var.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        ym2 ym2Var = this.b;
        return ym2Var != null ? ym2Var.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ym2 ym2Var = this.b;
        if (ym2Var != null) {
            ym2Var.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.d) {
            return false;
        }
        long j = i;
        if (this.f == j) {
            return false;
        }
        this.f = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.o == null) {
            this.o = new bko();
        }
        this.o.a = i;
        ym2 ym2Var = this.b;
        if (ym2Var != null) {
            ym2Var.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.o == null) {
            this.o = new bko();
        }
        bko bkoVar = this.o;
        bkoVar.c = colorFilter;
        bkoVar.b = colorFilter != null;
        ym2 ym2Var = this.b;
        if (ym2Var != null) {
            ym2Var.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ym2 ym2Var;
        if (this.d || (ym2Var = this.b) == null || ym2Var.getFrameCount() <= 1) {
            return;
        }
        this.d = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.i;
        this.e = j;
        this.g = j;
        this.f = uptimeMillis - this.j;
        this.h = this.k;
        invalidateSelf();
        this.n.getClass();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.d) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.i = uptimeMillis - this.e;
            this.j = uptimeMillis - this.f;
            this.k = this.h;
            this.d = false;
            this.e = 0L;
            this.g = 0L;
            this.f = -1L;
            this.h = -1;
            unscheduleSelf(this.p);
            this.n.getClass();
        }
    }

    public aj2(an2 an2Var) {
        this.b = an2Var;
        this.l = 8L;
        this.n = q;
        yi2 yi2Var = new yi2(this, 0);
        this.p = new zi2(this, 0);
        this.c = an2Var == null ? null : new emo(an2Var);
        if (an2Var != null) {
            an2Var.setAnimationListener(yi2Var);
        }
    }
}
