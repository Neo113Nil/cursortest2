package xsna;

import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class cr01 implements Runnable {
    public final /* synthetic */ ds01 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public cr01(nr01 nr01Var, ds01 ds01Var, String str, String str2) {
        this.b = ds01Var;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz9.d dVar;
        ds01 ds01Var = this.b;
        synchronized (ds01Var.e) {
            dVar = (dz9.d) ds01Var.e.get(this.c);
        }
        if (dVar != null) {
            dVar.a(this.d);
        } else {
            ds01.u.a("Discarded message for unknown namespace '%s'", this.c);
        }
    }
}
