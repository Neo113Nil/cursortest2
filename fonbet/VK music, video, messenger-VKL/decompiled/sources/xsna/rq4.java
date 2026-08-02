package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.vk.audio.AudioMsgTrackByRecord;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.Peer;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.VoipStatManager;
import java.util.Collections;
import java.util.Locale;
import xsna.uv4;

/* compiled from: AudioMessageRecordingViewModel.kt */
/* loaded from: classes7.dex */
public final class rq4 {
    public static int e;
    public static boolean f;
    public static boolean i;
    public static i2x0 j;
    public static boolean k;
    public static io.reactivex.rxjava3.disposables.c l;
    public static long n;
    public static boolean o;
    public static uv4.b p;
    public static uv4 r;
    public static final rq4 a = new rq4();
    public static final String b = "AudioMessageRecordingViewModel";
    public static final int c = 2;
    public static final int d = 300;
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static final com.vk.movika.tools.controls.seekbar.n h = new com.vk.movika.tools.controls.seekbar.n(5);
    public static CallId m = CallId.e;
    public static final b q = new b();

    /* compiled from: AudioMessageRecordingViewModel.kt */
    public static final class a {
    }

    public static void a(boolean z) {
        uv4 uv4Var;
        if (i) {
            i = false;
            VoipStatManager.StatData statData = VoipStatManager.a;
            long c2 = (e - c()) * 1000;
            if (VoipStatManager.c) {
                VoipStatManager.StatData statData2 = VoipStatManager.a;
                statData2.m = true;
                statData2.o = c2;
                statData2.n = false;
            }
            if (p == null) {
                L.A(b, "cancelRecording()");
                if (k && (uv4Var = r) != null) {
                    uv4Var.a(null);
                }
                g();
            }
            r = null;
            if (z) {
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.n0(0L);
            }
        }
    }

    public static void b() {
        uv4.b bVar = p;
        if (bVar == null || bVar.h) {
            return;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b2 = Peer.a.b(n);
        AudioMsgTrackByRecord audioMsgTrackByRecord = new AudioMsgTrackByRecord();
        audioMsgTrackByRecord.e = Uri.fromFile(bVar.a).toString();
        audioMsgTrackByRecord.g = (int) (bVar.e / 1000);
        audioMsgTrackByRecord.h = bVar.f;
        AttachAudioMsg attachAudioMsg = new AttachAudioMsg();
        attachAudioMsg.d = o25.a().c();
        attachAudioMsg.j = audioMsgTrackByRecord.e;
        attachAudioMsg.C0(audioMsgTrackByRecord.g);
        attachAudioMsg.g = audioMsgTrackByRecord.h;
        pz30 pz30Var = new pz30(b2, null, null, null, null, null, null, null, Collections.singletonList(attachAudioMsg), null, null, null, null, 16126);
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        a1wVar.E("User send", pz30Var);
    }

    public static int c() {
        if (epx.f(Locale.getDefault().getLanguage(), "ru")) {
            return o ? 3 : 2;
        }
        return 4;
    }

    public static boolean d() {
        return f;
    }

    public static boolean e() {
        return e >= c() && !f && i;
    }

    public static String f() {
        return f870.m(Math.max(0, e - c()));
    }

    public static void g() {
        androidx.media3.exoplayer.l lVar;
        try {
            i2x0 i2x0Var = j;
            if (i2x0Var != null) {
                try {
                    androidx.media3.exoplayer.l lVar2 = i2x0Var.c;
                    if (lVar2 != null) {
                        lVar2.stop();
                    }
                } catch (Exception e2) {
                    L.f(i2x0Var.b, "Failed to stop sound", e2);
                }
            }
            i2x0 i2x0Var2 = j;
            if (i2x0Var2 != null && (lVar = i2x0Var2.c) != null) {
                lVar.release();
                i2x0Var2.c = null;
            }
            j = null;
        } catch (Exception e3) {
            L.f(b, "Failed to release player", e3);
        }
    }

    public static void h() {
        L.A(b, "releaseRecorderAndPlayer for session guid = " + m);
        io.reactivex.rxjava3.disposables.c cVar = l;
        if (cVar != null) {
            cVar.dispose();
        }
        l = null;
        Context context = e43.a;
        ((AudioManager) (context != null ? context : null).getSystemService("audio")).abandonAudioFocus(q);
        g();
    }

    public final void i(int i2) {
        uv4 uv4Var;
        if (e != i2) {
            e = i2;
            if (i2 >= c() && !k && e()) {
                uv4 uv4Var2 = r;
                com.vk.voip.ui.c.b.getClass();
                l = uv4Var2.d(com.vk.voip.ui.c.T0.b, false).subscribe(new ho1(new sq4(1, this, rq4.class, "onRecordingCompleted", "onRecordingCompleted(Lcom/vk/audio/AudioRecorder$Result;)V", 0), 2), new cz(new xv2(1, this, rq4.class, "onRecordingFailed", "onRecordingFailed(Ljava/lang/Throwable;)V", 0, 1), 4));
                L.A(b, "Voip voice message recordring started for callIdForRecording = " + m + " and peerId=" + n);
                k = true;
                g.postDelayed(new qq4(0), 300L);
            }
            if (e - c() >= d) {
                L.A(b, "stopRecording()");
                if (k && (uv4Var = r) != null) {
                    uv4Var.e(null, false, false, false);
                }
            }
            ysg0.b.a(new a());
        }
    }

    public final void j() {
        if (i) {
            return;
        }
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        r = new uv4(a1wVar.r().h.a());
        com.vk.voip.ui.c.b.getClass();
        m = com.vk.voip.ui.c.T0;
        n = com.vk.voip.ui.c.K;
        o = com.vk.voip.ui.c.H;
        if (f) {
            f = false;
            ysg0.b.a(new a());
        }
        k = false;
        i(0);
        p = null;
        i = true;
        Handler handler = g;
        com.vk.movika.tools.controls.seekbar.n nVar = h;
        handler.removeCallbacks(new nq4(nVar, 0));
        long j2 = 1000;
        handler.postDelayed(new oq4(0, nVar), 1000L);
        pq4 pq4Var = new pq4();
        if (!epx.f(Locale.getDefault().getLanguage(), "ru")) {
            j2 = 900;
        } else if (!o) {
            j2 = 300;
        }
        handler.postDelayed(pq4Var, j2);
        Context context = e43.a;
        ((AudioManager) (context != null ? context : null).getSystemService("audio")).requestAudioFocus(q, 0, 2);
    }

    /* compiled from: AudioMessageRecordingViewModel.kt */
    public static final class b implements AudioManager.OnAudioFocusChangeListener {
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
        }
    }
}
