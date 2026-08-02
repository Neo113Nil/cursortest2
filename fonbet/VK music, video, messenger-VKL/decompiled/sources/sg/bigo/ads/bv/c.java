package sg.bigo.ads.bv;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class c {
    static final b b = new b() { // from class: sg.bigo.ads.bv.c.1
        @Override // sg.bigo.ads.bv.c.b
        public final boolean a(float[] fArr) {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[1];
                if ((f2 > 0.1f || f < 0.55f) && ((f2 > 0.5f || f < 0.75f) && (f2 > 0.2f || f < 0.7f))) {
                    float f3 = fArr[0];
                    if (f3 < 10.0f || f3 > 37.0f || f2 > 0.82f) {
                        return true;
                    }
                }
            }
            return false;
        }
    };
    private final List<C2447c> c;
    private final List<d> d;
    private final SparseBooleanArray f = new SparseBooleanArray();
    private final Map<d, C2447c> e = new ArrayMap();

    @Nullable
    final C2447c a = b();

    public static final class a {

        @Nullable
        final Bitmap a;
        final List<d> b;
        int c;
        int d;
        int e;
        final List<b> f;

        public a(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            this.c = 16;
            this.d = 12544;
            this.e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(c.b);
            this.a = bitmap;
            arrayList.add(d.a);
        }
    }

    public interface b {
        boolean a(@NonNull float[] fArr);
    }

    /* renamed from: sg.bigo.ads.bv.c$c, reason: collision with other inner class name */
    public static final class C2447c {
        final int a;
        final int b;
        private final int c;
        private final int d;
        private final int e;

        @Nullable
        private float[] f;

        public C2447c(int i, int i2) {
            this.c = Color.red(i);
            this.d = Color.green(i);
            this.e = Color.blue(i);
            this.a = i;
            this.b = i2;
        }

        @NonNull
        public final float[] a() {
            if (this.f == null) {
                this.f = new float[3];
            }
            sg.bigo.ads.bv.b.a(this.c, this.d, this.e, this.f);
            return this.f;
        }
    }

    public c(List<C2447c> list, List<d> list2) {
        this.c = list;
        this.d = list2;
    }

    @NonNull
    public static a a(@NonNull Bitmap bitmap) {
        return new a(bitmap);
    }

    @Nullable
    private C2447c b() {
        int size = this.c.size();
        int i = Integer.MIN_VALUE;
        C2447c c2447c = null;
        for (int i2 = 0; i2 < size; i2++) {
            C2447c c2447c2 = this.c.get(i2);
            int i3 = c2447c2.b;
            if (i3 > i) {
                c2447c = c2447c2;
                i = i3;
            }
        }
        return c2447c;
    }

    public final void a() {
        float f;
        float f2;
        int size = this.d.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            d dVar = this.d.get(i2);
            int length = dVar.d.length;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f4 = 0.0f;
            for (int i3 = i; i3 < length; i3++) {
                float f5 = dVar.d[i3];
                if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f4 += f5;
                }
            }
            if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int length2 = dVar.d.length;
                for (int i4 = i; i4 < length2; i4++) {
                    float[] fArr = dVar.d;
                    float f6 = fArr[i4];
                    if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        fArr[i4] = f6 / f4;
                    }
                }
            }
            Map<d, C2447c> map = this.e;
            int size2 = this.c.size();
            C2447c c2447c = null;
            int i5 = i;
            float f7 = 0.0f;
            while (i5 < size2) {
                C2447c c2447c2 = this.c.get(i5);
                float[] a2 = c2447c2.a();
                float f8 = a2[1];
                float[] fArr2 = dVar.b;
                if (f8 >= fArr2[i] && f8 <= fArr2[2]) {
                    float f9 = a2[2];
                    float[] fArr3 = dVar.c;
                    if (f9 >= fArr3[i] && f9 <= fArr3[2] && !this.f.get(c2447c2.a)) {
                        float[] a3 = c2447c2.a();
                        C2447c c2447c3 = this.a;
                        int i6 = c2447c3 != null ? c2447c3.b : 1;
                        float f10 = dVar.d[i];
                        float abs = f10 > f3 ? (1.0f - Math.abs(a3[1] - dVar.b[1])) * f10 : f3;
                        float f11 = dVar.d[1];
                        if (f11 > f3) {
                            f = f3;
                            f2 = (1.0f - Math.abs(a3[2] - dVar.c[1])) * f11;
                        } else {
                            f = f3;
                            f2 = f;
                        }
                        float f12 = dVar.d[2];
                        float f13 = abs + f2 + (f12 > f ? (c2447c2.b / i6) * f12 : f);
                        if (c2447c == null || f13 > f7) {
                            f7 = f13;
                            c2447c = c2447c2;
                        }
                        i5++;
                        f3 = f;
                        i = 0;
                    }
                }
                f = f3;
                i5++;
                f3 = f;
                i = 0;
            }
            if (c2447c != null && dVar.e) {
                this.f.append(c2447c.a, true);
            }
            map.put(dVar, c2447c);
            i2++;
            i = 0;
        }
        this.f.clear();
    }
}
