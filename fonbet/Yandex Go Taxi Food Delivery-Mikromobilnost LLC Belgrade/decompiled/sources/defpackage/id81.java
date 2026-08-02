package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class id81 extends gy61 {
    public final dl81 C;
    public long D;
    public w981 E;
    public long F;
    public final yh81 a;

    public id81() {
        super(6);
        this.a = new yh81(1);
        this.C = new dl81();
    }

    @Override // defpackage.gy61
    public final void a(long j, long j2) {
        while (!d() && this.F < 100000 + j) {
            yh81 yh81Var = this.a;
            yh81Var.e();
            og81 og81Var = this.c;
            float[] fArr = null;
            og81Var.a = null;
            og81Var.b = null;
            if (a(og81Var, yh81Var, 0) != -4 || yh81Var.c(4)) {
                return;
            }
            this.F = yh81Var.x;
            if (this.E != null && !yh81Var.c(Integer.MIN_VALUE)) {
                yh81Var.f();
                ByteBuffer byteBuffer = yh81Var.c;
                int i = rf71.a;
                if (byteBuffer.remaining() == 16) {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    dl81 dl81Var = this.C;
                    dl81Var.a = array;
                    dl81Var.c = limit;
                    dl81Var.b = 0;
                    dl81Var.m(byteBuffer.arrayOffset() + 4);
                    fArr = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr[i2] = Float.intBitsToFloat(dl81Var.h());
                    }
                }
                if (fArr != null) {
                    this.E.b(this.F - this.D, fArr);
                }
            }
        }
    }

    @Override // defpackage.gy61
    public final String c() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.gy61
    public final boolean e() {
        return d();
    }

    @Override // defpackage.gy61
    public final boolean f() {
        return true;
    }

    @Override // defpackage.gy61
    public final void g() {
        w981 w981Var = this.E;
        if (w981Var != null) {
            w981Var.c();
        }
    }

    @Override // defpackage.gy61, defpackage.i071
    public final void a(int i, Object obj) {
        if (i == 8) {
            this.E = (w981) obj;
        }
    }

    @Override // defpackage.gy61
    public final void a(qd81[] qd81VarArr, long j, long j2) {
        this.D = j2;
    }

    @Override // defpackage.gy61
    public final void a(long j, boolean z) {
        this.F = Long.MIN_VALUE;
        w981 w981Var = this.E;
        if (w981Var != null) {
            w981Var.c();
        }
    }

    @Override // defpackage.gy61
    public final int a(qd81 qd81Var) {
        if ("application/x-camera-motion".equals(qd81Var.E)) {
            return gy61.a(4, 0, 0);
        }
        return gy61.a(0, 0, 0);
    }
}
