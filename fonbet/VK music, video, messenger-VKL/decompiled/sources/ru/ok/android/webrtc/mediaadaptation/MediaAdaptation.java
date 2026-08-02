package ru.ok.android.webrtc.mediaadaptation;

import ru.ok.android.onelog.NetworkClass;
import ru.ok.android.webrtc.PeerVideoSettings;
import xsna.asp;
import xsna.epx;
import xsna.lby;
import xsna.zrp;

/* loaded from: classes9.dex */
public final class MediaAdaptation {
    public static final MediaAdaptation INSTANCE = new MediaAdaptation();
    public static final String LOG_TAG = "MediaAdaptation";

    public interface EventListener {
        void onNetworkConditionChanged(NetworkConditionChange networkConditionChange);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NetworkCondition {
        public static final NetworkCondition BAD_LEVEL_1;
        public static final NetworkCondition BAD_LEVEL_2;
        public static final NetworkCondition GOOD;
        public static final /* synthetic */ NetworkCondition[] b;
        public static final /* synthetic */ zrp c;
        public final String a;

        static {
            NetworkCondition networkCondition = new NetworkCondition("GOOD", 0, NetworkClass.GOOD);
            GOOD = networkCondition;
            NetworkCondition networkCondition2 = new NetworkCondition("BAD_LEVEL_1", 1, "bad_1");
            BAD_LEVEL_1 = networkCondition2;
            NetworkCondition networkCondition3 = new NetworkCondition("BAD_LEVEL_2", 2, "bad_2");
            BAD_LEVEL_2 = networkCondition3;
            NetworkCondition[] networkConditionArr = {networkCondition, networkCondition2, networkCondition3};
            b = networkConditionArr;
            c = new asp(networkConditionArr);
        }

        public NetworkCondition(String str, int i, String str2) {
            this.a = str2;
        }

        public static zrp<NetworkCondition> getEntries() {
            return c;
        }

        public static NetworkCondition valueOf(String str) {
            return (NetworkCondition) Enum.valueOf(NetworkCondition.class, str);
        }

        public static NetworkCondition[] values() {
            return (NetworkCondition[]) b.clone();
        }

        public final String getKey() {
            return this.a;
        }
    }

    public static final class NetworkConditionChange {
        public final NetworkCondition a;
        public final NetworkState b;
        public final PeerVideoSettings c;
        public final boolean d;

        public NetworkConditionChange(NetworkCondition networkCondition, NetworkState networkState, PeerVideoSettings peerVideoSettings, boolean z) {
            this.a = networkCondition;
            this.b = networkState;
            this.c = peerVideoSettings;
            this.d = z;
        }

        public static /* synthetic */ NetworkConditionChange copy$default(NetworkConditionChange networkConditionChange, NetworkCondition networkCondition, NetworkState networkState, PeerVideoSettings peerVideoSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                networkCondition = networkConditionChange.a;
            }
            if ((i & 2) != 0) {
                networkState = networkConditionChange.b;
            }
            if ((i & 4) != 0) {
                peerVideoSettings = networkConditionChange.c;
            }
            if ((i & 8) != 0) {
                z = networkConditionChange.d;
            }
            return networkConditionChange.copy(networkCondition, networkState, peerVideoSettings, z);
        }

        public final NetworkCondition component1() {
            return this.a;
        }

        public final NetworkState component2() {
            return this.b;
        }

        public final PeerVideoSettings component3() {
            return this.c;
        }

        public final boolean component4() {
            return this.d;
        }

        public final NetworkConditionChange copy(NetworkCondition networkCondition, NetworkState networkState, PeerVideoSettings peerVideoSettings, boolean z) {
            return new NetworkConditionChange(networkCondition, networkState, peerVideoSettings, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkConditionChange)) {
                return false;
            }
            NetworkConditionChange networkConditionChange = (NetworkConditionChange) obj;
            return this.a == networkConditionChange.a && epx.f(this.b, networkConditionChange.b) && epx.f(this.c, networkConditionChange.c) && this.d == networkConditionChange.d;
        }

        public final NetworkCondition getCondition() {
            return this.a;
        }

        public final boolean getPreferHardwarePVXEncoder() {
            return this.d;
        }

        public final NetworkState getState() {
            return this.b;
        }

        public final PeerVideoSettings getSuggestedVideoSettings() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            PeerVideoSettings peerVideoSettings = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (peerVideoSettings == null ? 0 : peerVideoSettings.hashCode())) * 31);
        }

        public String toString() {
            return "NetworkConditionChange(condition=" + this.a + ", state=" + this.b + ", suggestedVideoSettings=" + this.c + ", preferHardwarePVXEncoder=" + this.d + ")";
        }
    }

    public static final class NetworkState {
        public final double a;
        public final double b;

        public NetworkState(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public static /* synthetic */ NetworkState copy$default(NetworkState networkState, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = networkState.a;
            }
            if ((i & 2) != 0) {
                d2 = networkState.b;
            }
            return networkState.copy(d, d2);
        }

        public final double component1() {
            return this.a;
        }

        public final double component2() {
            return this.b;
        }

        public final NetworkState copy(double d, double d2) {
            return new NetworkState(d, d2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkState)) {
                return false;
            }
            NetworkState networkState = (NetworkState) obj;
            return Double.compare(this.a, networkState.a) == 0 && Double.compare(this.b, networkState.b) == 0;
        }

        public final double getLostPacketsFraction() {
            return this.b;
        }

        public final double getRoundTripTimeMs() {
            return this.a;
        }

        public int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public String toString() {
            double d = this.a;
            double d2 = this.b;
            StringBuilder a = lby.a("NetworkState(roundTripTimeMs=", d, ", lostPacketsFraction=");
            a.append(d2);
            a.append(")");
            return a.toString();
        }
    }
}
