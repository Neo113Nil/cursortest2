package xsna;

import android.util.Size;
import java.io.File;
import xsna.qpa0;

/* compiled from: ClipEncodingTask.kt */
/* loaded from: classes16.dex */
public final class u8d extends ivc {
    public final gpa0 g;
    public final ykm0 h;
    public final Size i;
    public final Size j;
    public final bpn0 k;

    public u8d(File file, File file2, gpa0 gpa0Var, ykm0 ykm0Var, Size size, Size size2) {
        super(file2, file);
        this.g = gpa0Var;
        this.h = ykm0Var;
        this.i = size;
        this.j = size2;
        this.k = new bpn0(new defpackage.j(this, 16));
    }

    @Override // xsna.ivc
    public final void a() {
        this.g.cancel();
        super.a();
    }

    @Override // xsna.ivc
    public final long b() {
        return ((Number) this.k.getValue()).longValue();
    }

    @Override // xsna.ivc
    public final void c() {
        qpa0 c = this.g.c(this.h);
        this.d = epx.f(c, qpa0.a.a) ? kip.c : c instanceof qpa0.b ? nip.c : c instanceof qpa0.c ? new lip(((qpa0.c) c).a) : null;
    }
}
