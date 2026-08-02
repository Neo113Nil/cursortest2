package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.ChannelSource;
import com.vk.im.ui.components.common.DndPeriod;
import java.util.Collections;
import xsna.uj70;

/* compiled from: ChannelActionsInteractor.kt */
/* loaded from: classes16.dex */
public final class tta implements rta {
    public final a1w a;
    public final v3q b;

    public tta(a1w a1wVar, v3q v3qVar) {
        this.a = a1wVar;
        this.b = v3qVar;
    }

    @Override // xsna.rta
    public final io.reactivex.rxjava3.internal.operators.completable.p a(int i, long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new b0b(i, Peer.a.b(j))).q(this.b.c()));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p b(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new aua(Collections.singletonList(Peer.a.b(j)))).q(this.b.c()));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p c(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new pxa(Peer.a.b(j))).q(this.b.c()));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p d(long j) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new zza(j)));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p e(long j, ChannelSource channelSource) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new s0b(Peer.a.b(j), channelSource)).q(this.b.c()));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p f(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new z0b(Peer.a.b(j))).q(this.b.c()));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p g(long j) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new l1b(j)));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p h(Peer peer) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new c7b(peer, new uj70.a(DndPeriod.FOREVER.i()))).q(this.b.c()));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p i(Peer peer) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new c7b(peer, uj70.b.a)).q(this.b.c()));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p j(long j) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.r(this.a.C(this, new whb()).q(this.b.c()), new do3(new sta(this, j), 6)));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p k(long j) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new scb(j)));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p l(Peer peer) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new odb(Collections.singletonList(peer))).q(this.b.c()));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p m(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new sdb(Peer.a.b(j))).q(this.b.c()));
    }
}
