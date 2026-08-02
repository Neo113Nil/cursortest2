package xsna;

import com.vk.dto.hints.HintId;
import one.video.calls.sdk.net.signaling.WSSignaling;
import ru.ok.android.webrtc.RTCLog;
import xsna.dzh;
import xsna.sst0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class yuh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yuh(boolean z, Object obj, Object obj2, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        one.video.calls.sdk_private.wss.a sniProvider_delegate$lambda$0;
        switch (this.b) {
            case 0:
                avh avhVar = (avh) this.d;
                sst0.b bVar = (sst0.b) this.e;
                if (this.c) {
                    avhVar.t6(bVar);
                } else {
                    avhVar.v6(bVar);
                }
                return s3q0.a;
            case 1:
                ryh ryhVar = (ryh) this.d;
                HintId hintId = (HintId) this.e;
                if (this.c) {
                    ryhVar.b.c(new dzh.n.f(hintId));
                }
                return s3q0.a;
            default:
                sniProvider_delegate$lambda$0 = WSSignaling.sniProvider_delegate$lambda$0(this.c, (RTCLog) this.d, (WSSignaling) this.e);
                return sniProvider_delegate$lambda$0;
        }
    }
}
