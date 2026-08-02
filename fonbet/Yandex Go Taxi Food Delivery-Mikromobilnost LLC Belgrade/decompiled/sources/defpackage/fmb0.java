package defpackage;

import java.util.List;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class fmb0 implements gmb0 {
    public final List a;
    public final Supplier b;
    public final String c;

    public fmb0(dmb0 dmb0Var) {
        this.a = dmb0Var.a;
        this.b = dmb0Var.b;
        this.c = dmb0Var.c;
    }

    @Override // defpackage.gmb0
    public final Supplier a() {
        return this.b;
    }

    @Override // defpackage.gmb0
    public final List b() {
        return this.a;
    }

    @Override // defpackage.gmb0
    public final gmb0 c() {
        return this;
    }

    @Override // defpackage.gmb0
    public final String d() {
        return this.c;
    }

    @Override // defpackage.gmb0
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
}
