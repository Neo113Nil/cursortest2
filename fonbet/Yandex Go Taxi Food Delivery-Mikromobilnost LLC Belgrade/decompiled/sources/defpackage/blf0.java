package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes10.dex */
public final class blf0 {
    public final int a;
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final int d;

    public blf0(ykf0 ykf0Var, boolean z) {
        float[] fArr = ykf0Var.c;
        this.a = fArr.length / 3;
        this.b = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        float[] fArr2 = ykf0Var.d;
        this.c = (FloatBuffer) ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2).flip();
        int i = ykf0Var.b;
        if (i == 1) {
            this.d = 5;
        } else if (i != 2) {
            this.d = 4;
        } else {
            this.d = 6;
        }
    }

    public blf0(ykf0 ykf0Var) {
        float[] fArr = ykf0Var.c;
        this.a = fArr.length / 3;
        this.b = lxa1.f(fArr);
        this.c = lxa1.f(ykf0Var.d);
        int i = ykf0Var.b;
        if (i == 1) {
            this.d = 5;
        } else if (i != 2) {
            this.d = 4;
        } else {
            this.d = 6;
        }
    }
}
