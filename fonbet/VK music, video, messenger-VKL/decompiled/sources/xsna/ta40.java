package xsna;

import java.util.List;

/* compiled from: MusicAudioMeta.kt */
/* loaded from: classes18.dex */
public final class ta40 {
    public final String a;
    public final List<Integer> b;
    public final int c;

    public ta40(String str, List<Integer> list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta40)) {
            return false;
        }
        ta40 ta40Var = (ta40) obj;
        return epx.f(this.a, ta40Var.a) && epx.f(this.b, ta40Var.b) && this.c == ta40Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicAudioMeta(url=");
        sb.append(this.a);
        sb.append(", waveform=");
        sb.append(this.b);
        sb.append(", startPosition=");
        return vu5.b(sb, this.c, ')');
    }
}
