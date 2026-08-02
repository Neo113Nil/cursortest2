package xsna;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.MediaUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.ok.TFFrameType;

/* compiled from: RendererMatrices.kt */
/* loaded from: classes3.dex */
public final class ezf0 {
    public final float[] a = new float[16];
    public Object b = jgp.b;
    public final float[] c = new float[16];
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    /* compiled from: RendererMatrices.kt */
    public static final class a {
        public static Rect a(int i, int i2, MediaUtils.d dVar) {
            int i3;
            int i4 = dVar.b;
            long j = i4 * i;
            int i5 = dVar.a;
            int i6 = 0;
            if (j > i2 * i5) {
                int b = an10.b((i4 / i5) * i);
                i3 = 0 - ((b - i2) / 2);
                i2 = b;
            } else {
                int b2 = an10.b((i5 / i4) * i2);
                i6 = 0 - ((b2 - i) / 2);
                i = b2;
                i3 = 0;
            }
            Rect rect = new Rect();
            rect.left = i6 - (i6 % 2);
            rect.bottom = i3 - (i3 % 2);
            rect.right = i - (i % 2);
            rect.top = i2 - (i2 % 2);
            return rect;
        }
    }

    public static Pair h(float f, float f2) {
        Float valueOf = Float.valueOf(1.0f);
        float f3 = 1;
        float f4 = (f / f2) - f3;
        return Math.abs(f4) <= 0.01f ? new Pair(valueOf, valueOf) : f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new Pair(Float.valueOf(f4 + f3), valueOf) : new Pair(valueOf, Float.valueOf((f3 / f) * f2));
    }

    public final float[] a() {
        return this.c;
    }

    public final int b() {
        return this.g;
    }

    public final int c() {
        return this.f;
    }

    public final float[] d() {
        return this.a;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<ru.ok.TFFrameType, float[]>] */
    public final Map<TFFrameType, float[]> g() {
        return this.b;
    }

    public final void i(int i, int i2, int i3, int i4, boolean z) {
        if (this.h == i && this.i == i2 && this.j == i3 && this.k == i4 && this.l == z) {
            return;
        }
        float[] fArr = this.a;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(this.c, 0);
        if (z) {
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        float f = i3 / i4;
        TFFrameType tFFrameType = TFFrameType.BIG;
        TFFrameType tFFrameType2 = TFFrameType.ORIGINAL;
        Pair h = h(f, tFFrameType.frameWidth / tFFrameType.frameHeight);
        Pair h2 = h(f, tFFrameType2.frameWidth / tFFrameType2.frameHeight);
        this.d = (int) (((Number) h.first).floatValue() * tFFrameType.frameWidth);
        this.e = (int) (((Number) h.second).floatValue() * tFFrameType.frameHeight);
        this.f = (int) (((Number) h2.first).floatValue() * tFFrameType2.frameWidth);
        this.g = (int) (((Number) h2.second).floatValue() * tFFrameType2.frameHeight);
        TFFrameType[] values = TFFrameType.values();
        ArrayList arrayList = new ArrayList();
        for (TFFrameType tFFrameType3 : values) {
            if (tFFrameType3 != TFFrameType.BIG) {
                arrayList.add(tFFrameType3);
            }
        }
        int e = on00.e(c5g.u(arrayList, 10));
        int i5 = 16;
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            TFFrameType tFFrameType4 = (TFFrameType) next;
            float[] fArr2 = new float[i5];
            Matrix.setIdentityM(fArr2, 0);
            if (tFFrameType4 != TFFrameType.SKY) {
                Pair h3 = h(f, tFFrameType4.frameWidth / tFFrameType4.frameHeight);
                float f2 = 1;
                Matrix.scaleM(fArr2, 0, f2 / ((Number) h3.second).floatValue(), f2 / ((Number) h3.first).floatValue(), 1.0f);
            }
            linkedHashMap.put(next, fArr2);
            i5 = 16;
        }
        this.b = linkedHashMap;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = z;
    }
}
