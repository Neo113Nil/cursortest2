package xsna;

import com.vk.dto.photo.Photo;

/* compiled from: MarketEditAlbumCoverViewState.kt */
/* loaded from: classes18.dex */
public final class lx00 implements fm50 {
    public final yzt0<Boolean> a;
    public final yzt0<zzo0> b;
    public final yzt0<Photo> c;
    public final yzt0<id00> d;

    public lx00(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
        this.a = h0u0Var;
        this.b = h0u0Var2;
        this.c = h0u0Var3;
        this.d = h0u0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx00)) {
            return false;
        }
        lx00 lx00Var = (lx00) obj;
        return epx.f(this.a, lx00Var.a) && epx.f(this.b, lx00Var.b) && epx.f(this.c, lx00Var.c) && epx.f(this.d, lx00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(isEditeMode=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", mainAndHidden=");
        return tr.c(sb, this.d, ')');
    }
}
