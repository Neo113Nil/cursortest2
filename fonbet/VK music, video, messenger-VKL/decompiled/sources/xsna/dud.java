package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClipsDraftVideoTransform.kt */
/* loaded from: classes17.dex */
public final class dud {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final Float e;
    public final Float f;

    public dud() {
        this(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dud)) {
            return false;
        }
        dud dudVar = (dud) obj;
        return this.a == dudVar.a && Float.compare(this.b, dudVar.b) == 0 && Float.compare(this.c, dudVar.c) == 0 && Float.compare(this.d, dudVar.d) == 0 && epx.f(this.e, dudVar.e) && epx.f(this.f, dudVar.f);
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        Float f = this.e;
        int hashCode = (a + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftVideoTransform(rotation=");
        sb.append(this.a);
        sb.append(", translationX=");
        sb.append(this.b);
        sb.append(", translationY=");
        sb.append(this.c);
        sb.append(", aspectRatio=");
        sb.append(this.d);
        sb.append(", relationWidth=");
        sb.append(this.e);
        sb.append(", originalRelationWidth=");
        return so.b(sb, this.f, ')');
    }

    public dud(int i, float f, float f2, float f3, Float f4, Float f5) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }
}
