package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import java.util.ArrayList;

/* compiled from: DrawingCanvas.java */
/* loaded from: classes17.dex */
public final class llo {
    public static final Paint e = new Paint();
    public final b a;
    public Bitmap b;
    public Canvas c;
    public a d;

    /* compiled from: DrawingCanvas.java */
    public static class a {
        public final zk8 a;
        public final slo b;
        public int c;
        public float d;
        public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        public a(zk8 zk8Var, slo sloVar) {
            this.a = zk8Var;
            this.b = sloVar;
        }

        public final void a(Canvas canvas, boolean z) {
            zk8 zk8Var = this.a;
            int i = 0;
            slo sloVar = this.b;
            if (z) {
                ppo ppoVar = sloVar.a;
                ppo ppoVar2 = sloVar.a;
                int i2 = ppoVar.b;
                if (i2 > 0 && i2 < 5) {
                    L.e("tmp", "drawingPath.size(): " + ppoVar2.b + ", finish: " + z);
                    ppoVar2.a(0);
                    sloVar.b.a(0);
                    zk8Var.c();
                    return;
                }
            }
            int max = Math.max(0, this.c - 2);
            ppo ppoVar3 = sloVar.a;
            ppo ppoVar4 = sloVar.b;
            ppo ppoVar5 = sloVar.a;
            int i3 = ppoVar3.b - 2;
            while (max < i3) {
                float a = ppoVar5.a(max);
                float a2 = ppoVar4.a(max);
                int i4 = max + 1;
                float a3 = ppoVar5.a(i4);
                float a4 = ppoVar4.a(i4);
                int i5 = max + 2;
                float f = (a + a3) / 2.0f;
                float f2 = (a2 + a4) / 2.0f;
                float a5 = (ppoVar5.a(i5) + a3) / 2.0f;
                float a6 = (ppoVar4.a(i5) + a4) / 2.0f;
                float f3 = f - a3;
                float f4 = f2 - a4;
                float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                float f5 = a3 - a5;
                float f6 = a4 - a6;
                int round = Math.round((((float) Math.sqrt((f6 * f6) + (f5 * f5))) + sqrt) * 0.3f);
                int i6 = i;
                while (i6 < round) {
                    float f7 = i6 / round;
                    float f8 = f7 * f7;
                    float f9 = a3 * 2.0f;
                    float f10 = a6;
                    float f11 = ((f9 - (f * 2.0f)) * f7) + (((f - f9) + a5) * f8) + f;
                    float f12 = a4 * 2.0f;
                    float f13 = ((f12 - (f2 * 2.0f)) * f7) + (((f2 - f12) + f10) * f8) + f2;
                    float f14 = this.e - f11;
                    float f15 = this.f - f13;
                    zk8 zk8Var2 = zk8Var;
                    float sqrt2 = this.d + ((float) Math.sqrt((f15 * f15) + (f14 * f14)));
                    this.d = sqrt2;
                    if (sqrt2 > zk8Var2.d()) {
                        zk8Var2.c();
                        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    this.e = f11;
                    this.f = f11;
                    i6++;
                    a6 = f10;
                    zk8Var = zk8Var2;
                    i = 0;
                }
                max = i4;
            }
            this.c = ppoVar5.b;
        }
    }

    /* compiled from: DrawingCanvas.java */
    public static class b {
        public final int a;
        public final int b;
        public volatile Bitmap c;
        public Canvas d;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static boolean a(@Nullable Bitmap bitmap, Canvas canvas, int i, int i2) {
            return bitmap != null && !bitmap.isRecycled() && canvas != null && bitmap.getWidth() == i && bitmap.getHeight() == i2 && canvas.getWidth() == i && canvas.getHeight() == i2;
        }

        public final void b() {
            if (a(this.c, this.d, this.a, this.b)) {
                return;
            }
            Bitmap d = kd7.d(this.a, this.b);
            this.c = d;
            if (this.c != null) {
                this.d = new Canvas(d);
            }
        }
    }

    public llo(@NonNull Bitmap bitmap) {
        b bVar = new b(bitmap.getWidth(), bitmap.getHeight());
        bVar.c = bitmap;
        bVar.d = new Canvas(bitmap);
        this.a = bVar;
    }

    public final void a(wlo wloVar) {
        this.d = null;
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        Bitmap bitmap2 = wloVar.f;
        ArrayList<slo> arrayList = wloVar.d;
        Paint paint = e;
        b bVar = this.a;
        if (bitmap2 != null) {
            bVar.b();
            bVar.d.drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        }
        int i = 0;
        while (i < arrayList.size()) {
            ArrayList<zk8> arrayList2 = wloVar.e;
            zk8 zk8Var = arrayList2.size() > i ? arrayList2.get(i) : null;
            slo sloVar = arrayList.size() > i ? arrayList.get(i) : null;
            if (zk8Var.h()) {
                this.d = null;
                Bitmap bitmap3 = this.b;
                if (bitmap3 != null) {
                    bitmap3.eraseColor(0);
                }
                this.d = new a(zk8Var, sloVar);
                if (zk8Var.h()) {
                    int i2 = bVar.a;
                    int i3 = bVar.b;
                    if (!b.a(this.b, this.c, i2, i3)) {
                        this.b = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                        this.c = new Canvas(this.b);
                    }
                    this.d.a(this.c, false);
                }
                int i4 = bVar.a;
                int i5 = bVar.b;
                if (!b.a(this.b, this.c, i4, i5)) {
                    this.b = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                    this.c = new Canvas(this.b);
                }
                this.d.a(this.c, false);
                a aVar = this.d;
                if (aVar != null) {
                    if (this.b == null || !aVar.a.h()) {
                        a aVar2 = this.d;
                        bVar.b();
                        zk8 zk8Var2 = aVar2.a;
                        aVar2.b.a();
                        zk8Var2.b();
                    } else {
                        this.d.a(this.c, true);
                        zk8 zk8Var3 = this.d.a;
                        paint.setAlpha(255);
                        bVar.b();
                        bVar.d.drawBitmap(this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                    }
                    this.d = null;
                    Bitmap bitmap4 = this.b;
                    if (bitmap4 != null) {
                        bitmap4.eraseColor(0);
                    }
                }
            } else {
                bVar.b();
                sloVar.a();
                zk8Var.b();
            }
            i++;
        }
    }
}
