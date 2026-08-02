package xsna;

import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import java.util.List;

/* compiled from: ReefPhoneStateListenerProxy.kt */
/* loaded from: classes5.dex */
public final class jof0 extends PhoneStateListener {
    public a a;

    /* compiled from: ReefPhoneStateListenerProxy.kt */
    public interface a {
        void a(List<? extends CellInfo> list);

        void b(int i, int i2);

        void c(CellLocation cellLocation);

        void d(SignalStrength signalStrength);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCellInfoChanged(List<? extends CellInfo> list) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(list);
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCellLocationChanged(CellLocation cellLocation) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.c(cellLocation);
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i, int i2) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b(i, i2);
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.d(signalStrength);
        }
    }
}
