package defpackage;

import android.os.Handler;
import com.twilio.audioswitch.bluetooth.BluetoothHeadsetManager;

/* loaded from: classes11.dex */
public final class g66 extends n15 {
    public final if3 x;
    public final /* synthetic */ BluetoothHeadsetManager y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g66(BluetoothHeadsetManager bluetoothHeadsetManager, ogz ogzVar, if3 if3Var, Handler handler, p2x0 p2x0Var) {
        super(ogzVar, handler, p2x0Var);
        this.y = bluetoothHeadsetManager;
        this.x = if3Var;
    }

    @Override // defpackage.n15
    public final void j() {
        this.x.a(false);
        this.y.setHeadsetState$audioswitch_release(i66.d);
    }

    @Override // defpackage.n15
    public final void k() {
        this.y.setHeadsetState$audioswitch_release(i66.c);
    }
}
