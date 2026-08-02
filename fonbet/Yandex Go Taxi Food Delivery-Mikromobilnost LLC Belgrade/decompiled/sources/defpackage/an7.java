package defpackage;

import androidx.camera.camera2.internal.b;
import com.squareup.wire.internal.MathMethodsKt;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final class an7 {
    public final int a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final b d;
    public final zy2 e;
    public final boolean f;
    public long g = MathMethodsKt.NANOS_PER_SECOND;
    public final ArrayList h = new ArrayList();
    public final ym7 i = new ym7(this);

    public an7(int i, androidx.camera.core.impl.utils.executor.b bVar, k6u k6uVar, b bVar2, boolean z, zy2 zy2Var) {
        this.a = i;
        this.b = bVar;
        this.c = k6uVar;
        this.d = bVar2;
        this.f = z;
        this.e = zy2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final euy a(int i) {
        boolean isEmpty = this.h.isEmpty();
        hiv hivVar = hiv.c;
        if (isEmpty) {
            return hivVar;
        }
        if (this.i.b()) {
            cn7 cn7Var = new cn7(null);
            b bVar = this.d;
            bVar.r(cn7Var);
            nm7 nm7Var = new nm7(4, bVar, cn7Var);
            androidx.camera.core.impl.utils.executor.b bVar2 = bVar.c;
            gl7 gl7Var = cn7Var.b;
            gl7Var.b.c(nm7Var, bVar2);
            hivVar = gl7Var;
        }
        jqs a = jqs.a(hivVar);
        jy4 jy4Var = new jy4(this, i, 2);
        Executor executor = this.b;
        return ni91.n(ni91.n(a, jy4Var, executor), new m6(26, this), executor);
    }
}
