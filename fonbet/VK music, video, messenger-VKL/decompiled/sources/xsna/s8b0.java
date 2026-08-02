package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.gco;
import xsna.k840;

/* compiled from: PlaylistDownloadingStateListenerImpl.kt */
/* loaded from: classes3.dex */
public final class s8b0 implements r8b0 {
    public final Playlist a;
    public final gco.a b;
    public final whe c;
    public final u750 d;
    public final LinkedHashMap e;
    public boolean f;
    public final o8b0 g;
    public final p8b0 h;
    public final bpn0 i;

    public s8b0() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public s8b0(Playlist playlist, whe wheVar) {
        List<MusicTrack> list = playlist.y;
        this.a = playlist;
        this.b = gco.a.a;
        this.c = wheVar;
        s750 s750Var = k840.a.e;
        this.d = s750Var == null ? null : s750Var;
        this.e = new LinkedHashMap();
        s6x s6xVar = new s6x(18);
        s750 s750Var2 = k840.a.e;
        this.h = new p8b0(playlist, s6xVar, s750Var2 == null ? null : s750Var2);
        this.i = new bpn0(new ap80(2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (MusicTrack musicTrack : list) {
            if (musicTrack.S4() || musicTrack.B()) {
                i++;
            } else {
                hfp0 hfp0Var = new hfp0(musicTrack, this.b, new c95(1, this, s8b0.class, "post", "post(Lcom/vk/music/events/MusicEvent;)V", 0, 6), this.d);
                boolean booleanValue = ((Boolean) this.i.getValue()).booleanValue();
                MusicTrack b = kq40.b(hfp0Var.d);
                if (!booleanValue) {
                    hfp0Var.b.invoke(new ib50(hfp0Var.d, b));
                }
                hfp0Var.d = b;
                this.e.put(musicTrack.Fb(), hfp0Var);
                linkedHashMap.put(musicTrack.Fb(), kq40.b(musicTrack));
            }
        }
        if (((Boolean) this.i.getValue()).booleanValue()) {
            r5v0 r5v0Var = k840.a.h;
            (r5v0Var != null ? r5v0Var : null).b(new gc50(linkedHashMap));
        }
        this.g = new o8b0(list.size(), i);
        this.h.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        g();
    }

    @Override // xsna.r8b0
    public final void a(MusicTrack musicTrack) {
        String Fb = musicTrack.Fb();
        LinkedHashMap linkedHashMap = this.e;
        if (((hfp0) linkedHashMap.get(Fb)) != null) {
            o8b0 o8b0Var = this.g;
            o8b0Var.c--;
            o8b0Var.d++;
            linkedHashMap.remove(musicTrack.Fb());
            this.h.a(o8b0Var.b);
            g();
        }
    }

    @Override // xsna.r8b0
    public final synchronized void b(MusicTrack musicTrack, float f) {
        hfp0 hfp0Var = (hfp0) this.e.get(musicTrack.Fb());
        if (hfp0Var != null) {
            hfp0.b(hfp0Var, f);
        }
    }

    @Override // xsna.r8b0
    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            this.h.c();
            arrayList = new ArrayList();
            for (MusicTrack musicTrack : this.a.y) {
                hfp0 hfp0Var = (hfp0) this.e.get(musicTrack.Fb());
                if (hfp0Var != null) {
                    if (hfp0Var.d.J instanceof DownloadingState.Downloading) {
                        arrayList.add(musicTrack);
                    }
                    if (!(hfp0Var.d.J instanceof DownloadingState.Downloaded)) {
                        hfp0.c(hfp0Var, null, 3);
                        this.e.remove(musicTrack.Fb());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // xsna.r8b0
    public final synchronized void d(MusicTrack musicTrack, Throwable th) {
        try {
            o8b0 o8b0Var = this.g;
            o8b0Var.c--;
            o8b0Var.b += o8b0Var.a;
            hfp0 hfp0Var = (hfp0) this.e.get(musicTrack.Fb());
            if (hfp0Var != null) {
                hfp0.c(hfp0Var, th, 2);
            }
            this.h.a(this.g.b);
            g();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // xsna.r8b0
    public final synchronized void e(MusicTrack musicTrack) {
        try {
            o8b0 o8b0Var = this.g;
            o8b0Var.c--;
            o8b0Var.b += o8b0Var.a;
            hfp0 hfp0Var = (hfp0) this.e.get(musicTrack.Fb());
            if (hfp0Var != null) {
                hfp0.a(hfp0Var);
            }
            this.h.a(this.g.b);
            g();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.r8b0
    public final synchronized void f() {
        p8b0 p8b0Var = this.h;
        s6x s6xVar = p8b0Var.a;
        Playlist playlist = p8b0Var.c;
        s6xVar.invoke(new n8b0(playlist, playlist));
    }

    public final void g() {
        o8b0 o8b0Var = this.g;
        if (o8b0Var.c == 0) {
            this.f = true;
            this.c.invoke(this.a);
            int i = o8b0Var.d;
            p8b0 p8b0Var = this.h;
            if (i > 0) {
                p8b0Var.c();
                return;
            }
            Playlist zb = Playlist.zb(p8b0Var.c, null, null, null, DownloadingState.Downloaded.b, -1, 254);
            p8b0Var.a.invoke(new n8b0(p8b0Var.c, zb));
            p8b0Var.c = zb;
            p8b0Var.b.Q(zb.Ib());
        }
    }

    public final boolean h() {
        return this.f;
    }
}
