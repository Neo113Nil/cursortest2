package xsna;

import java.util.function.Supplier;
import xsna.yl80;

/* compiled from: OneVideoLoadControlProxyBuilder.kt */
/* loaded from: classes8.dex */
public final class cm80 {
    public final yl80.a a = new yl80.a();

    public final yl80 a() {
        yl80.a aVar = this.a;
        fxc0.z(!aVar.i);
        aVar.i = true;
        if (aVar.b == null) {
            aVar.b = new z9l(65536);
        }
        return new yl80(aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.a, aVar.j);
    }

    public final void b(Supplier supplier) {
        yl80.a aVar = this.a;
        fxc0.z(!aVar.i);
        aVar.j = supplier;
    }
}
