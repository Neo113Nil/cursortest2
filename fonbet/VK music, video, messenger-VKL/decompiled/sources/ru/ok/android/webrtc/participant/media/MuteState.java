package ru.ok.android.webrtc.participant.media;

import xsna.epx;

/* loaded from: classes9.dex */
public final class MuteState {
    public final MuteEvent a;
    public final boolean b;

    public MuteState(MuteEvent muteEvent, boolean z) {
        this.a = muteEvent;
        this.b = z;
    }

    public static /* synthetic */ MuteState copy$default(MuteState muteState, MuteEvent muteEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            muteEvent = muteState.a;
        }
        if ((i & 2) != 0) {
            z = muteState.b;
        }
        return muteState.copy(muteEvent, z);
    }

    public final MuteEvent component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final MuteState copy(MuteEvent muteEvent, boolean z) {
        return new MuteState(muteEvent, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MuteState)) {
            return false;
        }
        MuteState muteState = (MuteState) obj;
        return epx.f(this.a, muteState.a) && this.b == muteState.b;
    }

    public final MuteEvent getMuteEvent() {
        return this.a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final boolean isForAll() {
        return this.b;
    }

    public String toString() {
        return "MuteState(muteEvent=" + this.a + ", isForAll=" + this.b + ")";
    }
}
