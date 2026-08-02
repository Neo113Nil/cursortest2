package xsna;

/* compiled from: ChunkSettings.kt */
/* loaded from: classes.dex */
public final class jcc {
    public final int a;
    public final int b;

    public jcc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcc)) {
            return false;
        }
        jcc jccVar = (jcc) obj;
        return this.a == jccVar.a && this.b == jccVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChunkSettings(countChunk=");
        sb.append(this.a);
        sb.append(", maxChunkSize=");
        return vu5.b(sb, this.b, ')');
    }

    public jcc(int i) {
        this.a = 4;
        this.b = 4194304;
    }
}
