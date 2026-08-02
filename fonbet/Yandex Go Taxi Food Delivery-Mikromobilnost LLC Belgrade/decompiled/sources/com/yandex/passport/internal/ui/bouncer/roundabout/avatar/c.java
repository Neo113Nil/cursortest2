package com.yandex.passport.internal.ui.bouncer.roundabout.avatar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import com.yandex.passport.internal.ui.bouncer.roundabout.w;
import defpackage.pw01;
import defpackage.scc;
import defpackage.tcc;
import defpackage.uc20;
import defpackage.wis0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class c implements pw01 {
    public final boolean a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;

    public c(boolean z, int i) {
        this.a = z;
        this.b = i;
        this.c = c.class.getName() + "-hasPlus=" + z;
        float f = uc20.a.density;
        this.d = (int) (2.0f * f);
        this.e = (int) (2.0f * f);
    }

    @Override // defpackage.pw01
    public final String a() {
        return this.c;
    }

    @Override // defpackage.pw01
    public final Bitmap b(Bitmap bitmap, wis0 wis0Var) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = this.b;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = i / 2.0f;
        int i2 = this.d;
        boolean z = this.a;
        canvas.drawCircle(f, f, z ? f - (this.e + i2) : f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, i, i), paint);
        if (z) {
            Canvas canvas2 = new Canvas(createBitmap);
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            float f2 = i2;
            paint2.setStrokeWidth(f2);
            DisplayMetrics displayMetrics = uc20.a;
            float f3 = displayMetrics.density;
            PointF pointF = new PointF((-6.0f) * f3, f3 * 22.0f);
            float f4 = displayMetrics.density;
            PointF pointF2 = new PointF(44.0f * f4, 22.0f * f4);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            List g = scc.g(new Pair(Float.valueOf(0.0f), new com.yandex.passport.common.ui.a(Color.parseColor("#FF5C4D"))), new Pair(Float.valueOf(0.3f), new com.yandex.passport.common.ui.a(Color.parseColor("#EB469F"))), new Pair(Float.valueOf(0.75f), new com.yandex.passport.common.ui.a(Color.parseColor("#8341EF"))), new Pair(Float.valueOf(1.0f), new com.yandex.passport.common.ui.a(Color.parseColor("#3F68F9"))));
            float f5 = pointF.x;
            float f6 = pointF.y;
            float f7 = pointF2.x;
            float f8 = pointF2.y;
            List list = g;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((com.yandex.passport.common.ui.a) ((Pair) it.next()).f()).a));
            }
            int[] I0 = kotlin.collections.a.I0(arrayList);
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(((Number) ((Pair) it2.next()).c()).floatValue()));
            }
            paint2.setShader(new LinearGradient(f5, f6, f7, f8, I0, kotlin.collections.a.G0(arrayList2), tileMode));
            canvas2.drawCircle(f, f, f - (f2 / 2.0f), paint2);
        }
        return createBitmap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.a == ((c) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return c.class.hashCode();
    }

    public c(boolean z) {
        this(z, w.a);
    }
}
