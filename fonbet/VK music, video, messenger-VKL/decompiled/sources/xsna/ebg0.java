package xsna;

import android.graphics.Typeface;
import xsna.dbg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ebg0 implements Runnable {
    public final /* synthetic */ dbg0.c b;
    public final /* synthetic */ Typeface c;

    public /* synthetic */ ebg0(dbg0.c cVar, Typeface typeface) {
        this.b = cVar;
        this.c = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c(this.c);
    }
}
