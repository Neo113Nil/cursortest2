package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class bt extends ro {
    public final sa0 n;
    public final kc2 o;
    public long p;
    public at q;
    public long r;

    public bt() {
        super(6);
        this.n = new sa0(1);
        this.o = new kc2();
    }

    @Override // yads.ro
    public final void a(long j, boolean z) {
        this.r = Long.MIN_VALUE;
        at atVar = this.q;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }

    @Override // yads.ro
    public final String d() {
        return "CameraMotionRenderer";
    }

    @Override // yads.ro
    public final boolean f() {
        return e();
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        at atVar = this.q;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }

    @Override // yads.ro, yads.bg2
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.q = (at) obj;
        }
    }

    @Override // yads.ro
    public final void a(nx0[] nx0VarArr, long j, long j2) {
        this.p = j2;
    }

    @Override // yads.ro
    public final void a(long j, long j2) {
        while (!e() && this.r < 100000 + j) {
            this.n.b();
            ox0 ox0Var = this.c;
            float[] fArr = null;
            ox0Var.a = null;
            ox0Var.b = null;
            if (a(ox0Var, this.n, 0) != -4 || this.n.b(4)) {
                return;
            }
            sa0 sa0Var = this.n;
            this.r = sa0Var.f;
            if (this.q != null && !sa0Var.b(Integer.MIN_VALUE)) {
                this.n.c();
                ByteBuffer byteBuffer = this.n.d;
                int i = mc3.a;
                if (byteBuffer.remaining() == 16) {
                    kc2 kc2Var = this.o;
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    kc2Var.a = array;
                    kc2Var.c = limit;
                    kc2Var.b = 0;
                    this.o.e(byteBuffer.arrayOffset() + 4);
                    fArr = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr[i2] = Float.intBitsToFloat(this.o.d());
                    }
                }
                if (fArr != null) {
                    this.q.onCameraMotion(this.r - this.p, fArr);
                }
            }
        }
    }

    @Override // yads.ro
    public final int a(nx0 nx0Var) {
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(nx0Var.m)) {
            return ro.a(4, 0, 0);
        }
        return ro.a(0, 0, 0);
    }
}
