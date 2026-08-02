package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ghw0;
import xsna.jhw0;

/* compiled from: VoipCallMainMenuFeature.kt */
/* loaded from: classes7.dex */
public final class ihw0 {
    public final a a;
    public final io.reactivex.rxjava3.subjects.d<jhw0> b;
    public final io.reactivex.rxjava3.subjects.f<ghw0> c;
    public final boolean d;
    public final io.reactivex.rxjava3.subjects.f<v59> e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final b g;

    /* compiled from: VoipCallMainMenuFeature.kt */
    public static final class a {
        public final ze00 a;
        public final FragmentManager b;
        public final o59 c;
        public final p59 d;
        public final q59 e;
        public final r59 f;
        public final s59 g;

        public a(ze00 ze00Var, FragmentManager fragmentManager, o59 o59Var, p59 p59Var, q59 q59Var, r59 r59Var, s59 s59Var) {
            this.a = ze00Var;
            this.b = fragmentManager;
            this.c = o59Var;
            this.d = p59Var;
            this.e = q59Var;
            this.f = r59Var;
            this.g = s59Var;
        }
    }

    /* compiled from: VoipCallMainMenuFeature.kt */
    public static final class b extends FragmentManager.m {
        public b() {
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void b(FragmentManager fragmentManager, Fragment fragment) {
            ihw0.this.a(new ghw0.l(fragment));
        }
    }

    public ihw0(a aVar) {
        this.a = aVar;
        io.reactivex.rxjava3.subjects.d<jhw0> O0 = io.reactivex.rxjava3.subjects.d.O0(new jhw0.c(false, false, false, jhw0.f.a.a, EmptyList.b, new wrl0(this, 29)));
        this.b = O0;
        io.reactivex.rxjava3.subjects.f<ghw0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar;
        this.d = true;
        this.e = new io.reactivex.rxjava3.subjects.f<>();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.f = bVar;
        b bVar2 = new b();
        this.g = bVar2;
        asu0 asu0Var = asu0.a;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, fVar.a0(asu0Var.d()), null, new g2h0(14), new com.vk.voip.ui.menu.feature.a(this, 0)));
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = O0.a0(asu0Var.d());
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.y(a0, qVar, aVar2).b0(jhw0.b.class), new i4f0(new lcq0(7), 15)).subscribe(new dbu0(new lzl0(this, 20), 2)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.y(a0, qVar, aVar2).b0(jhw0.b.class), new o8c0(new xep0(8), 15)).subscribe(new hhw0(new r6i0(this, 28), 0)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.y(a0, qVar, aVar2).b0(jhw0.b.class), new xb20(new g1s0(5), 26)).subscribe(new u0o0(new z4t0(this, 10), 13)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(a0.b0(jhw0.b.class).U(new s7o0(new r7w0(1), 4)), qVar, aVar2).subscribe(new j990(new i9u0(this, 6), 22)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(a0.b0(jhw0.c.class), new qat0(new t6c0(21), 3)).subscribe(new jw80(new emh0(this, 25), 26)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(a0.b0(jhw0.b.class), new n8c0(new acc0(20), 18)).subscribe(new dpo0(new efr0(this, 14), 9)));
        FragmentManager fragmentManager = aVar.b;
        if (fragmentManager != null) {
            fragmentManager.c0(bVar2, false);
        }
    }

    public final void a(ghw0 ghw0Var) {
        this.c.onNext(ghw0Var);
    }

    public final void b(jhw0 jhw0Var, jhw0.f fVar) {
        if (jhw0Var instanceof jhw0.c) {
            c(jhw0.c.e((jhw0.c) jhw0Var, false, false, fVar, null, 55));
            return;
        }
        jhw0.f fVar2 = fVar;
        if (jhw0Var instanceof jhw0.e) {
            c(jhw0.e.e((jhw0.e) jhw0Var, false, false, fVar2, null, 55));
            return;
        }
        if (!(jhw0Var instanceof jhw0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        jhw0.b bVar = (jhw0.b) jhw0Var;
        jhw0.a aVar = bVar.e;
        if ((aVar instanceof jhw0.a.e) && (fVar2 instanceof jhw0.f.b)) {
            fVar2 = new jhw0.f.b(((jhw0.a.e) aVar).b);
        }
        c(jhw0.b.e(bVar, false, false, fVar2, null, null, null, 247));
    }

    public final void c(jhw0 jhw0Var) {
        L.e("state -> " + jhw0Var);
        this.b.onNext(jhw0Var);
    }
}
