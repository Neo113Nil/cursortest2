package xsna;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class n901 implements Runnable {
    public final m901 b;
    public final int c;
    public final Throwable d;
    public final byte[] e;
    public final String f;
    public final Map g;

    public /* synthetic */ n901(String str, m901 m901Var, int i, IOException iOException, byte[] bArr, Map map) {
        exc0.i(m901Var);
        this.b = m901Var;
        this.c = i;
        this.d = iOException;
        this.e = bArr;
        this.f = str;
        this.g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e(this.f, this.c, this.d, this.e, this.g);
    }
}
