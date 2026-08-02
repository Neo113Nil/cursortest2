package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class mp2 {
    public final nx0 a;
    public final s51 b;
    public final long c;
    public final List d;
    public final qm2 e;

    public mp2(nx0 nx0Var, s51 s51Var, ly2 ly2Var, ArrayList arrayList) {
        ni.a(!s51Var.isEmpty());
        this.a = nx0Var;
        this.b = s51.a((Collection) s51Var);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = ly2Var.a(this);
        this.c = ly2Var.a();
    }

    public abstract String c();

    public abstract i30 d();

    public abstract qm2 e();

    public final qm2 f() {
        return this.e;
    }
}
