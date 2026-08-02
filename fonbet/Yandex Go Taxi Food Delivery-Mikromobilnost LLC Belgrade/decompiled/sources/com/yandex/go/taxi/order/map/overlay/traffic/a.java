package com.yandex.go.taxi.order.map.overlay.traffic;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import defpackage.avj0;
import defpackage.f901;
import defpackage.ffx;
import defpackage.mzz;
import defpackage.n4h0;
import defpackage.ob7;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vng;
import defpackage.w511;
import defpackage.zuj0;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a {
    public final zuj0 a;
    public final tt2 b;
    public final mzz c = new mzz(32);
    public final RectF d = new RectF();
    public final Rect e = new Rect();
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final Paint p;

    public a(zuj0 zuj0Var, tt2 tt2Var) {
        this.a = zuj0Var;
        this.b = tt2Var;
        avj0 avj0Var = (avj0) zuj0Var;
        float w = tje.w(14, avj0Var.a);
        this.f = w;
        this.g = (int) tje.w(20, avj0Var.a);
        int w2 = (int) tje.w(32, avj0Var.a);
        this.h = w2;
        this.i = tje.x(avj0Var.a, 15.0f);
        this.j = tje.x(avj0Var.a, 7.0f);
        this.k = tje.x(avj0Var.a, 2.0f);
        float x = tje.x(avj0Var.a, 18.0f);
        this.l = x;
        DisplayMetrics d = avj0Var.d();
        float x2 = tje.x(avj0Var.a, 1.0f);
        float applyDimension = TypedValue.applyDimension(2, 10.0f, d);
        this.m = (x - w) / 2.0f;
        float f = (w2 - ((w * 2.0f) + x2)) / 2.0f;
        this.n = f;
        this.o = f + w + x2;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setTextSize(applyDimension);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        this.p = paint;
    }

    public static final ob7 a(a aVar, TrafficLightWithSignal$Signal trafficLightWithSignal$Signal, Integer num) {
        aVar.getClass();
        return (num == null || trafficLightWithSignal$Signal != TrafficLightWithSignal$Signal.RED) ? new ob7(trafficLightWithSignal$Signal, null, null, 4) : new ob7(trafficLightWithSignal$Signal, Integer.valueOf(Math.min(num.intValue(), 99)), null, 4);
    }

    public final Object b(TrafficLightWithSignal$Signal trafficLightWithSignal$Signal, Integer num, Continuation continuation) {
        this.b.getClass();
        return tje.k0(uyj.a, new TrafficLightsWithSignalImagesGenerator$createTrafficLightBitmap$2(this, trafficLightWithSignal$Signal, num, null), continuation);
    }

    public final Bitmap c(TrafficLightWithSignal$Signal trafficLightWithSignal$Signal, Integer num) {
        Bitmap d;
        Bitmap d2;
        Bitmap d3 = d(n4h0.traffic_light_base);
        if (d3 == null || (d = d(n4h0.traffic_light_signal_visor)) == null) {
            return null;
        }
        int i = f901.a[trafficLightWithSignal$Signal.ordinal()];
        if (i == 1 || i == 2) {
            d2 = d(n4h0.traffic_light_red_light_on);
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            d2 = d(n4h0.traffic_light_red_light_off);
        }
        if (d2 == null) {
            return null;
        }
        TrafficLightWithSignal$Signal trafficLightWithSignal$Signal2 = TrafficLightWithSignal$Signal.RED;
        Bitmap d4 = (trafficLightWithSignal$Signal == trafficLightWithSignal$Signal2 && num == null) ? d(n4h0.traffic_light_green_light_off) : (trafficLightWithSignal$Signal != trafficLightWithSignal$Signal2 || num == null) ? (trafficLightWithSignal$Signal == TrafficLightWithSignal$Signal.GREEN || trafficLightWithSignal$Signal == TrafficLightWithSignal$Signal.UNKNOWN) ? d(n4h0.traffic_light_green_light_on) : d(n4h0.traffic_light_signal_base) : d(n4h0.traffic_light_signal_base);
        if (d4 == null) {
            return null;
        }
        int i2 = this.h;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i3 = this.g;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        float f = (i3 - this.l) / 2.0f;
        canvas.drawBitmap(d3, f, 0.0f, (Paint) null);
        float f2 = this.m;
        float f3 = this.f;
        float f4 = this.n;
        RectF rectF = this.d;
        rectF.set(f + f2, f4, f + f2 + f3, f4 + f3);
        canvas.drawBitmap(d2, (Rect) null, rectF, (Paint) null);
        float f5 = this.o;
        rectF.set(f + f2, f5, f + f2 + f3, f5 + f3);
        canvas.drawBitmap(d4, (Rect) null, rectF, (Paint) null);
        if (num != null && trafficLightWithSignal$Signal == trafficLightWithSignal$Signal2) {
            String valueOf = String.valueOf(Math.min(num.intValue(), 99));
            int length = valueOf.length();
            Paint paint = this.p;
            paint.getTextBounds(valueOf, 0, length, this.e);
            canvas.drawText(valueOf, (f3 / 2.0f) + f + f2, (r11.height() / 2.0f) + (f3 / 2.0f) + f5, paint);
        }
        float f6 = this.k;
        float f7 = 1.0f + f6;
        float f8 = (-2.0f) + f6;
        rectF.set(f7, f8 < 0.0f ? 0.0f : f8, this.i + f7, f6 + this.j);
        canvas.drawBitmap(d, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    public final Bitmap d(int i) {
        Bitmap d0;
        ob7 ob7Var = new ob7(null, null, Integer.valueOf(i), 3);
        mzz mzzVar = this.c;
        Bitmap bitmap = (Bitmap) mzzVar.c(ob7Var);
        if (bitmap != null) {
            return bitmap;
        }
        Drawable t = vng.t(i, ((avj0) this.a).a);
        if (t == null || (d0 = ffx.d0(t, 0, 0, 7)) == null) {
            return null;
        }
        mzzVar.d(ob7Var, d0);
        return d0;
    }
}
