package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.EntitySyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.log.LogLevel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.pdg0;
import xsna.pl30;

/* compiled from: VkMsgListDataLoader.kt */
/* loaded from: classes2.dex */
public final class l5v0 {
    public static final /* synthetic */ qcy<Object>[] s = {new MutablePropertyReference1Impl(l5v0.class, "dialog", "getDialog()Lcom/vk/im/engine/models/EntityValue;", 0), p5j.a(0, l5v0.class, "friendsMutual", "getFriendsMutual()Lcom/vk/im/engine/models/friends/FriendsMutual;", fpf0.a), new MutablePropertyReference1Impl(l5v0.class, "isCheckedDeleteForAll", "isCheckedDeleteForAll()Z", 0)};
    public static final f9w t = e9w.b("VkMsgListDataLoader");
    public final long a;
    public final a1w b;
    public final com.vk.im.engine.models.c c;
    public final w920 d;
    public final ell e;
    public final jl30 f;
    public final biu g;
    public final biu h = new biu(null);
    public final biu i = new biu(Boolean.FALSE);
    public final io.reactivex.rxjava3.core.w j;
    public final io.reactivex.rxjava3.subjects.f<pl30> k;
    public final io.reactivex.rxjava3.internal.operators.observable.m1 l;
    public final l5f0 m;
    public final Long n;
    public volatile boolean o;
    public final io.reactivex.rxjava3.disposables.b p;
    public final io.reactivex.rxjava3.disposables.c q;
    public volatile boolean r;

    /* compiled from: VkMsgListDataLoader.kt */
    public static abstract class a {

        /* compiled from: VkMsgListDataLoader.kt */
        /* renamed from: xsna.l5v0$a$a, reason: collision with other inner class name */
        public static final class C3235a extends a {
            public final boolean a;

            public C3235a(boolean z) {
                this.a = z;
            }
        }

        /* compiled from: VkMsgListDataLoader.kt */
        public static final class b extends a {
            public final xpp<Dialog> a;

            public b(xpp<Dialog> xppVar) {
                this.a = xppVar;
            }
        }

        /* compiled from: VkMsgListDataLoader.kt */
        public static final class c extends a {
            public final ers a;

            public c(ers ersVar) {
                this.a = ersVar;
            }
        }

        /* compiled from: VkMsgListDataLoader.kt */
        public static final class d extends a {
            public final ProfilesInfo a;

            public d(ProfilesInfo profilesInfo) {
                this.a = profilesInfo;
            }
        }
    }

    /* compiled from: VkMsgListDataLoader.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(a aVar) {
            l5v0.b((l5v0) this.receiver, aVar);
            return s3q0.a;
        }
    }

    /* compiled from: VkMsgListDataLoader.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            l5v0.a((l5v0) this.receiver, th);
            return s3q0.a;
        }
    }

    public l5v0(long j, a1w a1wVar, com.vk.im.engine.models.c cVar, w920 w920Var, ell ellVar, Dialog dialog, jl30 jl30Var) {
        this.a = j;
        this.b = a1wVar;
        this.c = cVar;
        this.d = w920Var;
        this.e = ellVar;
        this.f = jl30Var;
        this.g = new biu(new xpp(dialog, false));
        asu0 asu0Var = asu0.a;
        v860 A = asu0Var.A(1, "msg-list-data-loader");
        this.j = A;
        io.reactivex.rxjava3.internal.operators.observable.z zVar = new io.reactivex.rxjava3.internal.operators.observable.z(w920Var.m.a0(A).U(new o8c0(new efr0(this, 11), 13)), new j5v0(new r6i0(this, 24), 0));
        io.reactivex.rxjava3.subjects.f<pl30> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.k = fVar;
        this.l = io.reactivex.rxjava3.core.q.X(zVar, fVar).a0(A);
        zdw zdwVar = i7o0.b;
        j3f0 e = (zdwVar == null ? null : zdwVar).e();
        this.m = e != null ? e.d() : null;
        vbw j2 = cVar.j();
        this.n = j2 != null ? Long.valueOf(j2.a) : null;
        this.p = new io.reactivex.rxjava3.disposables.b();
        this.q = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new hl30(new ykt0(this, 5), 22)).U(new vvi0(new dgu0(this, 1), 8)).a0(asu0Var.d()).subscribe(new j3z(new k5v0(1, this, l5v0.class, "onUpdateLoaded", "onUpdateLoaded(Lcom/vk/im/ui/components/msg_list/loader/VkMsgListDataLoader$LocalStateUpdate;)V", 0), 25), new k2y(new gy(1, this, l5v0.class, "onUpdateError", "onUpdateError(Ljava/lang/Throwable;)V", 0, 18), 28));
    }

    public static final void a(l5v0 l5v0Var, Throwable th) {
        Throwable th2;
        l5v0Var.getClass();
        f9w f9wVar = t;
        f9wVar.getClass();
        if (!f9wVar.d(LogLevel.ERROR)) {
            String str = f9wVar.a;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                th2 = th;
                L.w(l, L.LogType.e, th2, new Object[]{str, "onUpdateError"}, null, null, 24);
                l5v0Var.k.onNext(new pl30.c(th2));
                l5v0Var.c();
            }
        }
        th2 = th;
        l5v0Var.k.onNext(new pl30.c(th2));
        l5v0Var.c();
    }

    public static final void b(l5v0 l5v0Var, a aVar) {
        ell ellVar = l5v0Var.e;
        io.reactivex.rxjava3.subjects.f<pl30> fVar = l5v0Var.k;
        t.debug(new wrl0(aVar, 25));
        boolean z = aVar instanceof a.b;
        qcy<Object>[] qcyVarArr = s;
        if (z) {
            a.b bVar = (a.b) aVar;
            l5v0Var.g.setValue(l5v0Var, qcyVarArr[0], bVar.a);
            fVar.onNext(new pl30.b(bVar.a.a()));
        } else if (aVar instanceof a.d) {
            ProfilesInfo profilesInfo = ((a.d) aVar).a;
            if (profilesInfo.isEmpty()) {
                return;
            }
            ProfilesInfo b2 = ellVar.b();
            if (!profilesInfo.isEmpty()) {
                b2.Hb(profilesInfo);
                b2 = new ProfilesInfo(b2);
            }
            ellVar.a(b2);
            fVar.onNext(new pl30.e(ellVar.b(), profilesInfo.Nb()));
        } else if (aVar instanceof a.c) {
            l5v0Var.h.setValue(l5v0Var, qcyVarArr[1], ((a.c) aVar).a);
        } else {
            if (!(aVar instanceof a.C3235a)) {
                throw new NoWhenBranchMatchedException();
            }
            l5v0Var.i.setValue(l5v0Var, qcyVarArr[2], Boolean.valueOf(((a.C3235a) aVar).a));
        }
        l5v0Var.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r0 == com.vk.dto.common.EntitySyncState.EXPIRED) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        io.reactivex.rxjava3.core.x q;
        io.reactivex.rxjava3.core.x<a.c> l;
        if (this.r || this.d.p.get()) {
            return;
        }
        if (!d().d()) {
            ell ellVar = this.e;
            if (!ellVar.b().Fb() && !ellVar.b().Eb()) {
                w920 w920Var = this.d;
                if (w920Var.c().o() && w920Var.c().isEmpty() && e() != null) {
                    EntitySyncState entitySyncState = e().b;
                    entitySyncState.getClass();
                }
                if (!f()) {
                    z = false;
                    this.k.onNext(new pl30.a(z));
                    if (z) {
                        return;
                    }
                    int i = 2;
                    int i2 = 14;
                    if (d().d()) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        int i3 = 21;
                        l = this.b.C(this, new tqm(Peer.a.b(this.a), Source.ACTUAL)).q(asu0.a.c()).l(new u730(new ece0(this, 28), i3)).l(new i630(new pmp0(7), i3));
                    } else {
                        ell ellVar2 = this.e;
                        if (ellVar2.b().Fb() || ellVar2.b().Eb()) {
                            ell ellVar3 = this.e;
                            ProfilesInfo b2 = ellVar3.b();
                            ReentrantReadWriteLock.ReadLock readLock = ellVar3.c.readLock();
                            readLock.lock();
                            try {
                                if (b2.Gb()) {
                                    s3q0 s3q0Var = s3q0.a;
                                    readLock.unlock();
                                    q = new io.reactivex.rxjava3.internal.operators.single.v(new u15(i, ellVar3, b2)).q(asu0.a.c());
                                } else {
                                    q = io.reactivex.rxjava3.core.x.k(new ProfilesInfo());
                                }
                                l = q.l(new xw70(new t6c0(17), 15));
                            } finally {
                                readLock.unlock();
                            }
                        } else if (f()) {
                            Serializer.c<Peer> cVar2 = Peer.CREATOR;
                            l = new io.reactivex.rxjava3.internal.operators.single.n(this.b.C(this, new tqm(Peer.a.b(this.a), Source.NETWORK)).q(asu0.a.c()), new hdi0(new ehm0(this, i2), 8)).l(new f0j0(new z8l0(this, i2), 11)).l(new bj50(new t810(27), 19));
                        } else {
                            l = h();
                        }
                    }
                    int i4 = 4;
                    this.p.b(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.i(new io.reactivex.rxjava3.internal.operators.single.n(l.m(asu0.a.d()), new qtq0(new ujm0(this, i2), i4)), new p98(this, 5)), new if1(this, i4)).subscribe(new nvm0(new b(1, this, l5v0.class, "onUpdateLoaded", "onUpdateLoaded(Lcom/vk/im/ui/components/msg_list/loader/VkMsgListDataLoader$LocalStateUpdate;)V", 0), 10), new wau0(new c(1, this, l5v0.class, "onUpdateError", "onUpdateError(Ljava/lang/Throwable;)V", 0), i)));
                    return;
                }
            }
        }
        z = true;
        this.k.onNext(new pl30.a(z));
        if (z) {
        }
    }

    public final xpp<Dialog> d() {
        return (xpp) this.g.getValue(this, s[0]);
    }

    public final ers e() {
        return (ers) this.h.getValue(this, s[1]);
    }

    public final boolean f() {
        Long l;
        boolean z = false;
        if (!this.o && (l = this.n) != null) {
            long longValue = l.longValue();
            Dialog a2 = d().a();
            if (a2 != null && !a2.Gb()) {
                if (longValue == 0) {
                    return true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                cew.b.getClass();
                long j = currentTimeMillis - cew.h().getLong("can_write_revalidation_last_time_ms", 0L);
                if (0 <= j && j < longValue) {
                    z = true;
                }
                return !z;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dialog g() {
        Object obj;
        Object obj2;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        long j = this.a;
        tqm tqmVar = new tqm(Peer.a.b(j), Source.CACHE);
        a1w a1wVar = this.b;
        pdg0 n = a1wVar.n(this, tqmVar);
        if (n instanceof pdg0.a) {
            obj = new wpp();
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        xpp e = ((wpp) obj).e(Long.valueOf(j));
        Dialog dialog = (Dialog) e.b;
        qcy<Object>[] qcyVarArr = s;
        biu biuVar = this.g;
        if (dialog != null) {
            biuVar.setValue(this, qcyVarArr[0], new xpp(dialog, e.a));
            return dialog;
        }
        pdg0 n2 = a1wVar.n(this, new tqm(Peer.a.b(j), Source.NETWORK));
        if (n2 instanceof pdg0.a) {
            obj2 = new wpp();
        } else {
            if (!(n2 instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = ((pdg0.b) n2).a;
        }
        Dialog dialog2 = (Dialog) ((wpp) obj2).e(Long.valueOf(j)).b;
        if (dialog2 == null) {
            throw new IllegalStateException("dialog cannot be null");
        }
        biuVar.setValue(this, qcyVarArr[0], new xpp(dialog2, false));
        return dialog2;
    }

    public final io.reactivex.rxjava3.core.x<a.c> h() {
        Dialog a2 = d().a();
        if (a2 == null || !a2.Gb()) {
            return io.reactivex.rxjava3.core.x.k(new a.c(ers.g));
        }
        List l = e() == null ? e43.l(Source.CACHE, Source.ACTUAL) : Collections.singletonList(Source.ACTUAL);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return this.b.C(this, new frs(Peer.a.b(this.a), l, true)).q(asu0.a.c()).l(new x310(new hxm0(13), 21));
    }
}
