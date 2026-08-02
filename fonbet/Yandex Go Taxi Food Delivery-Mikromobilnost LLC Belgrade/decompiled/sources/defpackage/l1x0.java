package defpackage;

import android.os.Handler;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;

/* loaded from: classes8.dex */
public final class l1x0 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object w;
    public Object x;

    public /* synthetic */ l1x0(j5b1 j5b1Var, zzr zzrVar, boolean z, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.a = i;
        this.c = zzrVar;
        this.b = z;
        this.w = abstractSafeParcelable;
        this.x = j5b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                synchronized (((Handler) this.c)) {
                    this.x = ((m1x0) this.w).run();
                    this.b = true;
                    ((Handler) this.c).notifyAll();
                }
                return;
            case 1:
                j5b1 j5b1Var = (j5b1) this.x;
                zzgb zzgbVar = j5b1Var.x;
                if (zzgbVar != null) {
                    j5b1Var.Yg(zzgbVar, this.b ? null : (zzpl) this.w, (zzr) this.c);
                    j5b1Var.Tg();
                    return;
                } else {
                    y1a1 y1a1Var = ((g) j5b1Var.b).y;
                    g.g(y1a1Var);
                    y1a1Var.z.a("Discarding data. Failed to set user property");
                    return;
                }
            default:
                j5b1 j5b1Var2 = (j5b1) this.x;
                zzgb zzgbVar2 = j5b1Var2.x;
                if (zzgbVar2 == null) {
                    y1a1 y1a1Var2 = ((g) j5b1Var2.b).y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.a("Discarding data. Failed to send event to service");
                    return;
                } else {
                    j5b1Var2.Yg(zzgbVar2, this.b ? null : (zzbg) this.w, (zzr) this.c);
                    j5b1Var2.Tg();
                    return;
                }
        }
    }

    public l1x0(Handler handler, m1x0 m1x0Var) {
        this.a = 0;
        this.c = handler;
        this.w = m1x0Var;
    }
}
