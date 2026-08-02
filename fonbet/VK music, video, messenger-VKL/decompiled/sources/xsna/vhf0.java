package xsna;

import xsna.gzf;

/* compiled from: RecordingParams.kt */
/* loaded from: classes3.dex */
public final class vhf0 {
    public final gzf.a a;
    public final gzf.c b;
    public final float c;

    public vhf0(gzf.a aVar, gzf.c cVar, float f) {
        this.a = aVar;
        this.b = cVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhf0)) {
            return false;
        }
        vhf0 vhf0Var = (vhf0) obj;
        return epx.f(this.a, vhf0Var.a) && epx.f(this.b, vhf0Var.b) && Float.compare(this.c, vhf0Var.c) == 0;
    }

    public final int hashCode() {
        gzf.a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        gzf.c cVar = this.b;
        return Float.hashCode(this.c) + ((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingParams(audio=");
        sb.append(this.a);
        sb.append(", video=");
        sb.append(this.b);
        sb.append(", speed=");
        return xq.c(')', this.c, sb);
    }
}
