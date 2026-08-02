package xsna;

import com.google.android.gms.measurement.internal.zzaw;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class wc01 implements Runnable {
    public final /* synthetic */ zzaw b;
    public final /* synthetic */ String c;
    public final /* synthetic */ cd01 d;

    public wc01(cd01 cd01Var, zzaw zzawVar, String str) {
        this.d = cd01Var;
        this.b = zzawVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cd01 cd01Var = this.d;
        cd01Var.a.a();
        cd01Var.a.k(this.b, this.c);
    }
}
