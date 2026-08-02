package androidx.camera.video;

import android.media.MediaFormat;
import android.view.Surface;
import defpackage.b84;
import defpackage.d6z;
import defpackage.fn31;
import defpackage.geb1;
import defpackage.gii0;
import defpackage.iqs;
import defpackage.ni91;
import defpackage.oii0;
import defpackage.oxe0;
import defpackage.rl31;
import defpackage.sgb1;
import defpackage.xmf0;
import defpackage.yxf0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class f implements iqs {
    public final /* synthetic */ k a;
    public final /* synthetic */ oii0 b;

    public f(oii0 oii0Var, k kVar) {
        this.b = oii0Var;
        this.a = kVar;
    }

    @Override // defpackage.iqs
    public final void onFailure(Throwable th) {
        b84 b84Var;
        sgb1.g(5, "Recorder");
        oii0 oii0Var = this.b;
        int i = oii0Var.e;
        if (i < oii0Var.c) {
            oii0Var.e = i + 1;
            oxe0 oxe0Var = new oxe0(21, this);
            oii0Var.f = geb1.f().schedule(new xmf0(12, oii0Var.g.d, oxe0Var), g.x0, TimeUnit.MILLISECONDS);
            return;
        }
        g gVar = oii0Var.g;
        synchronized (gVar.h) {
            try {
                b84Var = null;
                switch (gVar.l.ordinal()) {
                    case 1:
                    case 2:
                        b84 b84Var2 = gVar.p;
                        gVar.p = null;
                        b84Var = b84Var2;
                    case 0:
                        gVar.D(-1);
                        gVar.C(Recorder$State.ERROR);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + gVar.l + Extension.COLON_SPACE + th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b84Var != null) {
            gVar.j(b84Var, 7, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:18:0x008a, B:19:0x0090, B:23:0x0108, B:40:0x0095, B:41:0x00a1, B:44:0x00a7, B:45:0x00ae, B:47:0x00b2, B:49:0x00c0, B:50:0x00d3, B:52:0x00d7, B:55:0x00e0, B:57:0x00e6, B:58:0x00f2, B:60:0x00fe), top: B:17:0x008a }] */
    @Override // defpackage.iqs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSuccess(Object obj) {
        boolean z;
        RuntimeException runtimeException;
        int i;
        int i2;
        b84 b84Var;
        androidx.camera.video.internal.encoder.j jVar = (androidx.camera.video.internal.encoder.j) obj;
        Objects.toString(jVar);
        sgb1.g(3, "Recorder");
        if (jVar == null) {
            return;
        }
        b84 b84Var2 = null;
        d6z.y(null, this.b.g.e0 == this.a);
        d6z.y(null, this.b.g.G == null);
        g gVar = this.b.g;
        k kVar = this.a;
        androidx.camera.core.impl.utils.executor.b bVar = gVar.d;
        androidx.camera.video.internal.encoder.j jVar2 = kVar.d;
        jVar2.getClass();
        gVar.G = jVar2;
        gVar.k.t(((rl31) jVar2.h).Q2());
        MediaFormat mediaFormat = gVar.G.e;
        if (mediaFormat.containsKey("bitrate")) {
            mediaFormat.getInteger("bitrate");
        }
        Surface surface = kVar.i != VideoEncoderSession$VideoEncoderState.READY ? null : kVar.e;
        gVar.C = surface;
        gVar.B(surface);
        gii0 gii0Var = new gii0(gVar);
        kVar.g = bVar;
        kVar.h = gii0Var;
        ni91.a(ni91.g(kVar.l), new yxf0(gVar, kVar, false), bVar);
        g gVar2 = this.b.g;
        synchronized (gVar2.h) {
            try {
                switch (gVar2.l.ordinal()) {
                    case 0:
                        gVar2.C(Recorder$State.IDLING);
                        b84Var = null;
                        runtimeException = null;
                        z = false;
                        i = 0;
                        i2 = i;
                        break;
                    case 1:
                        z = false;
                        if (gVar2.o == null) {
                            b84Var = null;
                            runtimeException = null;
                            i = 0;
                            i2 = i;
                            break;
                        } else if (gVar2.b0 == VideoOutput$SourceState.INACTIVE) {
                            b84Var = gVar2.p;
                            gVar2.p = null;
                            gVar2.y();
                            runtimeException = g.s0;
                            i = 4;
                            i2 = 0;
                        } else {
                            runtimeException = null;
                            i = 0;
                            i2 = 0;
                            b84Var2 = gVar2.q(gVar2.l);
                            b84Var = null;
                        }
                    case 2:
                        z = true;
                        if (gVar2.o == null) {
                        }
                        break;
                    case 3:
                    case 7:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + gVar2.l);
                    case 4:
                        z = false;
                        d6z.y("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", gVar2.o());
                        b84Var = null;
                        runtimeException = null;
                        i = 0;
                        i2 = 1;
                        break;
                    case 5:
                        z = true;
                        d6z.y("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", gVar2.o());
                        b84Var = null;
                        runtimeException = null;
                        i = 0;
                        i2 = 1;
                        break;
                    case 6:
                        if (!gVar2.i) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        b84Var = null;
                        runtimeException = null;
                        z = false;
                        i = 0;
                        i2 = i;
                        break;
                    case 8:
                        sgb1.d("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                        b84Var = null;
                        runtimeException = null;
                        z = false;
                        i = 0;
                        i2 = i;
                        break;
                    default:
                        b84Var = null;
                        runtimeException = null;
                        z = false;
                        i = 0;
                        i2 = i;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == 0) {
            if (b84Var2 != null) {
                gVar2.G(b84Var2, z);
                return;
            } else {
                if (b84Var != null) {
                    gVar2.j(b84Var, i, runtimeException);
                    return;
                }
                return;
            }
        }
        gVar2.I(gVar2.r, true);
        gVar2.G.l();
        if (gVar2.i0) {
            b84 b84Var3 = gVar2.r;
            b84Var3.k(new fn31(b84Var3.A, gVar2.k()), true);
            gVar2.i0 = false;
        }
        if (z) {
            gVar2.G.f();
        }
    }
}
