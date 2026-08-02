package defpackage;

import android.content.Context;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.internal.n;
import androidx.camera.camera2.internal.p;
import androidx.camera.camera2.internal.v;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;

/* loaded from: classes10.dex */
public final class bo7 implements zi21 {
    public final gzj b;

    public bo7(Context context) {
        this.b = gzj.b(context);
    }

    @Override // defpackage.zi21
    public final szd a(UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType, int i) {
        yy40 b = yy40.b();
        dyq0 dyq0Var = new dyq0();
        dyq0Var.b.c = glb1.c(useCaseConfigFactory$CaptureType, i);
        b.w(xi21.j4, dyq0Var.d());
        b.w(xi21.l4, p.a);
        r38 r38Var = new r38();
        int i2 = wfy0.a[useCaseConfigFactory$CaptureType.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            i3 = (i2 == 2 && xbj.a.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        } else if (i == 2) {
            i3 = 5;
        }
        r38Var.c = i3;
        b.w(xi21.k4, r38Var.e());
        b.w(xi21.m4, useCaseConfigFactory$CaptureType == UseCaseConfigFactory$CaptureType.IMAGE_CAPTURE ? v.b : n.a);
        if (useCaseConfigFactory$CaptureType == UseCaseConfigFactory$CaptureType.PREVIEW) {
            b.w(icv.t2, this.b.e());
        }
        b.w(icv.n2, Integer.valueOf(this.b.c(true).getRotation()));
        if (useCaseConfigFactory$CaptureType == UseCaseConfigFactory$CaptureType.VIDEO_CAPTURE || useCaseConfigFactory$CaptureType == UseCaseConfigFactory$CaptureType.STREAM_SHARING) {
            b.w(xi21.r4, Boolean.TRUE);
        }
        return ug70.a(b);
    }
}
