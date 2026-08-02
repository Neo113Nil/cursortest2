package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes10.dex */
public final class aqn {
    public static final FloatBuffer f;
    public final float[] a;
    public final FloatBuffer b;
    public final int c;
    public final int d;
    public ruy0 e;

    static {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        f = asFloatBuffer;
    }

    public aqn(ruy0 ruy0Var, int i, int i2) {
        float[] fArr = new float[8];
        this.a = fArr;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        this.b = asFloatBuffer;
        this.e = ruy0Var;
        this.c = i;
        this.d = i2;
    }
}
