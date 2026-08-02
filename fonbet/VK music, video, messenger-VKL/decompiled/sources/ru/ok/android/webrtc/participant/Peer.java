package ru.ok.android.webrtc.participant;

import xsna.epx;
import xsna.zr;

/* loaded from: classes9.dex */
public final class Peer {
    public final String a;

    public Peer(String str) {
        this.a = str;
    }

    public static /* synthetic */ Peer copy$default(Peer peer, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peer.a;
        }
        return peer.copy(str);
    }

    public final String component1() {
        return this.a;
    }

    public final Peer copy(String str) {
        return new Peer(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Peer) && epx.f(this.a, ((Peer) obj).a);
    }

    public final String getId() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return zr.a("Peer(id=", this.a, ")");
    }
}
