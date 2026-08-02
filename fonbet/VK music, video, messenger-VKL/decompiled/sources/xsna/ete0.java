package xsna;

import com.ironsource.X3;
import com.vk.log.L;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.RTCLog;
import xsna.v000;

/* compiled from: RTCLogger.kt */
/* loaded from: classes7.dex */
public final class ete0 implements RTCLog {
    public final zmw0 a;
    public final v000 b = new v000();
    public final ilj0 c;

    public ete0(zmw0 zmw0Var) {
        this.a = zmw0Var;
        System.currentTimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        irw0 g = zmw0Var.g();
        String b = g.b();
        ilj0 ilj0Var = null;
        if (g.a() && b != null) {
            if (bd3.d(b)) {
                try {
                    ilj0Var = new ilj0(b + File.separator + "callside-" + currentTimeMillis);
                } catch (Exception e) {
                    L.l("VoipCore", cqi.b(e, new StringBuilder("Unable initialize side logs with error=")));
                }
            } else {
                L.l("VoipCore", zr.a("Unable initialize side logs! Directory ", b, " doesn't exists"));
            }
        }
        this.c = ilj0Var;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        v000.b bVar = new v000.b(30L, 0, "");
        v000 v000Var = this.b;
        v000Var.a(v000.b.a(bVar, "openssl_stream_adapter.cc"));
        v000Var.a(v000.b.a(bVar, "sctp_transport.cc"));
        v000Var.a(v000.b.a(bVar, "usrsctp_transport.cc"));
        v000Var.a(v000.b.a(bVar, "stun_request.cc"));
        v000Var.a(v000.b.a(bVar, "connection.cc"));
        v000Var.a(v000.b.a(bVar, "sctp_data_channel.cc"));
        v000Var.a(v000.b.a(bVar, "dcsctp_transport.cc"));
        v000Var.a(v000.b.a(bVar, "text_pcap_packet_observer.cc"));
        v000Var.a(v000.b.a(bVar, "pacing_controller.cc"));
        v000Var.a(v000.b.a(bVar, "goog_cc_network_control.cc"));
        v000Var.a(v000.b.a(bVar, "stream_scheduler.cc"));
        v000Var.a(v000.b.a(bVar, "rtcp_receiver.cc"));
        TimeUnit.SECONDS.toMillis(1L);
        v000Var.a(new v000.b(10L, 5, "RefCountDelegate"));
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        v000Var.a(new v000.b(1L, 1, "video_stream_encoder.cc"));
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        v000Var.a(new v000.b(1L, 1, "encoder_bitrate_adjuster.cc"));
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public final void log(String str, String str2) {
        if (this.b.b(str)) {
            String a = y57.a(X3.j.d, str, "] ", str2);
            L.A("VoipCore", a);
            ilj0 ilj0Var = this.c;
            if (ilj0Var != null) {
                StringBuilder sb = new StringBuilder();
                Calendar calendar = ilj0Var.c.get();
                if (calendar != null) {
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    long timeInMillis = calendar.getTimeInMillis() % 1000;
                    sb.append(String.format(Locale.getDefault(), "%02d.%02d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1))}, 3)));
                    sb.append(" ");
                    sb.append(String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), Long.valueOf(timeInMillis)}, 4)));
                    ilj0Var.b.submit(new vy4(ilj0Var, sb.toString(), a, 4)).get();
                }
            }
        }
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public final void logException(String str, String str2, Throwable th) {
        L.f(str, str2, th);
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public final void reportException(String str, String str2, Throwable th) {
        L.f(str, str2, th);
        com.vk.metrics.eventtracking.b.a.a(th);
    }
}
