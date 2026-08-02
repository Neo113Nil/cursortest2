package defpackage;

import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class g10 {
    public final j1 a;
    public final qa3 b;

    public g10(j1 j1Var) {
        this.a = j1Var;
        a10 a10Var = new a10(0);
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = new qa3(new lb7(9, y5e.b, a10Var), new lum(new zbd(5), b10.a, new p0(11), c10.a), new lum(new zbd(4), e10.a, new y4(13, this), f10.a));
    }

    public final qa3 a() {
        return this.b;
    }
}
