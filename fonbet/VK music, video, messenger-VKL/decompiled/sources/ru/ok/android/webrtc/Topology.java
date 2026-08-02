package ru.ok.android.webrtc;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zcl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Topology.kt */
/* loaded from: classes9.dex */
public final class Topology {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Topology[] $VALUES;
    public static final Companion Companion;
    public static final Topology DUMMY = new Topology("DUMMY", 0);
    public static final Topology DIRECT = new Topology("DIRECT", 1);
    public static final Topology SERVER = new Topology(SignalingProtocol.TOPOLOGY_SERVER, 2);

    /* compiled from: Topology.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Topology of(String str) {
            return str.equals("DIRECT") ? Topology.DIRECT : str.equals(SignalingProtocol.TOPOLOGY_SERVER) ? Topology.SERVER : Topology.DUMMY;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Topology[] $values() {
        return new Topology[]{DUMMY, DIRECT, SERVER};
    }

    static {
        Topology[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
        Companion = new Companion(null);
    }

    private Topology(String str, int i) {
    }

    public static zrp<Topology> getEntries() {
        return $ENTRIES;
    }

    public static final Topology of(String str) {
        return Companion.of(str);
    }

    public static Topology valueOf(String str) {
        return (Topology) Enum.valueOf(Topology.class, str);
    }

    public static Topology[] values() {
        return (Topology[]) $VALUES.clone();
    }
}
