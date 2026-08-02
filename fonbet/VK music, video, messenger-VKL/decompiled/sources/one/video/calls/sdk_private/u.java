package one.video.calls.sdk_private;

import java.net.InetAddress;
import java.util.List;
import xsna.cgn;
import xsna.kgy0;
import xsna.kq01;
import xsna.n6j;
import xsna.rqi;
import xsna.tj0;

/* compiled from: TransportParameters.java */
/* loaded from: classes8.dex */
public final class u {
    public byte[] a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean j;
    public a k;
    public byte[] n;
    public byte[] o;
    public byte[] q;
    public b r;
    public int i = 3;
    public int l = 25;
    public int m = 2;
    public long s = 0;
    public int p = 1500;

    /* compiled from: TransportParameters.java */
    public static class a {
        public InetAddress a;
        public InetAddress b;
        public byte[] c;
    }

    /* compiled from: TransportParameters.java */
    public static class b {
        public final kgy0 a;
        public final List<kgy0> b;

        public b(kgy0 kgy0Var, List<kgy0> list) {
            this.a = kgy0Var;
            this.b = list;
        }

        public final String toString() {
            return String.format("%s|%s", this.a, this.b);
        }
    }

    public final String toString() {
        byte[] bArr = this.a;
        String b2 = bArr != null ? kq01.b(bArr) : "null";
        long j = this.b / 1000;
        int i = this.p;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        long j5 = this.f;
        long j6 = this.g;
        long j7 = this.h;
        int i2 = this.i;
        int i3 = this.l;
        boolean z = this.j;
        int i4 = this.m;
        byte[] bArr2 = this.n;
        String b3 = bArr2 != null ? kq01.b(bArr2) : "null";
        byte[] bArr3 = this.o;
        String b4 = bArr3 != null ? kq01.b(bArr3) : "null";
        long j8 = this.s;
        StringBuilder d = rqi.d(j, "\n- original destination connection id\t", b2, "\n- max idle timeout\t");
        d.append("\n- max udp payload size\t");
        d.append(i);
        d.append("\n- initial max data\t\t\t");
        d.append(j2);
        tj0.d(d, "\n- initial max stream data bidi local\t", j3, "\n- initial max stream data bidi remote\t");
        d.append(j4);
        tj0.d(d, "\n- initial max stream data uni\t\t", j5, "\n- initial max streams bidi\t\t");
        d.append(j6);
        tj0.d(d, "\n- initial max streams uni\t\t", j7, "\n- ack delay exponent\t\t\t");
        cgn.a(i2, i3, "\n- max ack delay\t\t\t\t", "\n- disable migration\t\t\t", d);
        d.append(z);
        d.append("\n- active connection id limit\t\t");
        d.append(i4);
        d.append("\n- initial source connection id\t\t");
        n6j.b(d, b3, "\n- retry source connection id\t\t", b4, "\n- max datagram frame size\t\t");
        d.append(j8);
        return d.toString();
    }
}
