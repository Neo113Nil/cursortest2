package defpackage;

import okhttp3.OkHttpClient;
import ru.yandex.taxi.controller.b;

/* loaded from: classes5.dex */
public final class am41 {
    public final hit a;
    public final tt2 b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final mzz f = new mzz(1);

    public am41(hit hitVar, tt2 tt2Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = hitVar;
        this.b = tt2Var;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
    }

    public final synchronized b a(String str) {
        b bVar;
        bVar = (b) this.f.c(str);
        if (bVar == null) {
            b bVar2 = new b(this.a, this.b, (OkHttpClient) this.c.get(), (j5z) this.d.get(), (h7u0) this.e.get(), str);
            this.f.d(str, bVar2);
            bVar = bVar2;
        }
        return bVar;
    }
}
