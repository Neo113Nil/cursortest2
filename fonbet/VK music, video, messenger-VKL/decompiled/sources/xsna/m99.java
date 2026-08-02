package xsna;

import android.content.Context;
import android.content.Intent;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vk.voip.b;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.bo0;
import xsna.c99;
import xsna.ca9;
import xsna.d99;
import xsna.epw0;
import xsna.go0;
import xsna.srw0;
import xsna.t0y;
import xsna.xaz;

/* compiled from: CallSettingsFeature.kt */
/* loaded from: classes7.dex */
public final class m99 implements pdw0 {
    public i99 A;
    public final c B;
    public final b C;
    public final Context a;
    public final ma9 b;
    public final a1w c;
    public final com.vk.voip.b d;
    public final ga9 e;
    public final io.reactivex.rxjava3.subjects.d<s99> f = io.reactivex.rxjava3.subjects.d.O0(new s99(0));
    public final io.reactivex.rxjava3.subjects.f<d99> g = new io.reactivex.rxjava3.subjects.f<>();
    public final odw0 h = new odw0();
    public final io.reactivex.rxjava3.core.w i;
    public final io.reactivex.rxjava3.core.w j;
    public final io.reactivex.rxjava3.subjects.f<s3q0> k;
    public final bpn0 l;
    public boolean m;
    public io.reactivex.rxjava3.disposables.b n;
    public io.reactivex.rxjava3.disposables.c o;
    public io.reactivex.rxjava3.disposables.c p;
    public io.reactivex.rxjava3.disposables.c q;
    public io.reactivex.rxjava3.disposables.c r;
    public io.reactivex.rxjava3.disposables.c s;
    public final io.reactivex.rxjava3.disposables.c t;
    public final io.reactivex.rxjava3.disposables.c u;
    public io.reactivex.rxjava3.disposables.c v;
    public io.reactivex.rxjava3.disposables.c w;
    public io.reactivex.rxjava3.disposables.c x;
    public io.reactivex.rxjava3.disposables.c y;
    public io.reactivex.rxjava3.disposables.b z;

    /* compiled from: CallSettingsFeature.kt */
    public static final class a<V> {
        public final V a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Boolean bool) {
            this.a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            V v = this.a;
            if (v == null) {
                return 0;
            }
            return v.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("Holder(value="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsFeature.kt */
    public static final class b implements b.InterfaceC2004b {
        public b() {
        }

        @Override // com.vk.voip.b.InterfaceC2004b
        public final void a(ArrayList arrayList, po70 po70Var) {
            c cVar = m99.this.B;
            String valueOf = String.valueOf(((UserId) j5g.X(arrayList)).b);
            m99 m99Var = m99.this;
            m99Var.w.dispose();
            m99Var.w = m99Var.h(valueOf, new ix2(po70Var, 12));
        }

        @Override // com.vk.voip.b.InterfaceC2004b
        public final void b(ArrayList arrayList) {
            c cVar = m99.this.B;
            String valueOf = String.valueOf(((UserId) j5g.X(arrayList)).b);
            m99 m99Var = m99.this;
            m99Var.v.dispose();
            m99Var.v = m99Var.h(valueOf, new l5(m99Var, 14));
        }
    }

    /* compiled from: CallSettingsFeature.kt */
    public static final class c {
        public c() {
        }
    }

    /* compiled from: CallSettingsFeature.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<ca9, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ca9 ca9Var) {
            ca9 ca9Var2 = ca9Var;
            m99 m99Var = (m99) this.receiver;
            m99Var.f(s99.a(m99Var.j(), null, null, ca9Var2, null, null, null, null, false, 251));
            return s3q0.a;
        }
    }

    /* compiled from: CallSettingsFeature.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            m99 m99Var = (m99) this.receiver;
            m99Var.f(s99.a(m99Var.j(), null, null, new ca9.a(th), null, null, null, null, false, 251));
            return s3q0.a;
        }
    }

    public m99(Context context, ma9 ma9Var, a1w a1wVar, com.vk.voip.b bVar) {
        this.a = context;
        this.b = ma9Var;
        this.c = a1wVar;
        this.d = bVar;
        this.e = new ga9(bVar);
        asu0 asu0Var = asu0.a;
        this.i = asu0Var.A(1, "CallSettingsFeature:contentLoad");
        this.j = asu0Var.d();
        this.k = new io.reactivex.rxjava3.subjects.f<>();
        this.l = new bpn0(new com.vk.movika.sdk.base.logic.interactor.h(this, 10));
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.o = emptyDisposable;
        this.p = emptyDisposable;
        this.t = emptyDisposable;
        this.u = emptyDisposable;
        this.v = emptyDisposable;
        this.w = emptyDisposable;
        this.x = emptyDisposable;
        this.y = emptyDisposable;
        this.B = new c();
        this.C = new b();
    }

    public static io.reactivex.rxjava3.subjects.f i() {
        return ysg0.b.a;
    }

    public static boolean m(Object obj) {
        return (obj instanceof h3x0) || (obj instanceof fjw0) || (obj instanceof chw0);
    }

    @Override // xsna.pdw0
    public final io.reactivex.rxjava3.core.q<mdw0> a() {
        return this.h.a.a0(this.i);
    }

    /* JADX WARN: Type inference failed for: r0v170, types: [xsna.i99] */
    public final void b(c99 c99Var) {
        MediaOptionState mediaOptionState;
        CallId callId;
        boolean z = this.m;
        if (!z && !(c99Var instanceof c99.n)) {
            throw new IllegalStateException("Not inited");
        }
        int i = 2;
        int i2 = 1;
        if (c99Var instanceof c99.n) {
            if (!z) {
                this.m = true;
                io.reactivex.rxjava3.subjects.f<s3q0> fVar = this.k;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.y = fVar.w0(500L, timeUnit).a0(this.j).subscribe(new pv2(new hb(this, 14), 4));
                this.x.dispose();
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider == null) {
                    voipDataProvider = null;
                }
                io.reactivex.rxjava3.subjects.f<whr0> fVar2 = voipDataProvider.j;
                fVar2.getClass();
                int i3 = 13;
                this.x = io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.z0(fVar2), null, null, new vl1(this, i3));
                io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
                dhw0 L = cVar.L();
                boolean z2 = L != null && L.r();
                ysg0<Object> ysg0Var = ysg0.b;
                int i4 = 8;
                int i5 = 7;
                int i6 = 5;
                io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a, new as(this, i4)).U(new p11(i5)).p0(com.vk.voip.ui.c.T0), io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(Long.valueOf(com.vk.voip.ui.c.K)), new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a, new rf3(this, i6)).U(new r11(7))), io.reactivex.rxjava3.kotlin.a.b);
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                m.getClass();
                b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(m, qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new mf1(new com.vk.voip.ui.menu.feature.a(this, i3), i6)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new l4(this, i4)).U(new nq(i6)), qVar, aVar).a0(this.j).subscribe(new ez(new h99(this, 0), 3)));
                io.reactivex.rxjava3.subjects.d<c8x0> dVar = com.vk.voip.ui.c.x;
                int i7 = 6;
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(dVar.a0(this.i), new com.vk.movika.sdk.base.ui.p0(new xx0(i6), i6)).U(new tp1(new ci3(4), 3)), qVar, aVar).a0(this.j).subscribe(new l50(new vs(this, i3), i7)));
                int i8 = 4;
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(dVar.a0(this.i), new y34(new sc(i8), i7)).U(new qs6(new xr0(i8), i)), qVar, aVar).a0(this.j).subscribe(new om1(new on(this, 10), i8)));
                int i9 = 12;
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new dr(this, i7)).U(new as(i5)), qVar, aVar).a0(this.j).subscribe(new ia(new ha(this, i9), 9)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new nr(this, 6)).U(new defpackage.j0(10)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new wn(new r9(this, i9), i4)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new ar(this, 4)).U(new br(8)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new sv(new sz(this, i5), i4)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new vq(this, 4)).U(new wq(7)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new v8(new tb(this, 19), i9)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new com.vk.movika.sdk.android.defaultplayer.view.a(this, i4)).U(new w11(i4)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new ff3(new sf1(this, i9), 3)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new at(this, i5)).U(new bt(i6)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new ji3(new g20(this, 11), i7)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new wr(this, 10)).U(new xr(i4)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new el6(new op1(this, 10), 4)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new to(this, i5)).U(new t11(i7)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new sf(new com.vk.movika.sdk.base.logic.interactor.p(this, i9), 9)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new ft0(new lw3(1, this, m99.class, "isVoipStateChangeEvent", "isVoipStateChangeEvent(Ljava/lang/Object;)Z", 0, 1), 5)).U(new ir(i7)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new ea(new p1(this, 14), 7)));
                int i10 = 0;
                int i11 = 4;
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new bl(new ui(1, this, m99.class, "isVoipStateChangeEvent", "isVoipStateChangeEvent(Ljava/lang/Object;)Z", i10, 3), 10)).U(new com.vk.movika.sdk.base.model.n(i11)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new eu0(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 11), 6)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new o7(new q99(1, this, m99.class, "isVoipStateChangeEvent", "isVoipStateChangeEvent(Ljava/lang/Object;)Z", i10, 0), 5)).U(new tf3(i11)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new n20(new e99(this, 0), 8)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new u11(this, 11)), new pm0(7)).U(new fq(i11)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new lz(new qu(this, 11), 8)));
                this.A = new ParticipantStatesManager.Listener() { // from class: xsna.i99
                    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
                    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
                        List<CallMemberId> list;
                        Set<ParticipantId> raisedHandIds = participantStatesManager.getRaisedHandIds();
                        ArrayList arrayList = new ArrayList(c5g.u(raisedHandIds, 10));
                        Iterator<T> it = raisedHandIds.iterator();
                        while (it.hasNext()) {
                            arrayList.add(mnh0.E((ParticipantId) it.next()));
                        }
                        m99 m99Var = m99.this;
                        ca9 ca9Var = m99Var.j().c;
                        ca9.c cVar2 = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
                        if (cVar2 != null && (list = cVar2.e) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (list.contains((CallMemberId) next)) {
                                    arrayList2.add(next);
                                }
                            }
                            arrayList = arrayList2;
                        }
                        m99Var.d(new e5(arrayList, 15));
                    }
                };
                ulp h = this.d.h();
                i99 i99Var = this.A;
                if (i99Var != null) {
                    h.g(i99Var);
                }
                int i12 = 18;
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new et(this, 6)).U(new gp(7)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new pp3(new m7(this, i12), i11)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new gq(this, 5)).U(new hq(4)), qVar, aVar).w0(500L, timeUnit).a0(this.j).subscribe(new ov2(new zt4(this, i11), 2)));
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(this.i), new rt0(new s55(1, this, m99.class, "isVoipStateChangeEvent", "isVoipStateChangeEvent(Ljava/lang/Object;)Z", 0, 1), i11)).U(new k73(7)), qVar, aVar).U(new p7(new qm0(i11), 6)).a0(asu0.a.c()).s0(new tt0(new e99(this, i2), i11)).a0(this.j).subscribe(new f60(new za(this, 14), 8)));
                int i13 = 5;
                bVar.b(com.vk.voip.ui.c.k0().d.f(true).a0(this.i).w0(500L, timeUnit).a0(this.j).subscribe(new y00(new com.vk.movika.sdk.base.hooks.p(this, 20), i13)));
                int i14 = 13;
                bVar.b(i().a0(this.i).I(new j8(this, i13)).U(new qq(3)).B(qVar).w0(500L, timeUnit).a0(this.j).subscribe(new hz(new mb(this, i14), 9)));
                bVar.b(com.vk.voip.ui.c.W().b(false).a0(this.j).subscribe(new js1(new t9(this, i14), 8)));
                bVar.b(com.vk.voip.ui.c.j.b.a0(this.j).I(new dg1(new com.vk.movika.sdk.base.observable.u(7), 6)).subscribe(new defpackage.n(new com.vk.movika.sdk.base.observable.w(this, i14), 12)));
                bVar.b(com.vk.voip.ui.c.B0.b().a0(this.i).U(new bl(new jr3(3), 9)).B(qVar).w0(500L, timeUnit).a0(this.j).subscribe(new um0(new jy(this, i12), 8)));
                int i15 = 15;
                bVar.b(i().a0(this.i).I(new io.reactivex.rxjava3.internal.operators.mixed.k(this, 5)).U(new fr(i11)).B(qVar).w0(500L, timeUnit).a0(this.j).subscribe(new xz(new j9(this, i15), 8)));
                com.vk.voip.ui.actions.feature.c cVar2 = com.vk.voip.ui.c.e0;
                com.vk.voip.ui.actions.feature.c cVar3 = cVar2 != null ? cVar2 : null;
                cVar3.d(cVar3.d.b().b);
                io.reactivex.rxjava3.subjects.d<djw0> dVar2 = cVar3.g;
                dVar2.getClass();
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.z0(dVar2).a0(this.i).U(new nu0(new la2(5), 3)).B(qVar).w0(500L, timeUnit).a0(this.j).subscribe(new io1(new ul1(this, i14), 8)));
                if (!z2) {
                    bVar.b(this.c.l.a().a0(this.i).b0(r480.class).U(new l8(new lb(this, i15), 8)).I(new nb(new k60(7), 3)).a0(this.j).subscribe(new jz(new iz(this, 6), 5)));
                    bVar.b(this.c.l.a().a0(this.i).I(new y7(new ot(9), 3)).a0(this.j).subscribe(new h60(new com.vk.im.ui.fragments.b(this, i14), 6)));
                    if (this.b.a()) {
                        bVar.b(this.c.l.a().a0(this.i).b0(r480.class).U(new mj1(new v9(this, i14), i11)).B(qVar).subscribe(new w00(new tl0(this, i12), i11)));
                    }
                }
                this.n = bVar;
                io.reactivex.rxjava3.disposables.b bVar2 = this.z;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                this.z = new io.reactivex.rxjava3.disposables.b();
            }
        } else if (c99Var instanceof c99.e0) {
            p();
        } else if (c99Var instanceof c99.e) {
            c99.e eVar = (c99.e) c99Var;
            odw0 odw0Var = this.h;
            if (eVar instanceof c99.e.c) {
                Map f = on00.f(new Pair(MediaOption.AUDIO, MediaOptionState.UNMUTED_BUT_MUTED_ONCE));
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.b0().f(f);
                t(new d99.l(l()));
                int i16 = CallParticipantsFragment.W;
                odw0Var.b(new srw0.b.C3687b("participants_manager", srw0.d.a.a, f));
            } else if (eVar instanceof c99.e.C2650e) {
                Map f2 = on00.f(new Pair(MediaOption.VIDEO, MediaOptionState.UNMUTED_BUT_MUTED_ONCE));
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.b0().f(f2);
                t(new d99.m(l()));
                int i17 = CallParticipantsFragment.W;
                odw0Var.b(new srw0.b.C3687b("participants_manager", srw0.d.a.a, f2));
            } else if (eVar instanceof c99.e.b) {
                int i18 = CallParticipantsFragment.W;
                ParticipantStatesManager participantStatesManager = this.d.getParticipantStatesManager();
                if (participantStatesManager != null) {
                    ParticipantStatesManager.lowerHandForAll$default(participantStatesManager, null, null, 3, null);
                }
                odw0Var.b(new epw0.b.a());
                t(d99.k.a);
            } else if (eVar instanceof c99.e.d) {
                int i19 = CallParticipantsFragment.W;
                t(new d99.h());
            } else {
                if (!(eVar instanceof c99.e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i20 = CallParticipantsFragment.W;
                t(new d99.e());
            }
        } else if (c99Var instanceof c99.c0) {
            o((c99.c0) c99Var, null);
        } else if (c99Var instanceof c99.h0) {
            io.reactivex.rxjava3.disposables.c cVar4 = this.q;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            f(s99.a(j(), null, null, null, new xaz.c(false), null, null, null, false, 247));
        } else if (c99Var instanceof c99.i) {
            c99.i iVar = (c99.i) c99Var;
            xaz xazVar = j().d;
            String str = xazVar instanceof xaz.d ? ((xaz.d) xazVar).a : iVar.a;
            if (str != null) {
                fvr.l(this.a, str);
            }
        } else if (c99Var instanceof c99.k0) {
            u();
        } else if (c99Var instanceof c99.l0) {
            ca9 ca9Var = j().c;
            ca9.c cVar5 = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
            if (epx.f(cVar5 != null ? Boolean.valueOf(cVar5.A) : null, Boolean.TRUE)) {
                t(d99.i.a);
            } else if (BuildInfo.s() || BuildInfo.t()) {
                ca9 ca9Var2 = j().c;
                ca9.c cVar6 = ca9Var2 instanceof ca9.c ? (ca9.c) ca9Var2 : null;
                if (cVar6 != null && (callId = cVar6.a) != null) {
                    t(new d99.j(callId));
                }
            } else {
                o(new c99.c0(false, "ShareLink"), new zg(this, 10));
            }
        } else {
            if (c99Var instanceof c99.a0) {
                throw null;
            }
            if (c99Var instanceof c99.p0) {
                throw null;
            }
            if (c99Var instanceof c99.c) {
                go0 go0Var = j().e;
                go0.c cVar7 = go0.c.a;
                if (!epx.f(go0Var, cVar7)) {
                    f(s99.a(j(), null, null, null, null, cVar7, null, null, false, 239));
                    this.r = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new vg0(2), 3)).q(this.i).m(asu0.a.d()), new o99(this), new n99(this));
                }
            } else if (c99Var instanceof c99.d) {
                String str2 = ((c99.d) c99Var).a;
                s99 j = j();
                f(s99.a(j, null, izi0.k(j.b, str2), null, null, null, null, null, false, 253));
            } else if (c99Var instanceof c99.f0) {
                String str3 = ((c99.f0) c99Var).a;
                s99 j2 = j();
                f(s99.a(j2, null, izi0.f(j2.b, str3), null, null, null, null, null, false, 253));
            } else if (c99Var instanceof c99.g) {
                f(s99.a(j(), null, EmptySet.b, null, null, null, null, null, false, 253));
            } else if (c99Var instanceof c99.o) {
                k(((c99.o) c99Var).a);
            } else if (c99Var instanceof c99.y) {
                if (this.d.isMeCreatorOrAdmin()) {
                    VoipFeatures voipFeatures = VoipFeatures.VOIP_READ_CHAT_HISTORY;
                    voipFeatures.getClass();
                    if (com.vk.toggle.b.A.a(voipFeatures)) {
                        io.reactivex.rxjava3.disposables.c e2 = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.f99
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                m99 m99Var = m99.this;
                                ca9 ca9Var3 = m99Var.j().c;
                                ca9.c cVar8 = ca9Var3 instanceof ca9.c ? (ca9.c) ca9Var3 : null;
                                if (cVar8 == null) {
                                    throw new NullPointerException("callInfo is null");
                                }
                                if (cVar8.N) {
                                    return Boolean.FALSE;
                                }
                                Set<String> set = m99Var.j().b;
                                boolean z3 = false;
                                if (!(set instanceof Collection) || !set.isEmpty()) {
                                    loop0: for (String str4 : set) {
                                        Set<String> set2 = cVar8.f;
                                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                            Iterator<T> it = set2.iterator();
                                            while (it.hasNext()) {
                                                if (epx.f((String) it.next(), str4)) {
                                                    break;
                                                }
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                                return Boolean.valueOf(z3);
                            }
                        }).q(this.i).m(this.j), new d37(2), new g99(this, 0));
                        io.reactivex.rxjava3.disposables.b bVar3 = this.z;
                        if (bVar3 != null) {
                            bVar3.b(e2);
                        }
                    }
                }
                k(false);
            } else if (c99Var instanceof c99.z) {
                t(d99.c.a);
            } else if (c99Var instanceof c99.b) {
                c(((c99.b) c99Var).a, false);
            } else if (c99Var instanceof c99.a) {
                io.reactivex.rxjava3.disposables.c cVar8 = this.s;
                if (cVar8 != null) {
                    cVar8.dispose();
                }
                f(s99.a(j(), null, null, null, null, null, null, bo0.a.a, false, 191));
            } else if (c99Var instanceof c99.j) {
                com.vk.voip.ui.c.b.T0(Collections.singletonList(new Pair(null, Boolean.FALSE)));
            } else if (c99Var instanceof c99.r) {
                ParticipantStatesManager participantStatesManager2 = this.d.getParticipantStatesManager();
                if (participantStatesManager2 != null) {
                    participantStatesManager2.lowerHandParticipant(mnh0.H(null));
                }
                this.h.b(epw0.b.C2832b.a);
            } else if (c99Var instanceof c99.m) {
                com.vk.voip.ui.c.b.getClass();
                ysg0.b.a(new fr80(null));
            } else if (c99Var instanceof c99.i0) {
                com.vk.voip.ui.c.b.U0(null);
            } else if (c99Var instanceof c99.b0) {
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.Q0(null);
            } else if (c99Var instanceof c99.n0) {
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.n1(null);
            } else {
                if (c99Var instanceof c99.t) {
                    MediaOption mediaOption = MediaOption.AUDIO;
                    this.u.dispose();
                    throw null;
                }
                if (c99Var instanceof c99.u) {
                    MediaOption mediaOption2 = MediaOption.AUDIO;
                    this.u.dispose();
                    throw null;
                }
                if (c99Var instanceof c99.v) {
                    ca9 ca9Var3 = j().c;
                    ca9.c cVar9 = ca9Var3 instanceof ca9.c ? (ca9.c) ca9Var3 : null;
                    if (cVar9 != null && (mediaOptionState = cVar9.v.get(null)) != null) {
                        MediaOptionState mediaOptionState2 = MediaOptionState.UNMUTED;
                        MediaOptionState mediaOptionState3 = mediaOptionState == mediaOptionState2 ? MediaOptionState.MUTED_PERMANENT : mediaOptionState2;
                        Map<MediaOption, ? extends MediaOptionState> f3 = on00.f(new Pair(MediaOption.MOVIE_SHARING, mediaOptionState3));
                        com.vk.voip.ui.c.b.getClass();
                        com.vk.voip.ui.c.b0().b(null, f3);
                        t(new d99.b(mediaOptionState3 == mediaOptionState2));
                        this.h.b(new srw0.b.C3687b(srw0.d.b.a, f3));
                    }
                } else if (c99Var instanceof c99.s) {
                    com.vk.voip.ui.c cVar10 = com.vk.voip.ui.c.b;
                    tr80 tr80Var = new tr80(null);
                    cVar10.getClass();
                    com.vk.voip.ui.c.S0(tr80Var);
                } else if (c99Var instanceof c99.j0) {
                    s(((c99.j0) c99Var).a);
                } else if (c99Var instanceof c99.f) {
                    boolean z3 = ((c99.f) c99Var).a;
                    OKVoipEngine.b.getClass();
                    Conversation conversation = OKVoipEngine.E.getConversation();
                    if (conversation != null) {
                        conversation.setAnonJoinForbidden(z3);
                    }
                } else if (c99Var instanceof c99.q) {
                    t0y t0yVar = j().f;
                    t0y.c cVar11 = t0y.c.a;
                    if (!epx.f(t0yVar, cVar11)) {
                        f(s99.a(j(), null, null, null, null, null, cVar11, null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE));
                        com.vk.voip.ui.c.b.getClass();
                        throw null;
                    }
                } else if (c99Var instanceof c99.l) {
                    boolean z4 = ((c99.l) c99Var).a;
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.Y.b(z4);
                } else if (c99Var instanceof c99.o0) {
                    com.vk.voip.ui.c cVar12 = com.vk.voip.ui.c.b;
                    boolean z5 = ((c99.o0) c99Var).a;
                    cVar12.getClass();
                    com.vk.voip.ui.c.r.getClass();
                    Conversation conversation2 = OKVoipEngine.E.getConversation();
                    if (conversation2 != null) {
                        conversation2.setWaitingRoomEnabled(z5);
                    }
                    if (z5) {
                        com.vk.voip.ui.c.j0().k();
                    } else {
                        com.vk.voip.ui.c.j0().l();
                    }
                } else if (c99Var instanceof c99.d0) {
                    com.vk.voip.ui.c cVar13 = com.vk.voip.ui.c.b;
                    c99.d0 d0Var = (c99.d0) c99Var;
                    CallMemberId callMemberId = d0Var.a;
                    boolean z6 = d0Var.b;
                    cVar13.getClass();
                    com.vk.voip.ui.c.r.j(callMemberId, z6);
                    if (z6) {
                        com.vk.voip.ui.c.j0().r();
                    }
                } else if (c99Var instanceof c99.w) {
                    this.d.j(null, false);
                } else if (c99Var instanceof c99.k) {
                    com.vk.voip.ui.c.b.getClass();
                    OKVoipEngine.b.getClass();
                    if (OKVoipEngine.E.a()) {
                        Conversation z7 = OKVoipEngine.z();
                        if (z7 != null) {
                            z7.removeParticipant(mnh0.H(null), false);
                        }
                        OKVoipEngine.R(null);
                    }
                    com.vk.voip.ui.c.j0().B();
                } else if (c99Var instanceof c99.g0) {
                    q(((c99.g0) c99Var).a);
                } else if (c99Var instanceof c99.m0) {
                    boolean z8 = ((c99.m0) c99Var).a;
                    s99 j3 = j();
                    if (j3.h != z8) {
                        f(s99.a(j3, null, null, null, null, null, null, null, z8, 127));
                        if (z8) {
                            t(d99.g.a);
                        }
                    }
                } else if (c99Var instanceof c99.x) {
                    n();
                } else if (c99Var instanceof c99.h) {
                    t(d99.a.a);
                } else {
                    if (!(c99Var instanceof c99.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e(((c99.p) c99Var).a);
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final void c(Set<String> set, boolean z) {
        bo0 bo0Var = j().g;
        bo0Var.getClass();
        bo0.b bVar = bo0.b.a;
        if (bo0Var.equals(bVar)) {
            return;
        }
        f(s99.a(j(), null, EmptySet.b, null, null, null, null, bVar, false, PsExtractor.PRIVATE_STREAM_1));
        this.s = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new ra(set, 13), 3)).q(this.i).m(asu0.a.d()), new sa(this, 15), new l99(this, z, 0));
    }

    public final void d(izs<? super ca9.c, ca9.c> izsVar) {
        ca9 ca9Var = j().c;
        if (ca9Var instanceof ca9.c) {
            f(s99.a(j(), null, null, izsVar.invoke(ca9Var), null, null, null, null, false, 251));
        }
    }

    public final void e(final boolean z) {
        Dialog dialog;
        final Peer Zb;
        if (this.b.a()) {
            ca9 ca9Var = j().c;
            ca9.c cVar = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
            if (cVar == null || (dialog = cVar.c) == null || (Zb = dialog.Zb()) == null) {
                return;
            }
            this.i.c(new Runnable() { // from class: xsna.k99
                @Override // java.lang.Runnable
                public final void run() {
                    bz2.c(new ce20(Peer.this, null, null, Boolean.valueOf(z), null, true, null, null, null, null, 982), null);
                }
            });
        }
    }

    public final void f(s99 s99Var) {
        this.f.onNext(s99Var);
    }

    public final void g() {
        io.reactivex.rxjava3.disposables.b bVar = this.n;
        if (bVar != null) {
            bVar.dispose();
        }
        this.o.dispose();
        this.p.dispose();
        io.reactivex.rxjava3.disposables.c cVar = this.q;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.r;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.t.dispose();
        io.reactivex.rxjava3.disposables.c cVar3 = this.s;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.u.dispose();
        this.v.dispose();
        this.w.dispose();
        this.x.dispose();
        this.y.dispose();
        io.reactivex.rxjava3.disposables.b bVar2 = this.z;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        this.z = null;
        i99 i99Var = this.A;
        if (i99Var != null) {
            this.d.h().k(i99Var);
        }
        f(new s99(0));
        this.i.f();
    }

    public final io.reactivex.rxjava3.disposables.c h(String str, izs<? super whr0, s3q0> izsVar) {
        return new io.reactivex.rxjava3.internal.operators.maybe.p(new j99(str, 0)).n(this.i).k(asu0.a.d()).subscribe(new qz(new p0(izsVar, 1), 5));
    }

    public final s99 j() {
        return this.f.P0();
    }

    public final void k(boolean z) {
        c(j().b, z);
        b(c99.h.a);
        f(s99.a(j(), null, EmptySet.b, null, null, null, null, null, false, 253));
    }

    public final boolean l() {
        ca9 ca9Var = j().c;
        ca9.c cVar = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
        if (cVar == null) {
            return false;
        }
        return cVar.D.size() + cVar.C.size() >= 2;
    }

    public final void n() {
        if (epx.f(j().a, null)) {
            t(d99.a.a);
        } else {
            s(null);
        }
    }

    public final void o(c99.c0 c0Var, zg zgVar) {
        s99 j = j();
        xaz xazVar = j.d;
        xaz.b bVar = xaz.b.a;
        if (epx.f(xazVar, bVar)) {
            return;
        }
        if (!(j.d instanceof xaz.d) || c0Var.a || c0Var.b) {
            f(s99.a(j(), null, null, null, bVar, null, null, null, false, 247));
            int i = 3;
            this.q = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new ra0(c0Var, 14), i)).q(this.i).m(asu0.a.d()), new ng3(i, this, c0Var), new jl6(this, c0Var, zgVar, 1));
        }
    }

    public final void p() {
        this.o.dispose();
        this.p.dispose();
        f(new s99(0));
        this.o = io.reactivex.rxjava3.kotlin.c.e(xa4.I(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new com.vk.movika.sdk.base.ui.f(this, 12), 3)).q(this.i).m(this.j), 0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE), new e(1, this, m99.class, "onReloadError", "onReloadError(Ljava/lang/Throwable;)V", 0), new d(1, this, m99.class, "onReloadSuccess", "onReloadSuccess(Lcom/vk/voip/ui/settings/feature/states/CallState;)V", 0));
    }

    public final void q(CallMemberId callMemberId) {
        ca9 ca9Var = j().c;
        ca9.c cVar = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
        if (cVar == null) {
            return;
        }
        whr0 whr0Var = cVar.m.get(callMemberId.b);
        boolean f = epx.f(cVar.b, callMemberId);
        boolean z = whr0Var != null && whr0Var.p;
        OKVoipEngine oKVoipEngine = s79.a;
        if (!oKVoipEngine.isMeCreatorOrAdmin() && !z) {
            if (f || oKVoipEngine.s(callMemberId.b)) {
                return;
            }
            com.vk.voip.ui.c.b.getClass();
            if (com.vk.voip.ui.c.q0()) {
                return;
            }
        }
        t(new d99.f(callMemberId));
    }

    public final void r() {
        this.k.onNext(s3q0.a);
    }

    public final void s(String str) {
        s99 j = j();
        if (!(j.c instanceof ca9.c) || epx.f(j.a, str)) {
            return;
        }
        f(s99.a(j, str, null, null, null, null, null, null, false, 254));
        r();
    }

    public final void t(d99 d99Var) {
        this.g.onNext(d99Var);
    }

    public final void u() {
        s99 j = j();
        if (j.d instanceof xaz.d) {
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.F0.a = true;
            String str = ((xaz.d) j.d).a;
            ((ImBridgeComponent) ((k7m) m7m.f(this.b.a)).a(fpf0.a(ImBridgeComponent.class))).g5().getClass();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            Context context = this.a;
            Intent createChooser = Intent.createChooser(intent, context.getString(R.string.share));
            createChooser.addFlags(268435456);
            context.startActivity(createChooser);
        }
    }
}
