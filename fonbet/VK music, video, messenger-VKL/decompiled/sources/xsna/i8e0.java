package xsna;

import com.vk.dto.hints.Hint;
import kotlin.Lazy;

/* compiled from: ProtectUserInfoRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class i8e0 implements e8e0, j8e0 {
    public final Lazy<h7v> a;
    public final io.reactivex.rxjava3.subjects.d<s3q0> b = io.reactivex.rxjava3.subjects.d.N0();

    /* JADX WARN: Multi-variable type inference failed */
    public i8e0(Lazy<? extends h7v> lazy) {
        this.a = lazy;
    }

    @Override // xsna.j8e0
    public final void a() {
        this.b.onNext(s3q0.a);
    }

    @Override // xsna.e8e0
    public final io.reactivex.rxjava3.core.q<Hint> b() {
        h8e0 h8e0Var = new h8e0(new j5b0(this, 5), 0);
        io.reactivex.rxjava3.subjects.d<s3q0> dVar = this.b;
        dVar.getClass();
        io.reactivex.rxjava3.internal.operators.mixed.o oVar = new io.reactivex.rxjava3.internal.operators.mixed.o(dVar, h8e0Var);
        Hint p = this.a.getValue().p("feed:after_auth:unban_security_recommendation");
        return oVar.o0(p != null ? io.reactivex.rxjava3.core.x.k(p) : io.reactivex.rxjava3.internal.operators.single.a0.b);
    }

    @Override // xsna.e8e0
    public final void c() {
        this.a.getValue().u();
    }
}
