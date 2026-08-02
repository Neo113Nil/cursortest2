package xsna;

import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;

/* compiled from: OverlayBannerFullscreenState.kt */
/* loaded from: classes7.dex */
public final class g290 {
    public final AboutVideoItem.q.b a;
    public final boolean b;
    public final boolean c;

    public g290(AboutVideoItem.q.b bVar, boolean z, boolean z2) {
        this.a = bVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g290)) {
            return false;
        }
        g290 g290Var = (g290) obj;
        return epx.f(this.a, g290Var.a) && this.b == g290Var.b && this.c == g290Var.c;
    }

    public final int hashCode() {
        AboutVideoItem.q.b bVar = this.a;
        return Boolean.hashCode(this.c) + qoy.b((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayBannerFullscreenState(banner=");
        sb.append(this.a);
        sb.append(", isLandscape=");
        sb.append(this.b);
        sb.append(", canShow=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
