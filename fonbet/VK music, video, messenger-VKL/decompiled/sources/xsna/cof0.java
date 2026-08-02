package xsna;

import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.SignalStrength;
import java.util.List;

/* compiled from: ReefNetworkEvent.kt */
/* loaded from: classes5.dex */
public abstract class cof0 {

    /* compiled from: ReefNetworkEvent.kt */
    public static final class a extends cof0 {
        public final List<CellInfo> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends CellInfo> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return wq.c("CellInfoChanged(cellInfo=", ")", this.a);
        }
    }

    /* compiled from: ReefNetworkEvent.kt */
    public static final class b extends cof0 {
        public final CellLocation a;

        public b(CellLocation cellLocation) {
            this.a = cellLocation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            CellLocation cellLocation = this.a;
            if (cellLocation == null) {
                return 0;
            }
            return cellLocation.hashCode();
        }

        public final String toString() {
            return "CellLocationChanged(location=" + this.a + ")";
        }
    }

    /* compiled from: ReefNetworkEvent.kt */
    public static final class c extends cof0 {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return sl9.c(this.a, this.b, "DataConnectionChanged(state=", ", networkType=", ")");
        }
    }

    /* compiled from: ReefNetworkEvent.kt */
    public static final class d extends cof0 {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("MobileConnectivityUpdated(isConnected=", ")", this.a);
        }
    }

    /* compiled from: ReefNetworkEvent.kt */
    public static final class e extends cof0 {
        public final SignalStrength a;

        public e(SignalStrength signalStrength) {
            this.a = signalStrength;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            SignalStrength signalStrength = this.a;
            if (signalStrength == null) {
                return 0;
            }
            return signalStrength.hashCode();
        }

        public final String toString() {
            return "SignalStrengthChanged(signalStrength=" + this.a + ")";
        }
    }
}
