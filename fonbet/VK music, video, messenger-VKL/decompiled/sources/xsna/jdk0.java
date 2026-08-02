package xsna;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* compiled from: SntpClient.java */
/* loaded from: classes12.dex */
public final class jdk0 {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static long a() throws IOException {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], 123);
                bArr2[b3] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j = currentTimeMillis / 1000;
                    long j2 = currentTimeMillis - (j * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j3 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j3 >> 24);
                    bArr[41] = (byte) (j3 >> 16);
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j5 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b4 = bArr3[b2];
                    int i3 = bArr3[1] & 255;
                    long d2 = d(24, bArr3);
                    long d3 = d(32, bArr3);
                    long d4 = d(40, bArr3);
                    b((byte) ((b4 >> 6) & 3), (byte) (b4 & 7), i3, d4);
                    long j6 = (j5 + (((d4 - j5) + (d3 - d2)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j6;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i4 = i2 + 1;
                    if (i2 >= 10) {
                        break;
                    }
                    i++;
                    i2 = i4;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void b(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(lhg.a(b3, "SNTP: Untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new IOException(lhg.a(i, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long d(int i, byte[] bArr) {
        long c2 = c(i, bArr);
        long c3 = c(i + 4, bArr);
        if (c2 == 0 && c3 == 0) {
            return 0L;
        }
        return ((c3 * 1000) / 4294967296L) + ((c2 - 2208988800L) * 1000);
    }

    /* compiled from: SntpClient.java */
    public static final class b implements Loader.d {
        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void load() throws IOException {
            synchronized (jdk0.a) {
                Object obj = jdk0.b;
                synchronized (obj) {
                    if (jdk0.c) {
                        return;
                    }
                    long a = jdk0.a();
                    synchronized (obj) {
                        SystemClock.elapsedRealtime();
                        jdk0.d = a;
                        jdk0.c = true;
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void cancelLoad() {
        }
    }

    /* compiled from: SntpClient.java */
    public static final class a implements Loader.a<Loader.d> {

        @Nullable
        public final DashMediaSource.a b;

        public a(@Nullable DashMediaSource.a aVar) {
            this.b = aVar;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void d(Loader.d dVar, long j, long j2) {
            boolean z;
            DashMediaSource.a aVar = this.b;
            synchronized (jdk0.b) {
                z = jdk0.c;
            }
            if (z) {
                aVar.a();
            } else {
                DashMediaSource.this.x(new IOException(new ConcurrentModificationException()));
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
            DashMediaSource.this.x(iOException);
            return Loader.e;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void j(Loader.d dVar, long j, long j2, boolean z) {
        }
    }
}
