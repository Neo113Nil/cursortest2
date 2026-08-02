package xsna;

import android.content.Context;
import com.vk.log.L;
import com.vk.medianative.MediaNative;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import ru.ok.call_effects.AnimojiEffect;
import xsna.d6x0;
import xsna.m5x0;
import xsna.t5x0;
import xsna.z5x0;

/* compiled from: VoipVmojiFeature.kt */
/* loaded from: classes7.dex */
public final class v5x0 extends wk50<h6x0, d6x0, m5x0, z5x0> {
    public final va9 f;
    public final io.reactivex.rxjava3.subjects.f<t5x0> g;
    public final fhw0 h;

    /* compiled from: VoipVmojiFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public v5x0(va9 va9Var) {
        super(m5x0.e.b, new c6x0(d6x0.b.b));
        this.f = va9Var;
        this.g = new io.reactivex.rxjava3.subjects.f<>();
        this.h = a201.b().b();
        va9Var.getClass();
        this.e.b(a201.b().b().a().d(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.q(new rt0(va9Var, 5)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).s0(new o7(new zx(va9Var, 11), 6))).a0(asu0.a.d()).subscribe(new p350(new egt0(this, 15), 29)));
    }

    @Override // xsna.wk50
    public final void N(d6x0 d6x0Var, m5x0 m5x0Var) {
        d6x0 d6x0Var2 = d6x0Var;
        m5x0 m5x0Var2 = m5x0Var;
        if (m5x0Var2 instanceof m5x0.e) {
            boolean f = epx.f(d6x0Var2, d6x0.b.b);
            fhw0 fhw0Var = this.h;
            if (!f) {
                if (epx.f(d6x0Var2, d6x0.f.b) && fhw0Var.isInitialized()) {
                    U();
                    return;
                }
                return;
            }
            if (fhw0Var.isInitialized()) {
                U();
                return;
            } else {
                T(z5x0.d.b);
                this.e.b(io.reactivex.rxjava3.kotlin.c.d(fhw0Var.a(), new qah0(this, 26), new bw6(L.a, 15)));
                return;
            }
        }
        boolean z = m5x0Var2 instanceof m5x0.i;
        z5x0.f fVar = z5x0.f.b;
        w5w0 w5w0Var = va9.r;
        if (z) {
            if (d6x0Var2 instanceof d6x0.c) {
                T(fVar);
                return;
            } else {
                if (d6x0Var2 instanceof d6x0.g) {
                    this.f.a(w5w0Var, true);
                    T(fVar);
                    return;
                }
                return;
            }
        }
        boolean z2 = m5x0Var2 instanceof m5x0.h;
        z5x0.a aVar = z5x0.a.b;
        if (z2) {
            m5x0.h hVar = (m5x0.h) m5x0Var2;
            String str = hVar.c;
            w5w0 w5w0Var2 = hVar.b;
            if (d6x0Var2 instanceof d6x0.c) {
                T(new z5x0.g(w5w0Var2, str, hVar.d));
                return;
            } else {
                if (d6x0Var2 instanceof d6x0.g) {
                    if (((d6x0.g) d6x0Var2).b ? X(w5w0Var2, str) : false) {
                        T(aVar);
                        return;
                    } else {
                        T(new z5x0.g(w5w0Var2, str, false));
                        return;
                    }
                }
                return;
            }
        }
        if (m5x0Var2 instanceof m5x0.d) {
            m5x0.d dVar = (m5x0.d) m5x0Var2;
            if (d6x0Var2 instanceof d6x0.e) {
                T(z5x0.c.b);
                Y(dVar.b);
                return;
            }
            return;
        }
        if (m5x0Var2 instanceof m5x0.b) {
            m5x0.b bVar = (m5x0.b) m5x0Var2;
            if (d6x0Var2 instanceof d6x0.d) {
                T(z5x0.b.b);
                Y(bVar.b);
                return;
            }
            return;
        }
        if (m5x0Var2 instanceof m5x0.f) {
            if (d6x0Var2 instanceof d6x0.g) {
                V(((d6x0.g) d6x0Var2).b);
                return;
            }
            return;
        }
        if (m5x0Var2 instanceof m5x0.a) {
            w5w0 w5w0Var3 = ((m5x0.a) m5x0Var2).b;
            boolean z3 = d6x0Var2 instanceof d6x0.e;
            z5x0.e eVar = z5x0.e.b;
            if (!z3) {
                if (!(d6x0Var2 instanceof d6x0.d) || epx.f(w5w0Var3, w5w0Var)) {
                    return;
                }
                T(eVar);
                W(w5w0Var3, false);
                return;
            }
            if (epx.f(w5w0Var3, w5w0Var)) {
                T(fVar);
                return;
            }
            d6x0.e eVar2 = (d6x0.e) d6x0Var2;
            if (epx.f(eVar2.b.a.b(), w5w0Var3.b())) {
                return;
            }
            boolean z4 = eVar2.c;
            T(eVar);
            W(w5w0Var3, z4);
            return;
        }
        if (m5x0Var2 instanceof m5x0.g) {
            if (d6x0Var2 instanceof d6x0.e) {
                d6x0.e eVar3 = (d6x0.e) d6x0Var2;
                d6x0.e.a aVar2 = eVar3.b;
                if (!eVar3.c) {
                    w5w0Var = aVar2.a;
                }
                X(w5w0Var, aVar2.b);
                return;
            }
            return;
        }
        if (m5x0Var2 instanceof m5x0.j) {
            if (d6x0Var2 instanceof d6x0.c) {
                V(false);
                return;
            } else {
                if (d6x0Var2 instanceof d6x0.e) {
                    T(new z5x0.h(false));
                    return;
                }
                return;
            }
        }
        if (!(m5x0Var2 instanceof m5x0.k)) {
            if (!(m5x0Var2 instanceof m5x0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            T(aVar);
            return;
        }
        m5x0.k kVar = (m5x0.k) m5x0Var2;
        if (d6x0Var2 instanceof d6x0.c) {
            W(kVar.b, true);
        } else if (d6x0Var2 instanceof d6x0.e) {
            T(new z5x0.h(true));
        }
    }

    public final void U() {
        T(z5x0.e.b);
        io.reactivex.rxjava3.internal.operators.observable.p1 i = this.f.i();
        asu0.a.getClass();
        this.e.b(new io.reactivex.rxjava3.internal.operators.observable.y(i.r0(asu0.k()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).F(new bkw0(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1)).subscribe(new ksb0(new lbt0(this, 9), 18)));
    }

    public final void V(final boolean z) {
        io.reactivex.rxjava3.internal.operators.single.b bVar = new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new x9l0(this, 26), 3));
        asu0.a.getClass();
        this.e.b(io.reactivex.rxjava3.kotlin.c.e(bVar.q(asu0.r()), new bjm0(this, 27), new izs() { // from class: xsna.u5x0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                w5w0 w5w0Var = (w5w0) obj;
                boolean f = epx.f(w5w0Var, va9.r);
                v5x0 v5x0Var = v5x0.this;
                if (f) {
                    v5x0Var.C(m5x0.i.b);
                } else {
                    v5x0Var.W(w5w0Var, z);
                }
                return s3q0.a;
            }
        }));
    }

    public final void W(w5w0 w5w0Var, boolean z) {
        this.e.b(io.reactivex.rxjava3.kotlin.c.e(w5w0Var.a().m(asu0.a.c()), new kfw0(this, 6), new vx30(this, w5w0Var, z)));
    }

    public final boolean X(w5w0 w5w0Var, String str) {
        if (!epx.f(w5w0Var, va9.r)) {
            boolean isGLEffectsLibSupported = MediaNative.isGLEffectsLibSupported();
            io.reactivex.rxjava3.subjects.f<t5x0> fVar = this.g;
            if (!isGLEffectsLibSupported) {
                fVar.onNext(t5x0.a.a);
                return false;
            }
            if (AnimojiEffect.Companion.validateSvg(str) != null) {
                fVar.onNext(t5x0.b.a);
                return false;
            }
        }
        this.f.a(w5w0Var, true);
        return true;
    }

    public final void Y(Context context) {
        d6w0.a(b6m.e(), context, "keyboard_create", "character_id=avatar&autoclose&oneshare&disableshare", 8);
    }
}
