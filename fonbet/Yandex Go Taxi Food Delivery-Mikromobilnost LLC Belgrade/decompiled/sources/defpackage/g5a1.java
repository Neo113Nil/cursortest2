package defpackage;

import com.google.android.gms.internal.play_billing.p;
import com.google.android.gms.internal.play_billing.zzji;

/* loaded from: classes.dex */
public abstract class g5a1 extends ov91 {
    public final p a;
    public p b;

    public g5a1(p pVar) {
        this.a = pVar;
        if (pVar.e()) {
            ny61.g("Default instance must be immutable.");
            throw null;
        }
        this.b = (p) pVar.g(4);
    }

    @Override // defpackage.ov91
    /* renamed from: b */
    public final g5a1 clone() {
        g5a1 g5a1Var = (g5a1) this.a.g(5);
        boolean e = this.b.e();
        p pVar = this.b;
        if (e) {
            pVar.m();
            pVar = this.b;
        }
        g5a1Var.b = pVar;
        return g5a1Var;
    }

    @Override // defpackage.ov91
    public final p c() {
        boolean e = this.b.e();
        p pVar = this.b;
        if (!e) {
            return pVar;
        }
        pVar.m();
        return this.b;
    }

    @Override // defpackage.ov91
    public final Object clone() {
        g5a1 g5a1Var = (g5a1) this.a.g(5);
        boolean e = this.b.e();
        p pVar = this.b;
        if (e) {
            pVar.m();
            pVar = this.b;
        }
        g5a1Var.b = pVar;
        return g5a1Var;
    }

    public final p d() {
        boolean e = this.b.e();
        p pVar = this.b;
        if (e) {
            pVar.m();
            pVar = this.b;
        }
        if (p.q(pVar, true)) {
            return pVar;
        }
        throw new zzji();
    }

    public final void e() {
        if (this.b.e()) {
            return;
        }
        p pVar = (p) this.a.g(4);
        xea1.c.a(pVar.getClass()).f(pVar, this.b);
        this.b = pVar;
    }
}
