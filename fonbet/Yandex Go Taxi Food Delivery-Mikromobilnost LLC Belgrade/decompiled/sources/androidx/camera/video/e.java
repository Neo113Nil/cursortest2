package androidx.camera.video;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.aj31;
import defpackage.d94;
import defpackage.e94;
import defpackage.euy;
import defpackage.g94;
import defpackage.gl7;
import defpackage.hiv;
import defpackage.hsj0;
import defpackage.i94;
import defpackage.jx81;
import defpackage.k74;
import defpackage.ll31;
import defpackage.lzn;
import defpackage.ni91;
import defpackage.oii0;
import defpackage.pl31;
import defpackage.q8n;
import defpackage.ql31;
import defpackage.sgb1;
import defpackage.t26;
import defpackage.vbj;
import defpackage.vg10;
import defpackage.x4e;
import defpackage.znw0;
import java.util.Objects;

/* loaded from: classes10.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ oii0 a;
    public final /* synthetic */ znw0 b;
    public final /* synthetic */ Timebase c;

    public /* synthetic */ e(oii0 oii0Var, znw0 znw0Var, Timebase timebase) {
        this.a = oii0Var;
        this.b = znw0Var;
        this.c = timebase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r1.g.o() == false) goto L47;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        euy g;
        oii0 oii0Var = this.a;
        znw0 znw0Var = this.b;
        Timebase timebase = this.c;
        if (!znw0Var.a()) {
            k kVar = oii0Var.g.e0;
            int ordinal = kVar.i.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                vg10.s("State ", kVar.i, " is not handled");
                                return;
                            }
                        }
                    }
                }
                if (kVar.f == znw0Var) {
                }
            }
            g gVar = oii0Var.g;
            k kVar2 = new k(gVar.e, gVar.d, gVar.c);
            k74 k74Var = (k74) g.l(oii0Var.g.E);
            q8n q8nVar = znw0Var.c;
            g94 c = ll31.c(k74Var, q8nVar, oii0Var.g.v);
            i94 i94Var = k74Var.a;
            Size size = znw0Var.b;
            Range range = znw0Var.d;
            lzn lznVar = c.c;
            d94 d94Var = (d94) (lznVar != null ? new ql31(c.a, timebase, i94Var, size, lznVar, q8nVar, range) : new pl31(c.a, timebase, i94Var, size, q8nVar, range)).get();
            boolean z = oii0Var.g.m0;
            if (d94Var.f == e94.d) {
                MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) vbj.a.b(MediaCodecDefaultDataSpaceQuirk.class);
                if (z && mediaCodecDefaultDataSpaceQuirk != null) {
                    e94 e94Var = e94.f;
                    m mVar = new m();
                    mVar.a = d94Var.a;
                    mVar.b = Integer.valueOf(d94Var.b);
                    mVar.c = d94Var.c;
                    mVar.d = d94Var.d;
                    mVar.e = Integer.valueOf(d94Var.e);
                    mVar.f = d94Var.f;
                    mVar.g = Integer.valueOf(d94Var.g);
                    mVar.h = Integer.valueOf(d94Var.h);
                    mVar.i = Integer.valueOf(d94Var.i);
                    mVar.j = Integer.valueOf(d94Var.j);
                    mVar.f = e94Var;
                    d94Var = mVar.a();
                }
            }
            d94 d94Var2 = d94Var;
            oii0Var.g.f0 = d94Var2;
            if (kVar2.i.ordinal() != 0) {
                g = new hiv(1, new IllegalStateException("configure() shouldn't be called in " + kVar2.i));
            } else {
                kVar2.i = VideoEncoderSession$VideoEncoderState.INITIALIZING;
                kVar2.f = znw0Var;
                kVar2.toString();
                sgb1.g(3, "VideoEncoderSession");
                androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
                bVar.c = new hsj0();
                gl7 gl7Var = new gl7(bVar);
                bVar.b = gl7Var;
                bVar.a = x4e.class;
                try {
                    kVar2.k = bVar;
                    bVar.a = "ReleasedFuture " + kVar2;
                } catch (Exception e) {
                    gl7Var.a(e);
                }
                kVar2.j = gl7Var;
                androidx.concurrent.futures.b bVar2 = new androidx.concurrent.futures.b();
                bVar2.c = new hsj0();
                gl7 gl7Var2 = new gl7(bVar2);
                bVar2.b = gl7Var2;
                bVar2.a = x4e.class;
                try {
                    kVar2.m = bVar2;
                    bVar2.a = "ReadyToReleaseFuture " + kVar2;
                } catch (Exception e2) {
                    gl7Var2.a(e2);
                }
                kVar2.l = gl7Var2;
                gl7 r = jx81.r(new t26(24, kVar2, znw0Var, d94Var2));
                ni91.a(r, new aj31(1, kVar2), kVar2.b);
                g = ni91.g(r);
            }
            g gVar2 = oii0Var.g;
            gVar2.e0 = kVar2;
            ni91.a(g, new f(oii0Var, kVar2), gVar2.d);
            return;
        }
        znw0Var.a();
        Objects.toString(oii0Var.g.e0);
        sgb1.g(5, "Recorder");
    }
}
