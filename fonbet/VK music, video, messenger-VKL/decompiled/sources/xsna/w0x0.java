package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a7f0;
import xsna.a990;
import xsna.c1x0;
import xsna.izw0;
import xsna.t0x0;
import xsna.tmw0;
import xsna.z0x0;

/* compiled from: VoipSelectVideoTabFeature.kt */
/* loaded from: classes7.dex */
public final class w0x0 extends wk50<d1x0, c1x0, tmw0, z0x0> {
    public final q0x0 f;
    public final wj50<izw0> g;
    public final fhw0 h;
    public final UserId i;
    public final FunctionReferenceImpl j;
    public final boolean k;

    /* compiled from: VoipSelectVideoTabFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<z0x0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(z0x0 z0x0Var) {
            ((w0x0) this.receiver).T(z0x0Var);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w0x0(b1x0 b1x0Var, q0x0 q0x0Var, wj50 wj50Var, fhw0 fhw0Var, UserId userId, izs izsVar, boolean z) {
        super(t0x0.a.b, b1x0Var);
        this.f = q0x0Var;
        this.g = wj50Var;
        this.h = fhw0Var;
        this.i = userId;
        this.j = (FunctionReferenceImpl) izsVar;
        this.k = z;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.wk50
    public final void N(c1x0 c1x0Var, tmw0 tmw0Var) {
        c1x0 c1x0Var2 = c1x0Var;
        tmw0 tmw0Var2 = tmw0Var;
        if (tmw0Var2 instanceof tmw0.a.C3759a) {
            U(c1x0Var2);
            return;
        }
        if (tmw0Var2 instanceof tmw0.a.b) {
            U(c1x0Var2);
            return;
        }
        if (tmw0Var2 instanceof tmw0.c) {
            this.j.invoke(((tmw0.c) tmw0Var2).b);
            this.g.b(izw0.a.a);
            return;
        }
        boolean z = tmw0Var2 instanceof tmw0.b;
        UserId userId = this.i;
        q0x0 q0x0Var = this.f;
        if (z) {
            if (c1x0Var2 instanceof c1x0.c) {
                return;
            }
            if (c1x0Var2 instanceof c1x0.a) {
                a990.b bVar = ((c1x0.a) c1x0Var2).c.d;
                bVar.getClass();
                if (bVar instanceof a990.b.C2531b) {
                    return;
                }
            }
            T(z0x0.c.C4150c.b);
            a7f0.a.f(this, q0x0Var.a(userId, null).l(new u9c0(new mrw0(this, 3), 11)), new x0x0(1, this, w0x0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new q9i0(this, 21), 1);
            return;
        }
        if (tmw0Var2 instanceof t0x0.a) {
            fhw0 fhw0Var = this.h;
            if (fhw0Var.isInitialized()) {
                T(z0x0.a.c.b);
                a7f0.a.f(this, q0x0Var.a(userId, null).l(new qu50(new aiw0(this, 5), 23)), new v0x0(1, this, w0x0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new whw0(this, 6), 1);
            } else {
                io.reactivex.rxjava3.kotlin.c.d(fhw0Var.a(), new ufu0(this, 9), new u0x0(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0));
            }
        }
    }

    public final void U(c1x0 c1x0Var) {
        if (c1x0Var instanceof c1x0.a) {
            c1x0.a aVar = (c1x0.a) c1x0Var;
            a990<String> a990Var = aVar.c;
            if (a990Var.b) {
                a990.a aVar2 = a990Var.c;
                aVar2.getClass();
                if (!(aVar2 instanceof a990.a.c)) {
                    T(z0x0.b.c.b);
                    String str = aVar.c.a;
                    a7f0.a.f(this, this.f.a(this.i, str).l(new mvc0(new qm90(15, this, c1x0Var), 13)), new a(1, this, w0x0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new egt0(this, 13), 1);
                }
            }
        }
    }
}
