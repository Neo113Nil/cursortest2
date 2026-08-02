package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.colorgrading.a;

/* compiled from: GLColorGradingParams.kt */
/* loaded from: classes4.dex */
public final class n1t {
    public static final bpn0 m = new bpn0(new com.vk.movika.sdk.base.model.props.c(14));
    public static final f2t n = new f2t(-1.0f, -1.0f, -1);
    public final o1t a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final a.C1454a k;
    public final a.b l;

    public n1t(o1t o1tVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, a.C1454a c1454a, a.b bVar) {
        this.a = o1tVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = c1454a;
        this.l = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1t)) {
            return false;
        }
        n1t n1tVar = (n1t) obj;
        return epx.f(this.a, n1tVar.a) && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(this.b, n1tVar.b) == 0 && Float.compare(this.c, n1tVar.c) == 0 && Float.compare(this.d, n1tVar.d) == 0 && Float.compare(this.e, n1tVar.e) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(this.f, n1tVar.f) == 0 && Float.compare(this.g, n1tVar.g) == 0 && Float.compare(this.h, n1tVar.h) == 0 && Float.compare(this.i, n1tVar.i) == 0 && Float.compare(this.j, n1tVar.j) == 0 && epx.f(this.k, n1tVar.k) && epx.f(this.l, n1tVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.j, io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GLColorGradingParams(textures=");
        sb.append(this.a);
        sb.append(", exposure=0.0, brightness=");
        sb.append(this.b);
        sb.append(", contrast=");
        gq.h(sb, this.c, ", saturation=", this.d, ", temperature=");
        gq.h(sb, this.e, ", colorBalance=0.0, sharpness=", this.f, ", grain=");
        gq.h(sb, this.g, ", vignette=", this.h, ", lights=");
        gq.h(sb, this.i, ", darks=", this.j, ", hsl=");
        sb.append(this.k);
        sb.append(", tone=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
