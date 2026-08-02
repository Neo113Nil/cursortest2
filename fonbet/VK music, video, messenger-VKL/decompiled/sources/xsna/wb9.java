package xsna;

import android.graphics.Typeface;
import xsna.aup0;
import xsna.dbg0;

/* compiled from: CallbackWrapper.java */
/* loaded from: classes11.dex */
public final class wb9 implements Runnable {
    public final /* synthetic */ aup0.a b;
    public final /* synthetic */ Typeface c;

    public wb9(aup0.a aVar, Typeface typeface) {
        this.b = aVar;
        this.c = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbg0.c cVar = this.b.a;
        if (cVar != null) {
            cVar.c(this.c);
        }
    }
}
