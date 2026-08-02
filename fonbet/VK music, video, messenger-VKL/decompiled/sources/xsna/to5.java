package xsna;

import java.util.ArrayList;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class to5 {
    public final Long a;
    public final boolean b;
    public final bc90 c;
    public final mc90 d;
    public final ka5 e;
    public final if2<Float, ?> f;
    public final ArrayList g;
    public final boolean h;

    public to5(Long l, boolean z, bc90 bc90Var, mc90 mc90Var, ka5 ka5Var, if2 if2Var, ArrayList arrayList, boolean z2) {
        this.a = l;
        this.b = z;
        this.c = bc90Var;
        this.d = mc90Var;
        this.e = ka5Var;
        this.f = if2Var;
        this.g = arrayList;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to5)) {
            return false;
        }
        to5 to5Var = (to5) obj;
        return epx.f(this.a, to5Var.a) && this.b == to5Var.b && this.c.equals(to5Var.c) && epx.f(this.d, to5Var.d) && epx.f(this.e, to5Var.e) && epx.f(this.f, to5Var.f) && this.g.equals(to5Var.g) && this.h == to5Var.h;
    }

    public final int hashCode() {
        Long l = this.a;
        return Boolean.hashCode(this.h) + qr.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + qoy.b(bh10.a((l == null ? 0 : l.hashCode()) * 31, 31, 6000L), 31, this.b)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoplayEffectParams(autoSwitchDurationMillis=");
        sb.append(this.a);
        sb.append(", scaleAnimationDurationMillis=6000, liveCoverPlaybackVisible=");
        sb.append(this.b);
        sb.append(", pagerSettings=");
        sb.append(this.c);
        sb.append(", pagerState=");
        sb.append(this.d);
        sb.append(", paginationCallbacks=");
        sb.append(this.e);
        sb.append(", progress=");
        sb.append(this.f);
        sb.append(", mediaItems=");
        kr.d(this.g, sb, ", isManualVideoPlaybackActive=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
