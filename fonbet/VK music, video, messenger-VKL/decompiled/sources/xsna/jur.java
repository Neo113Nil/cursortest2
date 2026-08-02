package xsna;

import android.graphics.Color;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: FlowerColorWheelRenderer.java */
/* loaded from: classes12.dex */
public final class jur extends z9 {
    public final Paint c = gg90.a().a;
    public final float[] d = new float[3];
    public final float e = 1.2f;

    @Override // xsna.g9g
    public final void draw() {
        int i;
        int size = ((ArrayList) this.b).size();
        float f = 2.0f;
        float width = ((f9g) this.a).g.getWidth() / 2.0f;
        f9g f9gVar = (f9g) this.a;
        int i2 = f9gVar.a;
        float f2 = f9gVar.d;
        float f3 = f9gVar.b;
        float f4 = f9gVar.c;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            float f5 = i3;
            float f6 = i2;
            float f7 = (f5 / (i2 - 1)) * f3;
            float max = Math.max(1.5f + f2, (i3 == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((f5 - (f6 / f)) / f6) * this.e * f4) + f4);
            boolean z = true;
            int min = Math.min(Math.max(1, (int) (0.5d + (3.063052912151454d / Math.asin(max / f7)))), i2 * 2);
            int i5 = 0;
            while (i5 < min) {
                float f8 = f4;
                int i6 = i3;
                double d = min;
                boolean z2 = z;
                float f9 = width;
                double d2 = ((3.141592653589793d / d) * ((i6 + 1) % 2)) + ((i5 * 6.283185307179586d) / d);
                double d3 = f7;
                float cos = f9 + ((float) (Math.cos(d2) * d3));
                float sin = f9 + ((float) (Math.sin(d2) * d3));
                float f10 = (float) ((d2 * 180.0d) / 3.141592653589793d);
                float[] fArr = this.d;
                fArr[0] = f10;
                fArr[z2 ? 1 : 0] = f7 / f3;
                fArr[2] = ((f9g) this.a).f;
                int HSVToColor = Color.HSVToColor(fArr);
                Paint paint = this.c;
                paint.setColor(HSVToColor);
                paint.setAlpha(Math.round(((f9g) this.a).e * 255.0f));
                float f11 = max - f2;
                ((f9g) this.a).g.drawCircle(cos, sin, f11, paint);
                if (i4 >= size) {
                    ArrayList arrayList = (ArrayList) this.b;
                    t5g t5gVar = new t5g();
                    i = size;
                    t5gVar.d = new float[3];
                    t5gVar.b(cos, sin, f11, fArr);
                    arrayList.add(t5gVar);
                } else {
                    i = size;
                    ((t5g) ((ArrayList) this.b).get(i4)).b(cos, sin, f11, fArr);
                }
                i4++;
                i5++;
                i3 = i6;
                f4 = f8;
                size = i;
                width = f9;
                z = z2 ? 1 : 0;
            }
            i3++;
            f = 2.0f;
        }
    }
}
