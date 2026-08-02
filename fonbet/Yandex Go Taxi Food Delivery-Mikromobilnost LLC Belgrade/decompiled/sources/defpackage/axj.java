package defpackage;

import android.os.StatFs;
import java.io.File;

/* loaded from: classes.dex */
public final class axj {
    public oq90 a;
    public final hfx b = r1r.a;
    public double c = 0.02d;
    public final long d = 10485760;
    public final long e = 262144000;
    public final mdh f;

    public axj() {
        sjh sjhVar = uyj.a;
        this.f = mdh.b;
    }

    public final tci0 a() {
        long j;
        oq90 oq90Var = this.a;
        if (oq90Var == null) {
            ny61.r("directory == null");
            return null;
        }
        if (this.c > 0.0d) {
            try {
                File file = oq90Var.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                j = y6i0.f((long) (this.c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.d, this.e);
            } catch (Exception unused) {
                j = this.d;
            }
        } else {
            j = 0;
        }
        return new tci0(j, this.f, this.b, oq90Var);
    }
}
