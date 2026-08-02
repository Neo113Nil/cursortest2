package xsna;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes8.dex */
public final class vlb extends tlb implements ewf<Character> {
    static {
        new vlb((char) 1, (char) 0);
    }

    @Override // xsna.ewf
    public final boolean b(Character ch) {
        char charValue = ch.charValue();
        return epx.g(this.b, charValue) <= 0 && epx.g(charValue, this.c) <= 0;
    }

    @Override // xsna.ewf
    public final Character c() {
        return Character.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vlb)) {
            return false;
        }
        if (isEmpty() && ((vlb) obj).isEmpty()) {
            return true;
        }
        vlb vlbVar = (vlb) obj;
        return this.b == vlbVar.b && this.c == vlbVar.c;
    }

    @Override // xsna.ewf
    public final Character getStart() {
        return Character.valueOf(this.b);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.b * 31) + this.c;
    }

    @Override // xsna.ewf
    public final boolean isEmpty() {
        return epx.g(this.b, this.c) > 0;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
