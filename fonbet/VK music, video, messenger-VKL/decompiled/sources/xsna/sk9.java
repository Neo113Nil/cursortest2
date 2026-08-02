package xsna;

import android.content.Context;
import android.graphics.Point;
import android.media.CamcorderProfile;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.media.MediaUtils;
import com.vk.media.gles.a;
import com.vk.media.recorder.RecorderBase;
import com.vk.media.recorder.f;
import com.vk.media.render.RenderBase;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ci9;
import xsna.io9;
import xsna.rl9;
import xsna.xk9;

/* compiled from: CameraRender.java */
/* loaded from: classes3.dex */
public class sk9 extends xk9 {
    public final ri9 f0;
    public final rl9 g0;
    public int h0;
    public khu0 i0;
    public boolean j0;
    public boolean k0;
    public a l0;
    public boolean m0;

    /* compiled from: CameraRender.java */
    public static class a {
        public final MediaUtils.e a;
        public final MediaUtils.e b;
        public final MediaUtils.e c;
        public final MediaUtils.e d;
        public final int e;

        public a(MediaUtils.e eVar, MediaUtils.e eVar2, MediaUtils.e eVar3, MediaUtils.e eVar4, int i) {
            eVar.toString();
            eVar2.toString();
            eVar3.toString();
            eVar4.toString();
            this.a = eVar;
            this.b = eVar2;
            this.c = eVar3;
            this.d = eVar4;
            this.e = i;
        }
    }

    public sk9(@NonNull aj9 aj9Var, Context context, mo9 mo9Var, Point point, @Nullable String str, boolean z) {
        super(aj9Var, context, mo9Var, point, str, z);
        this.h0 = -2;
        this.i0 = null;
        this.j0 = false;
        this.k0 = false;
        ri9 ri9Var = new ri9(this.b);
        this.f0 = ri9Var;
        rl9 rl9Var = new rl9();
        this.g0 = rl9Var;
        rl9.b bVar = rl9Var.a;
        bVar.j(-1);
        ih9 k = bVar.k();
        if (k == null || !k.a()) {
            return;
        }
        k.sendMessage(k.obtainMessage(2, ri9Var));
    }

    public void i(boolean z, boolean z2) {
        throw null;
    }

    public MediaUtils.e j() {
        throw null;
    }

    public final void k() {
        if (this.l0 != null) {
            MediaUtils.e j = j();
            if (this.v) {
                int min = Math.min(j.a, j.b);
                j.a = min;
                j.b = min;
            }
            MediaUtils.d dVar = this.d;
            boolean z = dVar.a <= dVar.b;
            MediaUtils.d c = io9.c(j, z);
            f.a aVar = this.d0;
            if (aVar == null || com.vk.media.recorder.f.this.G(j, z)) {
                d(new df6(2, this, c));
            }
        }
    }

    public boolean l() {
        throw null;
    }

    public final boolean m() {
        f.a aVar = this.d0;
        return aVar != null && com.vk.media.recorder.f.this.A == RecorderBase.RecordingType.LOOP;
    }

    public final void n() {
        boolean z = this.m0 || l() || m();
        rl9 rl9Var = this.g0;
        Runnable runnable = rl9Var.c;
        Runnable runnable2 = rl9Var.d;
        ih9 k = rl9Var.a.k();
        if (k != null) {
            k.removeCallbacks(z ? runnable2 : runnable);
            if (!z) {
                runnable = runnable2;
            }
            k.post(runnable);
        }
    }

    public final void o(int i) {
        MediaUtils.e b;
        MediaUtils.e eVar;
        a aVar = this.l0;
        if (aVar == null || aVar.e != i) {
            io9.d dVar = this.y;
            dVar.getClass();
            if (CamcorderProfile.hasProfile(i, 6)) {
                CamcorderProfile camcorderProfile = CamcorderProfile.get(i, 6);
                io9.d.a(camcorderProfile);
                b = camcorderProfile == null ? dVar.b(i) : io9.d.d(camcorderProfile);
            } else {
                b = dVar.b(i);
            }
            MediaUtils.e eVar2 = b;
            MediaUtils.e b2 = dVar.b(i);
            MediaUtils.e c = dVar.c(i);
            if (b2.a * b2.b > c.a * c.b) {
                int i2 = dVar.a;
                if (i2 > 0 && i2 / 2 > 921600 && b4k.e.a()) {
                    eVar = b2;
                    this.l0 = new a(eVar2, b2, eVar, dVar.c(i), i);
                }
                ArrayList<MediaUtils.g> arrayList = MediaUtils.c.a;
                int i3 = c.b;
                ArrayList<MediaUtils.g> arrayList2 = MediaUtils.c.a;
                MediaUtils.d dVar2 = (MediaUtils.d) xy9.b(1, arrayList2);
                int i4 = dVar2.a;
                int i5 = dVar2.b;
                Iterator<MediaUtils.g> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediaUtils.g next = it.next();
                    int i6 = next.b;
                    int i7 = next.a;
                    if (i6 >= i3) {
                        i4 = i7;
                        i5 = i6;
                        break;
                    }
                }
                if (i5 > c.b) {
                    c.a = i4;
                    c.b = i5;
                }
            }
            eVar = c;
            this.l0 = new a(eVar2, b2, eVar, dVar.c(i), i);
        }
    }

    public final void p(jhu0 jhu0Var, rl9.c... cVarArr) {
        rl9 rl9Var = this.g0;
        rl9.b bVar = rl9Var.a;
        rl9.b bVar2 = rl9Var.a;
        bVar.j(-1);
        ih9 k = bVar.k();
        ri9 ri9Var = this.f0;
        if (k != null && k.a()) {
            k.sendMessage(k.obtainMessage(2, ri9Var));
        }
        boolean z = this.h0 != jhu0Var.a();
        this.h0 = jhu0Var.a();
        this.i0 = jhu0Var.b();
        ri9Var.i = this.h0 == this.s.d().intValue();
        ih9 k2 = bVar2.k();
        if (k2 != null && k2.a()) {
            k2.sendMessage(k2.obtainMessage(3, jhu0Var));
        }
        o(this.h0);
        d(new vk9((mk9) this, 0));
        k();
        q(z, true);
        for (rl9.c cVar : cVarArr) {
            ih9 k3 = bVar2.k();
            if (k3 != null && k3.a()) {
                k3.sendMessage(k3.obtainMessage(2, cVar));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[Catch: Exception -> 0x0015, TryCatch #2 {Exception -> 0x0015, blocks: (B:3:0x0003, B:5:0x000c, B:9:0x0018, B:11:0x001c, B:13:0x0023, B:14:0x0027, B:17:0x0030, B:18:0x0032, B:23:0x0038, B:24:0x004a, B:26:0x0050, B:45:0x003c, B:47:0x0043, B:49:0x0047, B:53:0x0055, B:20:0x0033, B:21:0x0035), top: B:2:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z, boolean z2) {
        boolean z3;
        ri9 ri9Var;
        boolean z4;
        com.vk.media.ok.b bVar;
        try {
            n();
        } catch (Exception e) {
            e.toString();
        }
        if (!l() && !m()) {
            z3 = false;
            ri9Var = this.f0;
            if (z3) {
                ii9 ii9Var = ((mk9) this).n0;
                if (TextUtils.isEmpty(ii9Var != null ? ii9Var.a : null)) {
                    z4 = true;
                    synchronized (ri9Var.b) {
                        ri9Var.h = z4;
                    }
                    if (z3) {
                        i(z, z2);
                    } else {
                        mk9 mk9Var = (mk9) this;
                        mk9Var.j0 = false;
                        if (z2 && (bVar = mk9Var.B) != null) {
                            bVar.B(null, null);
                        }
                    }
                    if (m()) {
                        this.j0 = true;
                    }
                    boolean z5 = this.j0;
                    this.k0 = true;
                    ri9 ri9Var2 = this.f0;
                    synchronized (ri9Var2.b) {
                        ri9Var2.f = z5;
                    }
                    final ri9 ri9Var3 = this.j0 ? this.f0 : null;
                    final boolean z6 = this.h0 == this.s.b().intValue();
                    this.Y = z6;
                    d(new Runnable() { // from class: xsna.tk9
                        /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            boolean z7;
                            ri9 ri9Var4;
                            boolean z8;
                            sk9 sk9Var = sk9.this;
                            xk9.a aVar = ri9Var3;
                            boolean z9 = z6;
                            ci9.b bVar2 = sk9Var.A;
                            if (bVar2 == null) {
                                return;
                            }
                            if (aVar == null) {
                                bVar2.j();
                                bVar2.g = false;
                                return;
                            }
                            bVar2.g = true;
                            a.C1262a c1262a = bVar2.b;
                            if (!bVar2.h) {
                                ri9 ri9Var5 = (ri9) aVar;
                                synchronized (ri9Var5.b) {
                                    z8 = ri9Var5.h;
                                }
                                if (z8) {
                                    z7 = false;
                                    c1262a.h(z9, true, true, z7, null);
                                    bVar2.f = aVar;
                                    ci9.a aVar2 = bVar2.e;
                                    ri9Var4 = (ri9) aVar;
                                    synchronized (ri9Var4.b) {
                                        ri9Var4.e = aVar2;
                                    }
                                    return;
                                }
                            }
                            z7 = true;
                            c1262a.h(z9, true, true, z7, null);
                            bVar2.f = aVar;
                            ci9.a aVar22 = bVar2.e;
                            ri9Var4 = (ri9) aVar;
                            synchronized (ri9Var4.b) {
                            }
                        }
                    });
                    RenderBase.RenderingState renderingState = RenderBase.RenderingState.START;
                    this.h = renderingState;
                    d(new jx8(6, this, renderingState));
                    return;
                }
            }
            z4 = false;
            synchronized (ri9Var.b) {
            }
        }
        z3 = true;
        ri9Var = this.f0;
        if (z3) {
        }
        z4 = false;
        synchronized (ri9Var.b) {
        }
    }
}
