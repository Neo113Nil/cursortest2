package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.ndw;
import xsna.odw;
import xsna.xxd0;

/* compiled from: BaseProfileInfoModel.kt */
/* loaded from: classes2.dex */
public abstract class fl6 implements txd0 {
    public final a1w a;
    public final mxv b;
    public final b25 c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.f<uxd0> e;
    public final io.reactivex.rxjava3.subjects.f f;
    public final Object g;
    public final Peer h;
    public final bpn0 i;
    public final io.reactivex.rxjava3.subjects.d<DialogExt> j;
    public final io.reactivex.rxjava3.subjects.d<ndw> k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;

    /* compiled from: BaseProfileInfoModel.kt */
    public static final class a {
        public final DialogExt a;
        public final ndw b;
        public final List<EduAchievement> c;
        public final y6p d;
        public final Map<Peer, p6p> e;

        public a(DialogExt dialogExt, ndw ndwVar, List<EduAchievement> list, y6p y6pVar, Map<Peer, p6p> map) {
            this.a = dialogExt;
            this.b = ndwVar;
            this.c = list;
            this.d = y6pVar;
            this.e = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitComposedState(dialogExt=");
            sb.append(this.a);
            sb.append(", storiesStates=");
            sb.append(this.b);
            sb.append(", achievements=");
            sb.append(this.c);
            sb.append(", eduSchedule=");
            sb.append(this.d);
            sb.append(", roles=");
            return cjl0.a(sb, this.e, ')');
        }
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((io.reactivex.rxjava3.subjects.d) ((fl6) this.receiver).s.getValue()).onNext(new xxd0.a(th));
            return s3q0.a;
        }
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((io.reactivex.rxjava3.subjects.d) ((fl6) this.receiver).s.getValue()).onNext(new xxd0.a(th));
            return s3q0.a;
        }
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final class g implements w8i {
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final class i implements w8i {
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: BaseProfileInfoModel.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((io.reactivex.rxjava3.subjects.d) ((fl6) this.receiver).s.getValue()).onNext(new xxd0.a(th));
            return s3q0.a;
        }
    }

    public fl6(DialogExt dialogExt, a1w a1wVar, mxv mxvVar, b25 b25Var) {
        odw qdwVar;
        this.a = a1wVar;
        this.b = mxvVar;
        this.c = b25Var;
        io.reactivex.rxjava3.subjects.f<uxd0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.e = fVar;
        this.f = fVar;
        rul rulVar = (rul) this;
        int i2 = 7;
        this.g = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.android.defaultplayer.interactive.a(rulVar, i2));
        Peer peer = dialogExt.f;
        this.h = peer;
        this.i = new bpn0(new f5(rulVar, 7));
        io.reactivex.rxjava3.subjects.d<DialogExt> N0 = io.reactivex.rxjava3.subjects.d.N0();
        int i3 = 5;
        if (dialogExt.Cb() != null) {
            N0.onNext(dialogExt);
            h(m(Source.ACTUAL).subscribe(new bl6(0, N0), new bf2(new c(1, rulVar, fl6.class, "setErrorState", "setErrorState(Ljava/lang/Throwable;)V", 0), i3)));
        } else {
            h(new io.reactivex.rxjava3.internal.operators.observable.v0(new io.reactivex.rxjava3.internal.operators.maybe.y(m(Source.CACHE), io.reactivex.rxjava3.internal.functions.a.g).d(m(Source.ACTUAL))).subscribe(new bl6(0, N0), new sv(new d(1, rulVar, fl6.class, "setErrorState", "setErrorState(Ljava/lang/Throwable;)V", 0), i2)));
        }
        this.j = N0;
        io.reactivex.rxjava3.subjects.d<ndw> O0 = io.reactivex.rxjava3.subjects.d.O0(ndw.b.a);
        List<Peer.Type> list = rdw.a;
        int i4 = 4;
        if (rdw.a(peer, epx.f(a1wVar.q(), peer))) {
            Peer q = a1wVar.q();
            q.getClass();
            if (q.Ab(Peer.Type.GROUP)) {
                odw.a.getClass();
                qdwVar = odw.a.b;
            } else {
                qdwVar = new qdw(a1wVar, mxvVar.g());
            }
            l(qdwVar.a(), new tz(O0, i4), new k5(new k(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i4));
            qdwVar.b(peer);
        }
        this.k = O0;
        int i5 = 8;
        this.l = new bpn0(new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(rulVar, 8));
        this.m = new bpn0(new h9(rulVar, i3));
        this.n = new bpn0(new com.vk.movika.sdk.base.presenter.b(rulVar, 1));
        this.o = new bpn0(new te0(2));
        this.p = new bpn0(new o6(3));
        this.q = new bpn0(new com.vk.movika.sdk.base.logic.interactor.g(i4));
        if (j()) {
            io.reactivex.rxjava3.internal.operators.maybe.a0 a0Var = new io.reactivex.rxjava3.internal.operators.maybe.a0(new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.jdk8.b(a1wVar.C("BaseProfileInfoModelTag", new d1e0(peer, Source.ACTUAL, true)), new e10(new lt0(7), i5)), new c7(new am0(8), i5)), new a.r(Boolean.FALSE));
            asu0 asu0Var = asu0.a;
            h(a0Var.n(asu0Var.c()).k(asu0Var.c()).subscribe(new nf1(rulVar, i3), io.reactivex.rxjava3.internal.functions.a.f));
        }
        this.r = new bpn0(new ac(rulVar, i5));
        this.s = new bpn0(new g5(rulVar, 6));
    }

    public final void a(Source source) {
        h(m(source).subscribe(new ew(this, 2), new defpackage.i0(new l(1, this, fl6.class, "setErrorState", "setErrorState(Ljava/lang/Throwable;)V", 0), 6)));
    }

    @Override // xsna.txd0
    public final io.reactivex.rxjava3.subjects.f b() {
        return this.f;
    }

    @Override // xsna.txd0
    public final void d() {
        io.reactivex.rxjava3.internal.operators.observable.m1 a2 = this.a.l.a();
        om1 om1Var = new om1(this, 3);
        int i2 = kwg0.a;
        h(a2.subscribe(om1Var, new jwg0("fl6")));
    }

    @Override // xsna.txd0
    public final void e() {
        a(Source.CACHE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.txd0
    public final io.reactivex.rxjava3.core.v f() {
        return (io.reactivex.rxjava3.subjects.j) this.g.getValue();
    }

    public final void g(uxd0 uxd0Var) {
        this.e.onNext(uxd0Var);
    }

    @Override // xsna.txd0
    public final io.reactivex.rxjava3.subjects.d<xxd0> getState() {
        return (io.reactivex.rxjava3.subjects.d) this.r.getValue();
    }

    public final void h(io.reactivex.rxjava3.disposables.c cVar) {
        this.d.b(cVar);
    }

    public final void i(izs<? super xxd0.b, xxd0.b> izsVar) {
        xxd0 P0 = getState().P0();
        xxd0.b bVar = P0 instanceof xxd0.b ? (xxd0.b) P0 : null;
        if (bVar != null) {
            ((io.reactivex.rxjava3.subjects.d) this.s.getValue()).onNext(izsVar.invoke(bVar));
        }
    }

    public final boolean j() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public void k(sxp sxpVar) {
        boolean z = sxpVar instanceof r480;
        Peer peer = this.h;
        if (z) {
            if (((r480) sxpVar).c.b(Long.valueOf(peer.b))) {
                a(Source.CACHE);
            }
        } else if (sxpVar instanceof ka80) {
            if (((ka80) sxpVar).c.Bb(peer) != null) {
                a(Source.CACHE);
            }
        } else if (sxpVar instanceof OnCacheInvalidateEvent) {
            a(Source.CACHE);
        } else if (sxpVar instanceof p680) {
            a(Source.ACTUAL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void l(io.reactivex.rxjava3.core.q<T> qVar, io.reactivex.rxjava3.functions.f<T> fVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar2) {
        h(qVar.subscribe(fVar, fVar2));
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.l m(Source source) {
        return new io.reactivex.rxjava3.internal.operators.maybe.l(this.a.C(this, new uqm(new sqm(this.h, source, true, (Object) null, 24))).q(asu0.a.c()).l(new rx0(new r6(this, 8), 3)), new np1(new y40(4), 1));
    }

    @Override // xsna.txd0
    public void t() {
        this.d.e();
    }

    @Override // xsna.txd0
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.txd0
    public void onActivityResult(int i2, int i3, Intent intent) {
    }
}
