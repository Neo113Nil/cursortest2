package xsna;

import org.chromium.base.DeviceInfo;
import org.webrtc.EglBase14Impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class f6m implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ f6m(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                DeviceInfo.sGmsVersionCodeForTesting = null;
                break;
            default:
                EglBase14Impl.EglConnection.lambda$new$1();
                break;
        }
    }
}
