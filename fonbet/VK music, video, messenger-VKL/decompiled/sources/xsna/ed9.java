package xsna;

import com.vk.dto.common.id.UserId;
import xsna.dd9;
import xsna.yre0;

/* compiled from: CallsQueueImpl.kt */
/* loaded from: classes11.dex */
public final class ed9 implements cd9 {
    public final yre0 a;
    public final vre0 b;
    public final int c;

    public ed9(yre0 yre0Var, vre0 vre0Var, int i) {
        this.a = yre0Var;
        this.b = vre0Var;
        this.c = i;
    }

    @Override // xsna.cd9
    public final void a() {
        yre0.a.b bVar = yre0.a.b.c;
        ure0 a = this.a.a(yre0.a.b.C4134a.a());
        bww0 bww0Var = a instanceof bww0 ? (bww0) a : null;
        if (bww0Var != null) {
            bww0Var.a(yre0.a.b.C4134a.a());
        }
    }

    @Override // xsna.cd9
    public final io.reactivex.rxjava3.core.q b(ey0 ey0Var, eb ebVar) {
        return vre0.a(this.a.b(new yre0.a.b(ey0Var, ebVar)), new ut2((UserId) ey0Var.invoke(), this.c), null, 14);
    }

    @Override // xsna.cd9
    public final io.reactivex.rxjava3.core.q<String> c() {
        yre0.a.b bVar = yre0.a.b.c;
        ure0 a = this.a.a(yre0.a.b.C4134a.a());
        bww0 bww0Var = a instanceof bww0 ? (bww0) a : null;
        return bww0Var != null ? bww0Var.b() : io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    @Override // xsna.cd9
    public final io.reactivex.rxjava3.core.q<dd9.a> d(UserId userId) {
        dd9 dd9Var = new dd9(userId, this.c, 1);
        if (o25.a().a(userId)) {
            return vre0.a(this.b, dd9Var, null, 14);
        }
        return vre0.a(this.a.b(new yre0.a.C4133a(new xis(userId, 20))), dd9Var, null, 14);
    }
}
