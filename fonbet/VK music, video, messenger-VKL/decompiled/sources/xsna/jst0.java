package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.autoplay.b;

/* compiled from: VideoVolUpButtonListener.kt */
/* loaded from: classes.dex */
public final class jst0 extends n1z0 implements izs<Integer, s3q0>, bkm {
    public int g;
    public boolean h;

    public static void a(boolean z) {
        com.vk.libvideo.autoplay.a config;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 d = b.C1208b.a().d();
        Float f = null;
        yg5 a = d != null ? d.a() : null;
        if (a != null && (config = a.getConfig()) != null) {
            f = config.d();
        }
        if (f != null) {
            a.a0(com.vk.libvideo.autoplay.a.a(a.getConfig(), null, Float.valueOf(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, null, null, null, 524279));
        }
    }

    public static void c(boolean z) {
        if (z) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            b.C1208b.a().n();
            return;
        }
        z2s0.b.getClass();
        a3s0 h = z2s0.h();
        if (h == null || !h.getConfig().g() || !h.isPlaying() || h.m() || h.getConfig().c()) {
            return;
        }
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        com.vk.libvideo.autoplay.e.f(!com.vk.libvideo.autoplay.e.c());
    }

    @Override // xsna.bkm
    public final void bb(int i) {
        this.h = i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (com.vk.libvideo.autoplay.e.b() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (com.vk.libvideo.autoplay.e.c() == false) goto L28;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke(Integer num) {
        yg5 a;
        yg5 a2;
        com.vk.libvideo.autoplay.a config;
        yg5 a3;
        com.vk.libvideo.autoplay.a config2;
        int intValue = num.intValue();
        if (intValue <= this.g && !this.h) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            xh5 d = b.C1208b.a().d();
            Float f = null;
            boolean z = epx.f((d == null || (a3 = d.a()) == null || (config2 = a3.getConfig()) == null) ? null : Boolean.valueOf(config2.e()), Boolean.TRUE) || n34.s();
            if (intValue == 0) {
                if (z) {
                    com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                }
                if (!z) {
                    com.vk.libvideo.autoplay.e eVar2 = com.vk.libvideo.autoplay.e.a;
                }
            }
            xh5 d2 = b.C1208b.a().d();
            boolean z2 = ((d2 == null || (a2 = d2.a()) == null || (config = a2.getConfig()) == null) ? null : config.d()) != null;
            if (intValue == 0 && z2) {
                xh5 d3 = b.C1208b.a().d();
                if (d3 != null && (a = d3.a()) != null) {
                    f = Float.valueOf(a.getVolume());
                }
                if (epx.d(f, 1.0f)) {
                    a(false);
                }
            }
        }
        return s3q0.a;
    }
}
