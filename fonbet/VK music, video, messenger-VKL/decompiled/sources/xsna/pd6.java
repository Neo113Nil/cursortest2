package xsna;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import xsna.lwx;
import xsna.o0u;

/* compiled from: BaseGlShaderProgram.java */
/* loaded from: classes12.dex */
public abstract class pd6 implements o0u {
    public final ioo0 a;
    public o0u.b b = new a();
    public o0u.c c = new b();
    public o0u.a d = new mr(7);
    public Executor e = kzm.INSTANCE;
    public int f = -1;
    public int g = -1;

    /* compiled from: BaseGlShaderProgram.java */
    public class a implements o0u.b {
    }

    /* compiled from: BaseGlShaderProgram.java */
    public class b implements o0u.c {
    }

    public pd6(boolean z, int i) {
        this.a = new ioo0(z, i);
    }

    @Override // xsna.o0u
    public final void a(Executor executor, tp1 tp1Var) {
        this.e = executor;
        this.d = tp1Var;
    }

    @Override // xsna.o0u
    public final void b(o0u.b bVar) {
        this.b = bVar;
        for (int i = 0; i < this.a.d(); i++) {
            bVar.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: GlException -> 0x001b, VideoFrameProcessingException -> 0x001d, TryCatch #2 {VideoFrameProcessingException -> 0x001d, GlException -> 0x001b, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:10:0x0030, B:12:0x0043, B:13:0x0046, B:17:0x001f), top: B:1:0x0000 }] */
    @Override // xsna.o0u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(k0u k0uVar, r0u r0uVar, long j) {
        try {
            int i = this.f;
            int i2 = r0uVar.c;
            int i3 = r0uVar.d;
            ioo0 ioo0Var = this.a;
            if (i == i2) {
                if (this.g == i3) {
                    if (!((lwx.b) ioo0Var.e()).hasNext()) {
                    }
                    r0u f = ioo0Var.f();
                    GlUtil.o(f.b, f.c, f.d);
                    if (i()) {
                        GlUtil.f();
                    }
                    h(r0uVar.a, j);
                    this.b.b(r0uVar);
                    this.c.d(f, j);
                }
            }
            int i4 = r0uVar.c;
            this.f = i4;
            this.g = i3;
            jxj0 g = g(i4, i3);
            ioo0Var.c(k0uVar, g.a, g.b);
            r0u f2 = ioo0Var.f();
            GlUtil.o(f2.b, f2.c, f2.d);
            if (i()) {
            }
            h(r0uVar.a, j);
            this.b.b(r0uVar);
            this.c.d(f2, j);
        } catch (VideoFrameProcessingException e) {
            e = e;
            this.e.execute(new od6(0, this, e));
        } catch (GlUtil.GlException e2) {
            e = e2;
            this.e.execute(new od6(0, this, e));
        }
    }

    @Override // xsna.o0u
    public final void d(o0u.c cVar) {
        this.c = cVar;
    }

    @Override // xsna.o0u
    public void e(r0u r0uVar) {
        ioo0 ioo0Var = this.a;
        if (ioo0Var.b.contains(r0uVar)) {
            ArrayDeque arrayDeque = ioo0Var.b;
            fxc0.z(arrayDeque.contains(r0uVar));
            arrayDeque.remove(r0uVar);
            ioo0Var.a.add(r0uVar);
            this.b.e();
        }
    }

    @Override // xsna.o0u
    public final void f() {
        this.c.c();
    }

    @Override // xsna.o0u
    public void flush() {
        ioo0 ioo0Var = this.a;
        ArrayDeque arrayDeque = ioo0Var.a;
        ArrayDeque arrayDeque2 = ioo0Var.b;
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        this.b.a();
        for (int i = 0; i < ioo0Var.c; i++) {
            this.b.e();
        }
    }

    public abstract jxj0 g(int i, int i2) throws VideoFrameProcessingException;

    public abstract void h(int i, long j) throws VideoFrameProcessingException;

    public abstract boolean i();
}
