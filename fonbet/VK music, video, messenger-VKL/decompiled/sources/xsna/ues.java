package xsna;

import android.content.Intent;
import com.vk.core.preference.Preference;
import org.webrtc.Size;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameCapturerImpl;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetrySpanProcessor;
import xsna.r7y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class ues implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ues(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((FrameCapturerImpl) this.c).a((Intent) this.d, (Size) this.e);
                break;
            case 1:
                SignalingTransport.a((SignalingTransport) this.c, (String) this.d, (Long) this.e);
                break;
            case 2:
                TracerOpenTelemetrySpanProcessor.shutdown$lambda$3((TracerOpenTelemetrySpanProcessor) this.c, (v7i) this.d, (v7i) this.e);
                break;
            default:
                r7y0 r7y0Var = (r7y0) this.c;
                String str = (String) this.d;
                r7y0.a aVar = (r7y0.a) this.e;
                r7y0.b bVar = r7y0Var.c;
                r7y0.b bVar2 = r7y0.b.DOWNLOADING;
                if (bVar != bVar2) {
                    r7y0.b bVar3 = r7y0.b.WAIT_FOR_NEXT_DOWNLOAD_WINDOW;
                    if (bVar != bVar3) {
                        if (bVar != r7y0.b.DOWNLOADING_ERROR) {
                            if (bVar == r7y0.b.IDLE) {
                                long m = Preference.m(0L, "zstd_pref", "last_download_time");
                                if (m != 0 && System.currentTimeMillis() - m < r7y0.h) {
                                    r7y0Var.c = bVar3;
                                    break;
                                }
                            }
                        } else if (r7y0Var.f > System.currentTimeMillis()) {
                        }
                    } else {
                        long m2 = Preference.m(0L, "zstd_pref", "last_download_time");
                        if (m2 != 0 && System.currentTimeMillis() - m2 < r7y0.h) {
                        }
                    }
                    r7y0Var.c = bVar2;
                    r7y0Var.a.execute(new bbr(r7y0Var, str, aVar, 1));
                    break;
                }
                break;
        }
    }
}
