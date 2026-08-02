package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.log.L;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gpz;
import xsna.ltb;
import xsna.qhm;

/* compiled from: ChatMembersLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class otb {
    public static final /* synthetic */ int m = 0;
    public final mxv a;
    public final a1w b;
    public c c = new c("", 6);
    public final io.reactivex.rxjava3.core.w d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final AtomicBoolean g;
    public final io.reactivex.rxjava3.subjects.f h;
    public final io.reactivex.rxjava3.subjects.f i;
    public final io.reactivex.rxjava3.subjects.d j;
    public final io.reactivex.rxjava3.subjects.f k;
    public volatile b l;

    /* compiled from: ChatMembersLoaderImpl.kt */
    public final class a implements io.reactivex.rxjava3.functions.f<sxp> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(sxp sxpVar) {
            sxp sxpVar2 = sxpVar;
            if (sxpVar2 instanceof p680) {
                if (((p680) sxpVar2).c) {
                    otb otbVar = otb.this;
                    if (otbVar.l.d) {
                        DialogExt zb = DialogExt.zb(otbVar.l.a);
                        otbVar.g();
                        otbVar.f(zb);
                        return;
                    }
                    return;
                }
                return;
            }
            if (sxpVar2 instanceof OnCacheInvalidateEvent) {
                otb.this.h();
                return;
            }
            if (sxpVar2 instanceof ka80) {
                otb otbVar2 = otb.this;
                ProfilesInfo profilesInfo = ((ka80) sxpVar2).c;
                if (!otbVar2.l.e && otbVar2.l.a.b.Ib(profilesInfo).g()) {
                    otbVar2.a();
                    otbVar2.i();
                    return;
                }
                return;
            }
            if (sxpVar2 instanceof r480) {
                otb otbVar3 = otb.this;
                wpp<Long, Dialog> wppVar = ((r480) sxpVar2).c;
                if (otbVar3.l.c || otbVar3.l.f || !wppVar.b(Long.valueOf(otbVar3.l.a.e))) {
                    return;
                }
                otbVar3.h();
                Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(otbVar3.l.a.e));
                if (dialog == null) {
                    return;
                }
                otbVar3.l = b.a(otbVar3.l, new DialogExt(dialog, otbVar3.l.a.b), false, false, null, false, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                otbVar3.a();
                otbVar3.i();
            }
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final class c {
        public final String a;
        public final boolean b;
        public final AtomicBoolean c;

        public /* synthetic */ c(String str, int i) {
            this(str, (i & 2) == 0, new AtomicBoolean(false));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Search(query=" + this.a + ", shouldSearchNetwork=" + this.b + ", inProgress=" + this.c + ')';
        }

        public c(String str, boolean z, AtomicBoolean atomicBoolean) {
            this.a = str;
            this.b = z;
            this.c = atomicBoolean;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<gpz.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gpz.a aVar) {
            gpz.a aVar2 = aVar;
            otb otbVar = (otb) this.receiver;
            otbVar.l = b.a(otbVar.l, new DialogExt(aVar2.a, aVar2.c), false, false, aVar2.b, aVar2.d, null, 618);
            otbVar.a();
            otbVar.i();
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            otb otbVar = (otb) this.receiver;
            otbVar.getClass();
            L.j(th2, "otb", "onLoadInitError");
            otbVar.l = b.a(otbVar.l, null, false, false, null, false, th2, 475);
            otbVar.i();
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<gpz.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gpz.a aVar) {
            gpz.a aVar2 = aVar;
            otb otbVar = (otb) this.receiver;
            otbVar.l = b.a(otbVar.l, otbVar.l.a.Ab(aVar2.c), false, false, otbVar.l.h.b(aVar2.b), aVar2.d, null, 638);
            otbVar.a();
            otbVar.i();
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            otb otbVar = (otb) this.receiver;
            otbVar.getClass();
            L.j(th, "otb", "onLoadMoreError");
            otbVar.c();
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<qhm.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(qhm.a aVar) {
            qhm.a aVar2 = aVar;
            otb otbVar = (otb) this.receiver;
            b bVar = otbVar.l;
            DialogExt dialogExt = otbVar.l.a;
            otbVar.l = b.a(bVar, new DialogExt(dialogExt.d, aVar2.b, dialogExt.c), false, false, aVar2.a, false, null, 894);
            c cVar = otbVar.c;
            cVar.c.set(cVar.b);
            otbVar.a();
            otbVar.i();
            if (otbVar.c.b) {
                otbVar.e();
            }
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            otb otbVar = (otb) this.receiver;
            otbVar.getClass();
            L.j(th, "otb", "onSearchCacheError");
            c cVar = otbVar.c;
            cVar.c.set(cVar.b);
            otbVar.i();
            if (otbVar.c.b) {
                otbVar.e();
            }
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<qhm.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(qhm.a aVar) {
            qhm.a aVar2 = aVar;
            otb otbVar = (otb) this.receiver;
            otbVar.c.c.set(false);
            otbVar.l = b.a(otbVar.l, otbVar.l.a.Ab(aVar2.b), false, false, otbVar.l.h.b(aVar2.a), false, null, 894);
            otbVar.a();
            otbVar.i();
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            otb otbVar = (otb) this.receiver;
            otbVar.c.c.set(false);
            L.j(th, "otb", "onSearchNetworkError");
            otbVar.i();
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements izs<gpz.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gpz.a aVar) {
            gpz.a aVar2 = aVar;
            otb otbVar = (otb) this.receiver;
            otbVar.l = b.a(otbVar.l, new DialogExt(aVar2.a, aVar2.c), false, false, aVar2.b, false, null, 894);
            otbVar.a();
            otbVar.i();
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            otb otbVar = (otb) this.receiver;
            otbVar.getClass();
            L.j(th2, "otb", "onUpdateAllByCacheError");
            otbVar.i.onNext(th2);
            return s3q0.a;
        }
    }

    public otb(DialogExt dialogExt, Peer peer, mxv mxvVar, a1w a1wVar, com.vk.voip.ui.menu.feature.a aVar) {
        this.a = mxvVar;
        this.b = a1wVar;
        asu0 asu0Var = asu0.a;
        v860 A = asu0Var.A(1, "chat-profile-members-loader");
        this.d = A;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        aVar.invoke(bVar);
        this.e = bVar;
        io.reactivex.rxjava3.disposables.b bVar2 = new io.reactivex.rxjava3.disposables.b();
        aVar.invoke(bVar2);
        this.f = bVar2;
        this.g = new AtomicBoolean(false);
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        this.h = fVar;
        io.reactivex.rxjava3.subjects.f fVar2 = new io.reactivex.rxjava3.subjects.f();
        this.i = fVar2;
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(ltb.c.a);
        new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.y(fVar.a0(A).U(new kf3(new com.vk.movika.sdk.base.observable.o(this, 16), 6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0Var.d()), new jv(new com.vk.movika.sdk.base.observable.q(this, 19), 12), io.reactivex.rxjava3.internal.functions.a.c).subscribe(O0);
        this.j = O0;
        this.k = fVar2;
        this.l = new b(dialogExt, peer);
    }

    public final void a() {
        this.f.b(this.d.c(new p31(this, 3)));
    }

    public final void b(DialogExt dialogExt) {
        int i2 = 13;
        this.f.b(this.b.C("startObserve", new gpz(dialogExt.e, "otb", false)).q(this.d).subscribe(new hz(new d(1, this, otb.class, "onLoadInitSuccess", "onLoadInitSuccess(Lcom/vk/im/ui/components/chat_settings/LoadFullCmd$Result;)V", 0), i2), new defpackage.d(new e(1, this, otb.class, "onLoadInitError", "onLoadInitError(Ljava/lang/Throwable;)V", 0), i2)));
    }

    public final void c() {
        int i2 = 0;
        if (!this.g.compareAndSet(false, true)) {
            L.e("otb", "loadMore: alreadyLoading");
            return;
        }
        this.f.b(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.p(this.b.C("loadMore", new gpz(this.l.a.e, "otb", true)).q(this.d), new mtb(this, i2)), new ntb(this, i2)).subscribe(new ez(new f(1, this, otb.class, "onLoadMoreSuccess", "onLoadMoreSuccess(Lcom/vk/im/ui/components/chat_settings/LoadFullCmd$Result;)V", 0), 6), new gn0(new g(1, this, otb.class, "onLoadMoreError", "onLoadMoreError(Ljava/lang/Throwable;)V", 0), 10)));
    }

    public final void d() {
        this.f.b(this.b.C(this, new qhm(this.l.a.f, this.c.a, Source.CACHE, true)).q(this.d).subscribe(new v8(new h(1, this, otb.class, "onSearchCacheSuccess", "onSearchCacheSuccess(Lcom/vk/im/engine/commands/dialogs/DialogMembersSearchCmd$Response;)V", 0), 15), new pv2(new i(1, this, otb.class, "onSearchCacheError", "onSearchCacheError(Ljava/lang/Throwable;)V", 0), 8)));
    }

    public final void e() {
        this.f.b(this.b.C(this, new qhm(this.l.a.f, this.c.a, 50, Source.NETWORK, true, true)).q(this.d).subscribe(new iu1(new j(1, this, otb.class, "onSearchNetworkSuccess", "onSearchNetworkSuccess(Lcom/vk/im/engine/commands/dialogs/DialogMembersSearchCmd$Response;)V", 0), 6), new bg1(new k(1, this, otb.class, "onSearchNetworkError", "onSearchNetworkError(Ljava/lang/Throwable;)V", 0), 13)));
    }

    public final void f(DialogExt dialogExt) {
        this.l = b.a(this.l, dialogExt, true, false, null, false, null, 1010);
        this.e.b(this.b.l.a().a0(this.d).subscribe(new a()));
        i();
        b(dialogExt);
    }

    public final void g() {
        this.l = new b(new DialogExt(0L, (ProfilesInfo) null, 2, (zcl) null), this.l.b);
        i();
    }

    public final void h() {
        if (this.l.e) {
            c cVar = this.c;
            boolean z = cVar.c.get();
            String str = cVar.a;
            this.c = new c(str, z, cVar.c);
            if (str.length() != 0) {
                d();
                return;
            }
            this.f.b(this.b.C("updateAllByCache", new gpz(this.l.a.e, "otb", false)).q(this.d).subscribe(new xf1(new l(1, this, otb.class, "onUpdateAllByCacheSuccess", "onUpdateAllByCacheSuccess(Lcom/vk/im/ui/components/chat_settings/LoadFullCmd$Result;)V", 0), 11), new qs2(new m(1, this, otb.class, "onUpdateAllByCacheError", "onUpdateAllByCacheError(Ljava/lang/Throwable;)V", 0), 6)));
        }
    }

    public final void i() {
        this.h.onNext(s3q0.a);
    }

    /* compiled from: ChatMembersLoaderImpl.kt */
    public static final class b {
        public final DialogExt a;
        public final Peer b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final ohm h;
        public final boolean i;
        public final Throwable j;

        public b(DialogExt dialogExt, Peer peer, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ohm ohmVar, boolean z6, Throwable th) {
            this.a = dialogExt;
            this.b = peer;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = z5;
            this.h = ohmVar;
            this.i = z6;
            this.j = th;
        }

        public static b a(b bVar, DialogExt dialogExt, boolean z, boolean z2, ohm ohmVar, boolean z3, Throwable th, int i) {
            if ((i & 1) != 0) {
                dialogExt = bVar.a;
            }
            DialogExt dialogExt2 = dialogExt;
            Peer peer = bVar.b;
            if ((i & 4) != 0) {
                z = bVar.c;
            }
            boolean z4 = z;
            boolean z5 = (i & 8) != 0 ? bVar.d : true;
            boolean z6 = (i & 16) != 0 ? bVar.e : true;
            boolean z7 = (i & 32) != 0 ? bVar.f : true;
            boolean z8 = (i & 64) != 0 ? bVar.g : z2;
            ohm ohmVar2 = (i & 128) != 0 ? bVar.h : ohmVar;
            boolean z9 = (i & 256) != 0 ? bVar.i : z3;
            Throwable th2 = (i & 512) != 0 ? bVar.j : th;
            bVar.getClass();
            return new b(dialogExt2, peer, z4, z5, z6, z7, z8, ohmVar2, z9, th2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && epx.f(this.h, bVar.h) && this.i == bVar.i && epx.f(this.j, bVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + qoy.b(qr.a(this.h.b, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(bh10.a(this.a.hashCode() * 31, 31, this.b.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoaderState(dialogExt=");
            sb.append(this.a);
            sb.append(", currentMember=");
            sb.append(this.b);
            sb.append(", isInitLoad=");
            sb.append(this.c);
            sb.append(", isObserving=");
            sb.append(this.d);
            sb.append(", isInitSuccess=");
            sb.append(this.e);
            sb.append(", isInitError=");
            sb.append(this.f);
            sb.append(", isUpdateLoad=");
            sb.append(this.g);
            sb.append(", membersList=");
            sb.append(this.h);
            sb.append(", isFullMemberList=");
            sb.append(this.i);
            sb.append(", error=");
            return oq.c(sb, this.j, ')');
        }

        public /* synthetic */ b(DialogExt dialogExt, Peer peer) {
            this(dialogExt, peer, false, false, false, false, false, new ohm(), true, new Throwable());
        }
    }
}
