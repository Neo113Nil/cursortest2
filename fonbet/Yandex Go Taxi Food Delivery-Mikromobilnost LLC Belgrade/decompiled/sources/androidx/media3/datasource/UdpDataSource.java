package androidx.media3.datasource;

import android.net.Uri;
import defpackage.npg;
import defpackage.nz4;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes10.dex */
public final class UdpDataSource extends nz4 {
    public boolean A;
    public int B;
    public final int a;
    public final byte[] b;
    public final DatagramPacket c;
    public Uri w;
    public DatagramSocket x;
    public MulticastSocket y;
    public InetAddress z;

    public static final class UdpDataSourceException extends DataSourceException {
    }

    public UdpDataSource(int i) {
        super(true);
        this.a = i;
        byte[] bArr = new byte[2000];
        this.b = bArr;
        this.c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.kpg
    public final void close() {
        this.w = null;
        MulticastSocket multicastSocket = this.y;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.z;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.y = null;
        }
        DatagramSocket datagramSocket = this.x;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.x = null;
        }
        this.z = null;
        this.B = 0;
        if (this.A) {
            this.A = false;
            transferEnded();
        }
    }

    @Override // defpackage.kpg
    public final Uri getUri() {
        return this.w;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        Uri uri = npgVar.a;
        this.w = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.w.getPort();
        transferInitializing(npgVar);
        try {
            this.z = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.z, port);
            if (this.z.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.y = multicastSocket;
                multicastSocket.joinGroup(this.z);
                this.x = this.y;
            } else {
                this.x = new DatagramSocket(inetSocketAddress);
            }
            this.x.setSoTimeout(this.a);
            this.A = true;
            transferStarted(npgVar);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(2001, e);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(2006, e2);
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.B;
        DatagramPacket datagramPacket = this.c;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.x;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.B = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(2002, e);
            } catch (IOException e2) {
                throw new UdpDataSourceException(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.B;
        int min = Math.min(i4, i2);
        System.arraycopy(this.b, length2 - i4, bArr, i, min);
        this.B -= min;
        return min;
    }

    public UdpDataSource() {
        this(8000);
    }
}
