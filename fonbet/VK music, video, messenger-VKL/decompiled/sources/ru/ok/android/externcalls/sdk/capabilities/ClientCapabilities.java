package ru.ok.android.externcalls.sdk.capabilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.asp;
import xsna.izi0;
import xsna.rl3;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ClientCapabilities.kt */
/* loaded from: classes9.dex */
public final class ClientCapabilities {
    private static final int BIT_ADD_PARTICIPANT = 15;
    private static final int BIT_ADMIN_MUTE_NOTIFY = 5;
    private static final int BIT_AUDIENCE_MODE = 11;
    private static final int BIT_CALL_TO_CONTACTS = 10;
    private static final int BIT_FILTER_DEFAULTS = 3;
    private static final int BIT_HOLD = 18;
    private static final int BIT_SCREEN_TRACK_CONSUMER = 4;
    private static final int BIT_SCREEN_TRACK_PRODUCER = 0;
    private static final int BIT_SESSION_ROOMS = 8;
    private static final int BIT_SESSION_STATE_UPDATES = 14;
    private static final int BIT_USE_P2P_RELAY = 16;
    private static final int BIT_VIDEO_TRACKS = 1;
    private static final int BIT_VMOJI = 9;
    private static final int BIT_WAITING_HALL = 2;
    private static final int BIT_WAIT_FOR_ADMIN = 17;
    private static final int BIT_WATCH_MOVIE = 6;
    public static final Companion Companion = new Companion(null);
    private final Set<Capability> caps;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientCapabilities.kt */
    public static final class Capability {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Capability[] $VALUES;
        private final int bit;
        public static final Capability SCREEN_TRACK_PRODUCER = new Capability("SCREEN_TRACK_PRODUCER", 0, 0);
        public static final Capability VIDEO_TRACKS = new Capability("VIDEO_TRACKS", 1, 1);
        public static final Capability WAITING_HALL = new Capability("WAITING_HALL", 2, 2);
        public static final Capability FILTER_DEFAULTS = new Capability("FILTER_DEFAULTS", 3, 3);
        public static final Capability SCREEN_TRACK_CONSUMER = new Capability("SCREEN_TRACK_CONSUMER", 4, 4);
        public static final Capability ADMIN_MUTE_NOTIFY = new Capability("ADMIN_MUTE_NOTIFY", 5, 5);
        public static final Capability WATCH_MOVIE = new Capability("WATCH_MOVIE", 6, 6);
        public static final Capability SESSION_ROOMS = new Capability("SESSION_ROOMS", 7, 8);
        public static final Capability VMOJI = new Capability("VMOJI", 8, 9);
        public static final Capability CALL_TO_CONTACTS = new Capability("CALL_TO_CONTACTS", 9, 10);
        public static final Capability SESSION_STATE_UPDATES = new Capability("SESSION_STATE_UPDATES", 10, 14);
        public static final Capability AUDIENCE_MODE = new Capability("AUDIENCE_MODE", 11, 11);
        public static final Capability ADD_PARTICIPANT = new Capability("ADD_PARTICIPANT", 12, 15);
        public static final Capability USE_P2P_RELAY = new Capability("USE_P2P_RELAY", 13, 16);
        public static final Capability WAIT_FOR_ADMIN = new Capability("WAIT_FOR_ADMIN", 14, 17);
        public static final Capability HOLD = new Capability("HOLD", 15, 18);

        private static final /* synthetic */ Capability[] $values() {
            return new Capability[]{SCREEN_TRACK_PRODUCER, VIDEO_TRACKS, WAITING_HALL, FILTER_DEFAULTS, SCREEN_TRACK_CONSUMER, ADMIN_MUTE_NOTIFY, WATCH_MOVIE, SESSION_ROOMS, VMOJI, CALL_TO_CONTACTS, SESSION_STATE_UPDATES, AUDIENCE_MODE, ADD_PARTICIPANT, USE_P2P_RELAY, WAIT_FOR_ADMIN, HOLD};
        }

        static {
            Capability[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private Capability(String str, int i, int i2) {
            this.bit = i2;
        }

        public static zrp<Capability> getEntries() {
            return $ENTRIES;
        }

        public static Capability valueOf(String str) {
            return (Capability) Enum.valueOf(Capability.class, str);
        }

        public static Capability[] values() {
            return (Capability[]) $VALUES.clone();
        }

        public final int getBit$calls_sdk_release() {
            return this.bit;
        }
    }

    /* compiled from: ClientCapabilities.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final ClientCapabilities empty() {
            return new ClientCapabilities(EmptySet.b, null);
        }

        public final ClientCapabilities from(int i) {
            HashSet hashSet = new HashSet();
            for (Capability capability : Capability.getEntries()) {
                if (((1 << capability.getBit$calls_sdk_release()) & i) != 0) {
                    hashSet.add(capability);
                }
            }
            return new ClientCapabilities(hashSet, null);
        }

        public final ClientCapabilities getDefault() {
            return new ClientCapabilities(rl3.y0(new Capability[]{Capability.SCREEN_TRACK_PRODUCER, Capability.VIDEO_TRACKS, Capability.WAITING_HALL, Capability.FILTER_DEFAULTS, Capability.SCREEN_TRACK_CONSUMER, Capability.ADMIN_MUTE_NOTIFY, Capability.WATCH_MOVIE, Capability.SESSION_ROOMS, Capability.VMOJI, Capability.CALL_TO_CONTACTS, Capability.ADD_PARTICIPANT, Capability.USE_P2P_RELAY}), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClientCapabilities(Set set, zcl zclVar) {
        this((Set<? extends Capability>) set);
    }

    public static final ClientCapabilities empty() {
        return Companion.empty();
    }

    public static final ClientCapabilities from(int i) {
        return Companion.from(i);
    }

    public static final ClientCapabilities getDefault() {
        return Companion.getDefault();
    }

    public final String getHexValueString() {
        return Integer.toHexString(getValue());
    }

    public final int getValue() {
        Iterator<Capability> it = this.caps.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= 1 << it.next().getBit$calls_sdk_release();
        }
        return i;
    }

    public final boolean has(Capability capability) {
        return this.caps.contains(capability);
    }

    public final ClientCapabilities minus(Capability capability) {
        return set(capability, false);
    }

    public final ClientCapabilities plus(Capability capability) {
        return set(capability, true);
    }

    public final ClientCapabilities set(Capability capability, boolean z) {
        return (!z || this.caps.contains(capability)) ? (z || !this.caps.contains(capability)) ? this : new ClientCapabilities(izi0.f(this.caps, capability)) : new ClientCapabilities(izi0.k(this.caps, capability));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ClientCapabilities(Set<? extends Capability> set) {
        this.caps = set;
    }

    public ClientCapabilities(Capability... capabilityArr) {
        this((Set<? extends Capability>) rl3.y0(Arrays.copyOf(capabilityArr, capabilityArr.length)));
    }
}
