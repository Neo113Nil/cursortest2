package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClipsDraftFilterCorrections.kt */
/* loaded from: classes17.dex */
public final class ssd {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;

    public ssd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssd)) {
            return false;
        }
        ssd ssdVar = (ssd) obj;
        return Float.compare(this.a, ssdVar.a) == 0 && Float.compare(this.b, ssdVar.b) == 0 && Float.compare(this.c, ssdVar.c) == 0 && Float.compare(this.d, ssdVar.d) == 0 && Float.compare(this.e, ssdVar.e) == 0 && Float.compare(this.f, ssdVar.f) == 0 && Float.compare(this.g, ssdVar.g) == 0 && Float.compare(this.h, ssdVar.h) == 0 && Float.compare(this.i, ssdVar.i) == 0 && Float.compare(this.j, ssdVar.j) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftFilterCorrections(exposure=");
        sb.append(this.a);
        sb.append(", brightness=");
        sb.append(this.b);
        sb.append(", contrast=");
        sb.append(this.c);
        sb.append(", saturation=");
        sb.append(this.d);
        sb.append(", temperature=");
        sb.append(this.e);
        sb.append(", shadow=");
        sb.append(this.f);
        sb.append(", highlight=");
        sb.append(this.g);
        sb.append(", sharpness=");
        sb.append(this.h);
        sb.append(", grain=");
        sb.append(this.i);
        sb.append(", blur=");
        return xq.c(')', this.j, sb);
    }

    public ssd(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
    }

    public /* synthetic */ ssd(int i) {
        this(0.5f, 0.5f, 0.5f, 0.5f, 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
