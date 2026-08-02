package defpackage;

import com.google.android.gms.measurement.internal.g;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m7b1 implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ rfw0 c;

    public m7b1(rfw0 rfw0Var, long j, long j2) {
        Objects.requireNonNull(rfw0Var);
        this.c = rfw0Var;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aaa1 aaa1Var = ((g) ((m8b1) this.c.b).b).z;
        g.g(aaa1Var);
        aaa1Var.Pg(new h7b1(0, this));
    }
}
