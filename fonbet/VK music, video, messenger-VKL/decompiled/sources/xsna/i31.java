package xsna;

import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;

/* compiled from: AdvertBannerFullscreenState.kt */
/* loaded from: classes7.dex */
public final class i31 {
    public final AboutVideoItem.c.a a;
    public final boolean b;
    public final boolean c;

    public i31(AboutVideoItem.c.a aVar, boolean z, boolean z2) {
        this.a = aVar;
        this.b = z;
        this.c = z2;
    }

    public final AboutVideoItem.c.a a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i31)) {
            return false;
        }
        i31 i31Var = (i31) obj;
        return epx.f(this.a, i31Var.a) && this.b == i31Var.b && this.c == i31Var.c;
    }

    public final int hashCode() {
        AboutVideoItem.c.a aVar = this.a;
        return Boolean.hashCode(this.c) + qoy.b((aVar == null ? 0 : aVar.b.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvertBannerFullscreenState(banner=");
        sb.append(this.a);
        sb.append(", isLandscape=");
        sb.append(this.b);
        sb.append(", canShow=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
