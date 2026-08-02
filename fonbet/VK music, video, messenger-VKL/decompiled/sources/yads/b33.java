package yads;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class b33 {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static void a(byte b2, byte b3, int i, long j) {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(nh2.a("SNTP: Untrusted mode: ", b3));
        }
        if (i == 0 || i > 15) {
            throw new IOException(nh2.a("SNTP: Untrusted stratum: ", i));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long b(int i, byte[] bArr) {
        long a2 = a(i, bArr);
        long a3 = a(i + 4, bArr);
        if (a2 == 0 && a3 == 0) {
            return 0L;
        }
        return ((a3 * 1000) / 4294967296L) + ((a2 - 2208988800L) * 1000);
    }

    public static long a(int i, byte[] bArr) {
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

    public static long a() {
        char c2;
        long j;
        synchronized (b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                c2 = 0;
                j = currentTimeMillis;
            } else {
                long j2 = currentTimeMillis / 1000;
                long j3 = currentTimeMillis - (j2 * 1000);
                c2 = 0;
                j = currentTimeMillis;
                bArr[40] = (byte) (r14 >> 24);
                bArr[41] = (byte) (r14 >> 16);
                bArr[42] = (byte) (r14 >> 8);
                bArr[43] = (byte) (j2 + 2208988800L);
                long j4 = (j3 * 4294967296L) / 1000;
                bArr[44] = (byte) (j4 >> 24);
                bArr[45] = (byte) (j4 >> 16);
                bArr[46] = (byte) (j4 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j5 = (elapsedRealtime2 - elapsedRealtime) + j;
            byte b2 = bArr[c2];
            int i = bArr[1] & 255;
            long b3 = b(24, bArr);
            long b4 = b(32, bArr);
            long b5 = b(40, bArr);
            a((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i, b5);
            long j6 = (j5 + (((b5 - j5) + (b4 - b3)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j6;
        } finally {
        }
    }
}
