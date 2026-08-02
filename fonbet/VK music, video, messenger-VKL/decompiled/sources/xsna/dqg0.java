package xsna;

import java.nio.ByteBuffer;

/* compiled from: RtmpClient.java */
/* loaded from: classes8.dex */
public final class dqg0 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ aqg0 c;

    public dqg0(aqg0 aqg0Var, long j) {
        this.c = aqg0Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.put((byte) 0);
        allocate.put((byte) 3);
        allocate.putInt((int) this.b);
        allocate.position(0);
        this.c.u(2, (byte) 4, allocate, true);
    }
}
