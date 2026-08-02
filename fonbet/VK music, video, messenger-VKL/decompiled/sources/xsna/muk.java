package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import one.video.streaming.oktp.TransportWriter;
import one.video.streaming.tools.TimeMachine;
import one.video.streaming.tools.exceptions.ProtocolException;

/* compiled from: DataPacketizer.java */
/* loaded from: classes8.dex */
public final class muk {
    public final TransportWriter a;
    public final boolean b;
    public final ywk c;
    public final boolean d;
    public boolean e;
    public ByteBuffer f;
    public int g;
    public g890 h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final TimeMachine p;

    public muk(TimeMachine timeMachine, TransportWriter transportWriter, ywk ywkVar, boolean z, boolean z2) {
        this.p = timeMachine;
        this.a = transportWriter;
        int guaranteedMTU = transportWriter.getGuaranteedMTU();
        this.g = guaranteedMTU;
        this.o = guaranteedMTU + 19;
        this.b = z;
        this.c = ywkVar;
        this.d = z2;
    }

    public final void a(boolean z) throws IOException {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null || this.k) {
            return;
        }
        byteBuffer.flip();
        if (this.n != this.f.limit()) {
            throw new IllegalStateException("Packet end mismatch " + this.n + "!=" + this.f.limit());
        }
        this.f.remaining();
        try {
            this.c.h(this.a, this.f, this.m, this.b, z, this.d);
            this.l++;
        } finally {
            c();
        }
    }

    public final void b() {
        ByteBuffer byteBuffer;
        if (this.h == null || (byteBuffer = this.f) == null) {
            return;
        }
        int position = byteBuffer.position();
        this.h.b(this.f.position() - this.j);
        this.f.position(this.i);
        this.f.position();
        this.h.c(this.f);
        this.f.position();
        int i = this.h.a;
        this.c.getClass();
        this.f.position(position);
        this.k = false;
        this.h = null;
        this.n = position;
    }

    public final void c() {
        int capacity = this.f.capacity();
        int i = this.o;
        if (capacity != i) {
            this.f = ByteBuffer.allocateDirect(i);
        }
        this.f.limit(this.g - 17);
        ywk ywkVar = this.c;
        ywkVar.getClass();
        this.m = 10;
        this.f.put(new byte[10]);
        this.j = 0;
        this.n = 0;
        if (this.e && ywkVar.b != 0) {
            zki0 zki0Var = new zki0(this.l);
            zki0Var.b(0);
            zki0Var.c(this.f);
        }
        this.k = true;
    }

    public final ByteBuffer d(g890 g890Var, int i) throws IOException, ProtocolException {
        b();
        if (this.f == null) {
            this.f = ByteBuffer.allocateDirect(this.o);
            c();
        }
        this.h = g890Var;
        int a = g890Var.a();
        if (i == -1 || a + i > this.f.remaining()) {
            a(false);
            if (this.f == null) {
                this.f = ByteBuffer.allocateDirect(this.o);
                c();
            }
            if (i + a > this.f.remaining()) {
                throw new ProtocolException("Requested min payload size doesn't fit in MTU");
            }
        }
        int position = this.f.position();
        this.i = position;
        int i2 = position + a;
        this.j = i2;
        this.f.position(i2);
        return this.f;
    }
}
