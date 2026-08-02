package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LruCache;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TracksDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class gip0 extends yc6 {
    public static final float m = dn70.a() * 8.0f;
    public static final float n = dn70.a() * 8.0f;
    public static final int o = dn70.b(5);
    public final g05 g;
    public final k05 h;
    public final a i;
    public hm0 j;
    public final Paint k;
    public final Paint l;

    /* compiled from: TracksDrawDelegate.kt */
    public static final class a extends LruCache<String, jfp0> {
        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, jfp0 jfp0Var, jfp0 jfp0Var2) {
            jfp0 jfp0Var3 = jfp0Var;
            if (!z || jfp0Var3 == null) {
                return;
            }
            jfp0Var3.g();
        }
    }

    public gip0(mwo0 mwo0Var, g05 g05Var, k05 k05Var) {
        super(mwo0Var);
        this.g = g05Var;
        this.h = k05Var;
        this.i = new a(10);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-16777216);
        this.k = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(-16777216);
        this.l = paint2;
    }

    public final void d(gp6 gp6Var, Canvas canvas) {
        Canvas canvas2;
        jfp0 e = e(gp6Var);
        if (e == null) {
            return;
        }
        float f = jfp0.s;
        RectF rectF = e.d;
        if (rectF.isEmpty() || !e.c()) {
            return;
        }
        Paint paint = e.m;
        RectF rectF2 = e.e;
        if (rectF2.left == rectF2.right) {
            canvas2 = canvas;
        } else if (rectF2.height() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            paint.setStrokeWidth(jfp0.w);
            canvas2 = canvas;
            canvas2.drawLine(rectF2.left, rectF2.centerY(), rectF2.right, rectF2.centerY(), paint);
        } else {
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF2, f, f, e.l);
            paint.setStrokeWidth(jfp0.x);
            canvas2.drawRoundRect(rectF2, f, f, paint);
        }
        canvas2.drawRoundRect(rectF, f, f, e.k);
        int save = canvas2.save();
        canvas2.clipRect(rectF);
        canvas2.translate(e.q ? Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.left) : rectF.left, rectF.top);
        e.h(canvas2);
        canvas2.restoreToCount(save);
    }

    public final jfp0 e(gp6 gp6Var) {
        jfp0 jfp0Var = null;
        if (!RectF.intersects(this.d, gp6Var.u())) {
            return null;
        }
        String m2 = gp6Var.m();
        a aVar = this.i;
        jfp0 jfp0Var2 = aVar.get(m2);
        if (jfp0Var2 == null) {
            boolean z = gp6Var instanceof r7l0;
            mwo0 mwo0Var = this.a;
            if (z) {
                qwo0 qwo0Var = ((r7l0) gp6Var).h;
                jfp0Var = qwo0Var.a != null ? new bno0(mwo0Var, qwo0Var) : new v7l0(mwo0Var, qwo0Var);
            } else if (gp6Var instanceof oy4) {
                oy4 oy4Var = (oy4) gp6Var;
                if (oy4Var.r) {
                    jfp0Var = new xz4(oy4Var, mwo0Var, this.h);
                } else if (oy4Var.o && oy4Var.j == null) {
                    hm0 hm0Var = this.j;
                    jfp0Var = hm0Var;
                    if (hm0Var == null) {
                        hm0 hm0Var2 = new hm0(mwo0Var, oy4Var.k);
                        hm0Var2.q = true;
                        this.j = hm0Var2;
                        jfp0Var = hm0Var2;
                    }
                } else {
                    jfp0Var = new fz4(oy4Var, mwo0Var, this.g);
                }
            }
            if (jfp0Var != null) {
                aVar.put(gp6Var.m(), jfp0Var);
            }
            jfp0Var2 = jfp0Var;
        } else if (gp6Var instanceof r7l0) {
            jfp0Var2.j(((r7l0) gp6Var).h);
        } else if (gp6Var instanceof oy4) {
            fz4 fz4Var = jfp0Var2 instanceof fz4 ? (fz4) jfp0Var2 : null;
            if (fz4Var != null) {
                fz4Var.A = (oy4) gp6Var;
            }
            jfp0Var2.j(((oy4) gp6Var).k);
        }
        if (jfp0Var2 instanceof xoo) {
            gp6Var.u().set(((xoo) jfp0Var2).a(gp6Var.u()));
        }
        if (jfp0Var2 != null) {
            float f = gp6Var.u().left;
            float f2 = gp6Var.u().top;
            float I = gp6Var.u().right - gp6Var.I();
            float f3 = gp6Var.u().bottom;
            RectF rectF = jfp0Var2.d;
            rectF.left = f;
            rectF.top = f2;
            rectF.right = I;
            rectF.bottom = f3;
            jfp0Var2.b();
        }
        if (jfp0Var2 != null) {
            jfp0Var2.e.set(gp6Var.B());
        }
        return jfp0Var2;
    }
}
