package xsna;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* compiled from: EncodedPayload.java */
/* loaded from: classes.dex */
public final class uip {
    public final ijp a;
    public final byte[] b;

    public uip(@NonNull ijp ijpVar, @NonNull byte[] bArr) {
        if (ijpVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = ijpVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uip)) {
            return false;
        }
        uip uipVar = (uip) obj;
        if (this.a.equals(uipVar.a)) {
            return Arrays.equals(this.b, uipVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
