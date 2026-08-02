package defpackage;

import androidx.camera.video.g;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.encoder.j;

/* loaded from: classes10.dex */
public final /* synthetic */ class bzn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ bzn(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                jVar.E = true;
                if (jVar.D) {
                    if (!jVar.t) {
                        sgb1.g(3, jVar.a);
                        jVar.f.stop();
                    }
                    jVar.i();
                    break;
                }
                break;
            case 1:
                jVar.i.execute(new bzn(jVar, 2));
                break;
            case 2:
                if (jVar.z) {
                    sgb1.g(5, jVar.a);
                    jVar.A = null;
                    jVar.k();
                    jVar.z = false;
                    break;
                }
                break;
            case 3:
                sgb1.g(3, jVar.a);
                ni91.a(jVar.a(), new jln(5, jVar), jVar.i);
                break;
            case 4:
                int ordinal = jVar.w.ordinal();
                if (ordinal == 1) {
                    jVar.h();
                    break;
                } else if (ordinal == 6 || ordinal == 8) {
                    ny61.r("Encoder is released");
                    break;
                }
                break;
            default:
                sgb1.g(3, "Recorder");
                if (vbj.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    g.r(jVar);
                    break;
                }
                break;
        }
    }
}
