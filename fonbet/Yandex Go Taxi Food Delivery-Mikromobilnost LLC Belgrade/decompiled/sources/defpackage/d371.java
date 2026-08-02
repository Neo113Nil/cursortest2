package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import yads.d83;

/* loaded from: classes7.dex */
public final class d371 extends yd71 {
    public Uri A;
    public DatagramSocket B;
    public MulticastSocket C;
    public InetAddress D;
    public boolean E;
    public int F;
    public final int x;
    public final byte[] y;
    public final DatagramPacket z;

    public d371() {
        super(true);
        this.x = 8000;
        byte[] bArr = new byte[2000];
        this.y = bArr;
        this.z = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.u871
    public final long Q(no71 no71Var) {
        Uri uri = no71Var.a;
        this.A = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.A.getPort();
        h();
        try {
            this.D = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.D, port);
            if (this.D.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.C = multicastSocket;
                multicastSocket.joinGroup(this.D);
                this.B = this.C;
            } else {
                this.B = new DatagramSocket(inetSocketAddress);
            }
            this.B.setSoTimeout(this.x);
            this.E = true;
            a(no71Var);
            return -1L;
        } catch (IOException e) {
            throw new d83(2001, e);
        } catch (SecurityException e2) {
            throw new d83(2006, e2);
        }
    }

    @Override // defpackage.u871
    public final void close() {
        this.A = null;
        MulticastSocket multicastSocket = this.C;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.D;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.C = null;
        }
        DatagramSocket datagramSocket = this.B;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.B = null;
        }
        this.D = null;
        this.F = 0;
        if (this.E) {
            this.E = false;
            g();
        }
    }

    @Override // defpackage.u871
    public final Uri d() {
        return this.A;
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.F;
        DatagramPacket datagramPacket = this.z;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.B;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.F = length;
                c(length);
            } catch (SocketTimeoutException e) {
                throw new d83(2002, e);
            } catch (IOException e2) {
                throw new d83(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.F;
        int min = Math.min(i4, i2);
        System.arraycopy(this.y, length2 - i4, bArr, i, min);
        this.F -= min;
        return min;
    }
}
