package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import java.io.File;
import xsna.gx8;

/* compiled from: StoryStatisticsCache.kt */
/* loaded from: classes6.dex */
public final class kem0 implements gx8.a {
    public final File b;
    public final fch c;
    public final ohm0 d;
    public final bqz0 e;
    public final jxb0 f = new jxb0(5);
    public final h0b g;

    public kem0(cfm0 cfm0Var, phm0 phm0Var, zhm0 zhm0Var, rem0 rem0Var, yfm0 yfm0Var, egm0 egm0Var, File file) {
        this.b = file;
        this.c = new fch(cfm0Var);
        this.d = new ohm0(phm0Var, zhm0Var);
        this.e = new bqz0(rem0Var);
        this.g = new h0b(yfm0Var, egm0Var);
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.OTHER;
    }

    public final void b(int i) {
        pgm0 pgm0Var = (pgm0) this.f.b;
        pgm0Var.d = i;
        asu0.a.getClass();
        asu0.n().execute(new mtk(pgm0Var, i, 1));
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        fch fchVar = this.c;
        fchVar.getClass();
        bpn0 bpn0Var = i0q0.a;
        ((cfm0) fchVar.b).b();
        ohm0 ohm0Var = this.d;
        ohm0Var.getClass();
        ohm0Var.a.b();
        ohm0Var.b.b();
        bqz0 bqz0Var = this.e;
        bqz0Var.getClass();
        ((rem0) bqz0Var.b).b();
        jxb0 jxb0Var = this.f;
        jxb0Var.getClass();
        ((pgm0) jxb0Var.b).a();
        h0b h0bVar = this.g;
        h0bVar.getClass();
        ((yfm0) h0bVar.b).b();
        ((egm0) h0bVar.c).b();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return kem0.class.getSimpleName();
    }

    @Override // xsna.gx8.a
    public final long u() {
        long j = 0;
        try {
            File file = this.b;
            if (file != null) {
                j = z4g.f(new File(file.getPath() + "-journal")) + z4g.f(file) + z4g.f(new File(file.getPath() + "-shm")) + z4g.f(new File(file.getPath() + "-wal"));
            }
        } catch (Throwable unused) {
        }
        return com.vk.core.files.a.I(((pgm0) this.f.b).b) + j;
    }
}
