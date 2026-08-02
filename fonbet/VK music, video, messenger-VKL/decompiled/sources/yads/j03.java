package yads;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public abstract class j03 extends e03 implements w53 {
    public j03() {
        super(new a63[2], new b63[2]);
        g();
    }

    public abstract v53 a(byte[] bArr, int i, boolean z);

    @Override // yads.w53
    public final void a(long j) {
    }

    @Override // yads.e03
    public final a63 c() {
        return new a63();
    }

    @Override // yads.e03
    public final i03 d() {
        return new i03(this);
    }

    @Override // yads.e03
    public final x53 a(sa0 sa0Var, ua0 ua0Var, boolean z) {
        a63 a63Var = (a63) sa0Var;
        b63 b63Var = (b63) ua0Var;
        try {
            ByteBuffer byteBuffer = a63Var.d;
            byteBuffer.getClass();
            v53 a = a(byteBuffer.array(), byteBuffer.limit(), z);
            long j = a63Var.f;
            long j2 = a63Var.j;
            b63Var.c = j;
            b63Var.d = a;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            b63Var.e = j;
            b63Var.b &= Integer.MAX_VALUE;
            return null;
        } catch (x53 e) {
            return e;
        }
    }
}
