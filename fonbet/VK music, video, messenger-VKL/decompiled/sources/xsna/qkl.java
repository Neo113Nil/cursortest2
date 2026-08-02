package xsna;

import android.content.Context;
import android.os.Looper;
import com.vk.core.telemetry.VideoOpenTelemetryComponent;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.media.player.pool.OneVideoPlayerConfigInitializer;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import one.video.exo.datasource.dash.parser.AudioTracksFilterMode;
import one.video.player.OneVideoPlayer;
import one.video.player.model.FrameSize;
import one.video.player.model.VideoContentType;
import xsna.o1b0;
import xsna.toz;

/* compiled from: DefaultPlayerFactory.kt */
/* loaded from: classes3.dex */
public class qkl implements o1b0 {
    public final boolean b;
    public final boolean c;
    public final LinkedHashMap<sht0, d3b0> d;
    public final c3b0 e;
    public final pzf f;
    public final bpn0 g;

    public qkl(bpn0 bpn0Var, b25 b25Var) {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIPS_NEW_DISK_CACHE;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        this.b = bVar.a(videoFeatures);
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NEW_OFFLINE_MANAGER;
        videoFeatures2.getClass();
        this.c = bVar.a(videoFeatures2);
        this.d = new LinkedHashMap<>();
        this.e = new c3b0();
        this.f = new pzf();
        this.g = bpn0Var;
        OneVideoPlayerConfigInitializer.a();
        itg0.i(6, new io.reactivex.rxjava3.internal.operators.observable.j2(new io.reactivex.rxjava3.internal.operators.observable.y(b25Var.C(), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a)), null, new dxh(this, 5), null);
    }

    public static void o(d3b0 d3b0Var, boolean z) {
        izs<d3b0, s3q0> m = d3b0Var.m();
        if (m != null) {
            m.invoke(d3b0Var);
        }
        toz.a.getClass();
        d3b0Var.g(toz.b.b);
        d3b0Var.j(null);
        if (z) {
            OneVideoPlayer a = d3b0Var.a();
            if (a != null) {
                a.stop();
            }
            OneVideoPlayer a2 = d3b0Var.a();
            if (a2 != null) {
                a2.release();
            }
        }
        d3b0Var.o(null);
        d3b0Var.d(null);
    }

    @Override // xsna.o1b0
    public final OneVideoPlayer a(sht0 sht0Var) {
        d3b0 l = l(sht0Var);
        if (l != null) {
            return l.a();
        }
        return null;
    }

    @Override // xsna.o1b0
    public final void c(VideoTextureView videoTextureView, d3b0 d3b0Var) {
        Collection<d3b0> values = this.d.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            d3b0 d3b0Var2 = (d3b0) obj;
            if (d3b0Var != d3b0Var2 && d3b0Var2.k(videoTextureView)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d3b0) it.next()).j(null);
        }
    }

    @Override // xsna.o1b0
    public final int d() {
        return this.e.a;
    }

    @Override // xsna.o1b0
    public final void e(sht0 sht0Var) {
        LinkedHashMap<sht0, d3b0> linkedHashMap = this.d;
        Set<Map.Entry<sht0, d3b0>> entrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (!((sht0) ((Map.Entry) obj).getKey()).equals(sht0Var)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sht0 sht0Var2 = (sht0) entry.getKey();
            o((d3b0) entry.getValue(), true);
            linkedHashMap.remove(sht0Var2);
        }
    }

    @Override // xsna.o1b0
    public final void f(sht0 sht0Var, boolean z) {
        d3b0 l = l(sht0Var);
        if (l != null) {
            o(l, z);
            this.d.remove(sht0Var);
        }
    }

    @Override // xsna.o1b0
    public final pzf getCodecInfo() {
        return this.f;
    }

    @Override // xsna.o1b0
    public final void h(sht0 sht0Var, sht0 sht0Var2) {
        LinkedHashMap<sht0, d3b0> linkedHashMap = this.d;
        d3b0 d3b0Var = linkedHashMap.get(sht0Var);
        if (d3b0Var != null) {
            linkedHashMap.remove(sht0Var);
            linkedHashMap.put(sht0Var2, d3b0Var);
        }
    }

    @Override // xsna.o1b0
    public final d3b0 i(m7q m7qVar, fuk0 fuk0Var, boolean z, boolean z2, izs izsVar, VideoAutoPlay.j jVar, List list, boolean z3, z0d0 z0d0Var, mm80 mm80Var) {
        OneVideoPlayer a;
        jgz.e(m7qVar);
        d3b0 n = n(m7qVar, z, z3);
        FrameSize frameSize = null;
        if (n == null) {
            return null;
        }
        boolean b = rm80.b(n, m7qVar);
        if (b) {
            izs<d3b0, s3q0> m = n.m();
            if (m != null) {
                m.invoke(n);
            }
            n.d(null);
            n.o(null);
            n.b();
            if (jVar != null) {
                jVar.invoke(n);
            }
            n.o(fuk0Var);
            n.d(izsVar);
            if (z) {
                n.j(null);
            }
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_OTHER_QUALITY_STICKING_FIX;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                Integer W = fxc0.B().W();
                if (W != null) {
                    OneVideoPlayer a2 = n.a();
                    if (a2 != null) {
                        vm80.c(a2, W.intValue());
                    }
                } else {
                    OneVideoPlayer a3 = n.a();
                    if (a3 != null) {
                        a3.o0();
                    }
                }
            }
        }
        if (this.b) {
            n.i(m7qVar, z0d0Var);
        }
        if (this.c) {
            n.p(mm80Var);
        }
        if (b) {
            n.l(m7qVar, list);
        }
        if (z2) {
            VideoContentType videoContentType = m7qVar.e.a;
            boolean z4 = videoContentType == VideoContentType.DASH || videoContentType == VideoContentType.HLS;
            if (!m7qVar.D && !m7qVar.B && z4) {
                o1b0.a.getClass();
                frameSize = o1b0.a.b;
            }
        }
        if (!fxc0.B().J().l0() && (a = n.a()) != null) {
            rm80.c(a, frameSize);
        }
        this.d.put(jgz.e(m7qVar), n);
        return n;
    }

    @Override // xsna.o1b0
    public final void j(int i) {
        c3b0 c3b0Var = this.e;
        c3b0Var.getClass();
        c3b0Var.b.onNext(Integer.valueOf(Math.max(i, 1)));
        this.d.size();
    }

    @Override // xsna.o1b0
    public final int k() {
        return this.d.size();
    }

    @Override // xsna.o1b0
    public final d3b0 l(sht0 sht0Var) {
        return this.d.get(sht0Var);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final a6q m(boolean z) {
        o3i0 o3i0Var;
        bm80 bm80Var;
        Looper looper;
        pp9 pp9Var;
        Pair pair;
        tit0 b;
        jlq b2;
        if (z) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            boolean z2 = wn80.e;
            boolean a = fxc0.B().i().a();
            wl80 wl80Var = new wl80(context, z2);
            wl80Var.N = a;
            pair = new Pair(wl80Var, new pkl());
        } else {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            xgp0 a2 = sm80.a();
            bo10 bo10Var = new bo10(((zl80) erl.a.getValue()).b);
            bm80 bm80Var2 = new bm80(new w7u(bo10Var, 23));
            int i = wn80.a;
            rhh0 rhh0Var = new rhh0(8);
            xgp0 xgp0Var = xgp0.j;
            boolean z3 = wn80.e;
            p8l.b.a();
            p8l.c.a();
            p8l.d.a();
            new o3i0(0L, 0L);
            psm0 psm0Var = new psm0(0);
            Looper mainLooper = Looper.getMainLooper();
            cm80 cm80Var = new cm80();
            cm80Var.b(bm80Var2);
            yl80 a3 = cm80Var.a();
            oxv oxvVar = m63.d;
            if (oxvVar == null) {
                oxvVar = null;
            }
            v7s0 v7s0Var = (v7s0) oxvVar.invoke();
            r8l r8lVar = new r8l(qu5.c().getCodecInfo().a(), qu5.c().getCodecInfo().b(), 4);
            Context context3 = context2;
            o3i0 o3i0Var2 = new o3i0(0L, 100L);
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_CANCEL_LONG_REQUESTS;
            videoFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (bVar.a(videoFeatures)) {
                f8s0 b3 = com.vk.toggle.d.j.b();
                if (b3 == null) {
                    f8s0.i.getClass();
                    b3 = f8s0.j;
                }
                bm80Var = bm80Var2;
                looper = mainLooper;
                o3i0Var = o3i0Var2;
                pp9Var = new pp9(b3.a, b3.b, b3.c, b3.e, b3.f, b3.g, b3.h);
            } else {
                o3i0Var = o3i0Var2;
                bm80Var = bm80Var2;
                looper = mainLooper;
                pp9Var = null;
            }
            VideoFeatures videoFeatures2 = VideoFeatures.FAST_QUALITY_INCREASE;
            videoFeatures2.getClass();
            etw etwVar = (!bVar.a(videoFeatures2) || (b2 = com.vk.toggle.d.w.b()) == null) ? null : new etw(new kl80(new jo20(b2.a), new jo20(b2.b)));
            VideoFeatures videoFeatures3 = VideoFeatures.REVERSE_EXP_RENDERER_THREAD;
            videoFeatures3.getClass();
            boolean z4 = bVar.a(videoFeatures3) ^ true;
            VideoFeatures videoFeatures4 = VideoFeatures.VIDEO_STUCK_CONFIG;
            videoFeatures4.getClass();
            xk80 xk80Var = new xk80(context3.getApplicationContext(), looper, a3, null, v7s0Var, z4, rhh0Var, a2, z3, r8lVar, 500L, pp9Var, etwVar, true, o3i0Var, (!bVar.a(videoFeatures4) || (b = com.vk.toggle.d.L0.b()) == null) ? psm0Var : new psm0(b.a, b.b));
            xk80Var.verifyThread("one.video.exo.OneVideoExoPlayer.setMaxSegmentsToLoadPolicy");
            xk80Var.L = bo10Var;
            AudioTracksFilterMode audioTracksFilterMode = AudioTracksFilterMode.FILTER_OUT_LOWER_MIDDLE;
            xk80Var.verifyThread("one.video.exo.OneVideoExoPlayer.setAudioTracksFilterMode");
            xk80Var.N = audioTracksFilterMode;
            pair = new Pair(xk80Var, bm80Var);
        }
        OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) pair.d();
        am80 am80Var = (am80) pair.g();
        Context context4 = e43.a;
        if (context4 == null) {
            context4 = null;
        }
        return new a6q(context4, oneVideoPlayer, am80Var, (VideoOpenTelemetryComponent) this.g.getValue());
    }

    public d3b0 n(m7q m7qVar, boolean z, boolean z2) {
        sht0 e = jgz.e(m7qVar);
        LinkedHashMap<sht0, d3b0> linkedHashMap = this.d;
        d3b0 d3b0Var = linkedHashMap.get(e);
        if (d3b0Var != null) {
            return d3b0Var;
        }
        if (linkedHashMap.size() < this.e.a) {
            return m(false);
        }
        Set<Map.Entry<sht0, d3b0>> entrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (f5b0.b((d3b0) ((Map.Entry) obj).getValue())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return linkedHashMap.remove((sht0) ((Map.Entry) j5g.Y(arrayList)).getKey());
        }
        if (!z2) {
            return null;
        }
        Map.Entry entry = (Map.Entry) j5g.j0(linkedHashMap.entrySet());
        return (d3b0) ttp0.c(linkedHashMap).remove(entry != null ? (sht0) entry.getKey() : null);
    }
}
