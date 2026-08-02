package androidx.compose.ui.contentcapture;

import defpackage.fv31;
import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes10.dex */
public final class b {
    public final int a;
    public final long b;
    public final ContentCaptureEventType c;
    public final fv31 d;

    public b(int i, long j, ContentCaptureEventType contentCaptureEventType, fv31 fv31Var) {
        this.a = i;
        this.b = j;
        this.c = contentCaptureEventType;
        this.d = fv31Var;
    }

    public final int a() {
        return this.a;
    }

    public final fv31 b() {
        return this.d;
    }

    public final ContentCaptureEventType c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && jl40.l(this.d, bVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + qv10.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        fv31 fv31Var = this.d;
        return hashCode + (fv31Var == null ? 0 : fv31Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
