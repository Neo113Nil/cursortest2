package xsna;

import android.net.NetworkInfo;
import com.vk.core.util.TrafficSaverInfo;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import java.util.concurrent.Callable;
import org.webrtc.HardwareVideoEncoderV2;
import org.webrtc.VideoCodecStatus;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class jw6 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jw6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        VideoCodecStatus lambda$updateBitrate$7;
        switch (this.b) {
            case 0:
                iw6 iw6Var = (iw6) ((ofy0) this.c).c;
                if (!iw6Var.a().contains("intensity")) {
                    return BeautyFilterIntensity.DISABLED;
                }
                if (!iw6Var.a().contains("intensity")) {
                    return BeautyFilterIntensity.DISABLED;
                }
                try {
                    i = iw6Var.a().getInt("intensity", BeautyFilterIntensity.DISABLED.h());
                } catch (ClassCastException unused) {
                    int i2 = (int) iw6Var.a().getLong("intensity", BeautyFilterIntensity.DISABLED.h());
                    qaj0.c(iw6Var.a(), "intensity", Integer.valueOf(i2));
                    i = i2;
                }
                for (BeautyFilterIntensity beautyFilterIntensity : BeautyFilterIntensity.values()) {
                    if (i == beautyFilterIntensity.h()) {
                        return beautyFilterIntensity;
                    }
                }
                return BeautyFilterIntensity.DISABLED;
            case 1:
                lambda$updateBitrate$7 = ((HardwareVideoEncoderV2) this.c).lambda$updateBitrate$7();
                return lambda$updateBitrate$7;
            default:
                sr10 sr10Var = (sr10) this.c;
                r6m.a.getClass();
                NetworkInfo e = r6m.e();
                boolean isRoaming = e != null ? e.isRoaming() : false;
                NetworkInfo e2 = r6m.e();
                if ((e2 != null ? e2.getType() : -1) == 1 && !isRoaming && sr10Var.c) {
                    TrafficSaverInfo trafficSaverInfo = TrafficSaverInfo.SWITCH_OFF;
                    if (!sr10Var.f(trafficSaverInfo)) {
                        it80.b.getClass();
                        return new it80(trafficSaverInfo);
                    }
                }
                NetworkInfo e3 = r6m.e();
                int type = e3 != null ? e3.getType() : -1;
                if ((type == 0 || type == 4 || type == 5 || type == 2 || type == 3) && isRoaming && !sr10Var.c) {
                    TrafficSaverInfo trafficSaverInfo2 = TrafficSaverInfo.SWITCH_ON;
                    if (!sr10Var.f(trafficSaverInfo2)) {
                        it80.b.getClass();
                        return new it80(trafficSaverInfo2);
                    }
                }
                it80.b.getClass();
                return it80.a.a();
        }
    }
}
