package xsna;

import java.util.LinkedHashMap;
import xsna.v7s0;

/* compiled from: CacheRepository.kt */
/* loaded from: classes2.dex */
public final class mx8 {
    public final v7s0 a;

    public mx8(v7s0 v7s0Var) {
        this.a = v7s0Var;
    }

    public final io.reactivex.rxjava3.core.a a(ay8 ay8Var) {
        r7s0 r7s0Var = ay8Var.e;
        v7s0 v7s0Var = this.a;
        if (v7s0Var.f(r7s0Var)) {
            return new io.reactivex.rxjava3.internal.operators.completable.e(new mn6(this, ay8Var));
        }
        asu0.a.getClass();
        asu0.n().submit(new jx8(0, this, ay8Var));
        io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
        a aVar = new a(ay8Var, eVar);
        v7s0Var.c(r7s0Var, aVar);
        return new io.reactivex.rxjava3.internal.operators.completable.h(eVar, new kx8(this, ay8Var, aVar, 0));
    }

    /* compiled from: CacheRepository.kt */
    public static final class a implements v7s0.a {
        public final /* synthetic */ ay8 b;
        public final /* synthetic */ io.reactivex.rxjava3.subjects.e c;

        public a(ay8 ay8Var, io.reactivex.rxjava3.subjects.e eVar) {
            this.b = ay8Var;
            this.c = eVar;
        }

        @Override // xsna.v7s0.a
        public final void onInitialized() {
            io.reactivex.rxjava3.subjects.e eVar = this.c;
            try {
                io.reactivex.rxjava3.internal.operators.completable.e eVar2 = new io.reactivex.rxjava3.internal.operators.completable.e(new mn6(mx8.this, this.b));
                io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d();
                eVar2.subscribe(dVar);
                dVar.b();
                eVar.onComplete();
            } catch (Exception e) {
                eVar.onError(e);
            }
        }

        @Override // xsna.v7s0.a
        public final void a(LinkedHashMap linkedHashMap) {
        }
    }
}
