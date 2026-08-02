package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.ndw;

/* compiled from: ImStoriesInfoHelperImpl.kt */
/* loaded from: classes.dex */
public final class qdw implements odw {
    public final a1w b;
    public final mdw c;
    public io.reactivex.rxjava3.disposables.c e;
    public volatile boolean g;
    public final bpn0 h;
    public final io.reactivex.rxjava3.subjects.d<ndw> d = io.reactivex.rxjava3.subjects.d.O0(new ndw.a(jgp.b));
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: ImStoriesInfoHelperImpl.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public a(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: ImStoriesInfoHelperImpl.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public qdw(a1w a1wVar, mdw mdwVar) {
        this.b = a1wVar;
        this.c = mdwVar;
        cew.b.getClass();
        this.g = cew.h().getBoolean("setting_stories_enabled_messenger", true);
        this.h = new bpn0(new qy8(this, 5));
    }

    @Override // xsna.odw
    public final io.reactivex.rxjava3.core.q<ndw> a() {
        return (io.reactivex.rxjava3.core.q) this.h.getValue();
    }

    @Override // xsna.odw
    public final void b(Peer peer) {
        d(Collections.singleton(peer));
    }

    @Override // xsna.odw
    public final io.reactivex.rxjava3.core.a c(Set<? extends Peer> set) {
        if (!this.g) {
            return new io.reactivex.rxjava3.internal.operators.completable.p(io.reactivex.rxjava3.core.x.k(new Object()));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            Peer peer = (Peer) obj;
            peer.getClass();
            if (peer.Ab(Peer.Type.USER) || peer.Ab(Peer.Type.GROUP)) {
                arrayList.add(obj);
            }
        }
        Set S0 = j5g.S0(arrayList);
        return new io.reactivex.rxjava3.internal.operators.completable.p(S0.isEmpty() ? io.reactivex.rxjava3.core.x.k(new Object()) : new io.reactivex.rxjava3.internal.operators.single.o(this.b.C(this, new wvt(S0)), new pdw(new dhh(this, 24), 0)));
    }

    @Override // xsna.odw
    public final void d(Set<? extends Peer> set) {
        if (this.g) {
            io.reactivex.rxjava3.disposables.c cVar = this.e;
            if (cVar != null) {
                this.f.a(cVar);
            }
            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.maybe.l(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new c1e(set, 2)), new lp0(new n1d(this, 23), 23)), new ql2(new hyu(1), 20)).n(asu0.a.c()).subscribe(new mp0(new wcj(this, 16), 26), new om1(new a(L.a), 25));
            this.f.b(subscribe);
            this.e = subscribe;
        }
    }

    public final void e(UserId userId, ImStoryState imStoryState) {
        if (this.g) {
            this.f.b(hg1.i(this.b.C(this, new hta(com.vk.dto.common.a.a(userId), imStoryState)).q(asu0.a.c()), new x2e(this, 24)));
        }
    }
}
