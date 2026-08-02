package xsna;

import android.app.Activity;
import com.vk.libvideo.autoplay.b;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.c63;

/* compiled from: VideoBackgroundAutoPlayController.kt */
/* loaded from: classes2.dex */
public final class o4s0 extends c63.b {
    public final pa b;
    public final q4s0 c;
    public final p4s0 d;
    public final n4s0 e;

    public o4s0(pa paVar, p4s0 p4s0Var) {
        q4s0 q4s0Var = q4s0.a;
        this.b = paVar;
        this.c = q4s0Var;
        this.d = p4s0Var;
        this.e = new n4s0(this);
    }

    public final void D() {
        yg5 b = this.b.b();
        if (b != null && this.d.a(b)) {
            this.c.e(b);
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            CopyOnWriteArrayList<b.a> copyOnWriteArrayList = b.C1208b.a().o;
            n4s0 n4s0Var = this.e;
            if (copyOnWriteArrayList.contains(n4s0Var)) {
                return;
            }
            copyOnWriteArrayList.add(n4s0Var);
        }
    }

    @Override // xsna.c63.b
    public final void s() {
        yg5 b = this.b.b();
        if (b == null || !b.M0() || b.R0().h()) {
            return;
        }
        b.k0();
    }

    @Override // xsna.c63.b
    public final void u() {
        D();
    }

    @Override // xsna.c63.b
    public final void v() {
        D();
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        this.d.c();
        this.c.e(null);
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a = b.C1208b.a();
        a.o.remove(this.e);
    }

    @Override // xsna.c63.b
    public final void y(Activity activity) {
        this.d.c();
        this.c.e(null);
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a = b.C1208b.a();
        a.o.remove(this.e);
    }
}
