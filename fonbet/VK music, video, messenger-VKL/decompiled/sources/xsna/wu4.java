package xsna;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: AudioRecordDraft.kt */
/* loaded from: classes2.dex */
public final class wu4 {
    public final Uri a;
    public final byte[] b;
    public final long c;

    public wu4(Uri uri, byte[] bArr, long j) {
        this.a = uri;
        this.b = bArr;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu4)) {
            return false;
        }
        wu4 wu4Var = (wu4) obj;
        return epx.f(this.a, wu4Var.a) && epx.f(this.b, wu4Var.b) && this.c == wu4Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioRecordDraft(source=");
        sb.append(this.a);
        sb.append(", waveData=");
        sb.append(Arrays.toString(this.b));
        sb.append(", durationSec=");
        return vu5.a(')', this.c, sb);
    }
}
