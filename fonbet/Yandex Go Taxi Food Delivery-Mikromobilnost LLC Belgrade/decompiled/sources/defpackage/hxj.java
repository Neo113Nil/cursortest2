package defpackage;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.internal.mlkit_common.b;
import com.google.android.gms.internal.mlkit_vision_common.a;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.k;
import com.google.android.gms.internal.mlkit_vision_text_common.o;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzjd;
import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public final class hxj implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public hxj(zzjd zzjdVar, zzbg zzbgVar, String str) {
        this.a = 4;
        this.b = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                synchronized (((cyj) this.b)) {
                    try {
                        cyj cyjVar = (cyj) this.b;
                        if (cyjVar.B != null) {
                            cyjVar.D();
                            if (((cyj) this.b).d()) {
                                ((cyj) this.b).v();
                                ((cyj) this.b).D = 0;
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 1:
                ((Runnable) this.b).run();
                return null;
            case 2:
                db3 db3Var = (db3) this.b;
                db3Var.w.set(true);
                try {
                    Process.setThreadPriority(10);
                    db3Var.a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 3:
                return new hma1(((p8a1) this.b).E);
            case 4:
                zzjd zzjdVar = (zzjd) this.b;
                zzjdVar.zzL().w();
                f3a1 f3a1Var = zzjdVar.zzL().A;
                n.O(f3a1Var);
                f3a1Var.Gg();
                throw new IllegalStateException("Unexpected call on client side");
            case 5:
                return wcy.c.a(((a) this.b).g);
            case 6:
                return wcy.c.a(((com.google.android.gms.internal.mlkit_vision_face.n) this.b).g);
            case 7:
                return wcy.c.a(((b) this.b).a);
            case 8:
                return wcy.c.a(((k) this.b).g);
            case 9:
                return wcy.c.a(((o) this.b).g);
            default:
                return wcy.c.a(((com.google.android.gms.internal.mlkit_vision_barcode.n) this.b).g);
        }
    }

    public /* synthetic */ hxj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
