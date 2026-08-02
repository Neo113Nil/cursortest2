package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.ChannelSource;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;
import java.util.Collections;

/* compiled from: ChannelSearchInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class nbb implements obb {
    public final lzv a;

    public nbb(lzv lzvVar) {
        this.a = lzvVar;
    }

    @Override // xsna.obb
    public final io.reactivex.rxjava3.core.a a(long j) {
        com.vk.core.utils.newtork.b.a.getClass();
        io.reactivex.rxjava3.core.a k = !com.vk.core.utils.newtork.b.d() ? io.reactivex.rxjava3.core.a.k(new NoNetworkConnectionException(0)) : io.reactivex.rxjava3.internal.operators.completable.i.b;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new io.reactivex.rxjava3.internal.operators.completable.p(k.e(this.a.b(this, new z0b(Peer.a.b(j)))));
    }

    @Override // xsna.obb
    public final io.reactivex.rxjava3.core.a b(long j, ChannelSource channelSource) {
        com.vk.core.utils.newtork.b.a.getClass();
        io.reactivex.rxjava3.core.a k = !com.vk.core.utils.newtork.b.d() ? io.reactivex.rxjava3.core.a.k(new NoNetworkConnectionException(0)) : io.reactivex.rxjava3.internal.operators.completable.i.b;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.r(k.e(this.a.b(this, new gfb(Collections.singletonList(Peer.a.b(j)), Source.ACTUAL, false, 8))), new vj0(new mbb(this, j, channelSource), 8)));
    }
}
