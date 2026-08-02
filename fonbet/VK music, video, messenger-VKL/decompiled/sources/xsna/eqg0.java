package xsna;

import java.nio.ByteBuffer;

/* compiled from: RtmpClient.java */
/* loaded from: classes8.dex */
public final class eqg0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ aqg0 c;

    public eqg0(aqg0 aqg0Var, int i) {
        this.c = aqg0Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.put((byte) 0);
        allocate.put((byte) 7);
        allocate.putInt(this.b);
        allocate.position(0);
        this.c.u(2, (byte) 4, allocate, true);
    }
}
