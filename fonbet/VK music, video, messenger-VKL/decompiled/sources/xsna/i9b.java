package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.ChannelSource;
import com.vk.im.ui.components.common.DndPeriod;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.cwb0;
import xsna.mwv;
import xsna.uj70;
import xsna.xxd0;

/* compiled from: ChannelProfileInfoModel.kt */
/* loaded from: classes16.dex */
public final class i9b implements txd0 {
    public final long a;
    public final boolean b;
    public final s8b c;
    public final o9b d;
    public final ddb e;
    public final Context f;
    public final kbj0 g;
    public final bzb0 h;
    public final h9k0 i;
    public final h3g0 j;
    public final boolean k;
    public final feb l;
    public final com.vk.im.channelcreation.api.a m;
    public final mwv<mwv.a> n;
    public final q7v0 o;
    public final io.reactivex.rxjava3.disposables.b p;
    public final cau0 q;
    public final qza r;
    public final io.reactivex.rxjava3.subjects.d<xxd0> s;
    public final io.reactivex.rxjava3.subjects.f<uxd0> t;
    public final Object u;
    public Channel v;
    public final r9b w;

    /* compiled from: ChannelProfileInfoModel.kt */
    public static final class a {
        public final Channel a;
        public final Integer b;

        public a(Channel channel, Integer num) {
            this.a = channel;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InnerState(channel=");
            sb.append(this.a);
            sb.append(", subscribers=");
            return uqi.b(sb, this.b, ')');
        }
    }

    public i9b(long j, boolean z, s8b s8bVar, o9b o9bVar, ddb ddbVar, mxb mxbVar, Context context, kbj0 kbj0Var, bzb0 bzb0Var, h9k0 h9k0Var, h3g0 h3g0Var, boolean z2, feb febVar, com.vk.im.channelcreation.api.a aVar, mwv mwvVar, q7v0 q7v0Var) {
        this.a = j;
        this.b = z;
        this.c = s8bVar;
        this.d = o9bVar;
        this.e = ddbVar;
        this.f = context;
        this.g = kbj0Var;
        this.h = bzb0Var;
        this.i = h9k0Var;
        this.j = h3g0Var;
        this.k = z2;
        this.l = febVar;
        this.m = aVar;
        this.n = mwvVar;
        this.o = q7v0Var;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.p = bVar;
        a1w a1wVar = q1w.a;
        this.q = (a1wVar == null ? null : a1wVar).r().h;
        g2v.c().getClass();
        this.r = new f9u0();
        this.s = io.reactivex.rxjava3.subjects.d.O0(xxd0.c.a);
        this.t = new io.reactivex.rxjava3.subjects.f<>();
        this.u = msy.a(LazyThreadSafetyMode.NONE, new ld(this, 18));
        this.w = new r9b(q7v0Var);
        io.reactivex.rxjava3.core.q<R> L = o9bVar.a().L(new pi0(new com.vk.movika.sdk.base.observable.p(this, 19), 7), false);
        l8 l8Var = new l8(new a9b(0), 12);
        L.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.y(L, io.reactivex.rxjava3.internal.functions.a.a, l8Var).U(new nb(new mb(this, 20), 6));
        asu0 asu0Var = asu0.a;
        bVar.b(U.a0(asu0Var.d()).subscribe(new jz(new iz(this, 16), 8)));
        bVar.b(mxbVar.c.a0(asu0Var.d()).subscribe(new jv(new n9b(1, this, i9b.class, "handleProfileEvent", "handleProfileEvent(Lcom/vk/channels/impl/channel_screen/profile/ChannelProfileEvent;)V", 0, 0), 10)));
    }

    public static final void a(i9b i9bVar) {
        s8b s8bVar = i9bVar.c;
        long j = i9bVar.a;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        io.reactivex.rxjava3.internal.operators.completable.p pVar = new io.reactivex.rxjava3.internal.operators.completable.p(s8bVar.a.C(s8bVar, new c7b(Peer.a.b(j), new uj70.a(DndPeriod.FOREVER.i()))).q(asu0.a.c()));
        s8bVar.c.c(j);
        i9bVar.n(pVar, R.string.vkim_channels_notifications_disable_error, new dx3(i9bVar, 2));
    }

    public static final void c(i9b i9bVar) {
        s8b s8bVar = i9bVar.c;
        long j = i9bVar.a;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        io.reactivex.rxjava3.internal.operators.completable.p pVar = new io.reactivex.rxjava3.internal.operators.completable.p(s8bVar.a.C(s8bVar, new c7b(Peer.a.b(j), uj70.b.a)).q(asu0.a.c()));
        s8bVar.c.a(j);
        i9bVar.n(pVar, R.string.vkim_channels_notifications_enable_error, new b9b(i9bVar, 0));
    }

    @Override // xsna.txd0
    public final io.reactivex.rxjava3.subjects.f b() {
        return this.t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.txd0
    public final io.reactivex.rxjava3.core.v<zxd0> f() {
        return (io.reactivex.rxjava3.core.v) this.u.getValue();
    }

    public final void g() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        aua auaVar = new aua(Collections.singletonList(Peer.a.b(this.a)));
        s8b s8bVar = this.c;
        n(new io.reactivex.rxjava3.internal.operators.completable.p(s8bVar.a.C(s8bVar, auaVar).q(asu0.a.c())), R.string.vkim_channels_notifications_archive_error, new lm1(this, 1));
    }

    @Override // xsna.txd0
    public final io.reactivex.rxjava3.subjects.d<xxd0> getState() {
        return this.s;
    }

    public final void h(gzs<s3q0> gzsVar) {
        this.p.b(io.reactivex.rxjava3.core.a.r(100L, TimeUnit.MILLISECONDS).o(asu0.a.d()).subscribe(new lx6(gzsVar)));
    }

    public final void i() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        s0b s0bVar = new s0b(Peer.a.b(this.a), ChannelSource.Channel.c);
        s8b s8bVar = this.c;
        m(new io.reactivex.rxjava3.internal.operators.completable.p(s8bVar.a.C(s8bVar, s0bVar).q(asu0.a.c())), null, new g9b(this, 0));
    }

    public final void j() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        z0b z0bVar = new z0b(Peer.a.b(this.a));
        s8b s8bVar = this.c;
        s8bVar.a.D(s8bVar, z0bVar);
    }

    public final void k() {
        Peer peer;
        Channel channel = this.v;
        if (channel == null || (peer = channel.A) == null) {
            return;
        }
        b6m.a().j(this.f, com.vk.dto.common.a.b(peer));
    }

    public final void l() {
        long j = this.a;
        s8b s8bVar = this.c;
        m(s8bVar.b.j(j), enj.f(this.q.n() ? R.plurals.vkim_pin_im_item_limit_exceded_msg : R.plurals.vkim_pinned_channels_limit_exceeded, s8bVar.d, this.h.a), new x97(this, 1));
    }

    public final void m(io.reactivex.rxjava3.core.a aVar, String str, io.reactivex.rxjava3.functions.a aVar2) {
        this.p.b(hzb0.a(aVar, this.h, cwb0.r0.e).o(asu0.a.d()).subscribe(aVar2, new wn(new mh4(5, str, this), 11)));
    }

    public final void n(io.reactivex.rxjava3.internal.operators.completable.p pVar, int i, io.reactivex.rxjava3.functions.a aVar) {
        this.p.b(hzb0.a(pVar, this.h, cwb0.r0.e).o(asu0.a.d()).subscribe(aVar, new om1(new c9b(this, i, 0), 5)));
    }

    public final void o() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        odb odbVar = new odb(Collections.singletonList(Peer.a.b(this.a)));
        s8b s8bVar = this.c;
        n(new io.reactivex.rxjava3.internal.operators.completable.p(s8bVar.a.C(s8bVar, odbVar).q(asu0.a.c())), R.string.vkim_channels_notifications_unarchive_error, new h9b(this, 0));
    }

    public final void p() {
        this.p.b(hzb0.a(this.c.b.m(this.a), this.h, cwb0.r0.e).o(asu0.a.d()).subscribe(new e9b(this, 0), new f9b(new vr0(7))));
    }

    @Override // xsna.txd0
    public final void t() {
        this.p.e();
        this.h.a();
    }

    @Override // xsna.txd0
    public final void d() {
    }

    @Override // xsna.txd0
    public final void e() {
    }

    @Override // xsna.txd0
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.txd0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
