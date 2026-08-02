package xsna;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CropAreaState.kt */
/* loaded from: classes4.dex */
public final class cfk implements afk {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final RectF f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final int m;
    public final int n;

    public cfk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfk)) {
            return false;
        }
        cfk cfkVar = (cfk) obj;
        return Float.compare(this.b, cfkVar.b) == 0 && Float.compare(this.c, cfkVar.c) == 0 && Float.compare(this.d, cfkVar.d) == 0 && Float.compare(this.e, cfkVar.e) == 0 && epx.f(this.f, cfkVar.f) && Float.compare(this.g, cfkVar.g) == 0 && Float.compare(this.h, cfkVar.h) == 0 && Float.compare(this.i, cfkVar.i) == 0 && Float.compare(this.j, cfkVar.j) == 0 && Float.compare(this.k, cfkVar.k) == 0 && Float.compare(this.l, cfkVar.l) == 0 && this.m == cfkVar.m && this.n == cfkVar.n;
    }

    @Override // xsna.afk
    public final float getCenterX() {
        return this.h;
    }

    @Override // xsna.afk
    public final float getCenterY() {
        return this.i;
    }

    @Override // xsna.afk
    public final float getCropHeight() {
        return this.k;
    }

    @Override // xsna.afk
    public final RectF getCropRect() {
        return this.f;
    }

    @Override // xsna.afk
    public final float getCropWidth() {
        return this.j;
    }

    @Override // xsna.afk
    public final int getFullHeight() {
        return this.n;
    }

    @Override // xsna.afk
    public final int getFullWidth() {
        return this.m;
    }

    @Override // xsna.afk
    public final float getX0() {
        return this.b;
    }

    @Override // xsna.afk
    public final float getX1() {
        return this.c;
    }

    @Override // xsna.afk
    public final float getY0() {
        return this.d;
    }

    @Override // xsna.afk
    public final float getY1() {
        return this.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + shy.a(this.m, io.reactivex.rxjava3.subjects.b.a(this.l, io.reactivex.rxjava3.subjects.b.a(this.k, io.reactivex.rxjava3.subjects.b.a(this.j, io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, (this.f.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder a = bxj0.a("CropAreaState(x0=", this.b, ", x1=", this.c, ", y0=");
        gq.h(a, this.d, ", y1=", this.e, ", cropRect=");
        a.append(this.f);
        a.append(", cropAspectRatio=");
        a.append(this.g);
        a.append(", centerX=");
        gq.h(a, this.h, ", centerY=", this.i, ", cropWidth=");
        gq.h(a, this.j, ", cropHeight=", this.k, ", cropScale=");
        a.append(this.l);
        a.append(", fullWidth=");
        a.append(this.m);
        a.append(", fullHeight=");
        return h5s.c(this.n, ")", a);
    }

    public cfk(float f, float f2, float f3, float f4, RectF rectF, float f5, float f6, float f7, float f8, float f9, float f10, int i, int i2) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = rectF;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = f9;
        this.l = f10;
        this.m = i;
        this.n = i2;
    }

    public /* synthetic */ cfk(int i) {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new RectF(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
    }
}
