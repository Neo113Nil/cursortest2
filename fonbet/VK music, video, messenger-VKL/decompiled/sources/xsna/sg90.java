package xsna;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Palette.java */
/* loaded from: classes12.dex */
public final class sg90 {
    public static final a f = new a();
    public final List<d> a;
    public final List<v3o0> b;

    @Nullable
    public final d e;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final zk3 c = new zk3();

    /* compiled from: Palette.java */
    public static class a implements c {
        @Override // xsna.sg90.c
        public final boolean a(float[] fArr) {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[0];
                if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: Palette.java */
    public static final class b {

        @Nullable
        public final Bitmap a;
        public final ArrayList b;
        public int c;
        public int d;
        public int e;
        public final ArrayList f;

        public b(@NonNull Bitmap bitmap) {
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
            arrayList2.add(sg90.f);
            this.a = bitmap;
            arrayList.add(v3o0.d);
            arrayList.add(v3o0.e);
            arrayList.add(v3o0.f);
            arrayList.add(v3o0.g);
            arrayList.add(v3o0.h);
            arrayList.add(v3o0.i);
        }

        @NonNull
        public final void a(@NonNull v3o0 v3o0Var) {
            ArrayList arrayList = this.b;
            if (arrayList.contains(v3o0Var)) {
                return;
            }
            arrayList.add(v3o0Var);
        }

        @NonNull
        public final sg90 b() {
            int max;
            int i;
            int i2;
            Bitmap bitmap = this.a;
            if (bitmap == null) {
                throw new AssertionError();
            }
            double d = -1.0d;
            if (this.d > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                int i3 = this.d;
                if (height > i3) {
                    d = Math.sqrt(i3 / height);
                }
            } else if (this.e > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.e)) {
                d = i / max;
            }
            int i4 = 0;
            Bitmap createScaledBitmap = d <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
            int width = createScaledBitmap.getWidth();
            int height2 = createScaledBitmap.getHeight();
            int[] iArr = new int[width * height2];
            createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
            int i5 = this.c;
            ArrayList arrayList = this.f;
            w5g w5gVar = new w5g(iArr, i5, arrayList.isEmpty() ? null : (c[]) arrayList.toArray(new c[arrayList.size()]));
            if (createScaledBitmap != bitmap) {
                createScaledBitmap.recycle();
            }
            ArrayList arrayList2 = this.b;
            sg90 sg90Var = new sg90(arrayList2, w5gVar.c);
            int size = arrayList2.size();
            int i6 = 0;
            while (true) {
                SparseBooleanArray sparseBooleanArray = sg90Var.d;
                if (i6 >= size) {
                    sparseBooleanArray.clear();
                    return sg90Var;
                }
                v3o0 v3o0Var = (v3o0) arrayList2.get(i6);
                float[] fArr = v3o0Var.c;
                float[] fArr2 = v3o0Var.a;
                int length = fArr.length;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f2 = 0.0f;
                for (int i7 = i4; i7 < length; i7++) {
                    float f3 = fArr[i7];
                    if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 += f3;
                    }
                }
                if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int length2 = fArr.length;
                    for (int i8 = i4; i8 < length2; i8++) {
                        float f4 = fArr[i8];
                        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            fArr[i8] = f4 / f2;
                        }
                    }
                }
                List<d> list = sg90Var.a;
                int size2 = list.size();
                int i9 = i4;
                float f5 = 0.0f;
                d dVar = null;
                while (i9 < size2) {
                    d dVar2 = list.get(i9);
                    float[] b = dVar2.b();
                    float f6 = b[1];
                    float f7 = f;
                    float[] fArr3 = v3o0Var.b;
                    if (f6 >= fArr2[i9] && f6 <= fArr2[2]) {
                        float f8 = b[2];
                        if (f8 >= fArr3[i9] && f8 <= fArr3[2] && !sparseBooleanArray.get(dVar2.d)) {
                            float[] b2 = dVar2.b();
                            d dVar3 = sg90Var.e;
                            int i10 = dVar3 != null ? dVar3.e : 1;
                            i2 = size;
                            float[] fArr4 = v3o0Var.c;
                            float f9 = fArr4[i9];
                            float abs = f9 > f7 ? (1.0f - Math.abs(b2[1] - fArr2[1])) * f9 : f7;
                            float f10 = fArr4[1];
                            float abs2 = f10 > f7 ? (1.0f - Math.abs(b2[2] - fArr3[1])) * f10 : f7;
                            float f11 = fArr4[2];
                            float f12 = abs + abs2 + (f11 > f7 ? (dVar2.e / i10) * f11 : f7);
                            if (dVar == null || f12 > f5) {
                                dVar = dVar2;
                                f5 = f12;
                            }
                            i9++;
                            size = i2;
                            f = f7;
                        }
                    }
                    i2 = size;
                    i9++;
                    size = i2;
                    f = f7;
                }
                int i11 = size;
                if (dVar != null) {
                    sparseBooleanArray.append(dVar.d, true);
                }
                sg90Var.c.put(v3o0Var, dVar);
                i6++;
                i4 = i9;
                size = i11;
            }
        }
    }

    /* compiled from: Palette.java */
    public interface c {
        boolean a(@NonNull float[] fArr);
    }

    /* compiled from: Palette.java */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public boolean f;
        public int g;
        public int h;

        @Nullable
        public float[] i;

        public d(int i, int i2) {
            this.a = Color.red(i);
            this.b = Color.green(i);
            this.c = Color.blue(i);
            this.d = i;
            this.e = i2;
        }

        public final void a() {
            if (this.f) {
                return;
            }
            int i = this.d;
            int g = n8g.g(4.5f, -1, i);
            int g2 = n8g.g(3.0f, -1, i);
            if (g != -1 && g2 != -1) {
                this.h = n8g.l(-1, g);
                this.g = n8g.l(-1, g2);
                this.f = true;
                return;
            }
            int g3 = n8g.g(4.5f, -16777216, i);
            int g4 = n8g.g(3.0f, -16777216, i);
            if (g3 == -1 || g4 == -1) {
                this.h = g != -1 ? n8g.l(-1, g) : n8g.l(-16777216, g3);
                this.g = g2 != -1 ? n8g.l(-1, g2) : n8g.l(-16777216, g4);
                this.f = true;
            } else {
                this.h = n8g.l(-16777216, g3);
                this.g = n8g.l(-16777216, g4);
                this.f = true;
            }
        }

        @NonNull
        public final float[] b() {
            if (this.i == null) {
                this.i = new float[3];
            }
            n8g.b(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.e == dVar.e && this.d == dVar.d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.d * 31) + this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(d.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.d));
            sb.append("] [HSL: ");
            sb.append(Arrays.toString(b()));
            sb.append("] [Population: ");
            sb.append(this.e);
            sb.append("] [Title Text: #");
            a();
            sb.append(Integer.toHexString(this.g));
            sb.append("] [Body Text: #");
            a();
            sb.append(Integer.toHexString(this.h));
            sb.append(']');
            return sb.toString();
        }
    }

    public sg90(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
        int size = list.size();
        int i = Integer.MIN_VALUE;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = (d) list.get(i2);
            int i3 = dVar2.e;
            if (i3 > i) {
                dVar = dVar2;
                i = i3;
            }
        }
        this.e = dVar;
    }
}
