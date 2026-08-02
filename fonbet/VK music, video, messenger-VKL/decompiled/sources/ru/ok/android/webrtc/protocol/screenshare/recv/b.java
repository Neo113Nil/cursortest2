package ru.ok.android.webrtc.protocol.screenshare.recv;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import ru.ok.android.webrtc.protocol.screenshare.Codec;
import xsna.z3z0;

/* loaded from: classes9.dex */
public final class b {
    public final Codec a;
    public final ByteArrayOutputStream b;
    public boolean c;
    public int d;
    public final /* synthetic */ c e;

    public b(c cVar, z3z0 z3z0Var) {
        this.e = cVar;
        Codec codec = z3z0Var.i;
        ByteBuffer byteBuffer = z3z0Var.k;
        this.a = codec;
        z3z0Var.isStart();
        z3z0Var.isEnd();
        z3z0Var.isEos();
        this.c |= z3z0Var.isKeyFrame();
        if (z3z0Var.isKeyFrame()) {
            this.b = new ByteArrayOutputStream(600000);
        } else {
            this.b = new ByteArrayOutputStream(34000);
        }
        while (true) {
            int min = Math.min(byteBuffer.remaining(), this.e.c.length);
            if (min == 0) {
                this.d = 1;
                return;
            } else {
                byteBuffer.get(this.e.c, 0, min);
                this.b.write(this.e.c, 0, min);
            }
        }
    }
}
