package xsna;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawingState.java */
/* loaded from: classes17.dex */
public final class wlo {
    public static final wlo i = new wlo();
    public final Matrix a = new Matrix();
    public final ArrayList<slo> b;
    public final ArrayList<zk8> c;
    public final ArrayList<slo> d;
    public final ArrayList<zk8> e;
    public Bitmap f;
    public float g;
    public float h;

    public wlo() {
        new Matrix();
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = new ArrayList<>();
    }

    public final void a(float f, float f2) {
        if (this.g != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.h != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Matrix matrix = this.a;
            matrix.reset();
            float min = Math.min(f / this.g, f2 / this.h);
            matrix.postScale(min, min, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Iterator<slo> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().b(matrix);
            }
            Iterator<slo> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().b(matrix);
            }
            Bitmap bitmap = this.f;
            if (bitmap != null) {
                this.f = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f.getHeight(), matrix, false);
            }
            Iterator<zk8> it3 = this.e.iterator();
            while (it3.hasNext()) {
                it3.next().a *= min;
            }
            Iterator<zk8> it4 = this.c.iterator();
            while (it4.hasNext()) {
                it4.next().a *= min;
            }
        }
        this.g = f;
        this.h = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wlo.class == obj.getClass()) {
            wlo wloVar = (wlo) obj;
            if (this.d.equals(wloVar.d) && this.e.equals(wloVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
