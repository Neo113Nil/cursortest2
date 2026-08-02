package xsna;

import android.os.Trace;

/* compiled from: StatProxyChainCall.kt */
/* loaded from: classes.dex */
public final class rsk0<T> extends ara<T> {
    public final String b;
    public final long c;
    public final ara<T> d;

    public rsk0(wy2 wy2Var, String str, long j, ara araVar) {
        super(wy2Var);
        this.b = str;
        this.c = j;
        this.d = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        boolean e = ndp0.e();
        if (e) {
            ndp0.b("VKApi " + this.b);
        }
        try {
            return this.d.a(zqaVar);
        } finally {
            if (e) {
                Trace.endSection();
            }
        }
    }
}
