package xsna;

/* compiled from: FakeContact.kt */
/* loaded from: classes2.dex */
public final class kjq implements b8j {
    public final CharSequence b;
    public final long c;
    public final int d;

    public kjq(CharSequence charSequence) {
        long hashCode = charSequence.hashCode();
        this.b = charSequence;
        this.c = hashCode;
        this.d = 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjq)) {
            return false;
        }
        kjq kjqVar = (kjq) obj;
        return epx.f(this.b, kjqVar.b) && this.c == kjqVar.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    @Override // xsna.b8j
    public final CharSequence getName() {
        return this.b;
    }

    @Override // xsna.etx0
    public final int getType() {
        return this.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qoy.b(this.b.hashCode() * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeContact(phone=");
        sb.append((Object) this.b);
        sb.append(", isSelected=false, id=");
        return vu5.a(')', this.c, sb);
    }
}
