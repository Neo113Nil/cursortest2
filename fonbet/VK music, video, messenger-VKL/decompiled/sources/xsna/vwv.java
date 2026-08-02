package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vk.audiomsg.player.service.AudioMsgPlayerNotificationService;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import xsna.c63;
import xsna.gx8;
import xsna.ysa;

/* compiled from: ImAudioMsgPlayerProvider.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class vwv implements gx8.a {
    public static Context c;
    public static aqi d;
    public static wb3 e;
    public static Future<?> f;
    public static io.reactivex.rxjava3.disposables.c h;
    public static final vwv b = new vwv();
    public static final bpn0 g = new bpn0(new w94(8));

    /* compiled from: ImAudioMsgPlayerProvider.kt */
    public static final class a extends c63.b {
        @Override // xsna.c63.b
        public final void u() {
            vwv.b.getClass();
            if (((xal) vwv.g.getValue()).isPlaying()) {
                L.e("Start AudioMsgPlayer foreground service");
                synchronized (nr4.a) {
                    try {
                        if (nr4.k != 2) {
                            nr4.d = false;
                        }
                        if (nr4.k == 0) {
                            Context context = nr4.e;
                            if (context == null) {
                                context = null;
                            }
                            Intent intent = new Intent(context, (Class<?>) AudioMsgPlayerNotificationService.class);
                            try {
                                Context context2 = nr4.e;
                                if (context2 == null) {
                                    context2 = null;
                                }
                                context2.bindService(intent, new com.vk.audiomsg.player.service.a(), 1);
                            } catch (Throwable unused) {
                                Context context3 = nr4.e;
                                r7s.b(context3 != null ? context3 : null, intent);
                            }
                            nr4.k = 1;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            vwv.b(vwv.b);
        }
    }

    /* compiled from: ImAudioMsgPlayerProvider.kt */
    public static final class b extends c63.b {
        public final ysa b;

        public b(ysa ysaVar) {
            this.b = ysaVar;
        }

        @Override // xsna.c63.b
        public final void u() {
            ysa ysaVar = this.b;
            synchronized (ysaVar) {
                if (ysaVar.i) {
                    ysaVar.i = false;
                    ysaVar.a.y((ysa.b) ysaVar.b.getValue());
                    ysaVar.d();
                    ysaVar.a();
                }
            }
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            this.b.b();
        }
    }

    /* compiled from: ImAudioMsgPlayerProvider.kt */
    public static final class c extends o56 {
        @Override // xsna.o56, xsna.kr4
        public final void n(ir4 ir4Var, bgk0 bgk0Var) {
            vwv.b(vwv.b);
        }

        @Override // xsna.o56, xsna.kr4
        public final void p(ir4 ir4Var, bgk0 bgk0Var, List<ur4> list) {
            if (list.isEmpty()) {
                vwv.b(vwv.b);
            }
        }
    }

    public static final void b(vwv vwvVar) {
        vwvVar.getClass();
        L.e("Stop AudioMsgPlayer foreground service");
        nr4.a.c();
    }

    public static final xal c() {
        try {
            Future<?> future = f;
            if (future != null) {
                future.get(1L, TimeUnit.SECONDS);
            }
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.q(e2);
        }
        b.getClass();
        return (xal) g.getValue();
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.OTHER;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        xal c2 = c();
        lza0 lza0Var = jw5.b;
        c2.E(lza0Var);
        c2.a(lza0Var);
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "ImAudioMsgPlayerProvider";
    }

    @Override // xsna.gx8.a
    public final long u() {
        PrivateFiles.a b2;
        b2 = e8r.a.b(r1, PrivateSubdir.AUDIO_MESSAGE.h(), true);
        return z4g.g(b2.a);
    }
}
