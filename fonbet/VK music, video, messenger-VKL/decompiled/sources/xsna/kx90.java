package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: PeriodPointProcessor.kt */
/* loaded from: classes4.dex */
public final class kx90 implements mlb0 {
    public a b = a.e;

    /* compiled from: PeriodPointProcessor.kt */
    public static final class a {
        public static final a e = new a(0);
        public final int a;
        public final float b;
        public final float c;
        public final float d;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return "ProcessState(pointsProcessed=" + this.a + ", distanceSinceLastDrawnPoint=" + this.b + ", lastDrawnPointX=" + this.c + ", lastDrawnPointY=" + this.d + ")";
        }

        public a(float f, float f2, float f3, int i) {
            this.a = i;
            this.b = f;
            this.c = f2;
            this.d = f3;
        }

        public /* synthetic */ a(int i) {
            this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        }
    }

    public final void a(List<glb0> list, List<glb0> list2, boolean z) {
        this.b = d(z, list, list2, this.b);
    }

    @Override // xsna.mlb0
    public final void b(List<glb0> list, List<glb0> list2, boolean z) {
        d(z, list, list2, a.e);
    }

    public final void c() {
        this.b = a.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a d(boolean z, List<glb0> list, List<glb0> list2, a aVar) {
        float f;
        float f2;
        int size;
        List<glb0> list3 = list;
        list2.clear();
        float f3 = aVar.c;
        float f4 = aVar.d;
        float f5 = aVar.b;
        if (z && 1 <= (size = list3.size()) && size < 5) {
            list2.add(j5g.Y(list3));
            return aVar;
        }
        int max = Math.max(0, aVar.a - 2);
        int h = e43.h(list3) - 2;
        if (max <= h) {
            while (true) {
                float f6 = list3.get(max).a;
                float f7 = list3.get(max).b;
                int i = max + 1;
                float f8 = list3.get(i).a;
                float f9 = list3.get(i).b;
                int i2 = max + 2;
                float f10 = (f6 + f8) / 2.0f;
                float f11 = (f7 + f9) / 2.0f;
                float f12 = (list3.get(i2).a + f8) / 2.0f;
                float f13 = (list3.get(i2).b + f9) / 2.0f;
                float f14 = f10 - f8;
                float f15 = f11 - f9;
                float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                float f16 = f8 - f12;
                float f17 = f9 - f13;
                float f18 = (f17 * f17) + (f16 * f16);
                f = f3;
                int b = an10.b((((float) Math.sqrt(f18)) + sqrt) * 0.3f);
                f4 = f4;
                int i3 = 0;
                while (i3 < b) {
                    float f19 = i3 / b;
                    float f20 = f19 * f19;
                    int i4 = b;
                    float f21 = 2;
                    float f22 = f21 * f8;
                    float f23 = ((f22 - (f21 * f10)) * f19) + (((f10 - f22) + f12) * f20) + f10;
                    float f24 = f21 * f9;
                    float f25 = ((f24 - (f21 * f11)) * f19) + (((f11 - f24) + f13) * f20) + f11;
                    float f26 = f - f23;
                    float f27 = f4 - f25;
                    float sqrt2 = ((float) Math.sqrt((f27 * f27) + (f26 * f26))) + f5;
                    if (sqrt2 > 3) {
                        list2.add(new glb0(f23, f25, null));
                        f5 = 0.0f;
                    } else {
                        f5 = sqrt2;
                    }
                    i3++;
                    b = i4;
                    f4 = f23;
                    f = f4;
                }
                f2 = f5;
                if (max == h) {
                    break;
                }
                list3 = list;
                f5 = f2;
                max = i;
                f3 = f;
            }
            f5 = f2;
            f3 = f;
        }
        return new a(f5, f3, f4, list.size());
    }
}
