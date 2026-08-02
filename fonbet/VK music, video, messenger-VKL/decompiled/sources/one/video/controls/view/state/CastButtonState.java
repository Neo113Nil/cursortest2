package one.video.controls.view.state;

import xsna.asp;
import xsna.n2u0;
import xsna.x0u0;
import xsna.zrp;

/* compiled from: CastButtonState.kt */
/* loaded from: classes8.dex */
public final class CastButtonState implements x0u0, n2u0 {
    public static final CastButtonState c = new CastButtonState(false, CastButtonConnectionState.DISCONNECTED);
    public final boolean a;
    public final CastButtonConnectionState b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CastButtonState.kt */
    public static final class CastButtonConnectionState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CastButtonConnectionState[] $VALUES;
        public static final CastButtonConnectionState CONNECTED;
        public static final CastButtonConnectionState CONNECTING;
        public static final CastButtonConnectionState DISCONNECTED;
        public static final CastButtonConnectionState DISCONNECTING;

        static {
            CastButtonConnectionState castButtonConnectionState = new CastButtonConnectionState("DISCONNECTED", 0);
            DISCONNECTED = castButtonConnectionState;
            CastButtonConnectionState castButtonConnectionState2 = new CastButtonConnectionState("CONNECTED", 1);
            CONNECTED = castButtonConnectionState2;
            CastButtonConnectionState castButtonConnectionState3 = new CastButtonConnectionState("DISCONNECTING", 2);
            DISCONNECTING = castButtonConnectionState3;
            CastButtonConnectionState castButtonConnectionState4 = new CastButtonConnectionState("CONNECTING", 3);
            CONNECTING = castButtonConnectionState4;
            CastButtonConnectionState[] castButtonConnectionStateArr = {castButtonConnectionState, castButtonConnectionState2, castButtonConnectionState3, castButtonConnectionState4};
            $VALUES = castButtonConnectionStateArr;
            $ENTRIES = new asp(castButtonConnectionStateArr);
        }

        public CastButtonConnectionState() {
            throw null;
        }

        public static CastButtonConnectionState valueOf(String str) {
            return (CastButtonConnectionState) Enum.valueOf(CastButtonConnectionState.class, str);
        }

        public static CastButtonConnectionState[] values() {
            return (CastButtonConnectionState[]) $VALUES.clone();
        }
    }

    public CastButtonState(boolean z, CastButtonConnectionState castButtonConnectionState) {
        this.a = z;
        this.b = castButtonConnectionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CastButtonState)) {
            return false;
        }
        CastButtonState castButtonState = (CastButtonState) obj;
        return this.a == castButtonState.a && this.b == castButtonState.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return "CastButtonState(isVisible=" + this.a + ", connectionState=" + this.b + ")";
    }
}
