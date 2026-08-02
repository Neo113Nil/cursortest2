package xsna;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class qh01 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq e;
    public final /* synthetic */ yh01 f;

    public qh01(yh01 yh01Var, AtomicReference atomicReference, String str, String str2, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this.f = yh01Var;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        this.e = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        yh01 yh01Var;
        v701 v701Var;
        synchronized (this.b) {
            try {
                try {
                    yh01Var = this.f;
                    v701Var = yh01Var.g;
                } catch (RemoteException e) {
                    k901 k901Var = ((mb01) this.f.b).j;
                    mb01.k(k901Var);
                    k901Var.i.d("(legacy) Failed to get conditional properties; remote exception", null, this.c, e);
                    this.b.set(Collections.EMPTY_LIST);
                    atomicReference = this.b;
                }
                if (v701Var == null) {
                    k901 k901Var2 = ((mb01) yh01Var.b).j;
                    mb01.k(k901Var2);
                    k901Var2.i.d("(legacy) Failed to get conditional properties; not connected to service", null, this.c, this.d);
                    this.b.set(Collections.EMPTY_LIST);
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    this.b.set(v701Var.l0(this.c, this.d, this.e));
                } else {
                    this.b.set(v701Var.N0(null, this.c, this.d));
                }
                this.f.v();
                atomicReference = this.b;
                atomicReference.notify();
            } finally {
                this.b.notify();
            }
        }
    }
}
