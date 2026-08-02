package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes11.dex */
public abstract class a810 {
    public static final nyk0 a;
    public static final nyk0 b;
    public static final nyk0 c;
    public static final nyk0 d;
    public static final nyk0 e;
    public static final nyk0 f;
    public static final nyk0 g;

    static {
        wre wreVar = new wre(0.15f, 0.0f);
        wre wreVar2 = new wre(0.2f, 0.0f);
        wre wreVar3 = new wre(0.3f, 0.0f);
        wre wreVar4 = new wre(0.5f, 0.0f);
        wre wreVar5 = new wre(1.0f, 0.0f);
        c(xbb1.e(14));
        c(nsa1.c(new float[]{0.5f, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f}, wreVar3, null, 0.0f, 0.0f));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new z710(new PointF(0.926f, 0.97f), new wre(0.189f, 0.811f)));
        arrayList.add(new z710(new PointF(-0.021f, 0.967f), new wre(0.187f, 0.057f)));
        c(b(2, arrayList, false));
        wre wreVar6 = wre.c;
        c(ybb1.c(nsa1.b(4, 1.0f, wreVar6, Arrays.asList(wreVar5, wreVar5, wreVar2, wreVar2)), a(-135.0f)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new z710(new PointF(1.0f, 1.0f), new wre(0.148f, 0.417f)));
        arrayList2.add(new z710(new PointF(0.0f, 1.0f), new wre(0.151f, 0.0f)));
        arrayList2.add(new z710(new PointF(0.0f, 0.0f), new wre(0.148f, 0.0f)));
        arrayList2.add(new z710(new PointF(0.978f, 0.02f), new wre(0.803f, 0.0f)));
        c(b(1, arrayList2, false));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new z710(new PointF(0.5f, 0.892f), new wre(0.313f, 0.0f)));
        arrayList3.add(new z710(new PointF(-0.216f, 1.05f), new wre(0.207f, 0.0f)));
        arrayList3.add(new z710(new PointF(0.499f, -0.16f), new wre(0.215f, 1.0f)));
        arrayList3.add(new z710(new PointF(1.225f, 1.06f), new wre(0.211f, 0.0f)));
        c(b(1, arrayList3, false));
        c(nsa1.c(new float[]{0.8f, 0.5f, -0.8f, 0.5f, -0.8f, -0.5f, 0.8f, -0.5f}, wreVar6, Arrays.asList(wreVar2, wreVar2, wreVar5, wreVar5), 0.0f, 0.0f));
        nyk0 e2 = xbb1.e(15);
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, 0.64f);
        a = c(ybb1.c(ybb1.c(e2, matrix), a(-45.0f)));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new z710(new PointF(0.961f, 0.039f), new wre(0.426f, 0.0f)));
        arrayList4.add(new z710(new PointF(1.001f, 0.428f)));
        arrayList4.add(new z710(new PointF(1.0f, 0.609f), wreVar5));
        b = c(b(2, arrayList4, true));
        c(ybb1.c(nsa1.b(3, 1.0f, wreVar2, null), a(-90.0f)));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new z710(new PointF(0.5f, 1.096f), new wre(0.151f, 0.524f)));
        arrayList5.add(new z710(new PointF(0.04f, 0.5f), new wre(0.159f, 0.0f)));
        c(b(2, arrayList5, false));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new z710(new PointF(0.171f, 0.841f), new wre(0.159f, 0.0f)));
        arrayList6.add(new z710(new PointF(-0.02f, 0.5f), new wre(0.14f, 0.0f)));
        arrayList6.add(new z710(new PointF(0.17f, 0.159f), new wre(0.159f, 0.0f)));
        c(b(2, arrayList6, false));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new z710(new PointF(0.5f, -0.009f), new wre(0.172f, 0.0f)));
        c = c(b(5, arrayList7, false));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new z710(new PointF(0.499f, 1.023f), new wre(0.241f, 0.778f)));
        arrayList8.add(new z710(new PointF(-0.005f, 0.792f), new wre(0.208f, 0.0f)));
        arrayList8.add(new z710(new PointF(0.073f, 0.258f), new wre(0.228f, 0.0f)));
        arrayList8.add(new z710(new PointF(0.433f, -0.0f), new wre(0.491f, 0.0f)));
        c(ybb1.c(b(1, arrayList8, true), a(-90.0f)));
        d = c(xbb1.g(8, 0.8f, wreVar));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new z710(new PointF(0.5f, 1.08f), new wre(0.085f, 0.0f)));
        arrayList9.add(new z710(new PointF(0.358f, 0.843f), new wre(0.085f, 0.0f)));
        c(b(8, arrayList9, false));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new z710(new PointF(1.237f, 1.236f), new wre(0.258f, 0.0f)));
        arrayList10.add(new z710(new PointF(0.5f, 0.918f), new wre(0.233f, 0.0f)));
        e = c(b(4, arrayList10, false));
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add(new z710(new PointF(0.723f, 0.884f), new wre(0.394f, 0.0f)));
        arrayList11.add(new z710(new PointF(0.5f, 1.099f), new wre(0.398f, 0.0f)));
        c(b(6, arrayList11, false));
        c(ybb1.c(xbb1.g(7, 0.75f, wreVar4), a(-90.0f)));
        f = c(ybb1.c(xbb1.g(9, 0.8f, wreVar4), a(-90.0f)));
        c(ybb1.c(xbb1.g(12, 0.8f, wreVar4), a(-90.0f)));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(new z710(new PointF(0.5f, 0.0f), wreVar5));
        arrayList12.add(new z710(new PointF(1.0f, 0.0f), wreVar5));
        arrayList12.add(new z710(new PointF(1.0f, 1.14f), new wre(0.254f, 0.106f)));
        arrayList12.add(new z710(new PointF(0.575f, 0.906f), new wre(0.253f, 0.0f)));
        c(b(1, arrayList12, true));
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add(new z710(new PointF(0.5f, 0.074f)));
        arrayList13.add(new z710(new PointF(0.725f, -0.099f), new wre(0.476f, 0.0f)));
        c(b(4, arrayList13, true));
        ArrayList arrayList14 = new ArrayList();
        arrayList14.add(new z710(new PointF(0.5f, 0.036f)));
        arrayList14.add(new z710(new PointF(0.758f, -0.101f), new wre(0.209f, 0.0f)));
        c(b(8, arrayList14, false));
        ArrayList arrayList15 = new ArrayList();
        arrayList15.add(new z710(new PointF(0.5f, -0.006f), new wre(0.006f, 0.0f)));
        arrayList15.add(new z710(new PointF(0.592f, 0.158f), new wre(0.006f, 0.0f)));
        c(b(12, arrayList15, false));
        ArrayList arrayList16 = new ArrayList();
        arrayList16.add(new z710(new PointF(0.193f, 0.277f), new wre(0.053f, 0.0f)));
        arrayList16.add(new z710(new PointF(0.176f, 0.055f), new wre(0.053f, 0.0f)));
        g = c(b(10, arrayList16, false));
        ArrayList arrayList17 = new ArrayList();
        arrayList17.add(new z710(new PointF(0.457f, 0.296f), new wre(0.007f, 0.0f)));
        arrayList17.add(new z710(new PointF(0.5f, -0.051f), new wre(0.007f, 0.0f)));
        c(b(15, arrayList17, false));
        ArrayList arrayList18 = new ArrayList();
        arrayList18.add(new z710(new PointF(0.733f, 0.454f)));
        arrayList18.add(new z710(new PointF(0.839f, 0.437f), new wre(0.532f, 0.0f)));
        arrayList18.add(new z710(new PointF(0.949f, 0.449f), new wre(0.439f, 1.0f)));
        arrayList18.add(new z710(new PointF(0.998f, 0.478f), new wre(0.174f, 0.0f)));
        c(b(16, arrayList18, true));
        ArrayList arrayList19 = new ArrayList();
        arrayList19.add(new z710(new PointF(0.37f, 0.187f)));
        arrayList19.add(new z710(new PointF(0.416f, 0.049f), new wre(0.381f, 0.0f)));
        arrayList19.add(new z710(new PointF(0.479f, 0.0f), new wre(0.095f, 0.0f)));
        c(b(8, arrayList19, true));
        ArrayList arrayList20 = new ArrayList();
        arrayList20.add(new z710(new PointF(0.5f, 0.053f)));
        arrayList20.add(new z710(new PointF(0.545f, -0.04f), new wre(0.405f, 0.0f)));
        arrayList20.add(new z710(new PointF(0.67f, -0.035f), new wre(0.426f, 0.0f)));
        arrayList20.add(new z710(new PointF(0.717f, 0.066f), new wre(0.574f, 0.0f)));
        arrayList20.add(new z710(new PointF(0.722f, 0.128f)));
        arrayList20.add(new z710(new PointF(0.777f, 0.002f), new wre(0.36f, 0.0f)));
        arrayList20.add(new z710(new PointF(0.914f, 0.149f), new wre(0.66f, 0.0f)));
        arrayList20.add(new z710(new PointF(0.926f, 0.289f), new wre(0.66f, 0.0f)));
        arrayList20.add(new z710(new PointF(0.881f, 0.346f)));
        arrayList20.add(new z710(new PointF(0.94f, 0.344f), new wre(0.126f, 0.0f)));
        arrayList20.add(new z710(new PointF(1.003f, 0.437f), new wre(0.255f, 0.0f)));
        nyk0 b2 = b(2, arrayList20, true);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(1.0f, 0.742f);
        c(ybb1.c(b2, matrix2));
        ArrayList arrayList21 = new ArrayList();
        arrayList21.add(new z710(new PointF(0.87f, 0.13f), new wre(0.146f, 0.0f)));
        arrayList21.add(new z710(new PointF(0.818f, 0.357f)));
        arrayList21.add(new z710(new PointF(1.0f, 0.332f), new wre(0.853f, 0.0f)));
        c(b(4, arrayList21, true));
        ArrayList arrayList22 = new ArrayList();
        arrayList22.add(new z710(new PointF(0.5f, 0.0f)));
        arrayList22.add(new z710(new PointF(0.704f, 0.0f)));
        arrayList22.add(new z710(new PointF(0.704f, 0.065f)));
        arrayList22.add(new z710(new PointF(0.843f, 0.065f)));
        arrayList22.add(new z710(new PointF(0.843f, 0.148f)));
        arrayList22.add(new z710(new PointF(0.926f, 0.148f)));
        arrayList22.add(new z710(new PointF(0.926f, 0.296f)));
        arrayList22.add(new z710(new PointF(1.0f, 0.296f)));
        c(b(2, arrayList22, true));
        ArrayList arrayList23 = new ArrayList();
        arrayList23.add(new z710(new PointF(0.11f, 0.5f)));
        arrayList23.add(new z710(new PointF(0.113f, 0.0f)));
        arrayList23.add(new z710(new PointF(0.287f, 0.0f)));
        arrayList23.add(new z710(new PointF(0.287f, 0.087f)));
        arrayList23.add(new z710(new PointF(0.421f, 0.087f)));
        arrayList23.add(new z710(new PointF(0.421f, 0.17f)));
        arrayList23.add(new z710(new PointF(0.56f, 0.17f)));
        arrayList23.add(new z710(new PointF(0.56f, 0.265f)));
        arrayList23.add(new z710(new PointF(0.674f, 0.265f)));
        arrayList23.add(new z710(new PointF(0.675f, 0.344f)));
        arrayList23.add(new z710(new PointF(0.789f, 0.344f)));
        arrayList23.add(new z710(new PointF(0.789f, 0.439f)));
        arrayList23.add(new z710(new PointF(0.888f, 0.439f)));
        c(b(1, arrayList23, true));
        ArrayList arrayList24 = new ArrayList();
        arrayList24.add(new z710(new PointF(0.796f, 0.5f)));
        arrayList24.add(new z710(new PointF(0.853f, 0.518f), wreVar5));
        arrayList24.add(new z710(new PointF(0.992f, 0.631f), wreVar5));
        arrayList24.add(new z710(new PointF(0.968f, 1.0f), wreVar5));
        c(b(2, arrayList24, true));
        ArrayList arrayList25 = new ArrayList();
        arrayList25.add(new z710(new PointF(0.5f, 0.268f), new wre(0.016f, 0.0f)));
        arrayList25.add(new z710(new PointF(0.792f, -0.066f), new wre(0.958f, 0.0f)));
        arrayList25.add(new z710(new PointF(1.064f, 0.276f), wreVar5));
        arrayList25.add(new z710(new PointF(0.501f, 0.946f), new wre(0.129f, 0.0f)));
        c(b(1, arrayList25, true));
    }

    public static Matrix a(float f2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f2);
        return matrix;
    }

    public static nyk0 b(int i, ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PointF pointF = ((z710) it.next()).a;
            pointF.offset(-0.5f, -0.5f);
            float atan2 = (float) Math.atan2(pointF.y, pointF.x);
            float hypot = (float) Math.hypot(pointF.x, pointF.y);
            pointF.x = atan2;
            pointF.y = hypot;
        }
        float f2 = (float) (6.283185307179586d / i);
        if (z) {
            int i2 = i * 2;
            float f3 = f2 / 2.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    boolean z2 = i3 % 2 != 0;
                    int size = z2 ? (arrayList.size() - 1) - i4 : i4;
                    z710 z710Var = (z710) arrayList.get(size);
                    if (size > 0 || !z2) {
                        arrayList2.add(new z710(new PointF((i3 * f3) + (z2 ? (((z710) arrayList.get(0)).a.x * 2.0f) + (f3 - z710Var.a.x) : z710Var.a.x), z710Var.a.y), z710Var.b));
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < i; i5++) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    z710 z710Var2 = (z710) it2.next();
                    arrayList2.add(new z710(new PointF((i5 * f2) + z710Var2.a.x, z710Var2.a.y), z710Var2.b));
                }
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            PointF pointF2 = ((z710) it3.next()).a;
            float cos = (float) ((Math.cos(pointF2.x) * pointF2.y) + 0.5d);
            float sin = (float) ((Math.sin(pointF2.x) * pointF2.y) + 0.5d);
            pointF2.x = cos;
            pointF2.y = sin;
        }
        float[] fArr = new float[arrayList2.size() * 2];
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            int i7 = i6 * 2;
            fArr[i7] = ((z710) arrayList2.get(i6)).a.x;
            fArr[i7 + 1] = ((z710) arrayList2.get(i6)).a.y;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            arrayList3.add(((z710) arrayList2.get(i8)).b);
        }
        return nsa1.c(fArr, wre.c, arrayList3, 0.5f, 0.5f);
    }

    public static nyk0 c(nyk0 nyk0Var) {
        return d(nyk0Var, new RectF(0.0f, 0.0f, 1.0f, 1.0f));
    }

    public static nyk0 d(nyk0 nyk0Var, RectF rectF) {
        float[] fArr = new float[4];
        ListBuilder listBuilder = nyk0Var.d;
        float f2 = nyk0Var.c;
        float f3 = nyk0Var.b;
        int size = listBuilder.size();
        float f4 = 0.0f;
        for (int i = 0; i < size; i++) {
            jdf jdfVar = (jdf) listBuilder.get(i);
            float[] fArr2 = jdfVar.a;
            float f5 = fArr2[0] - f3;
            float f6 = fArr2[1] - f2;
            float f7 = ex21.b;
            float f8 = (f6 * f6) + (f5 * f5);
            long c2 = jdfVar.c(0.5f);
            float j = pw91.j(c2) - f3;
            float k = pw91.k(c2) - f2;
            f4 = Math.max(f4, Math.max(f8, (k * k) + (j * j)));
        }
        float sqrt = (float) Math.sqrt(f4);
        fArr[0] = f3 - sqrt;
        fArr[1] = f2 - sqrt;
        fArr[2] = f3 + sqrt;
        fArr[3] = f2 + sqrt;
        RectF rectF2 = new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
        float min = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        matrix.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrix.postTranslate(rectF.centerX(), rectF.centerY());
        return ybb1.c(nyk0Var, matrix);
    }
}
