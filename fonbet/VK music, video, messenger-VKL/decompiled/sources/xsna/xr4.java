package xsna;

import com.vk.log.L;
import com.vk.medianative.AudioNative;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ xr4(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Integer.valueOf(AudioNative.g(this.c));
            default:
                L.p("IncomingPushLogger", go9.b("messages.callReceived success callId=", this.c));
                return s3q0.a;
        }
    }
}
