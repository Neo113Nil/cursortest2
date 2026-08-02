package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.huawei.hms.support.sms.common.ReadSmsConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.di.scope.ImScope;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.im.ui.fragments.ImChatSettingsFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cwb0;
import xsna.dqb;
import xsna.ftb;
import xsna.g1e0;
import xsna.gpz;
import xsna.rj0;
import xsna.smb;
import xsna.yyb;

/* compiled from: ChatSettingsComponent.kt */
/* loaded from: classes2.dex */
public final class xyb extends j8i implements ftb.a, smb.a, dqb.a {
    public static final f9w C = e9w.a(xyb.class);
    public static final String D = xyb.class.getSimpleName();
    public azb A;
    public ImChatSettingsFragment.a B;
    public final Context i;
    public final a1w j;
    public final f1w k;
    public final lzv l;
    public final xbw m;
    public final mxv n;
    public final io.reactivex.rxjava3.disposables.b o = new io.reactivex.rxjava3.disposables.b();
    public final AtomicBoolean p = new AtomicBoolean(false);
    public zyb q;
    public io.reactivex.rxjava3.disposables.c r;
    public io.reactivex.rxjava3.disposables.c s;
    public io.reactivex.rxjava3.disposables.c t;
    public io.reactivex.rxjava3.disposables.c u;
    public io.reactivex.rxjava3.disposables.c v;
    public io.reactivex.rxjava3.disposables.c w;
    public final ftb x;
    public final smb y;
    public final dqb z;

    /* compiled from: ChatSettingsComponent.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<gpz.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gpz.a aVar) {
            gpz.a aVar2 = aVar;
            xyb xybVar = (xyb) this.receiver;
            xybVar.q = zyb.a(xybVar.q, xyb.Z0(new DialogExt(aVar2.a, aVar2.c)), false, false, aVar2.b, false, null, 1790);
            xybVar.X0();
            azb azbVar = xybVar.A;
            if (azbVar != null) {
                xybVar.a1(azbVar);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ChatSettingsComponent.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            xyb xybVar = (xyb) this.receiver;
            f9w f9wVar = xyb.C;
            xybVar.getClass();
            xyb.C.a(th2);
            if (xybVar.A != null) {
                zk70.e(th2);
            }
            return s3q0.a;
        }
    }

    public xyb(Context context, a1w a1wVar, ImScope imScope, f1w f1wVar, lzv lzvVar, xbw xbwVar, mxv mxvVar, long j, jbs jbsVar) {
        this.i = context;
        this.j = a1wVar;
        this.k = f1wVar;
        this.l = lzvVar;
        this.m = xbwVar;
        this.n = mxvVar;
        this.q = new zyb(new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null), f1wVar.a(), BuildInfo.t(), IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        Peer peer = this.q.a.f;
        String str = D;
        this.x = new ftb(imScope, lzvVar, peer, this, str);
        com.vk.movika.sdk.base.logic.processor.actions.d dVar = new com.vk.movika.sdk.base.logic.processor.actions.d(this, 11);
        this.y = new smb(dVar, jbsVar, this, f1wVar, lzvVar, mxvVar, 38919, str);
        this.z = new dqb(dVar, lzvVar, this, str);
    }

    public static DialogExt Z0(DialogExt dialogExt) {
        return new DialogExt(dialogExt.d, dialogExt.b, null, 4, null);
    }

    @Override // xsna.ftb.a
    public final void A0() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().c(new cwb0.s0(null, 0, 7), null);
        }
    }

    @Override // xsna.smb.a
    public final void I(AvatarAction avatarAction) {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.c(avatarAction);
        }
    }

    @Override // xsna.ftb.a
    public final void K() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().c(cwb0.y0.e, new ah(azbVar, 15));
        }
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        int a2;
        azb azbVar = this.A;
        if (azbVar != null) {
            if (configuration.orientation == 2) {
                Context context = azbVar.b;
                HashSet hashSet = iah0.a;
                if (fnj.d(context)) {
                    a2 = configuration.screenWidthDp >= 924 ? iah0.a(Math.max(16, (r6 - 924) / 2)) : 0;
                    azbVar.e.setPadding(a2, 0, a2, iah0.a(8));
                }
            }
            a2 = iah0.a(-2);
            azbVar.e.setPadding(a2, 0, a2, iah0.a(8));
        }
    }

    @Override // xsna.smb.a
    public final void L(Throwable th) {
        C.a(th);
        if (this.A != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        azb azbVar = new azb(this.k.a(), layoutInflater, viewGroup);
        this.A = azbVar;
        azbVar.k = new tsu(this);
        a1(azbVar);
        return this.A.c;
    }

    @Override // xsna.j8i
    public final void M0() {
        if (this.q.e) {
            d1();
        }
    }

    @Override // xsna.ftb.a
    public final void N() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().c(cwb0.d.e, new pu(azbVar, 20));
        }
    }

    @Override // xsna.j8i
    public final void N0() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.k = null;
        }
        if (azbVar != null) {
            azbVar.a().a();
        }
        this.A = null;
    }

    @Override // xsna.j8i
    public final void O0(Bundle bundle) {
        azb azbVar = this.A;
        if (azbVar != null) {
            String string = bundle != null ? bundle.getString("CUSTOM_TITLE") : null;
            azbVar.j = string;
            ryb rybVar = azbVar.h;
            rybVar.l = string;
            if (rybVar.getItemCount() > 0) {
                rybVar.notifyItemChanged(0);
            }
        }
    }

    @Override // xsna.ftb.a
    public final void P(Throwable th) {
        C.a(th);
        if (this.A != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.j8i
    public final void P0(Bundle bundle) {
        azb azbVar = this.A;
        if (azbVar != null) {
            bundle.putString("CUSTOM_TITLE", azbVar.j);
        }
    }

    @Override // xsna.ftb.a
    public final void T() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.b();
        }
    }

    @Override // xsna.ftb.a
    public final void V() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.b();
        }
    }

    @Override // xsna.dqb.a
    public final void W() {
        e1();
    }

    @Override // xsna.smb.a
    public final void X(List<? extends AvatarAction> list) {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().b(new cwb0.e((ArrayList) list), new g60(azbVar, 24), null);
        }
    }

    public final void X0() {
        if (this.q.a.b.Gb()) {
            zyb zybVar = this.q;
            if (zybVar.h) {
                return;
            }
            this.q = zyb.a(zybVar, null, false, true, null, false, null, 1919);
            g1e0.a aVar = new g1e0.a();
            aVar.a.e(this.q.a.b.Ab());
            aVar.b = Source.ACTUAL;
            aVar.c = true;
            aVar.d = D;
            int i = 0;
            this.o.b(this.l.b(this, new d1e0(new g1e0(aVar))).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m5(new qi3(1, this, xyb.class, "onUpdateInconsistentMembersInfoSuccess", "onUpdateInconsistentMembersInfoSuccess(Lcom/vk/im/engine/models/ProfilesInfo;)V", i, 5), 13), new j41(new ud8(1, this, xyb.class, "onUpdateInconsistentMembersInfoError", "onUpdateInconsistentMembersInfoError(Ljava/lang/Throwable;)V", i, 4), 9)));
        }
    }

    public final void Y0() {
        if (!this.p.compareAndSet(false, true)) {
            C.debug(new pr0(5));
            return;
        }
        this.o.b(this.l.a("loadMore", new gpz(this.q.a.e, D, true), new k5(this, 8), new c40(this, 11)));
    }

    public final void a1(azb azbVar) {
        List<? extends hfz> list;
        Dialog Cb;
        ChatSettings Hb;
        Dialog Cb2 = this.q.a.Cb();
        if (Cb2 == null) {
            azbVar.d();
        } else {
            zyb zybVar = this.q;
            if (zybVar.d || zybVar.f) {
                ohm ohmVar = zybVar.i;
                boolean z = zybVar.j;
                DialogExt dialogExt = zybVar.a;
                ProfilesInfo profilesInfo = dialogExt.b;
                Peer peer = zybVar.b;
                boolean z2 = zybVar.c && (Cb = dialogExt.Cb()) != null && (Hb = Cb.Hb()) != null && Hb.t;
                azbVar.d.setVisibility(8);
                azbVar.f.setVisibility(8);
                azbVar.e.setVisibility(0);
                ryb rybVar = azbVar.h;
                rybVar.getClass();
                rybVar.j = Cb2;
                rybVar.k = profilesInfo;
                ChatSettings Hb2 = Cb2.Hb();
                if (Hb2 == null) {
                    list = EmptyList.b;
                } else {
                    ArrayList arrayList = new ArrayList(ohmVar.b.size() + 20);
                    boolean z3 = z2 && (epx.f(Hb2.d, peer) || Hb2.e.contains(peer)) && !Hb2.g;
                    String str = rybVar.l;
                    ProfilesInfo profilesInfo2 = rybVar.k;
                    a1w a1wVar = q1w.a;
                    if (a1wVar == null) {
                        a1wVar = null;
                    }
                    a1wVar.r().getClass();
                    arrayList.add(new yyb.b(Cb2, peer, str, profilesInfo2, z3));
                    p4g.a(new yyb.g(Cb2, Hb2.f, false), arrayList, Hb2.Q);
                    if (!Cb2.tc()) {
                        rj0.a(arrayList, Cb2, Hb2, new rj0.a(ohmVar, rybVar.k, peer, z, false), false);
                    }
                    list = arrayList;
                }
                rybVar.setItems(list);
                ryb rybVar2 = azbVar.h;
                rybVar2.l = azbVar.j;
                if (rybVar2.getItemCount() > 0) {
                    rybVar2.notifyItemChanged(0);
                }
            } else {
                if (!zybVar.g) {
                    throw new IllegalStateException("Unexpected init state");
                }
                Throwable th = zybVar.k;
                azbVar.d.setVisibility(8);
                azbVar.e.setVisibility(8);
                azbVar.f.setVisibility(0);
                azbVar.g.setText(zk70.b(th));
            }
        }
        if (hg1.d(this.y.l)) {
            azbVar.c(AvatarAction.CHANGE_BY_GALLERY);
        }
        if (hg1.d(this.y.m)) {
            azbVar.c(AvatarAction.REMOVE);
        }
        if (hg1.d(this.z.f)) {
            azbVar.a().c(cwb0.k.e, new bu1(azbVar, 8));
        }
        if (hg1.d(this.r)) {
            azbVar.a().c(cwb0.b.e, new m4(azbVar, 15));
        }
        if (hg1.d(this.s)) {
            azbVar.a().c(new cwb0.p(null), new ry0(azbVar, 14));
        }
        if (hg1.d(this.x.g)) {
            azbVar.a().c(cwb0.e0.e, new yg(azbVar, 15));
        }
        if (hg1.d(this.x.h)) {
            azbVar.a().c(cwb0.y0.e, new ah(azbVar, 15));
        }
        if (hg1.d(this.t)) {
            bzb0 a2 = azbVar.a();
            ryb rybVar3 = azbVar.h;
            rybVar3.getClass();
            a2.c(new cwb0.g0(new DialogExt(rybVar3.j, rybVar3.k)), new com.vk.movika.sdk.base.logic.processor.h(azbVar, 11));
        }
        if (hg1.d(this.v)) {
            bzb0 a3 = azbVar.a();
            ryb rybVar4 = azbVar.h;
            rybVar4.getClass();
            a3.c(new cwb0.v0(new DialogExt(rybVar4.j, rybVar4.k)), new zg(azbVar, 20));
        }
        if (this.w != null) {
            azbVar.a().c(cwb0.t.e, null);
        }
        if (hg1.d(this.z.g)) {
            azbVar.a().c(cwb0.j.e, null);
        }
        if (hg1.d(this.x.i)) {
            azbVar.a().c(cwb0.d.e, new pu(azbVar, 20));
        }
        if (hg1.d(this.x.j)) {
            azbVar.a().c(cwb0.c.e, new com.vk.movika.sdk.base.logic.processor.actions.i(azbVar, 10));
        }
        if (hg1.d(this.u)) {
            azbVar.a().c(new cwb0.x(), new il1(azbVar, 13));
        }
        if (hg1.d(this.x.k)) {
            azbVar.a().c(new cwb0.s0(null, 0, 7), null);
        }
        if (hg1.d(this.x.l)) {
            azbVar.a().c(new cwb0.s0(null, 0, 7), null);
        }
    }

    public final void b1(int i, ArrayList arrayList) {
        if (arrayList.isEmpty() || hg1.d(this.r)) {
            return;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        io.reactivex.rxjava3.internal.operators.single.b0 m = this.l.b(this, new urm(Peer.a.b(this.q.a.e), arrayList, null, i, null, false, D, 20)).m(io.reactivex.rxjava3.android.schedulers.a.b());
        int i2 = 11;
        this.r = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(m, new k41(new h5(this, 24), i2)), new ueb(this, 1)).subscribe(new nf1(new t6(this, 19), i2), new pf1(new fm0(this, 17), 6));
    }

    @Override // xsna.smb.a
    public final void c0() {
        e1();
    }

    public final void c1(DialogExt dialogExt) {
        DialogExt Z0 = Z0(dialogExt);
        this.q = zyb.a(this.q, Z0, true, false, null, false, null, ReadSmsConstant.FAIL);
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.m.a().a0(io.reactivex.rxjava3.android.schedulers.a.b());
        long j = this.q.a.e;
        io.reactivex.rxjava3.disposables.c subscribe = a0.subscribe(new oyp(this));
        io.reactivex.rxjava3.disposables.b bVar = this.o;
        bVar.b(subscribe);
        azb azbVar = this.A;
        if (azbVar != null) {
            a1(azbVar);
        }
        bVar.b(this.l.a("startObserve", new gpz(Z0.e, D, false), new ji3(this, 11), new kl6(this, 4)));
    }

    public final void d1() {
        smb smbVar = this.y;
        smbVar.a();
        io.reactivex.rxjava3.disposables.c cVar = smbVar.m;
        if (cVar != null) {
            cVar.dispose();
        }
        dqb dqbVar = this.z;
        io.reactivex.rxjava3.disposables.c cVar2 = dqbVar.f;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.r;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.s;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        ftb ftbVar = this.x;
        io.reactivex.rxjava3.disposables.c cVar5 = ftbVar.g;
        if (cVar5 != null) {
            cVar5.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar6 = ftbVar.h;
        if (cVar6 != null) {
            cVar6.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar7 = this.t;
        if (cVar7 != null) {
            cVar7.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar8 = this.v;
        if (cVar8 != null) {
            cVar8.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar9 = dqbVar.g;
        if (cVar9 != null) {
            cVar9.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar10 = ftbVar.i;
        if (cVar10 != null) {
            cVar10.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar11 = ftbVar.j;
        if (cVar11 != null) {
            cVar11.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar12 = this.u;
        if (cVar12 != null) {
            cVar12.dispose();
        }
        this.o.e();
        this.p.compareAndSet(true, false);
        this.q = new zyb(new DialogExt(0L, (ProfilesInfo) null, 2, (zcl) null), this.q.b, false, 2044);
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.d();
        }
    }

    @Override // xsna.dqb.a
    public final void e0() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().a();
        }
    }

    public final void e1() {
        zyb zybVar = this.q;
        if (zybVar.f) {
            this.o.b(this.l.b(this, new gpz(zybVar.a.e, D, false)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bf2(new a(1, this, xyb.class, "onUpdateAllByCacheSuccess", "onUpdateAllByCacheSuccess(Lcom/vk/im/ui/components/chat_settings/LoadFullCmd$Result;)V", 0), 9), new sv(new b(1, this, xyb.class, "onUpdateAllByCacheError", "onUpdateAllByCacheError(Ljava/lang/Throwable;)V", 0), 12)));
        }
    }

    @Override // xsna.ftb.a
    public final void h0(Throwable th) {
        C.a(th);
        if (this.A != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.dqb.a
    public final void i(NotifyId notifyId) {
        if (this.A != null) {
            zk70.c(notifyId);
        }
    }

    @Override // xsna.dqb.a
    public final void i0(Throwable th) {
        C.a(th);
        if (this.A != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.ftb.a
    public final void j() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.b();
        }
    }

    @Override // xsna.dqb.a
    public final void k() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().c(cwb0.j.e, null);
        }
    }

    @Override // xsna.ftb.a
    public final void k0() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().c(cwb0.c.e, new com.vk.movika.sdk.base.logic.processor.actions.i(azbVar, 10));
        }
    }

    @Override // xsna.ftb.a
    public final void l() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().c(cwb0.e0.e, new yg(azbVar, 15));
        }
    }

    @Override // xsna.dqb.a
    public final void m() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().c(cwb0.k.e, new bu1(azbVar, 8));
        }
    }

    @Override // xsna.ftb.a
    public final void n0() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.b();
        }
    }

    @Override // xsna.ftb.a
    public final void q(Throwable th) {
        C.a(th);
        if (this.A != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.ftb.a
    public final void r(Throwable th) {
        C.a(th);
        if (this.A != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.ftb.a
    public final void r0() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.b();
        }
    }

    @Override // xsna.ftb.a
    public final void s() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.b();
        }
    }

    @Override // xsna.ftb.a
    public final void s0(Throwable th) {
        C.a(th);
        if (this.A != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.smb.a
    public final void t() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.b();
        }
    }

    @Override // xsna.ftb.a
    public final void u0(Throwable th) {
        C.a(th);
        if (this.A != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.dqb.a
    public final void w() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.b();
        }
    }

    @Override // xsna.dqb.a
    public final void w0(Throwable th) {
        C.a(th);
        if (this.A != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.ftb.a
    public final void x0() {
        azb azbVar = this.A;
        if (azbVar != null) {
            azbVar.a().c(new cwb0.s0(null, 0, 7), null);
        }
    }

    @Override // xsna.dqb.a
    public final void g0() {
    }
}
