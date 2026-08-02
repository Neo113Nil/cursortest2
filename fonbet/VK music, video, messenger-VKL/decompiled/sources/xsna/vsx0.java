package xsna;

import com.vk.dto.common.Peer;

/* compiled from: WithFrom.kt */
/* loaded from: classes18.dex */
public interface vsx0 {
    Peer getFrom();

    default long ob() {
        return getFrom().d;
    }

    default Peer.Type y2() {
        return getFrom().c;
    }
}
