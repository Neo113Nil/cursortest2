package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.monetization.ads.network.core.Header;
import com.monetization.ads.network.core.Request;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes11.dex */
public abstract class e7a1 {
    public static final byte[] a = new byte[1024];
    public static final int[] b = new int[1024];

    public static final void a(f530 f530Var, v4v v4vVar, fid fidVar, int i) {
        int i2;
        v4v v4vVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-444217384);
        if ((i & 48) == 0) {
            i2 = (btsVar.k(v4vVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            v4vVar2 = v4vVar;
            btsVar.Y();
        } else if (v4vVar == null) {
            btsVar.e0(-885773987);
            btsVar.t(false);
            v4vVar2 = v4vVar;
        } else {
            btsVar.e0(-885773986);
            v4vVar2 = v4vVar;
            s3b1.f(v4vVar2, ymb1.l(f530Var, cyk0.a), mhe.a, btsVar, 384, 0);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(f530Var, v4vVar2, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, a37 a37Var, boolean z, sls slsVar, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        bts btsVar;
        f530 f530Var3;
        aii0 v;
        int i4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2110935295);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(a37Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(slsVar) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 16384 : 8192;
            if (btsVar2.V(i3 & 1, (i3 & 9363) == 9362)) {
                btsVar = btsVar2;
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                c530 c530Var = c530.a;
                f530 f530Var4 = i5 != 0 ? c530Var : f530Var2;
                f530 d = hi91.d(f530Var4, false, null, 3);
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                f530 d3 = b.d(btsVar2, d);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                if (btsVar2.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar2);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, d.f, d2);
                qje.W(btsVar2, d.e, o);
                wls wlsVar = d.g;
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar2, hashCode, wlsVar);
                }
                qje.W(btsVar2, d.d, d3);
                f530 e = ljs0.e(c530Var, 56.0f);
                boolean z2 = (i3 & 112) == 32;
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (z2 || Q == o430Var) {
                    i4 = 0;
                    Q = new odf0(i4, a37Var);
                    btsVar2.o0(Q);
                } else {
                    i4 = 0;
                }
                l27 l27Var = new l27((tls) Q);
                int i6 = (i3 & 7168) == 2048 ? 1 : i4;
                Object Q2 = btsVar2.Q();
                if (i6 != 0 || Q2 == o430Var) {
                    Q2 = new zvr(21, slsVar);
                    btsVar2.o0(Q2);
                }
                a.b((sls) Q2, e, null, 0L, 0L, null, null, null, z, null, null, l27Var, wwg.S(-2076415194, true, new xp5(str, slsVar, z, a37Var), btsVar2), btsVar2, (i3 << 18) & 234881024, 384, 1788);
                btsVar = btsVar2;
                btsVar.t(true);
                f530Var3 = f530Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new egb(str, a37Var, z, slsVar, f530Var3, i, i2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if (btsVar2.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1366016366);
        if ((i & 48) == 0) {
            i2 = (btsVar.a(z) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            pa90 m = mt71.m(z ? wzg0.ic_companies_box : wzg0.ic_user, 0, btsVar);
            a7u0 a7u0Var = gl51.a;
            o4b1.b(m, null, an91.k(m4m0.b(f530Var, ((el51) btsVar.m(a7u0Var)).j(), cyk0.a), 8.0f), null, mhe.b, 0.0f, new c36(((el51) btsVar.m(a7u0Var)).c(), 5), btsVar, 24624, 40);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mq1(f530Var, z, i);
        }
    }

    public static gb81 d(Request request, List list) {
        et81 cacheEntry = request.getCacheEntry();
        if (cacheEntry == null) {
            return new gb81(lvj0.NOT_MODIFIED, (byte[]) null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((Header) it.next()).getName());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = cacheEntry.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (Header header : cacheEntry.h) {
                    if (!treeSet.contains(header.getName())) {
                        arrayList.add(header);
                    }
                }
            }
        } else if (!cacheEntry.g.isEmpty()) {
            for (Map.Entry entry : cacheEntry.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new Header((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new gb81(lvj0.NOT_MODIFIED, cacheEntry.a, true, (List) arrayList);
    }

    public static byte[] e(InputStream inputStream, int i, gd81 gd81Var) {
        byte[] bArr;
        gsu0 gsu0Var = new gsu0(gd81Var, i);
        try {
            bArr = gd81Var.b(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    gsu0Var.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z = ew71.a;
                    }
                    gd81Var.a(bArr);
                    gsu0Var.close();
                    throw th;
                }
            }
            byte[] byteArray = gsu0Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z2 = ew71.a;
            }
            gd81Var.a(bArr);
            gsu0Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    public static byte[] f(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] g(int i, InputStream inputStream) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                ny61.r(oyr.i(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static long i(int i, InputStream inputStream) {
        byte[] g = g(i, inputStream);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (g[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, int i) {
        j(byteArrayOutputStream, i, 2);
    }
}
