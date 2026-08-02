package xsna;

import xsna.dz40;
import xsna.gfp0;

/* compiled from: PlayerContentView.kt */
/* loaded from: classes3.dex */
public final class ivs {
    public final dz40.t a;
    public final gfp0.b b;
    public final f3b0 c;
    public final int d;
    public final int e;
    public final dz40.c f;
    public final boolean g;
    public final boolean h;

    public ivs(dz40.t tVar, gfp0.b bVar, f3b0 f3b0Var, int i, int i2, dz40.c cVar, boolean z, boolean z2) {
        this.a = tVar;
        this.b = bVar;
        this.c = f3b0Var;
        this.d = i;
        this.e = i2;
        this.f = cVar;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivs)) {
            return false;
        }
        ivs ivsVar = (ivs) obj;
        return epx.f(this.a, ivsVar.a) && epx.f(this.b, ivsVar.b) && epx.f(this.c, ivsVar.c) && this.d == ivsVar.d && this.e == ivsVar.e && epx.f(this.f, ivsVar.f) && this.g == ivsVar.g && this.h == ivsVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b((this.f.hashCode() + shy.a(this.e, shy.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullMusicPlayerData(render=");
        sb.append(this.a);
        sb.append(", currentTrackData=");
        sb.append(this.b);
        sb.append(", screenState=");
        sb.append(this.c);
        sb.append(", playPositionSec=");
        sb.append(this.d);
        sb.append(", durationSec=");
        sb.append(this.e);
        sb.append(", audioPermissions=");
        sb.append(this.f);
        sb.append(", canGoForward=");
        sb.append(this.g);
        sb.append(", isPlaying=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
