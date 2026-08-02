package defpackage;

import android.util.Size;
import androidx.camera.core.g;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class pxe0 implements wi21, hcv {
    public final yy40 a;

    public pxe0(yy40 yy40Var) {
        this.a = yy40Var;
        x34 x34Var = max0.f4;
        Class cls = (Class) yy40Var.g(x34Var, null);
        if (cls != null && !cls.equals(g.class)) {
            w511.l("Invalid target class configuration for ", this, Extension.COLON_SPACE, cls);
            throw null;
        }
        yy40Var.w(xi21.t4, UseCaseConfigFactory$CaptureType.PREVIEW);
        yy40Var.w(x34Var, g.class);
        x34 x34Var2 = max0.e4;
        if (yy40Var.g(x34Var2, null) == null) {
            yy40Var.w(x34Var2, g.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
        x34 x34Var3 = icv.q2;
        if (((Integer) yy40Var.g(x34Var3, -1)).intValue() == -1) {
            yy40Var.w(x34Var3, 2);
        }
    }

    @Override // defpackage.hcv
    public final /* bridge */ /* synthetic */ Object a(int i) {
        h(i);
        return this;
    }

    @Override // defpackage.hcv
    public final Object b(bsj0 bsj0Var) {
        this.a.w(icv.w2, bsj0Var);
        return this;
    }

    @Override // defpackage.hcv
    public final Object c(Size size) {
        this.a.w(icv.r2, size);
        return this;
    }

    @Override // defpackage.owo
    public final yy40 d() {
        return this.a;
    }

    public final g f() {
        txe0 e = e();
        icv.v(e);
        g gVar = new g(e);
        gVar.r = g.y;
        return gVar;
    }

    @Override // defpackage.wi21
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final txe0 e() {
        return new txe0(ug70.a(this.a));
    }

    public final void h(int i) {
        x34 x34Var = icv.n2;
        Integer valueOf = Integer.valueOf(i);
        yy40 yy40Var = this.a;
        yy40Var.w(x34Var, valueOf);
        yy40Var.w(icv.o2, Integer.valueOf(i));
    }

    public pxe0() {
        this(yy40.b());
    }
}
