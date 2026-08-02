package xsna;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.tf6;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes12.dex */
public final class zog0 implements e6j0, tf6.a {
    public final k800 a;
    public final tf6<Float, Float> b;

    @Nullable
    public v5j0 c;

    public zog0(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, xog0 xog0Var) {
        this.a = k800Var;
        tf6<Float, Float> j = xog0Var.a.j();
        this.b = j;
        aVar.h(j);
        j.a(this);
    }

    public static int d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // xsna.e6j0
    public final v5j0 a(v5j0 v5j0Var) {
        ArrayList arrayList;
        float f;
        v5j0 v5j0Var2 = v5j0Var;
        ArrayList arrayList2 = v5j0Var2.a;
        if (arrayList2.size() > 2) {
            float floatValue = this.b.f().floatValue();
            if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ArrayList arrayList3 = v5j0Var2.a;
                boolean z = v5j0Var2.c;
                boolean z2 = true;
                int size = arrayList3.size() - 1;
                int i = 0;
                while (size >= 0) {
                    qkk qkkVar = (qkk) arrayList3.get(size);
                    qkk qkkVar2 = (qkk) arrayList3.get(d(size - 1, arrayList3.size()));
                    PointF pointF = (size != 0 || z) ? qkkVar2.c : v5j0Var2.b;
                    i = (((size != 0 || z) ? qkkVar2.b : pointF).equals(pointF) && qkkVar.a.equals(pointF) && !(!v5j0Var2.c && (size == 0 || size == arrayList3.size() - 1))) ? i + 2 : i + 1;
                    size--;
                }
                v5j0 v5j0Var3 = this.c;
                if (v5j0Var3 == null || v5j0Var3.a.size() != i) {
                    ArrayList arrayList4 = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList4.add(new qkk());
                    }
                    this.c = new v5j0(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, arrayList4);
                }
                v5j0 v5j0Var4 = this.c;
                v5j0Var4.c = z;
                PointF pointF2 = v5j0Var2.b;
                v5j0Var4.a(pointF2.x, pointF2.y);
                ArrayList arrayList5 = v5j0Var4.a;
                boolean z3 = v5j0Var2.c;
                int i3 = 0;
                int i4 = 0;
                while (i3 < arrayList2.size()) {
                    qkk qkkVar3 = (qkk) arrayList2.get(i3);
                    qkk qkkVar4 = (qkk) arrayList2.get(d(i3 - 1, arrayList2.size()));
                    qkk qkkVar5 = (qkk) arrayList2.get(d(i3 - 2, arrayList2.size()));
                    PointF pointF3 = (i3 != 0 || z3) ? qkkVar4.c : v5j0Var2.b;
                    PointF pointF4 = (i3 != 0 || z3) ? qkkVar4.b : pointF3;
                    boolean z4 = z2;
                    PointF pointF5 = qkkVar3.a;
                    PointF pointF6 = qkkVar5.c;
                    PointF pointF7 = qkkVar3.c;
                    boolean z5 = (v5j0Var2.c || !(i3 == 0 || i3 == arrayList2.size() + (-1))) ? false : z4;
                    if (pointF4.equals(pointF3) && pointF5.equals(pointF3) && !z5) {
                        float f2 = pointF3.x;
                        float f3 = f2 - pointF6.x;
                        float f4 = pointF3.y;
                        float f5 = f4 - pointF6.y;
                        float f6 = pointF7.x - f2;
                        float f7 = pointF7.y - f4;
                        arrayList = arrayList2;
                        float hypot = (float) Math.hypot(f3, f5);
                        float hypot2 = (float) Math.hypot(f6, f7);
                        float min = Math.min(floatValue / hypot, 0.5f);
                        float min2 = Math.min(floatValue / hypot2, 0.5f);
                        float f8 = pointF3.x;
                        float b = u11.b(pointF6.x, f8, min, f8);
                        float f9 = pointF3.y;
                        float b2 = u11.b(pointF6.y, f9, min, f9);
                        float b3 = u11.b(pointF7.x, f8, min2, f8);
                        float b4 = u11.b(pointF7.y, f9, min2, f9);
                        float f10 = b - ((b - f8) * 0.5519f);
                        float f11 = b2 - ((b2 - f9) * 0.5519f);
                        float f12 = b3 - ((b3 - f8) * 0.5519f);
                        float f13 = b4 - ((b4 - f9) * 0.5519f);
                        qkk qkkVar6 = (qkk) arrayList5.get(d(i4 - 1, arrayList5.size()));
                        qkk qkkVar7 = (qkk) arrayList5.get(i4);
                        f = floatValue;
                        qkkVar6.b.set(b, b2);
                        qkkVar6.c.set(b, b2);
                        if (i3 == 0) {
                            v5j0Var4.a(b, b2);
                        }
                        qkkVar7.a.set(f10, f11);
                        qkk qkkVar8 = (qkk) arrayList5.get(i4 + 1);
                        qkkVar7.b.set(f12, f13);
                        qkkVar7.c.set(b3, b4);
                        qkkVar8.a.set(b3, b4);
                        i4 += 2;
                    } else {
                        arrayList = arrayList2;
                        f = floatValue;
                        qkk qkkVar9 = (qkk) arrayList5.get(d(i4 - 1, arrayList5.size()));
                        qkk qkkVar10 = (qkk) arrayList5.get(i4);
                        PointF pointF8 = qkkVar4.b;
                        qkkVar9.b.set(pointF8.x, pointF8.y);
                        PointF pointF9 = qkkVar4.c;
                        qkkVar9.c.set(pointF9.x, pointF9.y);
                        PointF pointF10 = qkkVar3.a;
                        qkkVar10.a.set(pointF10.x, pointF10.y);
                        i4++;
                    }
                    i3++;
                    v5j0Var2 = v5j0Var;
                    z2 = z4;
                    arrayList2 = arrayList;
                    floatValue = f;
                }
                return v5j0Var4;
            }
        }
        return v5j0Var2;
    }

    @Override // xsna.e6j0
    public final void c(u5j0 u5j0Var) {
        this.b.a(u5j0Var);
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.a.invalidateSelf();
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
    }
}
