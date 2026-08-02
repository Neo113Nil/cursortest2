package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.bridges.ImageViewer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VerifyInfo;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.ui.fragments.ImContactFragment;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.Collections;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ContactComponent.kt */
/* loaded from: classes2.dex */
public final class l8j extends j8i {
    public static final /* synthetic */ qcy<Object>[] s;
    public final Context i;
    public final a1w j;
    public final mxv k;
    public final ImageViewer l;
    public final jbs m;
    public final Peer n;
    public ImContactFragment.b o;
    public final g9e0 p = new g9e0(new bu1(this, 21));
    public final bzb0 q;
    public final e9j r;

    /* compiled from: ContactComponent.kt */
    public final class a implements io.reactivex.rxjava3.functions.f<sxp> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(sxp sxpVar) {
            String str;
            sxp sxpVar2 = sxpVar;
            l8j l8jVar = l8j.this;
            e9j e9jVar = l8jVar.r;
            Peer peer = l8jVar.n;
            if (sxpVar2 instanceof r480) {
                Dialog dialog = (Dialog) ((r480) sxpVar2).c.c.get(Long.valueOf(peer.b));
                if (dialog != null) {
                    e9jVar.d(dialog);
                    return;
                }
                return;
            }
            if (sxpVar2 instanceof ka80) {
                qtd0 Bb = ((ka80) sxpVar2).c.Bb(peer);
                if (Bb != null) {
                    e9jVar.b(Bb);
                    return;
                }
                return;
            }
            if (sxpVar2 instanceof OnCacheInvalidateEvent) {
                l8jVar.Y0(Source.CACHE);
                return;
            }
            if (sxpVar2 instanceof p680) {
                l8jVar.Y0(Source.ACTUAL);
                return;
            }
            if (sxpVar2 instanceof h480) {
                h480 h480Var = (h480) sxpVar2;
                long j = h480Var.b;
                Peer peer2 = h480Var.c;
                ProfilesInfo profilesInfo = h480Var.d;
                if (epx.f(peer, peer2)) {
                    qtd0 Bb2 = profilesInfo.Bb(peer2);
                    if (Bb2 == null || (str = Bb2.name()) == null) {
                        str = "";
                    }
                    edw edwVar = edw.a;
                    edw.e(l8jVar.i, str, new k8j(l8jVar, j, peer2));
                }
            }
        }
    }

    /* compiled from: ContactComponent.kt */
    public final class b implements lkr0 {
        public b() {
        }

        @Override // xsna.lkr0
        public final void a() {
            ImContactFragment.b bVar = l8j.this.o;
            if (bVar != null) {
                ImContactFragment.this.finish();
            }
        }

        @Override // xsna.lkr0
        public final void b() {
            l8j l8jVar = l8j.this;
            o0w b = l8jVar.k.b();
            Context context = l8jVar.i;
            e9j e9jVar = l8jVar.r;
            o0w.x(b, context, null, e9jVar.f.P0().a, e9jVar.h, null, null, false, null, null, null, null, null, null, "contact", null, null, null, false, null, null, null, null, null, 1073733618);
        }

        @Override // xsna.lkr0
        public final void c() {
            l8j l8jVar = l8j.this;
            l8jVar.k.b().O(l8jVar.m, "contact_screen", l8jVar.r.a, null);
        }

        @Override // xsna.lkr0
        public final void d() {
            l8j l8jVar = l8j.this;
            l8jVar.k.k().e(l8jVar.i, l8jVar.r.f.P0().e);
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((laj) this.receiver).d(th);
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            bool.getClass();
            ((laj) this.receiver).getClass();
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            bool.getClass();
            ((laj) this.receiver).getClass();
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            ((laj) this.receiver).b(bool.booleanValue());
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            bool.getClass();
            ((laj) this.receiver).getClass();
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<qtd0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(qtd0 qtd0Var) {
            ((laj) this.receiver).h(qtd0Var);
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            ((laj) this.receiver).getClass();
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            ((laj) this.receiver).g(str);
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements izs<VerifyInfo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(VerifyInfo verifyInfo) {
            ((laj) this.receiver).getClass();
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            ((laj) this.receiver).i(str);
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            ((laj) this.receiver).getClass();
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            bool.getClass();
            ((laj) this.receiver).getClass();
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            ((laj) this.receiver).e(bool.booleanValue());
            return s3q0.a;
        }
    }

    /* compiled from: ContactComponent.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            ((laj) this.receiver).f(bool.booleanValue());
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(l8j.class, "vc", "getVc()Lcom/vk/im/ui/components/contact/vc/ContactVc;", 0);
        fpf0.a.getClass();
        s = new qcy[]{propertyReference1Impl};
    }

    public l8j(Context context, a1w a1wVar, mxv mxvVar, ImageViewer imageViewer, jbs jbsVar, Peer peer, b25 b25Var) {
        this.i = context;
        this.j = a1wVar;
        this.k = mxvVar;
        this.l = imageViewer;
        this.m = jbsVar;
        this.n = peer;
        this.q = new bzb0(context);
        this.r = new e9j(peer, context, new gp80(context), new g3a0(), b25Var);
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        this.p.d();
        X0().j(new b());
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        a1wVar.D(this, new ebj(this, Collections.singleton(this.n)));
        View c2 = X0().c(layoutInflater.getContext(), viewGroup);
        a1w a1wVar2 = this.j;
        I0(a1wVar2.B(this, new uqm(new sqm(this.n, Source.CACHE, true, (Object) null, 24)), a1wVar2.r().H, new h60(this, 19), new pv2(X0(), 13)));
        return c2;
    }

    @Override // xsna.j8i
    public final void N0() {
        X0().j(null);
        this.q.a();
        this.p.a();
    }

    @Override // xsna.j8i
    public final void Q0() {
        e9j e9jVar = this.r;
        io.reactivex.rxjava3.subjects.d<nlq0> dVar = e9jVar.f;
        int i2 = 8;
        qj4 qj4Var = new qj4(new g53(12), i2);
        dVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, qj4Var).U(new cr(new af2(11), i2));
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(U, qVar, aVar).subscribe(new az(new h(1, X0(), laj.class, "showUserAvatar", "showUserAvatar(Lcom/vk/im/engine/models/Profile;)V", 0), 20)), this);
        io.reactivex.rxjava3.subjects.d<nlq0> dVar2 = e9jVar.f;
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new iu4(l9j.b, 8)), qVar, aVar).subscribe(new iu1(new i(1, X0(), laj.class, "showStatus", "showStatus(Ljava/lang/String;)V", 0), 12)), this);
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new zj0(m9j.b, 10)), qVar, aVar).subscribe(new n20(new j(1, X0(), laj.class, "showName", "showName(Ljava/lang/String;)V", 0), 18)), this);
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new nz(n9j.b, 14)), qVar, aVar).subscribe(new bn3(new k(1, X0(), laj.class, "showVerified", "showVerified(Lcom/vk/dto/common/VerifyInfo;)V", 0), 19)), this);
        j9j j9jVar = j9j.b;
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new e40(j9jVar, 8)), qVar, aVar).subscribe(new f60(new l(1, X0(), laj.class, "showPhone", "showPhone(Ljava/lang/String;)V", 0), 18)), this);
        k9j k9jVar = k9j.b;
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new d9(k9jVar, 9)), qVar, aVar).subscribe(new tf1(new m(1, X0(), laj.class, "showPageLink", "showPageLink(Ljava/lang/String;)V", 0), 15)), this);
        k15.e(io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new e40(j9jVar, 8)), qVar, aVar), new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new d9(k9jVar, 9)), qVar, aVar), new io.reactivex.rxjava3.internal.operators.mixed.j(10)).subscribe(new com.vk.im.ui.components.dialogs_list.b(new n(1, X0(), laj.class, "showInfoSection", "showInfoSection(Z)V", 0), 17)), this);
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new sj4(h9j.b, 9)), qVar, aVar).subscribe(new um0(new o(1, X0(), laj.class, "setMessageEnabled", "setMessageEnabled(Z)V", 0), 21)), this);
        X0().getClass();
        X0().getClass();
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new ezh(g9j.b, 1)), qVar, aVar).subscribe(new eu0(new p(1, X0(), laj.class, "setInviteToChatsVisible", "setInviteToChatsVisible(Z)V", 0), 17)), this);
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new c9j(i9j.b)), qVar, aVar).subscribe(new wf1(new d(1, X0(), laj.class, "setNotificationEnabled", "setNotificationEnabled(Z)V", 0), 17)), this);
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new x34(f9j.b, 10)), qVar, aVar).subscribe(new ho1(new e(1, X0(), laj.class, "setBlocked", "setBlocked(Z)V", 0), 17)), this);
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(e9jVar.g.a0(io.reactivex.rxjava3.android.schedulers.a.b()), qVar, aVar).subscribe(new cz(new f(1, X0(), laj.class, "showLoading", "showLoading(Z)V", 0), 19)), this);
        k15.e(dVar2.U(new do3(new d9j(e9jVar, 0), 11)).subscribe(new ez(new com.vk.movika.sdk.base.observable.g(this, 28), 17)), this);
        k15.e(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2.U(new pj4(new rd1(11), 16)), qVar, aVar).subscribe(new gn0(new g(1, X0(), laj.class, "setThemeChangeAvailable", "setThemeChangeAvailable(Z)V", 0), 16)), this);
        k15.e(this.j.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new a()), this);
    }

    public final laj X0() {
        qcy<Object> qcyVar = s[0];
        return (laj) this.p.b();
    }

    public final void Y0(Source source) {
        I0(this.j.E(this, new uqm(new sqm(this.n, source, true, (Object) null, 24))).subscribe(new ff3(new omf(this, 7), 11), new ov2(new c(1, X0(), laj.class, "showNotification", "showNotification(Ljava/lang/Throwable;)V", 0), 14)));
    }
}
