package xsna;

/* compiled from: ClipsDraftAudioConfig.kt */
/* loaded from: classes17.dex */
public final class urd {
    public final int a;
    public final int b;

    public urd() {
        this(44100, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urd)) {
            return false;
        }
        urd urdVar = (urd) obj;
        return this.a == urdVar.a && this.b == urdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftAudioConfig(sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        return vu5.b(sb, this.b, ')');
    }

    public urd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
