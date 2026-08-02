package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.reporters.api.analytics.click.ImCallClickAnalyticsItem;
import com.vk.network.kbh.state.NetworkState;
import com.vk.toggle.features.ImFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.hg1;
import xsna.kwm;
import xsna.mwv;
import xsna.owm;

/* compiled from: DialogsToolbarFeature.kt */
/* loaded from: classes18.dex */
public final class hwm extends di6<pwm, owm, Object, kwm> {
    public final ko8 h;
    public final d7p i;
    public final mwv<mwv.a> j;
    public final boolean k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hwm(ei3 ei3Var, mwm mwmVar, ko8 ko8Var, d7p d7pVar, bwm bwmVar, mwv mwvVar, io.reactivex.rxjava3.core.q qVar, boolean z) {
        super(new pwm(r5, z, r7, false, 0, false, new vzo0(""), false, 0, false, "", null, null, null, false));
        boolean z2;
        boolean z3 = !z;
        if (z) {
            ImFeatures imFeatures = ImFeatures.GROUP_TAGS;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures)) {
                z2 = true;
                this.h = ko8Var;
                this.i = d7pVar;
                this.j = mwvVar;
                this.k = z;
                io.reactivex.rxjava3.core.w b = io.reactivex.rxjava3.schedulers.a.b();
                b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
                io.reactivex.rxjava3.core.w wVar = mwmVar.d;
                a.q qVar2 = io.reactivex.rxjava3.internal.functions.a.a;
                a1w a1wVar = mwmVar.b;
                zxp zxpVar = a1wVar.l;
                io.reactivex.rxjava3.core.t p0 = zxpVar.a().b0(u180.class).U(new cq(9, new tb4(19))).v0(1L, TimeUnit.SECONDS).p0(ixv.e);
                io.reactivex.rxjava3.core.q<a1s> qVar3 = mwmVar.c;
                hg1.e1 e1Var = new hg1.e1();
                qVar3.getClass();
                int i = 13;
                io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(p0, io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(new ob80(FolderType.DEFAULT)), new io.reactivex.rxjava3.internal.operators.observable.i0(qVar3, e1Var)), new ca6(new twa((byte) 0, 2), i));
                int i2 = 22;
                z7 z7Var = new z7(new log(3), i2);
                m.getClass();
                io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(m, qVar2, z7Var);
                Peer q = a1wVar.q();
                q.getClass();
                io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.a0(io.reactivex.rxjava3.core.q.m(yVar, !q.Ab(Peer.Type.GROUP) ? new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(zxpVar.a().b0(ka80.class), new n7(new i4e(mwmVar, i2), i2)).U(new rf1(new a60(26), 20)).Y(new io.reactivex.rxjava3.internal.operators.observable.o0(new io.reactivex.rxjava3.internal.operators.observable.i0(zxpVar.a().b0(p680.class), new q7(new ht(22), 17)), new s7(new j6e(mwmVar, 18), 12)).o0(a1wVar.C(mwmVar, new tpu(Collections.singletonList(a1wVar.q()), Source.CACHE, false, 12)))).U(new aa6(new p4f(mwmVar, 21), 17)), qVar2, aVar) : new io.reactivex.rxjava3.internal.operators.observable.y(zxpVar.a().a0(io.reactivex.rxjava3.schedulers.a.b()).b0(s080.class).U(new kq(new yy(25), 11)).n0(io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(new xpp()), a1wVar.C(mwmVar, new vo(Source.CACHE, false)).q(io.reactivex.rxjava3.schedulers.a.b()).w())).U(new l7(new n6f(mwmVar, i), 19)), qVar2, aVar), new v20(new nwm(2, mwmVar, mwm.class, "mapStateToTitle", "mapStateToTitle(Lkotlin/Pair;Lcom/vk/dialogstoolbar/impl/DialogsToolbarTitleProviderImpl$Info;)Lcom/vk/dialogstoolbar/api/Title;", 0), 19)).r0(wVar).a0(wVar), new uy3(mwmVar, 5)).a0(b).r0(b);
                mf1 mf1Var = new mf1(this, 21);
                a.n nVar = io.reactivex.rxjava3.internal.functions.a.e;
                i(r0, nVar, mf1Var);
                i(ei3Var.a().a0(b), nVar, new j50(this, 19));
                i(ko8Var.a().a0(b), nVar, new nf1(this, 27));
                i(bwmVar.a().a0(b), nVar, new sh6(this, 18));
                i(qVar.a0(b), nVar, new l50(this, 19));
                a1w a1wVar2 = q1w.a;
                cau0 cau0Var = (a1wVar2 == null ? null : a1wVar2).r().h;
            }
        }
        z2 = false;
        this.h = ko8Var;
        this.i = d7pVar;
        this.j = mwvVar;
        this.k = z;
        io.reactivex.rxjava3.core.w b2 = io.reactivex.rxjava3.schedulers.a.b();
        b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.core.w wVar2 = mwmVar.d;
        a.q qVar22 = io.reactivex.rxjava3.internal.functions.a.a;
        a1w a1wVar3 = mwmVar.b;
        zxp zxpVar2 = a1wVar3.l;
        io.reactivex.rxjava3.core.t p02 = zxpVar2.a().b0(u180.class).U(new cq(9, new tb4(19))).v0(1L, TimeUnit.SECONDS).p0(ixv.e);
        io.reactivex.rxjava3.core.q<a1s> qVar32 = mwmVar.c;
        hg1.e1 e1Var2 = new hg1.e1();
        qVar32.getClass();
        int i3 = 13;
        io.reactivex.rxjava3.core.q m2 = io.reactivex.rxjava3.core.q.m(p02, io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(new ob80(FolderType.DEFAULT)), new io.reactivex.rxjava3.internal.operators.observable.i0(qVar32, e1Var2)), new ca6(new twa((byte) 0, 2), i3));
        int i22 = 22;
        z7 z7Var2 = new z7(new log(3), i22);
        m2.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar2 = new io.reactivex.rxjava3.internal.operators.observable.y(m2, qVar22, z7Var2);
        Peer q2 = a1wVar3.q();
        q2.getClass();
        io.reactivex.rxjava3.internal.operators.observable.l2 r02 = new io.reactivex.rxjava3.internal.operators.observable.a0(io.reactivex.rxjava3.core.q.m(yVar2, !q2.Ab(Peer.Type.GROUP) ? new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(zxpVar2.a().b0(ka80.class), new n7(new i4e(mwmVar, i22), i22)).U(new rf1(new a60(26), 20)).Y(new io.reactivex.rxjava3.internal.operators.observable.o0(new io.reactivex.rxjava3.internal.operators.observable.i0(zxpVar2.a().b0(p680.class), new q7(new ht(22), 17)), new s7(new j6e(mwmVar, 18), 12)).o0(a1wVar3.C(mwmVar, new tpu(Collections.singletonList(a1wVar3.q()), Source.CACHE, false, 12)))).U(new aa6(new p4f(mwmVar, 21), 17)), qVar22, aVar2) : new io.reactivex.rxjava3.internal.operators.observable.y(zxpVar2.a().a0(io.reactivex.rxjava3.schedulers.a.b()).b0(s080.class).U(new kq(new yy(25), 11)).n0(io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(new xpp()), a1wVar3.C(mwmVar, new vo(Source.CACHE, false)).q(io.reactivex.rxjava3.schedulers.a.b()).w())).U(new l7(new n6f(mwmVar, i3), 19)), qVar22, aVar2), new v20(new nwm(2, mwmVar, mwm.class, "mapStateToTitle", "mapStateToTitle(Lkotlin/Pair;Lcom/vk/dialogstoolbar/impl/DialogsToolbarTitleProviderImpl$Info;)Lcom/vk/dialogstoolbar/api/Title;", 0), 19)).r0(wVar2).a0(wVar2), new uy3(mwmVar, 5)).a0(b2).r0(b2);
        mf1 mf1Var2 = new mf1(this, 21);
        a.n nVar2 = io.reactivex.rxjava3.internal.functions.a.e;
        i(r02, nVar2, mf1Var2);
        i(ei3Var.a().a0(b2), nVar2, new j50(this, 19));
        i(ko8Var.a().a0(b2), nVar2, new nf1(this, 27));
        i(bwmVar.a().a0(b2), nVar2, new sh6(this, 18));
        i(qVar.a0(b2), nVar2, new l50(this, 19));
        a1w a1wVar22 = q1w.a;
        cau0 cau0Var2 = (a1wVar22 == null ? null : a1wVar22).r().h;
    }

    @Override // xsna.di6
    public final void d(owm owmVar) {
        owm owmVar2 = owmVar;
        if (owmVar2.equals(owm.a.b)) {
            m(kwm.a.a);
            return;
        }
        if (owmVar2 instanceof owm.i) {
            if (d6q0.t == NetworkState.UNSTABLE) {
                cvk.t();
                return;
            }
            SearchMode searchMode = SearchMode.CHANNELS;
            if (g().n != FolderType.CHANNELS) {
                searchMode = null;
            }
            m(new kwm.h(searchMode));
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (owmVar2.equals(owm.f.b)) {
            m(kwm.d.a);
            return;
        }
        if (owmVar2.equals(owm.j.b)) {
            q(new com.vk.movika.sdk.base.logic.interactor.f(19));
            return;
        }
        if (owmVar2.equals(owm.k.b)) {
            q(new com(1));
            return;
        }
        if (owmVar2 instanceof owm.l) {
            m(new kwm.j(((owm.l) owmVar2).b));
            return;
        }
        if (owmVar2.equals(owm.b.b)) {
            m(new kwm.f(g().m));
            return;
        }
        if (owmVar2.equals(owm.c.b)) {
            if (this.k) {
                return;
            }
            m(kwm.i.a);
            return;
        }
        if (owmVar2.equals(owm.g.b)) {
            if (d6q0.t == NetworkState.UNSTABLE) {
                cvk.t();
                return;
            }
            this.j.a(new ImCallClickAnalyticsItem.g(ImCallClickAnalyticsItem.Source.IM_TOOLBAR));
            m(kwm.e.a);
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        if (owmVar2.equals(owm.e.b)) {
            m(kwm.b.a);
        } else if (owmVar2.equals(owm.h.b)) {
            m(kwm.g.a);
        } else {
            if (!owmVar2.equals(owm.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m(kwm.c.a);
        }
    }
}
