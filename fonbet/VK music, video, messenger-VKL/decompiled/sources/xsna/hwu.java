package xsna;

import xsna.dz40;
import xsna.gfp0;

/* compiled from: RedesignHeaderBlock.kt */
/* loaded from: classes3.dex */
public final class hwu {
    public final dz40.t a;
    public final gfp0.b b;
    public final f3b0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public hwu(dz40.t tVar, gfp0.b bVar, f3b0 f3b0Var, boolean z, boolean z2, boolean z3) {
        this.a = tVar;
        this.b = bVar;
        this.c = f3b0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwu)) {
            return false;
        }
        hwu hwuVar = (hwu) obj;
        return epx.f(this.a, hwuVar.a) && epx.f(this.b, hwuVar.b) && epx.f(this.c, hwuVar.c) && this.d == hwuVar.d && this.e == hwuVar.e && this.f == hwuVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderBlockData(render=");
        sb.append(this.a);
        sb.append(", currentTrackData=");
        sb.append(this.b);
        sb.append(", screenState=");
        sb.append(this.c);
        sb.append(", canGoForward=");
        sb.append(this.d);
        sb.append(", isPlaying=");
        sb.append(this.e);
        sb.append(", canAdd=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
