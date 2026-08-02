package xsna;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zp9 implements Runnable {
    public final /* synthetic */ WorkDatabase b;
    public final /* synthetic */ String c;
    public final /* synthetic */ dwx0 d;

    public /* synthetic */ zp9(WorkDatabase workDatabase, String str, dwx0 dwx0Var) {
        this.b = workDatabase;
        this.c = str;
        this.d = dwx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.b.D().n(this.c).iterator();
        while (it.hasNext()) {
            eq9.a((String) it.next(), this.d);
        }
    }
}
