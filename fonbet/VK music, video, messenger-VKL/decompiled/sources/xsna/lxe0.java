package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Size;
import androidx.core.graphics.BlendModeCompat;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RatingBarDrawDelegate.kt */
/* loaded from: classes17.dex */
public final class lxe0 {
    public float a;
    public com.vk.core.view.components.rating.a b;
    public sxe0 c;
    public vxe0 d;
    public Drawable e;
    public final Paint f = new Paint();
    public Bitmap g;
    public Canvas h;
    public final Paint i;
    public final Paint j;

    public lxe0() {
        Paint paint = new Paint();
        BlendModeCompat blendModeCompat = BlendModeCompat.SRC_IN;
        hg90.a(paint, blendModeCompat);
        this.i = paint;
        Paint paint2 = new Paint();
        hg90.a(paint2, blendModeCompat);
        this.j = paint2;
    }

    public final void a(Canvas canvas, int i, boolean z) {
        Drawable mutate;
        com.vk.core.view.components.rating.a aVar = this.b;
        if (aVar == null) {
            aVar = null;
        }
        float f = this.a;
        sxe0 sxe0Var = this.c;
        int i2 = (sxe0Var != null ? sxe0Var : null).a;
        int i3 = (sxe0Var != null ? sxe0Var : null).c;
        if (sxe0Var == null) {
            sxe0Var = null;
        }
        int a = aVar.a(f, i2, i3, sxe0Var.d);
        for (int i4 = 0; i4 < 5; i4++) {
            Canvas canvas2 = this.h;
            if (canvas2 != null) {
                sxe0 sxe0Var2 = this.c;
                int i5 = (sxe0Var2 != null ? sxe0Var2 : null).a * i4;
                if (sxe0Var2 == null) {
                    sxe0Var2 = null;
                }
                float f2 = (sxe0Var2.d * i4) + i5;
                int save = canvas2.save();
                canvas2.translate(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                try {
                    Drawable drawable = this.e;
                    if (drawable != null && (mutate = drawable.mutate()) != null) {
                        sxe0 sxe0Var3 = this.c;
                        int i6 = (sxe0Var3 != null ? sxe0Var3 : null).a;
                        if (sxe0Var3 == null) {
                            sxe0Var3 = null;
                        }
                        mutate.setBounds(0, 0, i6, sxe0Var3.a);
                        Canvas canvas3 = this.h;
                        if (canvas3 != null) {
                            mutate.draw(canvas3);
                        }
                    }
                } finally {
                    canvas2.restoreToCount(save);
                }
            }
        }
        Canvas canvas4 = this.h;
        if (canvas4 != null) {
            float f3 = a;
            sxe0 sxe0Var4 = this.c;
            if (sxe0Var4 == null) {
                sxe0Var4 = null;
            }
            float f4 = sxe0Var4.a;
            vxe0 vxe0Var = this.d;
            if (vxe0Var == null) {
                vxe0Var = null;
            }
            int f5 = l8g.f((((r7 >> 24) & 255) / 255.0f) * (z ? 1.0f : 0.64f), vxe0Var.b);
            Paint paint = this.i;
            paint.setColor(f5);
            s3q0 s3q0Var = s3q0.a;
            canvas4.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f4, paint);
        }
        Canvas canvas5 = this.h;
        if (canvas5 != null) {
            float f6 = a;
            float f7 = i;
            sxe0 sxe0Var5 = this.c;
            if (sxe0Var5 == null) {
                sxe0Var5 = null;
            }
            float f8 = sxe0Var5.a;
            vxe0 vxe0Var2 = this.d;
            int f9 = l8g.f((((r2 >> 24) & 255) / 255.0f) * (z ? 1.0f : 0.64f), (vxe0Var2 != null ? vxe0Var2 : null).a);
            Paint paint2 = this.j;
            paint2.setColor(f9);
            s3q0 s3q0Var2 = s3q0.a;
            canvas5.drawRect(f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, f8, paint2);
        }
        Bitmap bitmap = this.g;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f);
        }
    }

    public final Size b() {
        sxe0 sxe0Var = this.c;
        int i = ((sxe0Var != null ? sxe0Var : null).d * 4) + ((sxe0Var != null ? sxe0Var : null).a * 5);
        if (sxe0Var == null) {
            sxe0Var = null;
        }
        return new Size(i, sxe0Var.a);
    }
}
