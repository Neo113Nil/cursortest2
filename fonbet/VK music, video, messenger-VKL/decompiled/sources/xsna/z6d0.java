package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.sg90;

/* compiled from: PrimaryAttachmentBlurPostProcessor.kt */
/* loaded from: classes4.dex */
public final class z6d0 extends mk6 {
    public static final int[] g = {n8g.l(-1, 128), n8g.l(-1, 0)};
    public static final float[] h = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    public static final HashMap<String, Integer> i = new HashMap<>();
    public static final HashMap<String, Double> j = new HashMap<>();
    public final Paint c = new Paint(1);
    public final Rect d = new Rect();
    public final ppj0 e = new ppj0("PrimaryAttachmentBlurPostProcessor");
    public String f;

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x001f, B:5:0x004f, B:7:0x0091, B:8:0x0098, B:11:0x00b8, B:13:0x00c0, B:15:0x00cb, B:16:0x00d2, B:17:0x00c5, B:18:0x00de, B:21:0x0116, B:26:0x00f5, B:27:0x00fd, B:29:0x0103, B:32:0x010f, B:37:0x0057, B:39:0x0060, B:40:0x0063, B:42:0x007a, B:43:0x007c, B:45:0x008b, B:46:0x0081, B:48:0x0085), top: B:2:0x001f }] */
    @Override // xsna.mk6, xsna.ktc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        Integer num;
        int i2;
        Rect rect = this.d;
        Paint paint = this.c;
        paint.reset();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setStyle(Paint.Style.FILL);
        uvf<Bitmap> c = hta0Var.c(172, 172, Bitmap.Config.ARGB_8888);
        try {
            Bitmap r = c.r();
            Canvas canvas = new Canvas(r);
            int i3 = 0;
            rect.set(0, 0, r.getWidth(), r.getHeight());
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            NativeBlurFilter.iterativeBoxBlur(r, 2, 30);
            String str = this.f;
            HashMap<String, Integer> hashMap = i;
            Integer num2 = hashMap.get(str);
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                sg90.b bVar = new sg90.b(r);
                ArrayList arrayList = bVar.b;
                if (arrayList != null) {
                    arrayList.clear();
                }
                v3o0 v3o0Var = v3o0.e;
                bVar.a(v3o0Var);
                bVar.d = -1;
                bVar.e = -1;
                sg90 b = bVar.b();
                sg90.d dVar = (sg90.d) b.c.get(v3o0Var);
                if (dVar != null) {
                    i2 = dVar.d;
                } else {
                    sg90.d dVar2 = b.e;
                    if (dVar2 != null) {
                        i2 = dVar2.d;
                    } else {
                        num = null;
                        if (num != null) {
                            i3 = num.intValue();
                        }
                    }
                }
                num = Integer.valueOf(i2);
                if (num != null) {
                }
            }
            if (str != null) {
                hashMap.put(str, Integer.valueOf(i3));
            }
            paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.bottom, g, h, Shader.TileMode.CLAMP));
            canvas.drawRect(rect, paint);
            paint.setShader(null);
            HashMap<String, Double> hashMap2 = j;
            if (i3 != 0) {
                Double d = hashMap2.get(str);
                double doubleValue = d != null ? d.doubleValue() : n8g.e(i3, -1);
                if (str != null) {
                    hashMap2.put(str, Double.valueOf(doubleValue));
                }
                paint.setColor(n8g.l(i3, 31));
                canvas.drawRect(rect, paint);
            }
            paint.setColor(n8g.l(-16777216, 10));
            canvas.drawRect(rect, paint);
            if (hashMap.size() >= 16) {
                for (String str2 : hashMap.keySet()) {
                    if (!mcr0.p(str2)) {
                        hashMap.remove(str2);
                        hashMap2.remove(str2);
                    }
                }
            }
            uvf<Bitmap> n = c.n();
            c.close();
            return n;
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "PrimaryAttachmentBlurPostProcessor";
    }

    public final String toString() {
        return "PrimaryAttachmentBlurPostProcessor";
    }
}
