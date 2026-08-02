package defpackage;

/* loaded from: classes7.dex */
public final class mp81 {
    public static final mp81 e = new mp81(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public mp81(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = rf71.z(i3) ? rf71.b(i3, i2) : -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return oyr.s(sb, this.c, ']');
    }
}
