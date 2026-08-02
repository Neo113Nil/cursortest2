package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.n;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.a;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class i3a1 extends hv20 implements sv4 {
    public final boolean y;

    static {
        new tv4();
    }

    public i3a1(uv4 uv4Var, yra1 yra1Var, Executor executor, n nVar) {
        super(yra1Var, executor);
        boolean d = e891.d();
        this.y = d;
        slb1 slb1Var = new slb1();
        slb1Var.b = e891.a(uv4Var);
        cmb1 cmb1Var = new cmb1(slb1Var);
        ekb1 ekb1Var = new ekb1();
        ekb1Var.c = d ? zzra.TYPE_THICK : zzra.TYPE_THIN;
        ekb1Var.d = cmb1Var;
        a.c().execute(new kz(nVar, new o3(ekb1Var, 1), zzrc.ON_DEVICE_BARCODE_CREATE, nVar.c(), 18));
    }

    @Override // defpackage.t9j
    public final int Q2() {
        return 1;
    }

    @Override // defpackage.ag70
    public final Feature[] a() {
        return this.y ? bg70.a : new Feature[]{bg70.b};
    }

    @Override // defpackage.hv20, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
    }

    public final Task d(mk20 mk20Var) {
        zzw o;
        synchronized (this) {
            if (this.a.get()) {
                o = udq0.o(new MlKitException("This detector is already closed!", 14));
            } else if (mk20Var.b < 32 || mk20Var.c < 32) {
                o = udq0.o(new MlKitException("MlImage width and height should be at least 32!", 3));
            } else {
                synchronized (mk20Var) {
                    mk20Var.w++;
                }
                o = this.b.a(this.w, new hhe0(2, this, mk20Var), this.c.a);
                o.b(new sl81(mk20Var));
            }
        }
        return o.p(new egz(this, mk20Var.b, mk20Var.c));
    }
}
