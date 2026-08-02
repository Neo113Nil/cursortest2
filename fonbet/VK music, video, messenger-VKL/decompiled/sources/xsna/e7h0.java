package xsna;

import java.util.concurrent.Callable;
import xsna.ext;
import xsna.j6h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class e7h0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e7h0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return new j6h0.a((x5h0) this.c);
            default:
                m6r0 m6r0Var = (m6r0) this.c;
                ext.b bVar = new ext.b();
                bVar.a = m6r0Var;
                return bVar;
        }
    }
}
