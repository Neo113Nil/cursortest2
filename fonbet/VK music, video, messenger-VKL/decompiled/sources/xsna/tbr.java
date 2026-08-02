package xsna;

import androidx.compose.foundation.layout.Direction;

/* compiled from: Size.kt */
/* loaded from: classes11.dex */
final class tbr extends d730<ubr> {
    public final Direction a;
    public final float b;

    public tbr(Direction direction, float f) {
        this.a = direction;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbr)) {
            return false;
        }
        tbr tbrVar = (tbr) obj;
        return this.a == tbrVar.a && this.b == tbrVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // xsna.d730
    public final ubr r() {
        ubr ubrVar = new ubr();
        ubrVar.p = this.a;
        ubrVar.q = this.b;
        return ubrVar;
    }

    @Override // xsna.d730
    public final void s(ubr ubrVar) {
        ubr ubrVar2 = ubrVar;
        ubrVar2.p = this.a;
        ubrVar2.q = this.b;
    }
}
