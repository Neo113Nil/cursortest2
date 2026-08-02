package xsna;

import com.vk.location.common.LocationCommon;
import com.vk.metrics.eventtracking.Event;
import java.util.Random;
import java.util.concurrent.Callable;
import org.webrtc.HardwareVideoEncoderV2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class huu implements Callable {
    public final /* synthetic */ int b;

    public /* synthetic */ huu(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$releaseCodecThread$2;
        int i;
        switch (this.b) {
            case 0:
                lambda$releaseCodecThread$2 = HardwareVideoEncoderV2.lambda$releaseCodecThread$2();
                return lambda$releaseCodecThread$2;
            default:
                Random random = txz.c;
                try {
                    i = Integer.parseInt(bl20.a.getString("config_fabric_non_fatal_log_frequency", String.valueOf(1)));
                } catch (Exception unused) {
                    i = 1;
                }
                if (random.nextInt(Math.max(1, i)) == 0) {
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a aVar = new Event.a();
                    aVar.g("ERROR.LOCATION.REQUEST_TIMEOUT");
                    bVar.k(aVar.e());
                }
                LocationCommon.a.getClass();
                return LocationCommon.b;
        }
    }
}
