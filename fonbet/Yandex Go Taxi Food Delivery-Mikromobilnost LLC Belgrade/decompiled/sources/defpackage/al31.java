package defpackage;

import android.util.Size;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import androidx.camera.video.i;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class al31 implements wi21, hcv {
    public final yy40 a;

    public al31(yy40 yy40Var) {
        this.a = yy40Var;
        if (!yy40Var.a.containsKey(el31.b)) {
            ny61.g("VideoOutput is required");
            throw null;
        }
        x34 x34Var = max0.f4;
        Class cls = (Class) yy40Var.g(x34Var, null);
        if (cls != null && !cls.equals(i.class)) {
            w511.l("Invalid target class configuration for ", this, Extension.COLON_SPACE, cls);
            throw null;
        }
        yy40Var.w(xi21.t4, UseCaseConfigFactory$CaptureType.VIDEO_CAPTURE);
        yy40Var.w(x34Var, i.class);
        x34 x34Var2 = max0.e4;
        if (yy40Var.g(x34Var2, null) == null) {
            yy40Var.w(x34Var2, i.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // defpackage.hcv
    public final Object a(int i) {
        this.a.w(icv.n2, Integer.valueOf(i));
        return this;
    }

    @Override // defpackage.hcv
    public final Object b(bsj0 bsj0Var) {
        this.a.w(icv.w2, bsj0Var);
        return this;
    }

    @Override // defpackage.hcv
    public final Object c(Size size) {
        throw new UnsupportedOperationException("setTargetResolution is not supported.");
    }

    @Override // defpackage.owo
    public final yy40 d() {
        return this.a;
    }

    @Override // defpackage.wi21
    public final xi21 e() {
        return new el31(ug70.a(this.a));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public al31(lm31 lm31Var) {
        this(r0);
        yy40 b = yy40.b();
        b.w(el31.b, lm31Var);
    }
}
