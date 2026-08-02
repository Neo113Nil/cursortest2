package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.PlaybackActionMeta;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.data.b;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.g8x;
import xsna.k840;
import xsna.mb4;
import xsna.q950;

/* compiled from: MusicAdPlayer.kt */
/* loaded from: classes3.dex */
public final class e940 implements g8x.d, d940 {
    public final zg0 b;
    public final mb4 c;
    public q950 d;
    public final bpn0 e = new bpn0(new gc(19));
    public f940 f = new f940(null, null, null, null, null, 255);
    public boolean g;
    public final fx40 h;

    /* compiled from: MusicAdPlayer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioAdConfig.Type.values().length];
            try {
                iArr[AudioAdConfig.Type.PREROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioAdConfig.Type.MIDROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioAdConfig.Type.POSTROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e940(zg0 zg0Var, mb4 mb4Var) {
        this.b = zg0Var;
        this.c = mb4Var;
        this.h = zg0Var.getConfig();
    }

    @Override // xsna.d940
    public final void A() {
        ijz0 ijz0Var;
        g8x g8xVar = this.f.c;
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (g8xVar == null || b == null || (ijz0Var = g8xVar.h) == null) {
            return;
        }
        gu8.c(null, "InstreamAudioAdEngine: handleAdChoicesClick called");
        fvy0 fvy0Var = ijz0Var.h;
        if (fvy0Var != null) {
            if (fvy0Var.c()) {
                return;
            }
            ijz0Var.h.b(b);
            ijz0Var.h.d = ijz0Var.m;
            return;
        }
        gu8.c(null, "InstreamAudioAdEngine: hasn't adChoicesOptions");
        if (ijz0Var.i != null) {
            gu8.c(null, "InstreamAudioAdEngine: open adChoicesClickLink");
            de.L(ijz0Var.i, null, null, null, b);
        }
    }

    @Override // xsna.g8x.d
    public final void a(float f, float f2) {
        AudioAdConfig.Type type = this.f.h;
        String id = type != null ? type.getId() : null;
        mb4 mb4Var = this.c;
        float f3 = f2 - f;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.f.a;
        if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 == f2) {
            return;
        }
        float f4 = f2 / 100.0f;
        if (Math.abs(f3 - (0 * f4)) < 1.0f) {
            if (mb4Var.a) {
                return;
            }
            mb4.a.a(X3.i.d0, id, musicPlaybackLaunchContext);
            mb4Var.a = true;
            return;
        }
        if (Math.abs(f3 - (25 * f4)) < 1.0f) {
            if (mb4Var.b) {
                return;
            }
            mb4.a.a("progress_25", id, musicPlaybackLaunchContext);
            mb4Var.b = true;
            return;
        }
        if (Math.abs(f3 - (50 * f4)) < 1.0f) {
            if (mb4Var.c) {
                return;
            }
            mb4.a.a("progress_50", id, musicPlaybackLaunchContext);
            mb4Var.c = true;
            return;
        }
        if (Math.abs(f3 - (f4 * 75)) >= 1.0f || mb4Var.d) {
            return;
        }
        mb4.a.a("progress_75", id, musicPlaybackLaunchContext);
        mb4Var.d = true;
    }

    @Override // xsna.g8x.d
    public final void b(g8x g8xVar, g8x.c cVar) {
        bn40.f(g8xVar, cVar);
        AudioAdConfig.Type type = this.f.h;
        String id = type != null ? type.getId() : null;
        mb4 mb4Var = this.c;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.f.a;
        b.d a2 = io.reactivex.rxjava3.processors.b.a("audio_ad", NotificationCompat.CATEGORY_EVENT, X3.i.s);
        a2.b(musicPlaybackLaunchContext.t(), "section");
        a2.b(id, "type");
        bn40.b("MusicStats", "[VK_TRACKER]", "ADVERTISEMENT", a2);
        a2.e();
        mb4Var.d = false;
        mb4Var.c = mb4Var.d;
        mb4Var.b = mb4Var.c;
        mb4Var.a = mb4Var.b;
        f940 f940Var = this.f;
        f940 a3 = f940.a(f940Var, cVar, f940Var.e + 1, 231);
        this.f = a3;
        if (a3.h == null || this.d == null) {
            return;
        }
        r5v0 r5v0Var = k840.a.h;
        (r5v0Var != null ? r5v0Var : null).b(mv40.a);
    }

    @Override // xsna.g8x.d
    public final void d(g8x g8xVar, g8x.c cVar) {
        bn40.f(g8xVar, cVar);
        AudioAdConfig.Type type = this.f.h;
        String id = type != null ? type.getId() : null;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.f.a;
        b.d a2 = io.reactivex.rxjava3.processors.b.a("audio_ad", NotificationCompat.CATEGORY_EVENT, "completed");
        a2.b(musicPlaybackLaunchContext.t(), "section");
        a2.b(id, "type");
        bn40.b("MusicStats", "[VK_TRACKER]", "ADVERTISEMENT", a2);
        a2.e();
        this.f = f940.a(this.f, null, 0, 247);
        this.g = true;
    }

    @Override // xsna.g8x.d
    public final void g(String str, g8x g8xVar) {
        bn40.f(str, g8xVar);
        k(this.g);
    }

    public final boolean h(int i) {
        Iterator<T> it = this.f.f.iterator();
        while (it.hasNext()) {
            ((ml20) it.next()).getClass();
        }
        return false;
    }

    public final void i() {
        bn40.f(new Object[0]);
        g8x g8xVar = this.f.c;
        if (g8xVar != null) {
            g8xVar.j = null;
            ijz0 ijz0Var = g8xVar.h;
            if (ijz0Var != null) {
                ijz0Var.d(ijz0Var.j);
            }
            g8xVar.e();
        }
        this.f = new f940(null, null, null, null, null, 255);
    }

    public final boolean j() {
        bn40.f(new Object[0]);
        return this.b.isRunning();
    }

    public final void k(boolean z) {
        kx40 kx40Var;
        PlaybackActionMeta playbackActionMeta;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{zhy0.a("success: ", z)});
        }
        q950 q950Var = this.d;
        if (q950Var != null) {
            AudioAdConfig.Type type = this.f.h;
            r950 r950Var = q950Var.a;
            hx40 hx40Var = r950Var.c;
            cz40 cz40Var = hx40Var.b;
            nb4 nb4Var = r950Var.f;
            kx40 kx40Var2 = r950Var.m;
            nb4Var.e(kx40Var2 != null ? kx40Var2.b : null, hx40Var.p.d, r950Var.b, type, z);
            boolean z2 = true;
            if ((type == null ? -1 : q950.a.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
                r950Var.d(cz40Var);
                px40 E = r950Var.E();
                if (E != null) {
                    E.l(r950Var.c());
                }
            } else {
                r950Var.d(cz40Var);
                int i = 5;
                if (!z && (kx40Var = r950Var.m) != null && (playbackActionMeta = kx40Var.e) != null) {
                    i = playbackActionMeta.b;
                }
                int i2 = i;
                if (!r950Var.p && hx40Var.o.d()) {
                    if (r950Var.n) {
                        hx40Var.d(i2, null);
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        hx40Var.f(new PlaybackActionMeta(i2, 0L, 2, null));
                    }
                }
            }
        }
        this.f = f940.a(this.f, null, 0, 127);
    }

    public final boolean l(int i) {
        i8x i8xVar;
        bn40.f(new Object[0]);
        g8x g8xVar = this.f.c;
        if (g8xVar == null) {
            return false;
        }
        zg0 zg0Var = this.b;
        zg0Var.r(wg0.a(zg0Var.t(), i, false, null, 6));
        ijz0 ijz0Var = g8xVar.h;
        if (ijz0Var == null || ijz0Var.j == null || (i8xVar = ijz0Var.f.g) == null) {
            return true;
        }
        i8xVar.e();
        return true;
    }

    @Override // xsna.d940
    public final void m() {
        g8x.b bVar;
        ijz0 ijz0Var;
        g8x g8xVar = this.f.c;
        if (g8xVar != null) {
            ijz0 ijz0Var2 = g8xVar.h;
            g8x.c cVar = ijz0Var2 != null ? ijz0Var2.l : null;
            if (cVar != null) {
                bVar = (g8x.b) j5g.a0(cVar.k);
                if (g8xVar != null || bVar == null || (ijz0Var = g8xVar.h) == null) {
                    return;
                }
                if (ijz0Var.f.b() == null) {
                    gu8.c(null, "InstreamAudioAdEngine: Can't handle show - context is null");
                    return;
                }
                n4z0 b = ijz0Var.b(bVar);
                if (b == null) {
                    gu8.c(null, "InstreamAudioAdEngine: Can't handle show - companion banner not found");
                    return;
                } else {
                    h8z0.e(b.a, "playbackStarted", 1, null);
                    return;
                }
            }
        }
        bVar = null;
        if (g8xVar != null) {
        }
    }

    public final void n(f940 f940Var, boolean z, int i) {
        boolean z2;
        zg0 zg0Var = this.b;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = f940Var.a;
        MusicTrack musicTrack = f940Var.b;
        AudioAdConfig.Type type = f940Var.h;
        L.p("initialState = ", f940Var, "positionSec = ", Integer.valueOf(i));
        this.g = false;
        g8x g8xVar = f940Var.c;
        if (g8xVar == null || type == null || musicTrack == null) {
            bn40.d("Advertisement don't downloaded! You must first call method loadAd!");
            k(false);
            return;
        }
        g8xVar.j = this;
        g8xVar.i = zg0Var;
        ijz0 ijz0Var = g8xVar.h;
        if (ijz0Var != null) {
            ijz0Var.c(zg0Var);
        }
        this.f = f940Var;
        Serializer.c<AudioAdConfig> cVar = AudioAdConfig.CREATOR;
        AudioAdConfig audioAdConfig = f940Var.g;
        String t = musicPlaybackLaunchContext.t();
        if (musicTrack.v != null) {
            z2 = true;
        } else {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            z2 = false;
        }
        String b = AudioAdConfig.a.b(audioAdConfig, type, t, z2);
        if (b != null) {
            bn40.f("rejectReason", b);
            this.c.a(type.getId(), b, musicPlaybackLaunchContext);
            k(false);
            return;
        }
        zg0Var.r(wg0.a(zg0Var.t(), 0, z, g8xVar, 1));
        if (((Boolean) this.e.getValue()).booleanValue()) {
            List<String> f = g8xVar.f();
            if (f.contains(AudioAdConfig.Type.PREROLL.getId())) {
                g8xVar.d("preroll");
                return;
            } else if (f.contains(AudioAdConfig.Type.POSTROLL.getId())) {
                g8xVar.d("postroll");
                return;
            } else {
                if (f.contains(AudioAdConfig.Type.MIDROLL.getId())) {
                    h(i);
                    return;
                }
                return;
            }
        }
        int i2 = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            g8xVar.d("preroll");
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            g8xVar.d("postroll");
            return;
        }
        float f2 = i;
        ijz0 ijz0Var2 = g8xVar.h;
        if (ijz0Var2 == null) {
            gu8.c(null, "InstreamAudioAd: Unable to start ad – not loaded yet");
            return;
        }
        if (ijz0Var2.f.g == null) {
            gu8.c(null, "InstreamAudioAd: Unable to start ad – player has not set");
            return;
        }
        ijz0Var2.d(ijz0Var2.j);
        for (float f3 : ijz0Var2.o) {
            if (Float.compare(f3, f2) == 0) {
                pjz0 b2 = ijz0Var2.c.b("midroll");
                if (b2 != null) {
                    ijz0Var2.q.b(b2, f2, ijz0Var2.d.j, ijz0Var2.r, new xx50(ijz0Var2, b2));
                    return;
                }
                return;
            }
        }
        gu8.c(null, "InstreamAudioAdEngine: Attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
    }

    @Override // xsna.d940
    public final void o() {
        g8x.b bVar;
        ijz0 ijz0Var;
        g8x g8xVar = this.f.c;
        if (g8xVar != null) {
            ijz0 ijz0Var2 = g8xVar.h;
            g8x.c cVar = ijz0Var2 != null ? ijz0Var2.l : null;
            if (cVar != null) {
                bVar = (g8x.b) j5g.a0(cVar.k);
                if (g8xVar != null || bVar == null || (ijz0Var = g8xVar.h) == null) {
                    return;
                }
                Context b = ijz0Var.f.b();
                if (b == null) {
                    gu8.c(null, "InstreamAudioAdEngine: Can't handle click - context is null");
                    return;
                }
                n4z0 b2 = ijz0Var.b(bVar);
                if (b2 == null) {
                    gu8.c(null, "InstreamAudioAdEngine: Can't handle click - companion banner not found");
                    return;
                }
                mez0 mez0Var = ijz0Var.g;
                ijz0Var.a.getClass();
                mez0Var.c(b2, 1, null, b);
                return;
            }
        }
        bVar = null;
        if (g8xVar != null) {
        }
    }

    @Override // xsna.d940
    public final AdvertisementInfo y() {
        return this.f.i;
    }

    @Override // xsna.g8x.d
    public final void c(g8x g8xVar) {
    }

    @Override // xsna.g8x.d
    public final void e(g8x g8xVar) {
    }

    @Override // xsna.g8x.d
    public final void f(g8x g8xVar) {
    }
}
