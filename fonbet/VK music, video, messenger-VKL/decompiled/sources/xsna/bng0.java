package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: RotationGuidesDrawer.kt */
/* loaded from: classes16.dex */
public final class bng0 implements cov {
    public final yh a;
    public final ic b;
    public final hl2 c;

    public bng0(Context context, defpackage.r rVar, yh yhVar, ic icVar) {
        this.a = yhVar;
        this.b = icVar;
        Paint paint = new Paint();
        float[] fArr = {cn70.a() * 12.0f, cn70.a() * 8.0f};
        paint.setStrokeWidth(cn70.a() * 1.0f);
        paint.setPathEffect(new DashPathEffect(fArr, fArr[0] * 0.5f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(e3m.f(R.attr.vk_ui_accent_orange, context));
        this.c = new hl2(paint, rVar);
    }

    @Override // xsna.cov
    public final void a(nov novVar) {
        float f;
        float f2;
        zh zhVar = (zh) this.b.c;
        zh zhVar2 = (zh) this.a.c;
        float stickerRotation = novVar.getStickerRotation();
        float f3 = stickerRotation % 45.0f;
        hl2 hl2Var = this.c;
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            hl2Var.a(false);
            return;
        }
        float f4 = stickerRotation % 180;
        boolean z = Math.abs(f4) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z2 = Math.abs(f4) == 90.0f;
        if (z) {
            wah0 wah0Var = zhVar2.i;
            x5l0 x5l0Var = zhVar.j;
            float f5 = x5l0.a(x5l0Var.b).y;
            float f6 = wah0Var.a;
            float f7 = x5l0.a(x5l0Var.b).y;
            Path path = hl2Var.c;
            path.reset();
            path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
            path.lineTo(f6, f7);
            hl2Var.a(true);
            return;
        }
        if (z2) {
            wah0 wah0Var2 = zhVar2.i;
            x5l0 x5l0Var2 = zhVar.j;
            float f8 = x5l0.a(x5l0Var2.b).x;
            float f9 = x5l0.a(x5l0Var2.b).x;
            float f10 = wah0Var2.b;
            Path path2 = hl2Var.c;
            path2.reset();
            path2.moveTo(f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path2.lineTo(f9, f10);
            hl2Var.a(true);
            return;
        }
        wah0 wah0Var3 = zhVar2.i;
        x5l0 x5l0Var3 = zhVar.j;
        float f11 = wah0Var3.a;
        if (f4 == 135.0f || f4 == -45.0f) {
            PointF a = x5l0.a(x5l0Var3.b);
            float f12 = a.y - a.x;
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + f12;
            f2 = f12 + f11;
        } else {
            PointF a2 = x5l0.a(x5l0Var3.b);
            float f13 = a2.y + a2.x;
            f = (-0.0f) + f13;
            f2 = f13 + (-f11);
        }
        Path path3 = hl2Var.c;
        path3.reset();
        path3.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        path3.lineTo(f11, f2);
        hl2Var.a(true);
    }

    @Override // xsna.cov
    public final boolean b() {
        hl2 hl2Var = this.c;
        return hl2Var.b.getValue(hl2Var, hl2.d[0]).booleanValue();
    }

    @Override // xsna.cov
    public final void draw(Canvas canvas) {
        hl2 hl2Var = this.c;
        if (hl2Var.a.a.getAlpha() != 0) {
            canvas.drawPath(hl2Var.c, hl2Var.a.a);
        }
    }

    @Override // xsna.cov
    public final void reset() {
        this.c.a(false);
    }
}
