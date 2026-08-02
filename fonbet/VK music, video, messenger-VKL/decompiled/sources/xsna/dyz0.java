package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class dyz0 implements nzz0 {
    public final Object a;
    public final Object b;

    public /* synthetic */ dyz0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // xsna.nzz0
    public void a(String str, long j, int i, @Nullable Object obj, long j2, long j3) {
        int i2;
        nzz0 nzz0Var = (nzz0) this.a;
        if (nzz0Var != null) {
            if (i == 2001) {
                zyz0 zyz0Var = (zyz0) this.b;
                zyz0Var.a.c("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(zyz0Var.i));
                Iterator it = zyz0Var.h.a.i.iterator();
                while (it.hasNext()) {
                    ((lvf0.a) it.next()).m();
                }
                i2 = 2001;
            } else {
                i2 = i;
            }
            nzz0Var.a(str, j, i2, obj, j2, j3);
        }
    }

    @Override // xsna.nzz0
    public void b(long j, long j2, long j3, String str) {
        nzz0 nzz0Var = (nzz0) this.a;
        if (nzz0Var != null) {
            nzz0Var.b(j, j2, j3, str);
        }
    }

    public void c(rfc rfcVar, KSerializer kSerializer) {
        ((ArrayList) this.b).add(new Pair(rfcVar, kSerializer));
    }

    public dyz0(zyz0 zyz0Var, nzz0 nzz0Var) {
        this.a = nzz0Var;
        Objects.requireNonNull(zyz0Var);
        this.b = zyz0Var;
    }

    public dyz0() {
        this.a = new AtomicReference();
        this.b = new zk3();
    }

    public dyz0(rfc rfcVar) {
        this.a = rfcVar;
        this.b = new ArrayList();
    }
}
