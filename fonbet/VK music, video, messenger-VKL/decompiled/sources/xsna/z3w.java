package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.scope.ImScopeImpl;
import xsna.acw;

/* compiled from: ImFeatureScopeProviderImpl.kt */
/* loaded from: classes2.dex */
public final class z3w implements y3w {
    @Override // xsna.y3w
    public final ImScopeImpl a(Peer peer) {
        return new ImScopeImpl((BuildInfo.s() && peer.Ab(Peer.Type.GROUP)) ? new acw.a(peer) : acw.b.b);
    }
}
