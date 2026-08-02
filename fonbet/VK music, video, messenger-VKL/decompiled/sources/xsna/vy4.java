package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4605ve;
import com.ironsource.Ce;
import com.ironsource.InterfaceC4569te;
import com.vk.log.L;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.io.BufferedWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.android.webrtc.protocol.RtcResponse;
import ru.ok.gl.tf.factory.BodyPatternMatchingFactory;
import ru.ok.tensorflow.detection.Detector;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class vy4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vy4(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.c;
                Handler handler = (Handler) this.d;
                ihz ihzVar = (ihz) this.e;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new nu4(ihzVar, 1));
                    }
                    synchronized (AudioTrackAudioOutput.p) {
                        try {
                            int i = AudioTrackAudioOutput.r - 1;
                            AudioTrackAudioOutput.r = i;
                            if (i == 0) {
                                ScheduledExecutorService scheduledExecutorService = AudioTrackAudioOutput.q;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                AudioTrackAudioOutput.q = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new nu4(ihzVar, 1));
                    }
                    synchronized (AudioTrackAudioOutput.p) {
                        try {
                            int i2 = AudioTrackAudioOutput.r - 1;
                            AudioTrackAudioOutput.r = i2;
                            if (i2 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = AudioTrackAudioOutput.q;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                AudioTrackAudioOutput.q = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 1:
                ((BodyPatternMatchingFactory) this.c).lambda$create$1((Detector) this.d, (Runnable) this.e);
                return;
            case 2:
                Ce.d((Context) this.c, (C4605ve) this.d, (InterfaceC4569te) this.e);
                return;
            case 3:
                d5k d5kVar = (d5k) this.c;
                Throwable th2 = (Throwable) this.d;
                Map map = Collections.EMPTY_MAP;
                u4k u4kVar = d5kVar.h;
                Thread currentThread = Thread.currentThread();
                u4kVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                y5k y5kVar = u4kVar.n;
                if (y5kVar == null || !y5kVar.d.get()) {
                    long j = currentTimeMillis / 1000;
                    String e = u4kVar.e();
                    if (e == null) {
                        return;
                    }
                    i0q i0qVar = new i0q(e, j, map);
                    tui0 tui0Var = u4kVar.m;
                    tui0Var.getClass();
                    tui0Var.f(th2, currentThread, "error", i0qVar, false);
                    return;
                }
                return;
            case 4:
                ilj0 ilj0Var = (ilj0) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                BufferedWriter bufferedWriter = ilj0Var.a;
                StringBuilder b = ho8.b(str, " | ");
                b.append(drm0.r0(str2).toString());
                b.append('\n');
                bufferedWriter.write(b.toString());
                ilj0Var.a.flush();
                return;
            case 5:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.c;
                rhq0 rhq0Var = (rhq0) this.d;
                try {
                    ((FragmentActivity) this.e).startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://facebook.com/profile.php?id=" + extendedUserProfile.z0)));
                    return;
                } catch (Throwable th3) {
                    if (th3 instanceof ActivityNotFoundException) {
                        return;
                    }
                    if ((th3 instanceof NullPointerException) && rhq0.c(rhq0Var)) {
                        L.G(ms9.b("Can't start activity cause of internal OS error: ", th3));
                        return;
                    } else {
                        com.vk.metrics.eventtracking.b.a.q(th3);
                        return;
                    }
                }
            default:
                zwy0 zwy0Var = (zwy0) this.c;
                RtcCommand<?> rtcCommand = (RtcCommand) this.d;
                RtcResponse rtcResponse = (RtcResponse) this.e;
                Iterator it = zwy0Var.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((RtcCommandExecutor.Listener) it.next()).onRtcCommandSuccess(rtcCommand, rtcResponse);
                    } catch (Throwable th4) {
                        zwy0Var.a.reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsuccess", th4);
                    }
                }
                return;
        }
    }

    public /* synthetic */ vy4(d5k d5kVar, Throwable th) {
        this.b = 3;
        Map map = Collections.EMPTY_MAP;
        this.c = d5kVar;
        this.d = th;
        this.e = map;
    }
}
