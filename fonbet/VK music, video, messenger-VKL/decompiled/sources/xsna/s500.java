package xsna;

import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* compiled from: LongRational.java */
/* loaded from: classes11.dex */
public final class s500 {
    public final long a;
    public final long b;

    public s500(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @NonNull
    public final String toString() {
        return this.a + DomExceptionUtils.SEPARATOR + this.b;
    }
}
