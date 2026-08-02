package xsna;

import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.autoplay.e;
import java.lang.ref.WeakReference;
import xsna.ocx;

/* compiled from: InteractiveVolumeHandler.kt */
/* loaded from: classes3.dex */
public final class wcx implements vbx, e.a {
    public final ugl b;
    public ocx c;
    public final z2s0 d;
    public final com.vk.libvideo.autoplay.e e;
    public final Handler f;
    public final vcx g;

    public wcx(String str, ugl uglVar, ocx ocxVar) {
        z2s0 z2s0Var = z2s0.b;
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        Handler a = i0q0.a();
        this.b = uglVar;
        this.c = ocxVar;
        this.d = z2s0Var;
        this.e = eVar;
        this.f = a;
        this.g = new vcx(str, this);
    }

    @Override // xsna.vbx
    public final void a(ocx ocxVar) {
        c(ocxVar);
        if (!epx.f(this.c.a, ocxVar.a) || !epx.e(this.c.o, ocxVar.o) || !epx.f(this.c.r, ocxVar.r)) {
            b(ocxVar);
        }
        this.c = ocxVar;
    }

    public final void b(ocx ocxVar) {
        ocx.b bVar = ocxVar.a;
        com.vk.libvideo.autoplay.a aVar = ocxVar.r;
        boolean z = bVar.a;
        vcx vcxVar = this.g;
        z2s0 z2s0Var = this.d;
        if (!z) {
            z2s0Var.getClass();
            z2s0.i(vcxVar);
        } else {
            WeakReference<e.a> weakReference = new WeakReference<>(this);
            this.e.getClass();
            com.vk.libvideo.autoplay.e.c = weakReference;
            z2s0Var.g(vcxVar, (aVar.c() || !aVar.f()) ? 2 : 0);
        }
    }

    public final void c(ocx ocxVar) {
        final float f;
        com.vk.libvideo.autoplay.a aVar = ocxVar.r;
        if ((aVar.c() || !aVar.f()) && aVar.k) {
            this.d.getClass();
            f = z2s0.n;
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (epx.a(f, ocxVar.o)) {
            return;
        }
        this.f.post(new Runnable() { // from class: xsna.ucx
            @Override // java.lang.Runnable
            public final void run() {
                wcx.this.g.setVolume(f);
            }
        });
    }

    @Override // com.vk.libvideo.autoplay.e.a
    public final void onMuteChange(boolean z) {
        c(this.c);
        b(this.c);
    }
}
