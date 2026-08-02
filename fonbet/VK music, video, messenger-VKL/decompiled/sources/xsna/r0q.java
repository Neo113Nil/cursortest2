package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* compiled from: EventStream.java */
/* loaded from: classes12.dex */
public final class r0q {
    public final g0q[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public r0q(String str, String str2, long[] jArr, g0q[] g0qVarArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = g0qVarArr;
    }

    public final String a() {
        return this.c + DomExceptionUtils.SEPARATOR + this.d;
    }
}
