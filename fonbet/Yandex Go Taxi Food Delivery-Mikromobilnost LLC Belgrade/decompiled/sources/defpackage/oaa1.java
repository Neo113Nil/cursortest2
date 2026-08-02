package defpackage;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public abstract class oaa1 {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static final void a(vnb vnbVar, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(240090262);
        c530 c530Var = c530.a;
        int i2 = (btsVar.k(c530Var) ? 4 : 2) | i | (btsVar.k(vnbVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            q6o q6oVar = vnbVar.a;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ymj(28, tlsVar, vnbVar);
                btsVar.o0(Q);
            }
            tlsVar2 = tlsVar;
            kh91.a(c530Var, q6oVar, (sls) Q, tlsVar2, btsVar, (i2 & 14) | ((i2 << 3) & 7168));
            tka0.a(btsVar, 0);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(vnbVar, tlsVar2, i, 5);
        }
    }

    public static final void b(long j, ety0 ety0Var, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-684938728);
        int i2 = (btsVar.d(j) ? 4 : 2) | i | (btsVar.k(ety0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= btsVar.e(wlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            qwd qwdVar = vqy0.a;
            sb2.c(new vvf0[]{bfe.a.a(new ldc(j)), qwdVar.a(((ety0) btsVar.m(qwdVar)).d(ety0Var))}, wlsVar, btsVar, ((i2 >> 3) & 112) | 8);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qvf0(j, ety0Var, wlsVar, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
    
        if (r9 > 15) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        if (r18 == r16) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fb, code lost:
    
        defpackage.ny61.v("SNTP: Zero transmitTime");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long c() {
        char c2;
        long j;
        long j2;
        long j3;
        synchronized (b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, HProv.PP_PASSWD_TERM);
            bArr[0] = DerValue.tag_GeneralString;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                c2 = 0;
                j = currentTimeMillis;
                j3 = elapsedRealtime;
                j2 = 0;
            } else {
                long j4 = currentTimeMillis / 1000;
                long j5 = currentTimeMillis - (j4 * 1000);
                c2 = 0;
                j = currentTimeMillis;
                long j6 = j4 + 2208988800L;
                j2 = 0;
                bArr[40] = (byte) (j6 >> 24);
                bArr[41] = (byte) (j6 >> 16);
                j3 = elapsedRealtime;
                bArr[42] = (byte) (j6 >> 8);
                bArr[43] = (byte) j6;
                long j7 = (j5 * 4294967296L) / 1000;
                bArr[44] = (byte) (j7 >> 24);
                bArr[45] = (byte) (j7 >> 16);
                bArr[46] = (byte) (j7 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j8 = (elapsedRealtime2 - j3) + j;
            byte b2 = bArr[c2];
            byte b3 = (byte) ((b2 >> 6) & 3);
            byte b4 = (byte) (b2 & 7);
            int i = bArr[1] & 255;
            long h = h(bArr, 24);
            long h2 = h(bArr, 32);
            long h3 = h(bArr, 40);
            if (b3 != 3) {
                if (b4 != 4 && b4 != 5) {
                    ny61.v(q8a1.c(b4, "SNTP: Untrusted mode: "));
                }
                ny61.v(q8a1.c(i, "SNTP: Untrusted stratum: "));
            } else {
                ny61.v("SNTP: Unsynchronized server");
            }
            long j9 = (j8 + (((h3 - j8) + (h2 - h)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j9;
        } finally {
        }
    }

    public static long d(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & HProv.PP_VERSION_TIMESTAMP) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & HProv.PP_VERSION_TIMESTAMP) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & HProv.PP_VERSION_TIMESTAMP) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & HProv.PP_VERSION_TIMESTAMP) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static String e(int i, int i2, String str) {
        if (i < 0) {
            return iha1.f("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return iha1.f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ny61.g(q8a1.c(i2, "negative size: "));
        return null;
    }

    public static void f(int i, int i2) {
        String f;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                f = iha1.f("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ny61.g(q8a1.c(i2, "negative size: "));
                    return;
                }
                f = iha1.f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(f);
        }
    }

    public static void g(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? e(i, i3, "start index") : (i2 < 0 || i2 > i3) ? e(i2, i3, "end index") : iha1.f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static long h(byte[] bArr, int i) {
        long d2 = d(bArr, i);
        long d3 = d(bArr, i + 4);
        if (d2 == 0 && d3 == 0) {
            return 0L;
        }
        return ((d3 * 1000) / 4294967296L) + ((d2 - 2208988800L) * 1000);
    }

    public static void i(int i, int i2) {
        if (i < 0 || i > i2) {
            ny61.m(e(i, i2, "index"));
        }
    }
}
