package xsna;

import xsna.aup0;
import xsna.dbg0;

/* compiled from: CallbackWrapper.java */
/* loaded from: classes11.dex */
public final class xb9 implements Runnable {
    public final /* synthetic */ aup0.a b;
    public final /* synthetic */ int c;

    public xb9(aup0.a aVar, int i) {
        this.b = aVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbg0.c cVar = this.b.a;
        if (cVar != null) {
            cVar.b(this.c);
        }
    }
}
