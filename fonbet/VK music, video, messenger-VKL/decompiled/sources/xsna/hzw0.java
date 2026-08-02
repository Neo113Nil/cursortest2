package xsna;

import com.vk.log.L;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;
import ru.ok.android.utils.Logger;
import xsna.a7f0;
import xsna.c0x0;
import xsna.fzw0;
import xsna.kzw0;
import xsna.nzw0;
import xsna.tmw0;

/* compiled from: VoipSelectMovieFeature.kt */
/* loaded from: classes7.dex */
public final class hzw0 extends wk50<pzw0, nzw0, tmw0, kzw0> implements ncx0 {
    public final u98 f;
    public final icx0 g;
    public final fhw0 h;
    public final wj50<c0x0> i;
    public final com.vk.voip.b j;
    public io.reactivex.rxjava3.disposables.c k;

    /* compiled from: VoipSelectMovieFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<kzw0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(kzw0 kzw0Var) {
            ((hzw0) this.receiver).T(kzw0Var);
            return s3q0.a;
        }
    }

    public hzw0(mzw0 mzw0Var, u98 u98Var, icx0 icx0Var, fhw0 fhw0Var, wj50 wj50Var, com.vk.voip.b bVar) {
        super(new fzw0.b(icx0Var.b()), mzw0Var);
        this.f = u98Var;
        this.g = icx0Var;
        this.h = fhw0Var;
        this.i = wj50Var;
        this.j = bVar;
        this.k = EmptyDisposable.INSTANCE;
    }

    @Override // xsna.wk50
    public final void N(nzw0 nzw0Var, tmw0 tmw0Var) {
        nzw0 nzw0Var2 = nzw0Var;
        tmw0 tmw0Var2 = tmw0Var;
        if (tmw0Var2 instanceof fzw0.b) {
            fzw0.b bVar = (fzw0.b) tmw0Var2;
            fhw0 fhw0Var = this.h;
            if (!fhw0Var.isInitialized()) {
                a7f0.a.d(this, fhw0Var.a(), null, new gzw0(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), new jds0(this, 11), 1);
                return;
            } else {
                T(new kzw0.e(bVar.b));
                this.j.h().b(this);
                return;
            }
        }
        if (tmw0Var2 instanceof fzw0.d) {
            CharSequence charSequence = ((fzw0.d) tmw0Var2).b;
            if (charSequence.length() == 0) {
                T(kzw0.a.b);
                return;
            } else {
                U(charSequence, nzw0Var2.c());
                return;
            }
        }
        boolean z = tmw0Var2 instanceof fzw0.e;
        wj50<c0x0> wj50Var = this.i;
        icx0 icx0Var = this.g;
        if (z) {
            if (nzw0Var2.a() != null) {
                icx0Var.j();
            }
            T(new kzw0.e(null));
            wj50Var.b(c0x0.a.a);
            return;
        }
        if (tmw0Var2 instanceof fzw0.a) {
            T(new kzw0.b(((fzw0.a) tmw0Var2).b));
            if (nzw0Var2 instanceof nzw0.a) {
                U(((nzw0.a) nzw0Var2).h(), nzw0Var2.c());
                return;
            }
            return;
        }
        if (tmw0Var2 instanceof fzw0.c) {
            set0 set0Var = ((fzw0.c) tmw0Var2).b;
            set0Var.reset();
            T(new kzw0.b(set0Var));
            if (nzw0Var2 instanceof nzw0.a) {
                U(((nzw0.a) nzw0Var2).h(), nzw0Var2.c());
                return;
            }
            return;
        }
        if (!(tmw0Var2 instanceof tmw0.a)) {
            if (tmw0Var2 instanceof tmw0.b) {
                if (nzw0Var2 instanceof nzw0.a) {
                    U(((nzw0.a) nzw0Var2).h(), nzw0Var2.c());
                    return;
                }
                return;
            } else {
                if (tmw0Var2 instanceof tmw0.c) {
                    icx0Var.l(((tmw0.c) tmw0Var2).b);
                    wj50Var.b(c0x0.a.a);
                    return;
                }
                return;
            }
        }
        if (nzw0Var2 instanceof nzw0.a.C3429a) {
            T(kzw0.d.c.b);
            nzw0.a.C3429a c3429a = (nzw0.a.C3429a) nzw0Var2;
            set0 set0Var2 = c3429a.e;
            CharSequence charSequence2 = c3429a.b;
            Integer num = c3429a.g.a;
            int e = set0Var2.e();
            int duration = set0Var2.getDuration();
            a7f0.a.f(this, this.f.d(charSequence2, num, e, set0Var2.d(), set0Var2.v(), duration).l(new i4f0(new lcq0(9), 16)), new qi3(1, this, hzw0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 14), new lzl0(this, 23), 1);
        }
    }

    public final void U(CharSequence charSequence, set0 set0Var) {
        T(new kzw0.c.C3221c(charSequence, set0Var));
        this.e.a(this.k);
        int e = set0Var.e();
        int duration = set0Var.getDuration();
        this.k = a7f0.a.f(this, this.f.d(charSequence, null, e, set0Var.d(), set0Var.v(), duration).l(new hi70(new qvm0(5, charSequence, set0Var), 16)), new a(1, this, hzw0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new s62(this, charSequence, set0Var, 8), 1);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.j.h().a(this);
    }

    @Override // xsna.ncx0
    public final void onVideoStarted(MovieStartedData movieStartedData) {
        T(new kzw0.e(t3r0.b(movieStartedData.getMovie())));
    }

    @Override // xsna.ncx0
    public final void onVideoStopped(MovieStoppedData movieStoppedData) {
        T(new kzw0.e(null));
    }

    @Override // xsna.ncx0
    public final void onVideoStatesChanged(MovieStates movieStates) {
    }
}
