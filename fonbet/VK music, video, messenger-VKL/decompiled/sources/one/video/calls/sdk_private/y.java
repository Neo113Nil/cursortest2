package one.video.calls.sdk_private;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.Consumer;
import one.video.calls.sdk_private.u;
import xsna.alk;
import xsna.kgy0;
import xsna.pt50;

/* compiled from: QuicTransportParametersExtension.java */
/* loaded from: classes8.dex */
public final class y extends pt50 {
    public final kgy0 a;
    public final bI b;
    public byte[] c;
    public final u d;

    public y() {
        this(kgy0.b);
    }

    public static void d(ByteBuffer byteBuffer, ap$b ap_b, long j) {
        alk.d(ap_b.s, byteBuffer);
        int g = alk.g(j, byteBuffer);
        alk.d(g, byteBuffer);
        alk.g(j, byteBuffer);
    }

    @Override // xsna.pt50
    public final byte[] b() {
        byte[] bArr;
        byte[] bArr2;
        if (this.c == null) {
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            kgy0 kgy0Var = kgy0.b;
            kgy0 kgy0Var2 = this.a;
            allocate.putShort((short) ((kgy0Var2.equals(kgy0Var) || kgy0Var2.b()) ? 57 : 65445));
            allocate.putShort((short) 0);
            bI bIVar = bI.b;
            bI bIVar2 = this.b;
            u uVar = this.d;
            if (bIVar2 == bIVar) {
                ap$b ap_b = ap$b.original_destination_connection_id;
                byte[] bArr3 = uVar.a;
                alk.d(ap_b.s, allocate);
                alk.d(bArr3.length, allocate);
                allocate.put(bArr3);
            }
            d(allocate, ap$b.max_idle_timeout, uVar.b);
            if (bIVar2 == bIVar && (bArr2 = uVar.q) != null) {
                alk.d(ap$b.stateless_reset_token.s, allocate);
                alk.d(bArr2.length, allocate);
                allocate.put(bArr2);
            }
            d(allocate, ap$b.max_udp_payload_size, uVar.p);
            d(allocate, ap$b.initial_max_data, uVar.c);
            d(allocate, ap$b.initial_max_stream_data_bidi_local, uVar.d);
            d(allocate, ap$b.initial_max_stream_data_bidi_remote, uVar.e);
            d(allocate, ap$b.initial_max_stream_data_uni, uVar.f);
            d(allocate, ap$b.initial_max_streams_bidi, uVar.g);
            d(allocate, ap$b.initial_max_streams_uni, uVar.h);
            d(allocate, ap$b.ack_delay_exponent, uVar.i);
            d(allocate, ap$b.max_ack_delay, uVar.l);
            if (uVar.j) {
                alk.d(ap$b.disable_active_migration.s, allocate);
                alk.d(0, allocate);
            }
            d(allocate, ap$b.active_connection_id_limit, uVar.m);
            ap$b ap_b2 = ap$b.initial_source_connection_id;
            byte[] bArr4 = uVar.n;
            alk.d(ap_b2.s, allocate);
            alk.d(bArr4.length, allocate);
            allocate.put(bArr4);
            if (bIVar2 == bIVar && (bArr = uVar.o) != null) {
                alk.d(ap$b.retry_source_connection_id.s, allocate);
                alk.d(bArr.length, allocate);
                allocate.put(bArr);
            }
            u.b bVar = uVar.r;
            if (bVar != null) {
                List<kgy0> list = bVar.b;
                final ByteBuffer allocate2 = ByteBuffer.allocate((list.size() << 2) + 4);
                allocate2.put(bVar.a.a());
                list.forEach(new Consumer() { // from class: xsna.sky0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        allocate2.put(((kgy0) obj).a());
                    }
                });
                ap$b ap_b3 = ap$b.version_information;
                byte[] array = allocate2.array();
                alk.d(ap_b3.s, allocate);
                alk.d(array.length, allocate);
                allocate.put(array);
            }
            long j = uVar.s;
            if (j > 0) {
                alk.d(32, allocate);
                int g = alk.g(j, allocate);
                alk.d(g, allocate);
                alk.g(j, allocate);
            }
            int position = allocate.position();
            allocate.putShort(2, (short) (position - 4));
            this.c = new byte[position];
            allocate.get(this.c);
        }
        return this.c;
    }

    public final void c(ByteBuffer byteBuffer) throws j {
        boolean z;
        try {
            u.a aVar = new u.a();
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= 4) {
                    z = true;
                    break;
                } else {
                    if (bArr[i] != 0) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                aVar.a = InetAddress.getByAddress(bArr);
            }
            byteBuffer.get();
            byteBuffer.get();
            byte[] bArr2 = new byte[16];
            byteBuffer.get(bArr2);
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    z2 = true;
                    break;
                } else if (bArr2[i2] != 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                aVar.b = InetAddress.getByAddress(bArr2);
            }
            byteBuffer.get();
            byteBuffer.get();
            if (aVar.a == null && aVar.b == null) {
                throw new j("Preferred address: no valid IP address");
            }
            byte[] bArr3 = new byte[byteBuffer.get()];
            aVar.c = bArr3;
            byteBuffer.get(bArr3);
            byteBuffer.get(new byte[16]);
            this.d.k = aVar;
        } catch (UnknownHostException unused) {
            throw new RuntimeException();
        }
    }

    public y(kgy0 kgy0Var) {
        this.a = kgy0Var;
        this.d = new u();
    }

    public y(kgy0 kgy0Var, u uVar, bI bIVar) {
        this.a = kgy0Var;
        this.d = uVar;
        this.b = bIVar;
    }
}
