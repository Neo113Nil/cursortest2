package xsna;

import com.vk.log.L;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ty4;

/* compiled from: ClipsGridRepository.kt */
/* loaded from: classes17.dex */
public final class eee {
    public static final /* synthetic */ qcy<Object>[] h = {new MutablePropertyReference1Impl(eee.class, "currentPageState", "getCurrentPageState()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, eee.class, "banUser", "getBanUser()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a), new MutablePropertyReference1Impl(eee.class, "unbanUser", "getUnbanUser()Lio/reactivex/rxjava3/disposables/Disposable;", 0)};
    public final wee a;
    public final ufu b;
    public final pgn c = new pgn();
    public final pgn d = new pgn();
    public final pgn e = new pgn();
    public boolean f;
    public final ty4 g;

    /* compiled from: ClipsGridRepository.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ((eee) this.receiver).a.jm(th2);
            if (th2 != null) {
                L.i(th2);
            }
            return s3q0.a;
        }
    }

    public eee(wee weeVar, ufu ufuVar, ngj0 ngj0Var) {
        this.a = weeVar;
        this.b = ufuVar;
        this.g = new ty4(ngj0Var, new i50(this, 14));
    }

    public final void a(wfu wfuVar) {
        if (this.f) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = wfuVar.b().m(asu0.a.d()).subscribe(new nf1(new l22(6, this, wfuVar), 13), new sh6(new a(1, this, eee.class, "processError", "processError(Ljava/lang/Throwable;)V", 0), 10));
        qcy<Object> qcyVar = h[0];
        this.c.b(subscribe);
    }

    public final void b(boolean z, boolean z2) {
        ty4 ty4Var = this.g;
        io.reactivex.rxjava3.disposables.c cVar = ty4Var.c;
        if (cVar == null || cVar.h()) {
            io.reactivex.rxjava3.subjects.f<ty4.a> fVar = ty4Var.d;
            ps2 ps2Var = new ps2(new dz(3), 2);
            fVar.getClass();
            ty4Var.c = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, ps2Var).w0(300L, TimeUnit.MILLISECONDS).u(new ju1(new com.vk.movika.sdk.base.observable.k(ty4Var, 9), 3)).subscribe();
        }
        c(false);
        wee weeVar = this.a;
        if (z) {
            weeVar.lk();
            weeVar.z9();
        }
        weeVar.Aj();
        ufu ufuVar = this.b;
        if (z2) {
            ufuVar.c();
        }
        wfu f = ufuVar.f();
        if (f == null) {
            return;
        }
        a(f);
    }

    public final void c(boolean z) {
        if (z) {
            io.reactivex.rxjava3.disposables.c cVar = this.g.c;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f = true;
        }
        qcy<Object>[] qcyVarArr = h;
        qcy<Object> qcyVar = qcyVarArr[0];
        this.c.b(null);
        qcy<Object> qcyVar2 = qcyVarArr[1];
        this.d.b(null);
        qcy<Object> qcyVar3 = qcyVarArr[2];
        this.e.b(null);
        this.b.b(z);
    }
}
